package j$.util.concurrent;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends p implements Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f18098i;
    public long j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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

    public f(l[] lVarArr, int i10, int i11, int i12, long j, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i10, i11, i12);
        this.f18098i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f18118f;
        int i11 = this.g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        l[] lVarArr = this.f18113a;
        this.g = i12;
        long j = this.j >>> 1;
        this.j = j;
        return new f(lVarArr, this.f18119h, i12, i11, j, this.f18098i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l lVarA = a();
            if (lVarA == null) {
                return;
            } else {
                consumer.n(new k(lVarA.f18106b, lVarA.f18107c, this.f18098i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l lVarA = a();
        if (lVarA == null) {
            return false;
        }
        consumer.n(new k(lVarA.f18106b, lVarA.f18107c, this.f18098i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }
}
