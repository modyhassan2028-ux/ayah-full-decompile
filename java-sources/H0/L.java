package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final L f3156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final L f3157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ L[] f3158t;

    static {
        L l10 = new L("Min", 0);
        f3156r = l10;
        L l11 = new L("Max", 1);
        f3157s = l11;
        f3158t = new L[]{l10, l11};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f3158t.clone();
    }
}
