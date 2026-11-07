package D;

import Z.C0690k;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f916a = new W(AbstractC0066i.f977a, l0.c.f19306A);

    public static final W a(InterfaceC0062e interfaceC0062e, l0.i iVar, C0698o c0698o, int i10) {
        if (p251z9.j.a(interfaceC0062e, AbstractC0066i.f977a) && p251z9.j.a(iVar, l0.c.f19306A)) {
            c0698o.T(-848964613);
            c0698o.p(false);
            return f916a;
        }
        c0698o.T(-848913742);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && c0698o.g(interfaceC0062e)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !c0698o.g(iVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objH = c0698o.H();
        if (z12 || objH == C0690k.f10683a) {
            objH = new W(interfaceC0062e, iVar);
            c0698o.e0(objH);
        }
        W w9 = (W) objH;
        c0698o.p(false);
        return w9;
    }
}
