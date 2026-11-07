package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final N f9718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ N[] f9719s;

    static {
        N n6 = new N("Filled", 0);
        f9718r = n6;
        f9719s = new N[]{n6, new N("Outlined", 1)};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f9719s.clone();
    }
}
