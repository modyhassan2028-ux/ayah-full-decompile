package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Comparable f14078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f14079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ M2 f14080t;

    public N2(M2 m10, Comparable comparable, Object obj) {
        this.f14080t = m10;
        this.f14078r = comparable;
        this.f14079s = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f14078r.compareTo(((N2) obj).f14078r);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f14078r;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f14079s;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f14078r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14079s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f14078r;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14079s;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f14080t.f();
        Object obj2 = this.f14079s;
        this.f14079s = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14078r);
        String strValueOf2 = String.valueOf(this.f14079s);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
