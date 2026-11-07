package j$.util.stream;

import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1184v1 implements E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y0 f18566a = new Y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0 f18567b = new W0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X0 f18568c = new X0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V0 f18569d = new V0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f18570e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f18571f = new long[0];
    public static final double[] g = new double[0];

    public abstract InterfaceC1198y0 A0(long j, IntFunction intFunction);

    public abstract Q1 D0();

    public abstract InterfaceC1136l2 E0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2);

    public abstract InterfaceC1136l2 F0(InterfaceC1136l2 interfaceC1136l2);

    public abstract Spliterator G0(Spliterator spliterator);

    public abstract void g0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2);

    public abstract boolean h0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2);

    public abstract G0 k0(Spliterator spliterator, boolean z10, IntFunction intFunction);

    public abstract long l0(Spliterator spliterator);

    @Override // j$.util.stream.E3
    public /* synthetic */ int w() {
        return 0;
    }

    public static C1076q r0(Function function) {
        C1076q c1076q = new C1076q(5);
        c1076q.f18203b = function;
        return c1076q;
    }

    public static long X(long j, long j10, long j11) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j10, j11));
        }
        return -1L;
    }

    public static long a0(long j, long j10) {
        long j11 = j10 >= 0 ? j + j10 : Long.MAX_VALUE;
        if (j11 >= 0) {
            return j11;
        }
        return Long.MAX_VALUE;
    }

    public static Spliterator Y(Z2 z10, Spliterator spliterator, long j, long j10) {
        long jA0 = a0(j, j10);
        int i10 = AbstractC1180u2.f18563a[z10.ordinal()];
        if (i10 == 1) {
            return new C1171s3(spliterator, j, jA0);
        }
        if (i10 == 2) {
            return new C1157p3((j$.util.Z) spliterator, j, jA0);
        }
        if (i10 == 3) {
            return new C1162q3((j$.util.c0) spliterator, j, jA0);
        }
        if (i10 != 4) {
            throw new IllegalStateException("Unknown shape " + z10);
        }
        return new C1152o3((j$.util.W) spliterator, j, jA0);
    }

    public static j$.util.concurrent.t B0(EnumC1173t0 enumC1173t0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC1173t0);
        return new j$.util.concurrent.t(Z2.REFERENCE, enumC1173t0, new j$.util.concurrent.t(5, enumC1173t0, predicate));
    }

    public static Z0 j0(Z2 z10) {
        int i10 = H0.f18267a[z10.ordinal()];
        if (i10 == 1) {
            return f18566a;
        }
        if (i10 == 2) {
            return f18567b;
        }
        if (i10 == 3) {
            return f18568c;
        }
        if (i10 == 4) {
            return f18569d;
        }
        throw new IllegalStateException("Unknown shape " + z10);
    }

    public static j$.util.concurrent.t w0(EnumC1173t0 enumC1173t0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC1173t0);
        return new j$.util.concurrent.t(Z2.INT_VALUE, enumC1173t0, new C1144n0(enumC1173t0, 1));
    }

    public static C1146n2 C0(AbstractC1096d2 abstractC1096d2, long j, long j10) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1146n2(abstractC1096d2, m0(j10), j, j10);
    }

    public static G0 W(G0 g10, long j, long j10, IntFunction intFunction) {
        if (j == 0 && j10 == g10.count()) {
            return g10;
        }
        Spliterator spliterator = g10.spliterator();
        long j11 = j10 - j;
        InterfaceC1198y0 interfaceC1198y0Z = Z(j11, intFunction);
        interfaceC1198y0Z.c(j11);
        for (int i10 = 0; i10 < j && spliterator.tryAdvance(new C1084b0(2)); i10++) {
        }
        if (j10 == g10.count()) {
            spliterator.forEachRemaining(interfaceC1198y0Z);
        } else {
            for (int i11 = 0; i11 < j11 && spliterator.tryAdvance(interfaceC1198y0Z); i11++) {
            }
        }
        interfaceC1198y0Z.end();
        return interfaceC1198y0Z.build();
    }

    public static I0 f0(Z2 z10, G0 g10, G0 g11) {
        int i10 = H0.f18267a[z10.ordinal()];
        if (i10 == 1) {
            return new R0(g10, g11);
        }
        if (i10 == 2) {
            return new O0((C0) g10, (C0) g11);
        }
        if (i10 == 3) {
            return new P0((E0) g10, (E0) g11);
        }
        if (i10 != 4) {
            throw new IllegalStateException("Unknown shape " + z10);
        }
        return new N0((A0) g10, (A0) g11);
    }

    public static j$.util.concurrent.t y0(EnumC1173t0 enumC1173t0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC1173t0);
        return new j$.util.concurrent.t(Z2.LONG_VALUE, enumC1173t0, new C1144n0(enumC1173t0, 0));
    }

    public static void K() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.t u0(EnumC1173t0 enumC1173t0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC1173t0);
        return new j$.util.concurrent.t(Z2.DOUBLE_VALUE, enumC1173t0, new C1144n0(enumC1173t0, 2));
    }

    public static void L() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC1198y0 Z(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new C1080a1(j, intFunction);
        }
        return new C1169s1();
    }

    public static void D() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void G(InterfaceC1126j2 interfaceC1126j2, Integer num) {
        if (G3.f18264a) {
            G3.a(interfaceC1126j2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC1126j2.accept(num.intValue());
    }

    public static void I(InterfaceC1131k2 interfaceC1131k2, Long l10) {
        if (G3.f18264a) {
            G3.a(interfaceC1131k2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC1131k2.accept(l10.longValue());
    }

    public static InterfaceC1188w0 s0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C1095d1();
        }
        return new C1090c1(j);
    }

    public static void E(InterfaceC1121i2 interfaceC1121i2, Double d5) {
        if (G3.f18264a) {
            G3.a(interfaceC1121i2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC1121i2.accept(d5.doubleValue());
    }

    public static C1156p2 x0(AbstractC1079a0 abstractC1079a0, long j, long j10) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1156p2(abstractC1079a0, m0(j10), j, j10);
    }

    public static InterfaceC1193x0 t0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C1140m1();
        }
        return new C1135l1(j);
    }

    public static Object[] M(F0 f3, IntFunction intFunction) {
        if (G3.f18264a) {
            G3.a(f3.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (f3.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) f3.count());
        f3.k(objArr, 0);
        return objArr;
    }

    public static InterfaceC1183v0 i0(long j) {
        if (j < 0 || j >= 2147483639) {
            return new U0();
        }
        return new T0(j);
    }

    public static G0 b0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        long jL0 = abstractC1184v1.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            K k7 = new K();
            k7.f18299a = intFunction;
            G0 g10 = (G0) new L0(abstractC1184v1, spliterator, k7, new C1084b0(10), 3).invoke();
            return z10 ? n0(g10, intFunction) : g10;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jL0);
        new C1160q1(spliterator, abstractC1184v1, objArr).invoke();
        return new J0(objArr);
    }

    public static void R(C0 c10, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            c10.g((IntConsumer) consumer);
        } else {
            if (G3.f18264a) {
                G3.a(c10.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Z) c10.spliterator()).forEachRemaining(consumer);
        }
    }

    public static C1165r2 z0(AbstractC1124j0 abstractC1124j0, long j, long j10) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1165r2(abstractC1124j0, m0(j10), j, j10);
    }

    public static void O(C0 c10, Integer[] numArr, int i10) {
        if (G3.f18264a) {
            G3.a(c10.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) c10.b();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
        }
    }

    public static C0 U(C0 c10, long j, long j10) {
        if (j == 0 && j10 == c10.count()) {
            return c10;
        }
        long j11 = j10 - j;
        j$.util.Z z10 = (j$.util.Z) c10.spliterator();
        InterfaceC1188w0 interfaceC1188w0S0 = s0(j11);
        interfaceC1188w0S0.c(j11);
        for (int i10 = 0; i10 < j && z10.tryAdvance((IntConsumer) new B0(0)); i10++) {
        }
        if (j10 == c10.count()) {
            z10.forEachRemaining((IntConsumer) interfaceC1188w0S0);
        } else {
            for (int i11 = 0; i11 < j11 && z10.tryAdvance((IntConsumer) interfaceC1188w0S0); i11++) {
            }
        }
        interfaceC1188w0S0.end();
        return interfaceC1188w0S0.build();
    }

    public static C0 d0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, boolean z10) {
        long jL0 = abstractC1184v1.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c10 = (C0) new L0(abstractC1184v1, spliterator, new C1084b0(6), new C1084b0(7), 1).invoke();
            return z10 ? p0(c10) : c10;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jL0];
        new C1150o1(spliterator, abstractC1184v1, iArr).invoke();
        return new C1085b1(iArr);
    }

    public static E0 e0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, boolean z10) {
        long jL0 = abstractC1184v1.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e10 = (E0) new L0(abstractC1184v1, spliterator, new C1084b0(8), new C1084b0(9), 2).invoke();
            return z10 ? q0(e10) : e10;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jL0];
        new C1155p1(spliterator, abstractC1184v1, jArr).invoke();
        return new C1130k1(jArr);
    }

    public static void S(E0 e10, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e10.g((LongConsumer) consumer);
        } else {
            if (G3.f18264a) {
                G3.a(e10.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.c0) e10.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void P(E0 e10, Long[] lArr, int i10) {
        if (G3.f18264a) {
            G3.a(e10.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) e10.b();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = Long.valueOf(jArr[i11]);
        }
    }

    public static E0 V(E0 e10, long j, long j10) {
        if (j == 0 && j10 == e10.count()) {
            return e10;
        }
        long j11 = j10 - j;
        j$.util.c0 c0Var = (j$.util.c0) e10.spliterator();
        InterfaceC1193x0 interfaceC1193x0T0 = t0(j11);
        interfaceC1193x0T0.c(j11);
        for (int i10 = 0; i10 < j && c0Var.tryAdvance((LongConsumer) new D0(0)); i10++) {
        }
        if (j10 == e10.count()) {
            c0Var.forEachRemaining((LongConsumer) interfaceC1193x0T0);
        } else {
            for (int i11 = 0; i11 < j11 && c0Var.tryAdvance((LongConsumer) interfaceC1193x0T0); i11++) {
            }
        }
        interfaceC1193x0T0.end();
        return interfaceC1193x0T0.build();
    }

    public static A0 c0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, boolean z10) {
        long jL0 = abstractC1184v1.l0(spliterator);
        if (jL0 < 0 || !spliterator.hasCharacteristics(16384)) {
            A0 a9 = (A0) new L0(abstractC1184v1, spliterator, new C1084b0(4), new C1084b0(5), 0).invoke();
            return z10 ? o0(a9) : a9;
        }
        if (jL0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jL0];
        new C1145n1(spliterator, abstractC1184v1, dArr).invoke();
        return new S0(dArr);
    }

    public static C1175t2 v0(AbstractC1202z abstractC1202z, long j, long j10) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1175t2(abstractC1202z, m0(j10), j, j10);
    }

    public static G0 n0(G0 g10, IntFunction intFunction) {
        if (g10.o() <= 0) {
            return g10;
        }
        long jCount = g10.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C1179u1(g10, objArr, 1).invoke();
        return new J0(objArr);
    }

    public static void Q(A0 a9, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            a9.g((DoubleConsumer) consumer);
        } else {
            if (G3.f18264a) {
                G3.a(a9.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.W) a9.spliterator()).forEachRemaining(consumer);
        }
    }

    public static C0 p0(C0 c10) {
        if (c10.o() <= 0) {
            return c10;
        }
        long jCount = c10.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C1174t1(c10, iArr, 0).invoke();
        return new C1085b1(iArr);
    }

    public static void N(A0 a9, Double[] dArr, int i10) {
        if (G3.f18264a) {
            G3.a(a9.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) a9.b();
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
        }
    }

    public static A0 T(A0 a9, long j, long j10) {
        if (j == 0 && j10 == a9.count()) {
            return a9;
        }
        long j11 = j10 - j;
        j$.util.W w9 = (j$.util.W) a9.spliterator();
        InterfaceC1183v0 interfaceC1183v0I0 = i0(j11);
        interfaceC1183v0I0.c(j11);
        for (int i10 = 0; i10 < j && w9.tryAdvance((DoubleConsumer) new C1203z0(0)); i10++) {
        }
        if (j10 == a9.count()) {
            w9.forEachRemaining((DoubleConsumer) interfaceC1183v0I0);
        } else {
            for (int i11 = 0; i11 < j11 && w9.tryAdvance((DoubleConsumer) interfaceC1183v0I0); i11++) {
            }
        }
        interfaceC1183v0I0.end();
        return interfaceC1183v0I0.build();
    }

    public static E0 q0(E0 e10) {
        if (e10.o() <= 0) {
            return e10;
        }
        long jCount = e10.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C1174t1(e10, jArr, 0).invoke();
        return new C1130k1(jArr);
    }

    public static int m0(long j) {
        return (j != -1 ? Y2.f18412u : 0) | Y2.f18411t;
    }

    public static A0 o0(A0 a9) {
        if (a9.o() <= 0) {
            return a9;
        }
        long jCount = a9.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C1174t1(a9, dArr, 0).invoke();
        return new S0(dArr);
    }

    @Override // j$.util.stream.E3
    public Object f(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        Q1 q1D0 = D0();
        abstractC1078a.E0(spliterator, q1D0);
        return q1D0.get();
    }

    @Override // j$.util.stream.E3
    public Object j(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        return ((Q1) new X1(this, abstractC1184v1, spliterator).invoke()).get();
    }
}
