package p187t0;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22512c;

    public c(long j, int i10, String str) {
        this.f22510a = str;
        this.f22511b = j;
        this.f22512c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f3, float f7, float f10);

    public abstract float e(float f3, float f7, float f10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f22512c == cVar.f22512c && j.a(this.f22510a, cVar.f22510a)) {
            return b.a(this.f22511b, cVar.f22511b);
        }
        return false;
    }

    public abstract long f(float f3, float f7, float f10, float f11, c cVar);

    public int hashCode() {
        int iHashCode = this.f22510a.hashCode() * 31;
        int i10 = b.f22509e;
        long j = this.f22511b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f22512c;
    }

    public final String toString() {
        return this.f22510a + " (id=" + this.f22512c + ", model=" + ((Object) b.b(this.f22511b)) + ')';
    }
}
