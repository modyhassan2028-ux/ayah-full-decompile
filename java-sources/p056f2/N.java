package p056f2;

import android.util.Log;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class N extends P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J f15994h = new J(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15998e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15995b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15996c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f15997d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15999f = false;
    public boolean g = false;

    public N(boolean z10) {
        this.f15998e = z10;
    }

    @Override // androidx.lifecycle.P
    public final void b() {
        if (K.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f15999f = true;
    }

    public final void c(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        if (K.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0947u);
        }
        e(abstractComponentCallbacksC0947u.f16165v, z10);
    }

    public final void d(String str, boolean z10) {
        if (K.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z10);
    }

    public final void e(String str, boolean z10) {
        HashMap map = this.f15996c;
        N n6 = (N) map.get(str);
        if (n6 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(n6.f15996c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    n6.d((String) obj, true);
                }
            }
            n6.b();
            map.remove(str);
        }
        HashMap map2 = this.f15997d;
        U u8 = (U) map2.get(str);
        if (u8 != null) {
            u8.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N.class == obj.getClass()) {
            N n6 = (N) obj;
            if (this.f15995b.equals(n6.f15995b) && this.f15996c.equals(n6.f15996c) && this.f15997d.equals(n6.f15997d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (this.g) {
            if (K.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f15995b.remove(abstractComponentCallbacksC0947u.f16165v) == null || !K.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0947u);
        }
    }

    public final int hashCode() {
        return this.f15997d.hashCode() + ((this.f15996c.hashCode() + (this.f15995b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f15995b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f15996c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f15997d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
