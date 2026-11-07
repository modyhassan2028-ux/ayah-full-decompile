package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends AbstractC1079a0 {
    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final IntStream sequential() {
        this.f18422h.f18431r = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final IntStream parallel() {
        this.f18422h.f18431r = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC1079a0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.f18422h.f18431r) {
            super.forEach(intConsumer);
        } else {
            AbstractC1079a0.T0(R0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1079a0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.f18422h.f18431r) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC1079a0.T0(R0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g unordered() {
        return !Y2.ORDERED.v(this.f18426m) ? this : new C1167s(this, Y2.f18409r, 2);
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC1078a
    public final boolean O0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1078a
    public final InterfaceC1136l2 P0(int i10, InterfaceC1136l2 interfaceC1136l2) {
        throw new UnsupportedOperationException();
    }
}
