package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f18224e;

    public abstract Spliterator b(Spliterator spliterator);

    public A3(Spliterator spliterator, long j, long j10) {
        this.f18220a = spliterator;
        this.f18221b = j10 < 0;
        this.f18223d = j10 >= 0 ? j10 : 0L;
        this.f18222c = 128;
        this.f18224e = new AtomicLong(j10 >= 0 ? j + j10 : j);
    }

    public A3(Spliterator spliterator, A3 a9) {
        this.f18220a = spliterator;
        this.f18221b = a9.f18221b;
        this.f18224e = a9.f18224e;
        this.f18223d = a9.f18223d;
        this.f18222c = a9.f18222c;
    }

    public final long a(long j) {
        long j10;
        boolean z10;
        long jMin;
        do {
            j10 = this.f18224e.get();
            z10 = this.f18221b;
            if (j10 != 0) {
                jMin = Math.min(j10, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z10) {
                    return j;
                }
                return 0L;
            }
        } while (!this.f18224e.compareAndSet(j10, j10 - jMin));
        if (z10) {
            return Math.max(j - jMin, 0L);
        }
        long j11 = this.f18223d;
        return j10 > j11 ? Math.max(jMin - (j10 - j11), 0L) : jMin;
    }

    public final z3 f() {
        if (this.f18224e.get() > 0) {
            return z3.MAYBE_MORE;
        }
        return this.f18221b ? z3.UNLIMITED : z3.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f18224e.get() == 0 || (spliteratorTrySplit = this.f18220a.trySplit()) == null) {
            return null;
        }
        return b(spliteratorTrySplit);
    }

    public final long estimateSize() {
        return this.f18220a.estimateSize();
    }

    public final int characteristics() {
        return this.f18220a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m49trySplit() {
        return (j$.util.f0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m47trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m48trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m46trySplit() {
        return (j$.util.W) trySplit();
    }
}
