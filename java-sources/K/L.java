package K;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final L f4484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final L f4485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final L f4486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ L[] f4487u;

    static {
        L l10 = new L("None", 0);
        f4484r = l10;
        L l11 = new L("Selection", 1);
        f4485s = l11;
        L l12 = new L("Cursor", 2);
        f4486t = l12;
        f4487u = new L[]{l10, l11, l12};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f4487u.clone();
    }
}
