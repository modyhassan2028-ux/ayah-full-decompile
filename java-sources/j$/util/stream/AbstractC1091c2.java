package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1091c2 extends AbstractC1096d2 {
    @Override // j$.util.stream.AbstractC1078a
    public final boolean O0() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final InterfaceC1108g unordered() {
        return !Y2.ORDERED.v(this.f18426m) ? this : new Z1(this, Y2.f18409r);
    }
}
