package i7;

/* JADX INFO: renamed from: i7.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0986h1 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0983g1 f17407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0983g1 f17408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f17410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0992j1 f17411v;

    public RunnableC0986h1(C0992j1 c0992j1, C0983g1 c0983g1, C0983g1 c0983g2, long j, boolean z10) {
        this.f17407r = c0983g1;
        this.f17408s = c0983g2;
        this.f17409t = j;
        this.f17410u = z10;
        this.f17411v = c0992j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17411v.y(this.f17407r, this.f17408s, this.f17409t, this.f17410u, null);
    }
}
