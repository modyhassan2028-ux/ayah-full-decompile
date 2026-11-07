package G4;

import D.AbstractC0066i;
import D.C0076t;
import D.r;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.S;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.Locale;
import l0.o;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2803t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2805v;

    public /* synthetic */ c(E4.a aVar, p241y9.c cVar, int i10, p241y9.a aVar2) {
        this.f2801r = 0;
        this.f2804u = aVar;
        this.f2802s = cVar;
        this.f2803t = i10;
        this.f2805v = aVar2;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        boolean z10;
        o oVar;
        String str;
        S s10;
        C0698o c0698o;
        switch (this.f2801r) {
            case 0:
                E4.a aVar = (E4.a) this.f2804u;
                p241y9.c cVar = (p241y9.c) this.f2802s;
                p241y9.a aVar2 = (p241y9.a) this.f2805v;
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0076t c0076tA = r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
                    int i11 = c0698o2.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                    o oVar2 = o.f19333a;
                    l0.r rVarC = l0.a.c(c0698o2, oVar2);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i = C0287j.f4115b;
                    c0698o2.X();
                    if (c0698o2.f10720O) {
                        c0698o2.l(c0286i);
                    } else {
                        c0698o2.h0();
                    }
                    C0672b.v(c0698o2, c0076tA, C0287j.f4119f);
                    C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i11))) {
                        p123m2.c.y(i11, c0698o2, i11, c0285h);
                    }
                    C0672b.v(c0698o2, rVarC, C0287j.f4117d);
                    N3.a aVar3 = aVar.f1852i;
                    boolean z11 = aVar3 instanceof N3.b;
                    int i12 = this.f2803t;
                    S s11 = C0690k.f10683a;
                    if (z11) {
                        c0698o2.T(1047000901);
                        N3.b bVar = (N3.b) aVar3;
                        Locale localeA = p125m4.b.a();
                        p251z9.j.d(localeA, "arabicAwareLocale(...)");
                        boolean zG = c0698o2.g(cVar) | c0698o2.i(aVar) | c0698o2.e(i12);
                        Object objH = c0698o2.H();
                        if (zG || objH == s11) {
                            objH = new b(cVar, aVar, i12, 0);
                            c0698o2.e0(objH);
                        }
                        c0698o = c0698o2;
                        oVar = oVar2;
                        s10 = s11;
                        z10 = false;
                        P3.e.b(bVar, androidx.compose.foundation.a.c(oVar2, false, null, (p241y9.a) objH, 7), false, false, null, null, localeA, null, c0698o, 384, 184);
                        c0698o.p(false);
                        str = null;
                        i10 = 7;
                    } else {
                        i10 = 7;
                        z10 = false;
                        oVar = oVar2;
                        str = null;
                        s10 = s11;
                        c0698o = c0698o2;
                        if (aVar3 instanceof N3.c) {
                            c0698o.T(1047664022);
                            N3.c cVar2 = (N3.c) aVar3;
                            boolean zG2 = c0698o.g(cVar) | c0698o.i(aVar) | c0698o.e(i12);
                            Object objH2 = c0698o.H();
                            if (zG2 || objH2 == s10) {
                                objH2 = new b(cVar, aVar, i12, 1);
                                c0698o.e0(objH2);
                            }
                            P3.e.d(cVar2, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), null, false, false, c0698o, 24576, 12);
                        } else {
                            c0698o.T(1042774795);
                        }
                        c0698o.p(false);
                    }
                    String strM0 = p000a.a.m0(R.string.other_bookmark, c0698o);
                    String strM1 = p000a.a.m0(R.string.other_bookmark, c0698o);
                    long jL = ((p005a4.a) c0698o.k(p005a4.e.f11187a)).l();
                    boolean zG3 = c0698o.g(aVar2);
                    Object objH3 = c0698o.H();
                    if (zG3 || objH3 == s10) {
                        objH3 = new A5.c(2, aVar2);
                        c0698o.e0(objH3);
                    }
                    C0698o c0698o3 = c0698o;
                    p015b4.f.n(strM0, strM1, jL, androidx.compose.foundation.a.c(oVar, z10, str, (p241y9.a) objH3, i10), null, null, c0698o3, 0, 96);
                    c0698o3.p(true);
                } else {
                    c0698o2.N();
                }
                return y.f19095a;
            case 1:
                p241y9.c cVar3 = (p241y9.c) this.f2802s;
                E4.a aVar4 = (E4.a) this.f2804u;
                p241y9.c cVar4 = (p241y9.c) this.f2805v;
                C0698o c0698o4 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o4.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0076t c0076tA2 = r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o4, 0);
                    int i13 = c0698o4.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M2 = c0698o4.m();
                    o oVar3 = o.f19333a;
                    l0.r rVarC2 = l0.a.c(c0698o4, oVar3);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i2 = C0287j.f4115b;
                    c0698o4.X();
                    if (c0698o4.f10720O) {
                        c0698o4.l(c0286i2);
                    } else {
                        c0698o4.h0();
                    }
                    C0672b.v(c0698o4, c0076tA2, C0287j.f4119f);
                    C0672b.v(c0698o4, interfaceC0687i0M2, C0287j.f4118e);
                    C0285h c0285h2 = C0287j.g;
                    if (c0698o4.f10720O || !p251z9.j.a(c0698o4.H(), Integer.valueOf(i13))) {
                        p123m2.c.y(i13, c0698o4, i13, c0285h2);
                    }
                    C0672b.v(c0698o4, rVarC2, C0287j.f4117d);
                    String strM2 = p000a.a.m0(R.string.play, c0698o4);
                    boolean zG4 = c0698o4.g(cVar3);
                    int i14 = this.f2803t;
                    boolean zE = zG4 | c0698o4.e(i14) | c0698o4.i(aVar4);
                    Object objH4 = c0698o4.H();
                    S s12 = C0690k.f10683a;
                    if (zE || objH4 == s12) {
                        objH4 = new b(cVar3, i14, aVar4, 2);
                        c0698o4.e0(objH4);
                    }
                    l0.r rVarC3 = androidx.compose.foundation.a.c(oVar3, false, null, (p241y9.a) objH4, 7);
                    float f3 = 16;
                    p015b4.f.m(strM2, androidx.compose.foundation.layout.b.j(rVarC3, f3, 0.0f, 2), null, n.f2856b, c0698o4, 3072, 4);
                    String strM3 = p000a.a.m0(R.string.play_to, c0698o4);
                    boolean zG5 = c0698o4.g(cVar4) | c0698o4.i(aVar4);
                    Object objH5 = c0698o4.H();
                    if (zG5 || objH5 == s12) {
                        objH5 = new f(0, cVar4, aVar4);
                        c0698o4.e0(objH5);
                    }
                    p015b4.f.m(strM3, androidx.compose.foundation.layout.b.j(androidx.compose.foundation.a.c(oVar3, false, null, (p241y9.a) objH5, 7), f3, 0.0f, 2), null, n.f2857c, c0698o4, 3072, 4);
                    c0698o4.p(true);
                } else {
                    c0698o4.N();
                }
                return y.f19095a;
            case 2:
                ((Integer) obj2).getClass();
                X4.a.b((String) this.f2804u, (String) this.f2802s, (l0.r) this.f2805v, (C0698o) obj, C0672b.y(this.f2803t | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                p067g5.a.a((BookType) this.f2804u, (p241y9.a) this.f2805v, (l0.r) this.f2802s, (C0698o) obj, C0672b.y(this.f2803t | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                p157p5.c.d((String) this.f2804u, (p241y9.a) this.f2805v, (p241y9.a) this.f2802s, (C0698o) obj, C0672b.y(this.f2803t | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ c(Object obj, p241y9.a aVar, Object obj2, int i10, int i11) {
        this.f2801r = i11;
        this.f2804u = obj;
        this.f2805v = aVar;
        this.f2802s = obj2;
        this.f2803t = i10;
    }

    public /* synthetic */ c(String str, String str2, l0.r rVar, int i10) {
        this.f2801r = 2;
        this.f2804u = str;
        this.f2802s = str2;
        this.f2805v = rVar;
        this.f2803t = i10;
    }

    public /* synthetic */ c(p241y9.c cVar, int i10, E4.a aVar, p241y9.c cVar2) {
        this.f2801r = 1;
        this.f2802s = cVar;
        this.f2803t = i10;
        this.f2804u = aVar;
        this.f2805v = cVar2;
    }
}
