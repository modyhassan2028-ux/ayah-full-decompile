package u;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: u.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1348c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22717s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22718t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1350e f22719u;

    public C1348c(C1350e c1350e) {
        this.f22719u = c1350e;
        this.f22716r = c1350e.f22703t - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f22718t) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f22717s;
        C1350e c1350e = this.f22719u;
        return p251z9.j.a(key, c1350e.f(i10)) && p251z9.j.a(entry.getValue(), c1350e.i(this.f22717s));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f22718t) {
            return this.f22719u.f(this.f22717s);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f22718t) {
            return this.f22719u.i(this.f22717s);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22717s < this.f22716r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f22718t) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f22717s;
        C1350e c1350e = this.f22719u;
        Object objF = c1350e.f(i10);
        Object objI = c1350e.i(this.f22717s);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22717s++;
        this.f22718t = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22718t) {
            throw new IllegalStateException();
        }
        this.f22719u.g(this.f22717s);
        this.f22717s--;
        this.f22716r--;
        this.f22718t = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f22718t) {
            return this.f22719u.h(this.f22717s, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
