package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0165j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0165j f2285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0165j f2286s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0165j f2287t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0165j[] f2288u;

    static {
        EnumC0165j enumC0165j = new EnumC0165j("NO_OP", 0);
        f2285r = enumC0165j;
        EnumC0165j enumC0165j2 = new EnumC0165j("ADD", 1);
        f2286s = enumC0165j2;
        EnumC0165j enumC0165j3 = new EnumC0165j("REMOVE", 2);
        f2287t = enumC0165j3;
        f2288u = new EnumC0165j[]{enumC0165j, enumC0165j2, enumC0165j3};
    }

    public static EnumC0165j valueOf(String str) {
        return (EnumC0165j) Enum.valueOf(EnumC0165j.class, str);
    }

    public static EnumC0165j[] values() {
        return (EnumC0165j[]) f2288u.clone();
    }
}
