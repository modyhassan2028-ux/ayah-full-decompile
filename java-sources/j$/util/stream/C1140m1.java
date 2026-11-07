package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1140m1 extends S2 implements E0, InterfaceC1193x0 {
    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1193x0, j$.util.stream.InterfaceC1198y0
    public final E0 build() {
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
        return AbstractC1184v1.V(this, j, j10);
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC1184v1.M(this, intFunction);
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
        AbstractC1184v1.P(this, (Long[]) objArr, i10);
    }

    @Override // j$.util.stream.U2, j$.util.stream.F0
    public final void f(int i10, Object obj) {
        super.f(i10, (long[]) obj);
    }

    @Override // j$.util.stream.U2, j$.util.stream.F0
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // j$.util.stream.S2, j$.util.stream.U2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.S2, j$.util.stream.U2, java.lang.Iterable
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
        return (long[]) super.b();
    }
}
