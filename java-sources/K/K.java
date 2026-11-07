package K;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final K f4480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final K f4481s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final K f4482t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ K[] f4483u;

    static {
        K k7 = new K("Cursor", 0);
        f4480r = k7;
        K k10 = new K("SelectionStart", 1);
        f4481s = k10;
        K k11 = new K("SelectionEnd", 2);
        f4482t = k11;
        f4483u = new K[]{k7, k10, k11};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f4483u.clone();
    }
}
