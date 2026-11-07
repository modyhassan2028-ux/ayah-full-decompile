package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Z2 {
    public static final Z2 DOUBLE_VALUE;
    public static final Z2 INT_VALUE;
    public static final Z2 LONG_VALUE;
    public static final Z2 REFERENCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Z2[] f18421a;

    public static Z2 valueOf(String str) {
        return (Z2) Enum.valueOf(Z2.class, str);
    }

    public static Z2[] values() {
        return (Z2[]) f18421a.clone();
    }

    static {
        Z2 z10 = new Z2("REFERENCE", 0);
        REFERENCE = z10;
        Z2 z11 = new Z2("INT_VALUE", 1);
        INT_VALUE = z11;
        Z2 z12 = new Z2("LONG_VALUE", 2);
        LONG_VALUE = z12;
        Z2 z13 = new Z2("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = z13;
        f18421a = new Z2[]{z10, z11, z12, z13};
    }
}
