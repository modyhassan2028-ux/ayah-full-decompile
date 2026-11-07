package D;

import Z.C0690k;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0076t f1019a = new C0076t(AbstractC0066i.f979c, l0.c.f19309D);

    public static final C0076t a(InterfaceC0064g interfaceC0064g, l0.h hVar, C0698o c0698o, int i10) {
        if (p251z9.j.a(interfaceC0064g, AbstractC0066i.f979c) && hVar.equals(l0.c.f19309D)) {
            c0698o.T(346089448);
            c0698o.p(false);
            return f1019a;
        }
        c0698o.T(346143295);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && c0698o.g(interfaceC0064g)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !c0698o.g(hVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objH = c0698o.H();
        if (z12 || objH == C0690k.f10683a) {
            objH = new C0076t(interfaceC0064g, hVar);
            c0698o.e0(objH);
        }
        C0076t c0076t = (C0076t) objH;
        c0698o.p(false);
        return c0076t;
    }
}
