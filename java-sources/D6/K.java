package D6;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final K f1245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ K[] f1246s;

    static {
        K k7 = new K("DEFAULT", 0);
        f1245r = k7;
        K k10 = new K("UNMETERED_ONLY", 1);
        K k11 = new K("UNMETERED_OR_DAILY", 2);
        K k12 = new K("FAST_IF_RADIO_AWAKE", 3);
        K k13 = new K("NEVER", 4);
        K k14 = new K("UNRECOGNIZED", 5);
        f1246s = new K[]{k7, k10, k11, k12, k13, k14};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, k7);
        sparseArray.put(1, k10);
        sparseArray.put(2, k11);
        sparseArray.put(3, k12);
        sparseArray.put(4, k13);
        sparseArray.put(-1, k14);
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f1246s.clone();
    }
}
