package P;

import B0.c;
import Z.C0672b;
import Z.C0698o;
import l0.r;
import p110k9.y;
import p241y9.e;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f6570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f6571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f6572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f6573u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, long j, float f3, float f7, int i10) {
        super(2);
        this.f6570r = rVar;
        this.f6571s = j;
        this.f6572t = f3;
        this.f6573u = f7;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = C0672b.y(385);
        c.a(this.f6570r, this.f6571s, this.f6572t, this.f6573u, (C0698o) obj, iY);
        return y.f19095a;
    }
}
