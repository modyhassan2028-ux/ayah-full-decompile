package p013b2;

/* JADX INFO: loaded from: classes.dex */
public final class q implements p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13174s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13175t = -1;

    public q(int i10) {
        this.f13173r = i10;
    }

    @Override // p013b2.p
    public final boolean b(CharSequence charSequence, int i10, int i11, x xVar) {
        int i12 = this.f13173r;
        if (i10 > i12 || i12 >= i11) {
            return i11 <= i12;
        }
        this.f13174s = i10;
        this.f13175t = i11;
        return false;
    }

    @Override // p013b2.p
    public final Object a() {
        return this;
    }
}
