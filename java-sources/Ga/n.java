package Ga;

import W.G1;
import W.H1;
import W.J1;
import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3052r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.r f3054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f3055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f3056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3059y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(A a9, Object obj, l0.r rVar, boolean z10, boolean z11, p074h0.d dVar, int i10) {
        super(2);
        this.f3058x = a9;
        this.f3059y = obj;
        this.f3054t = rVar;
        this.f3055u = z10;
        this.f3056v = z11;
        this.f3053s = dVar;
        this.f3057w = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3052r) {
            case 0:
                ((Number) obj2).intValue();
                A a9 = (A) this.f3058x;
                p074h0.d dVar = (p074h0.d) this.f3053s;
                p050e8.b.d(a9, this.f3059y, this.f3054t, this.f3055u, this.f3056v, dVar, (C0698o) obj, C0672b.y(this.f3057w | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                H1 h7 = (H1) this.f3058x;
                p074h0.d dVar2 = (p074h0.d) this.f3053s;
                p074h0.d dVar3 = (p074h0.d) this.f3059y;
                G1.a(h7, dVar2, this.f3054t, this.f3055u, this.f3056v, dVar3, (C0698o) obj, C0672b.y(this.f3057w | 1));
                break;
            default:
                ((Number) obj2).intValue();
                J1 j10 = (J1) this.f3058x;
                B.j jVar = (B.j) this.f3059y;
                p180s0.J j = (p180s0.J) this.f3053s;
                androidx.compose.material3.a.b(this.f3054t, this.f3055u, this.f3056v, j10, jVar, j, (C0698o) obj, C0672b.y(this.f3057w | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(H1 h7, p074h0.d dVar, l0.r rVar, boolean z10, boolean z11, p074h0.d dVar2, int i10) {
        super(2);
        this.f3058x = h7;
        this.f3053s = dVar;
        this.f3054t = rVar;
        this.f3055u = z10;
        this.f3056v = z11;
        this.f3059y = dVar2;
        this.f3057w = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l0.r rVar, boolean z10, boolean z11, J1 j10, B.j jVar, p180s0.J j, int i10) {
        super(2);
        this.f3054t = rVar;
        this.f3055u = z10;
        this.f3056v = z11;
        this.f3058x = j10;
        this.f3059y = jVar;
        this.f3053s = j;
        this.f3057w = i10;
    }
}
