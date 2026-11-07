package r;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f21372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f21373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f21374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f21375u;

    public c(Object obj, Object obj2) {
        this.f21372r = obj;
        this.f21373s = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21372r.equals(cVar.f21372r) && this.f21373s.equals(cVar.f21373s);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21372r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21373s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21372r.hashCode() ^ this.f21373s.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21372r + "=" + this.f21373s;
    }
}
