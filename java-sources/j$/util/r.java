package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements java.util.Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map.Entry f18204a;

    public r(java.util.Map.Entry entry) {
        this.f18204a = (java.util.Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18204a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18204a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f18204a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this != obj) {
            if (obj instanceof java.util.Map.Entry) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                Object key = this.f18204a.getKey();
                Object key2 = entry.getKey();
                if (key == null) {
                    zEquals = key2 == null;
                } else {
                    zEquals = key.equals(key2);
                }
                if (zEquals) {
                    Object value = this.f18204a.getValue();
                    Object value2 = entry.getValue();
                    if (value == null) {
                        zEquals2 = value2 == null;
                    } else {
                        zEquals2 = value.equals(value2);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f18204a.toString();
    }
}
