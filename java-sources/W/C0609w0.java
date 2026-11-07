package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: W.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0609w0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f9434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f9435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f9436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9437u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0609w0(l0.r rVar, float f3, long j, int i10, int i11) {
        super(2);
        this.f9434r = rVar;
        this.f9435s = f3;
        this.f9436t = j;
        this.f9437u = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = C0672b.y(49);
        int i10 = this.f9437u;
        V0.g(this.f9434r, this.f9435s, this.f9436t, (C0698o) obj, iY, i10);
        return p110k9.y.f19095a;
    }
}
