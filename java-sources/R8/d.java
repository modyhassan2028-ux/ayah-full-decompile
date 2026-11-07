package R8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f7406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f7407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ d[] f7408t;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        f7406r = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        f7407s = dVar2;
        f7408t = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f7408t.clone();
    }
}
