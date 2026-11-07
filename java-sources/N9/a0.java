package N9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a0 f6156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a0 f6157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a0 f6158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a0[] f6159u;

    static {
        a0 a0Var = new a0("START", 0);
        f6156r = a0Var;
        a0 a0Var2 = new a0("STOP", 1);
        f6157s = a0Var2;
        a0 a0Var3 = new a0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f6158t = a0Var3;
        f6159u = new a0[]{a0Var, a0Var2, a0Var3};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f6159u.clone();
    }
}
