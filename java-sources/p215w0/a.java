package p215w0;

import J0.K;
import p063g1.l;
import p123m2.c;
import p180s0.C1297f;
import p180s0.C1303l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1297f f23562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23563f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23565i;
    public C1303l j;

    public a(C1297f c1297f) {
        int i10;
        int i11;
        long width = (((long) c1297f.f21826a.getWidth()) << 32) | (((long) c1297f.f21826a.getHeight()) & 4294967295L);
        this.f23562e = c1297f;
        this.f23563f = width;
        this.g = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (width >> 32)) < 0 || (i11 = (int) (width & 4294967295L)) < 0 || i10 > c1297f.f21826a.getWidth() || i11 > c1297f.f21826a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f23564h = width;
        this.f23565i = 1.0f;
    }

    @Override // p215w0.b
    public final void a(float f3) {
        this.f23565i = f3;
    }

    @Override // p215w0.b
    public final void b(C1303l c1303l) {
        this.j = c1303l;
    }

    @Override // p215w0.b
    public final long d() {
        return B9.a.d0(this.f23564h);
    }

    @Override // p215w0.b
    public final void e(K k7) {
        int iRound = Math.round(Float.intBitsToFloat((int) (k7.b() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (k7.b() & 4294967295L)));
        float f3 = this.f23565i;
        C1303l c1303l = this.j;
        int i10 = this.g;
        c.f(k7, this.f23562e, this.f23563f, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f3, c1303l, i10, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f23562e, aVar.f23562e) && p063g1.j.a(0L, 0L) && l.a(this.f23563f, aVar.f23563f) && this.g == aVar.g;
    }

    public final int hashCode() {
        int iHashCode = (((int) 0) + (this.f23562e.hashCode() * 31)) * 31;
        long j = this.f23563f;
        return ((((int) (j ^ (j >>> 32))) + iHashCode) * 31) + this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f23562e);
        sb.append(", srcOffset=");
        sb.append((Object) p063g1.j.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) l.b(this.f23563f));
        sb.append(", filterQuality=");
        int i10 = this.g;
        if (i10 == 0) {
            str = "None";
        } else if (i10 == 1) {
            str = "Low";
        } else if (i10 == 2) {
            str = "Medium";
        } else {
            str = i10 == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
