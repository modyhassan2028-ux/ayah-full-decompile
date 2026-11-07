package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n0 f12500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o0 f12501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p0 f12502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ r0[] f12503w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s0 f12504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12505s;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF2;

    static {
        r0 r0Var = new r0("DOUBLE", 0, s0.f12512u, 1);
        r0 r0Var2 = new r0("FLOAT", 1, s0.f12511t, 5);
        s0 s0Var = s0.f12510s;
        r0 r0Var3 = new r0("INT64", 2, s0Var, 0);
        r0 r0Var4 = new r0("UINT64", 3, s0Var, 0);
        s0 s0Var2 = s0.f12509r;
        r0 r0Var5 = new r0("INT32", 4, s0Var2, 0);
        r0 r0Var6 = new r0("FIXED64", 5, s0Var, 1);
        r0 r0Var7 = new r0("FIXED32", 6, s0Var2, 5);
        r0 r0Var8 = new r0("BOOL", 7, s0.f12513v, 0);
        n0 n0Var = new n0("STRING", 8, s0.f12514w, 2);
        f12500t = n0Var;
        s0 s0Var3 = s0.f12517z;
        o0 o0Var = new o0("GROUP", 9, s0Var3, 3);
        f12501u = o0Var;
        p0 p0Var = new p0("MESSAGE", 10, s0Var3, 2);
        f12502v = p0Var;
        f12503w = new r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, n0Var, o0Var, p0Var, new q0("BYTES", 11, s0.f12515x, 2), new r0("UINT32", 12, s0Var2, 0), new r0("ENUM", 13, s0.f12516y, 0), new r0("SFIXED32", 14, s0Var2, 5), new r0("SFIXED64", 15, s0Var, 1), new r0("SINT32", 16, s0Var2, 0), new r0("SINT64", 17, s0Var, 0)};
    }

    public r0(String str, int i10, s0 s0Var, int i11) {
        super(str, i10);
        this.f12504r = s0Var;
        this.f12505s = i11;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f12503w.clone();
    }
}
