package io.realm;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class EqualsHelper<K, V> {
    public abstract boolean compareInternal(V v10, V v11);

    public boolean equalsHelper(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
        if (entry.getKey().equals(entry2.getKey())) {
            return compareInternal(entry.getValue(), entry2.getValue());
        }
        return false;
    }
}
