package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0217p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0217p f3213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0217p f3214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC0217p[] f3215t;

    static {
        EnumC0217p enumC0217p = new EnumC0217p("Width", 0);
        f3213r = enumC0217p;
        EnumC0217p enumC0217p2 = new EnumC0217p("Height", 1);
        f3214s = enumC0217p2;
        f3215t = new EnumC0217p[]{enumC0217p, enumC0217p2};
    }

    public static EnumC0217p valueOf(String str) {
        return (EnumC0217p) Enum.valueOf(EnumC0217p.class, str);
    }

    public static EnumC0217p[] values() {
        return (EnumC0217p[]) f3215t.clone();
    }
}
