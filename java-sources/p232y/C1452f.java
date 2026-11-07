package p232y;

import A.N;
import A.a1;
import D.P;
import D0.C0096n;
import D0.I;
import D0.O;
import J0.AbstractC0291n;
import N7.f;
import Z.C0681f0;
import Z.S;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p063g1.c;
import p063g1.q;
import p110k9.a;
import p110k9.y;
import p171r0.i;
import p171r0.j;
import p180s0.F;

/* JADX INFO: renamed from: y.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1452f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f24503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24504b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1470y f24505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0681f0 f24506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24508f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0291n f24510i;

    public C1452f(Context context, c cVar, long j, P p10) {
        this.f24503a = cVar;
        C1470y c1470y = new C1470y(context, F.u(j));
        this.f24505c = c1470y;
        this.f24506d = new C0681f0(y.f19095a, S.f10640t);
        this.f24507e = true;
        this.g = 0L;
        this.f24509h = -1L;
        N n6 = new N(4, this);
        C0096n c0096n = I.f1055a;
        O o10 = new O(null, null, n6);
        this.f24510i = Build.VERSION.SDK_INT >= 31 ? new l0(o10, this, c1470y) : new C(o10, this, c1470y, p10);
    }

    public final void a() {
        boolean z10;
        C1470y c1470y = this.f24505c;
        EdgeEffect edgeEffect = c1470y.f24601d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = c1470y.f24602e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = c1470y.f24603f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = c1470y.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(long j, a1 a1Var, q9.c cVar) {
        C1451e c1451e;
        float fB;
        float fB2;
        long jD;
        C1452f c1452f;
        if (cVar instanceof C1451e) {
            c1451e = (C1451e) cVar;
            int i10 = c1451e.f24499v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1451e.f24499v = i10 - Integer.MIN_VALUE;
            } else {
                c1451e = new C1451e(this, cVar);
            }
        } else {
            c1451e = new C1451e(this, cVar);
        }
        Object objInvokeSuspend = c1451e.f24497t;
        int i11 = c1451e.f24499v;
        y yVar = y.f19095a;
        if (i11 == 0) {
            a.e(objInvokeSuspend);
            boolean zE = i.e(this.g);
            p161p9.a aVar = p161p9.a.f21156r;
            if (zE) {
                c1451e.f24499v = 1;
                a1Var.getClass();
                a1 a1Var2 = new a1(a1Var.f187u, c1451e);
                a1Var2.f186t = j;
                if (a1Var2.invokeSuspend(yVar) != aVar) {
                    return yVar;
                }
            } else {
                C1470y c1470y = this.f24505c;
                boolean zG = C1470y.g(c1470y.f24603f);
                c cVar2 = this.f24503a;
                if (!zG || q.b(j) >= 0.0f) {
                    fB = (!C1470y.g(c1470y.g) || q.b(j) <= 0.0f) ? 0.0f : -j.b(c1470y.d(), -q.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2);
                } else {
                    fB = j.b(c1470y.c(), q.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2);
                }
                if (!C1470y.g(c1470y.f24601d) || q.c(j) >= 0.0f) {
                    fB2 = (!C1470y.g(c1470y.f24602e) || q.c(j) <= 0.0f) ? 0.0f : -j.b(c1470y.b(), -q.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2);
                } else {
                    fB2 = j.b(c1470y.e(), q.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2);
                }
                long jE = Y2.a.e(fB, fB2);
                if (jE != 0) {
                    d();
                }
                jD = q.d(j, jE);
                c1451e.f24495r = this;
                c1451e.f24496s = jD;
                c1451e.f24499v = 2;
                a1Var.getClass();
                a1 a1Var3 = new a1(a1Var.f187u, c1451e);
                a1Var3.f186t = jD;
                objInvokeSuspend = a1Var3.invokeSuspend(yVar);
                if (objInvokeSuspend != aVar) {
                    c1452f = this;
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            a.e(objInvokeSuspend);
            return yVar;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jD = c1451e.f24496s;
        c1452f = c1451e.f24495r;
        a.e(objInvokeSuspend);
        long jD2 = q.d(jD, ((q) objInvokeSuspend).f16269a);
        c1452f.f24508f = false;
        C1470y c1470y2 = c1452f.f24505c;
        if (q.b(jD2) > 0.0f) {
            EdgeEffect edgeEffectC = c1470y2.c();
            int iV = B9.a.V(q.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                edgeEffectC.onAbsorb(iV);
            }
        } else if (q.b(jD2) < 0.0f) {
            EdgeEffect edgeEffectD = c1470y2.d();
            int i12 = -B9.a.V(q.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                edgeEffectD.onAbsorb(i12);
            }
        }
        if (q.c(jD2) > 0.0f) {
            EdgeEffect edgeEffectE = c1470y2.e();
            int iV2 = B9.a.V(q.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                edgeEffectE.onAbsorb(iV2);
            }
        } else if (q.c(jD2) < 0.0f) {
            EdgeEffect edgeEffectB = c1470y2.b();
            int i13 = -B9.a.V(q.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                edgeEffectB.onAbsorb(i13);
            }
        }
        c1452f.a();
        return yVar;
    }

    public final long c() {
        long jD = this.f24504b;
        if ((9223372034707292159L & jD) == 9205357640488583168L) {
            jD = j.d(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jD & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f24507e) {
            this.f24506d.setValue(y.f19095a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.f24505c.b();
        float fG = -fIntBitsToFloat2;
        float f3 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fG = f.g(edgeEffectB, fG, f3);
        } else {
            edgeEffectB.onPull(fG, f3);
        }
        return (i11 >= 31 ? f.d(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fG) : Float.intBitsToFloat(i10);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.f24505c.c();
        float f3 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = f.g(edgeEffectC, fIntBitsToFloat2, f3);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f3);
        }
        return (i11 >= 31 ? f.d(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.f24505c.d();
        float fG = -fIntBitsToFloat2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fG = f.g(edgeEffectD, fG, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fG, fIntBitsToFloat);
        }
        return (i11 >= 31 ? f.d(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fG) : Float.intBitsToFloat(i10);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.f24505c.e();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = f.g(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i11 >= 31 ? f.d(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final void i(long j) {
        boolean zA = i.a(this.g, 0L);
        boolean zA2 = i.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iV = B9.a.V(Float.intBitsToFloat((int) (j >> 32)));
            long jV = (((long) B9.a.V(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iV) << 32);
            C1470y c1470y = this.f24505c;
            c1470y.f24600c = jV;
            EdgeEffect edgeEffect = c1470y.f24601d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c1470y.f24602e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c1470y.f24603f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect4 = c1470y.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect5 = c1470y.f24604h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c1470y.f24605i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jV >> 32), (int) (jV & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c1470y.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jV & 4294967295L), (int) (jV >> 32));
            }
            EdgeEffect edgeEffect8 = c1470y.f24606k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jV), (int) (jV >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
