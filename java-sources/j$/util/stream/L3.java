package j$.util.stream;

import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class L3 extends AbstractC1111g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18312b;

    public L3(F2 f3, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18312b = true;
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18471a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC1131k2, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        if (this.f18312b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return !this.f18312b || this.f18471a.e();
    }
}
