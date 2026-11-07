package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b[] f621u;

    static {
        b bVar = new b("NONE", 0);
        f618r = bVar;
        b bVar2 = new b("START", 1);
        f619s = bVar2;
        b bVar3 = new b("END", 2);
        f620t = bVar3;
        f621u = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f621u.clone();
    }
}
