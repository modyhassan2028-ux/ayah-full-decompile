package W;

import p223x.AbstractC1413d;
import p223x.C1411c;

/* JADX INFO: renamed from: W.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0576l implements C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2 f9222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1411c f9225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p232y.V f9226e = new p232y.V();

    public C0576l(C2 c10) {
        this.f9222a = c10;
        this.f9223b = ((c10.f() % 12) * 0.5235988f) - 1.5707964f;
        this.f9224c = (c10.g() * 0.10471976f) - 1.5707964f;
        this.f9225d = AbstractC1413d.a(this.f9223b);
    }

    public static float k(float f3) {
        double d5 = ((double) f3) % 6.283185307179586d;
        if (d5 < 0.0d) {
            d5 += 6.283185307179586d;
        }
        return (float) d5;
    }

    @Override // W.C2
    public final void a(boolean z10) {
        this.f9222a.a(z10);
    }

    @Override // W.C2
    public final void b(int i10) {
        this.f9223b = ((i10 % 12) * 0.5235988f) - 1.5707964f;
        C2 c10 = this.f9222a;
        c10.b(i10);
        if (c10.c() == 0) {
            this.f9225d = AbstractC1413d.a(this.f9223b);
        }
    }

    @Override // W.C2
    public final int c() {
        return this.f9222a.c();
    }

    @Override // W.C2
    public final boolean d() {
        return this.f9222a.d();
    }

    @Override // W.C2
    public final void e(int i10) {
        this.f9224c = (i10 * 0.10471976f) - 1.5707964f;
        C2 c10 = this.f9222a;
        c10.e(i10);
        if (c10.c() == 1) {
            this.f9225d = AbstractC1413d.a(this.f9224c);
        }
        p093j0.i iVarC = p093j0.s.c();
        p241y9.c cVarE = iVarC != null ? iVarC.e() : null;
        p093j0.i iVarD = p093j0.s.d(iVarC);
        try {
            c10.e(c10.g());
        } finally {
            p093j0.s.g(iVarC, iVarD, cVarE);
        }
    }

    @Override // W.C2
    public final int f() {
        return this.f9222a.f();
    }

    @Override // W.C2
    public final int g() {
        return this.f9222a.g();
    }

    @Override // W.C2
    public final void h(int i10) {
        this.f9222a.h(i10);
    }

    @Override // W.C2
    public final boolean i() {
        return this.f9222a.i();
    }

    public final float j(float f3) {
        float fFloatValue = ((Number) this.f9225d.d()).floatValue() - f3;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.f9225d.d()).floatValue() - fFloatValue;
    }
}
