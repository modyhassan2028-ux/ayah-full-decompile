package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f18189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18192d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    public l0(Object[] objArr, int i10, int i11, int i12) {
        this.f18189a = objArr;
        this.f18190b = i10;
        this.f18191c = i11;
        this.f18192d = i12 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f18190b;
        int i11 = (this.f18191c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f18190b = i11;
        return new l0(this.f18189a, i10, i11, this.f18192d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        Object[] objArr = this.f18189a;
        int length = objArr.length;
        int i11 = this.f18191c;
        if (length < i11 || (i10 = this.f18190b) < 0) {
            return;
        }
        this.f18190b = i11;
        if (i10 < i11) {
            do {
                consumer.accept(objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f18190b;
        if (i10 < 0 || i10 >= this.f18191c) {
            return false;
        }
        this.f18190b = i10 + 1;
        consumer.accept(this.f18189a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18191c - this.f18190b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18192d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (AbstractC1062c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
