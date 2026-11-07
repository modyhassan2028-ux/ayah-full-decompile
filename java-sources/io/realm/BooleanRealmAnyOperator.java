package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes.dex */
final class BooleanRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public BooleanRealmAnyOperator(Boolean bool) {
        super(bool, RealmAny.Type.BOOLEAN);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Boolean) super.getValue(Boolean.class));
    }

    public BooleanRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), RealmAny.Type.BOOLEAN, nativeRealmAny);
    }
}
