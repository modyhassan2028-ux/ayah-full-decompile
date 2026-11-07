package io.realm;

import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes.dex */
abstract class PrimitiveRealmAnyOperator extends RealmAnyOperator {
    private final Object value;

    public PrimitiveRealmAnyOperator(Object obj, RealmAny.Type type) {
        super(type);
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.value;
        Object obj3 = ((PrimitiveRealmAnyOperator) obj).value;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    @Override // io.realm.RealmAnyOperator
    public <T> T getValue(Class<T> cls) {
        return cls.cast(this.value);
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.value.toString();
    }

    public PrimitiveRealmAnyOperator(Object obj, RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        super(type, nativeRealmAny);
        this.value = obj;
    }
}
