package j$.util.stream;

import j$.util.C1211y;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1079a0 extends AbstractC1078a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.D findAny() {
        return (j$.util.D) H0(F.f18252d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D findFirst() {
        return (j$.util.D) H0(F.f18251c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new E2(this, Y2.f18408q | Y2.f18406o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        H0(new M(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        H0(new M(intConsumer, true));
    }

    public static j$.util.Z T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Z) {
            return (j$.util.Z) spliterator;
        }
        if (G3.f18264a) {
            G3.a(AbstractC1078a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Z2 L0() {
        return Z2.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 J0(AbstractC1078a abstractC1078a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC1184v1.d0(abstractC1078a, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator S0(AbstractC1078a abstractC1078a, Supplier supplier, boolean z10) {
        return new C1137l3(abstractC1078a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final boolean K0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        IntConsumer j;
        boolean zE;
        j$.util.Z zT0 = T0(spliterator);
        if (interfaceC1136l2 instanceof IntConsumer) {
            j = (IntConsumer) interfaceC1136l2;
        } else {
            if (G3.f18264a) {
                G3.a(AbstractC1078a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC1136l2);
            j = new j$.util.J(interfaceC1136l2, 1);
        }
        do {
            zE = interfaceC1136l2.e();
            if (zE) {
                break;
            }
        } while (zT0.tryAdvance(j));
        return zE;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final InterfaceC1198y0 A0(long j, IntFunction intFunction) {
        return AbstractC1184v1.s0(j);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final j$.util.M iterator() {
        j$.util.Z zSpliterator = spliterator();
        Objects.requireNonNull(zSpliterator);
        return new j$.util.i0(zSpliterator);
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final j$.util.Z spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC1139m0 asLongStream() {
        return new C1172t(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C asDoubleStream() {
        return new C1182v(this, 0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C1158q(this, 0, new C1148o(12), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new C1167s(this, Y2.f18407p | Y2.f18405n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C1158q(this, Y2.f18407p | Y2.f18405n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC1139m0 l() {
        Objects.requireNonNull(null);
        return new C1172t(this, Y2.f18407p | Y2.f18405n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final C g() {
        Objects.requireNonNull(null);
        return new C1182v(this, Y2.f18407p | Y2.f18405n, 3);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) H0(new L1(Z2.INT_VALUE, intBinaryOperator, i10))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream s(K k7) {
        Objects.requireNonNull(k7);
        return new U(this, Y2.f18407p | Y2.f18405n | Y2.f18411t, k7, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.D) H0(new C1199y1(Z2.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C1167s(this, Y2.f18411t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new U(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1184v1.x0(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1184v1.x0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(null);
        return new E2(this, Y3.f18419a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(null);
        return new E2(this, Y3.f18420b, 2);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) H0(new C1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC1096d2) boxed()).distinct().mapToInt(new C1148o(11));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C1148o(16));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D min() {
        return reduce(new C1148o(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.D max() {
        return reduce(new C1148o(17));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.C average() {
        long[] jArr = (long[]) collect(new C1148o(18), new C1148o(19), new C1148o(20));
        long j = jArr[0];
        return j > 0 ? new j$.util.C(jArr[1] / j) : j$.util.C.f18045c;
    }

    @Override // j$.util.stream.IntStream
    public final C1211y summaryStatistics() {
        return (C1211y) collect(new j$.time.f(13), new C1148o(14), new C1148o(15));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C1143n c1143n = new C1143n(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c1143n);
        return H0(new A1(Z2.INT_VALUE, c1143n, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean y() {
        return ((Boolean) H0(AbstractC1184v1.w0(EnumC1173t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean q() {
        return ((Boolean) H0(AbstractC1184v1.w0(EnumC1173t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean t() {
        return ((Boolean) H0(AbstractC1184v1.w0(EnumC1173t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC1184v1.p0((C0) I0(new C1148o(10))).b();
    }
}
