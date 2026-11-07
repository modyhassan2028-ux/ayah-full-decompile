package p129m9;

import A9.a;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Map.Entry, a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f19702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19704t;

    public d(e eVar, int i10) {
        j.e(eVar, "map");
        this.f19702r = eVar;
        this.f19703s = i10;
        this.f19704t = eVar.f19717y;
    }

    public final void a() {
        if (this.f19702r.f19717y != this.f19704t) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f19702r.f19710r[this.f19703s];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f19702r.f19711s;
        j.b(objArr);
        return objArr[this.f19703s];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.f19702r;
        eVar.c();
        Object[] objArr = eVar.f19711s;
        if (objArr == null) {
            int length = eVar.f19710r.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f19711s = objArr;
        }
        int i10 = this.f19703s;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
