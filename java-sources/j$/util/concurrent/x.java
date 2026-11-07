package j$.util.concurrent;

import j$.util.AbstractC1062c;
import j$.util.Z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18138d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public x(long j, long j10, int i10, int i11) {
        this.f18135a = j;
        this.f18136b = j10;
        this.f18137c = i10;
        this.f18138d = i11;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x trySplit() {
        long j = this.f18135a;
        long j10 = (this.f18136b + j) >>> 1;
        if (j10 <= j) {
            return null;
        }
        this.f18135a = j10;
        return new x(j, j10, this.f18137c, this.f18138d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18136b - this.f18135a;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f18135a;
        if (j >= this.f18136b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.f18137c, this.f18138d));
        this.f18135a = j + 1;
        return true;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f18135a;
        long j10 = this.f18136b;
        if (j < j10) {
            this.f18135a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.b(this.f18137c, this.f18138d));
                j++;
            } while (j < j10);
        }
    }
}
