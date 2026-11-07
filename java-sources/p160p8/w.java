package p160p8;

import p245z2.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21143b;

    public w(String str, String str2) {
        this.f21142a = str;
        this.f21143b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return j.a(this.f21142a, wVar.f21142a) && j.a(this.f21143b, wVar.f21143b);
    }

    public final int hashCode() {
        String str = this.f21142a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21143b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f21142a);
        sb.append(", authToken=");
        return a.F(sb, this.f21143b, ')');
    }
}
