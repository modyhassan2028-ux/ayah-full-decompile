package D0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0097o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0097o f1123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0097o f1124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0097o f1125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0097o[] f1126u;

    static {
        EnumC0097o enumC0097o = new EnumC0097o("Initial", 0);
        f1123r = enumC0097o;
        EnumC0097o enumC0097o2 = new EnumC0097o("Main", 1);
        f1124s = enumC0097o2;
        EnumC0097o enumC0097o3 = new EnumC0097o("Final", 2);
        f1125t = enumC0097o3;
        f1126u = new EnumC0097o[]{enumC0097o, enumC0097o2, enumC0097o3};
    }

    public static EnumC0097o valueOf(String str) {
        return (EnumC0097o) Enum.valueOf(EnumC0097o.class, str);
    }

    public static EnumC0097o[] values() {
        return (EnumC0097o[]) f1126u.clone();
    }
}
