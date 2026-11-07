package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class X1 extends C0835k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.support.v4.media.session.r f14162s;

    public X1(android.support.v4.media.session.r rVar) {
        this.f14162s = rVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.C0835k, com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        android.support.v4.media.session.r rVar = this.f14162s;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    p185s8.u0.H(0, "getEventName", arrayList);
                    return new C0865q(((C0790b) rVar.f11365t).f14203a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    p185s8.u0.H(0, "getTimestamp", arrayList);
                    return new C0815g(Double.valueOf(((C0790b) rVar.f11365t).f14204b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    p185s8.u0.H(1, "getParamValue", arrayList);
                    String strH = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h();
                    HashMap map = ((C0790b) rVar.f11365t).f14205c;
                    return va.g.T(map.containsKey(strH) ? map.get(strH) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    p185s8.u0.H(0, "getParams", arrayList);
                    HashMap map2 = ((C0790b) rVar.f11365t).f14205c;
                    C0835k c0835k = new C0835k();
                    for (String str2 : map2.keySet()) {
                        c0835k.j(str2, va.g.T(map2.get(str2)));
                    }
                    return c0835k;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    p185s8.u0.H(2, "setParamValue", arrayList);
                    String strH2 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0)).h();
                    InterfaceC0850n interfaceC0850nC = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(1));
                    C0790b c0790b = (C0790b) rVar.f11365t;
                    Object objP = p185s8.u0.P(interfaceC0850nC);
                    HashMap map3 = c0790b.f14205c;
                    if (objP == null) {
                        map3.remove(strH2);
                        return interfaceC0850nC;
                    }
                    map3.put(strH2, C0790b.b(map3.get(strH2), objP, strH2));
                    return interfaceC0850nC;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    p185s8.u0.H(1, "setEventName", arrayList);
                    InterfaceC0850n interfaceC0850nC2 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) arrayList.get(0));
                    if (InterfaceC0850n.f14367i.equals(interfaceC0850nC2) || InterfaceC0850n.j.equals(interfaceC0850nC2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((C0790b) rVar.f11365t).f14203a = interfaceC0850nC2.h();
                    return new C0865q(interfaceC0850nC2.h());
                }
                break;
        }
        return super.g(str, aVar, arrayList);
    }
}
