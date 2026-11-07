package D6;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final A f1239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ A[] f1240s;

    /* JADX INFO: Fake field, exist only in values array */
    A EF0;

    static {
        A a9 = new A("NOT_SET", 0);
        A a10 = new A("EVENT_OVERRIDE", 1);
        f1239r = a10;
        f1240s = new A[]{a9, a10};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, a9);
        sparseArray.put(5, a10);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f1240s.clone();
    }
}
