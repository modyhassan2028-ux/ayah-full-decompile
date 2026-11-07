package F;

import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f2050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2051s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p074h0.d dVar, int i10) {
        super(3);
        this.f2050r = dVar;
        this.f2051s = i10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0153b c0153b = (C0153b) obj;
        C0698o c0698o = (C0698o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0698o.g(c0153b) ? 4 : 2;
        }
        if (c0698o.K(iIntValue & 1, (iIntValue & 19) != 18)) {
            this.f2050r.i(c0153b, Integer.valueOf(this.f2051s), c0698o, Integer.valueOf(iIntValue & 14));
        } else {
            c0698o.N();
        }
        return p110k9.y.f19095a;
    }
}
