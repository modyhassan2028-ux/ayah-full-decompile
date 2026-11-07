package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y extends AbstractC1079a0 {
    @Override // j$.util.stream.AbstractC1078a
    public final boolean O0() {
        return true;
    }

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

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g unordered() {
        return !Y2.ORDERED.v(this.f18426m) ? this : new C1167s(this, Y2.f18409r, 2);
    }

    @Override // j$.util.stream.AbstractC1078a, j$.util.stream.InterfaceC1108g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }
}
