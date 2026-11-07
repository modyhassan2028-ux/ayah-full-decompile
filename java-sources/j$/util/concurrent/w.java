package j$.util.concurrent;

import j$.util.AbstractC1062c;
import j$.util.W;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f18133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f18134d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.a(this, consumer);
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
        return AbstractC1062c.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public w(long j, long j10, double d5, double d9) {
        this.f18131a = j;
        this.f18132b = j10;
        this.f18133c = d5;
        this.f18134d = d9;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w trySplit() {
        long j = this.f18131a;
        long j10 = (this.f18132b + j) >>> 1;
        if (j10 <= j) {
            return null;
        }
        this.f18131a = j10;
        return new w(j, j10, this.f18133c, this.f18134d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18132b - this.f18131a;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f18131a;
        if (j >= this.f18132b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.f18133c, this.f18134d));
        this.f18131a = j + 1;
        return true;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f18131a;
        long j10 = this.f18132b;
        if (j < j10) {
            this.f18131a = j10;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.a(this.f18133c, this.f18134d));
                j++;
            } while (j < j10);
        }
    }
}
