package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1166r3 extends AbstractC1176t3 implements j$.util.f0 {
    public abstract Object b();

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public AbstractC1166r3(j$.util.f0 f0Var, long j, long j10) {
        super(f0Var, j, j10, 0L, Math.min(f0Var.estimateSize(), j10));
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        long j;
        Objects.requireNonNull(obj);
        long j10 = this.f18555e;
        long j11 = this.f18551a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j = this.f18554d;
            if (j11 <= j) {
                break;
            }
            ((j$.util.f0) this.f18553c).tryAdvance(b());
            this.f18554d++;
        }
        if (j >= this.f18555e) {
            return false;
        }
        this.f18554d = j + 1;
        return ((j$.util.f0) this.f18553c).tryAdvance(obj);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.f18555e;
        long j10 = this.f18551a;
        if (j10 >= j) {
            return;
        }
        long j11 = this.f18554d;
        if (j11 >= j) {
            return;
        }
        if (j11 >= j10 && ((j$.util.f0) this.f18553c).estimateSize() + j11 <= this.f18552b) {
            ((j$.util.f0) this.f18553c).forEachRemaining(obj);
            this.f18554d = this.f18555e;
            return;
        }
        while (j10 > this.f18554d) {
            ((j$.util.f0) this.f18553c).tryAdvance(b());
            this.f18554d++;
        }
        while (this.f18554d < this.f18555e) {
            ((j$.util.f0) this.f18553c).tryAdvance(obj);
            this.f18554d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
