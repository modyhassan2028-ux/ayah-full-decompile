package p232y;

import B.g;
import B.h;
import B.j;
import D0.C0096n;
import D0.EnumC0097o;
import J0.A0;
import J0.w0;
import K9.AbstractC0405x;
import l0.q;
import p110k9.a;
import p110k9.y;
import q9.c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends q implements w0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public j f24432F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public g f24433G;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v0(H h7, c cVar) {
        E e10;
        g gVar;
        if (cVar instanceof E) {
            e10 = (E) cVar;
            int i10 = e10.f24424v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e10.f24424v = i10 - Integer.MIN_VALUE;
            } else {
                e10 = new E(h7, cVar);
            }
        } else {
            e10 = new E(h7, cVar);
        }
        Object obj = e10.f24422t;
        int i11 = e10.f24424v;
        if (i11 == 0) {
            a.e(obj);
            if (h7.f24433G == null) {
                gVar = new g();
                j jVar = h7.f24432F;
                e10.f24420r = h7;
                e10.f24421s = gVar;
                e10.f24424v = 1;
                Object objA = jVar.a(gVar, e10);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objA == aVar) {
                    return aVar;
                }
            }
            return y.f19095a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g gVar2 = e10.f24421s;
        H h10 = e10.f24420r;
        a.e(obj);
        gVar = gVar2;
        h7 = h10;
        h7.f24433G = gVar;
        return y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object w0(H h7, c cVar) {
        F f3;
        if (cVar instanceof F) {
            f3 = (F) cVar;
            int i10 = f3.f24428u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f3.f24428u = i10 - Integer.MIN_VALUE;
            } else {
                f3 = new F(h7, cVar);
            }
        } else {
            f3 = new F(h7, cVar);
        }
        Object obj = f3.f24426s;
        int i11 = f3.f24428u;
        if (i11 == 0) {
            a.e(obj);
            g gVar = h7.f24433G;
            if (gVar != null) {
                h hVar = new h(gVar);
                j jVar = h7.f24432F;
                f3.f24425r = h7;
                f3.f24428u = 1;
                Object objA = jVar.a(hVar, f3);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objA == aVar) {
                    return aVar;
                }
            }
            return y.f19095a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h7 = f3.f24425r;
        a.e(obj);
        h7.f24433G = null;
        return y.f19095a;
    }

    @Override // J0.w0
    public final void C(C0096n c0096n, EnumC0097o enumC0097o, long j) {
        if (enumC0097o == EnumC0097o.f1124s) {
            int i10 = c0096n.f1122d;
            p150o9.c cVar = null;
            if (i10 == 4) {
                AbstractC0405x.x(h0(), null, new G(this, cVar, 0), 3);
            } else if (i10 == 5) {
                AbstractC0405x.x(h0(), null, new G(this, cVar, 1), 3);
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
        x0();
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
        x0();
    }

    @Override // J0.w0
    public final long q() {
        return A0.f3873a;
    }

    public final void x0() {
        g gVar = this.f24433G;
        if (gVar != null) {
            this.f24432F.b(new h(gVar));
            this.f24433G = null;
        }
    }
}
