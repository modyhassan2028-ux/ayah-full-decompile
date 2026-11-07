package j$.util.concurrent;

import j$.util.AbstractC1062c;
import j$.util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18142d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.c(this, consumer);
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
        return AbstractC1062c.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public y(long j, long j10, long j11, long j12) {
        this.f18139a = j;
        this.f18140b = j10;
        this.f18141c = j11;
        this.f18142d = j12;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j = this.f18139a;
        long j10 = (this.f18140b + j) >>> 1;
        if (j10 <= j) {
            return null;
        }
        this.f18139a = j10;
        return new y(j, j10, this.f18141c, this.f18142d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18140b - this.f18139a;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f18139a;
        if (j >= this.f18140b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.f18141c, this.f18142d));
        this.f18139a = j + 1;
        return true;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f18139a;
        long j10 = this.f18140b;
        if (j < j10) {
            this.f18139a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.c(this.f18141c, this.f18142d));
                j++;
            } while (j < j10);
        }
    }
}
