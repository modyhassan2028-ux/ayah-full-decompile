package W;

import D.AbstractC0060c;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import androidx.compose.foundation.layout.FillElement;
import p180s0.AbstractC1302k;

/* JADX INFO: renamed from: W.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0578l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0578l1 f9234a = new C0578l1();

    static {
        float f3 = Y.o.f10223e;
        AbstractC1302k.a();
    }

    public static C0569i1 b(C0560g0 c0560g0) {
        C0569i1 c0569i1 = c0560g0.R;
        if (c0569i1 != null) {
            return c0569i1;
        }
        float f3 = Y.o.f10219a;
        C0569i1 c0569i2 = new C0569i1(AbstractC0568i0.c(c0560g0, 26), AbstractC0568i0.c(c0560g0, 26), AbstractC0568i0.c(c0560g0, 32), AbstractC0568i0.c(c0560g0, 32), AbstractC0568i0.c(c0560g0, 26), p180s0.F.k(p180s0.q.b(AbstractC0568i0.c(c0560g0, 18), 0.38f), c0560g0.f9125p), p180s0.q.b(AbstractC0568i0.c(c0560g0, 18), 0.38f), p180s0.q.b(AbstractC0568i0.c(c0560g0, 18), 0.12f), p180s0.q.b(AbstractC0568i0.c(c0560g0, 18), 0.12f), p180s0.q.b(AbstractC0568i0.c(c0560g0, 18), 0.38f));
        c0560g0.R = c0569i2;
        return c0569i2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public final void a(B.j jVar, l0.r rVar, C0569i1 c0569i1, boolean z10, long j, C0698o c0698o, int i10, int i11) {
        int i12;
        boolean z11;
        int i13;
        long j10;
        l0.r rVar2;
        Object objH;
        Z.S s10;
        p093j0.r rVar3;
        boolean z12;
        Object objH2;
        long jFloatToRawIntBits;
        long j11;
        l0.r rVar4;
        boolean z13;
        long j12;
        C0699o0 c0699o0R;
        c0698o.V(-290277409);
        if ((i10 & 6) == 0) {
            i12 = (c0698o.g(jVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i12 | 48 | (c0698o.g(c0569i1) ? 256 : 128);
        int i15 = i11 & 8;
        if (i15 != 0) {
            i13 = i14 | 3072;
            z11 = z10;
        } else {
            z11 = z10;
            i13 = i14 | (c0698o.h(z11) ? 2048 : 1024);
        }
        int i16 = i11 & 16;
        if (i16 == 0) {
            if ((i10 & 24576) == 0) {
                j10 = j;
                i13 |= c0698o.f(j10) ? 16384 : 8192;
            }
            if ((74899 & i13) == 74898 || !c0698o.x()) {
                c0698o.P();
                if ((i10 & 1) != 0 || c0698o.w()) {
                    if (i15 != 0) {
                        z11 = true;
                    }
                    rVar2 = l0.o.f19333a;
                    if (i16 != 0) {
                        j10 = AbstractC0598s1.f9356c;
                    }
                } else {
                    c0698o.N();
                    rVar2 = rVar;
                }
                c0698o.q();
                objH = c0698o.H();
                s10 = C0690k.f10683a;
                if (objH == s10) {
                    objH = new p093j0.r();
                    c0698o.e0(objH);
                }
                rVar3 = (p093j0.r) objH;
                if ((i13 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objH2 = c0698o.H();
                if (z12 || objH2 == s10) {
                    objH2 = new U(jVar, rVar3, null, 1);
                    c0698o.e0(objH2);
                }
                C0672b.f(c0698o, jVar, (p241y9.e) objH2);
                if (rVar3.isEmpty()) {
                    jFloatToRawIntBits = j10;
                } else {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(p063g1.h.b(j10) / 2)) << 32) | (((long) Float.floatToRawIntBits(p063g1.h.a(j10))) & 4294967295L);
                }
                FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
                l0.r rVarF = androidx.compose.foundation.a.f(androidx.compose.foundation.layout.c.k(rVar2, p063g1.h.b(jFloatToRawIntBits), p063g1.h.a(jFloatToRawIntBits)), jVar);
                if (z11) {
                    j11 = c0569i1.f9174a;
                } else {
                    j11 = c0569i1.f9179f;
                }
                float f3 = Y.o.f10219a;
                AbstractC0060c.a(c0698o, androidx.compose.foundation.a.a(rVarF, j11, AbstractC0537a1.a(5, c0698o)));
                rVar4 = rVar2;
            } else {
                c0698o.N();
                rVar4 = rVar;
            }
            z13 = z11;
            j12 = j10;
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0575k1(this, jVar, rVar4, c0569i1, z13, j12, i10, i11);
            }
        }
        i13 |= 24576;
        j10 = j;
        if ((74899 & i13) == 74898) {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    z11 = true;
                }
                rVar2 = l0.o.f19333a;
                if (i16 != 0) {
                    j10 = AbstractC0598s1.f9356c;
                }
            } else {
                if (i15 != 0) {
                    z11 = true;
                }
                rVar2 = l0.o.f19333a;
                if (i16 != 0) {
                    j10 = AbstractC0598s1.f9356c;
                }
            }
            c0698o.q();
            objH = c0698o.H();
            s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new p093j0.r();
                c0698o.e0(objH);
            }
            rVar3 = (p093j0.r) objH;
            if ((i13 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objH2 = c0698o.H();
            if (z12) {
                objH2 = new U(jVar, rVar3, null, 1);
                c0698o.e0(objH2);
            } else {
                objH2 = new U(jVar, rVar3, null, 1);
                c0698o.e0(objH2);
            }
            C0672b.f(c0698o, jVar, (p241y9.e) objH2);
            if (rVar3.isEmpty()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(p063g1.h.b(j10) / 2)) << 32) | (((long) Float.floatToRawIntBits(p063g1.h.a(j10))) & 4294967295L);
            } else {
                jFloatToRawIntBits = j10;
            }
            FillElement fillElement2 = androidx.compose.foundation.layout.c.f11826a;
            l0.r rVarF2 = androidx.compose.foundation.a.f(androidx.compose.foundation.layout.c.k(rVar2, p063g1.h.b(jFloatToRawIntBits), p063g1.h.a(jFloatToRawIntBits)), jVar);
            if (z11) {
                j11 = c0569i1.f9174a;
            } else {
                j11 = c0569i1.f9179f;
            }
            float f7 = Y.o.f10219a;
            AbstractC0060c.a(c0698o, androidx.compose.foundation.a.a(rVarF2, j11, AbstractC0537a1.a(5, c0698o)));
            rVar4 = rVar2;
        } else {
            c0698o.P();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    z11 = true;
                }
                rVar2 = l0.o.f19333a;
                if (i16 != 0) {
                    j10 = AbstractC0598s1.f9356c;
                }
            } else {
                if (i15 != 0) {
                    z11 = true;
                }
                rVar2 = l0.o.f19333a;
                if (i16 != 0) {
                    j10 = AbstractC0598s1.f9356c;
                }
            }
            c0698o.q();
            objH = c0698o.H();
            s10 = C0690k.f10683a;
            if (objH == s10) {
                objH = new p093j0.r();
                c0698o.e0(objH);
            }
            rVar3 = (p093j0.r) objH;
            if ((i13 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objH2 = c0698o.H();
            if (z12) {
                objH2 = new U(jVar, rVar3, null, 1);
                c0698o.e0(objH2);
            } else {
                objH2 = new U(jVar, rVar3, null, 1);
                c0698o.e0(objH2);
            }
            C0672b.f(c0698o, jVar, (p241y9.e) objH2);
            if (rVar3.isEmpty()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(p063g1.h.b(j10) / 2)) << 32) | (((long) Float.floatToRawIntBits(p063g1.h.a(j10))) & 4294967295L);
            } else {
                jFloatToRawIntBits = j10;
            }
            FillElement fillElement3 = androidx.compose.foundation.layout.c.f11826a;
            l0.r rVarF3 = androidx.compose.foundation.a.f(androidx.compose.foundation.layout.c.k(rVar2, p063g1.h.b(jFloatToRawIntBits), p063g1.h.a(jFloatToRawIntBits)), jVar);
            if (z11) {
                j11 = c0569i1.f9174a;
            } else {
                j11 = c0569i1.f9179f;
            }
            float f10 = Y.o.f10219a;
            AbstractC0060c.a(c0698o, androidx.compose.foundation.a.a(rVarF3, j11, AbstractC0537a1.a(5, c0698o)));
            rVar4 = rVar2;
        }
        z13 = z11;
        j12 = j10;
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0575k1(this, jVar, rVar4, c0569i1, z13, j12, i10, i11);
        }
    }
}
