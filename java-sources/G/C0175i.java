package G;

/* JADX INFO: renamed from: G.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0175i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.session.r f2702c;

    public C0175i(int i10, int i11, android.support.v4.media.session.r rVar) {
        this.f2700a = i10;
        this.f2701b = i11;
        this.f2702c = rVar;
        if (i10 < 0) {
            C.a.a("startIndex should be >= 0");
        }
        if (i11 > 0) {
            return;
        }
        C.a.a("size should be > 0");
    }
}
