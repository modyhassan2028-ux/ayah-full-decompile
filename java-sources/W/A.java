package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B f8429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.r f8430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f8431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f8432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p180s0.J f8433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f8434w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b5, l0.r rVar, float f3, float f7, p180s0.J j, long j10, int i10) {
        super(2);
        this.f8429r = b5;
        this.f8430s = rVar;
        this.f8431t = f3;
        this.f8432u = f7;
        this.f8433v = j;
        this.f8434w = j10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = C0672b.y(196609);
        this.f8429r.a(this.f8430s, this.f8431t, this.f8432u, this.f8433v, this.f8434w, (C0698o) obj, iY);
        return p110k9.y.f19095a;
    }
}
