package p020c;

import K0.RunnableC0354l;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0928a;
import p056f2.C0941n;
import p056f2.J;
import p056f2.K;
import p056f2.T;
import p056f2.W;
import p056f2.X;
import p104k1.a;
import p120l9.m;
import p173r2.A;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class E extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(int i10, Object obj) {
        super(false);
        this.f13360d = i10;
        this.f13361e = obj;
    }

    @Override // p020c.x
    public void a() {
        switch (this.f13360d) {
            case 1:
                K k7 = (K) this.f13361e;
                if (K.K(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + k7);
                }
                if (K.K(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + k7.f15968h);
                }
                C0928a c0928a = k7.f15968h;
                if (c0928a != null) {
                    c0928a.f16066s = false;
                    c0928a.d();
                    C0928a c0928a2 = k7.f15968h;
                    RunnableC0354l runnableC0354l = new RunnableC0354l(19, k7);
                    if (c0928a2.f16064q == null) {
                        c0928a2.f16064q = new ArrayList();
                    }
                    c0928a2.f16064q.add(runnableC0354l);
                    k7.f15968h.e(false, true);
                    k7.f15969i = true;
                    k7.A(true);
                    k7.E();
                    k7.f15969i = false;
                    k7.f15968h = null;
                }
                break;
        }
    }

    @Override // p020c.x
    public final void b() {
        switch (this.f13360d) {
            case 0:
                ((a) this.f13361e).e(this);
                return;
            case 1:
                K k7 = (K) this.f13361e;
                if (K.K(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + k7);
                }
                E e10 = k7.j;
                ArrayList arrayList = k7.f15973n;
                k7.f15969i = true;
                k7.A(true);
                int i10 = 0;
                k7.f15969i = false;
                if (k7.f15968h == null) {
                    if (e10.f13407a) {
                        if (K.K(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        k7.R();
                        return;
                    } else {
                        if (K.K(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        k7.g.c();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(K.F(k7.f15968h));
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw null;
                        }
                    }
                }
                ArrayList arrayList2 = k7.f15968h.f16050a;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = ((T) obj2).f16022b;
                    if (abstractComponentCallbacksC0947u != null) {
                        abstractComponentCallbacksC0947u.f16130D = false;
                    }
                }
                for (C0941n c0941n : k7.f(new ArrayList(Collections.singletonList(k7.f15968h)), 0, 1)) {
                    ArrayList arrayList3 = c0941n.f16107c;
                    if (K.K(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    c0941n.k(arrayList3);
                    c0941n.c(arrayList3);
                }
                ArrayList arrayList4 = k7.f15968h.f16050a;
                int size3 = arrayList4.size();
                while (i10 < size3) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((T) obj3).f16022b;
                    if (abstractComponentCallbacksC0947u2 != null && abstractComponentCallbacksC0947u2.f16144W == null) {
                        k7.g(abstractComponentCallbacksC0947u2).k();
                    }
                }
                k7.f15968h = null;
                k7.g0();
                if (K.K(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + e10.f13407a + " for  FragmentManager " + k7);
                    return;
                }
                return;
            default:
                ((A) this.f13361e).b();
                return;
        }
    }

    @Override // p020c.x
    public void c(C0776a c0776a) {
        switch (this.f13360d) {
            case 1:
                K k7 = (K) this.f13361e;
                if (K.K(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + k7);
                }
                if (k7.f15968h != null) {
                    for (C0941n c0941n : k7.f(new ArrayList(Collections.singletonList(k7.f15968h)), 0, 1)) {
                        c0941n.getClass();
                        j.e(c0776a, "backEvent");
                        if (K.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0776a.f13367c);
                        }
                        ArrayList arrayList = c0941n.f16107c;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            m.d0(arrayList2, ((X) obj).f16047k);
                        }
                        List listC0 = m.C0(m.G0(arrayList2));
                        int size2 = listC0.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((W) listC0.get(i11)).c(c0776a, c0941n.f16105a);
                        }
                    }
                    Iterator it = k7.f15973n.iterator();
                    if (it.hasNext()) {
                        throw p245z2.a.z(it);
                    }
                    return;
                }
                return;
            default:
                super.c(c0776a);
                return;
        }
    }

    @Override // p020c.x
    public void d(C0776a c0776a) {
        switch (this.f13360d) {
            case 1:
                K k7 = (K) this.f13361e;
                if (K.K(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + k7);
                }
                k7.x();
                k7.y(new J(k7), false);
                break;
            default:
                super.d(c0776a);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(a aVar) {
        super(true);
        this.f13360d = 0;
        this.f13361e = aVar;
    }
}
