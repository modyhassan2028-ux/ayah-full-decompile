package p153p1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f20846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f20847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f20848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f20849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f20850v;

    static {
        d dVar = new d("FIXED", 0);
        f20846r = dVar;
        d dVar2 = new d("WRAP_CONTENT", 1);
        f20847s = dVar2;
        d dVar3 = new d("MATCH_CONSTRAINT", 2);
        f20848t = dVar3;
        d dVar4 = new d("MATCH_PARENT", 3);
        f20849u = dVar4;
        f20850v = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f20850v.clone();
    }
}
