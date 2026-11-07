package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final B0 f3878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final B0 f3879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final B0 f3880t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ B0[] f3881u;

    static {
        B0 b5 = new B0("ContinueTraversal", 0);
        f3878r = b5;
        B0 b10 = new B0("SkipSubtreeAndContinueTraversal", 1);
        f3879s = b10;
        B0 b11 = new B0("CancelTraversal", 2);
        f3880t = b11;
        f3881u = new B0[]{b5, b10, b11};
    }

    public static B0 valueOf(String str) {
        return (B0) Enum.valueOf(B0.class, str);
    }

    public static B0[] values() {
        return (B0[]) f3881u.clone();
    }
}
