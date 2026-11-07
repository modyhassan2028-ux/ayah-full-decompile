package p001a0;

import E2.A;
import E6.h;
import Z.A0;
import Z.AbstractC0700p;
import Z.C0670a;
import Z.C0699o0;
import Z.InterfaceC0674c;
import Z.u0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f11074c = new D(1, 0, 2);

    @Override // p001a0.I
    public final void a(A a9, InterfaceC0674c interfaceC0674c, A0 a10, h hVar) {
        int iC;
        int iO;
        int iH = a9.h(0);
        int iO2 = a10.o();
        int i10 = a10.f10579v;
        int iK = a10.K(a10.f10561b, a10.q(i10));
        int iF = a10.f(a10.f10561b, a10.q(i10 + 1));
        for (int iMax = Math.max(iK, iF - iH); iMax < iF; iMax++) {
            Object obj = a10.f10562c[a10.g(iMax)];
            if (obj instanceof u0) {
                int i11 = iO2 - iMax;
                u0 u0Var = (u0) obj;
                C0670a c0670a = u0Var.f10831b;
                if (c0670a == null || !c0670a.a()) {
                    iC = -1;
                    iO = -1;
                } else {
                    iC = a10.c(c0670a);
                    iO = a10.o() - a10.M(iC);
                }
                hVar.f(u0Var, i11, iC, iO);
            } else if (obj instanceof C0699o0) {
                ((C0699o0) obj).d();
            }
        }
        if (iH <= 0) {
            AbstractC0700p.c("Check failed");
        }
        int i12 = a10.f10579v;
        int iK2 = a10.K(a10.f10561b, a10.q(i12));
        int iF2 = a10.f(a10.f10561b, a10.q(i12 + 1)) - iH;
        if (iF2 < iK2) {
            AbstractC0700p.c("Check failed");
        }
        a10.H(iF2, iH, i12);
        int i13 = a10.f10567i;
        if (i13 >= iK2) {
            a10.f10567i = i13 - iH;
        }
    }
}
