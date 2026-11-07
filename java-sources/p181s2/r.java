package p181s2;

import A.EnumC0047u0;
import F2.s;
import G9.m;
import Z.C0672b;
import Z.C0690k;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.lifecycle.InterfaceC0762k;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import java.lang.ref.WeakReference;
import p074h0.d;
import p085i0.c;
import p085i0.n;
import p113l2.a;
import p173r2.j;
import p232y.L;
import p232y.j0;
import p249z7.b;
import p251z9.e;
import p251z9.w;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final void a(j jVar, c cVar, d dVar, C0698o c0698o, int i10) {
        c0698o.V(233973821);
        if ((((c0698o.i(jVar) ? 4 : 2) | i10 | (c0698o.i(cVar) ? 32 : 16)) & 147) == 146 && c0698o.x()) {
            c0698o.N();
        } else {
            C0672b.b(new C0695m0[]{a.f19381a.a(jVar), p087i2.a.f16736a.a(jVar), N2.a.f6000a.a(jVar)}, p074h0.j.d(1808964477, new m(1, cVar, dVar), c0698o), c0698o, 56);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a(jVar, cVar, dVar, i10, 13);
        }
    }

    public static final void b(c cVar, d dVar, C0698o c0698o, int i10) {
        c0698o.V(832919318);
        int i11 = (c0698o.i(cVar) ? 4 : 2) | i10 | (c0698o.i(dVar) ? 32 : 16);
        if ((i11 & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = new m(25);
                c0698o.e0(objH);
            }
            p241y9.c cVar2 = (p241y9.c) objH;
            V vA = a.a(c0698o);
            if (vA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            e eVarA = w.a(C1305a.class);
            s sVar = new s(1);
            sVar.a(w.a(C1305a.class), cVar2);
            p018b9.d dVarC = sVar.c();
            p105k2.c cVarF = vA instanceof InterfaceC0762k ? ((InterfaceC0762k) vA).f() : p105k2.a.f18957b;
            U uG = vA.g();
            p251z9.j.e(uG, "store");
            p251z9.j.e(cVarF, "extras");
            Aa.a aVar = new Aa.a(uG, dVarC, cVarF);
            String strB = eVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C1305a c1305a = (C1305a) aVar.x("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA);
            p151p.V v10 = new p151p.V();
            v10.f20603r = new WeakReference(cVar);
            c1305a.f22066d = v10;
            cVar.a(c1305a.f22065c, dVar, c0698o, ((i11 << 6) & 896) | (i11 & 112));
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 12, cVar, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet c(p249z7.e eVar, float f3, float f7, float f10) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, b.f24850a, p249z7.a.f24848b, new p249z7.d(f3, f7, f10));
        p249z7.d revealInfo = eVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) eVar, (int) f3, (int) f7, revealInfo.f24854c, f10);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static final j0 d(C0698o c0698o) {
        Object[] objArr = new Object[0];
        n nVar = j0.f24534i;
        boolean zE = c0698o.e(0);
        Object objH = c0698o.H();
        if (zE || objH == C0690k.f10683a) {
            objH = new L(0, 2);
            c0698o.e0(objH);
        }
        return (j0) g.H(objArr, nVar, (p241y9.a) objH, c0698o, 0, 4);
    }

    public static l0.r e(l0.r rVar, j0 j0Var) {
        return androidx.compose.foundation.a.h(rVar, j0Var, EnumC0047u0.f424r, true, null, j0Var.f24537c, true, null).b(new ScrollingLayoutElement(j0Var));
    }
}
