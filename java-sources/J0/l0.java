package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l0 f4144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l0 f4145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ l0[] f4146t;

    static {
        l0 l0Var = new l0("Min", 0);
        f4144r = l0Var;
        l0 l0Var2 = new l0("Max", 1);
        f4145s = l0Var2;
        f4146t = new l0[]{l0Var, l0Var2};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f4146t.clone();
    }
}
