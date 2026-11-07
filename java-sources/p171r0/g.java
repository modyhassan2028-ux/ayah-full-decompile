package p171r0;

import android.support.v4.media.session.p;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21398f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21399h;

    static {
        h.a(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public g(float f3, float f7, float f10, float f11, long j, long j10, long j11, long j12) {
        this.f21393a = f3;
        this.f21394b = f7;
        this.f21395c = f10;
        this.f21396d = f11;
        this.f21397e = j;
        this.f21398f = j10;
        this.g = j11;
        this.f21399h = j12;
    }

    public final float a() {
        return this.f21396d - this.f21394b;
    }

    public final float b() {
        return this.f21395c - this.f21393a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f21393a, gVar.f21393a) == 0 && Float.compare(this.f21394b, gVar.f21394b) == 0 && Float.compare(this.f21395c, gVar.f21395c) == 0 && Float.compare(this.f21396d, gVar.f21396d) == 0 && va.g.n(this.f21397e, gVar.f21397e) && va.g.n(this.f21398f, gVar.f21398f) && va.g.n(this.g, gVar.g) && va.g.n(this.f21399h, gVar.f21399h);
    }

    public final int hashCode() {
        int iN = c.n(c.n(c.n(Float.floatToIntBits(this.f21393a) * 31, this.f21394b, 31), this.f21395c, 31), this.f21396d, 31);
        long j = this.f21397e;
        long j10 = this.f21398f;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + ((((int) (j ^ (j >>> 32))) + iN) * 31)) * 31;
        long j11 = this.g;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) + i10) * 31;
        long j12 = this.f21399h;
        return ((int) (j12 ^ (j12 >>> 32))) + i11;
    }

    public final String toString() {
        String str = a.f(this.f21393a) + ", " + a.f(this.f21394b) + ", " + a.f(this.f21395c) + ", " + a.f(this.f21396d);
        long j = this.f21397e;
        long j10 = this.f21398f;
        boolean zN = va.g.n(j, j10);
        long j11 = this.g;
        long j12 = this.f21399h;
        if (!zN || !va.g.n(j10, j11) || !va.g.n(j11, j12)) {
            StringBuilder sbD = p.D("RoundRect(rect=", str, ", topLeft=");
            sbD.append((Object) va.g.S(j));
            sbD.append(", topRight=");
            sbD.append((Object) va.g.S(j10));
            sbD.append(", bottomRight=");
            sbD.append((Object) va.g.S(j11));
            sbD.append(", bottomLeft=");
            sbD.append((Object) va.g.S(j12));
            sbD.append(')');
            return sbD.toString();
        }
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            StringBuilder sbD2 = p.D("RoundRect(rect=", str, ", radius=");
            sbD2.append(a.f(Float.intBitsToFloat(i10)));
            sbD2.append(')');
            return sbD2.toString();
        }
        StringBuilder sbD3 = p.D("RoundRect(rect=", str, ", x=");
        sbD3.append(a.f(Float.intBitsToFloat(i10)));
        sbD3.append(", y=");
        sbD3.append(a.f(Float.intBitsToFloat(i11)));
        sbD3.append(')');
        return sbD3.toString();
    }
}
