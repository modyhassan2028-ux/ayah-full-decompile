package K;

import A.M0;
import D.AbstractC0060c;
import O.InterfaceC0444l;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;

/* JADX INFO: renamed from: K.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0312f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f4631b;

    static {
        float f3 = 25;
        f4630a = f3;
        f4631b = (f3 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0444l interfaceC0444l, l0.r rVar, long j, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(1776202187);
        int i12 = (c0698o.g(interfaceC0444l) ? 4 : 2) | i10 | (c0698o.g(rVar) ? 32 : 16) | 128;
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                i11 = i12 & (-897);
                j = 9205357640488583168L;
            } else {
                c0698o.N();
                i11 = i12 & (-897);
            }
            c0698o.q();
            int i13 = i11 & 14;
            boolean z10 = i13 == 4;
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new M0(12, interfaceC0444l);
                c0698o.e0(objH);
            }
            B9.a.b(interfaceC0444l, l0.c.f19314s, p074h0.j.d(-1653527038, new C0305a(j, R0.m.a(rVar, false, (p241y9.c) objH)), c0698o), c0698o, i13 | 432);
        } else {
            c0698o.N();
        }
        long j10 = j;
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0307b(interfaceC0444l, rVar, j10, i10);
        }
    }

    public static final void b(int i10, int i11, C0698o c0698o, l0.r rVar) {
        int i12;
        c0698o.V(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (c0698o.K(i12 & 1, (i12 & 3) != 2)) {
            if (i13 != 0) {
                rVar = l0.o.f19333a;
            }
            AbstractC0060c.a(c0698o, l0.a.a(androidx.compose.foundation.layout.c.k(rVar, f4631b, f4630a), C0311e.f4622r));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0309c(i10, i11, rVar);
        }
    }
}
