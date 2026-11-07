package j$.util.stream;

import j$.util.C1076q;
import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1099e0 extends AbstractC1111g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.N f18462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1104f0 f18463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1099e0(C1104f0 c1104f0, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18463d = c1104f0;
        InterfaceC1136l2 interfaceC1136l3 = this.f18471a;
        Objects.requireNonNull(interfaceC1136l3);
        this.f18462c = new j$.util.N(interfaceC1136l3, 1);
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18471a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC1131k2, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) throws Exception {
        InterfaceC1139m0 interfaceC1139m0 = (InterfaceC1139m0) ((C1076q) this.f18463d.f18468t).apply(j);
        if (interfaceC1139m0 != null) {
            try {
                boolean z10 = this.f18461b;
                j$.util.N n6 = this.f18462c;
                if (!z10) {
                    interfaceC1139m0.sequential().forEach(n6);
                } else {
                    j$.util.c0 c0VarSpliterator = interfaceC1139m0.sequential().spliterator();
                    while (!this.f18471a.e() && c0VarSpliterator.tryAdvance((LongConsumer) n6)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC1139m0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC1139m0 != null) {
            interfaceC1139m0.close();
        }
    }

    @Override // j$.util.stream.AbstractC1111g2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        this.f18461b = true;
        return this.f18471a.e();
    }
}
