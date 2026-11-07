package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class U0 extends O2 implements A0, InterfaceC1183v0 {
    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1183v0, j$.util.stream.InterfaceC1198y0
    public final A0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC1198y0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void end() {
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.T(this, j, j10);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC1184v1.M(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        AbstractC1184v1.E(this, d5);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i10) {
        a(i10);
        throw null;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i10) {
        AbstractC1184v1.N(this, (Double[]) objArr, i10);
    }

    @Override // j$.util.stream.U2, j$.util.stream.F0
    public final void f(int i10, Object obj) {
        super.f(i10, (double[]) obj);
    }

    @Override // j$.util.stream.U2, j$.util.stream.F0
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.O2, j$.util.stream.U2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.O2, j$.util.stream.U2, java.lang.Iterable
    public final j$.util.f0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // j$.util.stream.U2, j$.util.stream.F0
    public final Object b() {
        return (double[]) super.b();
    }
}
