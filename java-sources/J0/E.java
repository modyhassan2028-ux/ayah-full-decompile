package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E f3882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E f3883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final E f3884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final E f3885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final E f3886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ E[] f3887w;

    static {
        E e10 = new E("Measuring", 0);
        f3882r = e10;
        E e11 = new E("LookaheadMeasuring", 1);
        f3883s = e11;
        E e12 = new E("LayingOut", 2);
        f3884t = e12;
        E e13 = new E("LookaheadLayingOut", 3);
        f3885u = e13;
        E e14 = new E("Idle", 4);
        f3886v = e14;
        f3887w = new E[]{e10, e11, e12, e13, e14};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f3887w.clone();
    }
}
