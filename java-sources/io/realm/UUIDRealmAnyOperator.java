package io.realm;

import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
final class UUIDRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public UUIDRealmAnyOperator(UUID uuid) {
        super(uuid, RealmAny.Type.UUID);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((UUID) super.getValue(UUID.class));
    }

    public UUIDRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), RealmAny.Type.UUID, nativeRealmAny);
    }
}
