package j$.util.stream;

import j$.util.C1076q;
import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1177u extends AbstractC1101e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.F f18557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f18558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177u(r rVar, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18558d = rVar;
        InterfaceC1136l2 interfaceC1136l3 = this.f18464a;
        Objects.requireNonNull(interfaceC1136l3);
        this.f18557c = new j$.util.F(interfaceC1136l3, 1);
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18464a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) throws Exception {
        C c10 = (C) ((C1076q) this.f18558d.f18530t).apply(d5);
        if (c10 != null) {
            try {
                boolean z10 = this.f18556b;
                j$.util.F f3 = this.f18557c;
                if (!z10) {
                    c10.sequential().forEach(f3);
                } else {
                    j$.util.W wSpliterator = c10.sequential().spliterator();
                    while (!this.f18464a.e() && wSpliterator.tryAdvance((DoubleConsumer) f3)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    c10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c10 != null) {
            c10.close();
        }
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        this.f18556b = true;
        return this.f18464a.e();
    }
}
