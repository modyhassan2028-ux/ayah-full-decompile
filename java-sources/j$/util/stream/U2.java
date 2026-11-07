package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class U2 extends AbstractC1088c implements Iterable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f18374f;

    public abstract Object newArray(int i10);

    public abstract void p(Object obj, int i10, int i11, Object obj2);

    public abstract int q(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract Object[] t();

    public U2(int i10) {
        super(i10);
        this.f18373e = newArray(1 << this.f18446a);
    }

    public U2() {
        this.f18373e = newArray(16);
    }

    public final void s(long j) {
        long jQ;
        int i10 = this.f18448c;
        if (i10 == 0) {
            jQ = q(this.f18373e);
        } else {
            jQ = ((long) q(this.f18374f[i10])) + this.f18449d[i10];
        }
        if (j > jQ) {
            if (this.f18374f == null) {
                Object[] objArrT = t();
                this.f18374f = objArrT;
                this.f18449d = new long[8];
                objArrT[0] = this.f18373e;
            }
            int i11 = this.f18448c + 1;
            while (j > jQ) {
                Object[] objArr = this.f18374f;
                if (i11 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f18374f = Arrays.copyOf(objArr, length);
                    this.f18449d = Arrays.copyOf(this.f18449d, length);
                }
                int iMin = this.f18446a;
                if (i11 != 0 && i11 != 1) {
                    iMin = Math.min((iMin + i11) - 1, 30);
                }
                int i12 = 1 << iMin;
                this.f18374f[i11] = newArray(i12);
                long[] jArr = this.f18449d;
                int i13 = i11 - 1;
                jArr[i11] = jArr[i13] + ((long) q(this.f18374f[i13]));
                jQ += (long) i12;
                i11++;
            }
        }
    }

    public final int r(long j) {
        if (this.f18448c == 0) {
            if (j < this.f18447b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i10 = 0; i10 <= this.f18448c; i10++) {
            if (j < this.f18449d[i10] + ((long) q(this.f18374f[i10]))) {
                return i10;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public void f(int i10, Object obj) {
        long j = i10;
        long jCount = count() + j;
        if (jCount > q(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f18448c == 0) {
            System.arraycopy(this.f18373e, 0, obj, i10, this.f18447b);
            return;
        }
        for (int i11 = 0; i11 < this.f18448c; i11++) {
            Object obj2 = this.f18374f[i11];
            System.arraycopy(obj2, 0, obj, i10, q(obj2));
            i10 += q(this.f18374f[i11]);
        }
        int i12 = this.f18447b;
        if (i12 > 0) {
            System.arraycopy(this.f18373e, 0, obj, i10, i12);
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        f(0, objNewArray);
        return objNewArray;
    }

    public final void u() {
        long jQ;
        if (this.f18447b == q(this.f18373e)) {
            if (this.f18374f == null) {
                Object[] objArrT = t();
                this.f18374f = objArrT;
                this.f18449d = new long[8];
                objArrT[0] = this.f18373e;
            }
            int i10 = this.f18448c;
            int i11 = i10 + 1;
            Object[] objArr = this.f18374f;
            if (i11 >= objArr.length || objArr[i11] == null) {
                if (i10 == 0) {
                    jQ = q(this.f18373e);
                } else {
                    jQ = ((long) q(objArr[i10])) + this.f18449d[i10];
                }
                s(jQ + 1);
            }
            this.f18447b = 0;
            int i12 = this.f18448c + 1;
            this.f18448c = i12;
            this.f18373e = this.f18374f[i12];
        }
    }

    @Override // j$.util.stream.AbstractC1088c
    public final void clear() {
        Object[] objArr = this.f18374f;
        if (objArr != null) {
            this.f18373e = objArr[0];
            this.f18374f = null;
            this.f18449d = null;
        }
        this.f18447b = 0;
        this.f18448c = 0;
    }

    public void g(Object obj) {
        for (int i10 = 0; i10 < this.f18448c; i10++) {
            Object obj2 = this.f18374f[i10];
            p(obj2, 0, q(obj2), obj);
        }
        p(this.f18373e, 0, this.f18447b, obj);
    }
}
