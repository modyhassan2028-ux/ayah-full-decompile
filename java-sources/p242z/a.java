package p242z;

import p110k9.t;
import p123m2.c;
import p180s0.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24723e;

    public a(long j, long j10, long j11, long j12, long j13) {
        this.f24719a = j;
        this.f24720b = j10;
        this.f24721c = j11;
        this.f24722d = j12;
        this.f24723e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return q.c(this.f24719a, aVar.f24719a) && q.c(this.f24720b, aVar.f24720b) && q.c(this.f24721c, aVar.f24721c) && q.c(this.f24722d, aVar.f24722d) && q.c(this.f24723e, aVar.f24723e);
    }

    public final int hashCode() {
        int i10 = q.f21844h;
        return t.a(this.f24723e) + c.o(c.o(c.o(t.a(this.f24719a) * 31, 31, this.f24720b), 31, this.f24721c), 31, this.f24722d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        c.A(this.f24719a, ", textColor=", sb);
        c.A(this.f24720b, ", iconColor=", sb);
        c.A(this.f24721c, ", disabledTextColor=", sb);
        c.A(this.f24722d, ", disabledIconColor=", sb);
        sb.append((Object) q.i(this.f24723e));
        sb.append(')');
        return sb.toString();
    }
}
