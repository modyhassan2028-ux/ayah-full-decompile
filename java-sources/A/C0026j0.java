package A;

/* JADX INFO: renamed from: A.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0026j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f272c;

    public C0026j0(long j, long j10, boolean z10) {
        this.f270a = j;
        this.f271b = j10;
        this.f272c = z10;
    }

    public final C0026j0 a(C0026j0 c0026j0) {
        return new C0026j0(p171r0.c.h(this.f270a, c0026j0.f270a), Math.max(this.f271b, c0026j0.f271b), this.f272c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0026j0)) {
            return false;
        }
        C0026j0 c0026j0 = (C0026j0) obj;
        return p171r0.c.b(this.f270a, c0026j0.f270a) && this.f271b == c0026j0.f271b && this.f272c == c0026j0.f272c;
    }

    public final int hashCode() {
        int iF = p171r0.c.f(this.f270a) * 31;
        long j = this.f271b;
        return ((iF + ((int) (j ^ (j >>> 32)))) * 31) + (this.f272c ? 1231 : 1237);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) p171r0.c.j(this.f270a)) + ", timeMillis=" + this.f271b + ", shouldApplyImmediately=" + this.f272c + ')';
    }
}
