package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes.dex */
final class FloatRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public FloatRealmAnyOperator(Float f3) {
        super(f3, RealmAny.Type.FLOAT);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Float) super.getValue(Float.class));
    }

    public FloatRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Float.valueOf(nativeRealmAny.asFloat()), RealmAny.Type.FLOAT, nativeRealmAny);
    }
}
