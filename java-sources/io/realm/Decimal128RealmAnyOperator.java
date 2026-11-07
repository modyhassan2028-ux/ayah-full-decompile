package io.realm;

import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;

/* JADX INFO: loaded from: classes.dex */
final class Decimal128RealmAnyOperator extends PrimitiveRealmAnyOperator {
    public Decimal128RealmAnyOperator(Decimal128 decimal128) {
        super(decimal128, RealmAny.Type.DECIMAL128);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((Decimal128) super.getValue(Decimal128.class));
    }

    public Decimal128RealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), RealmAny.Type.DECIMAL128, nativeRealmAny);
    }
}
