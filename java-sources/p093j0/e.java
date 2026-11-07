package p093j0;

import Z.AbstractC0689j0;
import java.util.ArrayList;
import java.util.HashMap;
import p011b0.h;
import p074h0.i;
import p110k9.j;
import p120l9.m;
import p120l9.r;
import p241y9.c;
import u.F;
import u.N;

/* JADX INFO: loaded from: classes.dex */
public class e extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f18630n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f18631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f18632f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public F f18633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f18634i;
    public m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f18635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18637m;

    public e(long j, m mVar, c cVar, c cVar2) {
        super(j, mVar);
        this.f18631e = cVar;
        this.f18632f = cVar2;
        this.j = m.f18655v;
        this.f18635k = f18630n;
        this.f18636l = 1;
    }

    public final void A(long j) {
        synchronized (n.f18661b) {
            this.j = this.j.f(j);
        }
    }

    public final void B(m mVar) {
        synchronized (n.f18661b) {
            this.j = this.j.e(mVar);
        }
    }

    public void C(F f3) {
        this.f18633h = f3;
    }

    public e D(c cVar, c cVar2) throws Throwable {
        if (this.f18646c) {
            AbstractC0689j0.a("Cannot use a disposed snapshot");
        }
        if (this.f18637m && this.f18647d < 0) {
            AbstractC0689j0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = n.f18661b;
        synchronized (obj) {
            try {
                long j = n.f18663d;
                n.f18663d = j + 1;
                n.f18662c = n.f18662c.f(j);
                m mVarD = d();
                r(mVarD.f(j));
                try {
                    f fVar = new f(j, n.e(mVarD, g() + 1, j), n.l(cVar, e(), true), n.b(cVar2, i()), this);
                    if (this.f18637m || this.f18646c) {
                        return fVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j10 = n.f18663d;
                        n.f18663d = j10 + 1;
                        s(j10);
                        n.f18662c = n.f18662c.f(g());
                    }
                    r(n.e(d(), jG + 1, g()));
                    return fVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p093j0.i
    public final void b() {
        n.f18662c = n.f18662c.c(g()).b(this.j);
    }

    @Override // p093j0.i
    public void c() {
        if (this.f18646c) {
            return;
        }
        this.f18646c = true;
        synchronized (n.f18661b) {
            o();
        }
        l();
    }

    @Override // p093j0.i
    public boolean f() {
        return false;
    }

    @Override // p093j0.i
    public int h() {
        return this.g;
    }

    @Override // p093j0.i
    public c i() {
        return this.f18632f;
    }

    @Override // p093j0.i
    public void k() {
        this.f18636l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p093j0.i
    public void l() {
        if (this.f18636l <= 0) {
            AbstractC0689j0.a("no pending nested snapshots");
        }
        int i10 = this.f18636l - 1;
        this.f18636l = i10;
        if (i10 != 0 || this.f18637m) {
            return;
        }
        F fX = x();
        if (fX != null) {
            if (this.f18637m) {
                AbstractC0689j0.b("Unsupported operation on a snapshot that has been applied");
            }
            C(null);
            long jG = g();
            Object[] objArr = fX.f22676b;
            long[] jArr = fX.f22675a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j = jArr[i11];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j) < 128) {
                                for (x xVarB = ((v) objArr[(i11 << 3) + i13]).b(); xVarB != null; xVarB = xVarB.f18696b) {
                                    long j10 = xVarB.f18695a;
                                    if (j10 == jG || m.e0(this.j, Long.valueOf(j10))) {
                                        i iVar = n.f18660a;
                                        xVarB.f18695a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // p093j0.i
    public void m() {
        if (this.f18637m || this.f18646c) {
            return;
        }
        v();
    }

    @Override // p093j0.i
    public void n(v vVar) {
        F fX = x();
        if (fX == null) {
            int i10 = N.f22700a;
            fX = new F();
            C(fX);
        }
        fX.a(vVar);
    }

    @Override // p093j0.i
    public final void p() {
        int length = this.f18635k.length;
        for (int i10 = 0; i10 < length; i10++) {
            n.v(this.f18635k[i10]);
        }
        o();
    }

    @Override // p093j0.i
    public void t(int i10) {
        this.g = i10;
    }

    @Override // p093j0.i
    public i u(c cVar) throws Throwable {
        if (this.f18646c) {
            AbstractC0689j0.a("Cannot use a disposed snapshot");
        }
        if (this.f18637m && this.f18647d < 0) {
            AbstractC0689j0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = n.f18661b;
        synchronized (obj) {
            try {
                long j = n.f18663d;
                n.f18663d = j + 1;
                n.f18662c = n.f18662c.f(j);
                try {
                    g gVar = new g(j, n.e(d(), jG + 1, j), n.l(cVar, e(), true), this);
                    if (this.f18637m || this.f18646c) {
                        return gVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j10 = n.f18663d;
                        n.f18663d = j10 + 1;
                        s(j10);
                        n.f18662c = n.f18662c.f(g());
                    }
                    r(n.e(d(), jG2 + 1, g()));
                    return gVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        A(g());
        if (this.f18637m || this.f18646c) {
            return;
        }
        long jG = g();
        synchronized (n.f18661b) {
            long j = n.f18663d;
            n.f18663d = j + 1;
            s(j);
            n.f18662c = n.f18662c.f(g());
        }
        r(n.e(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0198 A[EDGE_INSN: B:101:0x0198->B:77:0x0198 BREAK  A[LOOP:4: B:66:0x0168->B:76:0x0195], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0152 A[Catch: all -> 0x0147, LOOP:2: B:48:0x011e->B:60:0x0152, LOOP_END, TryCatch #0 {all -> 0x0147, blocks: (B:43:0x0101, B:45:0x0110, B:48:0x011e, B:50:0x012b, B:52:0x0135, B:54:0x013b, B:57:0x014a, B:63:0x015e, B:66:0x0168, B:68:0x0173, B:70:0x017d, B:72:0x0183, B:73:0x018d, B:76:0x0195, B:77:0x0198, B:79:0x019c, B:81:0x01a3, B:82:0x01af, B:60:0x0152), top: B:90:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0195 A[Catch: all -> 0x0147, LOOP:4: B:66:0x0168->B:76:0x0195, LOOP_END, TryCatch #0 {all -> 0x0147, blocks: (B:43:0x0101, B:45:0x0110, B:48:0x011e, B:50:0x012b, B:52:0x0135, B:54:0x013b, B:57:0x014a, B:63:0x015e, B:66:0x0168, B:68:0x0173, B:70:0x017d, B:72:0x0183, B:73:0x018d, B:76:0x0195, B:77:0x0198, B:79:0x019c, B:81:0x01a3, B:82:0x01af, B:60:0x0152), top: B:90:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[EDGE_INSN: B:96:0x015c->B:62:0x015c BREAK  A[LOOP:2: B:48:0x011e->B:60:0x0152], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Collection, java.util.List] */
    public s w() {
        HashMap mapC;
        ?? r10;
        F f3;
        long j;
        long j10;
        char c10;
        F fX = x();
        if (fX != null) {
            long j11 = n.f18667i.f18645b;
            mapC = n.c(j11, this, n.f18662c.c(j11));
        } else {
            mapC = null;
        }
        r rVar = r.f19440r;
        synchronized (n.f18661b) {
            try {
                n.d(this);
                if (fX == null || fX.f22678d == 0) {
                    b();
                    d dVar = n.f18667i;
                    F f7 = dVar.f18633h;
                    long j12 = dVar.f18645b;
                    n.f18662c.c(j12);
                    long j13 = n.f18663d;
                    n.f18663d = 1 + j13;
                    m mVarC = n.f18662c.c(j12);
                    n.f18662c = mVarC;
                    dVar.f18645b = j13;
                    dVar.f18644a = mVarC;
                    dVar.g = 0;
                    dVar.f18633h = null;
                    dVar.o();
                    n.f18662c = n.f18662c.f(j13);
                    if (f7 == null || !f7.h()) {
                        r10 = rVar;
                        f3 = null;
                    } else {
                        r10 = n.g;
                        f3 = f7;
                    }
                } else {
                    d dVar2 = n.f18667i;
                    s sVarZ = z(n.f18663d, fX, mapC, n.f18662c.c(dVar2.f18645b));
                    if (!sVarZ.equals(k.f18648b)) {
                        return sVarZ;
                    }
                    b();
                    f3 = dVar2.f18633h;
                    long j14 = dVar2.f18645b;
                    n.f18662c.c(j14);
                    long j15 = n.f18663d;
                    n.f18663d = 1 + j15;
                    m mVarC2 = n.f18662c.c(j14);
                    n.f18662c = mVarC2;
                    dVar2.f18645b = j15;
                    dVar2.f18644a = mVarC2;
                    dVar2.g = 0;
                    dVar2.f18633h = null;
                    dVar2.o();
                    n.f18662c = n.f18662c.f(j15);
                    C(null);
                    dVar2.f18633h = null;
                    r10 = n.g;
                }
                this.f18637m = true;
                if (f3 != null) {
                    h hVar = new h(f3);
                    if (!f3.g()) {
                        int size = r10.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((p241y9.e) r10.get(i10)).invoke(hVar, this);
                        }
                    }
                }
                if (fX != null && fX.h()) {
                    h hVar2 = new h(fX);
                    int size2 = r10.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((p241y9.e) r10.get(i11)).invoke(hVar2, this);
                    }
                }
                synchronized (n.f18661b) {
                    try {
                        p();
                        n.g();
                        if (f3 != null) {
                            Object[] objArr = f3.f22676b;
                            long[] jArr = f3.f22675a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                j = 128;
                                j10 = 255;
                                while (true) {
                                    long j16 = jArr[i12];
                                    c10 = 7;
                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j16 & 255) < 128) {
                                                n.r((v) objArr[(i12 << 3) + i14]);
                                            }
                                            j16 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                j = 128;
                                j10 = 255;
                                c10 = 7;
                            }
                        } else {
                            j = 128;
                            j10 = 255;
                            c10 = 7;
                        }
                        if (fX != null) {
                            Object[] objArr2 = fX.f22676b;
                            long[] jArr2 = fX.f22675a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j17 = jArr2[i15];
                                    if ((((~j17) << c10) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 != length2) {
                                            break;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j17 & j10) < j) {
                                                n.r((v) objArr2[(i15 << 3) + i17]);
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f18634i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                n.r((v) arrayList.get(i18));
                            }
                        }
                        this.f18634i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return k.f18648b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public F x() {
        return this.f18633h;
    }

    @Override // p093j0.i
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c e() {
        return this.f18631e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final s z(long j, F f3, HashMap map, m mVar) {
        ArrayList arrayList;
        ArrayList arrayListQ0;
        ArrayList arrayList2;
        int size;
        int i10;
        ArrayList arrayList3;
        int size2;
        int i11;
        v vVar;
        x xVar;
        m mVar2;
        Object[] objArr;
        long[] jArr;
        m mVar3;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        long j10;
        ArrayList arrayList4;
        x xVarC;
        m mVarE = d().f(g()).e(this.j);
        Object[] objArr3 = f3.f22676b;
        long[] jArr3 = f3.f22675a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i13 = 0;
            arrayList2 = null;
            arrayListQ0 = null;
            while (true) {
                long j11 = jArr3[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & 255) < 128) {
                            objArr2 = objArr3;
                            v vVar2 = (v) objArr3[(i13 << 3) + i15];
                            jArr2 = jArr3;
                            x xVarB = vVar2.b();
                            i12 = i15;
                            ArrayList arrayList5 = arrayList2;
                            x xVarT = n.t(xVarB, j, mVar);
                            if (xVarT == null) {
                                mVar3 = mVarE;
                                arrayList4 = arrayListQ0;
                                j10 = j11;
                            } else {
                                arrayList4 = arrayListQ0;
                                j10 = j11;
                                x xVarT2 = n.t(xVarB, g(), mVarE);
                                if (xVarT2 == null) {
                                    mVar3 = mVarE;
                                } else {
                                    mVar3 = mVarE;
                                    if (xVarT2.f18695a != 1 && !xVarT.equals(xVarT2)) {
                                        x xVarT3 = n.t(xVarB, g(), d());
                                        if (xVarT3 == null) {
                                            n.s();
                                            throw null;
                                        }
                                        if (map == null || (xVarC = (x) map.get(xVarT)) == null) {
                                            xVarC = vVar2.c(xVarT2, xVarT, xVarT3);
                                        }
                                        if (xVarC == null) {
                                            return new j();
                                        }
                                        if (!xVarC.equals(xVarT3)) {
                                            if (xVarC.equals(xVarT)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new j(vVar2, xVarT.b(g())));
                                                arrayListQ0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListQ0.add(vVar2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!xVarC.equals(xVarT2) ? new j(vVar2, xVarC) : new j(vVar2, xVarT2.b(g())));
                                            }
                                        }
                                        arrayListQ0 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListQ0 = arrayList4;
                        } else {
                            mVar3 = mVarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i12 = i15;
                            j10 = j11;
                        }
                        j11 = j10 >> 8;
                        i15 = i12 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        mVarE = mVar3;
                    }
                    mVar2 = mVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    mVar2 = mVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i13 != length) {
                    i13++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    mVarE = mVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i11 = 0; i11 < size2; i11++) {
                    j jVar = (j) arrayList2.get(i11);
                    vVar = (v) jVar.f19077r;
                    xVar = (x) jVar.f19078s;
                    xVar.f18695a = j;
                    synchronized (n.f18661b) {
                        xVar.f18696b = vVar.b();
                        vVar.d(xVar);
                    }
                }
            }
            if (arrayListQ0 != null) {
                size = arrayListQ0.size();
                for (i10 = 0; i10 < size; i10++) {
                    f3.l((v) arrayListQ0.get(i10));
                }
                arrayList3 = this.f18634i;
                if (arrayList3 != null) {
                    arrayListQ0 = m.q0(arrayList3, arrayListQ0);
                }
                this.f18634i = arrayListQ0;
            }
            return k.f18648b;
        }
        arrayList = null;
        arrayListQ0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i11 < size2) {
                j jVar2 = (j) arrayList2.get(i11);
                vVar = (v) jVar2.f19077r;
                xVar = (x) jVar2.f19078s;
                xVar.f18695a = j;
                synchronized (n.f18661b) {
                    xVar.f18696b = vVar.b();
                    vVar.d(xVar);
                }
            }
        }
        if (arrayListQ0 != null) {
            size = arrayListQ0.size();
            while (i10 < size) {
                f3.l((v) arrayListQ0.get(i10));
            }
            arrayList3 = this.f18634i;
            if (arrayList3 != null) {
                arrayListQ0 = m.q0(arrayList3, arrayListQ0);
            }
            this.f18634i = arrayListQ0;
        }
        return k.f18648b;
    }
}
