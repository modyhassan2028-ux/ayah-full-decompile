package J3;

import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import T1.InterfaceC0491h;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0491h f4307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0415h f4308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0415h f4309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0415h f4310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0415h f4311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0415h f4312f;
    public final InterfaceC0415h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0415h f4313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC0415h f4314i;
    public final InterfaceC0415h j;

    public x(InterfaceC0491h interfaceC0491h) {
        this.f4307a = interfaceC0491h;
        this.f4308b = AbstractC0419l.m(new C4.e(2, new C4.c(interfaceC0491h.b(), 3)));
        this.f4309c = AbstractC0419l.m(new C4.c(interfaceC0491h.b(), 4));
        this.f4310d = AbstractC0419l.m(new C4.c(interfaceC0491h.b(), 5));
        this.f4311e = AbstractC0419l.m(new C4.c(interfaceC0491h.b(), 6));
        this.f4312f = AbstractC0419l.m(new C4.e(3, new C4.c(interfaceC0491h.b(), 7)));
        this.g = AbstractC0419l.m(new C4.c(interfaceC0491h.b(), 8));
        this.f4313h = AbstractC0419l.m(new C4.c(interfaceC0491h.b(), 9));
        this.f4314i = AbstractC0419l.m(new C4.c(interfaceC0491h.b(), 1));
        this.j = AbstractC0419l.m(new C4.c(interfaceC0491h.b(), 2));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i10, q9.c cVar) {
        k kVar;
        List list;
        int iIntValue;
        B2.d dVar;
        int iIntValue2;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.f4270v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f4270v = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objP = kVar.f4268t;
        int i12 = kVar.f4270v;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i12 == 0) {
            p110k9.a.e(objP);
            kVar.f4266r = i10;
            kVar.f4270v = 1;
            objP = AbstractC0419l.p(this.f4312f, kVar);
            if (objP != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            i10 = kVar.f4266r;
            p110k9.a.e(objP);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(objP);
                return yVar;
            }
            i10 = kVar.f4266r;
            list = kVar.f4267s;
            p110k9.a.e(objP);
        }
        iIntValue = ((Number) objP).intValue();
        if (iIntValue != i10) {
            List listK = AbstractC0813f2.K(new Integer(iIntValue));
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                iIntValue2 = ((Number) obj).intValue();
                if (iIntValue2 == iIntValue && iIntValue2 != i10) {
                    arrayList.add(obj);
                }
            }
            dVar = new B2.d(p120l9.m.z0(4, p120l9.m.q0(listK, arrayList)), null, 6);
            kVar.f4267s = null;
            kVar.f4266r = i10;
            kVar.f4270v = 3;
            if (F9.n.t(this.f4307a, dVar, kVar) == aVar) {
                return aVar;
            }
        }
        return yVar;
        list = (List) objP;
        kVar.f4267s = list;
        kVar.f4266r = i10;
        kVar.f4270v = 2;
        objP = AbstractC0419l.p(this.g, kVar);
        if (objP != aVar) {
            iIntValue = ((Number) objP).intValue();
            if (iIntValue != i10) {
                List listK2 = AbstractC0813f2.K(new Integer(iIntValue));
                ArrayList arrayList2 = new ArrayList();
                while (r1.hasNext()) {
                    iIntValue2 = ((Number) obj).intValue();
                    if (iIntValue2 == iIntValue) {
                    }
                }
                dVar = new B2.d(p120l9.m.z0(4, p120l9.m.q0(listK2, arrayList2)), null, 6);
                kVar.f4267s = null;
                kVar.f4266r = i10;
                kVar.f4270v = 3;
                if (F9.n.t(this.f4307a, dVar, kVar) == aVar) {
                }
            }
            return yVar;
        }
        return aVar;
    }
}
