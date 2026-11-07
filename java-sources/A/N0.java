package A;

import K9.AbstractC0405x;
import Z.C0698o;
import p251z9.C1472a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N0 extends C1472a implements p241y9.e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f101y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N0(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f101y = i12;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f101y) {
            case 0:
                long j = ((p063g1.q) obj).f16269a;
                S0 s10 = (S0) this.f24861r;
                AbstractC0405x.x(s10.R.c(), null, new O0(s10, j, null, 2), 3);
                break;
            default:
                int iIntValue = ((Number) obj2).intValue();
                ((p074h0.d) this.f24861r).b(iIntValue, (C0698o) obj);
                break;
        }
        return p110k9.y.f19095a;
    }
}
