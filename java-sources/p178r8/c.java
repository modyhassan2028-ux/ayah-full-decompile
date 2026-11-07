package p178r8;

import java.util.Map;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f21610c;

    public c(String str, long j, Map map) {
        j.e(map, "additionalCustomKeys");
        this.f21608a = str;
        this.f21609b = j;
        this.f21610c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f21608a, cVar.f21608a) && this.f21609b == cVar.f21609b && j.a(this.f21610c, cVar.f21610c);
    }

    public final int hashCode() {
        int iHashCode = this.f21608a.hashCode() * 31;
        long j = this.f21609b;
        return this.f21610c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f21608a + ", timestamp=" + this.f21609b + ", additionalCustomKeys=" + this.f21610c + ')';
    }
}
