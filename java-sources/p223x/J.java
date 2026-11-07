package p223x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final J f23857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ J[] f23858s;

    static {
        J j = new J("Default", 0);
        f23857r = j;
        f23858s = new J[]{j, new J("UserInput", 1), new J("PreventUserInput", 2)};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f23858s.clone();
    }
}
