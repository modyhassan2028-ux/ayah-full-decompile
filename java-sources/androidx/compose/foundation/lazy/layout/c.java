package androidx.compose.foundation.lazy.layout;

import A.C0033n;
import A.K;
import G.B;
import G.L;
import G.M;
import G.RunnableC0168b;
import G.f0;
import H0.a0;
import H0.d0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import Z.X;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import l0.r;
import p110k9.y;
import p241y9.e;
import p241y9.f;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L f11855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f11856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f11857t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f11858u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(L l10, r rVar, e eVar, X x9) {
        super(3);
        this.f11855r = l10;
        this.f11856s = rVar;
        this.f11857t = eVar;
        this.f11858u = x9;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        r rVarB;
        p085i0.c cVar = (p085i0.c) obj;
        C0698o c0698o = (C0698o) obj2;
        ((Number) obj3).intValue();
        Object objH = c0698o.H();
        S s10 = C0690k.f10683a;
        if (objH == s10) {
            objH = new B(cVar, new F.k(this.f11858u, 1));
            c0698o.e0(objH);
        }
        B b5 = (B) objH;
        Object objH2 = c0698o.H();
        if (objH2 == s10) {
            objH2 = new d0(new M.k(b5));
            c0698o.e0(objH2);
        }
        d0 d0Var = (d0) objH2;
        L l10 = this.f11855r;
        if (l10 != null) {
            c0698o.T(204281539);
            c0698o.T(6591363);
            Object obj4 = f0.f2695a;
            if (obj4 != null) {
                c0698o.T(1213893039);
                c0698o.p(false);
            } else {
                c0698o.T(1213931944);
                View view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
                boolean zG = c0698o.g(view);
                Object objH3 = c0698o.H();
                if (zG || objH3 == s10) {
                    objH3 = new RunnableC0168b(view);
                    c0698o.e0(objH3);
                }
                obj4 = (RunnableC0168b) objH3;
                c0698o.p(false);
            }
            Object obj5 = obj4;
            c0698o.p(false);
            Object[] objArr = {l10, b5, d0Var, obj5};
            boolean zG2 = c0698o.g(l10) | c0698o.i(b5) | c0698o.i(d0Var) | c0698o.i(obj5);
            Object objH4 = c0698o.H();
            if (zG2 || objH4 == s10) {
                objH4 = new C0033n(l10, b5, d0Var, obj5, 2);
                c0698o.e0(objH4);
            }
            C0672b.e(objArr, (p241y9.c) objH4, c0698o);
            c0698o.p(false);
        } else {
            c0698o.T(204710145);
            c0698o.p(false);
        }
        int i10 = M.f2601b;
        r rVar = this.f11856s;
        if (l10 != null && (rVarB = rVar.b(new TraversablePrefetchStateModifierElement(l10))) != null) {
            rVar = rVarB;
        }
        boolean zG3 = c0698o.g(b5);
        e eVar = this.f11857t;
        boolean zG4 = zG3 | c0698o.g(eVar);
        Object objH5 = c0698o.H();
        if (zG4 || objH5 == s10) {
            objH5 = new K(3, b5, eVar);
            c0698o.e0(objH5);
        }
        a0.a(d0Var, rVar, (e) objH5, c0698o, 8);
        return y.f19095a;
    }
}
