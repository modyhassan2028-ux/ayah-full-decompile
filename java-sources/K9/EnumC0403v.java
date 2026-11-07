package K9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: K9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0403v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0403v f5401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0403v f5402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0403v f5403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0403v f5404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0403v[] f5405v;

    static {
        EnumC0403v enumC0403v = new EnumC0403v("DEFAULT", 0);
        f5401r = enumC0403v;
        EnumC0403v enumC0403v2 = new EnumC0403v("LAZY", 1);
        f5402s = enumC0403v2;
        EnumC0403v enumC0403v3 = new EnumC0403v("ATOMIC", 2);
        f5403t = enumC0403v3;
        EnumC0403v enumC0403v4 = new EnumC0403v("UNDISPATCHED", 3);
        f5404u = enumC0403v4;
        f5405v = new EnumC0403v[]{enumC0403v, enumC0403v2, enumC0403v3, enumC0403v4};
    }

    public static EnumC0403v valueOf(String str) {
        return (EnumC0403v) Enum.valueOf(EnumC0403v.class, str);
    }

    public static EnumC0403v[] values() {
        return (EnumC0403v[]) f5405v.clone();
    }
}
