package p205v0;

import B9.a;
import D0.y;
import N9.b0;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import p063g1.c;
import p063g1.m;
import p085i0.f;
import p171r0.e;
import p171r0.h;
import p171r0.i;
import p180s0.B;
import p180s0.C;
import p180s0.C1300i;
import p180s0.D;
import p180s0.E;
import p180s0.F;
import p196u0.d;
import p251z9.k;
import u.N;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23004a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f23009f;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F f23012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public E f23013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1300i f23014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p196u0.b f23016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0 f23017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23018q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f23021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f23022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f23023v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f23025x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f23005b = p196u0.c.f22798a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f23006c = m.f16261r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f23007d = a.f23001s;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f23008e = new f(9, this);
    public boolean g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23010h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23011i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f23019r = new y();

    static {
        int i10 = i.f23091a;
        int i11 = i.f23091a;
    }

    public b(d dVar) {
        this.f23004a = dVar;
        dVar.v(false);
        this.f23021t = 0L;
        this.f23022u = 0L;
        this.f23023v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z10 = this.f23024w;
            Outline outline2 = null;
            d dVar = this.f23004a;
            if (z10 || dVar.E() > 0.0f) {
                E e10 = this.f23013l;
                if (e10 != null) {
                    RectF rectF = this.f23025x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f23025x = rectF;
                    }
                    boolean z11 = e10 instanceof C1300i;
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((C1300i) e10).f21829a.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || ((C1300i) e10).f21829a.isConvex()) {
                        outline = this.f23009f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f23009f = outline;
                        }
                        if (i10 >= 30) {
                            B1.b.h(outline, e10);
                        } else {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((C1300i) e10).f21829a);
                        }
                        this.f23015n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f23009f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f23015n = true;
                        outline = null;
                    }
                    this.f23013l = e10;
                    if (outline != null) {
                        outline.setAlpha(dVar.c());
                        outline2 = outline;
                    }
                    dVar.r(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f23015n && this.f23024w) {
                        dVar.v(false);
                        dVar.j();
                    } else {
                        dVar.v(this.f23024w);
                    }
                } else {
                    dVar.v(this.f23024w);
                    Outline outline4 = this.f23009f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f23009f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jD0 = a.d0(this.f23022u);
                    long j = this.f23010h;
                    long j10 = this.f23011i;
                    if (j10 != 9205357640488583168L) {
                        jD0 = j10;
                    }
                    int i11 = (int) (j >> 32);
                    int i12 = (int) (j & 4294967295L);
                    int i13 = (int) (jD0 >> 32);
                    int i14 = (int) (jD0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i14) + Float.intBitsToFloat(i12)), this.j);
                    outline5.setAlpha(dVar.c());
                    dVar.r(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i14)))) | (((long) Math.round(Float.intBitsToFloat(i13))) << 32));
                }
            } else {
                dVar.v(false);
                dVar.r(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[LOOP:0: B:14:0x0027->B:24:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[EDGE_INSN: B:29:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:14:0x0027->B:24:0x005e], SYNTHETIC] */
    public final void b() {
        if (this.f23020s && this.f23018q == 0) {
            y yVar = this.f23019r;
            b bVar = (b) yVar.f1158s;
            if (bVar != null) {
                bVar.e();
                yVar.f1158s = null;
            }
            u.F f3 = (u.F) yVar.f1160u;
            if (f3 != null) {
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
                                    ((b) objArr[(i10 << 3) + i12]).e();
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
                f3.b();
            }
            this.f23004a.j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[LOOP:0: B:20:0x0053->B:30:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[EDGE_INSN: B:34:0x008d->B:31:0x008d BREAK  A[LOOP:0: B:20:0x0053->B:30:0x008a], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [y9.c, z9.k] */
    public final void c(d dVar) {
        y yVar = this.f23019r;
        yVar.f1159t = (b) yVar.f1158s;
        u.F f3 = (u.F) yVar.f1160u;
        if (f3 != null && f3.h()) {
            u.F f7 = (u.F) yVar.f1161v;
            if (f7 == null) {
                int i10 = N.f22700a;
                f7 = new u.F();
                yVar.f1161v = f7;
            }
            f7.k(f3);
            f3.b();
        }
        yVar.f1157r = true;
        this.f23007d.e(dVar);
        yVar.f1157r = false;
        b bVar = (b) yVar.f1159t;
        if (bVar != null) {
            bVar.e();
        }
        u.F f10 = (u.F) yVar.f1161v;
        if (f10 == null || !f10.h()) {
            return;
        }
        Object[] objArr = f10.f22676b;
        long[] jArr = f10.f22675a;
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
                            ((b) objArr[(i11 << 3) + i13]).e();
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
        f10.b();
    }

    public final F d() {
        F c10;
        F f3 = this.f23012k;
        E e10 = this.f23013l;
        if (f3 != null) {
            return f3;
        }
        if (e10 != null) {
            B b5 = new B(e10);
            this.f23012k = b5;
            return b5;
        }
        long jD0 = a.d0(this.f23022u);
        long j = this.f23010h;
        long j10 = this.f23011i;
        if (j10 != 9205357640488583168L) {
            jD0 = j10;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD0 & 4294967295L)) + fIntBitsToFloat2;
        float f7 = this.j;
        if (f7 > 0.0f) {
            c10 = new D(h.a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f7)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f7)))));
        } else {
            c10 = new C(new e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f23012k = c10;
        return c10;
    }

    public final void e() {
        this.f23018q--;
        b();
    }

    public final void f(float f3) {
        d dVar = this.f23004a;
        if (dVar.c() == f3) {
            return;
        }
        dVar.e(f3);
    }

    public final void g(long j, long j10, float f3) {
        if (p171r0.c.b(this.f23010h, j) && i.a(this.f23011i, j10) && this.j == f3 && this.f23013l == null) {
            return;
        }
        this.f23012k = null;
        this.f23013l = null;
        this.g = true;
        this.f23015n = false;
        this.f23010h = j;
        this.f23011i = j10;
        this.j = f3;
        a();
    }
}
