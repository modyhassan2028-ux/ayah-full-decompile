package M7;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5828i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5829k;

    @Override // M7.d
    public final void a() {
        super.a();
        if (this.f5829k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f5827h == 0) {
            if (this.f5753b > 0 && this.g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f5754c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
