package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
class MutableRealmSchema extends RealmSchema {
    public MutableRealmSchema(BaseRealm baseRealm) {
        super(baseRealm, null);
    }

    private String checkAndGetTableNameFromClassName(String str) {
        int length = str.length();
        int i10 = Table.CLASS_NAME_MAX_LENGTH;
        if (length <= i10) {
            return Table.getTableNameForClass(str);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", Integer.valueOf(i10), Integer.valueOf(str.length())));
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema create(String str) {
        checkNotEmpty(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        int length = str.length();
        int i10 = Table.CLASS_NAME_MAX_LENGTH;
        if (length > i10) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", Integer.valueOf(i10), Integer.valueOf(str.length())));
        }
        BaseRealm baseRealm = this.realm;
        return new MutableRealmObjectSchema(baseRealm, this, baseRealm.getSharedRealm().createTable(tableNameForClass));
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema createWithPrimaryKeyField(String str, String str2, Class<?> cls, FieldAttribute... fieldAttributeArr) {
        RealmFieldType realmFieldType;
        checkNotEmpty(str, "Null or empty class names are not allowed");
        RealmObjectSchema.checkLegalName(str2);
        String strCheckAndGetTableNameFromClassName = checkAndGetTableNameFromClassName(str);
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.SUPPORTED_LIST_SIMPLE_FIELDS.get(cls);
        if (fieldMetaData == null || !((realmFieldType = fieldMetaData.fieldType) == RealmFieldType.STRING || realmFieldType == RealmFieldType.INTEGER || realmFieldType == RealmFieldType.OBJECT_ID)) {
            throw new IllegalArgumentException("Realm doesn't support primary key field type '" + cls + "'.");
        }
        boolean z10 = fieldMetaData.defaultNullable;
        if (MutableRealmObjectSchema.containsAttribute(fieldAttributeArr, FieldAttribute.REQUIRED)) {
            z10 = false;
        }
        BaseRealm baseRealm = this.realm;
        return new MutableRealmObjectSchema(baseRealm, this, baseRealm.getSharedRealm().createTableWithPrimaryKey(strCheckAndGetTableNameFromClassName, str2, fieldMetaData.fieldType, z10));
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema get(String str) {
        checkNotEmpty(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (!this.realm.getSharedRealm().hasTable(tableNameForClass)) {
            return null;
        }
        return new MutableRealmObjectSchema(this.realm, this, this.realm.getSharedRealm().getTable(tableNameForClass));
    }

    @Override // io.realm.RealmSchema
    public Set<RealmObjectSchema> getAll() {
        String[] tablesNames = this.realm.getSharedRealm().getTablesNames();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tablesNames.length);
        for (String str : tablesNames) {
            RealmObjectSchema realmObjectSchema = get(Table.getClassNameForTable(str));
            if (realmObjectSchema != null) {
                linkedHashSet.add(realmObjectSchema);
            }
        }
        return linkedHashSet;
    }

    @Override // io.realm.RealmSchema
    public void remove(String str) {
        this.realm.checkNotInSync();
        checkNotEmpty(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (!OsObjectStore.deleteTableForObject(this.realm.getSharedRealm(), str)) {
            throw new IllegalArgumentException(c.s("Cannot remove class because it is not in this Realm: ", str));
        }
        removeFromClassNameToSchemaMap(tableNameForClass);
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema rename(String str, String str2) {
        this.realm.checkNotInSync();
        checkNotEmpty(str, "Class names cannot be empty or null");
        checkNotEmpty(str2, "Class names cannot be empty or null");
        String tableNameForClass = Table.getTableNameForClass(str);
        String tableNameForClass2 = Table.getTableNameForClass(str2);
        checkHasTable(str, "Cannot rename class because it doesn't exist in this Realm: " + str);
        if (this.realm.getSharedRealm().hasTable(tableNameForClass2)) {
            throw new IllegalArgumentException(str + " cannot be renamed because the new class already exists: " + str2);
        }
        this.realm.getSharedRealm().renameTable(tableNameForClass, tableNameForClass2);
        Table table = this.realm.getSharedRealm().getTable(tableNameForClass2);
        RealmObjectSchema realmObjectSchemaRemoveFromClassNameToSchemaMap = removeFromClassNameToSchemaMap(tableNameForClass);
        if (realmObjectSchemaRemoveFromClassNameToSchemaMap == null || !realmObjectSchemaRemoveFromClassNameToSchemaMap.getTable().isValid() || !realmObjectSchemaRemoveFromClassNameToSchemaMap.getClassName().equals(str2)) {
            realmObjectSchemaRemoveFromClassNameToSchemaMap = new MutableRealmObjectSchema(this.realm, this, table);
        }
        putToClassNameToSchemaMap(tableNameForClass2, realmObjectSchemaRemoveFromClassNameToSchemaMap);
        return realmObjectSchemaRemoveFromClassNameToSchemaMap;
    }
}
