package p161p9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f21156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f21157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f21158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a[] f21159u;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f21156r = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f21157s = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f21158t = aVar3;
        f21159u = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f21159u.clone();
    }
}
