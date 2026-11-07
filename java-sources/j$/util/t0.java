package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f18597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18600d;

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

    public t0(long[] jArr, int i10, int i11, int i12) {
        this.f18597a = jArr;
        this.f18598b = i10;
        this.f18599c = i11;
        this.f18600d = i12 | 16448;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final c0 trySplit() {
        int i10 = this.f18598b;
        int i11 = (this.f18599c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f18598b = i11;
        return new t0(this.f18597a, i10, i11, this.f18600d);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i10;
        longConsumer.getClass();
        long[] jArr = this.f18597a;
        int length = jArr.length;
        int i11 = this.f18599c;
        if (length < i11 || (i10 = this.f18598b) < 0) {
            return;
        }
        this.f18598b = i11;
        if (i10 < i11) {
            do {
                longConsumer.accept(jArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i10 = this.f18598b;
        if (i10 < 0 || i10 >= this.f18599c) {
            return false;
        }
        this.f18598b = i10 + 1;
        longConsumer.accept(this.f18597a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18599c - this.f18598b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18600d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC1062c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
