package com.google.android.gms.internal.measurement;

import i7.C1003n0;
import i7.CallableC0997l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class L1 extends AbstractC0820h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f14064t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f14065u;

    public L1(Z0.B b5) {
        super("internal.logger");
        this.f14065u = b5;
        this.f14326s.put("log", new v4(this, false, true));
        this.f14326s.put("silent", new C0892v2("silent", 1));
        ((AbstractC0820h) this.f14326s.get("silent")).j("log", new v4(this, true, true));
        this.f14326s.put("unmonitored", new C0892v2("unmonitored", 2));
        ((AbstractC0820h) this.f14326s.get("unmonitored")).j("log", new v4(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0820h
    public final InterfaceC0850n a(Aa.a aVar, List list) {
        TreeMap treeMap;
        switch (this.f14064t) {
            case 0:
                p185s8.u0.H(3, this.f14325r, list);
                String strH = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(0)).h();
                InterfaceC0850n interfaceC0850n = (InterfaceC0850n) list.get(1);
                C0879t c0879t = (C0879t) aVar.f555s;
                long jO = (long) p185s8.u0.O(c0879t.c(aVar, interfaceC0850n).b().doubleValue());
                InterfaceC0850n interfaceC0850nC = c0879t.c(aVar, (InterfaceC0850n) list.get(2));
                HashMap mapQ = interfaceC0850nC instanceof C0835k ? p185s8.u0.Q((C0835k) interfaceC0850nC) : new HashMap();
                android.support.v4.media.session.r rVar = (android.support.v4.media.session.r) this.f14065u;
                rVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapQ.keySet()) {
                    HashMap map2 = ((C0790b) rVar.f11364s).f14205c;
                    map.put(str, C0790b.b(map2.containsKey(str) ? map2.get(str) : null, mapQ.get(str), str));
                }
                ((ArrayList) rVar.f11366u).add(new C0790b(strH, jO, map));
                return InterfaceC0850n.f14367i;
            case 1:
                p185s8.u0.H(2, "getValue", list);
                InterfaceC0850n interfaceC0850nC2 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(0));
                InterfaceC0850n interfaceC0850nC3 = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(1));
                String strH2 = interfaceC0850nC2.h();
                p085i0.n nVar = (p085i0.n) this.f14065u;
                Map map3 = (Map) ((C1003n0) nVar.f16734t).f17478u.get((String) nVar.f16733s);
                String str2 = (map3 == null || !map3.containsKey(strH2)) ? null : (String) map3.get(strH2);
                return str2 != null ? new C0865q(str2) : interfaceC0850nC3;
            case 2:
                return InterfaceC0850n.f14367i;
            case 3:
                try {
                    return va.g.T(((CallableC0997l0) this.f14065u).call());
                } catch (Exception unused) {
                    return InterfaceC0850n.f14367i;
                }
            default:
                p185s8.u0.H(3, this.f14325r, list);
                ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(0)).h();
                InterfaceC0850n interfaceC0850n2 = (InterfaceC0850n) list.get(1);
                C0879t c0879t2 = (C0879t) aVar.f555s;
                InterfaceC0850n interfaceC0850nC4 = c0879t2.c(aVar, interfaceC0850n2);
                if (!(interfaceC0850nC4 instanceof C0845m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC0850n interfaceC0850nC5 = c0879t2.c(aVar, (InterfaceC0850n) list.get(2));
                if (!(interfaceC0850nC5 instanceof C0835k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C0835k c0835k = (C0835k) interfaceC0850nC5;
                HashMap map4 = c0835k.f14346r;
                if (!map4.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strH3 = c0835k.c("type").h();
                int iN = map4.containsKey("priority") ? p185s8.u0.N(c0835k.c("priority").b().doubleValue()) : 1000;
                C0879t c0879t3 = (C0879t) this.f14065u;
                C0845m c0845m = (C0845m) interfaceC0850nC4;
                c0879t3.getClass();
                if ("create".equals(strH3)) {
                    treeMap = (TreeMap) c0879t3.f14409b;
                } else {
                    if (!"edit".equals(strH3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strH3)));
                    }
                    treeMap = (TreeMap) c0879t3.f14408a;
                }
                if (treeMap.containsKey(Integer.valueOf(iN))) {
                    iN = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iN), c0845m);
                return InterfaceC0850n.f14367i;
        }
    }

    public L1(android.support.v4.media.session.r rVar) {
        super("internal.eventLogger");
        this.f14065u = rVar;
    }

    public L1(C0879t c0879t) {
        super("internal.registerCallback");
        this.f14065u = c0879t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(C0892v2 c0892v2, p085i0.n nVar) {
        super("getValue");
        this.f14065u = nVar;
    }

    public L1(CallableC0997l0 callableC0997l0) {
        super("internal.appMetadata");
        this.f14065u = callableC0997l0;
    }
}
