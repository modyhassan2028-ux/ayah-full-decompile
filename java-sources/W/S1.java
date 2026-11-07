package W;

import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class S1 extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z0.y f8813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f8814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f8815t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ W2.n f8816u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B.j f8817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p180s0.J f8818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ L1 f8819x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(Z0.y yVar, boolean z10, boolean z11, W2.n nVar, B.j jVar, p180s0.J j, L1 l10) {
        super(3);
        this.f8813r = yVar;
        this.f8814s = z10;
        this.f8815t = z11;
        this.f8816u = nVar;
        this.f8817v = jVar;
        this.f8818w = j;
        this.f8819x = l10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        p241y9.e eVar = (p241y9.e) obj;
        C0698o c0698o = (C0698o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0698o.i(eVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0698o.x()) {
            c0698o.N();
        } else {
            P1.f8759a.b(this.f8813r.f10953a.f8060s, eVar, this.f8814s, this.f8815t, this.f8816u, this.f8817v, this.f8818w, this.f8819x, null, null, c0698o, (iIntValue << 3) & 112);
        }
        return p110k9.y.f19095a;
    }
}
