package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends AbstractC0820h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0902x2 f14504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f14505u;

    public w4(C0902x2 c0902x2) {
        super("require");
        this.f14505u = new HashMap();
        this.f14504t = c0902x2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0820h
    public final InterfaceC0850n a(Aa.a aVar, List list) {
        InterfaceC0850n interfaceC0850n;
        p185s8.u0.H(1, "require", list);
        String strH = ((C0879t) aVar.f555s).c(aVar, (InterfaceC0850n) list.get(0)).h();
        HashMap map = this.f14505u;
        if (map.containsKey(strH)) {
            return (InterfaceC0850n) map.get(strH);
        }
        HashMap map2 = (HashMap) this.f14504t.f14509r;
        if (map2.containsKey(strH)) {
            try {
                interfaceC0850n = (InterfaceC0850n) ((Callable) map2.get(strH)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strH)));
            }
        } else {
            interfaceC0850n = InterfaceC0850n.f14367i;
        }
        if (interfaceC0850n instanceof AbstractC0820h) {
            map.put(strH, (AbstractC0820h) interfaceC0850n);
        }
        return interfaceC0850n;
    }
}
