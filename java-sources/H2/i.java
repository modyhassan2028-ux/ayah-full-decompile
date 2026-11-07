package H2;

import A.C0039q;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import K9.a0;
import N9.A;
import N9.AbstractC0419l;
import N9.C0413f;
import N9.C0414g;
import N9.C0430x;
import N9.D;
import N9.InterfaceC0416i;
import N9.N;
import X.C0635g;
import X.C0640l;
import Z.C0673b0;
import Z.C0691k0;
import Z.X;
import java.io.Serializable;
import java.util.List;
import p020c.C0776a;
import p110k9.y;
import p207v2.AbstractC1367e;
import p207v2.C1365c;
import p207v2.C1366d;
import p223x.q0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3280t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f3281u;

    public /* synthetic */ i(Object obj, Serializable serializable, InterfaceC0416i interfaceC0416i, int i10) {
        this.f3278r = i10;
        this.f3280t = obj;
        this.f3281u = serializable;
        this.f3279s = interfaceC0416i;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0278  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:172:0x035f  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:212:0x0405  */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    /* JADX WARN: Type inference failed for: r10v25, types: [q9.i, y9.e] */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        h hVar;
        InterfaceC0416i interfaceC0416i;
        H3.c cVar2;
        C0413f c0413f;
        C0430x c0430x;
        i iVar;
        A a9;
        N n6;
        p251z9.v vVar;
        p251z9.v vVar2;
        i iVar2;
        InterfaceC0416i interfaceC0416i2;
        Object obj2;
        C0640l c0640l;
        i iVar3;
        C1365c c1365c;
        p251z9.v vVar3;
        p251z9.v vVar4;
        i iVar4;
        InterfaceC0416i interfaceC0416i3;
        Object obj3;
        C1366d c1366d;
        p251z9.v vVar5;
        i iVar5;
        switch (this.f3278r) {
            case 0:
                if (cVar instanceof h) {
                    hVar = (h) cVar;
                    int i10 = hVar.f3275s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        hVar.f3275s = i10 - Integer.MIN_VALUE;
                    } else {
                        hVar = new h(this, cVar);
                    }
                } else {
                    hVar = new h(this, cVar);
                }
                Object obj4 = hVar.f3274r;
                int i11 = hVar.f3275s;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC0416i = hVar.f3276t;
                        p110k9.a.e(obj4);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj4);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj4);
                InterfaceC0416i interfaceC0416i4 = (InterfaceC0416i) this.f3279s;
                F2.u uVar = (F2.u) this.f3280t;
                p241y9.c cVar3 = (p241y9.c) this.f3281u;
                hVar.f3276t = interfaceC0416i4;
                hVar.f3275s = 1;
                Object objR = B9.a.R(uVar, true, false, cVar3, hVar);
                if (objR == aVar) {
                    return aVar;
                }
                obj4 = objR;
                interfaceC0416i = interfaceC0416i4;
                hVar.f3276t = null;
                hVar.f3275s = 2;
                if (interfaceC0416i.b(obj4, hVar) == aVar) {
                    return aVar;
                }
                return y.f19095a;
            case 1:
                if (cVar instanceof H3.c) {
                    cVar2 = (H3.c) cVar;
                    int i12 = cVar2.f3344s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        cVar2.f3344s = i12 - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new H3.c(this, cVar);
                    }
                } else {
                    cVar2 = new H3.c(this, cVar);
                }
                Object obj5 = cVar2.f3343r;
                int i13 = cVar2.f3344s;
                if (i13 == 0) {
                    p110k9.a.e(obj5);
                    InterfaceC0416i interfaceC0416i5 = (InterfaceC0416i) this.f3279s;
                    Object objC = ((X1.b) obj).c((X1.e) this.f3280t);
                    if (objC == null) {
                        objC = this.f3281u;
                    }
                    cVar2.f3344s = 1;
                    Object objB = interfaceC0416i5.b(objC, cVar2);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj5);
                }
                return y.f19095a;
            case 2:
                p251z9.v vVar6 = (p251z9.v) this.f3281u;
                C0414g c0414g = (C0414g) this.f3280t;
                if (cVar instanceof C0413f) {
                    c0413f = (C0413f) cVar;
                    int i14 = c0413f.f6179t;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0413f.f6179t = i14 - Integer.MIN_VALUE;
                    } else {
                        c0413f = new C0413f(this, cVar);
                    }
                } else {
                    c0413f = new C0413f(this, cVar);
                }
                Object obj6 = c0413f.f6177r;
                int i15 = c0413f.f6179t;
                y yVar = y.f19095a;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj6);
                    return yVar;
                }
                p110k9.a.e(obj6);
                Object objE = c0414g.f6184s.e(obj);
                Object obj7 = vVar6.f24886r;
                if (obj7 != O9.c.f6518b && p251z9.j.a(obj7, objE)) {
                    return yVar;
                }
                vVar6.f24886r = objE;
                InterfaceC0416i interfaceC0416i6 = (InterfaceC0416i) this.f3279s;
                c0413f.f6179t = 1;
                Object objB2 = interfaceC0416i6.b(obj, c0413f);
                p161p9.a aVar3 = p161p9.a.f21156r;
                return objB2 == aVar3 ? aVar3 : yVar;
            case 3:
                if (cVar instanceof C0430x) {
                    c0430x = (C0430x) cVar;
                    int i16 = c0430x.f6263v;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c0430x.f6263v = i16 - Integer.MIN_VALUE;
                    } else {
                        c0430x = new C0430x(this, cVar);
                    }
                } else {
                    c0430x = new C0430x(this, cVar);
                }
                Object objInvoke = c0430x.f6261t;
                int i17 = c0430x.f6263v;
                y yVar2 = y.f19095a;
                p161p9.a aVar4 = p161p9.a.f21156r;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            obj = c0430x.f6260s;
                            iVar = c0430x.f6259r;
                            p110k9.a.e(objInvoke);
                        } else if (i17 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    p110k9.a.e(objInvoke);
                    return yVar2;
                }
                p110k9.a.e(objInvoke);
                if (((p251z9.r) this.f3280t).f24882r) {
                    InterfaceC0416i interfaceC0416i7 = (InterfaceC0416i) this.f3279s;
                    c0430x.f6263v = 1;
                    if (interfaceC0416i7.b(obj, c0430x) != aVar4) {
                        return yVar2;
                    }
                } else {
                    ?? r10 = (q9.i) this.f3281u;
                    c0430x.f6259r = this;
                    c0430x.f6260s = obj;
                    c0430x.f6263v = 2;
                    objInvoke = r10.invoke(obj, c0430x);
                    if (objInvoke != aVar4) {
                        iVar = this;
                    }
                }
                return aVar4;
                if (((Boolean) objInvoke).booleanValue()) {
                    return yVar2;
                }
                ((p251z9.r) iVar.f3280t).f24882r = true;
                InterfaceC0416i interfaceC0416i8 = (InterfaceC0416i) iVar.f3279s;
                c0430x.f6259r = null;
                c0430x.f6260s = null;
                c0430x.f6263v = 3;
                if (interfaceC0416i8.b(obj, c0430x) != aVar4) {
                    return yVar2;
                }
                return aVar4;
            case 4:
                InterfaceC0416i interfaceC0416i9 = (InterfaceC0416i) this.f3279s;
                if (cVar instanceof A) {
                    a9 = (A) cVar;
                    int i18 = a9.f6072t;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        a9.f6072t = i18 - Integer.MIN_VALUE;
                    } else {
                        a9 = new A(this, cVar);
                    }
                } else {
                    a9 = new A(this, cVar);
                }
                Object obj8 = a9.f6070r;
                int i19 = a9.f6072t;
                y yVar3 = y.f19095a;
                if (i19 != 0) {
                    if (i19 != 1 && i19 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj8);
                    return yVar3;
                }
                p110k9.a.e(obj8);
                p251z9.t tVar = (p251z9.t) this.f3280t;
                int i20 = tVar.f24884r + 1;
                tVar.f24884r = i20;
                p161p9.a aVar5 = p161p9.a.f21156r;
                if (i20 < 2) {
                    a9.f6072t = 1;
                    if (interfaceC0416i9.b(obj, a9) != aVar5) {
                        return yVar3;
                    }
                } else {
                    a9.f6072t = 2;
                    AbstractC0419l.d(interfaceC0416i9, obj, this.f3281u, a9);
                }
                return aVar5;
            case 5:
                if (cVar instanceof N) {
                    n6 = (N) cVar;
                    int i21 = n6.f6120v;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        n6.f6120v = i21 - Integer.MIN_VALUE;
                    } else {
                        n6 = new N(this, cVar);
                    }
                } else {
                    n6 = new N(this, cVar);
                }
                Object obj9 = n6.f6118t;
                int i22 = n6.f6120v;
                p161p9.a aVar6 = p161p9.a.f21156r;
                if (i22 != 0) {
                    if (i22 == 1) {
                        vVar2 = n6.f6117s;
                        iVar2 = n6.f6116r;
                        p110k9.a.e(obj9);
                    } else {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj9);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj9);
                vVar = (p251z9.v) this.f3280t;
                Object obj10 = vVar.f24886r;
                if (obj10 == O9.c.f6518b) {
                    iVar2 = this;
                } else {
                    L3.f fVar = (L3.f) this.f3281u;
                    n6.f6116r = this;
                    n6.f6117s = vVar;
                    n6.f6120v = 1;
                    Object objD = fVar.d(obj10, obj, n6);
                    if (objD == aVar6) {
                        return aVar6;
                    }
                    obj9 = objD;
                    vVar2 = vVar;
                    iVar2 = this;
                }
                vVar.f24886r = obj;
                interfaceC0416i2 = (InterfaceC0416i) iVar2.f3279s;
                obj2 = ((p251z9.v) iVar2.f3280t).f24886r;
                n6.f6116r = null;
                n6.f6117s = null;
                n6.f6120v = 2;
                if (interfaceC0416i2.b(obj2, n6) == aVar6) {
                    return aVar6;
                }
                return y.f19095a;
                Object obj11 = obj9;
                vVar = vVar2;
                obj = obj11;
                vVar.f24886r = obj;
                interfaceC0416i2 = (InterfaceC0416i) iVar2.f3279s;
                obj2 = ((p251z9.v) iVar2.f3280t).f24886r;
                n6.f6116r = null;
                n6.f6117s = null;
                n6.f6120v = 2;
                if (interfaceC0416i2.b(obj2, n6) == aVar6) {
                    return aVar6;
                }
                return y.f19095a;
            case 6:
                Object objC2 = O9.c.c((p150o9.h) this.f3279s, obj, this.f3280t, (O9.y) this.f3281u, cVar);
                return objC2 == p161p9.a.f21156r ? objC2 : y.f19095a;
            case 7:
                if (cVar instanceof C0640l) {
                    c0640l = (C0640l) cVar;
                    int i23 = c0640l.f9755v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c0640l.f9755v = i23 - Integer.MIN_VALUE;
                    } else {
                        c0640l = new C0640l(this, cVar);
                    }
                } else {
                    c0640l = new C0640l(this, cVar);
                }
                Object obj12 = c0640l.f9753t;
                int i24 = c0640l.f9755v;
                if (i24 == 0) {
                    p110k9.a.e(obj12);
                    a0 a0Var = (a0) ((p251z9.v) this.f3279s).f24886r;
                    if (a0Var != null) {
                        a0Var.e(new C0635g());
                        c0640l.f9751r = this;
                        c0640l.f9752s = obj;
                        c0640l.f9755v = 1;
                        Object objW = a0Var.w(c0640l);
                        p161p9.a aVar7 = p161p9.a.f21156r;
                        if (objW == aVar7) {
                            return aVar7;
                        }
                    }
                    iVar3 = this;
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0640l.f9752s;
                    iVar3 = c0640l.f9751r;
                    p110k9.a.e(obj12);
                }
                p251z9.v vVar7 = (p251z9.v) iVar3.f3279s;
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) iVar3.f3280t;
                vVar7.f24886r = AbstractC0405x.x(interfaceC0402u, null, new C0039q((p241y9.e) iVar3.f3281u, obj, interfaceC0402u, (p150o9.c) null), 1);
                return y.f19095a;
            case 8:
                C0776a c0776a = (C0776a) obj;
                if (((List) ((X) this.f3279s).getValue()).size() > 1) {
                    ((X) this.f3280t).setValue(Boolean.TRUE);
                    ((C0673b0) this.f3281u).h(c0776a.f13367c);
                }
                return y.f19095a;
            case 9:
                if (cVar instanceof C1365c) {
                    c1365c = (C1365c) cVar;
                    int i25 = c1365c.f23215v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        c1365c.f23215v = i25 - Integer.MIN_VALUE;
                    } else {
                        c1365c = new C1365c(this, cVar);
                    }
                } else {
                    c1365c = new C1365c(this, cVar);
                }
                Object obj13 = c1365c.f23213t;
                int i26 = c1365c.f23215v;
                p161p9.a aVar8 = p161p9.a.f21156r;
                if (i26 != 0) {
                    if (i26 == 1) {
                        vVar4 = c1365c.f23212s;
                        iVar4 = c1365c.f23211r;
                        p110k9.a.e(obj13);
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj13);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj13);
                vVar3 = (p251z9.v) this.f3280t;
                Object obj14 = vVar3.f24886r;
                if (obj14 == AbstractC1367e.f23227a) {
                    iVar4 = this;
                } else {
                    L3.f fVar2 = (L3.f) this.f3281u;
                    c1365c.f23211r = this;
                    c1365c.f23212s = vVar3;
                    c1365c.f23215v = 1;
                    Object objD2 = fVar2.d(obj14, obj, c1365c);
                    if (objD2 == aVar8) {
                        return aVar8;
                    }
                    obj13 = objD2;
                    vVar4 = vVar3;
                    iVar4 = this;
                }
                vVar3.f24886r = obj;
                interfaceC0416i3 = (InterfaceC0416i) iVar4.f3279s;
                obj3 = ((p251z9.v) iVar4.f3280t).f24886r;
                c1365c.f23211r = null;
                c1365c.f23212s = null;
                c1365c.f23215v = 2;
                if (interfaceC0416i3.b(obj3, c1365c) == aVar8) {
                    return aVar8;
                }
                return y.f19095a;
                Object obj15 = obj13;
                vVar3 = vVar4;
                obj = obj15;
                vVar3.f24886r = obj;
                interfaceC0416i3 = (InterfaceC0416i) iVar4.f3279s;
                obj3 = ((p251z9.v) iVar4.f3280t).f24886r;
                c1365c.f23211r = null;
                c1365c.f23212s = null;
                c1365c.f23215v = 2;
                if (interfaceC0416i3.b(obj3, c1365c) == aVar8) {
                    return aVar8;
                }
                return y.f19095a;
            case 10:
                if (cVar instanceof C1366d) {
                    c1366d = (C1366d) cVar;
                    int i27 = c1366d.f23222v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c1366d.f23222v = i27 - Integer.MIN_VALUE;
                    } else {
                        c1366d = new C1366d(this, cVar);
                    }
                } else {
                    c1366d = new C1366d(this, cVar);
                }
                Object obj16 = c1366d.f23220t;
                int i28 = c1366d.f23222v;
                p161p9.a aVar9 = p161p9.a.f21156r;
                if (i28 != 0) {
                    if (i28 == 1) {
                        vVar5 = c1366d.f23219s;
                        iVar5 = c1366d.f23218r;
                        p110k9.a.e(obj16);
                    } else {
                        if (i28 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj16);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj16);
                p251z9.v vVar8 = (p251z9.v) this.f3280t;
                D d5 = (D) this.f3281u;
                Object obj17 = vVar8.f24886r;
                c1366d.f23218r = this;
                c1366d.f23219s = vVar8;
                c1366d.f23222v = 1;
                Object objD3 = d5.d(obj17, obj, c1366d);
                if (objD3 == aVar9) {
                    return aVar9;
                }
                obj16 = objD3;
                vVar5 = vVar8;
                iVar5 = this;
                vVar5.f24886r = obj16;
                InterfaceC0416i interfaceC0416i10 = (InterfaceC0416i) iVar5.f3279s;
                Object obj18 = ((p251z9.v) iVar5.f3280t).f24886r;
                c1366d.f23218r = null;
                c1366d.f23219s = null;
                c1366d.f23222v = 2;
                if (interfaceC0416i10.b(obj18, c1366d) == aVar9) {
                    return aVar9;
                }
                return y.f19095a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                q0 q0Var = (q0) this.f3280t;
                ((C0691k0) this.f3279s).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((p241y9.e) ((X) this.f3281u).getValue()).invoke(q0Var.f24065a.i(), q0Var.f24068d.getValue())).booleanValue() : false));
                return y.f19095a;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.f3278r = i10;
        this.f3279s = obj;
        this.f3280t = obj2;
        this.f3281u = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(p251z9.r rVar, InterfaceC0416i interfaceC0416i, p241y9.e eVar) {
        this.f3278r = 3;
        this.f3280t = rVar;
        this.f3279s = interfaceC0416i;
        this.f3281u = (q9.i) eVar;
    }

    public i(p251z9.t tVar, InterfaceC0416i interfaceC0416i, Object obj) {
        this.f3278r = 4;
        this.f3280t = tVar;
        this.f3279s = interfaceC0416i;
        this.f3281u = obj;
    }

    public i(InterfaceC0416i interfaceC0416i, p150o9.h hVar) {
        this.f3278r = 6;
        this.f3279s = hVar;
        this.f3280t = P9.b.m(hVar);
        this.f3281u = new O9.y(interfaceC0416i, (p150o9.c) null, 0);
    }
}
