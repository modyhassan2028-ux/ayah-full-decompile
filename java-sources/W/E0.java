package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E0 f8523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E0 f8524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ E0[] f8525t;

    static {
        E0 e10 = new E0("Selector", 0);
        f8523r = e10;
        E0 e11 = new E0("InnerCircle", 1);
        f8524s = e11;
        f8525t = new E0[]{e10, e11};
    }

    public static E0 valueOf(String str) {
        return (E0) Enum.valueOf(E0.class, str);
    }

    public static E0[] values() {
        return (E0[]) f8525t.clone();
    }
}
