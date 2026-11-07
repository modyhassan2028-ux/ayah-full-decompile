package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1187w extends AbstractC1202z {
    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final C sequential() {
        this.f18422h.f18431r = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final C parallel() {
        this.f18422h.f18431r = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC1202z, j$.util.stream.C
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.f18422h.f18431r) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC1202z.T0(R0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC1202z, j$.util.stream.C
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.f18422h.f18431r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC1202z.T0(R0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g unordered() {
        return !Y2.ORDERED.v(this.f18426m) ? this : new C1182v(this, Y2.f18409r, 0);
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
