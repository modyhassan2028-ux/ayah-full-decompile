package androidx.compose.foundation.lazy.layout;

import A.C0039q;
import A.J0;
import F.m;
import F.s;
import G.C0177k;
import G.C0185t;
import G.C0187v;
import G.C0188w;
import G.C0189x;
import G.a0;
import H0.U;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import java.util.ArrayList;
import java.util.Collections;
import l0.q;
import l0.r;
import p120l9.l;
import p120l9.p;
import p180s0.v;
import p223x.InterfaceC1435y;
import p251z9.j;
import u.E;
import u.F;
import u.M;
import u.N;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f11846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f11847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f11849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f11850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f11851f;
    public final ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f11852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f11853i;
    public C0187v j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f11854k;

    public b() {
        long[] jArr = M.f22699a;
        this.f11846a = new E();
        int i10 = N.f22700a;
        this.f11849d = new F();
        this.f11850e = new ArrayList();
        this.f11851f = new ArrayList();
        this.g = new ArrayList();
        this.f11852h = new ArrayList();
        this.f11853i = new ArrayList();
        this.f11854k = new AbstractC0274a0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f11840a;

            {
                this.f11840a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && j.a(this.f11840a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f11840a);
            }

            public final int hashCode() {
                return this.f11840a.hashCode();
            }

            @Override // J0.AbstractC0274a0
            public final q k() {
                C0187v c0187v = new C0187v();
                c0187v.f2751F = this.f11840a;
                return c0187v;
            }

            @Override // J0.AbstractC0274a0
            public final void l(q qVar) {
                C0187v c0187v = (C0187v) qVar;
                b bVar = c0187v.f2751F;
                b bVar2 = this.f11840a;
                if (j.a(bVar, bVar2) || !c0187v.f19339r.f19338E) {
                    return;
                }
                b bVar3 = c0187v.f2751F;
                bVar3.d();
                bVar3.f11847b = null;
                bVar3.f11848c = -1;
                bVar2.j = c0187v;
                c0187v.f2751F = bVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f11840a + ')';
            }
        };
    }

    public static void b(s sVar, int i10, C0188w c0188w) {
        int i11 = 0;
        long jA = sVar.a(0);
        int i12 = true & true ? (int) (jA >> 32) : 0;
        if ((1 & 2) != 0) {
            i10 = (int) (jA & 4294967295L);
        }
        long j = (((long) i12) << 32) | (4294967295L & ((long) i10));
        C0185t[] c0185tArr = c0188w.f2752a;
        int length = c0185tArr.length;
        int i13 = 0;
        while (i11 < length) {
            C0185t c0185t = c0185tArr[i11];
            int i14 = i13 + 1;
            if (c0185t != null) {
                c0185t.f2743l = p063g1.j.c(j, p063g1.j.b(sVar.a(i13), jA));
            }
            i11++;
            i13 = i14;
        }
    }

    public static int g(int[] iArr, s sVar) {
        sVar.getClass();
        int i10 = iArr[0] + sVar.f2122o;
        iArr[0] = i10;
        return Math.max(0, i10);
    }

    public final long a() {
        ArrayList arrayList = this.f11853i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C0185t c0185t = (C0185t) arrayList.get(i10);
            p205v0.b bVar = c0185t.f2745n;
            if (bVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (c0185t.f2743l >> 32)) + ((int) (bVar.f23022u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (c0185t.f2743l & 4294967295L)) + ((int) (bVar.f23022u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03af  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:173:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:197:0x046d  */
    /* JADX WARN: Code duplicated, block: B:245:0x00c7 A[EDGE_INSN: B:245:0x00c7->B:45:0x00c7 BREAK  A[LOOP:2: B:32:0x008d->B:44:0x00c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[LOOP:2: B:32:0x008d->B:44:0x00c4, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v21, types: [o9.c, o9.h] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v31, types: [G.t[]] */
    /* JADX WARN: Type inference failed for: r1v35, types: [G.t[]] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v22 */
    /* JADX WARN: Type inference failed for: r24v9 */
    public final void c(int i10, int i11, int i12, ArrayList arrayList, a0 a0Var, m mVar, boolean z10, boolean z11, int i13, int i14, InterfaceC0402u interfaceC0402u, v vVar) {
        E e10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        F f3;
        E e11;
        a0 a0Var2;
        int[] iArr2;
        E e12;
        int iA;
        Object[] objArr;
        long[] jArr;
        int i15;
        ?? r24;
        Object[] objArr2;
        int[] iArr3;
        long[] jArr2;
        int i16;
        int i17;
        F f7;
        int i18;
        E e13;
        int i19;
        ?? r25;
        C0185t[] c0185tArr;
        C0188w c0188w;
        C0187v c0187v;
        int i20;
        boolean z12;
        ArrayList arrayList7 = arrayList;
        a0 a0Var3 = this.f11847b;
        this.f11847b = a0Var;
        int size = arrayList7.size();
        int i21 = 0;
        int i22 = 0;
        loop0: while (true) {
            e10 = this.f11846a;
            if (i22 >= size) {
                if (!e10.i()) {
                    break;
                }
                d();
                return;
            }
            s sVar = (s) arrayList7.get(i22);
            int size2 = sVar.f2111b.size();
            for (int i23 = 0; i23 < size2; i23++) {
                Object objI = ((U) sVar.f2111b.get(i23)).i();
                if ((objI instanceof C0177k ? (C0177k) objI : null) != null) {
                    break loop0;
                }
            }
            i22++;
        }
        int i24 = this.f11848c;
        s sVar2 = (s) p120l9.m.g0(arrayList7);
        this.f11848c = sVar2 != null ? sVar2.f2110a : 0;
        long j = (((long) 0) << 32) | (((long) i10) & 4294967295L);
        boolean z13 = z10 || !z11;
        Object[] objArr3 = e10.f22670b;
        long[] jArr3 = e10.f22669a;
        int length = jArr3.length - 2;
        boolean z14 = false;
        F f10 = this.f11849d;
        if (length >= 0) {
            while (true) {
                long j10 = jArr3[i21];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i21 != length) {
                        break;
                        break;
                    }
                    i21++;
                } else {
                    int i25 = 8 - ((~(i21 - length)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j10 & 255) < 128) {
                            f10.a(objArr3[(i21 << 3) + i26]);
                        }
                        j10 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    } else if (i21 != length) {
                        break;
                    } else {
                        i21++;
                    }
                }
            }
        }
        int size3 = arrayList7.size();
        int i27 = 0;
        while (true) {
            arrayList2 = this.f11853i;
            arrayList3 = this.f11851f;
            arrayList4 = this.f11850e;
            if (i27 >= size3) {
                break;
            }
            s sVar3 = (s) arrayList7.get(i27);
            f10.l(sVar3.f2117i);
            int size4 = sVar3.f2111b.size();
            int i28 = size3;
            int i29 = 0;
            while (true) {
                if (i29 >= size4) {
                    i20 = i27;
                    z12 = false;
                    break;
                }
                i20 = i27;
                Object objI2 = ((U) sVar3.f2111b.get(i29)).i();
                int i30 = i29;
                if ((objI2 instanceof C0177k ? (C0177k) objI2 : null) != null) {
                    z12 = true;
                    break;
                } else {
                    i29 = i30 + 1;
                    i27 = i20;
                }
            }
            if (z12) {
                Object obj = sVar3.f2117i;
                C0188w c0188w2 = (C0188w) e10.g(obj);
                int iF = a0Var3 != null ? a0Var3.f(obj) : -1;
                boolean z15 = iF == -1 && a0Var3 != null;
                if (c0188w2 == null) {
                    C0188w c0188w3 = new C0188w(this);
                    C0188w.b(c0188w3, sVar3, interfaceC0402u, vVar, i13, i14);
                    e10.l(obj, c0188w3);
                    if (sVar3.f2110a == iF || iF == -1) {
                        b(sVar3, (int) (sVar3.a(0) & 4294967295L), c0188w3);
                        if (z15) {
                            C0185t[] c0185tArr2 = c0188w3.f2752a;
                            for (C0185t c0185t : c0185tArr2) {
                                if (c0185t != null) {
                                    c0185t.a();
                                }
                            }
                        }
                    } else if (iF < i24) {
                        arrayList4.add(sVar3);
                    } else {
                        arrayList3.add(sVar3);
                    }
                } else if (z13) {
                    C0188w.b(c0188w2, sVar3, interfaceC0402u, vVar, i13, i14);
                    C0185t[] c0185tArr3 = c0188w2.f2752a;
                    int length2 = c0185tArr3.length;
                    int i31 = 0;
                    while (i31 < length2) {
                        C0185t[] c0185tArr4 = c0185tArr3;
                        C0185t c0185t2 = c0185tArr4[i31];
                        boolean z16 = z15;
                        int i32 = length2;
                        if (c0185t2 != null && !p063g1.j.a(c0185t2.f2743l, C0185t.f2732s)) {
                            c0185t2.f2743l = p063g1.j.c(c0185t2.f2743l, j);
                        }
                        i31++;
                        z15 = z16;
                        c0185tArr3 = c0185tArr4;
                        length2 = i32;
                    }
                    if (z15) {
                        for (C0185t c0185t3 : c0188w2.f2752a) {
                            if (c0185t3 != null) {
                                if (c0185t3.b()) {
                                    arrayList2.remove(c0185t3);
                                    C0187v c0187v2 = this.j;
                                    if (c0187v2 != null) {
                                        AbstractC0283f.m(c0187v2);
                                    }
                                }
                                c0185t3.a();
                            }
                        }
                    }
                    f(sVar3, false);
                }
            } else {
                e(sVar3.f2117i);
            }
            i27 = i20 + 1;
            arrayList7 = arrayList;
            size3 = i28;
        }
        int[] iArr4 = new int[1];
        if (z13 && a0Var3 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    p.c0(arrayList4, new C0189x(a0Var3, 2));
                }
                int size5 = arrayList4.size();
                for (int i33 = 0; i33 < size5; i33++) {
                    s sVar4 = (s) arrayList4.get(i33);
                    int iG = i13 - g(iArr4, sVar4);
                    Object objG = e10.g(sVar4.f2117i);
                    j.b(objG);
                    b(sVar4, iG, (C0188w) objG);
                    f(sVar4, false);
                }
                l.f0(iArr4, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    p.c0(arrayList3, new C0189x(a0Var3, 0));
                }
                int size6 = arrayList3.size();
                for (int i34 = 0; i34 < size6; i34++) {
                    s sVar5 = (s) arrayList3.get(i34);
                    int iG2 = (g(iArr4, sVar5) + i14) - sVar5.f2122o;
                    Object objG2 = e10.g(sVar5.f2117i);
                    j.b(objG2);
                    b(sVar5, iG2, (C0188w) objG2);
                    f(sVar5, false);
                }
                l.f0(iArr4, 0);
            }
        }
        Object[] objArr4 = f10.f22676b;
        long[] jArr4 = f10.f22675a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList8 = this.f11852h;
        ArrayList arrayList9 = this.g;
        if (length3 >= 0) {
            int i35 = 0;
            while (true) {
                long j11 = jArr4[i35];
                arrayList5 = arrayList3;
                arrayList6 = arrayList4;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i36 = 8;
                    int i37 = 8 - ((~(i35 - length3)) >>> 31);
                    long j12 = j11;
                    int i38 = 0;
                    while (i38 < i37) {
                        if ((j12 & 255) < 128) {
                            Object obj2 = objArr4[(i35 << 3) + i38];
                            C0188w c0188w4 = (C0188w) e10.g(obj2);
                            if (c0188w4 == null) {
                                r24 = z14;
                                r24 = z14;
                                objArr2 = objArr4;
                                iArr3 = iArr4;
                                jArr2 = jArr4;
                                i16 = i38;
                                i17 = i37;
                                f7 = f10;
                                i18 = i35;
                                e13 = e10;
                                i19 = i36;
                            } else {
                                objArr2 = objArr4;
                                f7 = f10;
                                int iF2 = a0Var.f(obj2);
                                jArr2 = jArr4;
                                i16 = i38;
                                int iMin = Math.min(1, c0188w4.f2756e);
                                c0188w4.f2756e = iMin;
                                c0188w4.f2755d = Math.min(1 - iMin, c0188w4.f2755d);
                                if (iF2 == -1) {
                                    C0185t[] c0185tArr5 = c0188w4.f2752a;
                                    int length4 = c0185tArr5.length;
                                    int i39 = 0;
                                    boolean z17 = false;
                                    int i40 = 0;
                                    while (i39 < length4) {
                                        Object obj3 = obj2;
                                        C0185t c0185t4 = c0185tArr5[i39];
                                        int i41 = i40 + 1;
                                        if (c0185t4 != null) {
                                            if (c0185t4.b()) {
                                                r24 = z14;
                                                r25 = r24;
                                                c0185tArr = c0185tArr5;
                                                z17 = true;
                                                iArr4 = iArr4;
                                                c0188w = c0188w4;
                                            } else {
                                                c0185tArr = c0185tArr5;
                                                if (((Boolean) c0185t4.f2742k.getValue()).booleanValue()) {
                                                    c0185t4.c();
                                                    c0188w4.f2752a[i40] = r25;
                                                    arrayList2.remove(c0185t4);
                                                    C0187v c0187v3 = this.j;
                                                    if (c0187v3 != null) {
                                                        r24 = z14;
                                                        r25 = r24;
                                                        AbstractC0283f.m(c0187v3);
                                                    }
                                                } else {
                                                    C0188w c0188w5 = c0188w4;
                                                    p205v0.b bVar = c0185t4.f2745n;
                                                    if (bVar != null) {
                                                        int i42 = i37;
                                                        InterfaceC1435y interfaceC1435y = c0185t4.f2739f;
                                                        if (c0185t4.b() || interfaceC1435y == null) {
                                                            r24 = z14;
                                                            r25 = r24;
                                                            i37 = i42;
                                                        } else {
                                                            c0185t4.e(true);
                                                            length4 = length4;
                                                            i39 = i39;
                                                            ?? r13 = r25;
                                                            obj3 = obj3;
                                                            i37 = i42;
                                                            i35 = i35;
                                                            e10 = e10;
                                                            i36 = i36;
                                                            c0188w = c0188w5;
                                                            AbstractC0405x.x(c0185t4.f2734a, r13, new C0039q(c0185t4, interfaceC1435y, bVar, r13, 9), 3);
                                                            r25 = r13;
                                                        }
                                                        if (c0185t4.b()) {
                                                            arrayList2.add(c0185t4);
                                                            c0187v = this.j;
                                                            if (c0187v != null) {
                                                                AbstractC0283f.m(c0187v);
                                                            }
                                                            z17 = true;
                                                        } else {
                                                            c0185t4.c();
                                                            c0188w.f2752a[i40] = r25;
                                                        }
                                                    } else {
                                                        r24 = z14;
                                                        r25 = r24;
                                                        i37 = i37;
                                                    }
                                                    c0188w = c0188w5;
                                                    r25 = r25;
                                                    if (c0185t4.b()) {
                                                        arrayList2.add(c0185t4);
                                                        c0187v = this.j;
                                                        if (c0187v != null) {
                                                            AbstractC0283f.m(c0187v);
                                                        }
                                                        z17 = true;
                                                    } else {
                                                        c0185t4.c();
                                                        c0188w.f2752a[i40] = r25;
                                                    }
                                                }
                                            }
                                            c0188w4 = c0188w;
                                            obj2 = obj3;
                                            i36 = i36;
                                            iArr4 = iArr4;
                                            i40 = i41;
                                            length4 = length4;
                                            e10 = e10;
                                            i35 = i35;
                                            i37 = i37;
                                            i39++;
                                            r25 = r25;
                                            c0185tArr5 = c0185tArr;
                                        } else {
                                            r24 = z14;
                                            r25 = r24;
                                            c0185tArr = c0185tArr5;
                                        }
                                        r24 = z14;
                                        r25 = r24;
                                        iArr4 = iArr4;
                                        c0188w = c0188w4;
                                        c0188w4 = c0188w;
                                        obj2 = obj3;
                                        i36 = i36;
                                        iArr4 = iArr4;
                                        i40 = i41;
                                        length4 = length4;
                                        e10 = e10;
                                        i35 = i35;
                                        i37 = i37;
                                        i39++;
                                        r25 = r25;
                                        c0185tArr5 = c0185tArr;
                                    }
                                    r24 = z14;
                                    r25 = r24;
                                    Object obj4 = obj2;
                                    i17 = i37;
                                    i18 = i35;
                                    e13 = e10;
                                    int i43 = i36;
                                    iArr3 = iArr4;
                                    if (!z17) {
                                        e(obj4);
                                    }
                                    i19 = i43;
                                } else {
                                    i17 = i37;
                                    i18 = i35;
                                    e13 = e10;
                                    int i44 = i36;
                                    iArr3 = iArr4;
                                    p063g1.a aVar = c0188w4.f2753b;
                                    j.b(aVar);
                                    s sVarA = mVar.a(aVar.f16246a, iF2);
                                    boolean z18 = true;
                                    sVarA.f2124q = true;
                                    C0185t[] c0185tArr6 = c0188w4.f2752a;
                                    int length5 = c0185tArr6.length;
                                    int i45 = 0;
                                    while (true) {
                                        if (i45 < length5) {
                                            i19 = i44;
                                            C0185t c0185t5 = c0185tArr6[i45];
                                            if (c0185t5 == null || ((Boolean) c0185t5.f2740h.getValue()).booleanValue() != z18) {
                                                r24 = z14;
                                                i45++;
                                                i44 = i19;
                                                z18 = true;
                                            } else {
                                                r24 = z14;
                                            }
                                        } else {
                                            r24 = z14;
                                            i19 = i44;
                                            if (a0Var3 != null && iF2 == a0Var3.f(obj2)) {
                                                e(obj2);
                                            }
                                        }
                                        c0188w4.a(sVarA, interfaceC0402u, vVar, i13, i14, c0188w4.f2754c);
                                        if (iF2 < this.f11848c) {
                                            arrayList9.add(sVarA);
                                        } else {
                                            arrayList8.add(sVarA);
                                        }
                                    }
                                }
                            }
                        } else {
                            r24 = z14;
                            r24 = z14;
                            objArr2 = objArr4;
                            iArr3 = iArr4;
                            jArr2 = jArr4;
                            i16 = i38;
                            i17 = i37;
                            f7 = f10;
                            i18 = i35;
                            e13 = e10;
                            i19 = i36;
                        }
                        j12 >>= i19;
                        i38 = i16 + 1;
                        i36 = i19;
                        iArr4 = iArr3;
                        f10 = f7;
                        objArr4 = objArr2;
                        jArr4 = jArr2;
                        e10 = e13;
                        i35 = i18;
                        i37 = i17;
                        r24 = 0;
                    }
                    r24 = z14;
                    objArr = objArr4;
                    iArr = iArr4;
                    jArr = jArr4;
                    f3 = f10;
                    int i46 = i35;
                    e11 = e10;
                    if (i37 != i36) {
                        break;
                    } else {
                        i15 = i46;
                    }
                } else {
                    objArr = objArr4;
                    iArr = iArr4;
                    jArr = jArr4;
                    f3 = f10;
                    e11 = e10;
                    i15 = i35;
                }
                if (i15 == length3) {
                    break;
                }
                i35 = i15 + 1;
                iArr4 = iArr;
                arrayList3 = arrayList5;
                arrayList4 = arrayList6;
                f10 = f3;
                objArr4 = objArr;
                jArr4 = jArr;
                e10 = e11;
                z14 = false;
            }
        } else {
            iArr = iArr4;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            f3 = f10;
            e11 = e10;
        }
        if (arrayList9.isEmpty()) {
            a0Var2 = a0Var;
            iArr2 = iArr;
            e12 = e11;
        } else {
            if (arrayList9.size() > 1) {
                a0Var2 = a0Var;
                p.c0(arrayList9, new C0189x(a0Var2, 3));
            } else {
                a0Var2 = a0Var;
            }
            int size7 = arrayList9.size();
            int i47 = 0;
            while (i47 < size7) {
                s sVar6 = (s) arrayList9.get(i47);
                E e14 = e11;
                Object objG3 = e14.g(sVar6.f2117i);
                j.b(objG3);
                int[] iArr5 = iArr;
                sVar6.c((z10 ? (int) (((s) p120l9.m.f0(arrayList)).a(0) & 4294967295L) : ((C0188w) objG3).f2757f) - g(iArr5, sVar6), i11, i12);
                if (z13) {
                    f(sVar6, true);
                }
                i47++;
                e11 = e14;
                iArr = iArr5;
            }
            iArr2 = iArr;
            e12 = e11;
            l.f0(iArr2, 0);
        }
        if (!arrayList8.isEmpty()) {
            if (arrayList8.size() > 1) {
                p.c0(arrayList8, new C0189x(a0Var2, 1));
            }
            int size8 = arrayList8.size();
            for (int i48 = 0; i48 < size8; i48++) {
                s sVar7 = (s) arrayList8.get(i48);
                Object objG4 = e12.g(sVar7.f2117i);
                j.b(objG4);
                C0188w c0188w6 = (C0188w) objG4;
                int iG3 = g(iArr2, sVar7);
                if (z10) {
                    s sVar8 = (s) p120l9.m.m0(arrayList);
                    iA = ((int) (sVar8.a(0) & 4294967295L)) + sVar8.f2122o;
                } else {
                    iA = c0188w6.g;
                }
                sVar7.c((iA - sVar7.f2122o) + iG3, i11, i12);
                if (z13) {
                    f(sVar7, true);
                }
            }
        }
        Collections.reverse(arrayList9);
        arrayList.addAll(0, arrayList9);
        arrayList.addAll(arrayList8);
        arrayList6.clear();
        arrayList5.clear();
        arrayList9.clear();
        arrayList8.clear();
        f3.b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[LOOP:0: B:7:0x0011->B:22:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[EDGE_INSN: B:26:0x0058->B:23:0x0058 BREAK  A[LOOP:0: B:7:0x0011->B:22:0x0055], SYNTHETIC] */
    public final void d() {
        E e10 = this.f11846a;
        if (e10.f22673e != 0) {
            Object[] objArr = e10.f22671c;
            long[] jArr = e10.f22669a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                for (C0185t c0185t : ((C0188w) objArr[(i10 << 3) + i12]).f2752a) {
                                    if (c0185t != null) {
                                        c0185t.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            e10.a();
        }
    }

    public final void e(Object obj) {
        C0185t[] c0185tArr;
        C0188w c0188w = (C0188w) this.f11846a.j(obj);
        if (c0188w == null || (c0185tArr = c0188w.f2752a) == null) {
            return;
        }
        for (C0185t c0185t : c0185tArr) {
            if (c0185t != null) {
                c0185t.c();
            }
        }
    }

    public final void f(s sVar, boolean z10) {
        Object objG = this.f11846a.g(sVar.f2117i);
        j.b(objG);
        C0185t[] c0185tArr = ((C0188w) objG).f2752a;
        int length = c0185tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            C0185t c0185t = c0185tArr[i10];
            int i12 = i11 + 1;
            if (c0185t != null) {
                long jA = sVar.a(i11);
                long j = c0185t.f2743l;
                if (!p063g1.j.a(j, C0185t.f2732s) && !p063g1.j.a(j, jA)) {
                    long jB = p063g1.j.b(jA, j);
                    InterfaceC1435y interfaceC1435y = c0185t.f2738e;
                    if (interfaceC1435y != null) {
                        long jB2 = p063g1.j.b(((p063g1.j) c0185t.f2748q.getValue()).f16254a, jB);
                        c0185t.g(jB2);
                        c0185t.f(true);
                        c0185t.g = z10;
                        AbstractC0405x.x(c0185t.f2734a, null, new J0(c0185t, interfaceC1435y, jB2, null), 3);
                    }
                }
                c0185t.f2743l = jA;
            }
            i10++;
            i11 = i12;
        }
    }
}
