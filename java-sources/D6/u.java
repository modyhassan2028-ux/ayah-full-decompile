package D6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f1326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f1327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1329f;

    public u(long j, long j10, n nVar, Integer num, String str, ArrayList arrayList) {
        K k7 = K.f1245r;
        this.f1324a = j;
        this.f1325b = j10;
        this.f1326c = nVar;
        this.f1327d = num;
        this.f1328e = str;
        this.f1329f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        u uVar = (u) ((G) obj);
        Object obj2 = K.f1245r;
        ArrayList arrayList = uVar.f1329f;
        String str = uVar.f1328e;
        Integer num = uVar.f1327d;
        n nVar = uVar.f1326c;
        if (this.f1324a != uVar.f1324a || this.f1325b != uVar.f1325b || !this.f1326c.equals(nVar)) {
            return false;
        }
        Integer num2 = this.f1327d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f1328e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f1329f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f1324a;
        long j10 = this.f1325b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f1326c.hashCode()) * 1000003;
        Integer num = this.f1327d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1328e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f1329f.hashCode()) * 1000003) ^ K.f1245r.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f1324a + ", requestUptimeMs=" + this.f1325b + ", clientInfo=" + this.f1326c + ", logSource=" + this.f1327d + ", logSourceName=" + this.f1328e + ", logEvents=" + this.f1329f + ", qosTier=" + K.f1245r + "}";
    }
}
