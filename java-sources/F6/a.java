package F6;

import W.AbstractC0607v1;
import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2408b;

    public a(long j, int i10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f2407a = i10;
        this.f2408b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC0607v1.a(this.f2407a, aVar.f2407a) && this.f2408b == aVar.f2408b;
    }

    public final int hashCode() {
        int iB = (AbstractC0607v1.b(this.f2407a) ^ 1000003) * 1000003;
        long j = this.f2408b;
        return iB ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i10 = this.f2407a;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return p.x(this.f2408b, "}", sb);
    }
}
