package J3;

import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import T1.InterfaceC0491h;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0491h f4226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f4227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0415h f4228c;

    public B(InterfaceC0491h interfaceC0491h, x xVar) {
        p251z9.j.e(xVar, "preferencesStore");
        this.f4226a = interfaceC0491h;
        this.f4227b = xVar;
        this.f4228c = AbstractC0419l.m(new C4.e(4, new C4.g(interfaceC0491h.b(), this, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(B b5, q9.c cVar) {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f4317t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f4317t = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(b5, cVar);
            }
        } else {
            yVar = new y(b5, cVar);
        }
        Object objP = yVar.f4315r;
        int i11 = yVar.f4317t;
        if (i11 == 0) {
            p110k9.a.e(objP);
            InterfaceC0415h interfaceC0415h = b5.f4227b.f4309c;
            yVar.f4317t = 1;
            objP = AbstractC0419l.p(interfaceC0415h, yVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(objP);
        }
        return ((Boolean) objP).booleanValue() ? p120l9.m.l0(H3.f.f3353a, ",", null, null, null, 62) : p120l9.m.l0(H3.f.f3354b, ",", null, null, null, 62);
    }
}
