package J0;

/* JADX INFO: renamed from: J0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0278c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0.q f4055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p011b0.e f4057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p011b0.e f4058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0280d0 f4060f;

    public C0278c0(C0280d0 c0280d0, l0.q qVar, int i10, p011b0.e eVar, p011b0.e eVar2, boolean z10) {
        this.f4060f = c0280d0;
        this.f4055a = qVar;
        this.f4056b = i10;
        this.f4057c = eVar;
        this.f4058d = eVar2;
        this.f4059e = z10;
    }

    public final boolean a(int i10, int i11) {
        p011b0.e eVar = this.f4057c;
        int i12 = this.f4056b;
        l0.p pVar = (l0.p) eVar.f13125r[i10 + i12];
        l0.p pVar2 = (l0.p) this.f4058d.f13125r[i12 + i11];
        C0282e0 c0282e0 = f0.f4084a;
        return p251z9.j.a(pVar, pVar2) || pVar.getClass() == pVar2.getClass();
    }
}
