package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w f6422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final w f6423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w f6424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ w[] f6425u;

    static {
        w wVar = new w("Left", 0);
        f6422r = wVar;
        w wVar2 = new w("Middle", 1);
        f6423s = wVar2;
        w wVar3 = new w("Right", 2);
        f6424t = wVar3;
        f6425u = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f6425u.clone();
    }
}
