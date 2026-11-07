package p131n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f19815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f19816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ e[] f19817t;

    static {
        e eVar = new e("VIEW_APPEAR", 0);
        f19815r = eVar;
        e eVar2 = new e("VIEW_DISAPPEAR", 1);
        f19816s = eVar2;
        f19817t = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f19817t.clone();
    }
}
