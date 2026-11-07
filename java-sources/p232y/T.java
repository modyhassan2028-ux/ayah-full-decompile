package p232y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final T f24454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final T f24455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final T f24456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ T[] f24457u;

    static {
        T t2 = new T("Default", 0);
        f24454r = t2;
        T t10 = new T("UserInput", 1);
        f24455s = t10;
        T t11 = new T("PreventUserInput", 2);
        f24456t = t11;
        f24457u = new T[]{t2, t10, t11};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f24457u.clone();
    }
}
