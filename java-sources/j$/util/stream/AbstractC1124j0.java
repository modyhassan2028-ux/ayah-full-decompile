package j$.util.stream;

import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1124j0 extends AbstractC1078a implements InterfaceC1139m0 {
    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.E findAny() {
        return (j$.util.E) H0(G.f18258d);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.E findFirst() {
        return (j$.util.E) H0(G.f18257c);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 sorted() {
        return new F2(this, Y2.f18408q | Y2.f18406o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        H0(new N(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        H0(new N(longConsumer, true));
    }

    public static j$.util.c0 T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.c0) {
            return (j$.util.c0) spliterator;
        }
        if (G3.f18264a) {
            G3.a(AbstractC1078a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Z2 L0() {
        return Z2.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 J0(AbstractC1078a abstractC1078a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC1184v1.e0(abstractC1078a, spliterator, z10);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator S0(AbstractC1078a abstractC1078a, Supplier supplier, boolean z10) {
        return new C1147n3(abstractC1078a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final boolean K0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        LongConsumer n6;
        boolean zE;
        j$.util.c0 c0VarT0 = T0(spliterator);
        if (interfaceC1136l2 instanceof LongConsumer) {
            n6 = (LongConsumer) interfaceC1136l2;
        } else {
            if (G3.f18264a) {
                G3.a(AbstractC1078a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC1136l2);
            n6 = new j$.util.N(interfaceC1136l2, 1);
        }
        do {
            zE = interfaceC1136l2.e();
            if (zE) {
                break;
            }
        } while (c0VarT0.tryAdvance(n6));
        return zE;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final InterfaceC1198y0 A0(long j, IntFunction intFunction) {
        return AbstractC1184v1.t0(j);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final j$.util.Q iterator() {
        j$.util.c0 c0VarSpliterator = spliterator();
        Objects.requireNonNull(c0VarSpliterator);
        return new j$.util.j0(c0VarSpliterator);
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final j$.util.c0 spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final C asDoubleStream() {
        return new C1182v(this, Y2.f18405n, 4);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final Stream boxed() {
        return new C1158q(this, 0, new C1148o(26), 2);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 e() {
        Objects.requireNonNull(null);
        return new C1172t(this, Y2.f18407p | Y2.f18405n, 3);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C1158q(this, Y2.f18407p | Y2.f18405n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final IntStream B() {
        Objects.requireNonNull(null);
        return new C1167s(this, Y2.f18407p | Y2.f18405n, 4);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final C k() {
        Objects.requireNonNull(null);
        return new C1182v(this, Y2.f18407p | Y2.f18405n, 5);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 d(C1076q c1076q) {
        Objects.requireNonNull(c1076q);
        return new C1104f0(this, Y2.f18407p | Y2.f18405n | Y2.f18411t, c1076q, 0);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 b() {
        Objects.requireNonNull(null);
        return new C1172t(this, Y2.f18411t, 5);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C1104f0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1184v1.z0(this, 0L, j);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1184v1.z0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 a() {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(null);
        return new F2(this, Y3.f18419a, 1);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 c() {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(null);
        return new F2(this, Y3.f18420b, 2);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 distinct() {
        return ((AbstractC1096d2) boxed()).distinct().mapToLong(new C1148o(23));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final long sum() {
        return reduce(0L, new C1084b0(1));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.E min() {
        return reduce(new C1148o(22));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.E max() {
        return reduce(new C1084b0(0));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.C average() {
        long[] jArr = (long[]) collect(new C1148o(27), new C1148o(28), new C1148o(29));
        long j = jArr[0];
        return j > 0 ? new j$.util.C(jArr[1] / j) : j$.util.C.f18045c;
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) H0(new C1189w1(Z2.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.A summaryStatistics() {
        return (j$.util.A) collect(new j$.time.f(14), new C1148o(21), new C1148o(24));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C1143n c1143n = new C1143n(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c1143n);
        return H0(new A1(Z2.LONG_VALUE, c1143n, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final boolean r() {
        return ((Boolean) H0(AbstractC1184v1.y0(EnumC1173t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.E) H0(new C1199y1(Z2.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final boolean x() {
        return ((Boolean) H0(AbstractC1184v1.y0(EnumC1173t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final boolean n() {
        return ((Boolean) H0(AbstractC1184v1.y0(EnumC1173t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final long[] toArray() {
        return (long[]) AbstractC1184v1.q0((E0) I0(new C1148o(25))).b();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final long count() {
        return ((Long) H0(new C1(0))).longValue();
    }
}
