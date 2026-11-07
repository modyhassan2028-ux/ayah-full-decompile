package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class N3 extends AbstractC1101e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18329b;

    public N3(D2 d5, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18329b = true;
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18464a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        if (this.f18329b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d5);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return !this.f18329b || this.f18464a.e();
    }
}
