package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final S f3978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final S f3979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final S f3980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ S[] f3981u;

    static {
        S s10 = new S("IsPlacedInLookahead", 0);
        f3978r = s10;
        S s11 = new S("IsPlacedInApproach", 1);
        f3979s = s11;
        S s12 = new S("IsNotPlaced", 2);
        f3980t = s12;
        f3981u = new S[]{s10, s11, s12};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f3981u.clone();
    }
}
