package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18198d;

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

    public m0(double[] dArr, int i10, int i11, int i12) {
        this.f18195a = dArr;
        this.f18196b = i10;
        this.f18197c = i11;
        this.f18198d = i12 | 16448;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final W trySplit() {
        int i10 = this.f18196b;
        int i11 = (this.f18197c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f18196b = i11;
        return new m0(this.f18195a, i10, i11, this.f18198d);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i10;
        doubleConsumer.getClass();
        double[] dArr = this.f18195a;
        int length = dArr.length;
        int i11 = this.f18197c;
        if (length < i11 || (i10 = this.f18196b) < 0) {
            return;
        }
        this.f18196b = i11;
        if (i10 < i11) {
            do {
                doubleConsumer.accept(dArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i10 = this.f18196b;
        if (i10 < 0 || i10 >= this.f18197c) {
            return false;
        }
        this.f18196b = i10 + 1;
        doubleConsumer.accept(this.f18195a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18197c - this.f18196b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18198d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC1062c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
