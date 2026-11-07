package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f9425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f9426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2 f9427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0554e2 f9429v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9430w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(l0.r rVar, int i10, C2 c10, int i11, C0554e2 c0554e2, int i12) {
        super(2);
        this.f9425r = rVar;
        this.f9426s = i10;
        this.f9427t = c10;
        this.f9428u = i11;
        this.f9429v = c0554e2;
        this.f9430w = i12;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        A2.o(this.f9425r, this.f9426s, this.f9427t, this.f9428u, this.f9429v, (C0698o) obj, C0672b.y(this.f9430w | 1));
        return p110k9.y.f19095a;
    }
}
