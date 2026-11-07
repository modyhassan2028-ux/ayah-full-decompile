package Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final M f10623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final M f10624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final M f10625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final M f10626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ M[] f10627v;

    static {
        M m10 = new M("IGNORED", 0);
        f10623r = m10;
        M m11 = new M("SCHEDULED", 1);
        f10624s = m11;
        M m12 = new M("DEFERRED", 2);
        f10625t = m12;
        M m13 = new M("IMMINENT", 3);
        f10626u = m13;
        f10627v = new M[]{m10, m11, m12, m13};
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f10627v.clone();
    }
}
