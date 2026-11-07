package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0216o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0216o f3210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0216o f3211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC0216o[] f3212t;

    static {
        EnumC0216o enumC0216o = new EnumC0216o("Min", 0);
        f3210r = enumC0216o;
        EnumC0216o enumC0216o2 = new EnumC0216o("Max", 1);
        f3211s = enumC0216o2;
        f3212t = new EnumC0216o[]{enumC0216o, enumC0216o2};
    }

    public static EnumC0216o valueOf(String str) {
        return (EnumC0216o) Enum.valueOf(EnumC0216o.class, str);
    }

    public static EnumC0216o[] values() {
        return (EnumC0216o[]) f3212t.clone();
    }
}
