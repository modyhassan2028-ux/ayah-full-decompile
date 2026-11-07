package D0;

import J0.A0;
import J0.AbstractC0283f;
import J0.C0;
import J0.C0279d;
import J0.C0292o;
import J0.InterfaceC0289l;
import J0.w0;

/* JADX INFO: renamed from: D0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0090h extends l0.q implements C0, w0, InterfaceC0289l {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0292o f1102F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C0083a f1103G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f1104H;

    public AbstractC0090h(C0083a c0083a, C0292o c0292o) {
        this.f1102F = c0292o;
        this.f1103G = c0083a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        if (enumC0097o == EnumC0097o.f1124s) {
            ?? r10 = c0096n.f1119a;
            int size = r10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (y0(((v) r10.get(i10)).f1139i)) {
                    int i11 = c0096n.f1122d;
                    if (i11 == 4) {
                        this.f1104H = true;
                        x0();
                        return;
                    } else {
                        if (i11 == 5) {
                            z0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // J0.w0
    public final /* synthetic */ boolean J() {
        return false;
    }

    @Override // J0.w0
    public final void P() {
        R();
    }

    @Override // J0.w0
    public final void R() {
        z0();
    }

    @Override // J0.w0
    public final /* synthetic */ void a0() {
    }

    @Override // l0.q
    public final void m0() {
        R();
    }

    @Override // l0.q
    public final void n0() {
        z0();
    }

    @Override // J0.w0
    public final long q() {
        C0292o c0292o = this.f1102F;
        if (c0292o == null) {
            return A0.f3873a;
        }
        p063g1.c cVar = AbstractC0283f.x(this).f3912P;
        int i10 = A0.f3874b;
        return C0279d.c(cVar.E(c0292o.f4152a), cVar.E(c0292o.f4153b), cVar.E(c0292o.f4154c), cVar.E(c0292o.f4155d));
    }

    public final void v0() {
        C0083a c0083a;
        p251z9.v vVar = new p251z9.v();
        AbstractC0283f.A(this, new C0089g(1));
        AbstractC0090h abstractC0090h = (AbstractC0090h) vVar.f24886r;
        if (abstractC0090h == null || (c0083a = abstractC0090h.f1103G) == null) {
            c0083a = this.f1103G;
        }
        w0(c0083a);
    }

    public abstract void w0(s sVar);

    public final void x0() {
        p251z9.r rVar = new p251z9.r();
        rVar.f24882r = true;
        AbstractC0283f.B(this, new C0088f(rVar, 0));
        if (rVar.f24882r) {
            v0();
        }
    }

    public abstract boolean y0(int i10);

    public final void z0() {
        p110k9.y yVar;
        if (this.f1104H) {
            this.f1104H = false;
            if (this.f19338E) {
                p251z9.v vVar = new p251z9.v();
                AbstractC0283f.A(this, new C0.h(vVar, 1));
                AbstractC0090h abstractC0090h = (AbstractC0090h) vVar.f24886r;
                if (abstractC0090h != null) {
                    abstractC0090h.v0();
                    yVar = p110k9.y.f19095a;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    w0(null);
                }
            }
        }
    }
}
