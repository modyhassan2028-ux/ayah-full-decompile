package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes.dex */
final class DoubleRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public DoubleRealmAnyOperator(Double d5) {
        super(d5, RealmAny.Type.DOUBLE);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Double) super.getValue(Double.class));
    }

    public DoubleRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Double.valueOf(nativeRealmAny.asDouble()), RealmAny.Type.DOUBLE, nativeRealmAny);
    }
}
