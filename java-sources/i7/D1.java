package i7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final D1 f16859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D1 f16860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ D1[] f16861t;

    static {
        D1 d1 = new D1("CONSENT", 0);
        f16859r = d1;
        D1 d5 = new D1("LEGITIMATE_INTEREST", 1);
        D1 d9 = new D1("FLEXIBLE_CONSENT", 2);
        D1 d10 = new D1("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f16860s = d10;
        f16861t = new D1[]{d1, d5, d9, d10};
    }

    public static D1[] values() {
        return (D1[]) f16861t.clone();
    }
}
