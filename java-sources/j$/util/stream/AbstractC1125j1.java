package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1125j1 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G0 f18483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f18485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f18486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Deque f18487e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public AbstractC1125j1(G0 g10) {
        this.f18483a = g10;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iO = this.f18483a.o();
        while (true) {
            iO--;
            if (iO < this.f18484b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f18483a.a(iO));
        }
    }

    public static G0 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            G0 g10 = (G0) arrayDeque.pollFirst();
            if (g10 == null) {
                return null;
            }
            if (g10.o() != 0) {
                for (int iO = g10.o() - 1; iO >= 0; iO--) {
                    arrayDeque.addFirst(g10.a(iO));
                }
            } else if (g10.count() > 0) {
                return g10;
            }
        }
    }

    public final boolean c() {
        if (this.f18483a == null) {
            return false;
        }
        if (this.f18486d != null) {
            return true;
        }
        Spliterator spliterator = this.f18485c;
        if (spliterator == null) {
            Deque dequeB = b();
            this.f18487e = dequeB;
            G0 g0A = a(dequeB);
            if (g0A != null) {
                this.f18486d = g0A.spliterator();
                return true;
            }
            this.f18483a = null;
            return false;
        }
        this.f18486d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        G0 g10 = this.f18483a;
        if (g10 == null || this.f18486d != null) {
            return null;
        }
        Spliterator spliterator = this.f18485c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f18484b < g10.o() - 1) {
            G0 g11 = this.f18483a;
            int i10 = this.f18484b;
            this.f18484b = i10 + 1;
            return g11.a(i10).spliterator();
        }
        G0 g0A = this.f18483a.a(this.f18484b);
        this.f18483a = g0A;
        if (g0A.o() == 0) {
            Spliterator spliterator2 = this.f18483a.spliterator();
            this.f18485c = spliterator2;
            return spliterator2.trySplit();
        }
        G0 g12 = this.f18483a;
        this.f18484b = 1;
        return g12.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f18483a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f18485c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f18484b; i10 < this.f18483a.o(); i10++) {
            jCount += this.f18483a.a(i10).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }
}
