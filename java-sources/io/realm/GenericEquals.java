package io.realm;

/* JADX INFO: loaded from: classes.dex */
class GenericEquals<K, V> extends EqualsHelper<K, V> {
    @Override // io.realm.EqualsHelper
    public boolean compareInternal(V v10, V v11) {
        if (v10 == null) {
            return v11 == null;
        }
        return v10.equals(v11);
    }
}
