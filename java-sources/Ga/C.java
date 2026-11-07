package Ga;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C f2973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C f2974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C[] f2975t;

    static {
        C c10 = new C("BACKWARD", 0);
        f2973r = c10;
        C c11 = new C("FORWARD", 1);
        f2974s = c11;
        f2975t = new C[]{c10, c11};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f2975t.clone();
    }
}
