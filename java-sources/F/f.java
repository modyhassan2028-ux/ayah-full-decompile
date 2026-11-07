package F;

import Z.C0698o;
import android.graphics.Typeface;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p251z9.k implements p241y9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2049s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj) {
        super(4);
        this.f2048r = i10;
        this.f2049s = obj;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2048r) {
            case 0:
                C0153b c0153b = (C0153b) obj;
                ((Number) obj2).intValue();
                C0698o c0698o = (C0698o) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0698o.g(c0153b) ? 4 : 2;
                }
                if (c0698o.K(iIntValue & 1, (iIntValue & 131) != 130)) {
                    ((p074h0.d) this.f2049s).d(c0153b, c0698o, Integer.valueOf(iIntValue & 14));
                } else {
                    c0698o.N();
                }
                return p110k9.y.f19095a;
            case 1:
                int i10 = ((Y0.j) obj3).f10356a;
                int i11 = ((Y0.k) obj4).f10357a;
                p022c1.c cVar = (p022c1.c) this.f2049s;
                Y0.t tVarB = ((Y0.f) cVar.f13422e).b((Y0.e) obj, (Y0.l) obj2, i10, i11);
                if (tVarB instanceof Y0.t) {
                    Object obj5 = tVarB.f10372r;
                    p251z9.j.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(tVarB, cVar.j);
                cVar.j = rVar;
                Object obj6 = rVar.f11366u;
                p251z9.j.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                ((ViewStructure) this.f2049s).setDimens(iIntValue2, iIntValue3, 0, 0, ((Number) obj3).intValue() - iIntValue2, ((Number) obj4).intValue() - iIntValue3);
                return p110k9.y.f19095a;
        }
    }
}
