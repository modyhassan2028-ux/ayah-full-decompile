package p214w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f23549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x f23550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x f23551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ x[] f23552u;

    static {
        x xVar = new x("PreEnter", 0);
        f23549r = xVar;
        x xVar2 = new x("Visible", 1);
        f23550s = xVar2;
        x xVar3 = new x("PostExit", 2);
        f23551t = xVar3;
        f23552u = new x[]{xVar, xVar2, xVar3};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f23552u.clone();
    }
}
