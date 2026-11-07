package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f838d;

    public o(int i10, long j, boolean z10, long j10) {
        this.f835a = i10;
        this.f836b = j;
        this.f837c = z10;
        this.f838d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f835a == oVar.f835a && this.f836b == oVar.f836b && this.f837c == oVar.f837c && this.f838d == oVar.f838d;
    }

    public final int hashCode() {
        return (((((this.f835a * 31) + ((int) this.f836b)) * 31) + (!this.f837c ? 1 : 0)) * 31) + ((int) this.f838d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f835a);
        sb.append('/');
        sb.append(this.f836b);
        return sb.toString();
    }
}
