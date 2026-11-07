package D0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final A f1039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final A f1040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final A f1041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ A[] f1042u;

    static {
        A a9 = new A("Unknown", 0);
        f1039r = a9;
        A a10 = new A("Dispatching", 1);
        f1040s = a10;
        A a11 = new A("NotDispatching", 2);
        f1041t = a11;
        f1042u = new A[]{a9, a10, a11};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f1042u.clone();
    }
}
