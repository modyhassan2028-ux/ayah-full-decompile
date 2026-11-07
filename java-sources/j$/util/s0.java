package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class s0 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Collection f18210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f18211b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18214e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    public s0(int i10, java.util.Collection collection) {
        this.f18210a = collection;
        this.f18212c = i10 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f18211b;
        if (it == null) {
            it = this.f18210a.iterator();
            this.f18211b = it;
            size = this.f18210a.size();
            this.f18213d = size;
        } else {
            size = this.f18213d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f18214e + 1024;
        if (i10 > size) {
            i10 = (int) size;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f18214e = i11;
        long j = this.f18213d;
        if (j != Long.MAX_VALUE) {
            this.f18213d = j - ((long) i11);
        }
        return new l0(objArr, 0, i11, this.f18212c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f18211b;
        if (it == null) {
            it = this.f18210a.iterator();
            this.f18211b = it;
            this.f18213d = this.f18210a.size();
        }
        AbstractC1062c.r(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f18211b == null) {
            this.f18211b = this.f18210a.iterator();
            this.f18213d = this.f18210a.size();
        }
        if (!this.f18211b.hasNext()) {
            return false;
        }
        consumer.accept(this.f18211b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f18211b == null) {
            this.f18211b = this.f18210a.iterator();
            long size = this.f18210a.size();
            this.f18213d = size;
            return size;
        }
        return this.f18213d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18212c;
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (AbstractC1062c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
