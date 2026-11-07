package p246z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f24827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f24828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f24829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l f24830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f24831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ l[] f24832w;

    static {
        l lVar = new l("PlayingSameAyah", 0);
        f24827r = lVar;
        l lVar2 = new l("PlayingDifferentAyah", 1);
        f24828s = lVar2;
        l lVar3 = new l("PlayingDifferentAyahInAnotherSura", 2);
        f24829t = lVar3;
        l lVar4 = new l("NoAudioRequest", 3);
        f24830u = lVar4;
        l lVar5 = new l("Stopped", 4);
        f24831v = lVar5;
        f24832w = new l[]{lVar, lVar2, lVar3, lVar4, lVar5};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f24832w.clone();
    }
}
