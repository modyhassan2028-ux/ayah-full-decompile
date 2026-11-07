package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1147n3 extends AbstractC1082a3 implements j$.util.c0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1082a3
    public final AbstractC1082a3 e(Spliterator spliterator) {
        return new C1147n3(this.f18433b, spliterator, this.f18432a);
    }

    @Override // j$.util.stream.AbstractC1082a3
    public final void d() {
        S2 s10 = new S2();
        this.f18438h = s10;
        Objects.requireNonNull(s10);
        this.f18436e = this.f18433b.F0(new C1142m3(s10, 1));
        this.f18437f = new C1076q(12, this);
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            S2 s10 = (S2) this.f18438h;
            long j10 = this.g;
            int iR = s10.r(j10);
            if (s10.f18448c == 0 && iR == 0) {
                j = ((long[]) s10.f18373e)[(int) j10];
            } else {
                j = ((long[][]) s10.f18374f)[iR][(int) (j10 - s10.f18449d[iR])];
            }
            longConsumer.accept(j);
        }
        return zA;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f18438h == null && !this.f18439i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C1142m3 c1142m3 = new C1142m3(longConsumer, 0);
            this.f18433b.E0(this.f18435d, c1142m3);
            this.f18439i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
