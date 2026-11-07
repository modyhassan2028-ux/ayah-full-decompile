package H4;

import E4.p;
import E4.q;
import E4.r;
import E4.s;
import E4.t;
import F.C0153b;
import F.h;
import X.L;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.L0;
import Z.S;
import Z.X;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.o;
import p110k9.y;
import p120l9.n;
import p207v2.C1363a;
import p207v2.C1370h;
import p207v2.C1371i;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f3381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3382x;

    public /* synthetic */ f(X x9, p106k4.a aVar, p241y9.f fVar, p241y9.f fVar2, p241y9.c cVar, p241y9.c cVar2) {
        this.f3376r = 2;
        this.f3382x = x9;
        this.f3378t = aVar;
        this.f3379u = fVar;
        this.f3380v = fVar2;
        this.f3381w = cVar;
        this.f3377s = cVar2;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f3376r) {
            case 0:
                t tVar = (t) this.f3378t;
                p217w2.b bVar = (p217w2.b) this.f3379u;
                p217w2.b bVar2 = (p217w2.b) this.f3380v;
                NumberFormat numberFormat = (NumberFormat) this.f3377s;
                p241y9.c cVar = (p241y9.c) this.f3381w;
                X x9 = (X) this.f3382x;
                h hVar = (h) obj;
                j.e(hVar, "$this$LazyColumn");
                hVar.a(null, null, new p074h0.d(1842198513, new g(tVar, numberFormat, cVar, 0), true));
                hVar.a(null, null, new p074h0.d(-1590735000, new A4.f(2, x9), true));
                va.g gVar = tVar != null ? tVar.f1885b : null;
                boolean z10 = gVar instanceof p;
                C1371i c1371i = C1371i.f23250b;
                if (z10) {
                    if (bVar != null) {
                        C0681f0 c0681f0 = bVar.f23640d;
                        p245z2.a.w(hVar, ((C1370h) bVar.f23639c.getValue()).b(), new p074h0.d(1900960189, new Y4.c(3, bVar, new d(cVar, tVar, 0)), true));
                        if (j.a(((C1363a) c0681f0.getValue()).f23201c, c1371i) || j.a(((C1363a) c0681f0.getValue()).f23199a, c1371i)) {
                            hVar.a(null, null, a.f3356a);
                        }
                    }
                } else if (gVar instanceof r) {
                    if (bVar2 != null) {
                        C0681f0 c0681f1 = bVar2.f23640d;
                        p245z2.a.w(hVar, ((C1370h) bVar2.f23639c.getValue()).b(), new p074h0.d(898860923, new b(bVar2, numberFormat, new d(cVar, tVar, 1), 0), true));
                        if (j.a(((C1363a) c0681f1.getValue()).f23201c, c1371i) || j.a(((C1363a) c0681f1.getValue()).f23199a, c1371i)) {
                            hVar.a(null, null, a.f3357b);
                        }
                    }
                } else if (gVar instanceof s) {
                    List list = ((s) gVar).f1883c;
                    d dVar = new d(cVar, tVar, 2);
                    j.e(list, "suras");
                    p245z2.a.w(hVar, list.size(), new p074h0.d(-9986741, new b(list, numberFormat, dVar, 1), true));
                } else if (!j.a(gVar, q.f1881c) && gVar != null) {
                    throw new A6.a();
                }
                hVar.a(null, null, a.f3358c);
                break;
            case 1:
                L0 l10 = (L0) this.f3378t;
                final String[] strArr = (String[]) this.f3379u;
                final List list2 = (List) this.f3380v;
                final NumberFormat numberFormat2 = (NumberFormat) this.f3377s;
                final p241y9.e eVar = (p241y9.e) this.f3381w;
                final p241y9.e eVar2 = (p241y9.e) this.f3382x;
                h hVar2 = (h) obj;
                j.e(hVar2, "$this$LazyColumn");
                Iterable iterable = (Iterable) l10.getValue();
                ArrayList arrayList = new ArrayList(n.a0(iterable, 10));
                Iterator it = iterable.iterator();
                final int i10 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    y yVar = y.f19095a;
                    if (!zHasNext) {
                        return yVar;
                    }
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC0813f2.T();
                        throw null;
                    }
                    final J4.e eVar3 = (J4.e) next;
                    hVar2.a(null, null, new p074h0.d(-1108241009, new p241y9.f() { // from class: M4.b
                        @Override // p241y9.f
                        public final Object d(Object obj2, Object obj3, Object obj4) {
                            C0698o c0698o = (C0698o) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            p251z9.j.e((C0153b) obj2, "$this$item");
                            if (c0698o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                                final J4.e eVar4 = eVar3;
                                if (eVar4 instanceof J4.b) {
                                    c0698o.T(132282196);
                                    p015b4.f.j(R.string.contents, 0, c0698o);
                                    c0698o.p(false);
                                } else if (eVar4 instanceof J4.a) {
                                    c0698o.T(132284757);
                                    B1.c(((J4.a) eVar4).f4323a.f19568b, 0, c0698o);
                                    c0698o.p(false);
                                } else {
                                    boolean z11 = eVar4 instanceof J4.d;
                                    String[] strArr2 = strArr;
                                    List list3 = list2;
                                    int i12 = i10;
                                    NumberFormat numberFormat3 = numberFormat2;
                                    S s10 = C0690k.f10683a;
                                    o oVar = o.f19333a;
                                    if (z11) {
                                        c0698o.T(-194050330);
                                        p124m3.a aVar = ((J4.d) eVar4).f4326a;
                                        String str = strArr2[aVar.f19528b - 1];
                                        p251z9.j.d(str, "get(...)");
                                        boolean zContains = list3.contains(Integer.valueOf(i12));
                                        p251z9.j.b(numberFormat3);
                                        final p241y9.e eVar5 = eVar;
                                        boolean zG = c0698o.g(eVar5) | c0698o.g(eVar4);
                                        Object objH = c0698o.H();
                                        if (zG || objH == s10) {
                                            final int i13 = 0;
                                            objH = new p241y9.a() { // from class: M4.c
                                                @Override // p241y9.a
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            J4.d dVar2 = (J4.d) eVar4;
                                                            eVar5.invoke(Integer.valueOf(dVar2.f4326a.f19528b), Integer.valueOf(dVar2.f4326a.a().f19541b));
                                                            break;
                                                        default:
                                                            J4.c cVar2 = (J4.c) eVar4;
                                                            eVar5.invoke(Integer.valueOf(cVar2.f4325a.g.f19585a), Integer.valueOf(cVar2.f4325a.g.c()));
                                                            break;
                                                    }
                                                    return y.f19095a;
                                                }
                                            };
                                            c0698o.e0(objH);
                                        }
                                        p050e8.b.e(aVar, str, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH, 7), zContains, numberFormat3, c0698o, 0);
                                        c0698o.p(false);
                                    } else {
                                        if (!(eVar4 instanceof J4.c)) {
                                            c0698o.T(132281316);
                                            c0698o.p(false);
                                            throw new A6.a();
                                        }
                                        c0698o.T(-193611711);
                                        p124m3.h hVar3 = ((J4.c) eVar4).f4325a;
                                        String str2 = strArr2[hVar3.g.f19595m - 1];
                                        p251z9.j.d(str2, "get(...)");
                                        boolean zContains2 = list3.contains(Integer.valueOf(i12));
                                        p251z9.j.b(numberFormat3);
                                        final p241y9.e eVar6 = eVar2;
                                        boolean zG2 = c0698o.g(eVar6) | c0698o.g(eVar4);
                                        Object objH2 = c0698o.H();
                                        if (zG2 || objH2 == s10) {
                                            final int i14 = 1;
                                            objH2 = new p241y9.a() { // from class: M4.c
                                                @Override // p241y9.a
                                                public final Object invoke() {
                                                    switch (i14) {
                                                        case 0:
                                                            J4.d dVar2 = (J4.d) eVar4;
                                                            eVar6.invoke(Integer.valueOf(dVar2.f4326a.f19528b), Integer.valueOf(dVar2.f4326a.a().f19541b));
                                                            break;
                                                        default:
                                                            J4.c cVar2 = (J4.c) eVar4;
                                                            eVar6.invoke(Integer.valueOf(cVar2.f4325a.g.f19585a), Integer.valueOf(cVar2.f4325a.g.c()));
                                                            break;
                                                    }
                                                    return y.f19095a;
                                                }
                                            };
                                            c0698o.e0(objH2);
                                        }
                                        AbstractC0813f2.i(hVar3, str2, androidx.compose.foundation.a.c(oVar, false, null, (p241y9.a) objH2, 7), zContains2, numberFormat3, c0698o, 0);
                                        c0698o.p(false);
                                    }
                                }
                            } else {
                                c0698o.N();
                            }
                            return y.f19095a;
                        }
                    }, true));
                    arrayList.add(yVar);
                    i10 = i11;
                }
                break;
            default:
                X x10 = (X) this.f3382x;
                p106k4.a aVar = (p106k4.a) this.f3378t;
                p241y9.f fVar = (p241y9.f) this.f3379u;
                p241y9.f fVar2 = (p241y9.f) this.f3380v;
                p241y9.c cVar2 = (p241y9.c) this.f3381w;
                p241y9.c cVar3 = (p241y9.c) this.f3377s;
                h hVar3 = (h) obj;
                j.e(hVar3, "$this$LazyColumn");
                List list3 = (List) x10.getValue();
                hVar3.f2052a.a(list3.size(), new android.support.v4.media.session.r(new L(7, new p026c5.a(5), list3), new p026c5.e(0, list3), new p074h0.d(-1091073711, new p026c5.f(list3, aVar, fVar, fVar2, cVar2, cVar3, x10), true), 6));
                hVar3.a(null, null, p026c5.b.f13468d);
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, NumberFormat numberFormat, p110k9.e eVar, Object obj4, int i10) {
        this.f3376r = i10;
        this.f3378t = obj;
        this.f3379u = obj2;
        this.f3380v = obj3;
        this.f3377s = numberFormat;
        this.f3381w = eVar;
        this.f3382x = obj4;
    }
}
