package p219w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f23723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f23724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f23725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f23726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f23727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ g[] f23728w;

    static {
        g gVar = new g("Stopped", 0);
        f23723r = gVar;
        g gVar2 = new g("Preparing", 1);
        f23724s = gVar2;
        g gVar3 = new g("Playing", 2);
        f23725t = gVar3;
        g gVar4 = new g("Paused", 3);
        f23726u = gVar4;
        g gVar5 = new g("TemporarilyPaused", 4);
        f23727v = gVar5;
        f23728w = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f23728w.clone();
    }
}
