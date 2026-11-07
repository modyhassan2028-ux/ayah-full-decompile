package p056f2;

import android.animation.AnimatorSet;
import android.content.Context;
import android.support.v4.media.session.p;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p120l9.m;
import p123m2.c;
import p251z9.j;

/* JADX INFO: renamed from: f2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0941n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f16105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16110f;

    public C0941n(ViewGroup viewGroup) {
        j.e(viewGroup, "container");
        this.f16105a = viewGroup;
        this.f16106b = new ArrayList();
        this.f16107c = new ArrayList();
    }

    public static final C0941n i(ViewGroup viewGroup, K k7) {
        j.e(viewGroup, "container");
        j.e(k7, "fragmentManager");
        j.d(k7.I(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0941n) {
            return (C0941n) tag;
        }
        C0941n c0941n = new C0941n(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0941n);
        return c0941n;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z10;
        W w9;
        int size = arrayList.size();
        int i10 = 0;
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (i10 >= size) {
                    break loop0;
                }
                Object obj = arrayList.get(i10);
                i10++;
                X x9 = (X) obj;
                if (!x9.f16047k.isEmpty()) {
                    ArrayList arrayList2 = x9.f16047k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    do {
                        if (i11 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        w9 = (W) obj2;
                        w9.getClass();
                    } while (w9 instanceof C0936i);
                }
                z10 = false;
            }
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList.get(i12);
                i12++;
                m.d0(arrayList3, ((X) obj3).f16047k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(X x9) {
        j.e(x9, "operation");
        if (x9.f16046i) {
            p.j(x9.f16039a, x9.f16041c.N(), this.f16105a);
            x9.f16046i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z10) {
        Object obj;
        Object obj2;
        if (K.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            X x9 = (X) obj;
            View view = x9.f16041c.f16145X;
            j.d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(c.r(visibility, "Unknown visibility "));
                    }
                } else if (x9.f16039a != 2) {
                    break;
                }
            }
        }
        X x10 = (X) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            Object objPrevious = listIterator.previous();
            X x11 = (X) objPrevious;
            View view2 = x11.f16041c.f16145X;
            j.d(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(c.r(visibility2, "Unknown visibility "));
                }
            }
            if (x11.f16039a == 2) {
                obj2 = objPrevious;
                break;
            }
        }
        X x12 = (X) obj2;
        if (K.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + x10 + " to " + x12);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = ((X) m.m0(arrayList)).f16041c;
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj3 = arrayList.get(i11);
            i11++;
            C0946t c0946t = ((X) obj3).f16041c.f16148a0;
            C0946t c0946t2 = abstractComponentCallbacksC0947u.f16148a0;
            c0946t.f16118b = c0946t2.f16118b;
            c0946t.f16119c = c0946t2.f16119c;
            c0946t.f16120d = c0946t2.f16120d;
            c0946t.f16121e = c0946t2.f16121e;
        }
        int size3 = arrayList.size();
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= size3) {
                break;
            }
            Object obj4 = arrayList.get(i12);
            i12++;
            X x13 = (X) obj4;
            arrayList2.add(new C0934g(x13, z10));
            if (!z10 ? x13 != x12 : x13 != x10) {
                z11 = false;
            }
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = x13.f16041c;
            C0940m c0940m = new C0940m(x13);
            if (x13.f16039a == 2) {
                if (z10) {
                    C0946t c0946t3 = abstractComponentCallbacksC0947u2.f16148a0;
                } else {
                    abstractComponentCallbacksC0947u2.getClass();
                }
            } else if (z10) {
                C0946t c0946t4 = abstractComponentCallbacksC0947u2.f16148a0;
            } else {
                abstractComponentCallbacksC0947u2.getClass();
            }
            if (x13.f16039a == 2) {
                if (z10) {
                    C0946t c0946t5 = abstractComponentCallbacksC0947u2.f16148a0;
                } else {
                    C0946t c0946t6 = abstractComponentCallbacksC0947u2.f16148a0;
                }
            }
            if (z11) {
                if (z10) {
                    C0946t c0946t7 = abstractComponentCallbacksC0947u2.f16148a0;
                } else {
                    abstractComponentCallbacksC0947u2.getClass();
                }
            }
            arrayList3.add(c0940m);
            x13.f16042d.add(new RunnableC0931d(this, x13, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj5 = arrayList3.get(i13);
            i13++;
            if (!((C0940m) obj5).k()) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList4.size();
        int i14 = 0;
        while (i14 < size5) {
            Object obj6 = arrayList4.get(i14);
            i14++;
            ((C0940m) obj6).getClass();
        }
        int size6 = arrayList5.size();
        int i15 = 0;
        while (i15 < size6) {
            Object obj7 = arrayList5.get(i15);
            i15++;
            ((C0940m) obj7).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int size7 = arrayList2.size();
        int i16 = 0;
        while (i16 < size7) {
            Object obj8 = arrayList2.get(i16);
            i16++;
            m.d0(arrayList7, ((X) ((C0934g) obj8).f16104r).f16047k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        int size8 = arrayList2.size();
        boolean z12 = false;
        int i17 = 0;
        while (i17 < size8) {
            Object obj9 = arrayList2.get(i17);
            i17++;
            C0934g c0934g = (C0934g) obj9;
            Context context = this.f16105a.getContext();
            X x14 = (X) c0934g.f16104r;
            j.d(context, "context");
            L5.c cVarP = c0934g.p(context);
            if (cVarP != null) {
                if (((AnimatorSet) cVarP.f5533t) == null) {
                    arrayList6.add(c0934g);
                } else {
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u3 = x14.f16041c;
                    if (x14.f16047k.isEmpty()) {
                        if (x14.f16039a == 3) {
                            x14.f16046i = false;
                        }
                        x14.j.add(new C0936i(c0934g));
                        z12 = true;
                    } else if (K.K(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0947u3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size9 = arrayList6.size();
        int i18 = 0;
        while (i18 < size9) {
            Object obj10 = arrayList6.get(i18);
            i18++;
            C0934g c0934g2 = (C0934g) obj10;
            X x15 = (X) c0934g2.f16104r;
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u4 = x15.f16041c;
            if (zIsEmpty) {
                if (!z12) {
                    x15.j.add(new C0933f(c0934g2));
                } else if (K.K(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0947u4 + " as Animations cannot run alongside Animators.");
                }
            } else if (K.K(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0947u4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(List list) {
        j.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m.d0(arrayList, ((X) it.next()).f16047k);
        }
        List listC0 = m.C0(m.G0(arrayList));
        int size = listC0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((W) listC0.get(i10)).b(this.f16105a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((X) list.get(i11));
        }
        List listC1 = m.C0(list);
        int size3 = listC1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X x9 = (X) listC1.get(i12);
            if (x9.f16047k.isEmpty()) {
                x9.b();
            }
        }
    }

    public final void d(int i10, int i11, Q q10) {
        synchronized (this.f16106b) {
            try {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
                j.d(abstractComponentCallbacksC0947u, "fragmentStateManager.fragment");
                X xF = f(abstractComponentCallbacksC0947u);
                if (xF == null) {
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
                    xF = (abstractComponentCallbacksC0947u2.f16130D || abstractComponentCallbacksC0947u2.f16129C) ? g(abstractComponentCallbacksC0947u2) : null;
                }
                if (xF != null) {
                    xF.d(i10, i11);
                    return;
                }
                X x9 = new X(i10, i11, q10);
                this.f16106b.add(x9);
                x9.f16042d.add(new RunnableC0931d(this, x9, 1));
                x9.f16042d.add(new RunnableC0931d(this, x9, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z10;
        if (this.f16110f) {
            return;
        }
        if (!this.f16105a.isAttachedToWindow()) {
            h();
            this.f16109e = false;
            return;
        }
        synchronized (this.f16106b) {
            try {
                ArrayList arrayListD0 = m.D0(this.f16107c);
                this.f16107c.clear();
                int size = arrayListD0.size();
                int i10 = 0;
                while (true) {
                    z10 = true;
                    if (i10 >= size) {
                        break;
                    }
                    Object obj = arrayListD0.get(i10);
                    i10++;
                    X x9 = (X) obj;
                    if (this.f16106b.isEmpty() || !x9.f16041c.f16130D) {
                        z10 = false;
                    }
                    x9.g = z10;
                }
                int size2 = arrayListD0.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayListD0.get(i11);
                    i11++;
                    X x10 = (X) obj2;
                    if (this.f16108d) {
                        if (K.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + x10);
                        }
                        x10.b();
                    } else {
                        if (K.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + x10);
                        }
                        x10.a(this.f16105a);
                    }
                    this.f16108d = false;
                    if (!x10.f16044f) {
                        this.f16107c.add(x10);
                    }
                }
                if (!this.f16106b.isEmpty()) {
                    l();
                    ArrayList arrayListD1 = m.D0(this.f16106b);
                    if (arrayListD1.isEmpty()) {
                        return;
                    }
                    this.f16106b.clear();
                    this.f16107c.addAll(arrayListD1);
                    if (K.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListD1, this.f16109e);
                    boolean zJ = j(arrayListD1);
                    int size3 = arrayListD1.size();
                    int i12 = 0;
                    boolean z11 = true;
                    while (i12 < size3) {
                        Object obj3 = arrayListD1.get(i12);
                        i12++;
                        if (!((X) obj3).f16041c.f16130D) {
                            z11 = false;
                        }
                    }
                    if (!z11 || zJ) {
                        z10 = false;
                    }
                    this.f16108d = z10;
                    if (K.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z11);
                    }
                    if (!z11) {
                        k(arrayListD1);
                        c(arrayListD1);
                    } else if (zJ) {
                        k(arrayListD1);
                        int size4 = arrayListD1.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            a((X) arrayListD1.get(i13));
                        }
                    }
                    this.f16109e = false;
                    if (K.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final X f(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        Object obj;
        ArrayList arrayList = this.f16106b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            obj = arrayList.get(i10);
            i10++;
            X x9 = (X) obj;
            if (j.a(x9.f16041c, abstractComponentCallbacksC0947u) && !x9.f16043e) {
                return (X) obj;
            }
        }
        obj = null;
        return (X) obj;
    }

    public final X g(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        Object obj;
        ArrayList arrayList = this.f16107c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            obj = arrayList.get(i10);
            i10++;
            X x9 = (X) obj;
            if (j.a(x9.f16041c, abstractComponentCallbacksC0947u) && !x9.f16043e) {
                return (X) obj;
            }
        }
        obj = null;
        return (X) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (K.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f16105a.isAttachedToWindow();
        synchronized (this.f16106b) {
            try {
                l();
                k(this.f16106b);
                ArrayList arrayListD0 = m.D0(this.f16107c);
                int size = arrayListD0.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayListD0.get(i11);
                    i11++;
                    ((X) obj).g = false;
                }
                int size2 = arrayListD0.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListD0.get(i12);
                    i12++;
                    X x9 = (X) obj2;
                    if (K.K(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f16105a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + x9);
                    }
                    x9.a(this.f16105a);
                }
                ArrayList arrayListD1 = m.D0(this.f16106b);
                int size3 = arrayListD1.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayListD1.get(i13);
                    i13++;
                    ((X) obj3).g = false;
                }
                int size4 = arrayListD1.size();
                while (i10 < size4) {
                    Object obj4 = arrayListD1.get(i10);
                    i10++;
                    X x10 = (X) obj4;
                    if (K.K(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f16105a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + x10);
                    }
                    x10.a(this.f16105a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X x9 = (X) list.get(i10);
            Q q10 = x9.f16048l;
            if (!x9.f16045h) {
                x9.f16045h = true;
                int i11 = x9.f16040b;
                if (i11 == 2) {
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
                    j.d(abstractComponentCallbacksC0947u, "fragmentStateManager.fragment");
                    View viewFindFocus = abstractComponentCallbacksC0947u.f16145X.findFocus();
                    if (viewFindFocus != null) {
                        abstractComponentCallbacksC0947u.i().f16125k = viewFindFocus;
                        if (K.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0947u);
                        }
                    }
                    View viewN = x9.f16041c.N();
                    if (viewN.getParent() == null) {
                        if (K.K(2)) {
                            Log.v("FragmentManager", "Adding fragment " + abstractComponentCallbacksC0947u + " view " + viewN + " to container in onStart");
                        }
                        q10.b();
                        viewN.setAlpha(0.0f);
                    }
                    if (viewN.getAlpha() == 0.0f && viewN.getVisibility() == 0) {
                        if (K.K(2)) {
                            Log.v("FragmentManager", "Making view " + viewN + " INVISIBLE in onStart");
                        }
                        viewN.setVisibility(4);
                    }
                    C0946t c0946t = abstractComponentCallbacksC0947u.f16148a0;
                    viewN.setAlpha(c0946t == null ? 1.0f : c0946t.j);
                    if (K.K(2)) {
                        StringBuilder sb = new StringBuilder("Setting view alpha to ");
                        C0946t c0946t2 = abstractComponentCallbacksC0947u.f16148a0;
                        sb.append(c0946t2 != null ? c0946t2.j : 1.0f);
                        sb.append(" in onStart");
                        Log.v("FragmentManager", sb.toString());
                    }
                } else if (i11 == 3) {
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
                    j.d(abstractComponentCallbacksC0947u2, "fragmentStateManager.fragment");
                    View viewN2 = abstractComponentCallbacksC0947u2.N();
                    if (K.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewN2.findFocus() + " on view " + viewN2 + " for Fragment " + abstractComponentCallbacksC0947u2);
                    }
                    viewN2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m.d0(arrayList, ((X) it.next()).f16047k);
        }
        List listC0 = m.C0(m.G0(arrayList));
        int size2 = listC0.size();
        for (int i12 = 0; i12 < size2; i12++) {
            W w9 = (W) listC0.get(i12);
            w9.getClass();
            ViewGroup viewGroup = this.f16105a;
            j.e(viewGroup, "container");
            if (!w9.f16037a) {
                w9.d(viewGroup);
            }
            w9.f16037a = true;
        }
    }

    public final void l() {
        ArrayList arrayList = this.f16106b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            X x9 = (X) obj;
            int i11 = 2;
            if (x9.f16040b == 2) {
                int visibility = x9.f16041c.N().getVisibility();
                if (visibility != 0) {
                    i11 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(c.r(visibility, "Unknown visibility "));
                        }
                        i11 = 3;
                    }
                }
                x9.d(i11, 1);
            }
        }
    }
}
