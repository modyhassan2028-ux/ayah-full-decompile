package p223x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1418g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1418g f23975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC1418g f23976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC1418g[] f23977t;

    static {
        EnumC1418g enumC1418g = new EnumC1418g("BoundReached", 0);
        f23975r = enumC1418g;
        EnumC1418g enumC1418g2 = new EnumC1418g("Finished", 1);
        f23976s = enumC1418g2;
        f23977t = new EnumC1418g[]{enumC1418g, enumC1418g2};
    }

    public static EnumC1418g valueOf(String str) {
        return (EnumC1418g) Enum.valueOf(EnumC1418g.class, str);
    }

    public static EnumC1418g[] values() {
        return (EnumC1418g[]) f23977t.clone();
    }
}
