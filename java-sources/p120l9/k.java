package p120l9;

import android.support.v4.media.session.p;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.internal.OsCollectionChangeSet;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p017b7.g;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class k extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object[] f19435u = new Object[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f19437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19438t;

    public k() {
        this.f19437s = f19435u;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f19438t;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        n();
        e(this.f19438t + 1);
        int iM = m(this.f19436r + i10);
        int i12 = this.f19438t;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iM == 0) {
                Object[] objArr = this.f19437s;
                j.e(objArr, "<this>");
                iM = objArr.length;
            }
            int i13 = iM - 1;
            int i14 = this.f19436r;
            if (i14 == 0) {
                Object[] objArr2 = this.f19437s;
                j.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f19436r;
            if (i13 >= i15) {
                Object[] objArr3 = this.f19437s;
                objArr3[length] = objArr3[i15];
                l.X(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f19437s;
                l.X(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f19437s;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.X(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f19437s[i13] = obj;
            this.f19436r = length;
        } else {
            int iM2 = m(i12 + this.f19436r);
            if (iM < iM2) {
                Object[] objArr6 = this.f19437s;
                l.X(iM + 1, iM, iM2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f19437s;
                l.X(1, 0, iM2, objArr7, objArr7);
                Object[] objArr8 = this.f19437s;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.X(iM + 1, iM, objArr8.length - 1, objArr8, objArr8);
            }
            this.f19437s[iM] = obj;
        }
        this.f19438t++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        j.e(collection, "elements");
        int i11 = this.f19438t;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == this.f19438t) {
            return addAll(collection);
        }
        n();
        e(collection.size() + this.f19438t);
        int iM = m(this.f19438t + this.f19436r);
        int iM2 = m(this.f19436r + i10);
        int size = collection.size();
        if (i10 >= ((this.f19438t + 1) >> 1)) {
            int i12 = iM2 + size;
            if (iM2 < iM) {
                int i13 = size + iM;
                Object[] objArr = this.f19437s;
                if (i13 <= objArr.length) {
                    l.X(i12, iM2, iM, objArr, objArr);
                } else if (i12 >= objArr.length) {
                    l.X(i12 - objArr.length, iM2, iM, objArr, objArr);
                } else {
                    int length = iM - (i13 - objArr.length);
                    l.X(0, length, iM, objArr, objArr);
                    Object[] objArr2 = this.f19437s;
                    l.X(i12, iM2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f19437s;
                l.X(size, 0, iM, objArr3, objArr3);
                Object[] objArr4 = this.f19437s;
                if (i12 >= objArr4.length) {
                    l.X(i12 - objArr4.length, iM2, objArr4.length, objArr4, objArr4);
                } else {
                    l.X(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f19437s;
                    l.X(i12, iM2, objArr5.length - size, objArr5, objArr5);
                }
            }
            d(iM2, collection);
            return true;
        }
        int i14 = this.f19436r;
        int length2 = i14 - size;
        if (iM2 < i14) {
            Object[] objArr6 = this.f19437s;
            l.X(length2, i14, objArr6.length, objArr6, objArr6);
            if (size >= iM2) {
                Object[] objArr7 = this.f19437s;
                l.X(objArr7.length - size, 0, iM2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f19437s;
                l.X(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f19437s;
                l.X(0, size, iM2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f19437s;
            l.X(length2, i14, iM2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f19437s;
            length2 += objArr11.length;
            int i15 = iM2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                l.X(length2, i14, iM2, objArr11, objArr11);
            } else {
                l.X(length2, i14, i14 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f19437s;
                l.X(0, this.f19436r + length3, iM2, objArr12, objArr12);
            }
        }
        this.f19436r = length2;
        d(j(iM2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        e(this.f19438t + 1);
        int length = this.f19436r;
        if (length == 0) {
            Object[] objArr = this.f19437s;
            j.e(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f19436r = i10;
        this.f19437s[i10] = obj;
        this.f19438t++;
    }

    public final void addLast(Object obj) {
        n();
        e(b() + 1);
        this.f19437s[m(b() + this.f19436r)] = obj;
        this.f19438t = b() + 1;
    }

    @Override // p120l9.f
    public final int b() {
        return this.f19438t;
    }

    @Override // p120l9.f
    public final Object c(int i10) {
        int i11 = this.f19438t;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(p.w(i10, i11, "index: ", ", size: "));
        }
        if (i10 == AbstractC0813f2.E(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        n();
        int iM = m(this.f19436r + i10);
        Object[] objArr = this.f19437s;
        Object obj = objArr[iM];
        if (i10 < (this.f19438t >> 1)) {
            int i12 = this.f19436r;
            if (iM >= i12) {
                l.X(i12 + 1, i12, iM, objArr, objArr);
            } else {
                l.X(1, 0, iM, objArr, objArr);
                Object[] objArr2 = this.f19437s;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f19436r;
                l.X(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f19437s;
            int i14 = this.f19436r;
            objArr3[i14] = null;
            this.f19436r = g(i14);
        } else {
            int iM2 = m(AbstractC0813f2.E(this) + this.f19436r);
            if (iM <= iM2) {
                Object[] objArr4 = this.f19437s;
                l.X(iM, iM + 1, iM2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f19437s;
                l.X(iM, iM + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f19437s;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.X(0, 1, iM2 + 1, objArr6, objArr6);
            }
            this.f19437s[iM2] = null;
        }
        this.f19438t--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f19436r, m(b() + this.f19436r));
        }
        this.f19436r = 0;
        this.f19438t = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f19437s.length;
        while (i10 < length && it.hasNext()) {
            this.f19437s[i10] = it.next();
            i10++;
        }
        int i11 = this.f19436r;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f19437s[i12] = it.next();
        }
        this.f19438t = collection.size() + this.f19438t;
    }

    public final void e(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f19437s;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f19435u) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f19437s = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - OsCollectionChangeSet.MAX_ARRAY_LENGTH > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        l.X(0, this.f19436r, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f19437s;
        int length2 = objArr3.length;
        int i12 = this.f19436r;
        l.X(length2 - i12, 0, i12, objArr3, objArr2);
        this.f19436r = 0;
        this.f19437s = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.f19437s[this.f19436r];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19437s[this.f19436r];
    }

    public final int g(int i10) {
        Object[] objArr = this.f19437s;
        j.e(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iB = b();
        if (i10 < 0 || i10 >= iB) {
            throw new IndexOutOfBoundsException(p.w(i10, iB, "index: ", ", size: "));
        }
        return this.f19437s[m(this.f19436r + i10)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.f19437s[m(AbstractC0813f2.E(this) + this.f19436r)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iM = m(b() + this.f19436r);
        int length = this.f19436r;
        if (length < iM) {
            while (length < iM) {
                if (j.a(obj, this.f19437s[length])) {
                    i10 = this.f19436r;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM) {
            return -1;
        }
        int length2 = this.f19437s.length;
        while (length < length2) {
            if (j.a(obj, this.f19437s[length])) {
                i10 = this.f19436r;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iM; i11++) {
            if (j.a(obj, this.f19437s[i11])) {
                length = i11 + this.f19437s.length;
                i10 = this.f19436r;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final int j(int i10) {
        return i10 < 0 ? i10 + this.f19437s.length : i10;
    }

    public final void l(int i10, int i11) {
        if (i10 < i11) {
            l.e0(i10, i11, null, this.f19437s);
            return;
        }
        Object[] objArr = this.f19437s;
        l.e0(i10, objArr.length, null, objArr);
        l.e0(0, i11, null, this.f19437s);
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19437s[m(AbstractC0813f2.E(this) + this.f19436r)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iM = m(this.f19438t + this.f19436r);
        int i11 = this.f19436r;
        if (i11 < iM) {
            length = iM - 1;
            if (i11 <= length) {
                while (!j.a(obj, this.f19437s[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f19436r;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iM) {
            for (int i12 = iM - 1; -1 < i12; i12--) {
                if (j.a(obj, this.f19437s[i12])) {
                    length = i12 + this.f19437s.length;
                    i10 = this.f19436r;
                    return length - i10;
                }
            }
            Object[] objArr = this.f19437s;
            j.e(objArr, "<this>");
            length = objArr.length - 1;
            int i13 = this.f19436r;
            if (i13 <= length) {
                while (!j.a(obj, this.f19437s[length])) {
                    if (length != i13) {
                        length--;
                    }
                }
                i10 = this.f19436r;
                return length - i10;
            }
        }
        return -1;
    }

    public final int m(int i10) {
        Object[] objArr = this.f19437s;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM;
        j.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f19437s.length != 0) {
            int iM2 = m(b() + this.f19436r);
            int i10 = this.f19436r;
            if (i10 < iM2) {
                iM = i10;
                while (i10 < iM2) {
                    Object obj = this.f19437s[i10];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f19437s[iM] = obj;
                        iM++;
                    }
                    i10++;
                }
                l.e0(iM, iM2, null, this.f19437s);
            } else {
                int length = this.f19437s.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f19437s;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f19437s[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iM = m(i11);
                for (int i12 = 0; i12 < iM2; i12++) {
                    Object[] objArr2 = this.f19437s;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f19437s[iM] = obj3;
                        iM = g(iM);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                n();
                this.f19438t = j(iM - this.f19436r);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.f19437s;
        int i10 = this.f19436r;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f19436r = g(i10);
        this.f19438t = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int iM = m(AbstractC0813f2.E(this) + this.f19436r);
        Object[] objArr = this.f19437s;
        Object obj = objArr[iM];
        objArr[iM] = null;
        this.f19438t = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        g.T(i10, i11, this.f19438t);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f19438t) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i10);
            return;
        }
        n();
        if (i10 < this.f19438t - i11) {
            int iM = m(this.f19436r + (i10 - 1));
            int iM2 = m(this.f19436r + (i11 - 1));
            while (i10 > 0) {
                int i13 = iM + 1;
                int iMin = Math.min(i10, Math.min(i13, iM2 + 1));
                Object[] objArr = this.f19437s;
                int i14 = iM2 - iMin;
                int i15 = iM - iMin;
                l.X(i14 + 1, i15 + 1, i13, objArr, objArr);
                iM = j(i15);
                iM2 = j(i14);
                i10 -= iMin;
            }
            int iM3 = m(this.f19436r + i12);
            l(this.f19436r, iM3);
            this.f19436r = iM3;
        } else {
            int iM4 = m(this.f19436r + i11);
            int iM5 = m(this.f19436r + i10);
            int i16 = this.f19438t;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f19437s;
                i11 = Math.min(i16, Math.min(objArr2.length - iM4, objArr2.length - iM5));
                Object[] objArr3 = this.f19437s;
                int i17 = iM4 + i11;
                l.X(iM5, iM4, i17, objArr3, objArr3);
                iM4 = m(i17);
                iM5 = m(iM5 + i11);
            }
            int iM6 = m(this.f19438t + this.f19436r);
            l(j(iM6 - i12), iM6);
        }
        this.f19438t -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM;
        j.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f19437s.length != 0) {
            int iM2 = m(b() + this.f19436r);
            int i10 = this.f19436r;
            if (i10 < iM2) {
                iM = i10;
                while (i10 < iM2) {
                    Object obj = this.f19437s[i10];
                    if (collection.contains(obj)) {
                        this.f19437s[iM] = obj;
                        iM++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                l.e0(iM, iM2, null, this.f19437s);
            } else {
                int length = this.f19437s.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f19437s;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f19437s[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iM = m(i11);
                for (int i12 = 0; i12 < iM2; i12++) {
                    Object[] objArr2 = this.f19437s;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f19437s[iM] = obj3;
                        iM = g(iM);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                n();
                this.f19438t = j(iM - this.f19436r);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iB = b();
        if (i10 < 0 || i10 >= iB) {
            throw new IndexOutOfBoundsException(p.w(i10, iB, "index: ", ", size: "));
        }
        int iM = m(this.f19436r + i10);
        Object[] objArr = this.f19437s;
        Object obj2 = objArr[iM];
        objArr[iM] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    public k(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f19435u;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(c.r(i10, "Illegal Capacity: "));
        }
        this.f19437s = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f19438t;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            j.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM = m(this.f19438t + this.f19436r);
        int i11 = this.f19436r;
        if (i11 < iM) {
            l.b0(i11, iM, 2, this.f19437s, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f19437s;
            l.X(0, this.f19436r, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f19437s;
            l.X(objArr3.length - this.f19436r, 0, iM, objArr3, objArr);
        }
        int i12 = this.f19438t;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n();
        e(collection.size() + b());
        d(m(b() + this.f19436r), collection);
        return true;
    }
}
