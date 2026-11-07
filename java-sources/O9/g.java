package O9;

import A.C0030l0;
import K9.AbstractC0405x;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0415h f6528u;

    public g(int i10, M9.a aVar, InterfaceC0415h interfaceC0415h, p150o9.h hVar) {
        super(hVar, i10, aVar);
        this.f6528u = interfaceC0415h;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[RETURN] */
    @Override // O9.e, N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        Object objD;
        int i10 = this.f6521s;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i10 == -3) {
            p150o9.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            D4.j jVar = new D4.j(7, (byte) 0);
            p150o9.h hVar = this.f6520r;
            p150o9.h hVarL = !((Boolean) hVar.F(bool, jVar)).booleanValue() ? context.L(hVar) : AbstractC0405x.m(context, hVar, false);
            if (p251z9.j.a(hVarL, context)) {
                Object objK = k(interfaceC0416i, cVar);
                if (objK == aVar) {
                    return objK;
                }
            } else {
                p150o9.d dVar = p150o9.d.f20379r;
                if (p251z9.j.a(hVarL.i(dVar), context.i(dVar))) {
                    p150o9.h context2 = cVar.getContext();
                    if (!(interfaceC0416i instanceof v) && !(interfaceC0416i instanceof r)) {
                        interfaceC0416i = new H2.i(interfaceC0416i, context2);
                    }
                    Object objC = c.c(hVarL, interfaceC0416i, P9.b.m(hVarL), new C0030l0(this, (p150o9.c) null, 29), cVar);
                    if (objC == aVar) {
                        return objC;
                    }
                } else {
                    objD = super.d(interfaceC0416i, cVar);
                    if (objD == aVar) {
                        return objD;
                    }
                }
            }
        } else {
            objD = super.d(interfaceC0416i, cVar);
            if (objD == aVar) {
                return objD;
            }
        }
        return p110k9.y.f19095a;
    }

    @Override // O9.e
    public final Object e(M9.s sVar, p150o9.c cVar) {
        Object objK = k(new v(sVar), cVar);
        return objK == p161p9.a.f21156r ? objK : p110k9.y.f19095a;
    }

    public abstract Object k(InterfaceC0416i interfaceC0416i, p150o9.c cVar);

    @Override // O9.e
    public final String toString() {
        return this.f6528u + " -> " + super.toString();
    }
}
