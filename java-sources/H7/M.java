package H7;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3461d;

    public M a(int i10) {
        int i11 = this.f3458a;
        int i12 = this.f3459b;
        int i13 = this.f3460c;
        int i14 = this.f3461d;
        if ((i11 | i12 | i13 | i14) == 0 || i10 == 0) {
            return this;
        }
        M m10 = new M();
        int i15 = ~i10;
        m10.f3458a = i11 & i15;
        m10.f3459b = i12 & i15;
        m10.f3460c = i13 & i15;
        m10.f3461d = i15 & i14;
        return m10;
    }
}
