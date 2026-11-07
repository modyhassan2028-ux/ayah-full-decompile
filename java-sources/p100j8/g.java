package p100j8;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f18803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18804b;

    public g(p pVar, boolean z10) {
        this.f18803a = pVar;
        this.f18804b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f18803a.equals(this.f18803a) && gVar.f18804b == this.f18804b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18803a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f18804b).hashCode();
    }
}
