package S2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f7477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f7478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f7479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f7480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f7481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ e[] f7482w;

    static {
        e eVar = new e("ON_CONFIGURE", 0);
        f7477r = eVar;
        e eVar2 = new e("ON_CREATE", 1);
        f7478s = eVar2;
        e eVar3 = new e("ON_UPGRADE", 2);
        f7479t = eVar3;
        e eVar4 = new e("ON_DOWNGRADE", 3);
        f7480u = eVar4;
        e eVar5 = new e("ON_OPEN", 4);
        f7481v = eVar5;
        f7482w = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f7482w.clone();
    }
}
