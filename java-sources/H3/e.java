package H3;

import A.k1;
import H9.o;
import K9.AbstractC0405x;
import K9.H;
import T1.InterfaceC0488e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0488e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3351a = f.f3355c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X1.e f3352b = F3.a.f2345b;

    @Override // T1.InterfaceC0488e
    public final Object b(Object obj, k1 k1Var) {
        R9.e eVar = H.f5322a;
        return AbstractC0405x.I(R9.d.f7436t, new B2.d((X1.b) obj, this, null, 3), k1Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // T1.InterfaceC0488e
    public final Object c(Object obj, p150o9.c cVar) {
        String str = (String) ((X1.b) obj).c(this.f3352b);
        boolean z10 = false;
        if (str != null) {
            Set setKeySet = this.f3351a.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator it = setKeySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (o.V0(str, (String) it.next())) {
                        }
                    } else if (o.V0(str, "ru_mokhtasar")) {
                    }
                    z10 = true;
                }
            } else if (o.V0(str, "ru_mokhtasar")) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // T1.InterfaceC0488e
    public final void a() {
    }
}
