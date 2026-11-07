package p185s8;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class N extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22239f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22241i;

    public N(int i10, String str, int i11, long j, long j10, boolean z10, int i12, String str2, String str3) {
        this.f22234a = i10;
        this.f22235b = str;
        this.f22236c = i11;
        this.f22237d = j;
        this.f22238e = j10;
        this.f22239f = z10;
        this.g = i12;
        this.f22240h = str2;
        this.f22241i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            N n6 = (N) ((w0) obj);
            if (this.f22234a == n6.f22234a && this.f22235b.equals(n6.f22235b) && this.f22236c == n6.f22236c && this.f22237d == n6.f22237d && this.f22238e == n6.f22238e && this.f22239f == n6.f22239f && this.g == n6.g && this.f22240h.equals(n6.f22240h) && this.f22241i.equals(n6.f22241i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f22234a ^ 1000003) * 1000003) ^ this.f22235b.hashCode()) * 1000003) ^ this.f22236c) * 1000003;
        long j = this.f22237d;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f22238e;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f22239f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.f22240h.hashCode()) * 1000003) ^ this.f22241i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f22234a);
        sb.append(", model=");
        sb.append(this.f22235b);
        sb.append(", cores=");
        sb.append(this.f22236c);
        sb.append(", ram=");
        sb.append(this.f22237d);
        sb.append(", diskSpace=");
        sb.append(this.f22238e);
        sb.append(", simulator=");
        sb.append(this.f22239f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.f22240h);
        sb.append(", modelClass=");
        return p.B(sb, this.f22241i, "}");
    }
}
