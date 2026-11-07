package P3;

import D.AbstractC0066i;
import D.C0076t;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.L0;
import Z.S;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l0.o;
import l0.r;
import p074h0.j;
import p110k9.y;
import p120l9.n;
import p232y.j0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f6616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f6617u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6618v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f6619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6620x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f6621y;

    public /* synthetic */ c(L0 l10, boolean z10, p241y9.c cVar, Locale locale, p241y9.c cVar2, p241y9.e eVar, p241y9.c cVar3, int i10) {
        this.f6614r = i10;
        this.f6615s = l10;
        this.f6616t = z10;
        this.f6617u = cVar;
        this.f6618v = locale;
        this.f6619w = cVar2;
        this.f6620x = eVar;
        this.f6621y = cVar3;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        r rVarC;
        o oVar;
        p241y9.e eVar;
        ArrayList arrayList;
        y yVar;
        boolean z11;
        r rVarC2;
        switch (this.f6614r) {
            case 0:
                L0 l10 = (L0) this.f6615s;
                p241y9.c cVar = (p241y9.c) this.f6617u;
                Locale locale = (Locale) this.f6618v;
                p241y9.c cVar2 = (p241y9.c) this.f6619w;
                p241y9.e eVar2 = (p241y9.e) this.f6620x;
                p241y9.c cVar3 = (p241y9.c) this.f6621y;
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p015b4.f.f(390, 2, c0698o, j.d(1097633507, new c(l10, this.f6616t, cVar, locale, cVar2, eVar2, cVar3, 1), c0698o), null, androidx.compose.foundation.layout.b.l(o.f19333a, 0.0f, 0.0f, 0.0f, 8, 7));
                } else {
                    c0698o.N();
                }
                return y.f19095a;
            case 1:
                L0 l11 = (L0) this.f6615s;
                p241y9.c cVar4 = (p241y9.c) this.f6617u;
                Locale locale2 = (Locale) this.f6618v;
                p241y9.c cVar5 = (p241y9.c) this.f6619w;
                p241y9.e eVar3 = (p241y9.e) this.f6620x;
                p241y9.c cVar6 = (p241y9.c) this.f6621y;
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zK = c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                y yVar2 = y.f19095a;
                if (!zK) {
                    c0698o2.N();
                    return yVar2;
                }
                j0 j0VarD = p181s2.r.d(c0698o2);
                o oVar2 = o.f19333a;
                r rVarE = p181s2.r.e(oVar2, j0VarD);
                C0076t c0076tA = D.r.a(AbstractC0066i.f979c, l0.c.f19309D, c0698o2, 0);
                int i10 = c0698o2.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
                r rVarC3 = l0.a.c(c0698o2, rVarE);
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
                if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i10))) {
                    p123m2.c.y(i10, c0698o2, i10, c0285h);
                }
                C0672b.v(c0698o2, rVarC3, C0287j.f4117d);
                c0698o2.T(-625023499);
                Iterable iterable = (Iterable) l11.getValue();
                ArrayList arrayList2 = new ArrayList(n.a0(iterable, 10));
                for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
                    N3.a aVar = (N3.a) it.next();
                    boolean z12 = this.f6616t;
                    S s10 = C0690k.f10683a;
                    if (z12) {
                        c0698o2.T(1626261154);
                        c0698o2.p(false);
                        rVarC = oVar2;
                        z10 = false;
                    } else {
                        c0698o2.T(1626261918);
                        boolean zG = c0698o2.g(cVar4) | c0698o2.g(aVar);
                        Object objH = c0698o2.H();
                        if (zG || objH == s10) {
                            objH = new G4.f(8, cVar4, aVar);
                            c0698o2.e0(objH);
                        }
                        z10 = false;
                        rVarC = androidx.compose.foundation.a.c(oVar2, false, null, (p241y9.a) objH, 7);
                        c0698o2.p(false);
                    }
                    if (aVar instanceof N3.b) {
                        c0698o2.T(-1125405136);
                        p251z9.j.b(locale2);
                        NumberFormat numberFormat = p125m4.b.f19615b;
                        p251z9.j.d(numberFormat, "getNumberFormatter(...)");
                        y yVar3 = yVar2;
                        r rVar = rVarC;
                        eVar = eVar3;
                        ArrayList arrayList3 = arrayList2;
                        boolean z13 = z10;
                        yVar = yVar3;
                        oVar = oVar2;
                        e.b((N3.b) aVar, rVar, false, z12, cVar5, eVar, locale2, numberFormat, c0698o2, 0, 4);
                        c0698o2.p(z13);
                        arrayList = arrayList3;
                    } else {
                        oVar = oVar2;
                        eVar = eVar3;
                        arrayList = arrayList2;
                        boolean z14 = z10;
                        yVar = yVar2;
                        if (aVar instanceof N3.c) {
                            c0698o2.T(-1124997300);
                            if (cVar6 == null) {
                                c0698o2.T(1626279618);
                                c0698o2.p(z14);
                                rVarC2 = oVar;
                            } else {
                                c0698o2.T(1626280835);
                                boolean zG2 = c0698o2.g(cVar6) | c0698o2.g(aVar);
                                Object objH2 = c0698o2.H();
                                if (zG2 || objH2 == s10) {
                                    objH2 = new G4.f(9, cVar6, (N3.c) aVar);
                                    c0698o2.e0(objH2);
                                }
                                rVarC2 = androidx.compose.foundation.a.c(oVar, z14, null, (p241y9.a) objH2, 7);
                                c0698o2.p(z14);
                            }
                            C0698o c0698o3 = c0698o2;
                            z11 = z14;
                            e.d((N3.c) aVar, rVarC2, eVar, z12, false, c0698o3, 0, 16);
                            c0698o2 = c0698o3;
                        } else {
                            z11 = z14;
                            c0698o2.T(-1127263896);
                        }
                        c0698o2.p(z11);
                    }
                    arrayList.add(yVar);
                    oVar2 = oVar;
                    yVar2 = yVar;
                    arrayList2 = arrayList;
                    eVar3 = eVar;
                    cVar4 = cVar4;
                }
                y yVar4 = yVar2;
                c0698o2.p(false);
                c0698o2.p(true);
                return yVar4;
            default:
                ((Integer) obj2).getClass();
                U5.a.a((List) this.f6615s, (p241y9.f) this.f6617u, (p241y9.a) this.f6619w, this.f6616t, (p241y9.a) this.f6621y, (p241y9.a) this.f6618v, (r) this.f6620x, (C0698o) obj, C0672b.y(196609));
                return y.f19095a;
        }
    }

    public /* synthetic */ c(List list, p241y9.f fVar, p241y9.a aVar, boolean z10, p241y9.a aVar2, p241y9.a aVar3, r rVar, int i10) {
        this.f6614r = 2;
        this.f6615s = list;
        this.f6617u = fVar;
        this.f6619w = aVar;
        this.f6616t = z10;
        this.f6621y = aVar2;
        this.f6618v = aVar3;
        this.f6620x = rVar;
    }
}
