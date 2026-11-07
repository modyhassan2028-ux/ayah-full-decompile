package O;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6341b;

    public U(long j, long j10) {
        this.f6340a = j;
        this.f6341b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u8 = (U) obj;
        return p180s0.q.c(this.f6340a, u8.f6340a) && p180s0.q.c(this.f6341b, u8.f6341b);
    }

    public final int hashCode() {
        int i10 = p180s0.q.f21844h;
        return p110k9.t.a(this.f6341b) + (p110k9.t.a(this.f6340a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        p123m2.c.A(this.f6340a, ", selectionBackgroundColor=", sb);
        sb.append((Object) p180s0.q.i(this.f6341b));
        sb.append(')');
        return sb.toString();
    }
}
