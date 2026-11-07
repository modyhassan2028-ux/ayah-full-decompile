package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes.dex */
final class IntegerRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public IntegerRealmAnyOperator(Byte b5) {
        super(b5, RealmAny.Type.INTEGER);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Number) super.getValue(Number.class));
    }

    @Override // io.realm.PrimitiveRealmAnyOperator
    public boolean equals(Object obj) {
        return obj != null && IntegerRealmAnyOperator.class.equals(obj.getClass()) && ((Number) getValue(Number.class)).longValue() == ((Number) ((RealmAnyOperator) obj).getValue(Number.class)).longValue();
    }

    public IntegerRealmAnyOperator(Short sh) {
        super(sh, RealmAny.Type.INTEGER);
    }

    public IntegerRealmAnyOperator(Integer num) {
        super(num, RealmAny.Type.INTEGER);
    }

    public IntegerRealmAnyOperator(Long l10) {
        super(l10, RealmAny.Type.INTEGER);
    }

    public IntegerRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), RealmAny.Type.INTEGER, nativeRealmAny);
    }
}
