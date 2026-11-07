package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2 f9301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.r f9302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0554e2 f9303u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9304v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(C2 c10, l0.r rVar, C0554e2 c0554e2, int i10, int i11) {
        super(2);
        this.f9300r = 1;
        this.f9301s = c10;
        this.f9302t = rVar;
        this.f9303u = c0554e2;
        this.f9304v = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9300r) {
            case 0:
                ((Number) obj2).intValue();
                int iY = C0672b.y(this.f9304v | 1);
                A2.d(this.f9302t, this.f9301s, this.f9303u, (C0698o) obj, iY);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iY2 = C0672b.y(1);
                A2.g(this.f9301s, this.f9302t, this.f9303u, this.f9304v, (C0698o) obj, iY2);
                break;
            default:
                ((Number) obj2).intValue();
                int iY3 = C0672b.y(this.f9304v | 1);
                A2.j(this.f9302t, this.f9301s, this.f9303u, (C0698o) obj, iY3);
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(l0.r rVar, C2 c10, C0554e2 c0554e2, int i10, int i11) {
        super(2);
        this.f9300r = i11;
        this.f9302t = rVar;
        this.f9301s = c10;
        this.f9303u = c0554e2;
        this.f9304v = i10;
    }
}
