package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f18205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18208d;

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

    public r0(int[] iArr, int i10, int i11, int i12) {
        this.f18205a = iArr;
        this.f18206b = i10;
        this.f18207c = i11;
        this.f18208d = i12 | 16448;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final Z trySplit() {
        int i10 = this.f18206b;
        int i11 = (this.f18207c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f18206b = i11;
        return new r0(this.f18205a, i10, i11, this.f18208d);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i10;
        intConsumer.getClass();
        int[] iArr = this.f18205a;
        int length = iArr.length;
        int i11 = this.f18207c;
        if (length < i11 || (i10 = this.f18206b) < 0) {
            return;
        }
        this.f18206b = i11;
        if (i10 < i11) {
            do {
                intConsumer.accept(iArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i10 = this.f18206b;
        if (i10 < 0 || i10 >= this.f18207c) {
            return false;
        }
        this.f18206b = i10 + 1;
        intConsumer.accept(this.f18205a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18207c - this.f18206b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18208d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC1062c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
