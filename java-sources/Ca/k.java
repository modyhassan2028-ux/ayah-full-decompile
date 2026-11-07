package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Da.k f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f824b;

    public k(Da.k kVar, int i10) {
        p251z9.j.e(kVar, "byteString");
        this.f823a = kVar;
        this.f824b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p251z9.j.a(this.f823a, kVar.f823a) && this.f824b == kVar.f824b;
    }

    public final int hashCode() {
        return (this.f823a.hashCode() * 31) + this.f824b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitString(byteString=");
        sb.append(this.f823a);
        sb.append(", unusedBitsCount=");
        return android.support.v4.media.session.p.A(sb, this.f824b, ')');
    }
}
