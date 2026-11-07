package Q8;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6896d;

    public G(String str, boolean z10, int i10, int i11) {
        this.f6893a = str;
        this.f6894b = i10;
        this.f6895c = i11;
        this.f6896d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return p251z9.j.a(this.f6893a, g.f6893a) && this.f6894b == g.f6894b && this.f6895c == g.f6895c && this.f6896d == g.f6896d;
    }

    public final int hashCode() {
        return (((((this.f6893a.hashCode() * 31) + this.f6894b) * 31) + this.f6895c) * 31) + (this.f6896d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f6893a + ", pid=" + this.f6894b + ", importance=" + this.f6895c + ", isDefaultProcess=" + this.f6896d + ')';
    }
}
