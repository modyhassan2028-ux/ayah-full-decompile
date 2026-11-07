package p063g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f16261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f16262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ m[] f16263t;

    static {
        m mVar = new m("Ltr", 0);
        f16261r = mVar;
        m mVar2 = new m("Rtl", 1);
        f16262s = mVar2;
        f16263t = new m[]{mVar, mVar2};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f16263t.clone();
    }
}
