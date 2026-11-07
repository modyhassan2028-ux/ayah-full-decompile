package j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class J3 extends AbstractC1106f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18298b;

    public J3(E2 e10, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18298b = true;
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18469a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        if (this.f18298b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i10);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return !this.f18298b || this.f18469a.e();
    }
}
