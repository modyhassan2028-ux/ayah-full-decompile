package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f21379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f21380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WeakHashMap f21381t = new WeakHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21382u = 0;

    public c b(Object obj) {
        c cVar = this.f21379r;
        while (cVar != null && !cVar.f21372r.equals(obj)) {
            cVar = cVar.f21374t;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f21382u--;
        WeakHashMap weakHashMap = this.f21381t;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f21375u;
        if (cVar != null) {
            cVar.f21374t = cVarB.f21374t;
        } else {
            this.f21379r = cVarB.f21374t;
        }
        c cVar2 = cVarB.f21374t;
        if (cVar2 != null) {
            cVar2.f21375u = cVar;
        } else {
            this.f21380s = cVar;
        }
        cVarB.f21374t = null;
        cVarB.f21375u = null;
        return cVarB.f21373s;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f21382u != fVar.f21382u) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f21379r, this.f21380s, 0);
        this.f21381t.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
