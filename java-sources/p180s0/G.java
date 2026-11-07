package p180s0;

import android.support.v4.media.session.p;
import p063g1.c;
import p063g1.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class G implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f21778A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f21779B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f21780C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public J f21781D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f21782E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f21783F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public c f21784G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public m f21785H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public F f21786I;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f21788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f21789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f21790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f21791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f21792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f21793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f21794y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f21795z;

    @Override // p063g1.c
    public final /* synthetic */ int E(float f3) {
        return p.c(this, f3);
    }

    @Override // p063g1.c
    public final /* synthetic */ long M(long j) {
        return p.h(j, this);
    }

    @Override // p063g1.c
    public final /* synthetic */ float Q(long j) {
        return p.g(j, this);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return p.i(this, d0(f3));
    }

    public final void a(float f3) {
        if (this.f21790u == f3) {
            return;
        }
        this.f21787r |= 4;
        this.f21790u = f3;
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return i10 / getDensity();
    }

    public final void c(long j) {
        if (q.c(this.f21794y, j)) {
            return;
        }
        this.f21787r |= 64;
        this.f21794y = j;
    }

    public final void d(boolean z10) {
        if (this.f21782E != z10) {
            this.f21787r |= 16384;
            this.f21782E = z10;
        }
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / getDensity();
    }

    public final void e(float f3) {
        if (this.f21788s == f3) {
            return;
        }
        this.f21787r |= 1;
        this.f21788s = f3;
    }

    public final void f(float f3) {
        if (this.f21789t == f3) {
            return;
        }
        this.f21787r |= 2;
        this.f21789t = f3;
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f21784G.getDensity();
    }

    public final void h(float f3) {
        if (this.f21793x == f3) {
            return;
        }
        this.f21787r |= 32;
        this.f21793x = f3;
    }

    public final void i(J j) {
        if (j.a(this.f21781D, j)) {
            return;
        }
        this.f21787r |= 8192;
        this.f21781D = j;
    }

    public final void j(long j) {
        if (q.c(this.f21795z, j)) {
            return;
        }
        this.f21787r |= 128;
        this.f21795z = j;
    }

    public final void l(long j) {
        if (M.a(this.f21780C, j)) {
            return;
        }
        this.f21787r |= 4096;
        this.f21780C = j;
    }

    public final void m(float f3) {
        if (this.f21791v == f3) {
            return;
        }
        this.f21787r |= 8;
        this.f21791v = f3;
    }

    @Override // p063g1.c
    public final float n() {
        return this.f21784G.n();
    }

    public final void o(float f3) {
        if (this.f21792w == f3) {
            return;
        }
        this.f21787r |= 16;
        this.f21792w = f3;
    }

    @Override // p063g1.c
    public final /* synthetic */ long v(long j) {
        return p.f(j, this);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return getDensity() * f3;
    }

    @Override // p063g1.c
    public final /* synthetic */ float z(long j) {
        return p.e(j, this);
    }
}
