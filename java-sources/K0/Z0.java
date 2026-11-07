package K0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Z0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z0 f5049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Z0 f5050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ Z0[] f5051t;

    static {
        Z0 z10 = new Z0("Shown", 0);
        f5049r = z10;
        Z0 z11 = new Z0("Hidden", 1);
        f5050s = z11;
        f5051t = new Z0[]{z10, z11};
    }

    public static Z0 valueOf(String str) {
        return (Z0) Enum.valueOf(Z0.class, str);
    }

    public static Z0[] values() {
        return (Z0[]) f5051t.clone();
    }
}
