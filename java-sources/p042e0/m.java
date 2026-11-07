package p042e0;

import B0.c;
import Z.AbstractC0689j0;
import java.util.Arrays;
import p000a.a;
import p062g0.b;
import p120l9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f15739e = new m(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f15743d;

    public m(int i10, int i11, Object[] objArr, b bVar) {
        this.f15740a = i10;
        this.f15741b = i11;
        this.f15742c = bVar;
        this.f15743d = objArr;
    }

    public static m j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, b bVar) {
        if (i12 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iN = a.N(i10, i12);
        int iN2 = a.N(i11, i12);
        if (iN != iN2) {
            return new m((1 << iN) | (1 << iN2), 0, iN < iN2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new m(0, 1 << iN, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, b bVar) {
        Object obj3 = this.f15743d[i10];
        m mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f15743d;
        Object[] objArr2 = new Object[objArr.length - 1];
        l.b0(0, i10, 6, objArr, objArr2);
        l.X(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iT - 1] = mVarJ;
        l.X(iT, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f15741b == 0) {
            return this.f15743d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f15740a);
        int length = this.f15743d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        E9.b bVarG0 = c.g0(c.i0(0, this.f15743d.length), 2);
        int i10 = bVarG0.f1995r;
        int i11 = bVarG0.f1996s;
        int i12 = bVarG0.f1997t;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!j.a(obj, this.f15743d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, int i11, Object obj) {
        int iN = 1 << a.N(i10, i11);
        if (h(iN)) {
            return j.a(obj, this.f15743d[f(iN)]);
        }
        if (!i(iN)) {
            return false;
        }
        m mVarS = s(t(iN));
        return i11 == 30 ? mVarS.c(obj) : mVarS.d(i10, i11 + 5, obj);
    }

    public final boolean e(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.f15741b == mVar.f15741b && this.f15740a == mVar.f15740a) {
            int length = this.f15743d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f15743d[i10] == mVar.f15743d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f15740a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int iN = 1 << a.N(i10, i11);
        if (h(iN)) {
            int iF = f(iN);
            if (j.a(obj, this.f15743d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iN)) {
            return null;
        }
        m mVarS = s(t(iN));
        if (i11 != 30) {
            return mVarS.g(i10, i11 + 5, obj);
        }
        E9.b bVarG0 = c.g0(c.i0(0, mVarS.f15743d.length), 2);
        int i12 = bVarG0.f1995r;
        int i13 = bVarG0.f1996s;
        int i14 = bVarG0.f1997t;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!j.a(obj, mVarS.f15743d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return mVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (i10 & this.f15740a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f15741b) != 0;
    }

    public final m k(int i10, e eVar) {
        eVar.a(eVar.f15726v - 1);
        eVar.f15724t = x(i10);
        Object[] objArr = this.f15743d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f15742c != eVar.f15722r) {
            return new m(0, 0, a.h(i10, objArr), eVar.f15722r);
        }
        this.f15743d = a.h(i10, objArr);
        return this;
    }

    public final m l(int i10, Object obj, Object obj2, int i11, e eVar) {
        e eVar2;
        m mVarL;
        int iN = 1 << a.N(i10, i11);
        boolean zH = h(iN);
        b bVar = this.f15742c;
        if (zH) {
            int iF = f(iN);
            if (!j.a(obj, this.f15743d[iF])) {
                eVar.a(eVar.f15726v + 1);
                b bVar2 = eVar.f15722r;
                if (bVar != bVar2) {
                    return new m(this.f15740a ^ iN, this.f15741b | iN, a(iF, iN, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f15743d = a(iF, iN, i10, obj, obj2, i11, bVar2);
                this.f15740a ^= iN;
                this.f15741b |= iN;
                return this;
            }
            eVar.f15724t = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.f15722r) {
                this.f15743d[iF + 1] = obj2;
                return this;
            }
            eVar.f15725u++;
            Object[] objArr = this.f15743d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            j.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new m(this.f15740a, this.f15741b, objArrCopyOf, eVar.f15722r);
        }
        if (!i(iN)) {
            eVar.a(eVar.f15726v + 1);
            b bVar3 = eVar.f15722r;
            int iF2 = f(iN);
            if (bVar != bVar3) {
                return new m(this.f15740a | iN, this.f15741b, a.f(this.f15743d, iF2, obj, obj2), bVar3);
            }
            this.f15743d = a.f(this.f15743d, iF2, obj, obj2);
            this.f15740a |= iN;
            return this;
        }
        int iT = t(iN);
        m mVarS = s(iT);
        if (i11 == 30) {
            E9.b bVarG0 = c.g0(c.i0(0, mVarS.f15743d.length), 2);
            int i12 = bVarG0.f1995r;
            int i13 = bVarG0.f1996s;
            int i14 = bVarG0.f1997t;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!j.a(obj, mVarS.f15743d[i12])) {
                        if (i12 == i13) {
                            eVar.a(eVar.f15726v + 1);
                            mVarL = new m(0, 0, a.f(mVarS.f15743d, 0, obj, obj2), eVar.f15722r);
                            break;
                        }
                        i12 += i14;
                    } else {
                        eVar.f15724t = mVarS.x(i12);
                        if (mVarS.f15742c != eVar.f15722r) {
                            eVar.f15725u++;
                            Object[] objArr2 = mVarS.f15743d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            j.d(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i12 + 1] = obj2;
                            mVarL = new m(0, 0, objArrCopyOf2, eVar.f15722r);
                            break;
                        }
                        mVarS.f15743d[i12 + 1] = obj2;
                        mVarL = mVarS;
                        break;
                    }
                }
            } else {
                eVar.a(eVar.f15726v + 1);
                mVarL = new m(0, 0, a.f(mVarS.f15743d, 0, obj, obj2), eVar.f15722r);
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            mVarL = mVarS.l(i10, obj, obj2, i11 + 5, eVar2);
        }
        return mVarS == mVarL ? this : r(iT, mVarL, eVar2.f15722r);
    }

    public final m m(m mVar, int i10, p062g0.a aVar, e eVar) {
        m mVar2;
        Object[] objArr;
        m mVarJ;
        if (this == mVar) {
            aVar.f16244a += b();
            return this;
        }
        int i11 = 0;
        if (i10 > 30) {
            b bVar = eVar.f15722r;
            int i12 = mVar.f15741b;
            Object[] objArr2 = this.f15743d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.f15743d.length);
            j.d(objArrCopyOf, "copyOf(...)");
            int length = this.f15743d.length;
            E9.b bVarG0 = c.g0(c.i0(0, mVar.f15743d.length), 2);
            int i13 = bVarG0.f1995r;
            int i14 = bVarG0.f1996s;
            int i15 = bVarG0.f1997t;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c(mVar.f15743d[i13])) {
                        aVar.f16244a++;
                    } else {
                        Object[] objArr3 = mVar.f15743d;
                        objArrCopyOf[length] = objArr3[i13];
                        objArrCopyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f15743d.length) {
                if (length == mVar.f15743d.length) {
                    return mVar;
                }
                if (length == objArrCopyOf.length) {
                    return new m(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                j.d(objArrCopyOf2, "copyOf(...)");
                return new m(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i16 = this.f15741b | mVar.f15741b;
            int i17 = this.f15740a;
            int i18 = mVar.f15740a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i20);
                if (j.a(this.f15743d[f(iLowestOneBit)], mVar.f15743d[mVar.f(iLowestOneBit)])) {
                    i21 |= iLowestOneBit;
                } else {
                    i16 |= iLowestOneBit;
                }
                i20 ^= iLowestOneBit;
            }
            if ((i16 & i21) != 0) {
                AbstractC0689j0.b("Check failed.");
            }
            if (j.a(this.f15742c, eVar.f15722r) && this.f15740a == i21 && this.f15741b == i16) {
                mVar2 = this;
            } else {
                mVar2 = new m(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            }
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = mVar2.f15743d;
                int length2 = (objArr4.length - 1) - i23;
                if (i(iLowestOneBit2)) {
                    mVarJ = s(t(iLowestOneBit2));
                    if (mVar.i(iLowestOneBit2)) {
                        mVarJ = mVarJ.m(mVar.s(mVar.t(iLowestOneBit2)), i10 + 5, aVar, eVar);
                        objArr = objArr4;
                    } else if (mVar.h(iLowestOneBit2)) {
                        int iF = mVar.f(iLowestOneBit2);
                        Object obj = mVar.f15743d[iF];
                        Object objX = mVar.x(iF);
                        int i24 = eVar.f15726v;
                        objArr = objArr4;
                        mVarJ = mVarJ.l(obj != null ? obj.hashCode() : i11, obj, objX, i10 + 5, eVar);
                        if (eVar.f15726v == i24) {
                            aVar.f16244a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (mVar.i(iLowestOneBit2)) {
                        m mVarS = mVar.s(mVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f15743d[iF2];
                            int i25 = i10 + 5;
                            if (mVarS.d(obj2 != null ? obj2.hashCode() : 0, i25, obj2)) {
                                aVar.f16244a++;
                                mVarJ = mVarS;
                            } else {
                                mVarJ = mVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i25, eVar);
                            }
                        } else {
                            mVarJ = mVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f15743d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = mVar.f(iLowestOneBit2);
                        Object obj4 = mVar.f15743d[iF4];
                        mVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, mVar.x(iF4), i10 + 5, eVar.f15722r);
                    }
                }
                objArr[length2] = mVarJ;
                i23++;
                i22 ^= iLowestOneBit2;
                i11 = 0;
            }
            int i26 = 0;
            while (i21 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i21);
                int i27 = i26 * 2;
                if (mVar.h(iLowestOneBit3)) {
                    int iF5 = mVar.f(iLowestOneBit3);
                    Object[] objArr5 = mVar2.f15743d;
                    objArr5[i27] = mVar.f15743d[iF5];
                    objArr5[i27 + 1] = mVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f16244a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = mVar2.f15743d;
                    objArr6[i27] = this.f15743d[iF6];
                    objArr6[i27 + 1] = x(iF6);
                }
                i26++;
                i21 ^= iLowestOneBit3;
            }
            if (!e(mVar2)) {
                return mVar.e(mVar2) ? mVar : mVar2;
            }
        }
        return this;
    }

    public final m n(int i10, Object obj, int i11, e eVar) {
        m mVarN;
        int iN = 1 << a.N(i10, i11);
        if (h(iN)) {
            int iF = f(iN);
            if (j.a(obj, this.f15743d[iF])) {
                return p(iF, iN, eVar);
            }
        } else if (i(iN)) {
            int iT = t(iN);
            m mVarS = s(iT);
            if (i11 == 30) {
                E9.b bVarG0 = c.g0(c.i0(0, mVarS.f15743d.length), 2);
                int i12 = bVarG0.f1995r;
                int i13 = bVarG0.f1996s;
                int i14 = bVarG0.f1997t;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!j.a(obj, mVarS.f15743d[i12])) {
                            if (i12 == i13) {
                                mVarN = mVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            mVarN = mVarS.k(i12, eVar);
                            break;
                        }
                    }
                } else {
                    mVarN = mVarS;
                    break;
                }
            } else {
                mVarN = mVarS.n(i10, obj, i11 + 5, eVar);
            }
            return q(mVarS, mVarN, iT, iN, eVar.f15722r);
        }
        return this;
    }

    public final m o(int i10, Object obj, Object obj2, int i11, e eVar) {
        m mVar;
        m mVarO;
        int iN = 1 << a.N(i10, i11);
        if (h(iN)) {
            int iF = f(iN);
            if (j.a(obj, this.f15743d[iF]) && j.a(obj2, x(iF))) {
                return p(iF, iN, eVar);
            }
        } else if (i(iN)) {
            int iT = t(iN);
            m mVarS = s(iT);
            if (i11 == 30) {
                E9.b bVarG0 = c.g0(c.i0(0, mVarS.f15743d.length), 2);
                int i12 = bVarG0.f1995r;
                int i13 = bVarG0.f1996s;
                int i14 = bVarG0.f1997t;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!j.a(obj, mVarS.f15743d[i12]) || !j.a(obj2, mVarS.x(i12))) {
                            if (i12 == i13) {
                                mVarO = mVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            mVarO = mVarS.k(i12, eVar);
                            break;
                        }
                    }
                } else {
                    mVarO = mVarS;
                    break;
                }
                mVar = mVarS;
            } else {
                mVar = mVarS;
                mVarO = mVar.o(i10, obj, obj2, i11 + 5, eVar);
            }
            return q(mVar, mVarO, iT, iN, eVar.f15722r);
        }
        return this;
    }

    public final m p(int i10, int i11, e eVar) {
        eVar.a(eVar.f15726v - 1);
        eVar.f15724t = x(i10);
        Object[] objArr = this.f15743d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f15742c != eVar.f15722r) {
            return new m(i11 ^ this.f15740a, this.f15741b, a.h(i10, objArr), eVar.f15722r);
        }
        this.f15743d = a.h(i10, objArr);
        this.f15740a ^= i11;
        return this;
    }

    public final m q(m mVar, m mVar2, int i10, int i11, b bVar) {
        b bVar2 = this.f15742c;
        if (mVar2 != null) {
            return (bVar2 == bVar || mVar != mVar2) ? r(i10, mVar2, bVar) : this;
        }
        Object[] objArr = this.f15743d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new m(this.f15740a, i11 ^ this.f15741b, a.i(i10, objArr), bVar);
        }
        this.f15743d = a.i(i10, objArr);
        this.f15741b ^= i11;
        return this;
    }

    public final m r(int i10, m mVar, b bVar) {
        Object[] objArr = this.f15743d;
        if (objArr.length == 1 && mVar.f15743d.length == 2 && mVar.f15741b == 0) {
            mVar.f15740a = this.f15741b;
            return mVar;
        }
        if (this.f15742c == bVar) {
            objArr[i10] = mVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        j.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = mVar;
        return new m(this.f15740a, this.f15741b, objArrCopyOf, bVar);
    }

    public final m s(int i10) {
        Object obj = this.f15743d[i10];
        j.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int t(int i10) {
        return (this.f15743d.length - 1) - Integer.bitCount((i10 - 1) & this.f15741b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r14.f1388t = w(r12, r4, (p042e0.m) r14.f1388t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Da.r u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p042e0.m.u(int, int, java.lang.Object, java.lang.Object):Da.r");
    }

    public final m v(int i10, int i11, Object obj) {
        m mVarV;
        int iN = 1 << a.N(i10, i11);
        if (h(iN)) {
            int iF = f(iN);
            if (j.a(obj, this.f15743d[iF])) {
                Object[] objArr = this.f15743d;
                if (objArr.length != 2) {
                    return new m(this.f15740a ^ iN, this.f15741b, a.h(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iN)) {
            int iT = t(iN);
            m mVarS = s(iT);
            if (i11 == 30) {
                E9.b bVarG0 = c.g0(c.i0(0, mVarS.f15743d.length), 2);
                int i12 = bVarG0.f1995r;
                int i13 = bVarG0.f1996s;
                int i14 = bVarG0.f1997t;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!j.a(obj, mVarS.f15743d[i12])) {
                            if (i12 == i13) {
                                mVarV = mVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            Object[] objArr2 = mVarS.f15743d;
                            if (objArr2.length != 2) {
                                mVarV = new m(0, 0, a.h(i12, objArr2), null);
                                break;
                            }
                            mVarV = null;
                            break;
                        }
                    }
                } else {
                    mVarV = mVarS;
                    break;
                }
            } else {
                mVarV = mVarS.v(i10, i11 + 5, obj);
            }
            if (mVarV == null) {
                Object[] objArr3 = this.f15743d;
                if (objArr3.length != 1) {
                    return new m(this.f15740a, iN ^ this.f15741b, a.i(iT, objArr3), null);
                }
                return null;
            }
            if (mVarS != mVarV) {
                return w(iT, iN, mVarV);
            }
        }
        return this;
    }

    public final m w(int i10, int i11, m mVar) {
        Object[] objArr = mVar.f15743d;
        if (objArr.length != 2 || mVar.f15741b != 0) {
            Object[] objArr2 = this.f15743d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            j.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = mVar;
            return new m(this.f15740a, this.f15741b, objArrCopyOf, null);
        }
        if (this.f15743d.length == 1) {
            mVar.f15740a = this.f15741b;
            return mVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f15743d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        j.d(objArrCopyOf2, "copyOf(...)");
        l.X(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        l.X(iF + 2, iF, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new m(this.f15740a ^ i11, i11 ^ this.f15741b, objArrCopyOf2, null);
    }

    public final Object x(int i10) {
        return this.f15743d[i10 + 1];
    }
}
