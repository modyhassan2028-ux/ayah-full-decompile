package B6;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f643a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f643a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f643a.equals(((b) obj).f643a);
    }

    public final int hashCode() {
        return this.f643a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p.B(new StringBuilder("Encoding{name=\""), this.f643a, "\"}");
    }
}
