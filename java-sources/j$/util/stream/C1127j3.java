package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1127j3 extends AbstractC1082a3 implements j$.util.W {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1082a3
    public final AbstractC1082a3 e(Spliterator spliterator) {
        return new C1127j3(this.f18433b, spliterator, this.f18432a);
    }

    @Override // j$.util.stream.AbstractC1082a3
    public final void d() {
        O2 o10 = new O2();
        this.f18438h = o10;
        Objects.requireNonNull(o10);
        this.f18436e = this.f18433b.F0(new C1122i3(o10, 1));
        this.f18437f = new C1076q(10, this);
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final j$.util.W trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1082a3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d5;
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            O2 o10 = (O2) this.f18438h;
            long j = this.g;
            int iR = o10.r(j);
            if (o10.f18448c == 0 && iR == 0) {
                d5 = ((double[]) o10.f18373e)[(int) j];
            } else {
                d5 = ((double[][]) o10.f18374f)[iR][(int) (j - o10.f18449d[iR])];
            }
            doubleConsumer.accept(d5);
        }
        return zA;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f18438h == null && !this.f18439i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            C1122i3 c1122i3 = new C1122i3(doubleConsumer, 0);
            this.f18433b.E0(this.f18435d, c1122i3);
            this.f18439i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
