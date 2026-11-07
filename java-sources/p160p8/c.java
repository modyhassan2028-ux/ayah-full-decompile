package p160p8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21061c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f21059a = str;
        this.f21060b = str2;
        this.f21061c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str3 = cVar.f21061c;
            String str4 = cVar.f21060b;
            if (this.f21059a.equals(cVar.f21059a) && ((str = this.f21060b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f21061c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f21059a.hashCode() ^ 1000003) * 1000003;
        String str = this.f21060b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f21061c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f21059a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f21060b);
        sb.append(", firebaseAuthenticationToken=");
        return p.B(sb, this.f21061c, "}");
    }
}
