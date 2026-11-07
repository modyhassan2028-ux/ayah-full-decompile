package p131n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f19788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f19789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f19790t;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        f19788r = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        f19789s = aVar2;
        f19790t = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19790t.clone();
    }
}
