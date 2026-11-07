package p094j1;

import A6.a;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.r0;
import android.view.View;
import android.view.ViewTreeObserver;
import l0.q;
import p011b0.e;
import p162q0.f;
import p162q0.j;
import p162q0.k;
import p162q0.l;
import p162q0.o;
import p162q0.t;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q implements o, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f18746F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ViewTreeObserver f18747G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f18748H = new l(this, 0);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final l f18749I = new l(this, 1);

    @Override // p162q0.o
    public final void N(l lVar) {
        lVar.c(false);
        lVar.d(this.f18748H);
        lVar.a(this.f18749I);
    }

    @Override // l0.q
    public final void l0() {
        ViewTreeObserver viewTreeObserver = AbstractC0283f.z(this).getViewTreeObserver();
        this.f18747G = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // l0.q
    public final void n0() {
        ViewTreeObserver viewTreeObserver = this.f18747G;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f18747G = null;
        AbstractC0283f.z(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f18746F = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC0283f.x(this).f3901E == null) {
            return;
        }
        View viewC = h.c(this);
        j focusOwner = AbstractC0283f.y(this).getFocusOwner();
        r0 r0VarY = AbstractC0283f.y(this);
        boolean z10 = (view == null || view.equals(r0VarY) || !h.a(viewC, view)) ? false : true;
        boolean z11 = (view2 == null || view2.equals(r0VarY) || !h.a(viewC, view2)) ? false : true;
        if (z10 && z11) {
            this.f18746F = view2;
            return;
        }
        if (!z11) {
            if (!z10) {
                this.f18746F = null;
                return;
            }
            this.f18746F = null;
            if (v0().x0().a()) {
                ((k) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        this.f18746F = view2;
        t tVarV0 = v0();
        int iOrdinal = tVarV0.x0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new a();
        }
        f.w(tVarV0);
    }

    public final t v0() {
        if (!this.f19339r.f19338E) {
            G0.a.b("visitLocalDescendants called on an unattached node");
        }
        q qVar = this.f19339r;
        if ((qVar.f19342u & 1024) != 0) {
            boolean z10 = false;
            for (q qVar2 = qVar.f19344w; qVar2 != null; qVar2 = qVar2.f19344w) {
                if ((qVar2.f19341t & 1024) != 0) {
                    q qVarF = qVar2;
                    e eVar = null;
                    while (qVarF != null) {
                        if (qVarF instanceof t) {
                            t tVar = (t) qVarF;
                            if (z10) {
                                return tVar;
                            }
                            z10 = true;
                        } else if ((qVarF.f19341t & 1024) != 0 && (qVarF instanceof AbstractC0291n)) {
                            int i10 = 0;
                            for (q qVar3 = ((AbstractC0291n) qVarF).f4151G; qVar3 != null; qVar3 = qVar3.f19344w) {
                                if ((qVar3.f19341t & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        qVarF = qVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new e(new q[16]);
                                        }
                                        if (qVarF != null) {
                                            eVar.b(qVarF);
                                            qVarF = null;
                                        }
                                        eVar.b(qVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        qVarF = AbstractC0283f.f(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }
}
