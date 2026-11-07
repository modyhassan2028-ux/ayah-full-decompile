package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: W.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0565h1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0565h1 f9158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0565h1 f9159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0565h1 f9160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0565h1[] f9161u;

    static {
        EnumC0565h1 enumC0565h1 = new EnumC0565h1("Hidden", 0);
        f9158r = enumC0565h1;
        EnumC0565h1 enumC0565h2 = new EnumC0565h1("Expanded", 1);
        f9159s = enumC0565h2;
        EnumC0565h1 enumC0565h3 = new EnumC0565h1("PartiallyExpanded", 2);
        f9160t = enumC0565h3;
        f9161u = new EnumC0565h1[]{enumC0565h1, enumC0565h2, enumC0565h3};
    }

    public static EnumC0565h1 valueOf(String str) {
        return (EnumC0565h1) Enum.valueOf(EnumC0565h1.class, str);
    }

    public static EnumC0565h1[] values() {
        return (EnumC0565h1[]) f9161u.clone();
    }
}
