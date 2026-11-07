package p196u0;

import A6.a;
import N9.b0;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.v4.media.session.p;
import p063g1.m;
import p074h0.i;
import p180s0.C1297f;
import p180s0.C1303l;
import p180s0.E;
import p180s0.F;
import p180s0.o;
import p180s0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f22794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f22795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b0 f22796t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b0 f22797u;

    public b() {
        a aVar = new a();
        aVar.f22790a = c.f22798a;
        aVar.f22791b = m.f16261r;
        aVar.f22792c = e.f22799a;
        aVar.f22793d = 0L;
        this.f22794r = aVar;
        this.f22795s = new i(this);
    }

    public static b0 a(b bVar, long j, c cVar, int i10) {
        b0 b0VarE = bVar.e(cVar);
        Paint paint = (Paint) b0VarE.f6165b;
        if (!q.c(F.c(paint.getColor()), j)) {
            b0VarE.e(j);
        }
        if (((Shader) b0VarE.f6166c) != null) {
            b0VarE.h(null);
        }
        if (!j.a((C1303l) b0VarE.f6167d, null)) {
            b0VarE.f(null);
        }
        if (b0VarE.f6164a != i10) {
            b0VarE.d(i10);
        }
        if (paint.isFilterBitmap()) {
            return b0VarE;
        }
        b0VarE.g(1);
        return b0VarE;
    }

    @Override // p063g1.c
    public final /* synthetic */ int E(float f3) {
        return p.c(this, f3);
    }

    @Override // p196u0.d
    public final long I() {
        return p171r0.j.d(this.f22795s.v());
    }

    @Override // p196u0.d
    public final void K(long j, int i10, long j10, float f3) {
        this.f22794r.f22792c.h(f3, j10, a(this, j, f.f22800b, i10));
    }

    @Override // p063g1.c
    public final /* synthetic */ long M(long j) {
        return p.h(j, this);
    }

    @Override // p196u0.d
    public final void O(E e10, F f3, float f7, c cVar, int i10) {
        this.f22794r.f22792c.d(e10, c(f3, cVar, f7, null, i10, 1));
    }

    @Override // p063g1.c
    public final /* synthetic */ float Q(long j) {
        return p.g(j, this);
    }

    @Override // p196u0.d
    public final void W(long j, long j10, long j11, float f3, int i10, int i11) {
        o oVar = this.f22794r.f22792c;
        b0 b0VarG = this.f22797u;
        if (b0VarG == null) {
            b0VarG = F.g();
            b0VarG.l(1);
            this.f22797u = b0VarG;
        }
        Paint paint = (Paint) b0VarG.f6165b;
        if (!q.c(F.c(paint.getColor()), j)) {
            b0VarG.e(j);
        }
        if (((Shader) b0VarG.f6166c) != null) {
            b0VarG.h(null);
        }
        if (!j.a((C1303l) b0VarG.f6167d, null)) {
            b0VarG.f(null);
        }
        if (b0VarG.f6164a != i11) {
            b0VarG.d(i11);
        }
        if (paint.getStrokeWidth() != f3) {
            b0VarG.k(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (b0VarG.a() != i10) {
            b0VarG.i(i10);
        }
        if (b0VarG.b() != 0) {
            b0VarG.j(0);
        }
        if (!paint.isFilterBitmap()) {
            b0VarG.g(1);
        }
        oVar.p(j10, j11, b0VarG);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return p.i(this, d0(f3));
    }

    @Override // p196u0.d
    public final long b() {
        return this.f22795s.v();
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return i10 / getDensity();
    }

    public final b0 c(F f3, c cVar, float f7, C1303l c1303l, int i10, int i11) {
        b0 b0VarE = e(cVar);
        if (f3 != null) {
            f3.j(f7, this.f22795s.v(), b0VarE);
        } else {
            Paint paint = (Paint) b0VarE.f6165b;
            if (((Shader) b0VarE.f6166c) != null) {
                b0VarE.h(null);
            }
            long jC = F.c(paint.getColor());
            long j = q.f21839b;
            if (!q.c(jC, j)) {
                b0VarE.e(j);
            }
            if (paint.getAlpha() / 255.0f != f7) {
                b0VarE.c(f7);
            }
        }
        if (!j.a((C1303l) b0VarE.f6167d, c1303l)) {
            b0VarE.f(c1303l);
        }
        if (b0VarE.f6164a != i10) {
            b0VarE.d(i10);
        }
        if (((Paint) b0VarE.f6165b).isFilterBitmap() == i11) {
            return b0VarE;
        }
        b0VarE.g(i11);
        return b0VarE;
    }

    public final void d(C1297f c1297f, C1303l c1303l) {
        this.f22794r.f22792c.f(c1297f, c(null, f.f22800b, 1.0f, c1303l, 3, 1));
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / getDensity();
    }

    public final b0 e(c cVar) {
        if (j.a(cVar, f.f22800b)) {
            b0 b0Var = this.f22796t;
            if (b0Var != null) {
                return b0Var;
            }
            b0 b0VarG = F.g();
            b0VarG.l(0);
            this.f22796t = b0VarG;
            return b0VarG;
        }
        if (!(cVar instanceof g)) {
            throw new a();
        }
        b0 b0VarG2 = this.f22797u;
        if (b0VarG2 == null) {
            b0VarG2 = F.g();
            b0VarG2.l(1);
            this.f22797u = b0VarG2;
        }
        Paint paint = (Paint) b0VarG2.f6165b;
        float strokeWidth = paint.getStrokeWidth();
        g gVar = (g) cVar;
        float f3 = gVar.f22801b;
        if (strokeWidth != f3) {
            b0VarG2.k(f3);
        }
        int iA = b0VarG2.a();
        int i10 = gVar.f22803d;
        if (iA != i10) {
            b0VarG2.i(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f7 = gVar.f22802c;
        if (strokeMiter != f7) {
            paint.setStrokeMiter(f7);
        }
        int iB = b0VarG2.b();
        int i11 = gVar.f22804e;
        if (iB == i11) {
            return b0VarG2;
        }
        b0VarG2.j(i11);
        return b0VarG2;
    }

    @Override // p196u0.d
    public final void e0(long j, float f3, float f7, boolean z10, long j10, long j11, c cVar) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.f22794r.f22792c.c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), f3, f7, z10, a(this, j, cVar, 3));
    }

    @Override // p196u0.d
    public final void f0(int i10, long j, long j10, long j11) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.f22794r.f22792c.o(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i12), a(this, j, f.f22800b, i10));
    }

    @Override // p196u0.d
    public final void g(C1297f c1297f, long j, long j10, long j11, float f3, C1303l c1303l, int i10) {
        this.f22794r.f22792c.j(c1297f, j, j10, j11, c(null, f.f22800b, f3, c1303l, 3, i10));
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f22794r.f22790a.getDensity();
    }

    @Override // p196u0.d
    public final m getLayoutDirection() {
        return this.f22794r.f22791b;
    }

    @Override // p196u0.d
    public final void k(E e10, long j) {
        this.f22794r.f22792c.d(e10, a(this, j, f.f22800b, 3));
    }

    @Override // p063g1.c
    public final float n() {
        return this.f22794r.f22790a.n();
    }

    @Override // p196u0.d
    public final void u(long j, long j10, long j11, long j12) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.f22794r.f22792c.k(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), a(this, j, f.f22800b, 3));
    }

    @Override // p063g1.c
    public final /* synthetic */ long v(long j) {
        return p.f(j, this);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return getDensity() * f3;
    }

    @Override // p196u0.d
    public final i y() {
        return this.f22795s;
    }

    @Override // p063g1.c
    public final /* synthetic */ float z(long j) {
        return p.e(j, this);
    }
}
