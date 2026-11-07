package M;

import A.C0023i;
import A.C0029l;
import A.C0030l0;
import A.C0034n0;
import A.M0;
import J0.AbstractC0283f;
import K.B;
import K0.AbstractC0359n0;
import K0.C0363p0;
import K0.X0;
import K9.A;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.Q;
import N9.Y;
import U0.I;
import U0.K;
import Z0.s;
import Z0.t;
import Z0.y;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f5592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f5593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f5594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y f5595d;

    @Override // Z0.t
    public final void a(y yVar, s sVar, I i10, M0 m10, p171r0.e eVar, p171r0.e eVar2) {
        p pVar = this.f5594c;
        if (pVar != null) {
            m mVar = pVar.f5651m;
            synchronized (mVar.f5626c) {
                try {
                    mVar.j = yVar;
                    mVar.f5633l = sVar;
                    mVar.f5632k = i10;
                    mVar.f5634m = eVar;
                    mVar.f5635n = eVar2;
                    if (mVar.f5628e || mVar.f5627d) {
                        mVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Z0.t
    public final void b(p171r0.e eVar) {
        Rect rect;
        p pVar = this.f5594c;
        if (pVar != null) {
            pVar.f5650l = new Rect(B9.a.V(eVar.f21389a), B9.a.V(eVar.f21390b), B9.a.V(eVar.f21391c), B9.a.V(eVar.f21392d));
            if (!pVar.j.isEmpty() || (rect = pVar.f5650l) == null) {
                return;
            }
            pVar.f5641a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // Z0.t
    public final void c() {
        j(null);
    }

    @Override // Z0.t
    public final void d() {
        X0 x9;
        l lVar = this.f5592a;
        if (lVar == null || (x9 = (X0) AbstractC0283f.i(lVar, AbstractC0359n0.f5125p)) == null) {
            return;
        }
        ((C0363p0) x9).b();
    }

    @Override // Z0.t
    public final void e() {
        X0 x9;
        l lVar = this.f5592a;
        if (lVar == null || (x9 = (X0) AbstractC0283f.i(lVar, AbstractC0359n0.f5125p)) == null) {
            return;
        }
        ((C0363p0) x9).a();
    }

    @Override // Z0.t
    public final void f(y yVar, y yVar2) {
        p pVar = this.f5594c;
        if (pVar != null) {
            boolean z10 = (K.a(pVar.f5647h.f10954b, yVar2.f10954b) && p251z9.j.a(pVar.f5647h.f10955c, yVar2.f10955c)) ? false : true;
            pVar.f5647h = yVar2;
            int size = pVar.j.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((WeakReference) pVar.j.get(i10)).get();
                if (qVar != null) {
                    qVar.g = yVar2;
                }
            }
            m mVar = pVar.f5651m;
            synchronized (mVar.f5626c) {
                mVar.j = null;
                mVar.f5633l = null;
                mVar.f5632k = null;
                mVar.f5634m = null;
                mVar.f5635n = null;
            }
            if (p251z9.j.a(yVar, yVar2)) {
                if (z10) {
                    k kVar = pVar.f5642b;
                    int iE = K.e(yVar2.f10954b);
                    int iD = K.d(yVar2.f10954b);
                    K k7 = pVar.f5647h.f10955c;
                    int iE2 = k7 != null ? K.e(k7.f8035a) : -1;
                    K k10 = pVar.f5647h.f10955c;
                    kVar.s().updateSelection((View) kVar.f5618s, iE, iD, iE2, k10 != null ? K.d(k10.f8035a) : -1);
                    return;
                }
                return;
            }
            if (yVar != null && (!p251z9.j.a(yVar.f10953a.f8060s, yVar2.f10953a.f8060s) || (K.a(yVar.f10954b, yVar2.f10954b) && !p251z9.j.a(yVar.f10955c, yVar2.f10955c)))) {
                k kVar2 = pVar.f5642b;
                kVar2.s().restartInput((View) kVar2.f5618s);
                return;
            }
            int size2 = pVar.j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                q qVar2 = (q) ((WeakReference) pVar.j.get(i11)).get();
                if (qVar2 != null) {
                    y yVar3 = pVar.f5647h;
                    k kVar3 = pVar.f5642b;
                    if (qVar2.f5660k) {
                        qVar2.g = yVar3;
                        if (qVar2.f5659i) {
                            kVar3.s().updateExtractedText((View) kVar3.f5618s, qVar2.f5658h, va.g.g(yVar3));
                        }
                        K k11 = yVar3.f10955c;
                        long j = yVar3.f10954b;
                        int iE3 = k11 != null ? K.e(k11.f8035a) : -1;
                        K k12 = yVar3.f10955c;
                        kVar3.s().updateSelection((View) kVar3.f5618s, K.e(j), K.d(j), iE3, k12 != null ? K.d(k12.f8035a) : -1);
                    }
                }
            }
        }
    }

    @Override // Z0.t
    public final void g() throws Throwable {
        A a9 = this.f5593b;
        if (a9 != null) {
            a9.e(null);
        }
        this.f5593b = null;
        Q qI = i();
        if (qI != null) {
            ((Y) qI).f();
        }
    }

    @Override // Z0.t
    public final void h(y yVar, Z0.k kVar, C0023i c0023i, B b5) {
        j(new C0034n0(yVar, this, kVar, c0023i, b5, 3));
    }

    public final Q i() {
        Y y10 = this.f5595d;
        if (y10 != null) {
            return y10;
        }
        if (!L.c.f5429a) {
            return null;
        }
        Y yB = AbstractC0419l.b(0, 2, M9.a.f5832t);
        this.f5595d = yB;
        return yB;
    }

    public final void j(C0034n0 c0034n0) {
        l lVar = this.f5592a;
        if (lVar == null) {
            return;
        }
        A a9 = null;
        this.f5593b = lVar.f19338E ? AbstractC0405x.x(lVar.h0(), null, new C0030l0(lVar, new C0029l(c0034n0, this, lVar, a9, 2), a9, 23), 1) : null;
    }

    public final void k(l lVar) {
        if (this.f5592a != lVar) {
            C.a.c("Expected textInputModifierNode to be " + lVar + " but was " + this.f5592a);
        }
        this.f5592a = null;
    }
}
