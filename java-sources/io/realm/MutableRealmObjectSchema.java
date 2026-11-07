package io.realm;

import android.support.v4.media.session.p;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.util.Date;
import java.util.Locale;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
class MutableRealmObjectSchema extends RealmObjectSchema {

    /* JADX INFO: renamed from: io.realm.MutableRealmObjectSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            $SwitchMap$io$realm$RealmFieldType = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MutableRealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table) {
        super(baseRealm, realmSchema, table, new RealmObjectSchema.DynamicColumnIndices(table));
    }

    private void addModifiers(String str, FieldAttribute[] fieldAttributeArr) {
        if (fieldAttributeArr != null) {
            boolean z10 = false;
            try {
                if (fieldAttributeArr.length > 0) {
                    if (containsAttribute(fieldAttributeArr, FieldAttribute.INDEXED)) {
                        addIndex(str);
                        z10 = true;
                    }
                    if (containsAttribute(fieldAttributeArr, FieldAttribute.PRIMARY_KEY)) {
                        addPrimaryKey(str);
                    }
                }
            } catch (Exception e10) {
                long columnKey = getColumnKey(str);
                if (z10) {
                    this.table.removeSearchIndex(columnKey);
                }
                throw ((RuntimeException) e10);
            }
        }
    }

    private void checkAddPrimaryKeyForSync() {
        if (this.realm.configuration.isSyncConfiguration()) {
            throw new UnsupportedOperationException("'addPrimaryKey' is not supported by synced Realms.");
        }
    }

    private void checkEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Null or empty class names are not allowed");
        }
    }

    private void checkFieldNameIsAvailable(String str) {
        if (this.table.getColumnKey(str) == -1) {
            return;
        }
        throw new IllegalArgumentException("Field already exists in '" + getClassName() + "': " + str);
    }

    private void checkForObjectStoreInvalidPrimaryKeyTypes(String str, Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            checkForObjectStoreInvalidPrimaryKeyTypes(str, RealmFieldType.BOOLEAN);
        }
        if (cls == Date.class) {
            checkForObjectStoreInvalidPrimaryKeyTypes(str, RealmFieldType.DATE);
        }
    }

    private void checkNewFieldName(String str) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
    }

    public static boolean containsAttribute(FieldAttribute[] fieldAttributeArr, FieldAttribute fieldAttribute) {
        if (fieldAttributeArr != null && fieldAttributeArr.length != 0) {
            for (FieldAttribute fieldAttribute2 : fieldAttributeArr) {
                if (fieldAttribute2 == fieldAttribute) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addField(String str, Class<?> cls, FieldAttribute... fieldAttributeArr) throws Exception {
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.SUPPORTED_LIST_SIMPLE_FIELDS.get(cls);
        if (fieldMetaData != null) {
            if (containsAttribute(fieldAttributeArr, FieldAttribute.PRIMARY_KEY)) {
                checkAddPrimaryKeyForSync();
                checkForObjectStoreInvalidPrimaryKeyTypes(str, cls);
            }
            checkNewFieldName(str);
            boolean z10 = fieldMetaData.defaultNullable;
            if (containsAttribute(fieldAttributeArr, FieldAttribute.REQUIRED)) {
                z10 = false;
            }
            long jAddColumn = this.table.addColumn(fieldMetaData.fieldType, str, z10);
            try {
                addModifiers(str, fieldAttributeArr);
                return this;
            } catch (Exception e10) {
                this.table.removeColumn(jAddColumn);
                throw e10;
            }
        }
        if (RealmObjectSchema.SUPPORTED_LINKED_FIELDS.containsKey(cls)) {
            throw new IllegalArgumentException(c.s("Use addRealmObjectField() instead to add fields that link to other RealmObjects: ", str));
        }
        if (RealmModel.class.isAssignableFrom(cls)) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: " + str + "(" + cls + ")");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("Realm doesn't support this field type: " + str + "(" + cls + ")");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addIndex(String str) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldExists(str);
        long columnKey = getColumnKey(str);
        if (this.table.hasSearchIndex(columnKey)) {
            throw new IllegalStateException(p.z(str, " already has an index."));
        }
        this.table.addSearchIndex(columnKey);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addPrimaryKey(String str) {
        checkAddPrimaryKeyForSync();
        RealmObjectSchema.checkLegalName(str);
        checkFieldExists(str);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName());
        if (primaryKeyForObject != null) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException(a.D("Field '", primaryKeyForObject, "' has been already defined as primary key."));
        }
        long columnKey = getColumnKey(str);
        RealmFieldType fieldType = getFieldType(str);
        checkForObjectStoreInvalidPrimaryKeyTypes(str, fieldType);
        if (fieldType != RealmFieldType.STRING && !this.table.hasSearchIndex(columnKey)) {
            this.table.addSearchIndex(columnKey);
        }
        OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, getClassName(), str);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmDictionaryField(String str, Class<?> cls) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.SUPPORTED_DICTIONARY_SIMPLE_FIELDS.get(cls);
        if (fieldMetaData != null) {
            this.table.addColumn(fieldMetaData.collectionType, str, fieldMetaData.defaultNullable);
            return this;
        }
        if (cls.equals(RealmObjectSchema.class) || RealmModel.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(c.s("Use 'addRealmDictionaryField(String name, RealmObjectSchema schema)' instead to add dictionaries that link to other RealmObjects: ", str));
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException("RealmDictionary does not support dictionaries with this type: " + str + "(" + cls + ")");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmListField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnLink(RealmFieldType.LIST, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmObjectField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnLink(RealmFieldType.OBJECT, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmSetField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnSetLink(RealmFieldType.LINK_SET, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public String getPropertyClassName(String str) {
        String className = this.table.getLinkTarget(getColumnKey(str)).getClassName();
        if (Util.isEmptyString(className)) {
            throw new IllegalArgumentException(a.D("Property '", str, "' not found."));
        }
        return className;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removeField(String str) {
        this.realm.checkNotInSync();
        RealmObjectSchema.checkLegalName(str);
        if (!hasField(str)) {
            throw new IllegalStateException(p.z(str, " does not exist."));
        }
        long columnKey = getColumnKey(str);
        String className = getClassName();
        if (str.equals(OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, className))) {
            OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, className, str);
        }
        this.table.removeColumn(columnKey);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removeIndex(String str) {
        this.realm.checkNotInSync();
        RealmObjectSchema.checkLegalName(str);
        checkFieldExists(str);
        long columnKey = getColumnKey(str);
        if (!this.table.hasSearchIndex(columnKey)) {
            throw new IllegalStateException(c.s("Field is not indexed: ", str));
        }
        this.table.removeSearchIndex(columnKey);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removePrimaryKey() {
        this.realm.checkNotInSync();
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName());
        if (primaryKeyForObject == null) {
            throw new IllegalStateException(getClassName() + " doesn't have a primary key.");
        }
        long columnKey = this.table.getColumnKey(primaryKeyForObject);
        if (this.table.hasSearchIndex(columnKey)) {
            this.table.removeSearchIndex(columnKey);
        }
        OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, getClassName(), null);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema renameField(String str, String str2) {
        this.realm.checkNotInSync();
        RealmObjectSchema.checkLegalName(str);
        checkFieldExists(str);
        RealmObjectSchema.checkLegalName(str2);
        checkFieldNameIsAvailable(str2);
        this.table.renameColumn(getColumnKey(str), str2);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setClassName(String str) throws Exception {
        this.realm.checkNotInSync();
        checkEmpty(str);
        String tableNameForClass = Table.getTableNameForClass(str);
        int length = str.length();
        int i10 = Table.CLASS_NAME_MAX_LENGTH;
        if (length > i10) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: '%2$s' (%3$d)", Integer.valueOf(i10), str, Integer.valueOf(str.length())));
        }
        if (this.realm.sharedRealm.hasTable(tableNameForClass)) {
            throw new IllegalArgumentException("Class already exists: ".concat(str));
        }
        String name = this.table.getName();
        String className = this.table.getClassName();
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, className);
        if (primaryKeyForObject != null) {
            OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, className, null);
        }
        this.realm.sharedRealm.renameTable(name, tableNameForClass);
        if (primaryKeyForObject == null) {
            return this;
        }
        try {
            OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, str, primaryKeyForObject);
            return this;
        } catch (Exception e10) {
            this.realm.sharedRealm.renameTable(this.table.getName(), name);
            throw e10;
        }
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setNullable(String str, boolean z10) {
        setRequired(str, !z10);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setRequired(String str, boolean z10) {
        long columnKey = this.table.getColumnKey(str);
        boolean zIsRequired = isRequired(str);
        RealmFieldType columnType = this.table.getColumnType(columnKey);
        if (columnType == RealmFieldType.OBJECT) {
            throw new IllegalArgumentException(c.s("Cannot modify the required state for RealmObject references: ", str));
        }
        if (columnType == RealmFieldType.LIST) {
            throw new IllegalArgumentException(c.s("Cannot modify the required state for RealmList references: ", str));
        }
        if (z10 && zIsRequired) {
            throw new IllegalStateException(c.s("Field is already required: ", str));
        }
        if (!z10 && !zIsRequired) {
            throw new IllegalStateException(c.s("Field is already nullable: ", str));
        }
        if (!z10) {
            this.table.convertColumnToNullable(columnKey);
            return this;
        }
        try {
            this.table.convertColumnToNotNullable(columnKey);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getMessage().contains("has null value(s) in property")) {
                throw new IllegalStateException(e10.getMessage());
            }
            throw e10;
        }
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema transform(RealmObjectSchema.Function function) {
        if (function != null) {
            OsResults osResultsCreateSnapshot = OsResults.createFromQuery(this.realm.sharedRealm, this.table.where()).createSnapshot();
            long size = osResultsCreateSnapshot.size();
            if (size > 2147483647L) {
                throw new UnsupportedOperationException("Too many results to iterate: " + size);
            }
            int size2 = (int) osResultsCreateSnapshot.size();
            for (int i10 = 0; i10 < size2; i10++) {
                DynamicRealmObject dynamicRealmObject = new DynamicRealmObject(this.realm, new CheckedRow(osResultsCreateSnapshot.getUncheckedRow(i10)));
                if (dynamicRealmObject.isValid()) {
                    function.apply(dynamicRealmObject);
                }
            }
        }
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmListField(String str, Class<?> cls) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.SUPPORTED_LIST_SIMPLE_FIELDS.get(cls);
        if (fieldMetaData == null) {
            if (!cls.equals(RealmObjectSchema.class) && !RealmModel.class.isAssignableFrom(cls)) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("RealmList does not support lists with this type: " + str + "(" + cls + ")");
            }
            throw new IllegalArgumentException(c.s("Use 'addRealmListField(String name, RealmObjectSchema schema)' instead to add lists that link to other RealmObjects: ", str));
        }
        this.table.addColumn(fieldMetaData.collectionType, str, fieldMetaData.defaultNullable);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmSetField(String str, Class<?> cls) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.SUPPORTED_SET_SIMPLE_FIELDS.get(cls);
        if (fieldMetaData == null) {
            if (!cls.equals(RealmObjectSchema.class) && !RealmModel.class.isAssignableFrom(cls)) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("RealmSet does not support sets with this type: " + str + "(" + cls + ")");
            }
            throw new IllegalArgumentException(c.s("Use 'addRealmSetField(String name, RealmObjectSchema schema)' instead to add sets that link to other RealmObjects: ", str));
        }
        this.table.addColumn(fieldMetaData.collectionType, str, fieldMetaData.defaultNullable);
        return this;
    }

    private void checkForObjectStoreInvalidPrimaryKeyTypes(String str, RealmFieldType realmFieldType) {
        int i10 = AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException(c.s("Boolean fields cannot be marked as primary keys: ", str));
        }
        if (i10 == 2) {
            throw new IllegalArgumentException(c.s("Date fields cannot be marked as primary keys: ", str));
        }
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmDictionaryField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnDictionaryLink(RealmFieldType.STRING_TO_LINK_MAP, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }
}
