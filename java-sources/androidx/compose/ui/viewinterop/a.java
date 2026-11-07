package androidx.compose.ui.viewinterop;

import J0.AbstractC0274a0;
import J0.C0285h;
import J0.C0287j;
import J0.I;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import M2.e;
import Z.C0672b;
import Z.C0690k;
import Z.C0694m;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import android.content.Context;
import android.support.v4.media.session.p;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0771u;
import l0.q;
import l0.r;
import p063g1.m;
import p085i0.j;
import p085i0.l;
import p094j1.b;
import p094j1.i;
import p094j1.k;
import p162q0.t;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(c cVar, r rVar, c cVar2, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-1783766393);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        int i12 = i11 | (c0698o.i(cVar2) ? 256 : 128);
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            b(cVar, rVar, cVar2, c0698o, ((i12 << 6) & 57344) | (i12 & 14) | 3072 | (i12 & 112));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i(cVar, rVar, cVar2, i10, 0);
        }
    }

    public static final void b(c cVar, r rVar, c cVar2, C0698o c0698o, int i10) {
        int i11;
        Object obj = b.f18709v;
        c0698o.V(-180024211);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.i(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= c0698o.i(obj) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0698o.i(cVar2) ? 16384 : 8192;
        }
        if (c0698o.K(i12 & 1, (i12 & 9363) != 9362)) {
            int i13 = c0698o.f10721P;
            r rVarB = rVar.b(FocusGroupPropertiesElement.f12122a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new AbstractC0274a0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj2) {
                    return obj2 == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // J0.AbstractC0274a0
                public final q k() {
                    return new t(0, null, 7);
                }

                @Override // J0.AbstractC0274a0
                public final /* bridge */ /* synthetic */ void l(q qVar) {
                }
            };
            r rVarC = l0.a.c(c0698o, rVarB.b(focusTargetNode$FocusTargetElement).b(FocusTargetPropertiesElement.f12123a).b(focusTargetNode$FocusTargetElement));
            p063g1.c cVar3 = (p063g1.c) c0698o.k(AbstractC0359n0.f5118h);
            m mVar = (m) c0698o.k(AbstractC0359n0.f5123n);
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            InterfaceC0771u interfaceC0771u = (InterfaceC0771u) c0698o.k(p087i2.a.f16736a);
            e eVar = (e) c0698o.k(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            c0698o.T(608635513);
            int i14 = i12 & 14;
            int i15 = c0698o.f10721P;
            Context context = (Context) c0698o.k(AndroidCompositionLocals_androidKt.f12063b);
            C0694m c0694mT = C0672b.t(c0698o);
            j jVar = (j) c0698o.k(l.f16731a);
            View view = (View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f);
            boolean zI = c0698o.i(context) | ((((i14 & 14) ^ 6) > 4 && c0698o.g(cVar)) || (i14 & 6) == 4) | c0698o.i(c0694mT) | c0698o.i(jVar) | c0698o.e(i15) | c0698o.i(view);
            Object objH = c0698o.H();
            if (zI || objH == C0690k.f10683a) {
                Object kVar = new k(context, cVar, c0694mT, jVar, i15, view);
                c0698o.e0(kVar);
                objH = kVar;
            }
            p241y9.a aVar = (p241y9.a) objH;
            c0698o.O(125, 1, null, null);
            c0698o.f10736q = true;
            if (c0698o.f10720O) {
                c0698o.l(aVar);
            } else {
                c0698o.h0();
            }
            InterfaceC0288k.f4142a.getClass();
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0672b.v(c0698o, rVarC, p094j1.j.f18732u);
            C0672b.v(c0698o, cVar3, p094j1.j.f18733v);
            C0672b.v(c0698o, interfaceC0771u, p094j1.j.f18734w);
            C0672b.v(c0698o, eVar, p094j1.j.f18735x);
            C0672b.v(c0698o, mVar, p094j1.j.f18736y);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i13))) {
                p123m2.c.y(i13, c0698o, i13, c0285h);
            }
            C0672b.v(c0698o, cVar2, p094j1.j.f18730s);
            C0672b.v(c0698o, obj, p094j1.j.f18731t);
            c0698o.p(true);
            c0698o.p(false);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new i(cVar, rVar, cVar2, i10, 1);
        }
    }

    public static final ViewFactoryHolder c(I i10) {
        ViewFactoryHolder viewFactoryHolder = i10.f3902F;
        if (viewFactoryHolder != null) {
            return viewFactoryHolder;
        }
        throw p.s("Required value was null.");
    }
}
