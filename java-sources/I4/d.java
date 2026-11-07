package I4;

import W.EnumC0565h1;
import W.P;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import Z.X;
import androidx.compose.foundation.layout.VerticalAlignElement;
import com.ayah.MainActivity;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3836v;

    public /* synthetic */ d(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f3832r = i10;
        this.f3833s = z10;
        this.f3834t = obj;
        this.f3835u = obj2;
        this.f3836v = obj3;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i10 = this.f3832r;
        y yVar = y.f19095a;
        Object obj4 = this.f3836v;
        Object obj5 = this.f3835u;
        Object obj6 = this.f3834t;
        switch (i10) {
            case 0:
                P p10 = (P) obj6;
                X x9 = (X) obj5;
                MainActivity mainActivity = (MainActivity) obj4;
                C0698o c0698o = (C0698o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i11 = AyahMenuWrapper.f13763v;
                j.e((D.P) obj, "it");
                if (!c0698o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c0698o.N();
                } else {
                    boolean z10 = this.f3833s;
                    boolean zH = c0698o.h(z10) | c0698o.g(p10);
                    Object objH = c0698o.H();
                    S s10 = C0690k.f10683a;
                    if (zH || objH == s10) {
                        objH = new f(z10, p10, x9, (p150o9.c) null);
                        c0698o.e0(objH);
                    }
                    C0672b.f(c0698o, yVar, (p241y9.e) objH);
                    if (((Boolean) x9.getValue()).booleanValue()) {
                        c0698o.T(1293101734);
                        if (p10.f8750a.b() == (z10 ? EnumC0565h1.f9160t : EnumC0565h1.f9158r)) {
                            c0698o.T(1293370318);
                            boolean zI = c0698o.i(mainActivity);
                            Object objH2 = c0698o.H();
                            if (zI || objH2 == s10) {
                                objH2 = new D3.b(mainActivity, null, 1);
                                c0698o.e0(objH2);
                            }
                            C0672b.f(c0698o, yVar, (p241y9.e) objH2);
                        } else {
                            c0698o.T(1287757086);
                        }
                        c0698o.p(false);
                    } else {
                        c0698o.T(1287757086);
                    }
                    c0698o.p(false);
                    boolean zI2 = c0698o.i(mainActivity);
                    Object objH3 = c0698o.H();
                    if (zI2 || objH3 == s10) {
                        objH3 = new e(mainActivity, 0);
                        c0698o.e0(objH3);
                    }
                    C0672b.d(yVar, (p241y9.c) objH3, c0698o);
                }
                break;
            default:
                String str = (String) obj6;
                N3.c cVar = (N3.c) obj5;
                p241y9.e eVar = (p241y9.e) obj4;
                D.X x10 = (D.X) obj;
                C0698o c0698o2 = (C0698o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                j.e(x10, "$this$TitleImageRow");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0698o2.g(x10) ? 4 : 2;
                }
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    c0698o2.N();
                } else {
                    boolean z11 = this.f3833s;
                    int i12 = (iIntValue2 & 14) | 1572864;
                    androidx.compose.animation.b.b(x10, !z11, null, null, null, null, P3.e.f6633d, c0698o2, i12, 30);
                    androidx.compose.animation.b.b(x10, z11, new VerticalAlignElement(), null, null, null, p074h0.j.d(4595450, new H4.g(str, cVar, eVar, 2), c0698o2), c0698o2, i12, 28);
                }
                break;
        }
        return yVar;
    }
}
