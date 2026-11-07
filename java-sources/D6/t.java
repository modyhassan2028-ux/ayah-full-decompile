package D6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t extends F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f1318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f1320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1321f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J f1322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f1323i;

    public t(long j, Integer num, B b5, long j10, byte[] bArr, String str, long j11, J j12, C c10) {
        this.f1316a = j;
        this.f1317b = num;
        this.f1318c = b5;
        this.f1319d = j10;
        this.f1320e = bArr;
        this.f1321f = str;
        this.g = j11;
        this.f1322h = j12;
        this.f1323i = c10;
    }

    public final boolean equals(Object obj) {
        Integer num;
        B b5;
        String str;
        J j;
        C c10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f3 = (F) obj;
            t tVar = (t) f3;
            C c11 = tVar.f1323i;
            J j10 = tVar.f1322h;
            String str2 = tVar.f1321f;
            B b10 = tVar.f1318c;
            Integer num2 = tVar.f1317b;
            if (this.f1316a == tVar.f1316a && ((num = this.f1317b) != null ? num.equals(num2) : num2 == null) && ((b5 = this.f1318c) != null ? b5.equals(b10) : b10 == null) && this.f1319d == tVar.f1319d) {
                if (Arrays.equals(this.f1320e, f3 instanceof t ? ((t) f3).f1320e : tVar.f1320e) && ((str = this.f1321f) != null ? str.equals(str2) : str2 == null) && this.g == tVar.g && ((j = this.f1322h) != null ? j.equals(j10) : j10 == null) && ((c10 = this.f1323i) != null ? c10.equals(c11) : c11 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1316a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f1317b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        B b5 = this.f1318c;
        int iHashCode2 = (iHashCode ^ (b5 == null ? 0 : b5.hashCode())) * 1000003;
        long j10 = this.f1319d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1320e)) * 1000003;
        String str = this.f1321f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.g;
        int i11 = (iHashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        J j12 = this.f1322h;
        int iHashCode5 = (i11 ^ (j12 == null ? 0 : j12.hashCode())) * 1000003;
        C c10 = this.f1323i;
        return iHashCode5 ^ (c10 != null ? c10.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f1316a + ", eventCode=" + this.f1317b + ", complianceData=" + this.f1318c + ", eventUptimeMs=" + this.f1319d + ", sourceExtension=" + Arrays.toString(this.f1320e) + ", sourceExtensionJsonProto3=" + this.f1321f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.f1322h + ", experimentIds=" + this.f1323i + "}";
    }
}
