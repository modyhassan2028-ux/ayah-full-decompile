package A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0047u0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0047u0 f424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0047u0 f425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC0047u0[] f426t;

    static {
        EnumC0047u0 enumC0047u0 = new EnumC0047u0("Vertical", 0);
        f424r = enumC0047u0;
        EnumC0047u0 enumC0047u1 = new EnumC0047u0("Horizontal", 1);
        f425s = enumC0047u1;
        f426t = new EnumC0047u0[]{enumC0047u0, enumC0047u1};
    }

    public static EnumC0047u0 valueOf(String str) {
        return (EnumC0047u0) Enum.valueOf(EnumC0047u0.class, str);
    }

    public static EnumC0047u0[] values() {
        return (EnumC0047u0[]) f426t.clone();
    }
}
