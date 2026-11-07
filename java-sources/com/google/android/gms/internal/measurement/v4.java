package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v4 extends AbstractC0820h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ L1 f14437v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(L1 l10, boolean z10, boolean z11) {
        super("log");
        this.f14437v = l10;
        this.f14435t = z10;
        this.f14436u = z11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.AbstractC0820h
    public final InterfaceC0850n a(Aa.a aVar, List list) {
        int i10;
        int i11;
        String strH;
        ArrayList arrayList;
        p185s8.u0.I(1, "log", list);
        int size = list.size();
        r rVar = InterfaceC0850n.f14367i;
        L1 l10 = this.f14437v;
        if (size == 1) {
            ((Z0.B) l10.f14065u).m(3, ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(0)).h(), Collections.EMPTY_LIST, this.f14435t, this.f14436u);
            return rVar;
        }
        InterfaceC0850n interfaceC0850n = (InterfaceC0850n) list.get(0);
        C0879t c0879t = (C0879t) aVar.f555s;
        C0879t c0879t2 = (C0879t) aVar.f555s;
        int iN = p185s8.u0.N(c0879t.c(aVar, interfaceC0850n).b().doubleValue());
        if (iN != 2) {
            i10 = 3;
            if (iN == 3) {
                i11 = 1;
            } else if (iN == 5) {
                i11 = 5;
            } else if (iN == 6) {
                i11 = 2;
            }
            strH = c0879t2.c(aVar, (InterfaceC0850n) list.get(1)).h();
            if (list.size() == 2) {
                ((Z0.B) l10.f14065u).m(i11, strH, Collections.EMPTY_LIST, this.f14435t, this.f14436u);
                return rVar;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(c0879t2.c(aVar, (InterfaceC0850n) list.get(i12)).h());
            }
            ((Z0.B) l10.f14065u).m(i11, strH, arrayList, this.f14435t, this.f14436u);
            return rVar;
        }
        i10 = 4;
        i11 = i10;
        strH = c0879t2.c(aVar, (InterfaceC0850n) list.get(1)).h();
        if (list.size() == 2) {
            ((Z0.B) l10.f14065u).m(i11, strH, Collections.EMPTY_LIST, this.f14435t, this.f14436u);
            return rVar;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(c0879t2.c(aVar, (InterfaceC0850n) list.get(i12)).h());
        }
        ((Z0.B) l10.f14065u).m(i11, strH, arrayList, this.f14435t, this.f14436u);
        return rVar;
    }
}
