package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class M2 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f18323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ V2 f18324f;

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

    public M2(V2 v10, int i10, int i11, int i12, int i13) {
        this.f18324f = v10;
        this.f18319a = i10;
        this.f18320b = i11;
        this.f18321c = i12;
        this.f18322d = i13;
        Object[][] objArr = v10.f18379f;
        this.f18323e = objArr == null ? v10.f18378e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f18319a;
        int i11 = this.f18322d;
        int i12 = this.f18320b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f18321c);
        }
        long[] jArr = this.f18324f.f18449d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f18321c);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f18319a;
        int i11 = this.f18320b;
        if (i10 >= i11 && (i10 != i11 || this.f18321c >= this.f18322d)) {
            return false;
        }
        Object[] objArr = this.f18323e;
        int i12 = this.f18321c;
        this.f18321c = i12 + 1;
        consumer.n(objArr[i12]);
        if (this.f18321c == this.f18323e.length) {
            this.f18321c = 0;
            int i13 = this.f18319a + 1;
            this.f18319a = i13;
            Object[][] objArr2 = this.f18324f.f18379f;
            if (objArr2 != null && i13 <= i11) {
                this.f18323e = objArr2[i13];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        V2 v10;
        Objects.requireNonNull(consumer);
        int i10 = this.f18319a;
        int i11 = this.f18322d;
        int i12 = this.f18320b;
        if (i10 < i12 || (i10 == i12 && this.f18321c < i11)) {
            int i13 = this.f18321c;
            while (true) {
                v10 = this.f18324f;
                if (i10 >= i12) {
                    break;
                }
                Object[] objArr = v10.f18379f[i10];
                while (i13 < objArr.length) {
                    consumer.n(objArr[i13]);
                    i13++;
                }
                i10++;
                i13 = 0;
            }
            Object[] objArr2 = this.f18319a == i12 ? this.f18323e : v10.f18379f[i12];
            while (i13 < i11) {
                consumer.n(objArr2[i13]);
                i13++;
            }
            this.f18319a = i12;
            this.f18321c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f18319a;
        int i11 = this.f18320b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f18321c;
            V2 v10 = this.f18324f;
            M2 m10 = new M2(v10, i10, i12, i13, v10.f18379f[i12].length);
            this.f18319a = i11;
            this.f18321c = 0;
            this.f18323e = v10.f18379f[i11];
            return m10;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f18321c;
        int i15 = (this.f18322d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        Object[] objArr = this.f18323e;
        int i16 = i14 + i15;
        j$.util.u0.a(((Object[]) Objects.requireNonNull(objArr)).length, i14, i16);
        j$.util.l0 l0Var = new j$.util.l0(objArr, i14, i16, 1040);
        this.f18321c += i15;
        return l0Var;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
