package P7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f6737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f6738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f6739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f6740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j[] f6741v;

    static {
        j jVar = new j("HIDING", 0);
        f6737r = jVar;
        j jVar2 = new j("HIDDEN", 1);
        f6738s = jVar2;
        j jVar3 = new j("SHOWING", 2);
        f6739t = jVar3;
        j jVar4 = new j("SHOWN", 3);
        f6740u = jVar4;
        f6741v = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f6741v.clone();
    }
}
