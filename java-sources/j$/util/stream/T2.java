package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class T2 implements j$.util.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U2 f18368f;

    public abstract void a(int i10, Object obj, Object obj2);

    public abstract j$.util.f0 b(Object obj, int i10, int i11);

    public abstract j$.util.f0 c(int i10, int i11, int i12, int i13);

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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public T2(U2 u8, int i10, int i11, int i12, int i13) {
        this.f18368f = u8;
        this.f18363a = i10;
        this.f18364b = i11;
        this.f18365c = i12;
        this.f18366d = i13;
        Object[] objArr = u8.f18374f;
        this.f18367e = objArr == null ? u8.f18373e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f18363a;
        int i11 = this.f18366d;
        int i12 = this.f18364b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f18365c);
        }
        long[] jArr = this.f18368f.f18449d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f18365c);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.f18363a;
        int i11 = this.f18364b;
        if (i10 >= i11 && (i10 != i11 || this.f18365c >= this.f18366d)) {
            return false;
        }
        Object obj2 = this.f18367e;
        int i12 = this.f18365c;
        this.f18365c = i12 + 1;
        a(i12, obj2, obj);
        int i13 = this.f18365c;
        Object obj3 = this.f18367e;
        U2 u8 = this.f18368f;
        if (i13 == u8.q(obj3)) {
            this.f18365c = 0;
            int i14 = this.f18363a + 1;
            this.f18363a = i14;
            Object[] objArr = u8.f18374f;
            if (objArr != null && i14 <= i11) {
                this.f18367e = objArr[i14];
            }
        }
        return true;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        U2 u8;
        Objects.requireNonNull(obj);
        int i10 = this.f18363a;
        int i11 = this.f18366d;
        int i12 = this.f18364b;
        if (i10 < i12 || (i10 == i12 && this.f18365c < i11)) {
            int i13 = this.f18365c;
            while (true) {
                u8 = this.f18368f;
                if (i10 >= i12) {
                    break;
                }
                Object obj2 = u8.f18374f[i10];
                u8.p(obj2, i13, u8.q(obj2), obj);
                i10++;
                i13 = 0;
            }
            u8.p(this.f18363a == i12 ? this.f18367e : u8.f18374f[i12], i13, i11, obj);
            this.f18363a = i12;
            this.f18365c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        int i10 = this.f18363a;
        int i11 = this.f18364b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f18365c;
            U2 u8 = this.f18368f;
            j$.util.f0 f0VarC = c(i10, i12, i13, u8.q(u8.f18374f[i12]));
            this.f18363a = i11;
            this.f18365c = 0;
            this.f18367e = u8.f18374f[i11];
            return f0VarC;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f18365c;
        int i15 = (this.f18366d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        j$.util.f0 f0VarB = b(this.f18367e, i14, i15);
        this.f18365c += i15;
        return f0VarB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }
}
