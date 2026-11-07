package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1171s3 extends AbstractC1176t3 implements Spliterator {
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

    public C1171s3(Spliterator spliterator, long j, long j10) {
        super(spliterator, j, j10, 0L, Math.min(spliterator.estimateSize(), j10));
    }

    @Override // j$.util.stream.AbstractC1176t3
    public final Spliterator a(Spliterator spliterator, long j, long j10, long j11, long j12) {
        return new C1171s3(spliterator, j, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j;
        Objects.requireNonNull(consumer);
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
            this.f18553c.tryAdvance(new C1084b0(15));
            this.f18554d++;
        }
        if (j >= this.f18555e) {
            return false;
        }
        this.f18554d = j + 1;
        return this.f18553c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.f18555e;
        long j10 = this.f18551a;
        if (j10 >= j) {
            return;
        }
        long j11 = this.f18554d;
        if (j11 >= j) {
            return;
        }
        if (j11 >= j10 && this.f18553c.estimateSize() + j11 <= this.f18552b) {
            this.f18553c.forEachRemaining(consumer);
            this.f18554d = this.f18555e;
            return;
        }
        while (j10 > this.f18554d) {
            this.f18553c.tryAdvance(new C1084b0(16));
            this.f18554d++;
        }
        while (this.f18554d < this.f18555e) {
            this.f18553c.tryAdvance(consumer);
            this.f18554d++;
        }
    }
}
