package j$.util;

import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class DesugarCollections {
    public static <T> Set<T> unmodifiableSet(Set<? extends T> set) {
        return new C1209w(set);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C1075p(list);
        }
        return new C1208v(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new C1207u(map);
    }

    public static <T> Set<T> synchronizedSet(Set<T> set) {
        return new C1071l(set);
    }

    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        if (!(list instanceof RandomAccess)) {
            return new C1068i(list);
        }
        return new C1070k(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C1069j(map);
    }
}
