package W;

import A.C0023i;
import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: W.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0563h extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9139r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f9140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9144w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0563h(p074h0.d dVar, Object obj, Object obj2, Object obj3, int i10) {
        super(2);
        this.f9140s = dVar;
        this.f9142u = obj;
        this.f9143v = obj2;
        this.f9144w = obj3;
        this.f9141t = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9139r) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0567i.d((p241y9.a) this.f9142u, (l0.r) this.f9143v, (p104k1.n) this.f9144w, (p074h0.d) this.f9140s, (C0698o) obj, C0672b.y(this.f9141t | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                p074h0.d dVar = (p074h0.d) this.f9140s;
                dVar.g(this.f9142u, this.f9143v, this.f9144w, (C0698o) obj, C0672b.y(this.f9141t) | 1);
                break;
            case 2:
                ((Number) obj2).intValue();
                p171r0.a.a((p242z.j) this.f9144w, (p241y9.a) this.f9142u, (l0.r) this.f9143v, (C0023i) this.f9140s, (C0698o) obj, C0672b.y(this.f9141t | 1));
                break;
            default:
                ((Number) obj2).intValue();
                p242z.k.d((p104k1.s) this.f9143v, (p241y9.a) this.f9142u, (p242z.a) this.f9144w, (C0023i) this.f9140s, (C0698o) obj, C0672b.y(this.f9141t | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0563h(p104k1.s sVar, p241y9.a aVar, p242z.a aVar2, C0023i c0023i, int i10) {
        super(2);
        this.f9143v = sVar;
        this.f9142u = aVar;
        this.f9144w = aVar2;
        this.f9140s = c0023i;
        this.f9141t = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0563h(p241y9.a aVar, l0.r rVar, p104k1.n nVar, p074h0.d dVar, int i10) {
        super(2);
        this.f9142u = aVar;
        this.f9143v = rVar;
        this.f9144w = nVar;
        this.f9140s = dVar;
        this.f9141t = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0563h(p242z.j jVar, p241y9.a aVar, l0.r rVar, C0023i c0023i, int i10) {
        super(2);
        this.f9144w = jVar;
        this.f9142u = aVar;
        this.f9143v = rVar;
        this.f9140s = c0023i;
        this.f9141t = i10;
    }
}
