package j$.util.stream;

import j$.util.C1076q;
import j$.util.C1210x;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1202z extends AbstractC1078a implements C {
    @Override // j$.util.stream.C
    public final j$.util.C findAny() {
        return (j$.util.C) H0(E.f18247d);
    }

    @Override // j$.util.stream.C
    public final j$.util.C findFirst() {
        return (j$.util.C) H0(E.f18246c);
    }

    @Override // j$.util.stream.C
    public final C sorted() {
        return new D2(this, Y2.f18408q | Y2.f18406o, 0);
    }

    public static j$.util.W T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.W) {
            return (j$.util.W) spliterator;
        }
        if (G3.f18264a) {
            G3.a(AbstractC1078a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        H0(new L(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        H0(new L(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Z2 L0() {
        return Z2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 J0(AbstractC1078a abstractC1078a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC1184v1.c0(abstractC1078a, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator S0(AbstractC1078a abstractC1078a, Supplier supplier, boolean z10) {
        return new C1127j3(abstractC1078a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final boolean K0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        DoubleConsumer f3;
        boolean zE;
        j$.util.W wT0 = T0(spliterator);
        if (interfaceC1136l2 instanceof DoubleConsumer) {
            f3 = (DoubleConsumer) interfaceC1136l2;
        } else {
            if (G3.f18264a) {
                G3.a(AbstractC1078a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC1136l2);
            f3 = new j$.util.F(interfaceC1136l2, 1);
        }
        do {
            zE = interfaceC1136l2.e();
            if (zE) {
                break;
            }
        } while (wT0.tryAdvance(f3));
        return zE;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final InterfaceC1198y0 A0(long j, IntFunction intFunction) {
        return AbstractC1184v1.i0(j);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final j$.util.I iterator() {
        j$.util.W wSpliterator = spliterator();
        Objects.requireNonNull(wSpliterator);
        return new j$.util.k0(wSpliterator);
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final j$.util.W spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.C
    public final Stream boxed() {
        return new C1158q(this, 0, new j$.time.f(25), 0);
    }

    @Override // j$.util.stream.C
    public final C map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new r(this, Y2.f18407p | Y2.f18405n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.C
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C1158q(this, Y2.f18407p | Y2.f18405n, doubleFunction, 0);
    }

    @Override // j$.util.stream.C
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new C1167s(this, Y2.f18407p | Y2.f18405n, 0);
    }

    @Override // j$.util.stream.C
    public final InterfaceC1139m0 v() {
        Objects.requireNonNull(null);
        return new C1172t(this, Y2.f18407p | Y2.f18405n, 0);
    }

    @Override // j$.util.stream.C
    public final C d(C1076q c1076q) {
        Objects.requireNonNull(c1076q);
        return new r(this, Y2.f18407p | Y2.f18405n | Y2.f18411t, c1076q, 1);
    }

    @Override // j$.util.stream.C
    public final C b() {
        Objects.requireNonNull(null);
        return new C1182v(this, Y2.f18411t, 1);
    }

    @Override // j$.util.stream.C
    public final C peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new r(this, doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final C limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1184v1.v0(this, 0L, j);
    }

    @Override // j$.util.stream.C
    public final C skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1184v1.v0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.C
    public final C a() {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(null);
        return new D2(this, Y3.f18419a, 1);
    }

    @Override // j$.util.stream.C
    public final C c() {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(null);
        return new D2(this, Y3.f18420b, 2);
    }

    @Override // j$.util.stream.C
    public final C distinct() {
        return ((AbstractC1096d2) boxed()).distinct().mapToDouble(new j$.time.f(26));
    }

    @Override // j$.util.stream.C
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.time.f(29), new C1148o(0), new j$.time.f(18));
        int i10 = AbstractC1123j.f18482a;
        double d5 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        return (Double.isNaN(d5) && Double.isInfinite(d9)) ? d9 : d5;
    }

    @Override // j$.util.stream.C
    public final j$.util.C min() {
        return reduce(new j$.time.f(19));
    }

    @Override // j$.util.stream.C
    public final j$.util.C max() {
        return reduce(new j$.time.f(28));
    }

    @Override // j$.util.stream.C
    public final j$.util.C average() {
        double[] dArr = (double[]) collect(new j$.time.f(20), new j$.time.f(21), new j$.time.f(22));
        if (dArr[2] <= 0.0d) {
            return j$.util.C.f18045c;
        }
        int i10 = AbstractC1123j.f18482a;
        double d5 = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        if (Double.isNaN(d5) && Double.isInfinite(d9)) {
            d5 = d9;
        }
        return new j$.util.C(d5 / dArr[2]);
    }

    @Override // j$.util.stream.C
    public final C1210x summaryStatistics() {
        return (C1210x) collect(new j$.time.f(12), new j$.time.f(23), new j$.time.f(24));
    }

    @Override // j$.util.stream.C
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C1143n c1143n = new C1143n(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c1143n);
        return H0(new A1(Z2.DOUBLE_VALUE, c1143n, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.C
    public final boolean p() {
        return ((Boolean) H0(AbstractC1184v1.u0(EnumC1173t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean u() {
        return ((Boolean) H0(AbstractC1184v1.u0(EnumC1173t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean C() {
        return ((Boolean) H0(AbstractC1184v1.u0(EnumC1173t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final double[] toArray() {
        return (double[]) AbstractC1184v1.o0((A0) I0(new j$.time.f(27))).b();
    }

    @Override // j$.util.stream.C
    public final double reduce(double d5, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) H0(new E1(Z2.DOUBLE_VALUE, doubleBinaryOperator, d5))).doubleValue();
    }

    @Override // j$.util.stream.C
    public final j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.C) H0(new C1199y1(Z2.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.C
    public final long count() {
        return ((Long) H0(new C1(1))).longValue();
    }
}
