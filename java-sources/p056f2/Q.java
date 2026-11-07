package p056f2;

import Aa.a;
import I1.G;
import I1.S;
import K0.ViewOnAttachStateChangeListenerC0381z;
import L5.c;
import W.AbstractC0607v1;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.U;
import com.ayah.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p064g2.b;
import p251z9.e;
import p251z9.j;
import p251z9.w;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0947u f16017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16018d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16019e = -1;

    public Q(c cVar, a aVar, AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        this.f16015a = cVar;
        this.f16016b = aVar;
        this.f16017c = abstractComponentCallbacksC0947u;
    }

    public final void a() {
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0947u);
        }
        Bundle bundle = abstractComponentCallbacksC0947u.f16162s;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0947u.f16139M.Q();
        abstractComponentCallbacksC0947u.f16161r = 3;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.v();
        if (!abstractComponentCallbacksC0947u.f16143V) {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onActivityCreated()");
        }
        if (K.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0947u);
        }
        if (abstractComponentCallbacksC0947u.f16145X != null) {
            Bundle bundle2 = abstractComponentCallbacksC0947u.f16162s;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0947u.f16163t;
            if (sparseArray != null) {
                abstractComponentCallbacksC0947u.f16145X.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0947u.f16163t = null;
            }
            abstractComponentCallbacksC0947u.f16143V = false;
            abstractComponentCallbacksC0947u.J(bundle3);
            if (!abstractComponentCallbacksC0947u.f16143V) {
                throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0947u.f16145X != null) {
                abstractComponentCallbacksC0947u.f16155h0.c(EnumC0766o.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0947u.f16162s = null;
        L l10 = abstractComponentCallbacksC0947u.f16139M;
        l10.f15953H = false;
        l10.f15954I = false;
        l10.f15960O.g = false;
        l10.u(4);
        this.f16015a.n(abstractComponentCallbacksC0947u, false);
    }

    public final void b() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u;
        View view;
        View view2;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = this.f16017c;
        View view3 = abstractComponentCallbacksC0947u2.f16144W;
        while (true) {
            abstractComponentCallbacksC0947u = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u3 = tag instanceof AbstractComponentCallbacksC0947u ? (AbstractComponentCallbacksC0947u) tag : null;
            if (abstractComponentCallbacksC0947u3 != null) {
                abstractComponentCallbacksC0947u = abstractComponentCallbacksC0947u3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u4 = abstractComponentCallbacksC0947u2.f16140N;
        if (abstractComponentCallbacksC0947u != null && !abstractComponentCallbacksC0947u.equals(abstractComponentCallbacksC0947u4)) {
            int i10 = abstractComponentCallbacksC0947u2.f16142P;
            b bVar = p064g2.c.f16271a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC0947u2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC0947u);
            sb.append(" via container with ID ");
            p064g2.c.b(new p064g2.a(abstractComponentCallbacksC0947u2, p245z2.a.E(sb, i10, " without using parent's childFragmentManager")));
            p064g2.c.a(abstractComponentCallbacksC0947u2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.f16016b.f556t;
        ViewGroup viewGroup = abstractComponentCallbacksC0947u2.f16144W;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0947u2);
            for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u5 = (AbstractComponentCallbacksC0947u) arrayList.get(i11);
                if (abstractComponentCallbacksC0947u5.f16144W == viewGroup && (view2 = abstractComponentCallbacksC0947u5.f16145X) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u6 = (AbstractComponentCallbacksC0947u) arrayList.get(iIndexOf);
                if (abstractComponentCallbacksC0947u6.f16144W == viewGroup && (view = abstractComponentCallbacksC0947u6.f16145X) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        abstractComponentCallbacksC0947u2.f16144W.addView(abstractComponentCallbacksC0947u2.f16145X, iIndexOfChild);
    }

    public final void c() {
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0947u);
        }
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = abstractComponentCallbacksC0947u.f16167x;
        Q q10 = null;
        a aVar = this.f16016b;
        if (abstractComponentCallbacksC0947u2 != null) {
            Q q11 = (Q) ((HashMap) aVar.f554r).get(abstractComponentCallbacksC0947u2.f16165v);
            if (q11 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0947u + " declared target fragment " + abstractComponentCallbacksC0947u.f16167x + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0947u.f16168y = abstractComponentCallbacksC0947u.f16167x.f16165v;
            abstractComponentCallbacksC0947u.f16167x = null;
            q10 = q11;
        } else {
            String str = abstractComponentCallbacksC0947u.f16168y;
            if (str != null && (q10 = (Q) ((HashMap) aVar.f554r).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0947u);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(p.B(sb, abstractComponentCallbacksC0947u.f16168y, " that does not belong to this FragmentManager!"));
            }
        }
        if (q10 != null) {
            q10.k();
        }
        K k7 = abstractComponentCallbacksC0947u.f16137K;
        abstractComponentCallbacksC0947u.f16138L = k7.f15982w;
        abstractComponentCallbacksC0947u.f16140N = k7.f15984y;
        c cVar = this.f16015a;
        cVar.u(abstractComponentCallbacksC0947u, false);
        ArrayList arrayList = abstractComponentCallbacksC0947u.f16159l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r) obj).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0947u.f16139M.b(abstractComponentCallbacksC0947u.f16138L, abstractComponentCallbacksC0947u.d(), abstractComponentCallbacksC0947u);
        abstractComponentCallbacksC0947u.f16161r = 0;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.y(abstractComponentCallbacksC0947u.f16138L.f16173s);
        if (!abstractComponentCallbacksC0947u.f16143V) {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onAttach()");
        }
        Iterator it = abstractComponentCallbacksC0947u.f16137K.f15975p.iterator();
        while (it.hasNext()) {
            ((O) it.next()).c();
        }
        L l10 = abstractComponentCallbacksC0947u.f16139M;
        l10.f15953H = false;
        l10.f15954I = false;
        l10.f15960O.g = false;
        l10.u(0);
        cVar.o(abstractComponentCallbacksC0947u, false);
    }

    public final int d() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (abstractComponentCallbacksC0947u.f16137K == null) {
            return abstractComponentCallbacksC0947u.f16161r;
        }
        int iMin = this.f16019e;
        int iOrdinal = abstractComponentCallbacksC0947u.f16153f0.ordinal();
        int i10 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0947u.f16131E) {
            if (abstractComponentCallbacksC0947u.f16132F) {
                iMin = Math.max(this.f16019e, 2);
                View view = abstractComponentCallbacksC0947u.f16145X;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f16019e < 4 ? Math.min(iMin, abstractComponentCallbacksC0947u.f16161r) : Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC0947u.f16133G && abstractComponentCallbacksC0947u.f16144W == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC0947u.f16128B) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0947u.f16144W;
        if (viewGroup != null) {
            C0941n c0941nI = C0941n.i(viewGroup, abstractComponentCallbacksC0947u.o());
            X xF = c0941nI.f(abstractComponentCallbacksC0947u);
            int i11 = xF != null ? xF.f16040b : 0;
            X xG = c0941nI.g(abstractComponentCallbacksC0947u);
            i10 = xG != null ? xG.f16040b : 0;
            int i12 = i11 == 0 ? -1 : Y.f16049a[AbstractC0607v1.b(i11)];
            if (i12 != -1 && i12 != 1) {
                i10 = i11;
            }
        }
        if (i10 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i10 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0947u.f16129C) {
            iMin = abstractComponentCallbacksC0947u.u() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0947u.f16146Y && abstractComponentCallbacksC0947u.f16161r < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC0947u.f16130D) {
            iMin = Math.max(iMin, 3);
        }
        if (K.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0947u);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0947u);
        }
        Bundle bundle2 = abstractComponentCallbacksC0947u.f16162s;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0947u.f16151d0) {
            abstractComponentCallbacksC0947u.f16161r = 1;
            Bundle bundle4 = abstractComponentCallbacksC0947u.f16162s;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0947u.f16139M.W(bundle);
            L l10 = abstractComponentCallbacksC0947u.f16139M;
            l10.f15953H = false;
            l10.f15954I = false;
            l10.f15960O.g = false;
            l10.u(1);
            return;
        }
        c cVar = this.f16015a;
        cVar.v(abstractComponentCallbacksC0947u, false);
        abstractComponentCallbacksC0947u.f16139M.Q();
        abstractComponentCallbacksC0947u.f16161r = 1;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.f16154g0.a(new M2.b(3, abstractComponentCallbacksC0947u));
        abstractComponentCallbacksC0947u.z(bundle3);
        abstractComponentCallbacksC0947u.f16151d0 = true;
        if (abstractComponentCallbacksC0947u.f16143V) {
            abstractComponentCallbacksC0947u.f16154g0.d(EnumC0766o.ON_CREATE);
            cVar.q(abstractComponentCallbacksC0947u, false);
        } else {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String resourceName;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (abstractComponentCallbacksC0947u.f16131E) {
            return;
        }
        if (K.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0947u);
        }
        Bundle bundle = abstractComponentCallbacksC0947u.f16162s;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterE = abstractComponentCallbacksC0947u.E(bundle2);
        abstractComponentCallbacksC0947u.f16150c0 = layoutInflaterE;
        ViewGroup viewGroup = abstractComponentCallbacksC0947u.f16144W;
        if (viewGroup == null) {
            int i10 = abstractComponentCallbacksC0947u.f16142P;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0947u + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0947u.f16137K.f15983x.d(i10);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0947u.f16134H && !abstractComponentCallbacksC0947u.f16133G) {
                        try {
                            resourceName = abstractComponentCallbacksC0947u.p().getResourceName(abstractComponentCallbacksC0947u.f16142P);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0947u.f16142P) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0947u);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    b bVar = p064g2.c.f16271a;
                    p064g2.c.b(new p064g2.a(abstractComponentCallbacksC0947u, "Attempting to add fragment " + abstractComponentCallbacksC0947u + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    p064g2.c.a(abstractComponentCallbacksC0947u).getClass();
                }
            }
        }
        abstractComponentCallbacksC0947u.f16144W = viewGroup;
        abstractComponentCallbacksC0947u.K(layoutInflaterE, viewGroup, bundle2);
        if (abstractComponentCallbacksC0947u.f16145X != null) {
            if (K.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0947u);
            }
            abstractComponentCallbacksC0947u.f16145X.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0947u.f16145X.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0947u);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0947u.R) {
                abstractComponentCallbacksC0947u.f16145X.setVisibility(8);
            }
            if (abstractComponentCallbacksC0947u.f16145X.isAttachedToWindow()) {
                View view = abstractComponentCallbacksC0947u.f16145X;
                WeakHashMap weakHashMap = S.f3689a;
                G.c(view);
            } else {
                View view2 = abstractComponentCallbacksC0947u.f16145X;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0381z(5, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0947u.f16162s;
            abstractComponentCallbacksC0947u.I(bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            abstractComponentCallbacksC0947u.f16139M.u(2);
            this.f16015a.A(abstractComponentCallbacksC0947u, abstractComponentCallbacksC0947u.f16145X, false);
            int visibility = abstractComponentCallbacksC0947u.f16145X.getVisibility();
            abstractComponentCallbacksC0947u.i().j = abstractComponentCallbacksC0947u.f16145X.getAlpha();
            if (abstractComponentCallbacksC0947u.f16144W != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0947u.f16145X.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0947u.i().f16125k = viewFindFocus;
                    if (K.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0947u);
                    }
                }
                abstractComponentCallbacksC0947u.f16145X.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0947u.f16161r = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uM;
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0947u);
        }
        boolean zIsChangingConfigurations = true;
        int i10 = 0;
        boolean z10 = abstractComponentCallbacksC0947u.f16129C && !abstractComponentCallbacksC0947u.u();
        a aVar = this.f16016b;
        if (z10) {
            aVar.I(abstractComponentCallbacksC0947u.f16165v, null);
        }
        if (!z10) {
            N n6 = (N) aVar.f557u;
            if (!((n6.f15995b.containsKey(abstractComponentCallbacksC0947u.f16165v) && n6.f15998e) ? n6.f15999f : true)) {
                String str = abstractComponentCallbacksC0947u.f16168y;
                if (str != null && (abstractComponentCallbacksC0947uM = aVar.m(str)) != null && abstractComponentCallbacksC0947uM.T) {
                    abstractComponentCallbacksC0947u.f16167x = abstractComponentCallbacksC0947uM;
                }
                abstractComponentCallbacksC0947u.f16161r = 0;
                return;
            }
        }
        C0949w c0949w = abstractComponentCallbacksC0947u.f16138L;
        if (c0949w != null) {
            zIsChangingConfigurations = ((N) aVar.f557u).f15999f;
        } else {
            FragmentActivity fragmentActivity = c0949w.f16173s;
            if (p123m2.c.D(fragmentActivity)) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (z10 || zIsChangingConfigurations) {
            ((N) aVar.f557u).c(abstractComponentCallbacksC0947u, false);
        }
        abstractComponentCallbacksC0947u.f16139M.l();
        abstractComponentCallbacksC0947u.f16154g0.d(EnumC0766o.ON_DESTROY);
        abstractComponentCallbacksC0947u.f16161r = 0;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.f16151d0 = false;
        abstractComponentCallbacksC0947u.B();
        if (!abstractComponentCallbacksC0947u.f16143V) {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onDestroy()");
        }
        this.f16015a.r(abstractComponentCallbacksC0947u, false);
        ArrayList arrayListQ = aVar.q();
        int size = arrayListQ.size();
        while (i10 < size) {
            Object obj = arrayListQ.get(i10);
            i10++;
            Q q10 = (Q) obj;
            if (q10 != null) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
                if (abstractComponentCallbacksC0947u.f16165v.equals(abstractComponentCallbacksC0947u2.f16168y)) {
                    abstractComponentCallbacksC0947u2.f16167x = abstractComponentCallbacksC0947u;
                    abstractComponentCallbacksC0947u2.f16168y = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0947u.f16168y;
        if (str2 != null) {
            abstractComponentCallbacksC0947u.f16167x = aVar.m(str2);
        }
        aVar.A(this);
    }

    public final void h() {
        View view;
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0947u);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0947u.f16144W;
        if (viewGroup != null && (view = abstractComponentCallbacksC0947u.f16145X) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0947u.f16139M.u(1);
        if (abstractComponentCallbacksC0947u.f16145X != null) {
            U u8 = abstractComponentCallbacksC0947u.f16155h0;
            u8.d();
            if (u8.f16033v.f12672c.compareTo(EnumC0767p.f12663t) >= 0) {
                abstractComponentCallbacksC0947u.f16155h0.c(EnumC0766o.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0947u.f16161r = 1;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.C();
        if (!abstractComponentCallbacksC0947u.f16143V) {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onDestroyView()");
        }
        U uG = abstractComponentCallbacksC0947u.g();
        j.e(uG, "store");
        p105k2.a aVar = p105k2.a.f18957b;
        j.e(aVar, "defaultCreationExtras");
        a aVar2 = new a(uG, p133n2.a.f19981c, aVar);
        e eVarA = w.a(p133n2.a.class);
        String strB = eVarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        P p10 = ((p133n2.a) aVar2.x("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA)).f19982b;
        if (p10.g() > 0) {
            p10.h(0).getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0947u.f16135I = false;
        this.f16015a.B(abstractComponentCallbacksC0947u, false);
        abstractComponentCallbacksC0947u.f16144W = null;
        abstractComponentCallbacksC0947u.f16145X = null;
        abstractComponentCallbacksC0947u.f16155h0 = null;
        abstractComponentCallbacksC0947u.f16156i0.d(null);
        abstractComponentCallbacksC0947u.f16132F = false;
    }

    public final void i() {
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0947u);
        }
        abstractComponentCallbacksC0947u.f16161r = -1;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.D();
        abstractComponentCallbacksC0947u.f16150c0 = null;
        if (!abstractComponentCallbacksC0947u.f16143V) {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onDetach()");
        }
        L l10 = abstractComponentCallbacksC0947u.f16139M;
        if (!l10.f15955J) {
            l10.l();
            abstractComponentCallbacksC0947u.f16139M = new L();
        }
        this.f16015a.s(abstractComponentCallbacksC0947u, false);
        abstractComponentCallbacksC0947u.f16161r = -1;
        abstractComponentCallbacksC0947u.f16138L = null;
        abstractComponentCallbacksC0947u.f16140N = null;
        abstractComponentCallbacksC0947u.f16137K = null;
        if (!abstractComponentCallbacksC0947u.f16129C || abstractComponentCallbacksC0947u.u()) {
            N n6 = (N) this.f16016b.f557u;
            if (!((n6.f15995b.containsKey(abstractComponentCallbacksC0947u.f16165v) && n6.f15998e) ? n6.f15999f : true)) {
                return;
            }
        }
        if (K.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0947u);
        }
        abstractComponentCallbacksC0947u.s();
    }

    public final void j() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (abstractComponentCallbacksC0947u.f16131E && abstractComponentCallbacksC0947u.f16132F && !abstractComponentCallbacksC0947u.f16135I) {
            if (K.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0947u);
            }
            Bundle bundle = abstractComponentCallbacksC0947u.f16162s;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterE = abstractComponentCallbacksC0947u.E(bundle2);
            abstractComponentCallbacksC0947u.f16150c0 = layoutInflaterE;
            abstractComponentCallbacksC0947u.K(layoutInflaterE, null, bundle2);
            View view = abstractComponentCallbacksC0947u.f16145X;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0947u.f16145X.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0947u);
                if (abstractComponentCallbacksC0947u.R) {
                    abstractComponentCallbacksC0947u.f16145X.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0947u.f16162s;
                abstractComponentCallbacksC0947u.I(bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                abstractComponentCallbacksC0947u.f16139M.u(2);
                this.f16015a.A(abstractComponentCallbacksC0947u, abstractComponentCallbacksC0947u.f16145X, false);
                abstractComponentCallbacksC0947u.f16161r = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        a aVar = this.f16016b;
        boolean z10 = this.f16018d;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (z10) {
            if (K.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0947u);
                return;
            }
            return;
        }
        try {
            this.f16018d = true;
            boolean z11 = false;
            while (true) {
                int iD = d();
                int i10 = abstractComponentCallbacksC0947u.f16161r;
                int i11 = 3;
                if (iD == i10) {
                    if (!z11 && i10 == -1 && abstractComponentCallbacksC0947u.f16129C && !abstractComponentCallbacksC0947u.u()) {
                        if (K.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0947u);
                        }
                        ((N) aVar.f557u).c(abstractComponentCallbacksC0947u, true);
                        aVar.A(this);
                        if (K.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0947u);
                        }
                        abstractComponentCallbacksC0947u.s();
                    }
                    if (abstractComponentCallbacksC0947u.f16149b0) {
                        if (abstractComponentCallbacksC0947u.f16145X != null && (viewGroup = abstractComponentCallbacksC0947u.f16144W) != null) {
                            C0941n c0941nI = C0941n.i(viewGroup, abstractComponentCallbacksC0947u.o());
                            if (abstractComponentCallbacksC0947u.R) {
                                if (K.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0947u);
                                }
                                c0941nI.d(3, 1, this);
                            } else {
                                if (K.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0947u);
                                }
                                c0941nI.d(2, 1, this);
                            }
                        }
                        K k7 = abstractComponentCallbacksC0947u.f16137K;
                        if (k7 != null && abstractComponentCallbacksC0947u.f16128B && K.L(abstractComponentCallbacksC0947u)) {
                            k7.f15952G = true;
                        }
                        abstractComponentCallbacksC0947u.f16149b0 = false;
                        abstractComponentCallbacksC0947u.f16139M.o();
                    }
                    this.f16018d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0947u.f16161r = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0947u.f16132F = false;
                            abstractComponentCallbacksC0947u.f16161r = 2;
                            break;
                        case 3:
                            if (K.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0947u);
                            }
                            if (abstractComponentCallbacksC0947u.f16145X != null && abstractComponentCallbacksC0947u.f16163t == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0947u.f16145X != null && (viewGroup2 = abstractComponentCallbacksC0947u.f16144W) != null) {
                                C0941n c0941nI2 = C0941n.i(viewGroup2, abstractComponentCallbacksC0947u.o());
                                if (K.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0947u);
                                }
                                c0941nI2.d(1, 3, this);
                            }
                            abstractComponentCallbacksC0947u.f16161r = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0947u.f16161r = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0947u.f16145X != null && (viewGroup3 = abstractComponentCallbacksC0947u.f16144W) != null) {
                                C0941n c0941nI3 = C0941n.i(viewGroup3, abstractComponentCallbacksC0947u.o());
                                int visibility = abstractComponentCallbacksC0947u.f16145X.getVisibility();
                                if (visibility == 0) {
                                    i11 = 2;
                                } else if (visibility == 4) {
                                    i11 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                p123m2.c.z(i11, "finalState");
                                if (K.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0947u);
                                }
                                c0941nI3.d(i11, 2, this);
                            }
                            abstractComponentCallbacksC0947u.f16161r = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0947u.f16161r = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th) {
            this.f16018d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0947u);
        }
        abstractComponentCallbacksC0947u.f16139M.u(5);
        if (abstractComponentCallbacksC0947u.f16145X != null) {
            abstractComponentCallbacksC0947u.f16155h0.c(EnumC0766o.ON_PAUSE);
        }
        abstractComponentCallbacksC0947u.f16154g0.d(EnumC0766o.ON_PAUSE);
        abstractComponentCallbacksC0947u.f16161r = 6;
        abstractComponentCallbacksC0947u.f16143V = true;
        this.f16015a.t(abstractComponentCallbacksC0947u, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        Bundle bundle = abstractComponentCallbacksC0947u.f16162s;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0947u.f16162s.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0947u.f16162s.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0947u.f16163t = abstractComponentCallbacksC0947u.f16162s.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0947u.f16164u = abstractComponentCallbacksC0947u.f16162s.getBundle("viewRegistryState");
            P p10 = (P) abstractComponentCallbacksC0947u.f16162s.getParcelable("state");
            if (p10 != null) {
                abstractComponentCallbacksC0947u.f16168y = p10.f16003D;
                abstractComponentCallbacksC0947u.f16169z = p10.f16004E;
                abstractComponentCallbacksC0947u.f16147Z = p10.f16005F;
            }
            if (abstractComponentCallbacksC0947u.f16147Z) {
                return;
            }
            abstractComponentCallbacksC0947u.f16146Y = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0947u, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0947u);
        }
        C0946t c0946t = abstractComponentCallbacksC0947u.f16148a0;
        View view = c0946t == null ? null : c0946t.f16125k;
        if (view != null) {
            if (view == abstractComponentCallbacksC0947u.f16145X) {
                zRequestFocus = view.requestFocus();
                if (K.K(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(abstractComponentCallbacksC0947u);
                    sb.append(" resulting in focused view ");
                    sb.append(abstractComponentCallbacksC0947u.f16145X.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == abstractComponentCallbacksC0947u.f16145X) {
                            zRequestFocus = view.requestFocus();
                            if (K.K(2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(abstractComponentCallbacksC0947u);
                                sb2.append(" resulting in focused view ");
                                sb2.append(abstractComponentCallbacksC0947u.f16145X.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC0947u.i().f16125k = null;
        abstractComponentCallbacksC0947u.f16139M.Q();
        abstractComponentCallbacksC0947u.f16139M.A(true);
        abstractComponentCallbacksC0947u.f16161r = 7;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.f16143V = true;
        if (!abstractComponentCallbacksC0947u.f16143V) {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onResume()");
        }
        androidx.lifecycle.w wVar = abstractComponentCallbacksC0947u.f16154g0;
        EnumC0766o enumC0766o = EnumC0766o.ON_RESUME;
        wVar.d(enumC0766o);
        if (abstractComponentCallbacksC0947u.f16145X != null) {
            abstractComponentCallbacksC0947u.f16155h0.f16033v.d(enumC0766o);
        }
        L l10 = abstractComponentCallbacksC0947u.f16139M;
        l10.f15953H = false;
        l10.f15954I = false;
        l10.f15960O.g = false;
        l10.u(7);
        this.f16015a.w(abstractComponentCallbacksC0947u, false);
        this.f16016b.I(abstractComponentCallbacksC0947u.f16165v, null);
        abstractComponentCallbacksC0947u.f16162s = null;
        abstractComponentCallbacksC0947u.f16163t = null;
        abstractComponentCallbacksC0947u.f16164u = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (abstractComponentCallbacksC0947u.f16145X == null) {
            return;
        }
        if (K.K(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0947u + " with view " + abstractComponentCallbacksC0947u.f16145X);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0947u.f16145X.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0947u.f16163t = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0947u.f16155h0.f16034w.J(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0947u.f16164u = bundle;
    }

    public final void p() {
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0947u);
        }
        abstractComponentCallbacksC0947u.f16139M.Q();
        abstractComponentCallbacksC0947u.f16139M.A(true);
        abstractComponentCallbacksC0947u.f16161r = 5;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.G();
        if (!abstractComponentCallbacksC0947u.f16143V) {
            throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onStart()");
        }
        androidx.lifecycle.w wVar = abstractComponentCallbacksC0947u.f16154g0;
        EnumC0766o enumC0766o = EnumC0766o.ON_START;
        wVar.d(enumC0766o);
        if (abstractComponentCallbacksC0947u.f16145X != null) {
            abstractComponentCallbacksC0947u.f16155h0.f16033v.d(enumC0766o);
        }
        L l10 = abstractComponentCallbacksC0947u.f16139M;
        l10.f15953H = false;
        l10.f15954I = false;
        l10.f15960O.g = false;
        l10.u(5);
        this.f16015a.y(abstractComponentCallbacksC0947u, false);
    }

    public final void q() {
        boolean zK = K.K(3);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16017c;
        if (zK) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0947u);
        }
        L l10 = abstractComponentCallbacksC0947u.f16139M;
        l10.f15954I = true;
        l10.f15960O.g = true;
        l10.u(4);
        if (abstractComponentCallbacksC0947u.f16145X != null) {
            abstractComponentCallbacksC0947u.f16155h0.c(EnumC0766o.ON_STOP);
        }
        abstractComponentCallbacksC0947u.f16154g0.d(EnumC0766o.ON_STOP);
        abstractComponentCallbacksC0947u.f16161r = 4;
        abstractComponentCallbacksC0947u.f16143V = false;
        abstractComponentCallbacksC0947u.H();
        if (abstractComponentCallbacksC0947u.f16143V) {
            this.f16015a.z(abstractComponentCallbacksC0947u, false);
            return;
        }
        throw new Z("Fragment " + abstractComponentCallbacksC0947u + " did not call through to super.onStop()");
    }

    public Q(c cVar, a aVar, ClassLoader classLoader, D d5, Bundle bundle) {
        this.f16015a = cVar;
        this.f16016b = aVar;
        P p10 = (P) bundle.getParcelable("state");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uA = d5.a(p10.f16006r);
        abstractComponentCallbacksC0947uA.f16165v = p10.f16007s;
        abstractComponentCallbacksC0947uA.f16131E = p10.f16008t;
        abstractComponentCallbacksC0947uA.f16133G = p10.f16009u;
        abstractComponentCallbacksC0947uA.f16134H = true;
        abstractComponentCallbacksC0947uA.f16141O = p10.f16010v;
        abstractComponentCallbacksC0947uA.f16142P = p10.f16011w;
        abstractComponentCallbacksC0947uA.Q = p10.f16012x;
        abstractComponentCallbacksC0947uA.T = p10.f16013y;
        abstractComponentCallbacksC0947uA.f16129C = p10.f16014z;
        abstractComponentCallbacksC0947uA.S = p10.f16000A;
        abstractComponentCallbacksC0947uA.R = p10.f16001B;
        abstractComponentCallbacksC0947uA.f16153f0 = EnumC0767p.values()[p10.f16002C];
        abstractComponentCallbacksC0947uA.f16168y = p10.f16003D;
        abstractComponentCallbacksC0947uA.f16169z = p10.f16004E;
        abstractComponentCallbacksC0947uA.f16147Z = p10.f16005F;
        this.f16017c = abstractComponentCallbacksC0947uA;
        abstractComponentCallbacksC0947uA.f16162s = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0947uA.P(bundle2);
        if (K.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0947uA);
        }
    }

    public Q(c cVar, a aVar, AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, Bundle bundle) {
        this.f16015a = cVar;
        this.f16016b = aVar;
        this.f16017c = abstractComponentCallbacksC0947u;
        abstractComponentCallbacksC0947u.f16163t = null;
        abstractComponentCallbacksC0947u.f16164u = null;
        abstractComponentCallbacksC0947u.f16136J = 0;
        abstractComponentCallbacksC0947u.f16132F = false;
        abstractComponentCallbacksC0947u.f16128B = false;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = abstractComponentCallbacksC0947u.f16167x;
        abstractComponentCallbacksC0947u.f16168y = abstractComponentCallbacksC0947u2 != null ? abstractComponentCallbacksC0947u2.f16165v : null;
        abstractComponentCallbacksC0947u.f16167x = null;
        abstractComponentCallbacksC0947u.f16162s = bundle;
        abstractComponentCallbacksC0947u.f16166w = bundle.getBundle("arguments");
    }
}
