package p132n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f19942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f19943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f19944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f19945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ v[] f19946v;

    static {
        v vVar = new v("UNDEFINED", 0);
        f19942r = vVar;
        v vVar2 = new v("SETUP", 1);
        f19943s = vVar2;
        v vVar3 = new v("MOVING", 2);
        f19944t = vVar3;
        v vVar4 = new v("FINISHED", 3);
        f19945u = vVar4;
        f19946v = new v[]{vVar, vVar2, vVar3, vVar4};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f19946v.clone();
    }
}
