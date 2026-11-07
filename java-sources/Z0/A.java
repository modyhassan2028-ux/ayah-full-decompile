package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final A f10869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final A f10870s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final A f10871t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final A f10872u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ A[] f10873v;

    static {
        A a9 = new A("StartInput", 0);
        f10869r = a9;
        A a10 = new A("StopInput", 1);
        f10870s = a10;
        A a11 = new A("ShowKeyboard", 2);
        f10871t = a11;
        A a12 = new A("HideKeyboard", 3);
        f10872u = a12;
        f10873v = new A[]{a9, a10, a11, a12};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f10873v.clone();
    }
}
