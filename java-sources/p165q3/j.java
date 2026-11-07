package p165q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f21298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f21299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f21300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f21301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j[] f21302v;

    static {
        j jVar = new j("endOfPage", 0);
        f21298r = jVar;
        j jVar2 = new j("endOfSura", 1);
        f21299s = jVar2;
        j jVar3 = new j("endOfLastSuraOnPage", 2);
        f21300t = jVar3;
        j jVar4 = new j("continuous", 3);
        f21301u = jVar4;
        f21302v = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f21302v.clone();
    }
}
