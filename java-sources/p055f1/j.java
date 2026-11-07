package p055f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f15909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f15910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ j[] f15911t;

    static {
        j jVar = new j("Ltr", 0);
        f15909r = jVar;
        j jVar2 = new j("Rtl", 1);
        f15910s = jVar2;
        f15911t = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f15911t.clone();
    }
}
