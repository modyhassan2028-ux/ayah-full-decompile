package p110k9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f19077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f19078s;

    public j(Object obj, Object obj2) {
        this.f19077r = obj;
        this.f19078s = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p251z9.j.a(this.f19077r, jVar.f19077r) && p251z9.j.a(this.f19078s, jVar.f19078s);
    }

    public final int hashCode() {
        Object obj = this.f19077r;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19078s;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f19077r + ", " + this.f19078s + ')';
    }
}
