package D;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f887d;

    public G(int i10, int i11, int i12, int i13) {
        this.f884a = i10;
        this.f885b = i11;
        this.f886c = i12;
        this.f887d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return this.f884a == g.f884a && this.f885b == g.f885b && this.f886c == g.f886c && this.f887d == g.f887d;
    }

    public final int hashCode() {
        return (((((this.f884a * 31) + this.f885b) * 31) + this.f886c) * 31) + this.f887d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f884a);
        sb.append(", top=");
        sb.append(this.f885b);
        sb.append(", right=");
        sb.append(this.f886c);
        sb.append(", bottom=");
        return android.support.v4.media.session.p.A(sb, this.f887d, ')');
    }
}
