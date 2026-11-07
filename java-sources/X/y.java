package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f9806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f9807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f9808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y[] f9809u;

    static {
        y yVar = new y("Focused", 0);
        f9806r = yVar;
        y yVar2 = new y("UnfocusedEmpty", 1);
        f9807s = yVar2;
        y yVar3 = new y("UnfocusedNotEmpty", 2);
        f9808t = yVar3;
        f9809u = new y[]{yVar, yVar2, yVar3};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f9809u.clone();
    }
}
