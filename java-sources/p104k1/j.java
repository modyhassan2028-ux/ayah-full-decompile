package p104k1;

import Z.C0698o;
import p110k9.y;
import p241y9.e;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f18924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f18925t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18926r;

    static {
        int i10 = 2;
        f18924s = new j(i10, 0);
        f18925t = new j(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11) {
        super(i10);
        this.f18926r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18926r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                }
                break;
        }
        return y.f19095a;
    }
}
