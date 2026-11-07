package j$.util;

import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1060a implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f18072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18074c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C1060a(java.util.List list) {
        this.f18072a = list;
        this.f18073b = 0;
        this.f18074c = -1;
    }

    public C1060a(C1060a c1060a, int i10, int i11) {
        this.f18072a = c1060a.f18072a;
        this.f18073b = i10;
        this.f18074c = i11;
    }

    public final int a() {
        java.util.List list = this.f18072a;
        int i10 = this.f18074c;
        if (i10 >= 0) {
            return i10;
        }
        int size = list.size();
        this.f18074c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int iA = a();
        int i10 = this.f18073b;
        int i11 = (iA + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f18073b = i11;
        return new C1060a(this, i10, i11);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int iA = a();
        int i10 = this.f18073b;
        if (i10 >= iA) {
            return false;
        }
        this.f18073b = i10 + 1;
        try {
            consumer.accept(this.f18072a.get(i10));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.f18072a;
        int iA = a();
        this.f18073b = iA;
        for (int i10 = this.f18073b; i10 < iA; i10++) {
            try {
                consumer.accept(list.get(i10));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f18073b;
    }
}
