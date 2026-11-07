package io.realm;

import io.realm.internal.ColumnInfo;
import io.realm.internal.Table;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
class ImmutableRealmObjectSchema extends RealmObjectSchema {
    private static final String SCHEMA_IMMUTABLE_EXCEPTION_MSG = "This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.";

    public ImmutableRealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table, ColumnInfo columnInfo) {
        super(baseRealm, realmSchema, table, columnInfo);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addField(String str, Class<?> cls, FieldAttribute... fieldAttributeArr) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addIndex(String str) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addPrimaryKey(String str) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmDictionaryField(String str, Class<?> cls) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmListField(String str, RealmObjectSchema realmObjectSchema) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmObjectField(String str, RealmObjectSchema realmObjectSchema) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmSetField(String str, RealmObjectSchema realmObjectSchema) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public String getPropertyClassName(String str) {
        ColumnInfo.ColumnDetails columnDetails = this.columnInfo.getColumnDetails(str);
        if (columnDetails != null) {
            return columnDetails.linkedClassName;
        }
        throw new IllegalArgumentException(a.D("Property '", str, "' not found."));
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removeField(String str) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removeIndex(String str) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removePrimaryKey() {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema renameField(String str, String str2) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setClassName(String str) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setNullable(String str, boolean z10) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setRequired(String str, boolean z10) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema transform(RealmObjectSchema.Function function) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    public ImmutableRealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table) {
        super(baseRealm, realmSchema, table, new RealmObjectSchema.DynamicColumnIndices(table));
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmDictionaryField(String str, RealmObjectSchema realmObjectSchema) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmListField(String str, Class<?> cls) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmSetField(String str, Class<?> cls) {
        throw new UnsupportedOperationException(SCHEMA_IMMUTABLE_EXCEPTION_MSG);
    }
}
