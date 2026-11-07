package p015b4;

import D.AbstractC0066i;
import D.C0076t;
import D.I;
import D.P;
import D.U;
import D.W;
import G4.f;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.A2;
import W.AbstractC0537a1;
import W.AbstractC0542b2;
import W.AbstractC0568i0;
import W.C0554e2;
import W.C0560g0;
import W.C0574k0;
import W.C1;
import W.D2;
import W.G2;
import W.H2;
import W.O;
import W.V0;
import W.Z0;
import W.z2;
import Y.s;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.M0;
import Z.S;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import j$.time.LocalTime;
import l0.o;
import l0.r;
import p074h0.j;
import p085i0.n;
import p110k9.y;
import p180s0.q;
import p241y9.a;
import p241y9.c;
import p241y9.e;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LocalTime f13290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f13291t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f13292u;

    public /* synthetic */ k(LocalTime localTime, a aVar, c cVar, int i10) {
        this.f13289r = i10;
        this.f13290s = localTime;
        this.f13291t = aVar;
        this.f13292u = cVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f13289r;
        y yVar = y.f19095a;
        o oVar = o.f19333a;
        c cVar = this.f13292u;
        LocalTime localTime = this.f13290s;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    M0 m10 = AbstractC0537a1.f8962a;
                    M0 m11 = p005a4.e.f11187a;
                    C1.a(androidx.compose.foundation.a.a(b.e(b.m(oVar, I.f890r)), ((p005a4.a) c0698o.k(m11)).d(), ((Z0) c0698o.k(m10)).f8938e), ((Z0) c0698o.k(m10)).f8938e, ((p005a4.a) c0698o.k(m11)).d(), 0L, 6, 0.0f, null, j.d(588349667, new k(localTime, this.f13291t, cVar, 1), c0698o), c0698o, 12607488, 104);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    r rVarH = b.h(oVar, 24);
                    C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19310E, c0698o2, 48);
                    int i11 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    r rVarC = l0.a.c(c0698o2, rVarH);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0285h c0285h = C0287j.f4119f;
                    C0672b.v(c0698o2, c0076tA, c0285h);
                    C0285h c0285h2 = C0287j.f4118e;
                    C0672b.v(c0698o2, interfaceC0687i0M, c0285h2);
                    C0285h c0285h3 = C0287j.g;
                    if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i11))) {
                        p123m2.c.y(i11, c0698o2, i11, c0285h3);
                    }
                    C0285h c0285h4 = C0287j.f4117d;
                    C0672b.v(c0698o2, rVarC, c0285h4);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f11826a;
                    AbstractC0542b2.b("", b.l(fillElement, 0.0f, 0.0f, 0.0f, 20, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((G2) c0698o2.k(H2.f8580a)).f8568n, c0698o2, 48, 0, 65532);
                    int hour = localTime.getHour();
                    int minute = localTime.getMinute();
                    float f3 = A2.f8452a;
                    Object[] objArr = new Object[0];
                    C0574k0 c0574k0 = C0574k0.f9201B;
                    O o10 = O.f8731A;
                    n nVar = p085i0.o.f16735a;
                    n nVar2 = new n(0, c0574k0, o10);
                    boolean zE = c0698o2.e(hour) | c0698o2.e(minute);
                    Object objH = c0698o2.H();
                    S s10 = C0690k.f10683a;
                    if (zE || objH == s10) {
                        objH = new z2(hour, minute);
                        c0698o2.e0(objH);
                    }
                    D2 d5 = (D2) g.H(objArr, nVar2, (a) objH, c0698o2, 0, 4);
                    long jG = B0.c.A(c0698o2).g();
                    long j = q.f21840c;
                    long jK = B0.c.A(c0698o2).k();
                    long jL = B0.c.A(c0698o2).l();
                    long jB = q.b(B0.c.A(c0698o2).l(), 0.2f);
                    long j10 = ((q) B0.c.A(c0698o2).f11176q.getValue()).f21845a;
                    long jG2 = B0.c.A(c0698o2).g();
                    long jK2 = B0.c.A(c0698o2).k();
                    long j11 = ((q) B0.c.A(c0698o2).f11176q.getValue()).f21845a;
                    long jB2 = q.b(B0.c.A(c0698o2).l(), 0.2f);
                    long j12 = q.g;
                    C0560g0 c0560g0 = (C0560g0) c0698o2.k(AbstractC0568i0.f9172a);
                    C0554e2 c0554e2 = c0560g0.T;
                    if (c0554e2 == null) {
                        float f7 = s.f10234a;
                        c0554e2 = new C0554e2(AbstractC0568i0.c(c0560g0, 39), AbstractC0568i0.c(c0560g0, 26), AbstractC0568i0.c(c0560g0, 38), AbstractC0568i0.c(c0560g0, s.f10244m), AbstractC0568i0.c(c0560g0, 10), AbstractC0568i0.c(c0560g0, 18), AbstractC0568i0.c(c0560g0, s.f10245n), q.f21843f, AbstractC0568i0.c(c0560g0, s.f10246o), AbstractC0568i0.c(c0560g0, s.f10247p), AbstractC0568i0.c(c0560g0, s.f10250s), AbstractC0568i0.c(c0560g0, s.f10252u), AbstractC0568i0.c(c0560g0, s.f10251t), AbstractC0568i0.c(c0560g0, s.f10253v));
                        c0560g0.T = c0554e2;
                    }
                    if (jG == 16) {
                        jG = c0554e2.f9042a;
                    }
                    long j13 = jG;
                    long j14 = jL != 16 ? jL : c0554e2.f9043b;
                    long j15 = j12 != 16 ? j12 : c0554e2.f9044c;
                    long j16 = j12 != 16 ? j12 : c0554e2.f9045d;
                    long j17 = j != 16 ? j : c0554e2.f9046e;
                    long j18 = jK != 16 ? jK : c0554e2.f9047f;
                    if (jB2 == 16) {
                        jB2 = c0554e2.g;
                    }
                    long j19 = jB2;
                    long j20 = j12 != 16 ? j12 : c0554e2.f9048h;
                    long j21 = j11 != 16 ? j11 : c0554e2.f9049i;
                    long j22 = j12 != 16 ? j12 : c0554e2.j;
                    if (jB == 16) {
                        jB = c0554e2.f9050k;
                    }
                    A2.g(d5, null, new C0554e2(j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, jB, jG2 != 16 ? jG2 : c0554e2.f9051l, j10 != 16 ? j10 : c0554e2.f9052m, jK2 != 16 ? jK2 : c0554e2.f9053n), 0, c0698o2, 0);
                    r rVarB = androidx.compose.foundation.layout.c.d(oVar, 40).b(fillElement);
                    W wA = U.a(AbstractC0066i.f977a, l0.c.f19306A, c0698o2, 0);
                    int i12 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o2.m();
                    r rVarC2 = l0.a.c(c0698o2, rVarB);
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0672b.v(c0698o2, wA, c0285h);
                    C0672b.v(c0698o2, interfaceC0687i0M2, c0285h2);
                    if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i12))) {
                        p123m2.c.y(i12, c0698o2, i12, c0285h3);
                    }
                    C0672b.v(c0698o2, rVarC2, c0285h4);
                    P p10 = W.S.f8804a;
                    V0.k(this.f13291t, null, false, null, W.S.d(0L, B0.c.A(c0698o2).l(), c0698o2, 13), null, f.f13265c, c0698o2, 805306368, 494);
                    boolean zG = c0698o2.g(cVar) | c0698o2.i(d5);
                    Object objH2 = c0698o2.H();
                    if (zG || objH2 == s10) {
                        objH2 = new f(21, cVar, d5);
                        c0698o2.e0(objH2);
                    }
                    V0.k((a) objH2, null, false, null, W.S.d(0L, B0.c.A(c0698o2).l(), c0698o2, 13), null, f.f13266d, c0698o2, 805306368, 494);
                    c0698o2.p(true);
                    c0698o2.p(true);
                }
                break;
        }
        return yVar;
    }
}
