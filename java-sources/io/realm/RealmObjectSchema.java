package io.realm;

import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import j$.util.DesugarCollections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class RealmObjectSchema {
    static final Map<Class<?>, FieldMetaData> SUPPORTED_DICTIONARY_SIMPLE_FIELDS;
    static final Map<Class<?>, FieldMetaData> SUPPORTED_LINKED_FIELDS;
    static final Map<Class<?>, FieldMetaData> SUPPORTED_LIST_SIMPLE_FIELDS;
    static final Map<Class<?>, FieldMetaData> SUPPORTED_SET_SIMPLE_FIELDS;
    final ColumnInfo columnInfo;
    final BaseRealm realm;
    final RealmSchema schema;
    final Table table;

    public static final class DynamicColumnIndices extends ColumnInfo {
        private final Table table;

        public DynamicColumnIndices(Table table) {
            super((ColumnInfo) null, false);
            this.table = table;
        }

        @Override // io.realm.internal.ColumnInfo
        public ColumnInfo copy(boolean z10) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override // io.realm.internal.ColumnInfo
        public void copyFrom(ColumnInfo columnInfo) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override // io.realm.internal.ColumnInfo
        public ColumnInfo.ColumnDetails getColumnDetails(String str) {
            throw new UnsupportedOperationException("DynamicColumnIndices do not support 'getColumnDetails'");
        }

        @Override // io.realm.internal.ColumnInfo
        public long getColumnKey(String str) {
            return this.table.getColumnKey(str);
        }

        @Override // io.realm.internal.ColumnInfo
        public void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }
    }

    public static final class FieldMetaData {
        final RealmFieldType collectionType;
        final boolean defaultNullable;
        final RealmFieldType fieldType;

        public FieldMetaData(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z10) {
            this.fieldType = realmFieldType;
            this.collectionType = realmFieldType2;
            this.defaultNullable = z10;
        }
    }

    public interface Function {
        void apply(DynamicRealmObject dynamicRealmObject);
    }

    static {
        HashMap map = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        map.put(String.class, new FieldMetaData(realmFieldType, RealmFieldType.STRING_LIST, true));
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        FieldMetaData fieldMetaData = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls = Short.TYPE;
        map.put(cls, fieldMetaData);
        map.put(Short.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        FieldMetaData fieldMetaData2 = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls2 = Integer.TYPE;
        map.put(cls2, fieldMetaData2);
        map.put(Integer.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        FieldMetaData fieldMetaData3 = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls3 = Long.TYPE;
        map.put(cls3, fieldMetaData3);
        map.put(Long.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        FieldMetaData fieldMetaData4 = new FieldMetaData(realmFieldType4, realmFieldType5, false);
        Class cls4 = Float.TYPE;
        map.put(cls4, fieldMetaData4);
        map.put(Float.class, new FieldMetaData(realmFieldType4, realmFieldType5, true));
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        FieldMetaData fieldMetaData5 = new FieldMetaData(realmFieldType6, realmFieldType7, false);
        Class cls5 = Double.TYPE;
        map.put(cls5, fieldMetaData5);
        map.put(Double.class, new FieldMetaData(realmFieldType6, realmFieldType7, true));
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN_LIST;
        FieldMetaData fieldMetaData6 = new FieldMetaData(realmFieldType8, realmFieldType9, false);
        Class cls6 = Boolean.TYPE;
        map.put(cls6, fieldMetaData6);
        map.put(Boolean.class, new FieldMetaData(realmFieldType8, realmFieldType9, true));
        FieldMetaData fieldMetaData7 = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls7 = Byte.TYPE;
        map.put(cls7, fieldMetaData7);
        map.put(Byte.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType10 = RealmFieldType.BINARY;
        map.put(byte[].class, new FieldMetaData(realmFieldType10, RealmFieldType.BINARY_LIST, true));
        RealmFieldType realmFieldType11 = RealmFieldType.DATE;
        map.put(Date.class, new FieldMetaData(realmFieldType11, RealmFieldType.DATE_LIST, true));
        RealmFieldType realmFieldType12 = RealmFieldType.OBJECT_ID;
        map.put(ObjectId.class, new FieldMetaData(realmFieldType12, RealmFieldType.OBJECT_ID_LIST, true));
        RealmFieldType realmFieldType13 = RealmFieldType.DECIMAL128;
        map.put(Decimal128.class, new FieldMetaData(realmFieldType13, RealmFieldType.DECIMAL128_LIST, true));
        RealmFieldType realmFieldType14 = RealmFieldType.UUID;
        map.put(UUID.class, new FieldMetaData(realmFieldType14, RealmFieldType.UUID_LIST, true));
        RealmFieldType realmFieldType15 = RealmFieldType.MIXED;
        map.put(RealmAny.class, new FieldMetaData(realmFieldType15, RealmFieldType.MIXED_LIST, true));
        SUPPORTED_LIST_SIMPLE_FIELDS = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put(String.class, new FieldMetaData(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        RealmFieldType realmFieldType16 = RealmFieldType.STRING_TO_INTEGER_MAP;
        map2.put(cls, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Short.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        map2.put(cls2, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Integer.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        map2.put(cls3, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Long.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        RealmFieldType realmFieldType17 = RealmFieldType.STRING_TO_FLOAT_MAP;
        map2.put(cls4, new FieldMetaData(realmFieldType4, realmFieldType17, false));
        map2.put(Float.class, new FieldMetaData(realmFieldType4, realmFieldType17, true));
        RealmFieldType realmFieldType18 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        map2.put(cls5, new FieldMetaData(realmFieldType6, realmFieldType18, false));
        map2.put(Double.class, new FieldMetaData(realmFieldType6, realmFieldType18, true));
        RealmFieldType realmFieldType19 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        map2.put(cls6, new FieldMetaData(realmFieldType8, realmFieldType19, false));
        map2.put(Boolean.class, new FieldMetaData(realmFieldType8, realmFieldType19, true));
        map2.put(cls7, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Byte.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        map2.put(byte[].class, new FieldMetaData(realmFieldType10, RealmFieldType.STRING_TO_BINARY_MAP, true));
        map2.put(Date.class, new FieldMetaData(realmFieldType11, RealmFieldType.STRING_TO_DATE_MAP, true));
        map2.put(ObjectId.class, new FieldMetaData(realmFieldType12, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        map2.put(Decimal128.class, new FieldMetaData(realmFieldType13, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        map2.put(UUID.class, new FieldMetaData(realmFieldType14, RealmFieldType.STRING_TO_UUID_MAP, true));
        map2.put(RealmAny.class, new FieldMetaData(realmFieldType15, RealmFieldType.STRING_TO_MIXED_MAP, true));
        SUPPORTED_DICTIONARY_SIMPLE_FIELDS = DesugarCollections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        map3.put(String.class, new FieldMetaData(realmFieldType, RealmFieldType.STRING_SET, true));
        RealmFieldType realmFieldType20 = RealmFieldType.INTEGER_SET;
        map3.put(cls, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Short.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        map3.put(cls2, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Integer.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        map3.put(cls3, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Long.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        RealmFieldType realmFieldType21 = RealmFieldType.FLOAT_SET;
        map3.put(cls4, new FieldMetaData(realmFieldType4, realmFieldType21, false));
        map3.put(Float.class, new FieldMetaData(realmFieldType4, realmFieldType21, true));
        RealmFieldType realmFieldType22 = RealmFieldType.DOUBLE_SET;
        map3.put(cls5, new FieldMetaData(realmFieldType6, realmFieldType22, false));
        map3.put(Double.class, new FieldMetaData(realmFieldType6, realmFieldType22, true));
        RealmFieldType realmFieldType23 = RealmFieldType.BOOLEAN_SET;
        map3.put(cls6, new FieldMetaData(realmFieldType8, realmFieldType23, false));
        map3.put(Boolean.class, new FieldMetaData(realmFieldType8, realmFieldType23, true));
        map3.put(cls7, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Byte.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        map3.put(byte[].class, new FieldMetaData(realmFieldType10, RealmFieldType.BINARY_SET, true));
        map3.put(Date.class, new FieldMetaData(realmFieldType11, RealmFieldType.DATE_SET, true));
        map3.put(ObjectId.class, new FieldMetaData(realmFieldType12, RealmFieldType.OBJECT_ID_SET, true));
        map3.put(Decimal128.class, new FieldMetaData(realmFieldType13, RealmFieldType.DECIMAL128_SET, true));
        map3.put(UUID.class, new FieldMetaData(realmFieldType14, RealmFieldType.UUID_SET, true));
        map3.put(RealmAny.class, new FieldMetaData(realmFieldType15, RealmFieldType.MIXED_SET, true));
        SUPPORTED_SET_SIMPLE_FIELDS = DesugarCollections.unmodifiableMap(map3);
        HashMap map4 = new HashMap();
        map4.put(RealmObject.class, new FieldMetaData(RealmFieldType.OBJECT, null, false));
        map4.put(RealmList.class, new FieldMetaData(RealmFieldType.LIST, null, false));
        map4.put(RealmDictionary.class, new FieldMetaData(RealmFieldType.STRING_TO_LINK_MAP, null, false));
        map4.put(RealmSet.class, new FieldMetaData(RealmFieldType.LINK_SET, null, false));
        SUPPORTED_LINKED_FIELDS = DesugarCollections.unmodifiableMap(map4);
    }

    public RealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table, ColumnInfo columnInfo) {
        this.schema = realmSchema;
        this.realm = baseRealm;
        this.table = table;
        this.columnInfo = columnInfo;
    }

    public static void checkLegalName(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        }
        if (str.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain '.'");
        }
        if (str.length() > 63) {
            throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
        }
    }

    public RealmObjectSchema add(String str, RealmFieldType realmFieldType, boolean z10, boolean z11, boolean z12) {
        long jAddColumn = this.table.addColumn(realmFieldType, str, !z12);
        if (z11) {
            this.table.addSearchIndex(jAddColumn);
        }
        if (z10) {
            OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, getClassName(), str);
        }
        return this;
    }

    public abstract RealmObjectSchema addField(String str, Class<?> cls, FieldAttribute... fieldAttributeArr);

    public abstract RealmObjectSchema addIndex(String str);

    public abstract RealmObjectSchema addPrimaryKey(String str);

    public abstract RealmObjectSchema addRealmDictionaryField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmDictionaryField(String str, Class<?> cls);

    public abstract RealmObjectSchema addRealmListField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmListField(String str, Class<?> cls);

    public abstract RealmObjectSchema addRealmObjectField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmSetField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmSetField(String str, Class<?> cls);

    public void checkFieldExists(String str) {
        if (this.table.getColumnKey(str) != -1) {
            return;
        }
        throw new IllegalArgumentException("Field name doesn't exist on object '" + getClassName() + "': " + str);
    }

    public long getAndCheckFieldColumnKey(String str) {
        long columnKey = this.columnInfo.getColumnKey(str);
        if (columnKey >= 0) {
            return columnKey;
        }
        throw new IllegalArgumentException(c.s("Field does not exist: ", str));
    }

    public String getClassName() {
        return this.table.getClassName();
    }

    public long getColumnKey(String str) {
        long columnKey = this.table.getColumnKey(str);
        if (columnKey != -1) {
            return columnKey;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(c.t("Field name '", str, "' does not exist on schema for '", getClassName(), "'"));
    }

    public long getFieldColumnKey(String str) {
        return this.columnInfo.getColumnKey(str);
    }

    public Set<String> getFieldNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet((int) this.table.getColumnCount());
        for (String str : this.table.getColumnNames()) {
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public RealmFieldType getFieldType(String str) {
        return this.table.getColumnType(getColumnKey(str));
    }

    public String getPrimaryKey() {
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName());
        if (primaryKeyForObject != null) {
            return primaryKeyForObject;
        }
        throw new IllegalStateException(getClassName() + " doesn't have a primary key.");
    }

    public abstract String getPropertyClassName(String str);

    public Table getTable() {
        return this.table;
    }

    public boolean hasField(String str) {
        return this.table.getColumnKey(str) != -1;
    }

    public boolean hasIndex(String str) {
        checkLegalName(str);
        checkFieldExists(str);
        Table table = this.table;
        return table.hasSearchIndex(table.getColumnKey(str));
    }

    public boolean hasPrimaryKey() {
        return OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName()) != null;
    }

    public boolean isEmbedded() {
        return this.table.isEmbedded();
    }

    public boolean isNullable(String str) {
        return this.table.isColumnNullable(getColumnKey(str));
    }

    public boolean isPrimaryKey(String str) {
        checkFieldExists(str);
        return str.equals(OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName()));
    }

    public boolean isPropertyAcceptableForEmbeddedObject(RealmFieldType realmFieldType) {
        return realmFieldType == RealmFieldType.OBJECT || realmFieldType == RealmFieldType.LIST;
    }

    public boolean isRequired(String str) {
        return !this.table.isColumnNullable(getColumnKey(str));
    }

    public abstract RealmObjectSchema removeField(String str);

    public abstract RealmObjectSchema removeIndex(String str);

    public abstract RealmObjectSchema removePrimaryKey();

    public abstract RealmObjectSchema renameField(String str, String str2);

    public abstract RealmObjectSchema setClassName(String str);

    public void setEmbedded(boolean z10) {
        setEmbedded(z10, false);
    }

    public abstract RealmObjectSchema setNullable(String str, boolean z10);

    public abstract RealmObjectSchema setRequired(String str, boolean z10);

    public abstract RealmObjectSchema transform(Function function);

    public void setEmbedded(boolean z10, boolean z11) {
        if (hasPrimaryKey()) {
            throw new IllegalStateException("Embedded classes cannot have primary keys. This class has a primary key defined so cannot be marked as embedded: " + getClassName());
        }
        if (!this.table.setEmbedded(z10, z11) && z10) {
            throw new IllegalStateException("The class could not be marked as embedded as some objects of this type break some of the Embedded Objects invariants. In order to convert all objects to be embedded, they must have one and exactly one parent objectpointing to them.");
        }
    }

    public RealmObjectSchema add(String str, RealmFieldType realmFieldType, RealmObjectSchema realmObjectSchema) {
        this.table.addColumnLink(realmFieldType, str, this.realm.getSharedRealm().getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }
}
