package W;

import D.AbstractC0066i;
import D.AbstractC0071n;
import D.C0076t;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.foundation.layout.HorizontalAlignElement;

/* JADX INFO: renamed from: W.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0543c extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f8992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f8993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f8994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f8995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f8996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f8997w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0543c(p241y9.e eVar, p241y9.e eVar2, long j, long j10, long j11, long j12, p074h0.d dVar) {
        super(2);
        this.f8992r = eVar;
        this.f8993s = eVar2;
        this.f8994t = j10;
        this.f8995u = j11;
        this.f8996v = j12;
        this.f8997w = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            l0.r rVarG = androidx.compose.foundation.layout.b.g(l0.o.f19333a, AbstractC0567i.f9170e);
            int i10 = 0;
            C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o, 0);
            int i11 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarG);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0285h c0285h = C0287j.f4119f;
            C0672b.v(c0698o, c0076tA, c0285h);
            C0285h c0285h2 = C0287j.f4118e;
            C0672b.v(c0698o, interfaceC0687i0M, c0285h2);
            C0285h c0285h3 = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i11))) {
                p123m2.c.y(i11, c0698o, i11, c0285h3);
            }
            C0285h c0285h4 = C0287j.f4117d;
            C0672b.v(c0698o, rVarC, c0285h4);
            c0698o.T(-1924971291);
            c0698o.p(false);
            c0698o.T(-1924961479);
            p241y9.e eVar = this.f8992r;
            if (eVar != null) {
                X.t.b(this.f8994t, H2.a(Y.b.f10140c, c0698o), p074h0.j.d(434448772, new C0539b(eVar, i10), c0698o), c0698o, 384);
            }
            c0698o.p(false);
            c0698o.T(-1924936431);
            int i12 = 1;
            p241y9.e eVar2 = this.f8993s;
            if (eVar2 != null) {
                X.t.b(this.f8995u, H2.a(Y.b.f10142e, c0698o), p074h0.j.d(-796843771, new C0539b(eVar2, i12), c0698o), c0698o, 384);
            }
            c0698o.p(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(l0.c.f19311F);
            H0.I iD = AbstractC0071n.d(l0.c.f19313r, false);
            int i13 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M2 = c0698o.m();
            l0.r rVarC2 = l0.a.c(c0698o, horizontalAlignElement);
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, iD, c0285h);
            C0672b.v(c0698o, interfaceC0687i0M2, c0285h2);
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h3);
            }
            C0672b.v(c0698o, rVarC2, c0285h4);
            int i14 = Y.b.f10138a;
            X.t.b(this.f8996v, H2.a(10, c0698o), this.f8997w, c0698o, 0);
            c0698o.p(true);
            c0698o.p(true);
        }
        return p110k9.y.f19095a;
    }
}
