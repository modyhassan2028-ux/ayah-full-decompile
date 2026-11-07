package p223x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final N f23862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ N[] f23863s;

    static {
        N n6 = new N("Restart", 0);
        f23862r = n6;
        f23863s = new N[]{n6, new N("Reverse", 1)};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f23863s.clone();
    }
}
