package D6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1301a;

    public m(ArrayList arrayList) {
        this.f1301a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return this.f1301a.equals(((m) ((x) obj)).f1301a);
    }

    public final int hashCode() {
        return this.f1301a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f1301a + "}";
    }
}
