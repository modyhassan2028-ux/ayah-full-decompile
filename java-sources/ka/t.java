package ka;

import Z0.B;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E6.u f19255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f19256b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f19259e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f19261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f19262i;
    public u j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f19263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ca.r f19265m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19257c = -1;
    public w g = w.f19284r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z f19266n = z.f19296q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B f19260f = new B(17);

    public static void b(String str, u uVar) {
        if (uVar != null) {
            if (uVar.f19280y != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.f19281z != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f19267A != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final u a() {
        int i10 = this.f19257c;
        if (i10 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f19257c).toString());
        }
        E6.u uVar = this.f19255a;
        if (uVar == null) {
            throw new IllegalStateException("request == null");
        }
        s sVar = this.f19256b;
        if (sVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f19258d;
        if (str != null) {
            return new u(uVar, sVar, str, i10, this.f19259e, this.f19260f.d(), this.g, this.f19261h, this.f19262i, this.j, this.f19263k, this.f19264l, this.f19265m, this.f19266n);
        }
        throw new IllegalStateException("message == null");
    }
}
