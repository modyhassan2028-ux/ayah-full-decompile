package p056f2;

import W.AbstractC0607v1;
import android.support.v4.media.session.p;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import p120l9.m;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0947u f16041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16044f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16046i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q f16048l;

    public X(int i10, int i11, Q q10) {
        c.z(i10, "finalState");
        c.z(i11, "lifecycleImpact");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
        j.d(abstractComponentCallbacksC0947u, "fragmentStateManager.fragment");
        c.z(i10, "finalState");
        c.z(i11, "lifecycleImpact");
        j.e(abstractComponentCallbacksC0947u, "fragment");
        this.f16039a = i10;
        this.f16040b = i11;
        this.f16041c = abstractComponentCallbacksC0947u;
        this.f16042d = new ArrayList();
        this.f16046i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.f16047k = arrayList;
        this.f16048l = q10;
    }

    public final void a(ViewGroup viewGroup) {
        j.e(viewGroup, "container");
        this.f16045h = false;
        if (this.f16043e) {
            return;
        }
        this.f16043e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (W w9 : m.C0(this.f16047k)) {
            w9.getClass();
            if (!w9.f16038b) {
                w9.a(viewGroup);
            }
            w9.f16038b = true;
        }
    }

    public final void b() {
        this.f16045h = false;
        if (!this.f16044f) {
            if (K.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f16044f = true;
            ArrayList arrayList = this.f16042d;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
        }
        this.f16041c.f16130D = false;
        this.f16048l.k();
    }

    public final void c(W w9) {
        j.e(w9, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(w9) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        c.z(i10, "finalState");
        c.z(i11, "lifecycleImpact");
        int iB = AbstractC0607v1.b(i11);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f16041c;
        if (iB == 0) {
            if (this.f16039a != 1) {
                if (K.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0947u + " mFinalState = " + p.I(this.f16039a) + " -> " + p.I(i10) + '.');
                }
                this.f16039a = i10;
                return;
            }
            return;
        }
        if (iB == 1) {
            if (this.f16039a == 1) {
                if (K.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0947u + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + p.H(this.f16040b) + " to ADDING.");
                }
                this.f16039a = 2;
                this.f16040b = 2;
                this.f16046i = true;
                return;
            }
            return;
        }
        if (iB != 2) {
            return;
        }
        if (K.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0947u + " mFinalState = " + p.I(this.f16039a) + " -> REMOVED. mLifecycleImpact  = " + p.H(this.f16040b) + " to REMOVING.");
        }
        this.f16039a = 1;
        this.f16040b = 3;
        this.f16046i = true;
    }

    public final String toString() {
        StringBuilder sbD = p.D("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbD.append(p.I(this.f16039a));
        sbD.append(" lifecycleImpact = ");
        sbD.append(p.H(this.f16040b));
        sbD.append(" fragment = ");
        sbD.append(this.f16041c);
        sbD.append('}');
        return sbD.toString();
    }
}
