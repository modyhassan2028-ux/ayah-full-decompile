package W;

import D.AbstractC0071n;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import Z.C0672b;
import Z.C0698o;
import Z.InterfaceC0687i0;
import androidx.compose.material3.MinimumInteractiveModifier;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f8471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p180s0.J f8472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f8473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f8474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f8475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f8476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f8477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f8478y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(l0.r rVar, p180s0.J j, long j10, float f3, boolean z10, p241y9.a aVar, float f7, p074h0.d dVar) {
        super(2);
        this.f8471r = rVar;
        this.f8472s = j;
        this.f8473t = j10;
        this.f8474u = f3;
        this.f8475v = z10;
        this.f8476w = aVar;
        this.f8477x = f7;
        this.f8478y = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            Z.M0 m10 = D0.f8496a;
            l0.r rVarA = androidx.compose.foundation.selection.b.a(C1.b(this.f8471r.b(MinimumInteractiveModifier.f11916a), this.f8472s, C1.c(this.f8473t, this.f8474u, c0698o), null, ((p063g1.c) c0698o.k(AbstractC0359n0.f5118h)).w(this.f8477x)), this.f8475v, W0.c(false, 0.0f, c0698o, 0, 7), this.f8476w);
            H0.I iD = AbstractC0071n.d(l0.c.f19313r, true);
            int i10 = c0698o.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            l0.r rVarC = l0.a.c(c0698o, rVarA);
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
            this.f8478y.invoke(c0698o, 0);
            c0698o.p(true);
        }
        return p110k9.y.f19095a;
    }
}
