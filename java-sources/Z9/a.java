package Z9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f11039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f11040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f11041t;

    static {
        a aVar = new a("NONE", 0);
        f11039r = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f11040s = aVar3;
        f11041t = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11041t.clone();
    }
}
