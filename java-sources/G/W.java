package G;

import A.EnumC0047u0;
import A.M0;
import F.C0154c;
import J0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class W extends l0.q implements y0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p241y9.a f2639F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C0154c f2640G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EnumC0047u0 f2641H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f2642I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public R0.h f2643J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final U f2644K = new U(this, 0);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public U f2645L;

    public W(p241y9.a aVar, C0154c c0154c, EnumC0047u0 enumC0047u0, boolean z10) {
        this.f2639F = aVar;
        this.f2640G = c0154c;
        this.f2641H = enumC0047u0;
        this.f2642I = z10;
        v0();
    }

    @Override // J0.y0
    public final void L(R0.j jVar) {
        R0.u.g(jVar);
        jVar.e(R0.s.f7153K, this.f2644K);
        if (this.f2641H == EnumC0047u0.f424r) {
            R0.h hVar = this.f2643J;
            if (hVar == null) {
                p251z9.j.k("scrollAxisRange");
                throw null;
            }
            R0.v vVar = R0.s.f7173t;
            F9.f fVar = R0.u.f7181a[11];
            vVar.a(jVar, hVar);
        } else {
            R0.h hVar2 = this.f2643J;
            if (hVar2 == null) {
                p251z9.j.k("scrollAxisRange");
                throw null;
            }
            R0.v vVar2 = R0.s.f7172s;
            F9.f fVar2 = R0.u.f7181a[10];
            vVar2.a(jVar, hVar2);
        }
        U u8 = this.f2645L;
        if (u8 != null) {
            jVar.e(R0.i.f7089f, new R0.a(null, u8));
        }
        jVar.e(R0.i.f7083B, new R0.a(null, new M0(22, new T(this, 0))));
        this.f2640G.getClass();
        R0.b bVar = new R0.b(-1, 1);
        R0.v vVar3 = R0.s.f7161f;
        F9.f fVar3 = R0.u.f7181a[21];
        vVar3.a(jVar, bVar);
    }

    @Override // J0.y0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // J0.y0
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    public final void v0() {
        this.f2643J = new R0.h(new T(this, 1), new T(this, 2));
        this.f2645L = this.f2642I ? new U(this, 1) : null;
    }
}
