package O9;

import K9.o0;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p150o9.c[] f6517a = new p150o9.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P9.t f6518b = new P9.t("NULL", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P9.t f6519c = new P9.t("UNINITIALIZED", 0);

    public static final Object a(InterfaceC0416i interfaceC0416i, p150o9.c cVar, p241y9.f fVar, InterfaceC0415h[] interfaceC0415hArr) throws Throwable {
        n nVar = new n(interfaceC0416i, null, fVar, interfaceC0415hArr);
        o0 o0Var = new o0(cVar.getContext(), cVar, 1);
        Object objQ = va.g.Q(o0Var, true, o0Var, nVar);
        return objQ == p161p9.a.f21156r ? objQ : p110k9.y.f19095a;
    }

    public static /* synthetic */ InterfaceC0415h b(p pVar, p150o9.h hVar, int i10, M9.a aVar, int i11) {
        if ((i11 & 1) != 0) {
            hVar = p150o9.i.f20380r;
        }
        if ((i11 & 2) != 0) {
            i10 = -3;
        }
        if ((i11 & 4) != 0) {
            aVar = M9.a.f5830r;
        }
        return pVar.c(hVar, i10, aVar);
    }

    public static final Object c(p150o9.h hVar, Object obj, Object obj2, p241y9.e eVar, p150o9.c cVar) {
        Object objInvoke;
        Object objN = P9.b.n(hVar, obj2);
        try {
            w wVar = new w(cVar, hVar);
            if (p123m2.c.D(eVar)) {
                p251z9.y.b(2, eVar);
                objInvoke = eVar.invoke(obj, wVar);
            } else {
                objInvoke = AbstractC0813f2.U(eVar, obj, wVar);
            }
            P9.b.g(hVar, objN);
            if (objInvoke == p161p9.a.f21156r) {
                p251z9.j.e(cVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            P9.b.g(hVar, objN);
            throw th;
        }
    }
}
