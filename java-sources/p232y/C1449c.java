package p232y;

import B.g;
import B.h;
import B.j;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p207v2.d0;
import p241y9.e;
import q9.i;

/* JADX INFO: renamed from: y.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1449c extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1450d f24479s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1449c(AbstractC1450d abstractC1450d, c cVar, int i10) {
        super(2, cVar);
        this.f24478r = i10;
        this.f24479s = abstractC1450d;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f24478r) {
            case 0:
                return new C1449c(this.f24479s, cVar, 0);
            default:
                return new C1449c(this.f24479s, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f24478r) {
            case 0:
                C1449c c1449c = (C1449c) create(interfaceC0402u, cVar);
                y yVar = y.f19095a;
                c1449c.invokeSuspend(yVar);
                return yVar;
            default:
                C1449c c1449c2 = (C1449c) create(interfaceC0402u, cVar);
                y yVar2 = y.f19095a;
                c1449c2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24478r) {
            case 0:
                a.e(obj);
                AbstractC1450d abstractC1450d = this.f24479s;
                if (abstractC1450d.R == null) {
                    g gVar = new g();
                    j jVar = abstractC1450d.f24484H;
                    if (jVar != null) {
                        AbstractC0405x.x(abstractC1450d.h0(), null, new d0(jVar, gVar, null, 4), 3);
                    }
                    abstractC1450d.R = gVar;
                }
                break;
            default:
                a.e(obj);
                AbstractC1450d abstractC1450d2 = this.f24479s;
                g gVar2 = abstractC1450d2.R;
                if (gVar2 != null) {
                    h hVar = new h(gVar2);
                    j jVar2 = abstractC1450d2.f24484H;
                    c cVar = null;
                    if (jVar2 != null) {
                        AbstractC0405x.x(abstractC1450d2.h0(), null, new d0(jVar2, hVar, cVar, 5), 3);
                    }
                    abstractC1450d2.R = null;
                }
                break;
        }
        return y.f19095a;
    }
}
