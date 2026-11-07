package A1;

import android.graphics.Insets;
import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f461e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f465d;

    public c(int i10, int i11, int i12, int i13) {
        this.f462a = i10;
        this.f463b = i11;
        this.f464c = i12;
        this.f465d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return c(Math.max(cVar.f462a, cVar2.f462a), Math.max(cVar.f463b, cVar2.f463b), Math.max(cVar.f464c, cVar2.f464c), Math.max(cVar.f465d, cVar2.f465d));
    }

    public static c b(c cVar, c cVar2) {
        return c(Math.min(cVar.f462a, cVar2.f462a), Math.min(cVar.f463b, cVar2.f463b), Math.min(cVar.f464c, cVar2.f464c), Math.min(cVar.f465d, cVar2.f465d));
    }

    public static c c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f461e : new c(i10, i11, i12, i13);
    }

    public static c d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return b.g(this.f462a, this.f463b, this.f464c, this.f465d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f465d == cVar.f465d && this.f462a == cVar.f462a && this.f464c == cVar.f464c && this.f463b == cVar.f463b;
    }

    public final int hashCode() {
        return (((((this.f462a * 31) + this.f463b) * 31) + this.f464c) * 31) + this.f465d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f462a);
        sb.append(", top=");
        sb.append(this.f463b);
        sb.append(", right=");
        sb.append(this.f464c);
        sb.append(", bottom=");
        return p.A(sb, this.f465d, '}');
    }
}
