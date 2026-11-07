package p068g6;

import D.X;
import F.C0153b;
import F9.n;
import W.AbstractC0542b2;
import W.C0604u1;
import Z.C0698o;
import com.ayah.R;
import p000a.a;
import p005a4.e;
import p110k9.y;
import p241y9.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16320r;

    public /* synthetic */ c(int i10) {
        this.f16320r = i10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f16320r) {
            case 0:
                C0698o c0698o = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j.e((X) obj, "$this$TextButton");
                if (c0698o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0542b2.b(a.m0(R.string.translation_tafsir, c0698o), androidx.compose.foundation.layout.c.f11826a, ((p005a4.a) c0698o.k(e.f11187a)).l(), n.B(18), null, null, 0L, null, 0L, 0, false, 0, 0, null, c0698o, 3120, 0, 131056);
                } else {
                    c0698o.N();
                }
                break;
            case 1:
                C0604u1 c0604u1 = (C0604u1) obj;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j.e(c0604u1, "sliderState");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? c0698o2.g(c0604u1) : c0698o2.i(c0604u1) ? 4 : 2;
                }
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p191t5.a.b(c0604u1, null, c0698o2, (iIntValue2 & 14) | 8);
                } else {
                    c0698o2.N();
                }
                break;
            default:
                C0698o c0698o3 = (C0698o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                j.e((C0153b) obj, "$this$item");
                if (c0698o3.K(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p015b4.f.j(R.string.notes, 0, c0698o3);
                } else {
                    c0698o3.N();
                }
                break;
        }
        return y.f19095a;
    }
}
