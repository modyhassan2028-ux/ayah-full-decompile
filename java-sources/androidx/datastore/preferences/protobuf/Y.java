package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractMap {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f12419w = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f12420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f12421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile b0 f12423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Map f12424v;

    public static Y f() {
        Y y10 = new Y();
        y10.f12420r = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        y10.f12421s = map;
        y10.f12424v = map;
        return y10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f12420r.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((Z) this.f12420r.get(i12)).f12425r);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Z) this.f12420r.get(i13)).f12425r);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((Z) this.f12420r.get(i12)).f12425r);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f12422t) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f12420r.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f12420r.isEmpty()) {
            this.f12420r.clear();
        }
        if (this.f12421s.isEmpty()) {
            return;
        }
        this.f12421s.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f12421s.containsKey(comparable);
    }

    public final Set d() {
        return this.f12421s.isEmpty() ? Collections.EMPTY_SET : this.f12421s.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f12421s.isEmpty() && !(this.f12421s instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12421s = treeMap;
            this.f12424v = treeMap.descendingMap();
        }
        return (SortedMap) this.f12421s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f12423u == null) {
            this.f12423u = new b0(this, 0);
        }
        return this.f12423u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y10 = (Y) obj;
        int size = size();
        if (size == y10.size()) {
            int size2 = this.f12420r.size();
            if (size2 != y10.f12420r.size()) {
                return ((AbstractSet) entrySet()).equals(y10.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(y10.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f12421s.equals(y10.f12421s);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Z) this.f12420r.get(iA)).setValue(obj);
        }
        b();
        if (this.f12420r.isEmpty() && !(this.f12420r instanceof ArrayList)) {
            this.f12420r = new ArrayList(16);
        }
        int i10 = -(iA + 1);
        if (i10 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f12420r.size() == 16) {
            Z z10 = (Z) this.f12420r.remove(15);
            e().put(z10.f12425r, z10.f12426s);
        }
        this.f12420r.add(i10, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Z) this.f12420r.get(iA)).f12426s : this.f12421s.get(comparable);
    }

    public final Object h(int i10) {
        b();
        Object obj = ((Z) this.f12420r.remove(i10)).f12426s;
        if (!this.f12421s.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f12420r;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f12420r.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((Z) this.f12420r.get(i10)).hashCode();
        }
        return this.f12421s.size() > 0 ? this.f12421s.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f12421s.isEmpty()) {
            return null;
        }
        return this.f12421s.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12421s.size() + this.f12420r.size();
    }
}
