package p185s8;

import android.os.Build;
import android.support.v4.media.session.p;

/* JADX INFO: renamed from: s8.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1333n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22433f;

    public C1333n0(int i10, int i11, long j, long j10, boolean z10, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f22428a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f22429b = i11;
        this.f22430c = j;
        this.f22431d = j10;
        this.f22432e = z10;
        this.f22433f = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1333n0)) {
            return false;
        }
        C1333n0 c1333n0 = (C1333n0) obj;
        if (this.f22428a != c1333n0.f22428a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f22429b != c1333n0.f22429b || this.f22430c != c1333n0.f22430c || this.f22431d != c1333n0.f22431d || this.f22432e != c1333n0.f22432e || this.f22433f != c1333n0.f22433f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f22428a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f22429b) * 1000003;
        long j = this.f22430c;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f22431d;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f22432e ? 1231 : 1237)) * 1000003) ^ this.f22433f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f22428a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f22429b);
        sb.append(", totalRam=");
        sb.append(this.f22430c);
        sb.append(", diskSpace=");
        sb.append(this.f22431d);
        sb.append(", isEmulator=");
        sb.append(this.f22432e);
        sb.append(", state=");
        sb.append(this.f22433f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return p.B(sb, Build.PRODUCT, "}");
    }
}
