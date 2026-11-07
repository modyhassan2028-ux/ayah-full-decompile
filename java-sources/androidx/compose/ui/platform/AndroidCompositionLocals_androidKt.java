package androidx.compose.ui.platform;

import A.C0007a;
import A.I0;
import A.K;
import A.U0;
import K0.AbstractC0359n0;
import K0.AbstractC0376w0;
import K0.C0335b0;
import K0.C0356m;
import K0.C0360o;
import K0.C0361o0;
import K0.C0366r0;
import K0.C0368s0;
import K0.C0370t0;
import K0.G0;
import K0.Q;
import K0.S;
import K0.T;
import P0.d;
import Z.AbstractC0693l0;
import Z.C0672b;
import Z.C0690k;
import Z.C0695m0;
import Z.C0698o;
import Z.C0699o0;
import Z.C0709z;
import Z.M0;
import Z.X;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.ayah.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p085i0.k;
import p085i0.l;
import p110k9.y;
import p241y9.c;
import p241y9.e;
import p243z0.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0709z f12062a = new C0709z(Q.f4988s);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M0 f12063b = new M0(Q.f4989t);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M0 f12064c = new M0(Q.f4990u);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M0 f12065d = new M0(Q.f4991v);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M0 f12066e = new M0(Q.f4992w);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M0 f12067f = new M0(Q.f4993x);

    public static final void a(AndroidComposeView androidComposeView, e eVar, C0698o c0698o, int i10) {
        int i11;
        X x9;
        char c10;
        LinkedHashMap linkedHashMap;
        boolean z10;
        c0698o.V(1396852028);
        int i12 = (c0698o.i(androidComposeView) ? 4 : 2) | i10 | (c0698o.i(eVar) ? 32 : 16);
        if (c0698o.K(i12 & 1, (i12 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objH = c0698o.H();
            Object obj = C0690k.f10683a;
            if (objH == obj) {
                objH = C0672b.r(new Configuration(context.getResources().getConfiguration()));
                c0698o.e0(objH);
            }
            X x10 = (X) objH;
            Object objH2 = c0698o.H();
            int i13 = 5;
            if (objH2 == obj) {
                objH2 = new U0(x10, i13);
                c0698o.e0(objH2);
            }
            androidComposeView.setConfigurationChangeObserver((c) objH2);
            Object objH3 = c0698o.H();
            if (objH3 == obj) {
                objH3 = new C0335b0(context);
                c0698o.e0(objH3);
            }
            C0335b0 c0335b0 = (C0335b0) objH3;
            C0356m viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            M2.e eVar2 = viewTreeOwners.f5098b;
            Object objH4 = c0698o.H();
            if (objH4 == obj) {
                Object parent = androidComposeView.getParent();
                c10 = 1;
                j.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = p085i0.j.class.getSimpleName() + ':' + strValueOf;
                L5.c cVarB = eVar2.b();
                Bundle bundleM = cVarB.m(str);
                i11 = 7;
                if (bundleM != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleM.keySet()) {
                        ArrayList parcelableArrayList = bundleM.getParcelableArrayList(str2);
                        j.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str2, parcelableArrayList);
                        x10 = x10;
                    }
                } else {
                    linkedHashMap = null;
                }
                x9 = x10;
                C0360o c0360o = C0360o.f5138v;
                M0 m10 = l.f16731a;
                k kVar = new k(linkedHashMap, c0360o);
                try {
                    cVarB.L(str, new C0368s0(0, kVar));
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                Object c0366r0 = new C0366r0(kVar, new C0370t0(z10, cVarB, str));
                c0698o.e0(c0366r0);
                objH4 = c0366r0;
            } else {
                x9 = x10;
                c10 = 1;
                i11 = 7;
            }
            Object obj2 = (C0366r0) objH4;
            boolean zI = c0698o.i(obj2);
            Object objH5 = c0698o.H();
            if (zI || objH5 == obj) {
                objH5 = new A.M0(15, obj2);
                c0698o.e0(objH5);
            }
            C0672b.d(y.f19095a, (c) objH5, c0698o);
            Object objH6 = c0698o.H();
            if (objH6 == obj) {
                objH6 = AbstractC0376w0.a(context) ? new C0361o0(0, androidComposeView.getView()) : new G0();
                c0698o.e0(objH6);
            }
            a aVar = (a) objH6;
            Configuration configuration = (Configuration) x9.getValue();
            Object objH7 = c0698o.H();
            if (objH7 == obj) {
                objH7 = new P0.c();
                c0698o.e0(objH7);
            }
            P0.c cVar = (P0.c) objH7;
            Object objH8 = c0698o.H();
            Object obj3 = objH8;
            if (objH8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0698o.e0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objH9 = c0698o.H();
            if (objH9 == obj) {
                objH9 = new S(configuration3, cVar);
                c0698o.e0(objH9);
            }
            S s10 = (S) objH9;
            boolean zI2 = c0698o.i(context);
            Object objH10 = c0698o.H();
            if (zI2 || objH10 == obj) {
                objH10 = new C0007a(16, context, s10);
                c0698o.e0(objH10);
            }
            C0672b.d(cVar, (c) objH10, c0698o);
            Object objH11 = c0698o.H();
            if (objH11 == obj) {
                objH11 = new d();
                c0698o.e0(objH11);
            }
            d dVar = (d) objH11;
            Object objH12 = c0698o.H();
            if (objH12 == obj) {
                objH12 = new T(dVar);
                c0698o.e0(objH12);
            }
            T t2 = (T) objH12;
            boolean zI3 = c0698o.i(context);
            Object objH13 = c0698o.H();
            if (zI3 || objH13 == obj) {
                objH13 = new C0007a(17, context, t2);
                c0698o.e0(objH13);
            }
            C0672b.d(dVar, (c) objH13, c0698o);
            AbstractC0693l0 abstractC0693l0 = AbstractC0359n0.f5131v;
            boolean zBooleanValue = ((Boolean) c0698o.k(abstractC0693l0)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release();
            C0695m0 c0695m0A = f12062a.a((Configuration) x9.getValue());
            C0695m0 c0695m0A2 = f12063b.a(context);
            C0695m0 c0695m0A3 = p087i2.a.f16736a.a(viewTreeOwners.f5097a);
            C0695m0 c0695m0A4 = f12066e.a(eVar2);
            C0695m0 c0695m0A5 = l.f16731a.a(obj2);
            C0695m0 c0695m0A6 = f12067f.a(androidComposeView.getView());
            C0695m0 c0695m0A7 = f12064c.a(cVar);
            C0695m0 c0695m0A8 = f12065d.a(dVar);
            C0695m0 c0695m0A9 = abstractC0693l0.a(Boolean.valueOf(zBooleanValue));
            C0695m0 c0695m0A10 = AbstractC0359n0.f5121l.a(aVar);
            C0695m0[] c0695m0Arr = new C0695m0[10];
            c0695m0Arr[0] = c0695m0A;
            c0695m0Arr[c10] = c0695m0A2;
            c0695m0Arr[2] = c0695m0A3;
            c0695m0Arr[3] = c0695m0A4;
            c0695m0Arr[4] = c0695m0A5;
            c0695m0Arr[5] = c0695m0A6;
            c0695m0Arr[6] = c0695m0A7;
            c0695m0Arr[i11] = c0695m0A8;
            c0695m0Arr[8] = c0695m0A9;
            c0695m0Arr[9] = c0695m0A10;
            C0672b.b(c0695m0Arr, p074h0.j.d(1471621628, new I0(androidComposeView, c0335b0, eVar, 3), c0698o), c0698o, 56);
        } else {
            i11 = 7;
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new K(i10, i11, androidComposeView, eVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0693l0 getLocalLifecycleOwner() {
        return p087i2.a.f16736a;
    }

    public static final AbstractC0693l0 getLocalSavedStateRegistryOwner() {
        return f12066e;
    }
}
