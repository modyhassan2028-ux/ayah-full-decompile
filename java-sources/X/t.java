package X;

import A.C0023i;
import A.I0;
import W.AbstractC0542b2;
import W.AbstractC0592q0;
import Z.C0672b;
import Z.C0690k;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;
import Z.C0709z;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0771u;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0.x f9786a = new U0.x(null, new U0.w());

    public static final void a(InterfaceC0771u interfaceC0771u, p241y9.c cVar, p241y9.a aVar, C0698o c0698o, int i10) {
        c0698o.V(-1868327245);
        int i11 = (c0698o.i(interfaceC0771u) ? 4 : 2) | i10 | (c0698o.i(cVar) ? 32 : 16) | (c0698o.i(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            boolean zI = ((i11 & 112) == 32) | c0698o.i(interfaceC0771u) | ((i11 & 896) == 256);
            Object objH = c0698o.H();
            if (zI || objH == C0690k.f10683a) {
                objH = new C0023i(interfaceC0771u, cVar, aVar, 13);
                c0698o.e0(objH);
            }
            C0672b.d(interfaceC0771u, (p241y9.c) objH, c0698o);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I0(interfaceC0771u, cVar, aVar, i10, 6);
        }
    }

    public static final void b(long j, U0.L l10, p241y9.e eVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.f(j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(l10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(eVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            C0709z c0709z = AbstractC0542b2.f8991a;
            C0672b.b(new C0695m0[]{AbstractC0592q0.f9328a.a(new p180s0.q(j)), c0709z.a(((U0.L) c0698o.k(c0709z)).d(l10))}, eVar, c0698o, ((i11 >> 3) & 112) | 8);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I(j, l10, eVar, i10);
        }
    }

    public static final String c(int i10, C0698o c0698o) {
        c0698o.k(AndroidCompositionLocals_androidKt.f12062a);
        return ((Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b)).getResources().getString(i10);
    }
}
