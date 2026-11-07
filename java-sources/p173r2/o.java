package p173r2;

import F9.n;
import androidx.lifecycle.P;
import androidx.lifecycle.U;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p110k9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class o extends P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f21462b = new LinkedHashMap();

    @Override // androidx.lifecycle.P
    public final void b() {
        LinkedHashMap linkedHashMap = this.f21462b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((U) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        n.n(16);
        sb.append(a.g(((long) iIdentityHashCode) & 4294967295L, 16));
        sb.append("} ViewModelStores (");
        Iterator it = this.f21462b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        j.d(string, "toString(...)");
        return string;
    }
}
