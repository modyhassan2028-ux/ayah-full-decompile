package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: W.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0588p extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f9305A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9306r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.r f9308t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f9309u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9313y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f9314z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0588p(D.X x9, boolean z10, l0.r rVar, p214w.G g, p214w.H h7, String str, p074h0.d dVar, int i10, int i11) {
        super(2);
        this.f9307s = x9;
        this.f9309u = z10;
        this.f9308t = rVar;
        this.f9314z = g;
        this.f9305A = h7;
        this.f9310v = str;
        this.f9313y = dVar;
        this.f9311w = i10;
        this.f9312x = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9306r) {
            case 0:
                ((Number) obj2).intValue();
                p074h0.d dVar = (p074h0.d) this.f9313y;
                p241y9.a aVar = (p241y9.a) this.f9307s;
                p241y9.e eVar = (p241y9.e) this.f9314z;
                H0 h7 = (H0) this.f9305A;
                D.P p10 = (D.P) this.f9310v;
                AbstractC0591q.b(dVar, aVar, this.f9308t, eVar, this.f9309u, h7, p10, (C0698o) obj, C0672b.y(this.f9311w | 1), this.f9312x);
                break;
            case 1:
                ((Number) obj2).intValue();
                p241y9.a aVar2 = (p241y9.a) this.f9307s;
                p180s0.J j = (p180s0.J) this.f9313y;
                Q q10 = (Q) this.f9314z;
                D.P p11 = (D.P) this.f9310v;
                p241y9.f fVar = (p241y9.f) this.f9305A;
                V0.k(aVar2, this.f9308t, this.f9309u, j, q10, p11, fVar, (C0698o) obj, C0672b.y(this.f9311w | 1), this.f9312x);
                break;
            default:
                ((Number) obj2).intValue();
                D.X x9 = (D.X) this.f9307s;
                p214w.G g = (p214w.G) this.f9314z;
                p214w.H h10 = (p214w.H) this.f9305A;
                String str = (String) this.f9310v;
                p074h0.d dVar2 = (p074h0.d) this.f9313y;
                androidx.compose.animation.b.b(x9, this.f9309u, this.f9308t, g, h10, str, dVar2, (C0698o) obj, C0672b.y(this.f9311w | 1), this.f9312x);
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0588p(p074h0.d dVar, p241y9.a aVar, l0.r rVar, p241y9.e eVar, boolean z10, H0 h7, D.P p10, int i10, int i11) {
        super(2);
        this.f9313y = dVar;
        this.f9307s = aVar;
        this.f9308t = rVar;
        this.f9314z = eVar;
        this.f9309u = z10;
        this.f9305A = h7;
        this.f9310v = p10;
        this.f9311w = i10;
        this.f9312x = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0588p(p241y9.a aVar, l0.r rVar, boolean z10, p180s0.J j, Q q10, D.P p10, p241y9.f fVar, int i10, int i11) {
        super(2);
        this.f9307s = aVar;
        this.f9308t = rVar;
        this.f9309u = z10;
        this.f9313y = j;
        this.f9314z = q10;
        this.f9310v = p10;
        this.f9305A = fVar;
        this.f9311w = i10;
        this.f9312x = i11;
    }
}
