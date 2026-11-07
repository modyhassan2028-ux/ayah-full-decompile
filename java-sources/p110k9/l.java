package p110k9;

import java.io.Serializable;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Throwable f19079r;

    public l(Throwable th) {
        j.e(th, "exception");
        this.f19079r = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return j.a(this.f19079r, ((l) obj).f19079r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19079r.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f19079r + ')';
    }
}
