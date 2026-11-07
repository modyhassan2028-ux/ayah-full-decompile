package p207v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c0 f23216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ c0[] f23217s;

    static {
        c0 c0Var = new c0("LAUNCH_INITIAL_REFRESH", 0);
        f23216r = c0Var;
        f23217s = new c0[]{c0Var, new c0("SKIP_INITIAL_REFRESH", 1)};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f23217s.clone();
    }
}
