package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0845m extends AbstractC0820h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f14354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f14355u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Aa.a f14356v;

    public C0845m(C0845m c0845m) {
        super(c0845m.f14325r);
        ArrayList arrayList = new ArrayList(c0845m.f14354t.size());
        this.f14354t = arrayList;
        arrayList.addAll(c0845m.f14354t);
        ArrayList arrayList2 = new ArrayList(c0845m.f14355u.size());
        this.f14355u = arrayList2;
        arrayList2.addAll(c0845m.f14355u);
        this.f14356v = c0845m.f14356v;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0820h
    public final InterfaceC0850n a(Aa.a aVar, List list) {
        r rVar;
        Aa.a aVarQ = this.f14356v.Q();
        C0879t c0879t = (C0879t) aVarQ.f555s;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f14354t;
            int size = arrayList.size();
            rVar = InterfaceC0850n.f14367i;
            if (i11 >= size) {
                break;
            }
            if (i11 < list.size()) {
                aVarQ.T((String) arrayList.get(i11), ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(i11)));
            } else {
                aVarQ.T((String) arrayList.get(i11), rVar);
            }
            i11++;
        }
        ArrayList arrayList2 = this.f14355u;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            InterfaceC0850n interfaceC0850n = (InterfaceC0850n) obj;
            InterfaceC0850n interfaceC0850nC = c0879t.c(aVarQ, interfaceC0850n);
            if (interfaceC0850nC instanceof C0855o) {
                interfaceC0850nC = c0879t.c(aVarQ, interfaceC0850n);
            }
            if (interfaceC0850nC instanceof C0810f) {
                return ((C0810f) interfaceC0850nC).f14241r;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0820h, com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        return new C0845m(this);
    }

    public C0845m(String str, ArrayList arrayList, List list, Aa.a aVar) {
        super(str);
        this.f14354t = new ArrayList();
        this.f14356v = aVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.f14354t.add(((InterfaceC0850n) obj).h());
            }
        }
        this.f14355u = new ArrayList(list);
    }
}
