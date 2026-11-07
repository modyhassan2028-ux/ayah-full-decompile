package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1081a2 extends AbstractC1096d2 {
    @Override // j$.util.stream.AbstractC1096d2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.f18422h.f18431r) {
            R0().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC1096d2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.f18422h.f18431r) {
            R0().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g unordered() {
        return !Y2.ORDERED.v(this.f18426m) ? this : new Z1(this, Y2.f18409r);
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
