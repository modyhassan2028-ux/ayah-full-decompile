package i7;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H0 f17139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17140t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f17141u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y0 f17142v;

    public /* synthetic */ T0(Y0 y10, H0 h7, long j, boolean z10, int i10) {
        this.f17138r = i10;
        this.f17139s = h7;
        this.f17140t = j;
        this.f17141u = z10;
        this.f17142v = y10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17138r) {
            case 0:
                Y0 y10 = this.f17142v;
                H0 h7 = this.f17139s;
                y10.s(h7);
                y10.E(h7, this.f17140t, this.f17141u);
                break;
            default:
                Y0 y11 = this.f17142v;
                H0 h10 = this.f17139s;
                y11.s(h10);
                y11.E(h10, this.f17140t, this.f17141u);
                break;
        }
    }
}
