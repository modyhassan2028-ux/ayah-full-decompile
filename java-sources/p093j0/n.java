package p093j0;

import G.a0;
import G.c0;
import Z.C;
import java.util.HashMap;
import p011b0.h;
import p074h0.a;
import p074h0.i;
import p074h0.m;
import p120l9.l;
import p120l9.r;
import p241y9.c;
import p241y9.e;
import p251z9.j;
import u.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f18660a = new i(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18661b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m f18662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f18663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f18664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f18665f;
    public static Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f18666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f18667i;
    public static final a j;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.lang.Cloneable] */
    static {
        m mVar = m.f18655v;
        f18662c = mVar;
        f18663d = ((long) 1) + 1;
        c0 c0Var = new c0();
        c0Var.f2673c = new long[16];
        c0Var.f2674d = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        c0Var.f2675e = iArr;
        f18664e = c0Var;
        a0 a0Var = new a0(6, (byte) 0);
        a0Var.f2655c = new int[16];
        a0Var.f2656d = new m[16];
        f18665f = a0Var;
        r rVar = r.f19440r;
        g = rVar;
        f18666h = rVar;
        long j10 = f18663d;
        f18663d = 1 + j10;
        d dVar = new d(j10, mVar, null, C1213a.f18622s);
        f18662c = f18662c.f(dVar.f18645b);
        f18667i = dVar;
        j = new a(0);
    }

    public static final void a() {
        f(C1213a.f18623t);
    }

    public static final c b(c cVar, c cVar2) {
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            return cVar == null ? cVar2 : cVar;
        }
        return new C1214b(cVar, cVar2, 2);
    }

    public static final HashMap c(long j10, e eVar, m mVar) {
        long[] jArr;
        m mVar2;
        long[] jArr2;
        int i10;
        x xVarT;
        F fX = eVar.x();
        if (fX != null) {
            m mVarE = eVar.d().f(eVar.g()).e(eVar.j);
            Object[] objArr = fX.f22676b;
            long[] jArr3 = fX.f22675a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap map = null;
                while (true) {
                    long j11 = jArr3[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j11 & 255) < 128) {
                                v vVar = (v) objArr[(i11 << 3) + i14];
                                x xVarB = vVar.b();
                                jArr2 = jArr3;
                                i10 = i12;
                                x xVarT2 = t(xVarB, j10, mVar);
                                if (xVarT2 != null && (xVarT = t(xVarB, j10, mVarE)) != null && !xVarT2.equals(xVarT)) {
                                    x xVarT3 = t(xVarB, eVar.g(), eVar.d());
                                    if (xVarT3 == null) {
                                        s();
                                        throw null;
                                    }
                                    x xVarC = vVar.c(xVarT, xVarT2, xVarT3);
                                    if (xVarC == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(xVarT2, xVarC);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i10 = i12;
                            }
                            j11 >>= i10;
                            i14++;
                            j10 = j10;
                            i12 = i10;
                            jArr3 = jArr2;
                            mVarE = mVarE;
                        }
                        jArr = jArr3;
                        mVar2 = mVarE;
                        if (i13 != i12) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        mVar2 = mVarE;
                    }
                    if (i11 == length) {
                        return map;
                    }
                    i11++;
                    jArr3 = jArr;
                    mVarE = mVar2;
                }
            }
        }
        return null;
    }

    public static final void d(i iVar) {
        long j10;
        if (f18662c.d(iVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(iVar.g());
        sb.append(", disposed=");
        sb.append(iVar.f18646c);
        sb.append(", applied=");
        e eVar = iVar instanceof e ? (e) iVar : null;
        sb.append(eVar != null ? Boolean.valueOf(eVar.f18637m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f18661b) {
            c0 c0Var = f18664e;
            j10 = c0Var.f2671a > 0 ? ((long[]) c0Var.f2673c)[0] : -1L;
        }
        sb.append(j10);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final m e(m mVar, long j10, long j11) {
        while (j10 < j11) {
            mVar = mVar.f(j10);
            j10++;
        }
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object f(c cVar) {
        F f3;
        Object objW;
        d dVar = f18667i;
        synchronized (f18661b) {
            try {
                f3 = dVar.f18633h;
                if (f3 != null) {
                    j.addAndGet(1);
                }
                objW = w(dVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f3 != null) {
            try {
                ?? r10 = g;
                int size = r10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((e) r10.get(i10)).invoke(new h(f3), dVar);
                }
                j.addAndGet(-1);
            } catch (Throwable th2) {
                j.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f18661b) {
            g();
            if (f3 != null) {
                Object[] objArr = f3.f22676b;
                long[] jArr = f3.f22675a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j10) < 128) {
                                    r((v) objArr[(i11 << 3) + i13]);
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                            if (i11 != length) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        return objW;
    }

    public static final void g() {
        a0 a0Var = f18665f;
        int i10 = a0Var.f2654b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            m mVar = ((m[]) a0Var.f2656d)[i11];
            Object obj = mVar != null ? mVar.get() : null;
            if (obj != null && q((v) obj)) {
                if (i12 != i11) {
                    ((m[]) a0Var.f2656d)[i12] = mVar;
                    int[] iArr = (int[]) a0Var.f2655c;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((m[]) a0Var.f2656d)[i13] = null;
            ((int[]) a0Var.f2655c)[i13] = 0;
        }
        if (i12 != i10) {
            a0Var.f2654b = i12;
        }
    }

    public static final i h(i iVar, c cVar, boolean z10) {
        boolean z11 = iVar instanceof e;
        if (z11 || iVar == null) {
            return new A(z11 ? (e) iVar : null, cVar, null, false, z10);
        }
        return new B(iVar, cVar, z10);
    }

    public static final x i(x xVar) {
        x xVarT;
        i iVarK = k();
        x xVarT2 = t(xVar, iVarK.g(), iVarK.d());
        if (xVarT2 != null) {
            return xVarT2;
        }
        synchronized (f18661b) {
            i iVarK2 = k();
            xVarT = t(xVar, iVarK2.g(), iVarK2.d());
        }
        if (xVarT != null) {
            return xVarT;
        }
        s();
        throw null;
    }

    public static final x j(x xVar, i iVar) {
        x xVarT;
        x xVarT2 = t(xVar, iVar.g(), iVar.d());
        if (xVarT2 != null) {
            return xVarT2;
        }
        synchronized (f18661b) {
            xVarT = t(xVar, iVar.g(), iVar.d());
        }
        if (xVarT != null) {
            return xVarT;
        }
        s();
        throw null;
    }

    public static final i k() {
        i iVar = (i) f18660a.n();
        return iVar == null ? f18667i : iVar;
    }

    public static final c l(c cVar, c cVar2, boolean z10) {
        if (!z10) {
            cVar2 = null;
        }
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            return cVar == null ? cVar2 : cVar;
        }
        return new C1214b(cVar, cVar2, 1);
    }

    public static final x m(x xVar, v vVar) {
        long j10 = f18663d;
        c0 c0Var = f18664e;
        if (c0Var.f2671a > 0) {
            j10 = ((long[]) c0Var.f2673c)[0];
        }
        long j11 = j10 - 1;
        x xVar2 = null;
        x xVar3 = null;
        for (x xVarB = vVar.b(); xVarB != null; xVarB = xVarB.f18696b) {
            long j12 = xVarB.f18695a;
            if (j12 != 0) {
                if (j12 != 0 && j12 <= j11) {
                    long j13 = j12 - 0;
                    boolean z10 = true;
                    if (j13 < 0 || j13 >= 64 ? j13 < 64 || j13 >= 128 || ((1 << (((int) j13) - 64)) & 0) == 0 : ((1 << ((int) j13)) & 0) == 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        if (xVar3 != null) {
                            if (xVarB.f18695a >= xVar3.f18695a) {
                                xVar2 = xVar3;
                                break;
                            }
                            break;
                        }
                        xVar3 = xVarB;
                    } else {
                        continue;
                    }
                }
            }
            xVar2 = xVarB;
            break;
        }
        if (xVar2 != null) {
            xVar2.f18695a = Long.MAX_VALUE;
            return xVar2;
        }
        x xVarB2 = xVar.b(Long.MAX_VALUE);
        xVarB2.f18696b = vVar.b();
        vVar.d(xVarB2);
        return xVarB2;
    }

    public static final x n(x xVar, C c10, i iVar) {
        x xVarM;
        synchronized (f18661b) {
            xVarM = m(xVar, c10);
            xVarM.a(xVar);
            xVarM.f18695a = iVar.g();
        }
        return xVarM;
    }

    public static final void o(i iVar, v vVar) {
        iVar.t(iVar.h() + 1);
        c cVarI = iVar.i();
        if (cVarI != null) {
            cVarI.e(vVar);
        }
    }

    public static final x p(x xVar, w wVar, i iVar, x xVar2) {
        x xVarM;
        if (iVar.f()) {
            iVar.n(wVar);
        }
        long jG = iVar.g();
        if (xVar2.f18695a == jG) {
            return xVar2;
        }
        synchronized (f18661b) {
            xVarM = m(xVar, wVar);
        }
        xVarM.f18695a = jG;
        if (xVar2.f18695a != 1) {
            iVar.n(wVar);
        }
        return xVarM;
    }

    public static final boolean q(v vVar) {
        x xVar;
        long j10 = f18663d;
        c0 c0Var = f18664e;
        if (c0Var.f2671a > 0) {
            j10 = ((long[]) c0Var.f2673c)[0];
        }
        x xVar2 = null;
        x xVarB = null;
        int i10 = 0;
        for (x xVarB2 = vVar.b(); xVarB2 != null; xVarB2 = xVarB2.f18696b) {
            long j11 = xVarB2.f18695a;
            if (j11 != 0) {
                if (j11 >= j10) {
                    i10++;
                } else if (xVar2 == null) {
                    i10++;
                    xVar2 = xVarB2;
                } else {
                    if (j11 < xVar2.f18695a) {
                        xVar = xVar2;
                        xVar2 = xVarB2;
                    } else {
                        xVar = xVarB2;
                    }
                    if (xVarB == null) {
                        xVarB = vVar.b();
                        x xVar3 = xVarB;
                        while (true) {
                            if (xVarB == null) {
                                xVarB = xVar3;
                                break;
                            }
                            long j12 = xVarB.f18695a;
                            if (j12 >= j10) {
                                break;
                            }
                            if (xVar3.f18695a < j12) {
                                xVar3 = xVarB;
                            }
                            xVarB = xVarB.f18696b;
                        }
                    }
                    xVar2.f18695a = 0L;
                    xVar2.a(xVarB);
                    xVar2 = xVar;
                }
            }
        }
        return i10 > 1;
    }

    public static final void r(v vVar) {
        if (q(vVar)) {
            a0 a0Var = f18665f;
            int i10 = a0Var.f2654b;
            int iIdentityHashCode = System.identityHashCode(vVar);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = a0Var.f2654b - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = ((int[]) a0Var.f2655c)[i14];
                    if (i15 < iIdentityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > iIdentityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        m mVar = ((m[]) a0Var.f2656d)[i14];
                        if (vVar == (mVar != null ? mVar.get() : null)) {
                            i11 = i14;
                            break;
                        }
                        int i16 = i14 - 1;
                        while (true) {
                            if (-1 >= i16 || ((int[]) a0Var.f2655c)[i16] != iIdentityHashCode) {
                                i14++;
                                int i17 = a0Var.f2654b;
                                while (true) {
                                    if (i14 >= i17) {
                                        i11 = -(a0Var.f2654b + 1);
                                        break;
                                    }
                                    if (((int[]) a0Var.f2655c)[i14] != iIdentityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    m mVar2 = ((m[]) a0Var.f2656d)[i14];
                                    if ((mVar2 != null ? mVar2.get() : null) == vVar) {
                                        i11 = i14;
                                        break;
                                    }
                                    i14++;
                                }
                            } else {
                                m mVar3 = ((m[]) a0Var.f2656d)[i16];
                                if ((mVar3 != null ? mVar3.get() : null) == vVar) {
                                    i11 = i16;
                                    break;
                                }
                                i16--;
                            }
                        }
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            m[] mVarArr = (m[]) a0Var.f2656d;
            int length = mVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                m[] mVarArr2 = new m[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(mVarArr, i18, mVarArr2, i20, i10 - i18);
                System.arraycopy((m[]) a0Var.f2656d, 0, mVarArr2, 0, i18);
                l.W(i20, i18, i10, (int[]) a0Var.f2655c, iArr);
                l.a0(0, i18, 6, (int[]) a0Var.f2655c, iArr);
                a0Var.f2656d = mVarArr2;
                a0Var.f2655c = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(mVarArr, i18, mVarArr, i21, i10 - i18);
                int[] iArr2 = (int[]) a0Var.f2655c;
                l.W(i21, i18, i10, iArr2, iArr2);
            }
            ((m[]) a0Var.f2656d)[i18] = new m(vVar);
            ((int[]) a0Var.f2655c)[i18] = iIdentityHashCode;
            a0Var.f2654b++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final x t(x xVar, long j10, m mVar) {
        x xVar2 = null;
        while (xVar != null) {
            long j11 = xVar.f18695a;
            if (j11 != 0 && j11 <= j10 && !mVar.d(j11) && (xVar2 == null || xVar2.f18695a < xVar.f18695a)) {
                xVar2 = xVar;
            }
            xVar = xVar.f18696b;
        }
        if (xVar2 != null) {
            return xVar2;
        }
        return null;
    }

    public static final x u(x xVar, v vVar) {
        x xVarT;
        i iVarK = k();
        c cVarE = iVarK.e();
        if (cVarE != null) {
            cVarE.e(vVar);
        }
        x xVarT2 = t(xVar, iVarK.g(), iVarK.d());
        if (xVarT2 != null) {
            return xVarT2;
        }
        synchronized (f18661b) {
            i iVarK2 = k();
            x xVarB = vVar.b();
            j.c(xVarB, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            xVarT = t(xVarB, iVarK2.g(), iVarK2.d());
            if (xVarT == null) {
                s();
                throw null;
            }
        }
        return xVarT;
    }

    public static final void v(int i10) {
        c0 c0Var = f18664e;
        int i11 = ((int[]) c0Var.f2675e)[i10];
        c0Var.c(i11, c0Var.f2671a - 1);
        c0Var.f2671a--;
        long[] jArr = (long[]) c0Var.f2673c;
        long j10 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (jArr[i13] <= j10) {
                break;
            }
            c0Var.c(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) c0Var.f2673c;
        int i14 = c0Var.f2671a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < c0Var.f2671a) {
                long j11 = jArr2[i15];
                if (j11 < jArr2[i16]) {
                    if (j11 >= jArr2[i11]) {
                        break;
                    }
                    c0Var.c(i15, i11);
                    i11 = i15;
                }
            }
            if (jArr2[i16] >= jArr2[i11]) {
                break;
            }
            c0Var.c(i16, i11);
            i11 = i16;
        }
        ((int[]) c0Var.f2675e)[i10] = c0Var.f2672b;
        c0Var.f2672b = i10;
    }

    public static final Object w(d dVar, c cVar) {
        long j10 = dVar.f18645b;
        Object objE = cVar.e(f18662c.c(j10));
        long j11 = f18663d;
        f18663d = 1 + j11;
        m mVarC = f18662c.c(j10);
        f18662c = mVarC;
        dVar.f18645b = j11;
        dVar.f18644a = mVarC;
        dVar.g = 0;
        dVar.f18633h = null;
        dVar.o();
        f18662c = f18662c.f(j11);
        return objE;
    }

    public static final x x(x xVar, v vVar, i iVar) {
        x xVarT;
        if (iVar.f()) {
            iVar.n(vVar);
        }
        long jG = iVar.g();
        x xVarT2 = t(xVar, jG, iVar.d());
        if (xVarT2 == null) {
            s();
            throw null;
        }
        if (xVarT2.f18695a == iVar.g()) {
            return xVarT2;
        }
        synchronized (f18661b) {
            xVarT = t(vVar.b(), jG, iVar.d());
            if (xVarT == null) {
                s();
                throw null;
            }
            if (xVarT.f18695a != jG) {
                x xVarM = m(xVarT, vVar);
                xVarM.a(xVarT);
                xVarM.f18695a = iVar.g();
                xVarT = xVarM;
            }
        }
        if (xVarT2.f18695a != 1) {
            iVar.n(vVar);
        }
        return xVarT;
    }
}
