package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1109g0 extends AbstractC1124j0 {
    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final InterfaceC1139m0 sequential() {
        this.f18422h.f18431r = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final InterfaceC1139m0 parallel() {
        this.f18422h.f18431r = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC1124j0, j$.util.stream.InterfaceC1139m0
    public final void forEach(LongConsumer longConsumer) {
        if (this.f18422h.f18431r) {
            super.forEach(longConsumer);
        } else {
            AbstractC1124j0.T0(R0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1124j0, j$.util.stream.InterfaceC1139m0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.f18422h.f18431r) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC1124j0.T0(R0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g unordered() {
        return !Y2.ORDERED.v(this.f18426m) ? this : new C1172t(this, Y2.f18409r, 4);
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
