package ka;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final u f19267A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f19268B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f19269C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Ca.r f19270D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final z f19271E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f19272F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E6.u f19273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f19274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f19275t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f19276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f19277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f19278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f19279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u f19280y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final u f19281z;

    public u(E6.u uVar, s sVar, String str, int i10, k kVar, l lVar, w wVar, u uVar2, u uVar3, u uVar4, long j, long j10, Ca.r rVar, z zVar) {
        p251z9.j.e(uVar, "request");
        p251z9.j.e(sVar, "protocol");
        p251z9.j.e(str, "message");
        p251z9.j.e(wVar, "body");
        p251z9.j.e(zVar, "trailersSource");
        this.f19273r = uVar;
        this.f19274s = sVar;
        this.f19275t = str;
        this.f19276u = i10;
        this.f19277v = kVar;
        this.f19278w = lVar;
        this.f19279x = wVar;
        this.f19280y = uVar2;
        this.f19281z = uVar3;
        this.f19267A = uVar4;
        this.f19268B = j;
        this.f19269C = j10;
        this.f19270D = rVar;
        this.f19271E = zVar;
        boolean z10 = false;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        }
        this.f19272F = z10;
    }

    public final t b() {
        t tVar = new t();
        tVar.f19257c = -1;
        tVar.g = w.f19284r;
        tVar.f19266n = z.f19296q;
        tVar.f19255a = this.f19273r;
        tVar.f19256b = this.f19274s;
        tVar.f19257c = this.f19276u;
        tVar.f19258d = this.f19275t;
        tVar.f19259e = this.f19277v;
        tVar.f19260f = this.f19278w.d();
        tVar.g = this.f19279x;
        tVar.f19261h = this.f19280y;
        tVar.f19262i = this.f19281z;
        tVar.j = this.f19267A;
        tVar.f19263k = this.f19268B;
        tVar.f19264l = this.f19269C;
        tVar.f19265m = this.f19270D;
        tVar.f19266n = this.f19271E;
        return tVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19279x.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f19274s + ", code=" + this.f19276u + ", message=" + this.f19275t + ", url=" + ((n) this.f19273r.f1960b) + '}';
    }
}
