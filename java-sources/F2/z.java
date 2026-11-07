package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z f2341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z f2342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ z[] f2343t;

    static {
        z zVar = new z("DEFERRED", 0);
        f2341r = zVar;
        z zVar2 = new z("IMMEDIATE", 1);
        f2342s = zVar2;
        f2343t = new z[]{zVar, zVar2, new z("EXCLUSIVE", 2)};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f2343t.clone();
    }
}
