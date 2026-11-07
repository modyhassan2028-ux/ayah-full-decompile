package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class F extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22194b;

    public F(String str, String str2) {
        this.f22193a = str;
        this.f22194b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            F f3 = (F) ((r0) obj);
            if (this.f22193a.equals(f3.f22193a) && this.f22194b.equals(f3.f22194b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22193a.hashCode() ^ 1000003) * 1000003) ^ this.f22194b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f22193a);
        sb.append(", value=");
        return p.B(sb, this.f22194b, "}");
    }
}
