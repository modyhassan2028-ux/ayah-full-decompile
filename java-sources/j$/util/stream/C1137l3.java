package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1137l3 extends AbstractC1082a3 implements j$.util.Z {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1082a3
    public final AbstractC1082a3 e(Spliterator spliterator) {
        return new C1137l3(this.f18433b, spliterator, this.f18432a);
    }

    @Override // j$.util.stream.AbstractC1082a3
    public final void d() {
        Q2 q10 = new Q2();
        this.f18438h = q10;
        Objects.requireNonNull(q10);
        this.f18436e = this.f18433b.F0(new C1132k3(q10, 1));
        this.f18437f = new C1076q(11, this);
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final j$.util.Z trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.Z) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i10;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            Q2 q10 = (Q2) this.f18438h;
            long j = this.g;
            int iR = q10.r(j);
            if (q10.f18448c == 0 && iR == 0) {
                i10 = ((int[]) q10.f18373e)[(int) j];
            } else {
                i10 = ((int[][]) q10.f18374f)[iR][(int) (j - q10.f18449d[iR])];
            }
            intConsumer.accept(i10);
        }
        return zA;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f18438h == null && !this.f18439i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            C1132k3 c1132k3 = new C1132k3(intConsumer, 0);
            this.f18433b.E0(this.f18435d, c1132k3);
            this.f18439i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
