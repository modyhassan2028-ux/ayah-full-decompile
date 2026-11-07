package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: W.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0572j1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0572j1 f9191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0572j1 f9192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC0572j1[] f9193t;

    static {
        EnumC0572j1 enumC0572j1 = new EnumC0572j1("THUMB", 0);
        f9191r = enumC0572j1;
        EnumC0572j1 enumC0572j2 = new EnumC0572j1("TRACK", 1);
        f9192s = enumC0572j2;
        f9193t = new EnumC0572j1[]{enumC0572j1, enumC0572j2};
    }

    public static EnumC0572j1 valueOf(String str) {
        return (EnumC0572j1) Enum.valueOf(EnumC0572j1.class, str);
    }

    public static EnumC0572j1[] values() {
        return (EnumC0572j1[]) f9193t.clone();
    }
}
