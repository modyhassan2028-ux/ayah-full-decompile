package X5;

import F.h;
import Z.C0690k;
import Z.C0698o;
import Z.X;
import java.util.ArrayList;
import java.util.Iterator;
import p110k9.y;
import p120l9.n;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f9978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f9979t;

    public /* synthetic */ c(X x9, p241y9.e eVar, int i10) {
        this.f9977r = i10;
        this.f9978s = x9;
        this.f9979t = eVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9977r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final X x9 = this.f9978s;
                    boolean zG = c0698o.g(x9);
                    final p241y9.e eVar = this.f9979t;
                    boolean zG2 = zG | c0698o.g(eVar);
                    Object objH = c0698o.H();
                    if (zG2 || objH == C0690k.f10683a) {
                        final int i10 = 0;
                        objH = new p241y9.c() { // from class: X5.d
                            @Override // p241y9.c
                            public final Object e(Object obj3) {
                                h hVar = (h) obj3;
                                switch (i10) {
                                    case 0:
                                        j.e(hVar, "$this$LazyColumn");
                                        hVar.a(null, null, a.f9973a);
                                        Iterable iterable = (Iterable) x9.getValue();
                                        ArrayList arrayList = new ArrayList(n.a0(iterable, 10));
                                        Iterator it = iterable.iterator();
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            y yVar = y.f19095a;
                                            if (!zHasNext) {
                                                return yVar;
                                            }
                                            hVar.a(null, null, new p074h0.d(-669959658, new A4.d(4, (V5.a) it.next(), eVar), true));
                                            arrayList.add(yVar);
                                        }
                                        break;
                                    default:
                                        j.e(hVar, "$this$LazyColumn");
                                        hVar.a(null, null, p229x5.a.f24379a);
                                        Iterable iterable2 = (Iterable) x9.getValue();
                                        ArrayList arrayList2 = new ArrayList(n.a0(iterable2, 10));
                                        Iterator it2 = iterable2.iterator();
                                        while (true) {
                                            boolean zHasNext2 = it2.hasNext();
                                            y yVar2 = y.f19095a;
                                            if (!zHasNext2) {
                                                return yVar2;
                                            }
                                            hVar.a(null, null, new p074h0.d(-1783703524, new A4.d(9, (p210v5.b) it2.next(), eVar), true));
                                            arrayList2.add(yVar2);
                                        }
                                        break;
                                }
                            }
                        };
                        c0698o.e0(objH);
                    }
                    B9.a.c(0, 511, null, null, null, null, c0698o, null, null, null, (p241y9.c) objH, false);
                } else {
                    c0698o.N();
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final X x10 = this.f9978s;
                    boolean zG3 = c0698o2.g(x10);
                    final p241y9.e eVar2 = this.f9979t;
                    boolean zG4 = zG3 | c0698o2.g(eVar2);
                    Object objH2 = c0698o2.H();
                    if (zG4 || objH2 == C0690k.f10683a) {
                        final int i11 = 1;
                        objH2 = new p241y9.c() { // from class: X5.d
                            @Override // p241y9.c
                            public final Object e(Object obj3) {
                                h hVar = (h) obj3;
                                switch (i11) {
                                    case 0:
                                        j.e(hVar, "$this$LazyColumn");
                                        hVar.a(null, null, a.f9973a);
                                        Iterable iterable = (Iterable) x10.getValue();
                                        ArrayList arrayList = new ArrayList(n.a0(iterable, 10));
                                        Iterator it = iterable.iterator();
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            y yVar = y.f19095a;
                                            if (!zHasNext) {
                                                return yVar;
                                            }
                                            hVar.a(null, null, new p074h0.d(-669959658, new A4.d(4, (V5.a) it.next(), eVar2), true));
                                            arrayList.add(yVar);
                                        }
                                        break;
                                    default:
                                        j.e(hVar, "$this$LazyColumn");
                                        hVar.a(null, null, p229x5.a.f24379a);
                                        Iterable iterable2 = (Iterable) x10.getValue();
                                        ArrayList arrayList2 = new ArrayList(n.a0(iterable2, 10));
                                        Iterator it2 = iterable2.iterator();
                                        while (true) {
                                            boolean zHasNext2 = it2.hasNext();
                                            y yVar2 = y.f19095a;
                                            if (!zHasNext2) {
                                                return yVar2;
                                            }
                                            hVar.a(null, null, new p074h0.d(-1783703524, new A4.d(9, (p210v5.b) it2.next(), eVar2), true));
                                            arrayList2.add(yVar2);
                                        }
                                        break;
                                }
                            }
                        };
                        c0698o2.e0(objH2);
                    }
                    B9.a.c(0, 511, null, null, null, null, c0698o2, null, null, null, (p241y9.c) objH2, false);
                } else {
                    c0698o2.N();
                }
                break;
        }
        return y.f19095a;
    }
}
