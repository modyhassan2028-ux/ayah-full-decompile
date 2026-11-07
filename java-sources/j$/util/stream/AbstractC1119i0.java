package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1119i0 extends AbstractC1124j0 {
    @Override // j$.util.stream.AbstractC1078a
    public final boolean O0() {
        return false;
    }

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

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g unordered() {
        return !Y2.ORDERED.v(this.f18426m) ? this : new C1172t(this, Y2.f18409r, 4);
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
