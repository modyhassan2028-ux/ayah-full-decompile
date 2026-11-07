package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends AbstractC1106f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.J f18383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f18384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(U u8, InterfaceC1136l2 interfaceC1136l2) {
        super(interfaceC1136l2);
        this.f18384d = u8;
        InterfaceC1136l2 interfaceC1136l3 = this.f18469a;
        Objects.requireNonNull(interfaceC1136l3);
        this.f18383c = new j$.util.J(interfaceC1136l3, 1);
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18469a.c(-1L);
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) throws Exception {
        IntStream intStream = (IntStream) ((K) this.f18384d.f18372t).apply(i10);
        if (intStream != null) {
            try {
                boolean z10 = this.f18382b;
                j$.util.J j = this.f18383c;
                if (!z10) {
                    intStream.sequential().forEach(j);
                } else {
                    j$.util.Z zSpliterator = intStream.sequential().spliterator();
                    while (!this.f18469a.e() && zSpliterator.tryAdvance((IntConsumer) j)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        this.f18382b = true;
        return this.f18469a.e();
    }
}
