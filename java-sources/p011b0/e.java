package p011b0;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f13125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f13126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13127t = 0;

    public e(Object[] objArr) {
        this.f13125r = objArr;
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f13127t + 1;
        if (this.f13125r.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f13125r;
        int i12 = this.f13127t;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f13127t++;
    }

    public final void b(Object obj) {
        int i10 = this.f13127t + 1;
        if (this.f13125r.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f13125r;
        int i11 = this.f13127t;
        objArr[i11] = obj;
        this.f13127t = i11 + 1;
    }

    public final void c(int i10, e eVar) {
        int i11 = eVar.f13127t;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f13127t + i11;
        if (this.f13125r.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f13125r;
        int i13 = this.f13127t;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(eVar.f13125r, 0, objArr, i10, i11);
        this.f13127t += i11;
    }

    public final void d(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f13127t + size;
        if (this.f13125r.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f13125r;
        int i12 = this.f13127t;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f13127t += size;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f13127t + size;
        if (this.f13125r.length < i12) {
            n(i12);
        }
        Object[] objArr = this.f13125r;
        int i13 = this.f13127t;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f13127t += size;
        return true;
    }

    public final List f() {
        b bVar = this.f13126s;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f13126s = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f13125r;
        int i10 = this.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f13127t = 0;
    }

    public final boolean h(Object obj) {
        int i10 = this.f13127t - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !j.a(this.f13125r[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f13125r;
        int i10 = this.f13127t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j.a(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        l(iJ);
        return true;
    }

    public final Object l(int i10) {
        Object[] objArr = this.f13125r;
        Object obj = objArr[i10];
        int i11 = this.f13127t;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(objArr, i12, objArr, i10, i11 - i12);
        }
        int i13 = this.f13127t - 1;
        this.f13127t = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void m(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f13127t;
            if (i11 < i12) {
                Object[] objArr = this.f13125r;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f13127t;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f13125r[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f13127t = i14;
        }
    }

    public final void n(int i10) {
        Object[] objArr = this.f13125r;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f13125r = objArr2;
    }

    public final void o(Comparator comparator) {
        Arrays.sort(this.f13125r, 0, this.f13127t, comparator);
    }
}
