package W;

import D.AbstractC0071n;
import D0.C0096n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import p232y.C1460n;

/* JADX INFO: renamed from: W.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0619z1 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f9476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p180s0.J f9477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f9478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f9479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1460n f9480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f9481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f9482x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619z1(l0.r rVar, p180s0.J j, long j10, float f3, C1460n c1460n, float f7, p074h0.d dVar) {
        super(2);
        this.f9476r = rVar;
        this.f9477s = j;
        this.f9478t = j10;
        this.f9479u = f3;
        this.f9480v = c1460n;
        this.f9481w = f7;
        this.f9482x = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        p110k9.y yVar = p110k9.y.f19095a;
        if (iIntValue == 2 && c0698o.x()) {
            c0698o.N();
            return yVar;
        }
        l0.r rVarA = R0.m.a(C1.b(this.f9476r, this.f9477s, C1.c(this.f9478t, this.f9479u, c0698o), this.f9480v, ((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).w(this.f9481w)), false, O.f8735v);
        F.x xVar = new F.x(2, null, 3);
        C0096n c0096n = D0.I.f1055a;
        l0.r rVarB = rVarA.b(new SuspendPointerInputElement(yVar, null, new D0.H(xVar), 6));
        H0.I iD = AbstractC0071n.d(l0.c.f19313r, true);
        int i10 = c0698o.f10721P;
        InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
        l0.r rVarC = l0.a.c(c0698o, rVarB);
        InterfaceC0288k.f4142a.getClass();
        C0286i c0286i = C0287j.f4115b;
        c0698o.X();
        if (c0698o.f10720O) {
            c0698o.l(c0286i);
        } else {
            c0698o.h0();
        }
        C0672b.v(c0698o, iD, C0287j.f4119f);
        C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
        C0285h c0285h = C0287j.g;
        if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i10))) {
            p123m2.c.y(i10, c0698o, i10, c0285h);
        }
        C0672b.v(c0698o, rVarC, C0287j.f4117d);
        this.f9482x.invoke(c0698o, 0);
        c0698o.p(true);
        return yVar;
    }
}
