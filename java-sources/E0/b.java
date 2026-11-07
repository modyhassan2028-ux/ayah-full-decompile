package E0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f1408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f1409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f1410t;

    static {
        b bVar = new b("Lsq2", 0);
        f1408r = bVar;
        b bVar2 = new b("Impulse", 1);
        f1409s = bVar2;
        f1410t = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1410t.clone();
    }
}
