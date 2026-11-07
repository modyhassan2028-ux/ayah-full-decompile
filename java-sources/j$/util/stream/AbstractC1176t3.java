package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1176t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f18553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18555e;

    public abstract Spliterator a(Spliterator spliterator, long j, long j10, long j11, long j12);

    public AbstractC1176t3(Spliterator spliterator, long j, long j10, long j11, long j12) {
        this.f18553c = spliterator;
        this.f18551a = j;
        this.f18552b = j10;
        this.f18554d = j11;
        this.f18555e = j12;
    }

    public final Spliterator trySplit() {
        long j = this.f18555e;
        if (this.f18551a >= j || this.f18554d >= j) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f18553c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f18554d;
            long jMin = Math.min(jEstimateSize, this.f18552b);
            long j10 = this.f18551a;
            if (j10 >= jMin) {
                this.f18554d = jMin;
            } else {
                long j11 = this.f18552b;
                if (jMin >= j11) {
                    this.f18553c = spliteratorTrySplit;
                    this.f18555e = jMin;
                } else {
                    long j12 = this.f18554d;
                    if (j12 >= j10 && jEstimateSize <= j11) {
                        this.f18554d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f18554d = jMin;
                    return a(spliteratorTrySplit, j10, j11, j12, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j = this.f18555e;
        long j10 = this.f18551a;
        if (j10 < j) {
            return j - Math.max(j10, this.f18554d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f18553c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m53trySplit() {
        return (j$.util.f0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m51trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m52trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m50trySplit() {
        return (j$.util.W) trySplit();
    }
}
