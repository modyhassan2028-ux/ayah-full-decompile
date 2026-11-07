package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I f890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I f891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ I[] f892t;

    static {
        I i10 = new I("Min", 0);
        f890r = i10;
        I i11 = new I("Max", 1);
        f891s = i11;
        f892t = new I[]{i10, i11};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f892t.clone();
    }
}
