package p104k1;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f18937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18939e;

    public n(int i10) {
        boolean z10 = (i10 & 4) != 0;
        this.f18935a = true;
        this.f18936b = true;
        this.f18937c = u.f18954r;
        this.f18938d = z10;
        this.f18939e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f18935a == nVar.f18935a && this.f18936b == nVar.f18936b && this.f18937c == nVar.f18937c && this.f18938d == nVar.f18938d && this.f18939e == nVar.f18939e;
    }

    public final int hashCode() {
        return ((((this.f18937c.hashCode() + ((((this.f18935a ? 1231 : 1237) * 31) + (this.f18936b ? 1231 : 1237)) * 31)) * 31) + (this.f18938d ? 1231 : 1237)) * 31) + (this.f18939e ? 1231 : 1237);
    }
}
