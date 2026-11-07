package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0442j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0442j f6376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0442j f6377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0442j f6378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0442j[] f6379u;

    static {
        EnumC0442j enumC0442j = new EnumC0442j("CROSSED", 0);
        f6376r = enumC0442j;
        EnumC0442j enumC0442j2 = new EnumC0442j("NOT_CROSSED", 1);
        f6377s = enumC0442j2;
        EnumC0442j enumC0442j3 = new EnumC0442j("COLLAPSED", 2);
        f6378t = enumC0442j3;
        f6379u = new EnumC0442j[]{enumC0442j, enumC0442j2, enumC0442j3};
    }

    public static EnumC0442j valueOf(String str) {
        return (EnumC0442j) Enum.valueOf(EnumC0442j.class, str);
    }

    public static EnumC0442j[] values() {
        return (EnumC0442j[]) f6379u.clone();
    }
}
