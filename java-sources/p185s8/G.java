package p185s8;

import android.support.v4.media.session.p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22196b;

    public G(List list, String str) {
        this.f22195a = list;
        this.f22196b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            G g = (G) ((t0) obj);
            String str2 = g.f22196b;
            if (this.f22195a.equals(g.f22195a) && ((str = this.f22196b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22195a.hashCode() ^ 1000003) * 1000003;
        String str = this.f22196b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f22195a);
        sb.append(", orgId=");
        return p.B(sb, this.f22196b, "}");
    }
}
