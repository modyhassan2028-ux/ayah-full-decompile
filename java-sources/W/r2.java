package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0576l f9340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.r f9341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0554e2 f9342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f9343v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9344w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(C0576l c0576l, l0.r rVar, C0554e2 c0554e2, boolean z10, int i10, int i11) {
        super(2);
        this.f9339r = i11;
        this.f9340s = c0576l;
        this.f9341t = rVar;
        this.f9342u = c0554e2;
        this.f9343v = z10;
        this.f9344w = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9339r) {
            case 0:
                ((Number) obj2).intValue();
                A2.e(this.f9340s, this.f9341t, this.f9342u, this.f9343v, (C0698o) obj, C0672b.y(this.f9344w | 1));
                break;
            default:
                ((Number) obj2).intValue();
                A2.k(this.f9340s, this.f9341t, this.f9342u, this.f9343v, (C0698o) obj, C0672b.y(this.f9344w | 1));
                break;
        }
        return p110k9.y.f19095a;
    }
}
