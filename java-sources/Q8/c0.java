package Q8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c0 f6958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c0 f6959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c0[] f6960t;

    static {
        c0 c0Var = new c0("GENERAL", 0);
        f6958r = c0Var;
        c0 c0Var2 = new c0("FALLBACK", 1);
        f6959s = c0Var2;
        f6960t = new c0[]{c0Var, c0Var2};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f6960t.clone();
    }
}
