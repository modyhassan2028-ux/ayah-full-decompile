package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I1 f8595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I1 f8596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I1 f8597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ I1[] f8598u;

    static {
        I1 i10 = new I1("StartToEnd", 0);
        f8595r = i10;
        I1 i11 = new I1("EndToStart", 1);
        f8596s = i11;
        I1 i12 = new I1("Settled", 2);
        f8597t = i12;
        f8598u = new I1[]{i10, i11, i12};
    }

    public static I1 valueOf(String str) {
        return (I1) Enum.valueOf(I1.class, str);
    }

    public static I1[] values() {
        return (I1[]) f8598u.clone();
    }
}
