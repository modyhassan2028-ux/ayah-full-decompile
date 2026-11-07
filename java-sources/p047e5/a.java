package p047e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f15785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f15786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f15787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f15788u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a[] f15789v;

    static {
        a aVar = new a("START", 0);
        f15785r = aVar;
        a aVar2 = new a("MIDDLE", 1);
        f15786s = aVar2;
        a aVar3 = new a("END", 2);
        f15787t = aVar3;
        a aVar4 = new a("ONLY", 3);
        f15788u = aVar4;
        f15789v = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15789v.clone();
    }
}
