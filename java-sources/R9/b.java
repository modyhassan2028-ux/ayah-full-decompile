package R9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f7419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f7420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f7421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f7422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f7423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ b[] f7424w;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f7419r = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f7420s = bVar2;
        b bVar3 = new b("PARKING", 2);
        f7421t = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f7422u = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f7423v = bVar5;
        f7424w = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7424w.clone();
    }
}
