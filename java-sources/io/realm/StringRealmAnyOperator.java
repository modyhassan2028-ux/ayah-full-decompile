package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes.dex */
final class StringRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public StringRealmAnyOperator(String str) {
        super(str, RealmAny.Type.STRING);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((String) super.getValue(String.class));
    }

    public StringRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), RealmAny.Type.STRING, nativeRealmAny);
    }
}
