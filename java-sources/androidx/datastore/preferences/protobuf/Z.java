package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Comparable f12425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f12426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y f12427t;

    public Z(Y y10, Comparable comparable, Object obj) {
        this.f12427t = y10;
        this.f12425r = comparable;
        this.f12426s = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12425r.compareTo(((Z) obj).f12425r);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f12425r;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f12426s;
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
    public final Object getKey() {
        return this.f12425r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12426s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f12425r;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f12426s;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f12427t.b();
        Object obj2 = this.f12426s;
        this.f12426s = obj;
        return obj2;
    }

    public final String toString() {
        return this.f12425r + "=" + this.f12426s;
    }
}
