package Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p0 f10758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p0 f10759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p0 f10760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p0 f10761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p0 f10762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p0 f10763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ p0[] f10764x;

    static {
        p0 p0Var = new p0("ShutDown", 0);
        f10758r = p0Var;
        p0 p0Var2 = new p0("ShuttingDown", 1);
        f10759s = p0Var2;
        p0 p0Var3 = new p0("Inactive", 2);
        f10760t = p0Var3;
        p0 p0Var4 = new p0("InactivePendingWork", 3);
        f10761u = p0Var4;
        p0 p0Var5 = new p0("Idle", 4);
        f10762v = p0Var5;
        p0 p0Var6 = new p0("PendingWork", 5);
        f10763w = p0Var6;
        f10764x = new p0[]{p0Var, p0Var2, p0Var3, p0Var4, p0Var5, p0Var6};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f10764x.clone();
    }
}
