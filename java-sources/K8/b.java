package K8;

import W.AbstractC0607v1;
import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5306h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5312f;
    public final String g;

    static {
        byte b5 = (byte) (((byte) (0 | 2)) | 1);
        if (b5 == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b5 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b5 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(p123m2.c.u("Missing required properties:", sb));
    }

    public b(String str, int i10, String str2, String str3, long j, long j10, String str4) {
        this.f5307a = str;
        this.f5308b = i10;
        this.f5309c = str2;
        this.f5310d = str3;
        this.f5311e = j;
        this.f5312f = j10;
        this.g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f5299a = this.f5307a;
        aVar.f5300b = this.f5308b;
        aVar.f5301c = this.f5309c;
        aVar.f5302d = this.f5310d;
        aVar.f5303e = this.f5311e;
        aVar.f5304f = this.f5312f;
        aVar.g = this.g;
        aVar.f5305h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.g;
        String str2 = bVar.f5310d;
        String str3 = bVar.f5309c;
        String str4 = bVar.f5307a;
        String str5 = this.f5307a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!AbstractC0607v1.a(this.f5308b, bVar.f5308b)) {
            return false;
        }
        String str6 = this.f5309c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f5310d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f5311e != bVar.f5311e || this.f5312f != bVar.f5312f) {
            return false;
        }
        String str8 = this.g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f5307a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC0607v1.b(this.f5308b)) * 1000003;
        String str2 = this.f5309c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5310d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f5311e;
        int i10 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f5312f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f5307a);
        sb.append(", registrationStatus=");
        int i10 = this.f5308b;
        if (i10 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i10 == 2) {
            str = "NOT_GENERATED";
        } else if (i10 == 3) {
            str = "UNREGISTERED";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f5309c);
        sb.append(", refreshToken=");
        sb.append(this.f5310d);
        sb.append(", expiresInSecs=");
        sb.append(this.f5311e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f5312f);
        sb.append(", fisError=");
        return p.B(sb, this.g, "}");
    }
}
