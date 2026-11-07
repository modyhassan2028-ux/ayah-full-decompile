package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G f3889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final G f3890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final G f3891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ G[] f3892u;

    static {
        G g = new G("InMeasureBlock", 0);
        f3889r = g;
        G g10 = new G("InLayoutBlock", 1);
        f3890s = g10;
        G g11 = new G("NotUsed", 2);
        f3891t = g11;
        f3892u = new G[]{g, g10, g11};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f3892u.clone();
    }
}
