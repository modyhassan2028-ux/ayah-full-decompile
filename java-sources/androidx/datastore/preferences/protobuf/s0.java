package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ s0[] f12508A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s0 f12509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s0 f12510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s0 f12511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s0 f12512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s0 f12513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s0 f12514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s0 f12515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s0 f12516y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s0 f12517z;

    static {
        s0 s0Var = new s0("INT", 0);
        f12509r = s0Var;
        s0 s0Var2 = new s0("LONG", 1);
        f12510s = s0Var2;
        s0 s0Var3 = new s0("FLOAT", 2);
        f12511t = s0Var3;
        s0 s0Var4 = new s0("DOUBLE", 3);
        f12512u = s0Var4;
        s0 s0Var5 = new s0("BOOLEAN", 4);
        f12513v = s0Var5;
        s0 s0Var6 = new s0("STRING", 5);
        f12514w = s0Var6;
        C0733g c0733g = C0733g.f12451t;
        s0 s0Var7 = new s0("BYTE_STRING", 6);
        f12515x = s0Var7;
        s0 s0Var8 = new s0("ENUM", 7);
        f12516y = s0Var8;
        s0 s0Var9 = new s0("MESSAGE", 8);
        f12517z = s0Var9;
        f12508A = new s0[]{s0Var, s0Var2, s0Var3, s0Var4, s0Var5, s0Var6, s0Var7, s0Var8, s0Var9};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f12508A.clone();
    }
}
