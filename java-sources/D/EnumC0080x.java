package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0080x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0080x f1031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0080x f1032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0080x f1033t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0080x[] f1034u;

    static {
        EnumC0080x enumC0080x = new EnumC0080x("Vertical", 0);
        f1031r = enumC0080x;
        EnumC0080x enumC0080x2 = new EnumC0080x("Horizontal", 1);
        f1032s = enumC0080x2;
        EnumC0080x enumC0080x3 = new EnumC0080x("Both", 2);
        f1033t = enumC0080x3;
        f1034u = new EnumC0080x[]{enumC0080x, enumC0080x2, enumC0080x3};
    }

    public static EnumC0080x valueOf(String str) {
        return (EnumC0080x) Enum.valueOf(EnumC0080x.class, str);
    }

    public static EnumC0080x[] values() {
        return (EnumC0080x[]) f1034u.clone();
    }
}
