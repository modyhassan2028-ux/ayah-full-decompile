package W;

import Z.C0672b;
import Z.C0695m0;
import Z.C0698o;
import Z.C0709z;
import androidx.compose.foundation.BorderModifierNodeElement;
import p232y.C1460n;

/* JADX INFO: loaded from: classes.dex */
public abstract class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0709z f8484a = new C0709z(C0564h0.f9146B);

    public static final void a(l0.r rVar, p180s0.J j, long j10, long j11, float f3, float f7, C1460n c1460n, p074h0.d dVar, C0698o c0698o, int i10, int i11) {
        if ((i11 & 1) != 0) {
            rVar = l0.o.f19333a;
        }
        if ((i11 & 2) != 0) {
            j = p180s0.F.f21774a;
        }
        if ((i11 & 8) != 0) {
            j11 = AbstractC0568i0.b(j10, c0698o);
        }
        if ((i11 & 16) != 0) {
            f3 = 0;
        }
        if ((i11 & 32) != 0) {
            f7 = 0;
        }
        if ((i11 & 64) != 0) {
            c1460n = null;
        }
        C0709z c0709z = f8484a;
        float f10 = f3 + ((p063g1.f) c0698o.k(c0709z)).f16252r;
        C0672b.b(new C0695m0[]{AbstractC0592q0.f9328a.a(new p180s0.q(j11)), c0709z.a(new p063g1.f(f10))}, p074h0.j.d(-70914509, new C0619z1(rVar, j, j10, f10, c1460n, f7, dVar), c0698o), c0698o, 56);
    }

    public static final l0.r b(l0.r rVar, p180s0.J j, long j10, C1460n c1460n, float f3) {
        p180s0.J j11;
        l0.r rVarB;
        l0.r borderModifierNodeElement = l0.o.f19333a;
        if (f3 > 0.0f) {
            j11 = j;
            rVarB = androidx.compose.ui.graphics.a.b(borderModifierNodeElement, 0.0f, 0.0f, 0.0f, f3, 0.0f, j11, false, 124895);
        } else {
            j11 = j;
            rVarB = borderModifierNodeElement;
        }
        l0.r rVarB2 = rVar.b(rVarB);
        if (c1460n != null) {
            borderModifierNodeElement = new BorderModifierNodeElement(c1460n.f24574a, c1460n.f24575b, j11);
        }
        return com.google.android.gms.internal.measurement.B1.m(androidx.compose.foundation.a.a(rVarB2.b(borderModifierNodeElement), j10, j11), j11);
    }

    public static final long c(long j, float f3, C0698o c0698o) {
        C0560g0 c0560g0 = (C0560g0) c0698o.k(AbstractC0568i0.f9172a);
        boolean zBooleanValue = ((Boolean) c0698o.k(AbstractC0568i0.f9173b)).booleanValue();
        long j10 = c0560g0.f9125p;
        if (!p180s0.q.c(j, j10) || !zBooleanValue) {
            return j;
        }
        if (p063g1.f.a(f3, 0)) {
            return j10;
        }
        return p180s0.F.k(p180s0.q.b(c0560g0.f9129t, ((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f), j10);
    }
}
