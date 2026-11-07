package K6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f5250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f5251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f5252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d[] f5253u;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f5250r = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f5251s = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f5252t = dVar3;
        f5253u = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5253u.clone();
    }
}
