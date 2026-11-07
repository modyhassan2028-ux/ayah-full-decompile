package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9375r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.r f9376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9377t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9378u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9382y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(l0.r rVar, C2 c10, C0554e2 c0554e2, H0.I i10, J.d dVar, J.d dVar2, int i11) {
        super(2);
        this.f9376s = rVar;
        this.f9378u = c10;
        this.f9379v = c0554e2;
        this.f9380w = i10;
        this.f9381x = dVar;
        this.f9382y = dVar2;
        this.f9377t = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9375r) {
            case 0:
                ((Number) obj2).intValue();
                C2 c10 = (C2) this.f9378u;
                C0554e2 c0554e2 = (C0554e2) this.f9379v;
                H0.I i10 = (H0.I) this.f9380w;
                J.d dVar = (J.d) this.f9381x;
                J.d dVar2 = (J.d) this.f9382y;
                A2.f(this.f9376s, c10, c0554e2, i10, dVar, dVar2, (C0698o) obj, C0672b.y(this.f9377t | 1));
                break;
            default:
                ((Number) obj2).intValue();
                p223x.q0 q0Var = (p223x.q0) this.f9378u;
                p241y9.c cVar = (p241y9.c) this.f9379v;
                l0.e eVar = (l0.e) this.f9380w;
                p241y9.c cVar2 = (p241y9.c) this.f9381x;
                p074h0.d dVar3 = (p074h0.d) this.f9382y;
                androidx.compose.animation.a.b(q0Var, this.f9376s, cVar, eVar, cVar2, dVar3, (C0698o) obj, C0672b.y(this.f9377t | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(p223x.q0 q0Var, l0.r rVar, p241y9.c cVar, l0.e eVar, p241y9.c cVar2, p074h0.d dVar, int i10) {
        super(2);
        this.f9378u = q0Var;
        this.f9376s = rVar;
        this.f9379v = cVar;
        this.f9380w = eVar;
        this.f9381x = cVar2;
        this.f9382y = dVar;
        this.f9377t = i10;
    }
}
