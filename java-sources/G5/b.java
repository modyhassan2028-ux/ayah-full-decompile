package G5;

import K9.AbstractC0405x;
import N9.InterfaceC0416i;
import O9.m;
import p110k9.y;
import p120l9.u;
import p207v2.C1368f;
import p207v2.C1385x;
import p207v2.n0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2866t;

    public /* synthetic */ b(int i10, int i11, Object obj) {
        this.f2864r = i11;
        this.f2865s = obj;
        this.f2866t = i10;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x0152  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        a aVar;
        g gVar;
        p027c6.c cVar2;
        p027c6.d dVar;
        C1385x c1385x;
        m mVar;
        switch (this.f2864r) {
            case 0:
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i10 = aVar.f2862s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.f2862s = i10 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(this, cVar);
                    }
                } else {
                    aVar = new a(this, cVar);
                }
                Object obj2 = aVar.f2861r;
                int i11 = aVar.f2862s;
                if (i11 == 0) {
                    p110k9.a.e(obj2);
                    InterfaceC0416i interfaceC0416i = (InterfaceC0416i) this.f2865s;
                    if (((p124m3.d) obj).f19550b == this.f2866t) {
                        aVar.f2862s = 1;
                        Object objB = interfaceC0416i.b(obj, aVar);
                        p161p9.a aVar2 = p161p9.a.f21156r;
                        if (objB == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj2);
                }
                return y.f19095a;
            case 1:
                if (cVar instanceof g) {
                    gVar = (g) cVar;
                    int i12 = gVar.f2887s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        gVar.f2887s = i12 - Integer.MIN_VALUE;
                    } else {
                        gVar = new g(this, cVar);
                    }
                } else {
                    gVar = new g(this, cVar);
                }
                Object obj3 = gVar.f2886r;
                int i13 = gVar.f2887s;
                if (i13 == 0) {
                    p110k9.a.e(obj3);
                    InterfaceC0416i interfaceC0416i2 = (InterfaceC0416i) this.f2865s;
                    if (((p124m3.d) obj).f19550b == this.f2866t) {
                        gVar.f2887s = 1;
                        Object objB2 = interfaceC0416i2.b(obj, gVar);
                        p161p9.a aVar3 = p161p9.a.f21156r;
                        if (objB2 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj3);
                }
                return y.f19095a;
            case 2:
                if (cVar instanceof p027c6.c) {
                    cVar2 = (p027c6.c) cVar;
                    int i14 = cVar2.f13498s;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        cVar2.f13498s = i14 - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new p027c6.c(this, cVar);
                    }
                } else {
                    cVar2 = new p027c6.c(this, cVar);
                }
                Object obj4 = cVar2.f13497r;
                int i15 = cVar2.f13498s;
                if (i15 == 0) {
                    p110k9.a.e(obj4);
                    InterfaceC0416i interfaceC0416i3 = (InterfaceC0416i) this.f2865s;
                    if (((p124m3.d) obj).f19550b == this.f2866t) {
                        cVar2.f13498s = 1;
                        Object objB3 = interfaceC0416i3.b(obj, cVar2);
                        p161p9.a aVar4 = p161p9.a.f21156r;
                        if (objB3 == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj4);
                }
                return y.f19095a;
            case 3:
                if (cVar instanceof p027c6.d) {
                    dVar = (p027c6.d) cVar;
                    int i16 = dVar.f13501s;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        dVar.f13501s = i16 - Integer.MIN_VALUE;
                    } else {
                        dVar = new p027c6.d(this, cVar);
                    }
                } else {
                    dVar = new p027c6.d(this, cVar);
                }
                Object obj5 = dVar.f13500r;
                int i17 = dVar.f13501s;
                if (i17 == 0) {
                    p110k9.a.e(obj5);
                    InterfaceC0416i interfaceC0416i4 = (InterfaceC0416i) this.f2865s;
                    if (((p124m3.d) obj).f19550b == this.f2866t) {
                        dVar.f13501s = 1;
                        Object objB4 = interfaceC0416i4.b(obj, dVar);
                        p161p9.a aVar5 = p161p9.a.f21156r;
                        if (objB4 == aVar5) {
                            return aVar5;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj5);
                }
                return y.f19095a;
            case 4:
                if (cVar instanceof C1385x) {
                    c1385x = (C1385x) cVar;
                    int i18 = c1385x.f23310s;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c1385x.f23310s = i18 - Integer.MIN_VALUE;
                    } else {
                        c1385x = new C1385x(this, cVar);
                    }
                } else {
                    c1385x = new C1385x(this, cVar);
                }
                Object obj6 = c1385x.f23309r;
                int i19 = c1385x.f23310s;
                if (i19 == 0) {
                    p110k9.a.e(obj6);
                    InterfaceC0416i interfaceC0416i5 = (InterfaceC0416i) this.f2865s;
                    C1368f c1368f = new C1368f(this.f2866t, (n0) obj);
                    c1385x.f23310s = 1;
                    Object objB5 = interfaceC0416i5.b(c1368f, c1385x);
                    p161p9.a aVar6 = p161p9.a.f21156r;
                    if (objB5 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj6);
                }
                return y.f19095a;
            default:
                if (cVar instanceof m) {
                    mVar = (m) cVar;
                    int i20 = mVar.f6542t;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        mVar.f6542t = i20 - Integer.MIN_VALUE;
                    } else {
                        mVar = new m(this, cVar);
                    }
                } else {
                    mVar = new m(this, cVar);
                }
                Object obj7 = mVar.f6540r;
                int i21 = mVar.f6542t;
                p161p9.a aVar7 = p161p9.a.f21156r;
                if (i21 != 0) {
                    if (i21 == 1) {
                        p110k9.a.e(obj7);
                    } else {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj7);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj7);
                M9.e eVar = (M9.e) this.f2865s;
                u uVar = new u(this.f2866t, obj);
                mVar.f6542t = 1;
                if (eVar.d(uVar, mVar) == aVar7) {
                    return aVar7;
                }
                mVar.f6542t = 2;
                if (AbstractC0405x.K(mVar) == aVar7) {
                    return aVar7;
                }
                return y.f19095a;
        }
    }
}
