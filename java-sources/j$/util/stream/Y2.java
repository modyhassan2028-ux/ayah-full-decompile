package j$.util.stream;

import j$.util.C1076q;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class Y2 {
    public static final Y2 DISTINCT;
    public static final Y2 ORDERED;
    public static final Y2 SHORT_CIRCUIT;
    public static final Y2 SIZED;
    public static final Y2 SORTED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18399f;
    public static final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18401i;
    public static final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f18403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f18407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f18408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f18409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f18410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f18411t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f18412u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Y2[] f18413v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f18414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18418e;

    public static Y2 valueOf(String str) {
        return (Y2) Enum.valueOf(Y2.class, str);
    }

    public static Y2[] values() {
        return (Y2[]) f18413v.clone();
    }

    static {
        X2 x9 = X2.SPLITERATOR;
        C1076q c1076qA = A(x9);
        X2 x10 = X2.STREAM;
        c1076qA.a(x10);
        X2 x11 = X2.OP;
        ((EnumMap) ((Map) c1076qA.f18203b)).put(x11, 3);
        Y2 y10 = new Y2("DISTINCT", 0, 0, c1076qA);
        DISTINCT = y10;
        C1076q c1076qA2 = A(x9);
        c1076qA2.a(x10);
        ((EnumMap) ((Map) c1076qA2.f18203b)).put(x11, 3);
        Y2 y11 = new Y2("SORTED", 1, 1, c1076qA2);
        SORTED = y11;
        C1076q c1076qA3 = A(x9);
        c1076qA3.a(x10);
        ((EnumMap) ((Map) c1076qA3.f18203b)).put(x11, 3);
        X2 x12 = X2.TERMINAL_OP;
        ((EnumMap) ((Map) c1076qA3.f18203b)).put(x12, 2);
        X2 x13 = X2.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) c1076qA3.f18203b)).put(x13, 2);
        Y2 y12 = new Y2("ORDERED", 2, 2, c1076qA3);
        ORDERED = y12;
        C1076q c1076qA4 = A(x9);
        c1076qA4.a(x10);
        ((EnumMap) ((Map) c1076qA4.f18203b)).put(x11, 2);
        Y2 y13 = new Y2("SIZED", 3, 3, c1076qA4);
        SIZED = y13;
        C1076q c1076qA5 = A(x11);
        c1076qA5.a(x12);
        int i10 = 0;
        Y2 y14 = new Y2("SHORT_CIRCUIT", 4, 12, c1076qA5);
        SHORT_CIRCUIT = y14;
        f18413v = new Y2[]{y10, y11, y12, y13, y14};
        f18399f = l(x9);
        g = l(x10);
        f18400h = l(x11);
        l(x12);
        l(x13);
        for (Y2 y15 : values()) {
            i10 |= y15.f18418e;
        }
        f18401i = i10;
        int i11 = g;
        j = i11;
        int i12 = i11 << 1;
        f18402k = i12;
        f18403l = i11 | i12;
        Y2 y16 = DISTINCT;
        f18404m = y16.f18416c;
        f18405n = y16.f18417d;
        Y2 y17 = SORTED;
        f18406o = y17.f18416c;
        f18407p = y17.f18417d;
        Y2 y18 = ORDERED;
        f18408q = y18.f18416c;
        f18409r = y18.f18417d;
        Y2 y19 = SIZED;
        f18410s = y19.f18416c;
        f18411t = y19.f18417d;
        f18412u = SHORT_CIRCUIT.f18416c;
    }

    public static C1076q A(X2 x9) {
        C1076q c1076q = new C1076q(9, new EnumMap(X2.class));
        c1076q.a(x9);
        return c1076q;
    }

    public Y2(String str, int i10, int i11, C1076q c1076q) {
        super(str, i10);
        for (X2 x9 : X2.values()) {
            j$.util.Map.EL.b((Map) c1076q.f18203b, x9, 0);
        }
        this.f18414a = (Map) c1076q.f18203b;
        int i12 = i11 * 2;
        this.f18415b = i12;
        this.f18416c = 1 << i12;
        this.f18417d = 2 << i12;
        this.f18418e = 3 << i12;
    }

    public final boolean v(int i10) {
        return (i10 & this.f18418e) == this.f18416c;
    }

    public static int l(X2 x9) {
        int iIntValue = 0;
        for (Y2 y10 : values()) {
            iIntValue |= ((Integer) y10.f18414a.get(x9)).intValue() << y10.f18415b;
        }
        return iIntValue;
    }

    public static int k(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = f18401i;
        } else {
            i12 = ~(((j & i10) << 1) | i10 | ((f18402k & i10) >> 1));
        }
        return i10 | (i11 & i12);
    }

    public static int p(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i10 = iCharacteristics & 4;
        int i11 = f18399f;
        return (i10 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i11 : iCharacteristics & i11 & (-5);
    }
}
