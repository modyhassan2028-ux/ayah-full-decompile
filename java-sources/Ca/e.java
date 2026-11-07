package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Da.k f808e;

    public e(int i10, long j, boolean z10, long j10, Da.k kVar) {
        p251z9.j.e(kVar, "bytes");
        this.f804a = i10;
        this.f805b = j;
        this.f806c = z10;
        this.f807d = j10;
        this.f808e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f804a == eVar.f804a && this.f805b == eVar.f805b && this.f806c == eVar.f806c && this.f807d == eVar.f807d && p251z9.j.a(this.f808e, eVar.f808e);
    }

    public final int hashCode() {
        return this.f808e.hashCode() + (((((((this.f804a * 31) + ((int) this.f805b)) * 31) + (!this.f806c ? 1 : 0)) * 31) + ((int) this.f807d)) * 31);
    }

    public final String toString() {
        return "AnyValue(tagClass=" + this.f804a + ", tag=" + this.f805b + ", constructed=" + this.f806c + ", length=" + this.f807d + ", bytes=" + this.f808e + ')';
    }
}
