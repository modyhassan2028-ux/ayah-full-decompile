package G;

import A.C0007a;
import A.M0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements p085i0.j, p085i0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p085i0.k f2647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p085i0.c f2648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.F f2649c;

    public Y(p085i0.j jVar, Map map, p085i0.c cVar) {
        M0 m10 = new M0(8, jVar);
        Z.M0 m11 = p085i0.l.f16731a;
        this.f2647a = new p085i0.k(map, m10);
        this.f2648b = cVar;
        int i10 = u.N.f22700a;
        this.f2649c = new u.F();
    }

    @Override // p085i0.c
    public final void a(Object obj, p074h0.d dVar, C0698o c0698o, int i10) {
        c0698o.T(-697180401);
        this.f2648b.a(obj, dVar, c0698o, i10 & 126);
        boolean zI = c0698o.i(this) | c0698o.i(obj);
        Object objH = c0698o.H();
        if (zI || objH == C0690k.f10683a) {
            objH = new C0007a(7, this, obj);
            c0698o.e0(objH);
        }
        C0672b.d(obj, (p241y9.c) objH, c0698o);
        c0698o.p(false);
    }

    @Override // p085i0.j
    public final boolean b(Object obj) {
        return this.f2647a.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // p085i0.j
    public final Map c() {
        u.F f3 = this.f2649c;
        Object[] objArr = f3.f22676b;
        long[] jArr = f3.f22675a;
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
                            this.f2648b.f(objArr[(i10 << 3) + i12]);
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return this.f2647a.c();
    }

    @Override // p085i0.j
    public final Object d(String str) {
        return this.f2647a.d(str);
    }

    @Override // p085i0.j
    public final p085i0.i e(String str, p241y9.a aVar) {
        return this.f2647a.e(str, aVar);
    }

    @Override // p085i0.c
    public final void f(Object obj) {
        this.f2648b.f(obj);
    }
}
