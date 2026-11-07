package W;

import H0.InterfaceC0215n;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class q2 implements H0.I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q2 f9331b = new q2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q2 f9332c = new q2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9333a;

    public /* synthetic */ q2(int i10) {
        this.f9333a = i10;
    }

    public static final void d(ArrayList arrayList, p251z9.t tVar, H0.K k7, ArrayList arrayList2, ArrayList arrayList3, p251z9.t tVar2, ArrayList arrayList4, p251z9.t tVar3, p251z9.t tVar4) {
        float f3 = AbstractC0567i.f9169d;
        if (!arrayList.isEmpty()) {
            tVar.f24884r = k7.E(f3) + tVar.f24884r;
        }
        arrayList.add(0, p120l9.m.C0(arrayList2));
        arrayList3.add(Integer.valueOf(tVar2.f24884r));
        arrayList4.add(Integer.valueOf(tVar.f24884r));
        tVar.f24884r += tVar2.f24884r;
        tVar3.f24884r = Math.max(tVar3.f24884r, tVar4.f24884r);
        arrayList2.clear();
        tVar4.f24884r = 0;
        tVar2.f24884r = 0;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        ArrayList arrayList;
        float f3;
        int i10 = this.f9333a;
        p120l9.s sVar = p120l9.s.f19441r;
        int i11 = 0;
        switch (i10) {
            case 0:
                int size = list.size();
                while (i11 < size) {
                    H0.H h7 = (H0.H) list.get(i11);
                    if (p251z9.j.a(androidx.compose.ui.layout.a.a(h7), "Spacer")) {
                        H0.U uA = h7.a(p063g1.a.a(j, 0, k7.E(Y.s.g), 0, 0, 12));
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            Object obj = list.get(i12);
                            if (!p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj), "Spacer")) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int size3 = arrayList2.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            arrayList3.add(((H0.H) arrayList2.get(i13)).a(p063g1.a.a(j, 0, p063g1.a.h(j) / 2, 0, 0, 12)));
                        }
                        return k7.g0(p063g1.a.h(j), p063g1.a.g(j), sVar, new p2(arrayList3, uA, 0));
                    }
                    i11++;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                int size4 = list.size();
                while (i11 < size4) {
                    H0.H h10 = (H0.H) list.get(i11);
                    if (p251z9.j.a(androidx.compose.ui.layout.a.a(h10), "Spacer")) {
                        H0.U uA2 = h10.a(p063g1.a.a(j, 0, 0, 0, k7.E(Y.s.g), 3));
                        ArrayList arrayList4 = new ArrayList(list.size());
                        int size5 = list.size();
                        for (int i14 = 0; i14 < size5; i14++) {
                            Object obj2 = list.get(i14);
                            if (!p251z9.j.a(androidx.compose.ui.layout.a.a((H0.H) obj2), "Spacer")) {
                                arrayList4.add(obj2);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(arrayList4.size());
                        int size6 = arrayList4.size();
                        for (int i15 = 0; i15 < size6; i15++) {
                            arrayList5.add(((H0.H) arrayList4.get(i15)).a(p063g1.a.a(j, 0, 0, 0, p063g1.a.g(j) / 2, 3)));
                        }
                        return k7.g0(p063g1.a.h(j), p063g1.a.g(j), sVar, new p2(arrayList5, uA2, 1));
                    }
                    i11++;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                p251z9.t tVar = new p251z9.t();
                p251z9.t tVar2 = new p251z9.t();
                ArrayList arrayList9 = new ArrayList();
                p251z9.t tVar3 = new p251z9.t();
                int i16 = 0;
                p251z9.t tVar4 = new p251z9.t();
                float f7 = AbstractC0567i.f9168c;
                float f10 = AbstractC0567i.f9166a;
                int size7 = list.size();
                while (i16 < size7) {
                    int i17 = i16;
                    float f11 = f7;
                    H0.U uA3 = ((H0.H) list.get(i16)).a(j);
                    if (arrayList9.isEmpty()) {
                        f3 = f11;
                    } else {
                        ArrayList arrayList10 = arrayList6;
                        f3 = f11;
                        p251z9.t tVar5 = tVar2;
                        if (k7.E(f3) + tVar3.f24884r + uA3.f3168r <= p063g1.a.h(j)) {
                            tVar2 = tVar5;
                            arrayList6 = arrayList10;
                        } else {
                            tVar2 = tVar5;
                            arrayList6 = arrayList10;
                            d(arrayList6, tVar2, k7, arrayList9, arrayList7, tVar4, arrayList8, tVar, tVar3);
                        }
                    }
                    ArrayList arrayList11 = arrayList6;
                    if (!arrayList9.isEmpty()) {
                        tVar3.f24884r = k7.E(f3) + tVar3.f24884r;
                    }
                    arrayList9.add(uA3);
                    tVar3.f24884r += uA3.f3168r;
                    tVar4.f24884r = Math.max(tVar4.f24884r, uA3.f3169s);
                    i16 = i17 + 1;
                    f7 = f3;
                    arrayList6 = arrayList11;
                }
                ArrayList arrayList12 = arrayList6;
                if (arrayList9.isEmpty()) {
                    arrayList = arrayList12;
                } else {
                    float f12 = AbstractC0567i.f9166a;
                    arrayList = arrayList12;
                    d(arrayList, tVar2, k7, arrayList9, arrayList7, tVar4, arrayList8, tVar, tVar3);
                }
                int iMax = Math.max(tVar.f24884r, p063g1.a.j(j));
                int iMax2 = Math.max(tVar2.f24884r, p063g1.a.i(j));
                float f13 = AbstractC0567i.f9166a;
                return k7.g0(iMax, iMax2, sVar, new D.V(arrayList, k7, iMax, arrayList8));
        }
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f9333a;
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f9333a;
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f9333a;
        return p245z2.a.g(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f9333a;
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }
}
