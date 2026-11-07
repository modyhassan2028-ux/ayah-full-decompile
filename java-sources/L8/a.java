package L8;

import W.AbstractC0607v1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5565e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f5561a = str;
        this.f5562b = str2;
        this.f5563c = str3;
        this.f5564d = bVar;
        this.f5565e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.f5565e;
        b bVar = aVar.f5564d;
        String str = aVar.f5563c;
        String str2 = aVar.f5562b;
        String str3 = aVar.f5561a;
        String str4 = this.f5561a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f5562b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f5563c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f5564d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i11 = this.f5565e;
        if (i11 == 0) {
            return i10 == 0;
        }
        return AbstractC0607v1.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f5561a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f5562b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5563c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f5564d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.f5565e;
        return (i10 != 0 ? AbstractC0607v1.b(i10) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f5561a);
        sb.append(", fid=");
        sb.append(this.f5562b);
        sb.append(", refreshToken=");
        sb.append(this.f5563c);
        sb.append(", authToken=");
        sb.append(this.f5564d);
        sb.append(", responseCode=");
        int i10 = this.f5565e;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
