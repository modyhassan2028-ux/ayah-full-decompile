package Z9;

import com.google.android.gms.internal.measurement.B1;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f11068a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W9.g f11069b = u0.g("kotlinx.serialization.json.JsonPrimitive", W9.d.f9667k, new W9.f[0]);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        w wVar = (w) obj;
        p251z9.j.e(wVar, "value");
        B1.f(nVar);
        if (wVar instanceof p) {
            nVar.p(q.f11060a, p.INSTANCE);
        } else {
            nVar.p(n.f11058a, (m) wVar);
        }
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        i iVarH0 = B1.g(bVar).H0();
        if (iVarH0 instanceof w) {
            return (w) iVarH0;
        }
        throw p009aa.i.b("Unexpected JSON element, expected JsonPrimitive, had " + p251z9.w.a(iVarH0.getClass()), iVarH0.toString(), -1);
    }

    @Override // U9.a
    public final W9.f d() {
        return f11069b;
    }
}
