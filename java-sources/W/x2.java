package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f9455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J.d f9456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f9457t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0554e2 f9458u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f9459v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9460w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(boolean z10, J.d dVar, p241y9.a aVar, C0554e2 c0554e2, p074h0.d dVar2, int i10) {
        super(2);
        this.f9455r = z10;
        this.f9456s = dVar;
        this.f9457t = aVar;
        this.f9458u = c0554e2;
        this.f9459v = dVar2;
        this.f9460w = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        A2.h(this.f9455r, this.f9456s, this.f9457t, this.f9458u, this.f9459v, (C0698o) obj, C0672b.y(this.f9460w | 1));
        return p110k9.y.f19095a;
    }
}
