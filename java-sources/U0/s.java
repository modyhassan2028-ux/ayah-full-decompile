package U0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p022c1.c f8121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8123c;

    public s(p022c1.c cVar, int i10, int i11) {
        this.f8121a = cVar;
        this.f8122b = i10;
        this.f8123c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f8121a.equals(sVar.f8121a) && this.f8122b == sVar.f8122b && this.f8123c == sVar.f8123c;
    }

    public final int hashCode() {
        return (((this.f8121a.hashCode() * 31) + this.f8122b) * 31) + this.f8123c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f8121a);
        sb.append(", startIndex=");
        sb.append(this.f8122b);
        sb.append(", endIndex=");
        return android.support.v4.media.session.p.A(sb, this.f8123c, ')');
    }
}
