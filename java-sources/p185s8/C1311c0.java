package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: renamed from: s8.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1311c0 extends F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f22322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22327f;

    public C1311c0(Double d5, int i10, boolean z10, int i11, long j, long j10) {
        this.f22322a = d5;
        this.f22323b = i10;
        this.f22324c = z10;
        this.f22325d = i11;
        this.f22326e = j;
        this.f22327f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F0) {
            F0 f3 = (F0) obj;
            Double d5 = this.f22322a;
            if (d5 != null ? d5.equals(((C1311c0) f3).f22322a) : ((C1311c0) f3).f22322a == null) {
                C1311c0 c1311c0 = (C1311c0) f3;
                if (this.f22323b == c1311c0.f22323b && this.f22324c == c1311c0.f22324c && this.f22325d == c1311c0.f22325d && this.f22326e == c1311c0.f22326e && this.f22327f == c1311c0.f22327f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d5 = this.f22322a;
        int iHashCode = ((((((((d5 == null ? 0 : d5.hashCode()) ^ 1000003) * 1000003) ^ this.f22323b) * 1000003) ^ (this.f22324c ? 1231 : 1237)) * 1000003) ^ this.f22325d) * 1000003;
        long j = this.f22326e;
        long j10 = this.f22327f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f22322a);
        sb.append(", batteryVelocity=");
        sb.append(this.f22323b);
        sb.append(", proximityOn=");
        sb.append(this.f22324c);
        sb.append(", orientation=");
        sb.append(this.f22325d);
        sb.append(", ramUsed=");
        sb.append(this.f22326e);
        sb.append(", diskUsed=");
        return p.x(this.f22327f, "}", sb);
    }
}
