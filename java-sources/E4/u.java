package E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f1886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f1887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f1888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ u[] f1889u;

    static {
        u uVar = new u("AYAH", 0);
        f1886r = uVar;
        u uVar2 = new u("PAGE", 1);
        f1887s = uVar2;
        u uVar3 = new u("SURA", 2);
        f1888t = uVar3;
        f1889u = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f1889u.clone();
    }
}
