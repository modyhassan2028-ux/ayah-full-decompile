package I1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class V implements Iterator, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3699t;

    public /* synthetic */ V(int i10, Object obj) {
        this.f3697r = i10;
        this.f3699t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3697r) {
            case 0:
                return this.f3698s < ((ViewGroup) this.f3699t).getChildCount();
            case 1:
                return this.f3698s < ((byte[]) this.f3699t).length;
            case 2:
                return this.f3698s < ((int[]) this.f3699t).length;
            case 3:
                return this.f3698s < ((long[]) this.f3699t).length;
            case 4:
                return this.f3698s < ((short[]) this.f3699t).length;
            case 5:
                return this.f3698s < ((p120l9.d) this.f3699t).b();
            case 6:
                return this.f3698s < ((u.P) this.f3699t).g();
            default:
                return this.f3698s < ((Object[]) this.f3699t).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3697r) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f3699t;
                int i10 = this.f3698s;
                this.f3698s = i10 + 1;
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i11 = this.f3698s;
                byte[] bArr = (byte[]) this.f3699t;
                if (i11 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3698s));
                }
                this.f3698s = i11 + 1;
                return new p110k9.p(bArr[i11]);
            case 2:
                int i12 = this.f3698s;
                int[] iArr = (int[]) this.f3699t;
                if (i12 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3698s));
                }
                this.f3698s = i12 + 1;
                return new p110k9.r(iArr[i12]);
            case 3:
                int i13 = this.f3698s;
                long[] jArr = (long[]) this.f3699t;
                if (i13 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3698s));
                }
                this.f3698s = i13 + 1;
                return new p110k9.t(jArr[i13]);
            case 4:
                int i14 = this.f3698s;
                short[] sArr = (short[]) this.f3699t;
                if (i14 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3698s));
                }
                this.f3698s = i14 + 1;
                return new p110k9.w(sArr[i14]);
            case 5:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                p120l9.d dVar = (p120l9.d) this.f3699t;
                int i15 = this.f3698s;
                this.f3698s = i15 + 1;
                return dVar.get(i15);
            case 6:
                u.P p10 = (u.P) this.f3699t;
                int i16 = this.f3698s;
                this.f3698s = i16 + 1;
                return p10.h(i16);
            default:
                try {
                    Object[] objArr = (Object[]) this.f3699t;
                    int i17 = this.f3698s;
                    this.f3698s = i17 + 1;
                    return objArr[i17];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f3698s--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3697r) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f3699t;
                int i10 = this.f3698s - 1;
                this.f3698s = i10;
                viewGroup.removeViewAt(i10);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public V(Object[] objArr) {
        this.f3697r = 7;
        p251z9.j.e(objArr, "array");
        this.f3699t = objArr;
    }
}
