package G;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2571r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2576w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F.i iVar, Object obj, int i10, Object obj2, int i11) {
        super(2);
        this.f2575v = iVar;
        this.f2572s = obj;
        this.f2573t = i10;
        this.f2576w = obj2;
        this.f2574u = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2571r) {
            case 0:
                ((Number) obj2).intValue();
                F.i iVar = (F.i) this.f2575v;
                AbstractC0190y.d(iVar, this.f2572s, this.f2573t, this.f2576w, (C0698o) obj, C0672b.y(this.f2574u | 1));
                break;
            default:
                ((Number) obj2).intValue();
                I i10 = (I) this.f2575v;
                p074h0.d dVar = (p074h0.d) this.f2576w;
                AbstractC0190y.b(this.f2572s, this.f2573t, i10, dVar, (C0698o) obj, C0672b.y(this.f2574u | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Object obj, int i10, I i11, p074h0.d dVar, int i12) {
        super(2);
        this.f2572s = obj;
        this.f2573t = i10;
        this.f2575v = i11;
        this.f2576w = dVar;
        this.f2574u = i12;
    }
}
