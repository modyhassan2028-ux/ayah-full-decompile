package p033d0;

import A9.b;
import I1.V;
import J1.e;
import Z.AbstractC0689j0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p017b7.g;
import p120l9.l;
import p185s8.u0;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p120l9.f implements Collection, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f15535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f15536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f15537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p062g0.b f15539v = new p062g0.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f15540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f15541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15542y;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f15535r = cVar;
        this.f15536s = objArr;
        this.f15537t = objArr2;
        this.f15538u = i10;
        this.f15540w = objArr;
        this.f15541x = objArr2;
        this.f15542y = cVar.b();
    }

    public static void e(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final int A(c cVar, int i10, e eVar) {
        int iZ = z(cVar, this.f15541x, i10, eVar);
        if (iZ == i10) {
            return i10;
        }
        Object obj = eVar.f4215a;
        j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iZ, i10, (Object) null);
        this.f15541x = objArr;
        this.f15542y -= i10 - iZ;
        return iZ;
    }

    public final boolean B(c cVar) {
        Object[] objArrU;
        int i10;
        c cVar2 = cVar;
        int iH = H();
        Object[] objArrR = null;
        e eVar = new e(null);
        boolean z10 = false;
        if (this.f15540w != null) {
            a aVarM = m(0);
            int iZ = 32;
            while (iZ == 32 && aVarM.hasNext()) {
                iZ = z(cVar2, (Object[]) aVarM.next(), 32, eVar);
            }
            if (iZ == 32) {
                int iA = A(cVar2, iH, eVar);
                if (iA == 0) {
                    t(this.f15540w, this.f15542y, this.f15538u);
                }
                if (iA != iH) {
                }
            } else {
                int i11 = (aVarM.f15525r - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iY = iZ;
                while (aVarM.hasNext()) {
                    iY = y(cVar2, (Object[]) aVarM.next(), 32, iY, eVar, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int iY2 = y(cVar, this.f15541x, iH, iY, eVar, arrayList2, arrayList);
                Object obj = eVar.f4215a;
                j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iY2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrU = this.f15540w;
                    j.b(objArrU);
                } else {
                    objArrU = u(this.f15540w, i11, this.f15538u, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC0689j0.a("invalid size");
                }
                if (size == 0) {
                    this.f15538u = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.f15538u;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.f15538u = i10 - 5;
                        Object[] objArr2 = objArrU[0];
                        j.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrU = objArr2;
                    }
                    objArrR = r(objArrU, i12, i10);
                }
                this.f15540w = objArrR;
                this.f15541x = objArr;
                this.f15542y = size + iY2;
            }
            z10 = true;
        } else if (A(cVar2, iH, eVar) != iH) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] C(Object[] objArr, int i10, int i11, e eVar) {
        int iS = u0.s(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iS];
            Object[] objArrN = n(objArr);
            l.X(iS, iS + 1, 32, objArr, objArrN);
            objArrN[31] = eVar.f4215a;
            eVar.f4215a = obj;
            return objArrN;
        }
        int iS2 = objArr[31] == null ? u0.s(E() - 1, i10) : 31;
        Object[] objArrN2 = n(objArr);
        int i12 = i10 - 5;
        int i13 = iS + 1;
        if (i13 <= iS2) {
            while (true) {
                Object obj2 = objArrN2[iS2];
                j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrN2[iS2] = C((Object[]) obj2, i12, 0, eVar);
                if (iS2 == i13) {
                    break;
                }
                iS2--;
            }
        }
        Object obj3 = objArrN2[iS];
        j.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN2[iS] = C((Object[]) obj3, i12, i11, eVar);
        return objArrN2;
    }

    public final Object D(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f15542y - i10;
        if (i13 == 1) {
            Object obj = this.f15541x[0];
            t(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f15541x;
        Object obj2 = objArr2[i12];
        Object[] objArrN = n(objArr2);
        l.X(i12, i12 + 1, i13, objArr2, objArrN);
        objArrN[i13 - 1] = null;
        this.f15540w = objArr;
        this.f15541x = objArrN;
        this.f15542y = (i10 + i13) - 1;
        this.f15538u = i11;
        return obj2;
    }

    public final int E() {
        int i10 = this.f15542y;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i10, int i11, Object obj, e eVar) {
        int iS = u0.s(i11, i10);
        Object[] objArrN = n(objArr);
        if (i10 != 0) {
            Object obj2 = objArrN[iS];
            j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN[iS] = F((Object[]) obj2, i10 - 5, i11, obj, eVar);
            return objArrN;
        }
        if (objArrN != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f4215a = objArrN[iS];
        objArrN[iS] = obj;
        return objArrN;
    }

    public final void G(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrP;
        if (i12 < 1) {
            AbstractC0689j0.a("requires at least one nullBuffer");
        }
        Object[] objArrN = n(objArr);
        objArr2[0] = objArrN;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            l.X(size + 1, i13, i11, objArrN, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrP = objArrN;
            } else {
                objArrP = p();
                i12--;
                objArr2[i12] = objArrP;
            }
            int i16 = i11 - i15;
            l.X(0, i16, i11, objArrN, objArr3);
            l.X(size + 1, i13, i16, objArrN, objArrP);
            objArr3 = objArrP;
        }
        Iterator it = collection.iterator();
        e(objArrN, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrP2 = p();
            e(objArrP2, 0, it);
            objArr2[i17] = objArrP2;
        }
        e(objArr3, 0, it);
    }

    public final int H() {
        int i10 = this.f15542y;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        g.S(i10, b());
        if (i10 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i10 >= iE) {
            j(i10 - iE, obj, this.f15540w);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f15540w;
        j.b(objArr);
        j(0, eVar.f4215a, h(objArr, this.f15538u, i10, obj, eVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrP;
        g.S(i10, this.f15542y);
        if (i10 == this.f15542y) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f15542y - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f15541x;
            Object[] objArrN = n(objArr);
            l.X(size2 + 1, i12, H(), objArr, objArrN);
            e(objArrN, i12, collection.iterator());
            this.f15541x = objArrN;
            this.f15542y = collection.size() + this.f15542y;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iH = H();
        int size3 = collection.size() + this.f15542y;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= E()) {
            objArrP = p();
            collection2 = collection;
            G(collection2, i10, this.f15541x, iH, objArr2, size, objArrP);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iH) {
                int i13 = size3 - iH;
                Object[] objArrO = o(i13, fVar.f15541x);
                fVar.g(collection2, i10, i13, objArr2, size, objArrO);
                objArr2 = objArr2;
                objArrP = objArrO;
            } else {
                Object[] objArr3 = fVar.f15541x;
                objArrP = p();
                int i14 = iH - size3;
                l.X(0, i14, iH, objArr3, objArrP);
                int i15 = 32 - i14;
                Object[] objArrO2 = o(i15, fVar.f15541x);
                int i16 = size - 1;
                objArr2[i16] = objArrO2;
                fVar.g(collection2, i10, i15, objArr2, i16, objArrO2);
                collection2 = collection2;
            }
        }
        fVar.f15540w = v(fVar.f15540w, i11, objArr2);
        fVar.f15541x = objArrP;
        fVar.f15542y = collection2.size() + fVar.f15542y;
        return true;
    }

    @Override // p120l9.f
    public final int b() {
        return this.f15542y;
    }

    @Override // p120l9.f
    public final Object c(int i10) {
        g.P(i10, b());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i10 >= iE) {
            return D(this.f15540w, iE, this.f15538u, i10 - iE);
        }
        e eVar = new e(this.f15541x[0]);
        Object[] objArr = this.f15540w;
        j.b(objArr);
        D(C(objArr, this.f15538u, i10, eVar), iE, this.f15538u, 0);
        return eVar.f4215a;
    }

    public final c d() {
        c eVar;
        Object[] objArr = this.f15540w;
        if (objArr == this.f15536s && this.f15541x == this.f15537t) {
            eVar = this.f15535r;
        } else {
            this.f15539v = new p062g0.b();
            this.f15536s = objArr;
            Object[] objArr2 = this.f15541x;
            this.f15537t = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f15542y, this.f15538u);
            } else if (objArr2.length == 0) {
                eVar = i.f15549s;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f15542y);
                j.d(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f15535r = eVar;
        return eVar;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f15540w == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarM = m(E() >> 5);
        int i14 = i12;
        Object[] objArrO = objArr2;
        while (aVarM.f15525r - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarM.previous();
            l.X(0, 32 - i11, 32, objArr3, objArrO);
            objArrO = o(i11, objArr3);
            i14--;
            objArr[i14] = objArrO;
        }
        Object[] objArr4 = (Object[]) aVarM.previous();
        int iE = i12 - (((E() >> 5) - 1) - i13);
        if (iE < i12) {
            objArr2 = objArr[iE];
            j.b(objArr2);
        }
        G(collection, i10, objArr4, 32, objArr, iE, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        g.P(i10, b());
        if (E() <= i10) {
            objArr = this.f15541x;
        } else {
            objArr = this.f15540w;
            j.b(objArr);
            for (int i11 = this.f15538u; i11 > 0; i11 -= 5) {
                Object obj = objArr[u0.s(i10, i11)];
                j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final Object[] h(Object[] objArr, int i10, int i11, Object obj, e eVar) {
        Object obj2;
        int iS = u0.s(i11, i10);
        if (i10 == 0) {
            eVar.f4215a = objArr[31];
            Object[] objArrN = n(objArr);
            l.X(iS + 1, iS, 31, objArr, objArrN);
            objArrN[iS] = obj;
            return objArrN;
        }
        Object[] objArrN2 = n(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrN2[iS];
        j.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN2[iS] = h((Object[]) obj3, i12, i11, obj, eVar);
        while (true) {
            iS++;
            if (iS >= 32 || (obj2 = objArrN2[iS]) == null) {
                break;
            }
            objArrN2[iS] = h((Object[]) obj2, i12, 0, eVar.f4215a, eVar);
        }
        return objArrN2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i10, Object obj, Object[] objArr) {
        int iH = H();
        Object[] objArrN = n(this.f15541x);
        if (iH >= 32) {
            Object[] objArr2 = this.f15541x;
            Object obj2 = objArr2[31];
            l.X(i10 + 1, i10, 31, objArr2, objArrN);
            objArrN[i10] = obj;
            w(objArr, objArrN, q(obj2));
            return;
        }
        l.X(i10 + 1, i10, iH, this.f15541x, objArrN);
        objArrN[i10] = obj;
        this.f15540w = objArr;
        this.f15541x = objArrN;
        this.f15542y++;
    }

    public final boolean l(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f15539v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        g.S(i10, this.f15542y);
        return new h(this, i10);
    }

    public final a m(int i10) {
        Object[] objArr = this.f15540w;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iE = E() >> 5;
        g.S(i10, iE);
        int i11 = this.f15538u;
        return i11 == 0 ? new d(i10, objArr) : new j(objArr, i10, iE, i11 / 5);
    }

    public final Object[] n(Object[] objArr) {
        if (objArr == null) {
            return p();
        }
        if (l(objArr)) {
            return objArr;
        }
        Object[] objArrP = p();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        l.b0(0, length, 6, objArr, objArrP);
        return objArrP;
    }

    public final Object[] o(int i10, Object[] objArr) {
        if (l(objArr)) {
            l.X(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrP = p();
        l.X(i10, 0, 32 - i10, objArr, objArrP);
        return objArrP;
    }

    public final Object[] p() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f15539v;
        return objArr;
    }

    public final Object[] q(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f15539v;
        return objArr;
    }

    public final Object[] r(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            AbstractC0689j0.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iS = u0.s(i10, i11);
        Object obj = objArr[iS];
        j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objR = r((Object[]) obj, i10, i11 - 5);
        if (iS < 31) {
            int i12 = iS + 1;
            if (objArr[i12] != null) {
                if (l(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrP = p();
                l.X(0, 0, i12, objArr, objArrP);
                objArr = objArrP;
            }
        }
        if (objR == objArr[iS]) {
            return objArr;
        }
        Object[] objArrN = n(objArr);
        objArrN[iS] = objR;
        return objArrN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return B(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i10, int i11, e eVar) {
        Object[] objArrS;
        int iS = u0.s(i11 - 1, i10);
        if (i10 == 5) {
            eVar.f4215a = objArr[iS];
            objArrS = null;
        } else {
            Object obj = objArr[iS];
            j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrS = s((Object[]) obj, i10 - 5, i11, eVar);
        }
        if (objArrS == null && iS == 0) {
            return null;
        }
        Object[] objArrN = n(objArr);
        objArrN[iS] = objArrS;
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        g.P(i10, b());
        if (E() > i10) {
            e eVar = new e(null);
            Object[] objArr = this.f15540w;
            j.b(objArr);
            this.f15540w = F(objArr, this.f15538u, i10, obj, eVar);
            return eVar.f4215a;
        }
        Object[] objArrN = n(this.f15541x);
        if (objArrN != this.f15541x) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrN[i11];
        objArrN[i11] = obj;
        this.f15541x = objArrN;
        return obj2;
    }

    public final void t(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f15540w = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f15541x = objArr;
            this.f15542y = i10;
            this.f15538u = i11;
            return;
        }
        e eVar = new e(null);
        j.b(objArr);
        Object[] objArrS = s(objArr, i11, i10, eVar);
        j.b(objArrS);
        Object obj = eVar.f4215a;
        j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f15541x = (Object[]) obj;
        this.f15542y = i10;
        if (objArrS[1] == null) {
            this.f15540w = (Object[]) objArrS[0];
            this.f15538u = i11 - 5;
        } else {
            this.f15540w = objArrS;
            this.f15538u = i11;
        }
    }

    public final Object[] u(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0689j0.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            AbstractC0689j0.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrN = n(objArr);
        int iS = u0.s(i10, i11);
        int i12 = i11 - 5;
        objArrN[iS] = u((Object[]) objArrN[iS], i10, i12, it);
        while (true) {
            iS++;
            if (iS >= 32 || !it.hasNext()) {
                break;
            }
            objArrN[iS] = u((Object[]) objArrN[iS], 0, i12, it);
        }
        return objArrN;
    }

    public final Object[] v(Object[] objArr, int i10, Object[][] objArr2) {
        V vH = j.h(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f15538u;
        Object[] objArrU = i11 < (1 << i12) ? u(objArr, i10, i12, vH) : n(objArr);
        while (vH.hasNext()) {
            this.f15538u += 5;
            objArrU = q(objArrU);
            int i13 = this.f15538u;
            u(objArrU, 1 << i13, i13, vH);
        }
        return objArrU;
    }

    public final void w(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f15542y;
        int i11 = i10 >> 5;
        int i12 = this.f15538u;
        if (i11 > (1 << i12)) {
            this.f15540w = x(this.f15538u + 5, q(objArr), objArr2);
            this.f15541x = objArr3;
            this.f15538u += 5;
            this.f15542y++;
            return;
        }
        if (objArr == null) {
            this.f15540w = objArr2;
            this.f15541x = objArr3;
            this.f15542y = i10 + 1;
        } else {
            this.f15540w = x(i12, objArr, objArr2);
            this.f15541x = objArr3;
            this.f15542y++;
        }
    }

    public final Object[] x(int i10, Object[] objArr, Object[] objArr2) {
        int iS = u0.s(b() - 1, i10);
        Object[] objArrN = n(objArr);
        if (i10 == 5) {
            objArrN[iS] = objArr2;
            return objArrN;
        }
        objArrN[iS] = x(i10 - 5, (Object[]) objArrN[iS], objArr2);
        return objArrN;
    }

    public final int y(c cVar, Object[] objArr, int i10, int i11, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (l(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f4215a;
        j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrP = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) cVar.e(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrP = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : p();
                    i11 = 0;
                }
                objArrP[i11] = obj2;
                i11++;
            }
        }
        eVar.f4215a = objArrP;
        if (objArr2 != objArrP) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int z(c cVar, Object[] objArr, int i10, e eVar) {
        Object[] objArrN = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) cVar.e(obj)).booleanValue()) {
                if (!z10) {
                    objArrN = n(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrN[i11] = obj;
                i11++;
            }
        }
        eVar.f4215a = objArrN;
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iH = H();
        if (iH < 32) {
            Object[] objArrN = n(this.f15541x);
            objArrN[iH] = obj;
            this.f15541x = objArrN;
            this.f15542y = b() + 1;
        } else {
            w(this.f15540w, this.f15541x, q(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iH = H();
        Iterator it = collection.iterator();
        if (32 - iH >= collection.size()) {
            Object[] objArrN = n(this.f15541x);
            e(objArrN, iH, it);
            this.f15541x = objArrN;
            this.f15542y = collection.size() + this.f15542y;
            return true;
        }
        int size = ((collection.size() + iH) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrN2 = n(this.f15541x);
        e(objArrN2, iH, it);
        objArr[0] = objArrN2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrP = p();
            e(objArrP, 0, it);
            objArr[i10] = objArrP;
        }
        this.f15540w = v(this.f15540w, E(), objArr);
        Object[] objArrP2 = p();
        e(objArrP2, 0, it);
        this.f15541x = objArrP2;
        this.f15542y = collection.size() + this.f15542y;
        return true;
    }
}
