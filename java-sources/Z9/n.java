package Z9;

import I1.F;
import Y9.T;
import Y9.U;
import Y9.i0;
import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final class n implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f11058a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f11059b;

    static {
        W9.d dVar = W9.d.f9667k;
        if (H9.o.e1("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((p042e0.j) U.f10486a.values()).iterator();
        while (((F) it).hasNext()) {
            U9.a aVar = (U9.a) ((p129m9.c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.d().b())) {
                throw new IllegalArgumentException(H9.p.I0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + p251z9.w.a(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f11059b = new T("kotlinx.serialization.json.JsonLiteral", dVar);
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        Double dValueOf;
        m mVar = (m) obj;
        p251z9.j.e(mVar, "value");
        String str = mVar.f11057s;
        B1.f(nVar);
        if (mVar.f11056r) {
            nVar.r(str);
            return;
        }
        Long lT0 = H9.v.T0(str);
        if (lT0 != null) {
            nVar.k(lT0.longValue());
            return;
        }
        p110k9.t tVarM = B1.M(str);
        if (tVarM != null) {
            nVar.h(i0.f10522b).k(tVarM.f19090r);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = H9.u.K0(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            nVar.e(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            nVar.b(bool.booleanValue());
        } else {
            nVar.r(str);
        }
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        i iVarH0 = B1.g(bVar).H0();
        if (iVarH0 instanceof m) {
            return (m) iVarH0;
        }
        throw p009aa.i.b("Unexpected JSON element, expected JsonLiteral, had " + p251z9.w.a(iVarH0.getClass()), iVarH0.toString(), -1);
    }

    @Override // U9.a
    public final W9.f d() {
        return f11059b;
    }
}
