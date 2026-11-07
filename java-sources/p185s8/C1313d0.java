package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: renamed from: s8.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1313d0 extends G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22339a;

    public C1313d0(String str) {
        this.f22339a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        return this.f22339a.equals(((C1313d0) ((G0) obj)).f22339a);
    }

    public final int hashCode() {
        return this.f22339a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p.B(new StringBuilder("Log{content="), this.f22339a, "}");
    }
}
