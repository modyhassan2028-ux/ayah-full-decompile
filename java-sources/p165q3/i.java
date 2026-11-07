package p165q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f21294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i f21295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f21296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i[] f21297u;

    static {
        i iVar = new i("PREPARING", 0);
        f21294r = iVar;
        i iVar2 = new i("PLAYING", 1);
        f21295s = iVar2;
        i iVar3 = new i("PAUSED", 2);
        f21296t = iVar3;
        f21297u = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f21297u.clone();
    }
}
