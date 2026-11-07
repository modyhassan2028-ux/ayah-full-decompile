package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final M f3159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final M f3160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ M[] f3161t;

    static {
        M m10 = new M("Width", 0);
        f3159r = m10;
        M m11 = new M("Height", 1);
        f3160s = m11;
        f3161t = new M[]{m10, m11};
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f3161t.clone();
    }
}
