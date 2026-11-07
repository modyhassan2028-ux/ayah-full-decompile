package O;

import W.A2;
import W.C0554e2;
import W.C0576l;
import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: O.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0438f extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f6367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6370v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0438f(Object obj, Object obj2, boolean z10, int i10, int i11) {
        super(2);
        this.f6366r = i11;
        this.f6369u = obj;
        this.f6370v = obj2;
        this.f6367s = z10;
        this.f6368t = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6366r;
        C0698o c0698o = (C0698o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                B9.a.e((l0.r) this.f6369u, (p241y9.a) this.f6370v, this.f6367s, c0698o, C0672b.y(this.f6368t | 1));
                break;
            case 1:
                p050e8.b.f(this.f6367s, (p055f1.j) this.f6369u, (N) this.f6370v, c0698o, C0672b.y(this.f6368t | 1));
                break;
            default:
                A2.b((C0576l) this.f6369u, (C0554e2) this.f6370v, this.f6367s, c0698o, C0672b.y(this.f6368t | 1));
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0438f(boolean z10, p055f1.j jVar, N n6, int i10) {
        super(2);
        this.f6366r = 1;
        this.f6367s = z10;
        this.f6369u = jVar;
        this.f6370v = n6;
        this.f6368t = i10;
    }
}
