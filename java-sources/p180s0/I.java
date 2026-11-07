package p180s0;

import p110k9.t;
import p171r0.c;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f21798d = new I(F.d(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21801c;

    public I(long j, long j10, float f3) {
        this.f21799a = j;
        this.f21800b = j10;
        this.f21801c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return q.c(this.f21799a, i10.f21799a) && c.b(this.f21800b, i10.f21800b) && this.f21801c == i10.f21801c;
    }

    public final int hashCode() {
        int i10 = q.f21844h;
        return Float.floatToIntBits(this.f21801c) + ((c.f(this.f21800b) + (t.a(this.f21799a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        p123m2.c.A(this.f21799a, ", offset=", sb);
        sb.append((Object) c.j(this.f21800b));
        sb.append(", blurRadius=");
        return p123m2.c.v(sb, this.f21801c, ')');
    }
}
