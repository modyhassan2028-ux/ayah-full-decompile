package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class M2 extends AbstractMap {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f14071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f14073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.b0 f14075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f14076w;

    public M2() {
        Map map = Collections.EMPTY_MAP;
        this.f14073t = map;
        this.f14076w = map;
    }

    public final N2 a(int i10) {
        if (i10 < this.f14072s) {
            return (N2) this.f14071r[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Set b() {
        return this.f14073t.isEmpty() ? Collections.EMPTY_SET : this.f14073t.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((N2) this.f14071r[iE]).setValue(obj);
        }
        f();
        if (this.f14071r == null) {
            this.f14071r = new Object[16];
        }
        int i10 = -(iE + 1);
        if (i10 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f14072s == 16) {
            N2 n6 = (N2) this.f14071r[15];
            this.f14072s = 15;
            g().put(n6.f14078r, n6.f14079s);
        }
        Object[] objArr = this.f14071r;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f14071r[i10] = new N2(this, comparable, obj);
        this.f14072s++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f14072s != 0) {
            this.f14071r = null;
            this.f14072s = 0;
        }
        if (this.f14073t.isEmpty()) {
            return;
        }
        this.f14073t.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f14073t.containsKey(comparable);
    }

    public final Object d(int i10) {
        f();
        Object[] objArr = this.f14071r;
        Object obj = ((N2) objArr[i10]).f14079s;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f14072s - i10) - 1);
        this.f14072s--;
        if (!this.f14073t.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f14071r;
            int i11 = this.f14072s;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new N2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f14072s++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i10 = this.f14072s;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((N2) this.f14071r[i11]).f14078r);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((N2) this.f14071r[i13]).f14078r);
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f14075v == null) {
            this.f14075v = new androidx.datastore.preferences.protobuf.b0(this, 1);
        }
        return this.f14075v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return super.equals(obj);
        }
        M2 m10 = (M2) obj;
        int size = size();
        if (size == m10.size()) {
            int i10 = this.f14072s;
            if (i10 != m10.f14072s) {
                return entrySet().equals(m10.entrySet());
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (a(i11).equals(m10.a(i11))) {
                }
            }
            if (i10 != size) {
                return this.f14073t.equals(m10.f14073t);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f14074u) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f14073t.isEmpty() && !(this.f14073t instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14073t = treeMap;
            this.f14076w = treeMap.descendingMap();
        }
        return (SortedMap) this.f14073t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((N2) this.f14071r[iE]).f14079s : this.f14073t.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f14072s;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f14071r[i11].hashCode();
        }
        return this.f14073t.size() > 0 ? this.f14073t.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f14073t.isEmpty()) {
            return null;
        }
        return this.f14073t.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14073t.size() + this.f14072s;
    }
}
