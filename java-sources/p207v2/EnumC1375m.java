package p207v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1375m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1375m f23268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1375m f23269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1375m f23270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC1375m[] f23271u;

    static {
        EnumC1375m enumC1375m = new EnumC1375m("REFRESH", 0);
        f23268r = enumC1375m;
        EnumC1375m enumC1375m2 = new EnumC1375m("PREPEND", 1);
        f23269s = enumC1375m2;
        EnumC1375m enumC1375m3 = new EnumC1375m("APPEND", 2);
        f23270t = enumC1375m3;
        f23271u = new EnumC1375m[]{enumC1375m, enumC1375m2, enumC1375m3};
    }

    public static EnumC1375m valueOf(String str) {
        return (EnumC1375m) Enum.valueOf(EnumC1375m.class, str);
    }

    public static EnumC1375m[] values() {
        return (EnumC1375m[]) f23271u.clone();
    }
}
