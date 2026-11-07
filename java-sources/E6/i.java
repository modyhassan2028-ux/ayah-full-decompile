package E6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f1931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f1934f;
    public final Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f1936i;
    public final byte[] j;

    public i(String str, Integer num, n nVar, long j, long j10, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f1929a = str;
        this.f1930b = num;
        this.f1931c = nVar;
        this.f1932d = j;
        this.f1933e = j10;
        this.f1934f = map;
        this.g = num2;
        this.f1935h = str2;
        this.f1936i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f1934f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f1934f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f1929a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.f1921a = str;
        hVar.f1923c = this.f1930b;
        hVar.f1924d = this.g;
        hVar.f1922b = this.f1935h;
        hVar.f1928i = this.f1936i;
        hVar.j = this.j;
        n nVar = this.f1931c;
        if (nVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f1925e = nVar;
        hVar.f1926f = Long.valueOf(this.f1932d);
        hVar.g = Long.valueOf(this.f1933e);
        hVar.f1927h = new HashMap(this.f1934f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str2 = iVar.f1935h;
            Integer num3 = iVar.g;
            Integer num4 = iVar.f1930b;
            if (this.f1929a.equals(iVar.f1929a) && ((num = this.f1930b) != null ? num.equals(num4) : num4 == null) && this.f1931c.equals(iVar.f1931c) && this.f1932d == iVar.f1932d && this.f1933e == iVar.f1933e && this.f1934f.equals(iVar.f1934f) && ((num2 = this.g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f1935h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f1936i, iVar.f1936i) && Arrays.equals(this.j, iVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1929a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1930b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f1931c.hashCode()) * 1000003;
        long j = this.f1932d;
        int i10 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f1933e;
        int iHashCode3 = (((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f1934f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f1935h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f1936i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1929a + ", code=" + this.f1930b + ", encodedPayload=" + this.f1931c + ", eventMillis=" + this.f1932d + ", uptimeMillis=" + this.f1933e + ", autoMetadata=" + this.f1934f + ", productId=" + this.g + ", pseudonymousId=" + this.f1935h + ", experimentIdsClear=" + Arrays.toString(this.f1936i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
