package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: renamed from: s8.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1319g0 extends H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22363b;

    public C1319g0(String str, String str2) {
        this.f22362a = str;
        this.f22363b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0) {
            C1319g0 c1319g0 = (C1319g0) ((H0) obj);
            if (this.f22362a.equals(c1319g0.f22362a) && this.f22363b.equals(c1319g0.f22363b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22362a.hashCode() ^ 1000003) * 1000003) ^ this.f22363b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f22362a);
        sb.append(", variantId=");
        return p.B(sb, this.f22363b, "}");
    }
}
