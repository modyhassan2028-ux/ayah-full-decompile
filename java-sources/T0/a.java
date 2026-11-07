package T0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f7551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f7552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f7553t;

    static {
        a aVar = new a("On", 0);
        f7551r = aVar;
        a aVar2 = new a("Off", 1);
        f7552s = aVar2;
        f7553t = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7553t.clone();
    }
}
