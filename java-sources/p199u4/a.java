package p199u4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f22929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f22930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f22931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f22932u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a[] f22933v;

    static {
        a aVar = new a("Focused", 0);
        f22929r = aVar;
        a aVar2 = new a("NoFocusTransient", 1);
        f22930s = aVar2;
        a aVar3 = new a("NoFocusTransientCanDuck", 2);
        f22931t = aVar3;
        a aVar4 = new a("NoFocus", 3);
        f22932u = aVar4;
        f22933v = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f22933v.clone();
    }
}
