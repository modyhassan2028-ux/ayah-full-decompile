package M;

import A.D;
import J0.AbstractC0291n;
import J0.y0;
import K.B;
import K.W;
import O.N;
import R0.u;
import R0.v;
import U0.C0515g;
import U0.K;
import Z0.C0710a;
import Z0.C0713d;
import Z0.E;
import Z0.F;
import Z0.InterfaceC0716g;
import Z0.s;
import Z0.y;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0291n implements y0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public F f5603H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public y f5604I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public W f5605J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f5606K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public s f5607L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public N f5608M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Z0.k f5609N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public p162q0.p f5610O;

    public static final void y0(g gVar, W w9, String str, boolean z10) {
        if (z10) {
            E e10 = w9.f4557e;
            B b5 = w9.f4572v;
            p110k9.y yVar = null;
            if (e10 != null) {
                y yVarL = w9.f4556d.l(p120l9.l.S(new InterfaceC0716g[]{new C0713d(), new C0710a(str, 1)}));
                e10.a(null, yVarL);
                b5.e(yVarL);
                yVar = p110k9.y.f19095a;
            }
            if (yVar == null) {
                int length = str.length();
                b5.e(new y(va.g.e(length, length), 4, str));
            }
        }
    }

    @Override // J0.y0
    public final void L(R0.j jVar) {
        C0515g c0515g = this.f5604I.f10953a;
        F9.f[] fVarArr = u.f7181a;
        v vVar = R0.s.f7145C;
        F9.f[] fVarArr2 = u.f7181a;
        F9.f fVar = fVarArr2[16];
        vVar.a(jVar, c0515g);
        C0515g c0515g2 = this.f5603H.f10891a;
        v vVar2 = R0.s.f7146D;
        F9.f fVar2 = fVarArr2[17];
        vVar2.a(jVar, c0515g2);
        long j = this.f5604I.f10954b;
        v vVar3 = R0.s.f7147E;
        F9.f fVar3 = fVarArr2[18];
        vVar3.a(jVar, new K(j));
        v vVar4 = R0.s.f7170q;
        F9.f fVar4 = fVarArr2[8];
        vVar4.a(jVar, p122m0.m.f19473a);
        jVar.e(R0.i.g, new R0.a(null, new f(this, 0)));
        if (!this.f5606K) {
            jVar.e(R0.s.f7163i, p110k9.y.f19095a);
        }
        boolean z10 = this.f5606K;
        v vVar5 = R0.s.f7154L;
        F9.f fVar5 = fVarArr2[24];
        vVar5.a(jVar, Boolean.valueOf(z10));
        u.c(jVar, new f(this, 1));
        int i10 = 2;
        if (z10) {
            jVar.e(R0.i.j, new R0.a(null, new f(this, i10)));
            jVar.e(R0.i.f7095n, new R0.a(null, new f(this, jVar)));
        }
        jVar.e(R0.i.f7091i, new R0.a(null, new D(4, this)));
        int i11 = this.f5609N.f10933e;
        e eVar = new e(this, 3);
        jVar.e(R0.s.f7148F, new Z0.j(i11));
        jVar.e(R0.i.f7096o, new R0.a(null, eVar));
        jVar.e(R0.i.f7085b, new R0.a(null, new e(this, 4)));
        jVar.e(R0.i.f7086c, new R0.a(null, new e(this, 5)));
        if (!K.b(this.f5604I.f10954b)) {
            jVar.e(R0.i.f7097p, new R0.a(null, new e(this, 6)));
            if (this.f5606K) {
                jVar.e(R0.i.f7098q, new R0.a(null, new e(this, 1)));
            }
        }
        if (this.f5606K) {
            jVar.e(R0.i.f7099r, new R0.a(null, new e(this, 2)));
        }
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final boolean V() {
        return true;
    }
}
