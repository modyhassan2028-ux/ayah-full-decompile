package p056f2;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class J implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f15945a;

    public J(K k7) {
        this.f15945a = k7;
    }

    @Override // p056f2.H
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zT;
        K k7 = this.f15945a;
        ArrayList arrayList3 = k7.f15973n;
        if (K.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + k7.f15962a);
        }
        int i10 = 0;
        if (k7.f15965d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zT = false;
        } else {
            C0928a c0928a = (C0928a) c.q(1, k7.f15965d);
            k7.f15968h = c0928a;
            ArrayList arrayList4 = c0928a.f16050a;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList4.get(i11);
                i11++;
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = ((T) obj).f16022b;
                if (abstractComponentCallbacksC0947u != null) {
                    abstractComponentCallbacksC0947u.f16130D = true;
                }
            }
            zT = k7.T(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                linkedHashSet.addAll(K.F((C0928a) obj2));
            }
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zT;
    }
}
