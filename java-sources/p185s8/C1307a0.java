package p185s8;

/* JADX INFO: renamed from: s8.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1307a0 extends D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22304d;

    public C1307a0(String str, boolean z10, int i10, int i11) {
        this.f22301a = str;
        this.f22302b = i10;
        this.f22303c = i11;
        this.f22304d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D0) {
            C1307a0 c1307a0 = (C1307a0) ((D0) obj);
            if (this.f22301a.equals(c1307a0.f22301a) && this.f22302b == c1307a0.f22302b && this.f22303c == c1307a0.f22303c && this.f22304d == c1307a0.f22304d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22301a.hashCode() ^ 1000003) * 1000003) ^ this.f22302b) * 1000003) ^ this.f22303c) * 1000003) ^ (this.f22304d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f22301a + ", pid=" + this.f22302b + ", importance=" + this.f22303c + ", defaultProcess=" + this.f22304d + "}";
    }
}
