package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m0 f4147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m0 f4148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ m0[] f4149t;

    static {
        m0 m0Var = new m0("Width", 0);
        f4147r = m0Var;
        m0 m0Var2 = new m0("Height", 1);
        f4148s = m0Var2;
        f4149t = new m0[]{m0Var, m0Var2};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f4149t.clone();
    }
}
