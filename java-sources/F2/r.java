package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f2314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f2315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f2316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ r[] f2317u;

    static {
        r rVar = new r("AUTOMATIC", 0);
        f2314r = rVar;
        r rVar2 = new r("TRUNCATE", 1);
        f2315s = rVar2;
        r rVar3 = new r("WRITE_AHEAD_LOGGING", 2);
        f2316t = rVar3;
        f2317u = new r[]{rVar, rVar2, rVar3};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f2317u.clone();
    }
}
