package p185s8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22187f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f22189i;

    public D(int i10, String str, int i11, int i12, long j, long j10, long j11, String str2, List list) {
        this.f22182a = i10;
        this.f22183b = str;
        this.f22184c = i11;
        this.f22185d = i12;
        this.f22186e = j;
        this.f22187f = j10;
        this.g = j11;
        this.f22188h = str2;
        this.f22189i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            D d5 = (D) ((q0) obj);
            List list2 = d5.f22189i;
            String str2 = d5.f22188h;
            if (this.f22182a == d5.f22182a && this.f22183b.equals(d5.f22183b) && this.f22184c == d5.f22184c && this.f22185d == d5.f22185d && this.f22186e == d5.f22186e && this.f22187f == d5.f22187f && this.g == d5.g && ((str = this.f22188h) != null ? str.equals(str2) : str2 == null) && ((list = this.f22189i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f22182a ^ 1000003) * 1000003) ^ this.f22183b.hashCode()) * 1000003) ^ this.f22184c) * 1000003) ^ this.f22185d) * 1000003;
        long j = this.f22186e;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f22187f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.g;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f22188h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f22189i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f22182a + ", processName=" + this.f22183b + ", reasonCode=" + this.f22184c + ", importance=" + this.f22185d + ", pss=" + this.f22186e + ", rss=" + this.f22187f + ", timestamp=" + this.g + ", traceFile=" + this.f22188h + ", buildIdMappingForArch=" + this.f22189i + "}";
    }
}
