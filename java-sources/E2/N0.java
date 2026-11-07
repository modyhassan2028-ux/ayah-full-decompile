package E2;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1594f;
    public final Object g;

    public N0(int i10) {
        this.f1589a = 1;
        this.f1590b = i10;
        if (i10 <= 0) {
            p204v.a.c("maxSize <= 0");
            throw null;
        }
        p151p.V v10 = new p151p.V();
        v10.f20603r = new LinkedHashMap(0, 0.75f, true);
        this.f1594f = v10;
        this.g = new i7.B(15);
    }

    public static void m(Object obj, Object obj2) {
        p251z9.j.e(obj, "key");
        p251z9.j.e(obj2, "value");
    }

    public void a() {
        View view = (View) p123m2.c.q(1, (ArrayList) this.f1594f);
        K0 k7 = (K0) view.getLayoutParams();
        this.f1591c = ((StaggeredGridLayoutManager) this.g).f12939r.d(view);
        k7.getClass();
    }

    public void b() {
        ((ArrayList) this.f1594f).clear();
        this.f1590b = Integer.MIN_VALUE;
        this.f1591c = Integer.MIN_VALUE;
        this.f1592d = 0;
    }

    public Object c(Object obj) {
        p251z9.j.e(obj, "key");
        return null;
    }

    public int d() {
        ArrayList arrayList = (ArrayList) this.f1594f;
        return ((StaggeredGridLayoutManager) this.g).f12944w ? f(arrayList.size() - 1, -1) : f(0, arrayList.size());
    }

    public int e() {
        ArrayList arrayList = (ArrayList) this.f1594f;
        return ((StaggeredGridLayoutManager) this.g).f12944w ? f(0, arrayList.size()) : f(arrayList.size() - 1, -1);
    }

    public int f(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int iM = staggeredGridLayoutManager.f12939r.m();
        int i12 = staggeredGridLayoutManager.f12939r.i();
        int i13 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) ((ArrayList) this.f1594f).get(i10);
            int iG = staggeredGridLayoutManager.f12939r.g(view);
            int iD = staggeredGridLayoutManager.f12939r.d(view);
            boolean z10 = iG <= i12;
            boolean z11 = iD >= iM;
            if (z10 && z11 && (iG < iM || iD > i12)) {
                return AbstractC0135m0.H(view);
            }
            i10 += i13;
        }
        return -1;
    }

    public Object g(Object obj) {
        Object objPut;
        p251z9.j.e(obj, "key");
        synchronized (((i7.B) this.g)) {
            p151p.V v10 = (p151p.V) this.f1594f;
            v10.getClass();
            Object obj2 = ((LinkedHashMap) v10.f20603r).get(obj);
            if (obj2 != null) {
                this.f1592d++;
                return obj2;
            }
            this.f1593e++;
            Object objC = c(obj);
            if (objC == null) {
                return null;
            }
            synchronized (((i7.B) this.g)) {
                p151p.V v11 = (p151p.V) this.f1594f;
                v11.getClass();
                objPut = ((LinkedHashMap) v11.f20603r).put(obj, objC);
                if (objPut != null) {
                    p151p.V v12 = (p151p.V) this.f1594f;
                    v12.getClass();
                    ((LinkedHashMap) v12.f20603r).put(obj, objPut);
                } else {
                    int i10 = this.f1591c;
                    m(obj, objC);
                    this.f1591c = i10 + 1;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            n(this.f1590b);
            return objC;
        }
    }

    public int h(int i10) {
        int i11 = this.f1591c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f1594f).size() == 0) {
            return i10;
        }
        a();
        return this.f1591c;
    }

    public View i(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f1594f;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f12944w && AbstractC0135m0.H(view2) >= i10) || ((!staggeredGridLayoutManager.f12944w && AbstractC0135m0.H(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f12944w && AbstractC0135m0.H(view3) <= i10) || ((!staggeredGridLayoutManager.f12944w && AbstractC0135m0.H(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    public int j(int i10) {
        ArrayList arrayList = (ArrayList) this.f1594f;
        int i11 = this.f1590b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        K0 k7 = (K0) view.getLayoutParams();
        this.f1590b = ((StaggeredGridLayoutManager) this.g).f12939r.g(view);
        k7.getClass();
        return this.f1590b;
    }

    public Object k(Object obj, Object obj2) {
        Object objPut;
        p251z9.j.e(obj, "key");
        p251z9.j.e(obj2, "value");
        synchronized (((i7.B) this.g)) {
            int i10 = this.f1591c;
            m(obj, obj2);
            this.f1591c = i10 + 1;
            p151p.V v10 = (p151p.V) this.f1594f;
            v10.getClass();
            objPut = ((LinkedHashMap) v10.f20603r).put(obj, obj2);
            if (objPut != null) {
                int i11 = this.f1591c;
                m(obj, objPut);
                this.f1591c = i11 - 1;
            }
        }
        n(this.f1590b);
        return objPut;
    }

    public Object l(Object obj) {
        Object objRemove;
        p251z9.j.e(obj, "key");
        synchronized (((i7.B) this.g)) {
            p151p.V v10 = (p151p.V) this.f1594f;
            v10.getClass();
            objRemove = ((LinkedHashMap) v10.f20603r).remove(obj);
            if (objRemove != null) {
                int i10 = this.f1591c;
                m(obj, objRemove);
                this.f1591c = i10 - 1;
            }
        }
        return objRemove;
    }

    public void n(int i10) {
        Object value;
        while (true) {
            synchronized (((i7.B) this.g)) {
                try {
                    if (this.f1591c < 0 || (((LinkedHashMap) ((p151p.V) this.f1594f).f20603r).isEmpty() && this.f1591c != 0)) {
                        break;
                    }
                    if (this.f1591c > i10 && !((LinkedHashMap) ((p151p.V) this.f1594f).f20603r).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) ((p151p.V) this.f1594f).f20603r).entrySet();
                        p251z9.j.d(setEntrySet, "<get-entries>(...)");
                        Set set = setEntrySet;
                        Object next = null;
                        if (set instanceof List) {
                            List list = (List) set;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        value = entry.getValue();
                        p151p.V v10 = (p151p.V) this.f1594f;
                        v10.getClass();
                        p251z9.j.e(key, "key");
                        ((LinkedHashMap) v10.f20603r).remove(key);
                        int i11 = this.f1591c;
                        m(key, value);
                        this.f1591c = i11 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            p251z9.j.e(value, "oldValue");
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.f1589a) {
            case 1:
                synchronized (((i7.B) this.g)) {
                    try {
                        int i10 = this.f1592d;
                        int i11 = this.f1593e + i10;
                        str = "LruCache[maxSize=" + this.f1590b + ",hits=" + this.f1592d + ",misses=" + this.f1593e + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public N0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f1589a = 0;
        this.g = staggeredGridLayoutManager;
        this.f1594f = new ArrayList();
        this.f1590b = Integer.MIN_VALUE;
        this.f1591c = Integer.MIN_VALUE;
        this.f1592d = 0;
        this.f1593e = i10;
    }
}
