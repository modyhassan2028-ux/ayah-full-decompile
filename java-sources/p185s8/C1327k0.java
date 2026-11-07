package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: renamed from: s8.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1327k0 extends M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22401a;

    public C1327k0(String str) {
        this.f22401a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        return this.f22401a.equals(((C1327k0) ((M0) obj)).f22401a);
    }

    public final int hashCode() {
        return this.f22401a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p.B(new StringBuilder("User{identifier="), this.f22401a, "}");
    }
}
