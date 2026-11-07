package p033d0;

import Z.AbstractC0689j0;
import java.util.Arrays;
import java.util.ListIterator;
import p017b7.g;
import p120l9.l;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object[] f15531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object[] f15532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15534u;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f15531r = objArr;
        this.f15532s = objArr2;
        this.f15533t = i10;
        this.f15534u = i11;
        if (!(b() > 32)) {
            AbstractC0689j0.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] l(Object[] objArr, int i10, int i11, Object obj, J1.e eVar) {
        Object[] objArrCopyOf;
        int iS = u0.s(i11, i10);
        if (i10 == 0) {
            if (iS == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                j.d(objArrCopyOf, "copyOf(...)");
            }
            l.X(iS + 1, iS, 31, objArr, objArrCopyOf);
            eVar.f4215a = objArr[31];
            objArrCopyOf[iS] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        j.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iS];
        j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iS] = l((Object[]) obj2, i12, i11, obj, eVar);
        while (true) {
            iS++;
            if (iS >= 32 || objArrCopyOf2[iS] == null) {
                break;
            }
            Object obj3 = objArr[iS];
            j.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iS] = l((Object[]) obj3, i12, 0, eVar.f4215a, eVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] n(Object[] objArr, int i10, int i11, J1.e eVar) {
        Object[] objArrN;
        int iS = u0.s(i11, i10);
        if (i10 == 5) {
            eVar.f4215a = objArr[iS];
            objArrN = null;
        } else {
            Object obj = objArr[iS];
            j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN = n((Object[]) obj, i10 - 5, i11, eVar);
        }
        if (objArrN == null && iS == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        j.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iS] = objArrN;
        return objArrCopyOf;
    }

    public static Object[] t(int i10, int i11, Object obj, Object[] objArr) {
        int iS = u0.s(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        j.d(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iS] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iS];
        j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iS] = t(i10 - 5, i11, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // p120l9.a
    public final int b() {
        return this.f15533t;
    }

    @Override // p033d0.c
    public final c c(int i10, Object obj) {
        int i11 = this.f15533t;
        g.S(i10, i11);
        if (i10 == i11) {
            return d(obj);
        }
        int iS = s();
        Object[] objArr = this.f15531r;
        if (i10 >= iS) {
            return m(i10 - iS, obj, objArr);
        }
        J1.e eVar = new J1.e(null);
        return m(0, eVar.f4215a, l(objArr, this.f15534u, i10, obj, eVar));
    }

    @Override // p033d0.c
    public final c d(Object obj) {
        int iS = s();
        int i10 = this.f15533t;
        int i11 = i10 - iS;
        Object[] objArr = this.f15531r;
        Object[] objArr2 = this.f15532s;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return o(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        j.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = obj;
        return new e(objArr, objArrCopyOf, i10 + 1, this.f15534u);
    }

    @Override // p033d0.c
    public final f f() {
        return new f(this, this.f15531r, this.f15532s, this.f15534u);
    }

    @Override // p033d0.c
    public final c g(b bVar) {
        f fVar = new f(this, this.f15531r, this.f15532s, this.f15534u);
        fVar.B(bVar);
        return fVar.d();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        g.P(i10, b());
        if (s() <= i10) {
            objArr = this.f15532s;
        } else {
            objArr = this.f15531r;
            for (int i11 = this.f15534u; i11 > 0; i11 -= 5) {
                Object obj = objArr[u0.s(i10, i11)];
                j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // p033d0.c
    public final c h(int i10) {
        g.P(i10, this.f15533t);
        int iS = s();
        Object[] objArr = this.f15531r;
        int i11 = this.f15534u;
        return i10 >= iS ? r(objArr, iS, i11, i10 - iS) : r(q(objArr, i11, i10, new J1.e(this.f15532s[0])), iS, i11, 0);
    }

    @Override // p033d0.c
    public final c j(int i10, Object obj) {
        int i11 = this.f15533t;
        g.P(i10, i11);
        int iS = s();
        Object[] objArr = this.f15531r;
        Object[] objArr2 = this.f15532s;
        int i12 = this.f15534u;
        if (iS > i10) {
            return new e(t(i12, i10, obj, objArr), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        j.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new e(objArr, objArrCopyOf, i11, i12);
    }

    @Override // p120l9.d, java.util.List
    public final ListIterator listIterator(int i10) {
        g.S(i10, this.f15533t);
        return new g(i10, this.f15533t, (this.f15534u / 5) + 1, this.f15531r, this.f15532s);
    }

    public final e m(int i10, Object obj, Object[] objArr) {
        int iS = s();
        int i11 = this.f15533t;
        int i12 = i11 - iS;
        Object[] objArr2 = this.f15532s;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        j.d(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            l.X(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new e(objArr, objArrCopyOf, i11 + 1, this.f15534u);
        }
        Object obj2 = objArr2[31];
        l.X(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, objArrCopyOf, objArr3);
    }

    public final e o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f15533t;
        int i11 = i10 >> 5;
        int i12 = this.f15534u;
        if (i11 <= (1 << i12)) {
            return new e(p(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new e(p(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    public final Object[] p(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iS = u0.s(b() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            j.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iS] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iS] = p(i10 - 5, (Object[]) objArrCopyOf[iS], objArr2);
        return objArrCopyOf;
    }

    public final Object[] q(Object[] objArr, int i10, int i11, J1.e eVar) {
        Object[] objArrCopyOf;
        int iS = u0.s(i11, i10);
        if (i10 == 0) {
            if (iS == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                j.d(objArrCopyOf, "copyOf(...)");
            }
            l.X(iS, iS + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = eVar.f4215a;
            eVar.f4215a = objArr[iS];
            return objArrCopyOf;
        }
        int iS2 = objArr[31] == null ? u0.s(s() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        j.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iS + 1;
        if (i13 <= iS2) {
            while (true) {
                Object obj = objArrCopyOf2[iS2];
                j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iS2] = q((Object[]) obj, i12, 0, eVar);
                if (iS2 == i13) {
                    break;
                }
                iS2--;
            }
        }
        Object obj2 = objArrCopyOf2[iS];
        j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iS] = q((Object[]) obj2, i12, i11, eVar);
        return objArrCopyOf2;
    }

    public final c r(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f15533t - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f15532s;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            j.d(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                l.X(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new e(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                j.d(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        J1.e eVar = new J1.e(null);
        Object[] objArrN = n(objArr, i11, i10 - 1, eVar);
        j.b(objArrN);
        Object obj = eVar.f4215a;
        j.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrN[1] != null) {
            return new e(objArrN, objArr3, i10, i11);
        }
        Object obj2 = objArrN[0];
        j.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i10, i11 - 5);
    }

    public final int s() {
        return (this.f15533t - 1) & (-32);
    }
}
