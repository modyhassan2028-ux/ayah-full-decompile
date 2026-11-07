package W;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: renamed from: W.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0566h2 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f9162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f9163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f9164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9165u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0566h2(l0.r rVar, float f3, p074h0.d dVar, int i10) {
        super(2);
        this.f9162r = rVar;
        this.f9163s = f3;
        this.f9164t = dVar;
        this.f9165u = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = C0672b.y(this.f9165u | 1);
        A2.l(this.f9162r, this.f9163s, this.f9164t, (C0698o) obj, iY);
        return p110k9.y.f19095a;
    }
}
