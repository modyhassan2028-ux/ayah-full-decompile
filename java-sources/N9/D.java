package N9;

import K9.AbstractC0405x;
import android.os.Build;
import android.util.Log;
import java.util.List;
import p207v2.C1381t;

/* JADX INFO: loaded from: classes.dex */
public final class D extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f6084t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f6085u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6086v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(Object obj, p150o9.c cVar, int i10) {
        super(3, cVar);
        this.f6082r = i10;
        this.f6086v = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q9.i, y9.e] */
    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f6082r) {
            case 0:
                D d5 = new D((q9.i) this.f6086v, (p150o9.c) obj3);
                d5.f6084t = (InterfaceC0416i) obj;
                d5.f6085u = obj2;
                return d5.invokeSuspend(p110k9.y.f19095a);
            case 1:
                D d9 = new D((Q8.f0) this.f6086v, (p150o9.c) obj3, 1);
                d9.f6084t = (InterfaceC0416i) obj;
                d9.f6085u = (Throwable) obj2;
                return d9.invokeSuspend(p110k9.y.f19095a);
            case 2:
                D d10 = new D((p150o9.c) obj3, (p107k5.e) this.f6086v, 2);
                d10.f6084t = (InterfaceC0416i) obj;
                d10.f6085u = obj2;
                return d10.invokeSuspend(p110k9.y.f19095a);
            case 3:
                ((Boolean) obj2).getClass();
                D d11 = new D((C1381t) this.f6086v, (p150o9.c) obj3, 3);
                d11.f6085u = (p207v2.r) obj;
                return d11.invokeSuspend(p110k9.y.f19095a);
            default:
                D d12 = new D((p150o9.c) obj3, (C1381t) this.f6086v, 4);
                d12.f6084t = (InterfaceC0416i) obj;
                d12.f6085u = obj2;
                return d12.invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:72:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0174  */
    /* JADX WARN: Type inference failed for: r7v1, types: [q9.i, y9.e] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Exception {
        InterfaceC0416i interfaceC0416i;
        Object objInvoke;
        p207v2.r rVar;
        Object objA;
        F4.f fVar;
        p207v2.b0 b0Var;
        Object objE;
        p207v2.r rVar2;
        F4.f fVar2;
        List list;
        p207v2.b0 b0Var2;
        Integer num;
        p207v2.b0 b0Var3;
        Integer num2;
        p207v2.Z zA;
        Integer num3;
        Integer numValueOf;
        Integer num4;
        Integer num5;
        p207v2.Z zA2;
        Integer num6;
        Integer num7;
        p207v2.b0 b0Var4;
        int i10 = this.f6082r;
        int i11 = 3;
        p110k9.y yVar = p110k9.y.f19095a;
        p161p9.a aVar = p161p9.a.f21156r;
        Object obj2 = this.f6086v;
        p150o9.c cVar = null;
        switch (i10) {
            case 0:
                int i12 = this.f6083s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    interfaceC0416i = (InterfaceC0416i) this.f6084t;
                    Object obj3 = this.f6085u;
                    this.f6084t = interfaceC0416i;
                    this.f6083s = 1;
                    objInvoke = ((q9.i) obj2).invoke(obj3, this);
                    if (objInvoke != aVar) {
                    }
                    return aVar;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                interfaceC0416i = (InterfaceC0416i) this.f6084t;
                p110k9.a.e(obj);
                objInvoke = obj;
                this.f6084t = null;
                this.f6083s = 2;
                if (interfaceC0416i.b(objInvoke, this) != aVar) {
                    return yVar;
                }
                return aVar;
            case 1:
                int i13 = this.f6083s;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                InterfaceC0416i interfaceC0416i2 = (InterfaceC0416i) this.f6084t;
                Throwable th = (Throwable) this.f6085u;
                Q8.P pA = ((Q8.f0) obj2).f6985b.a(null);
                Q8.K k7 = new Q8.K(pA, null, null);
                Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + pA.f6906a);
                this.f6084t = null;
                this.f6083s = 1;
                return interfaceC0416i2.b(k7, this) == aVar ? aVar : yVar;
            case 2:
                p107k5.e eVar = (p107k5.e) obj2;
                int i14 = this.f6083s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                InterfaceC0416i interfaceC0416i3 = (InterfaceC0416i) this.f6084t;
                int iIntValue = ((Number) this.f6085u).intValue();
                p218w3.n nVar = eVar.f19028d;
                H2.j jVar = new H2.j(nVar.f23706b.f21517c, nVar.f23709e.f21552h, new p218w3.k(nVar, iIntValue, null));
                R9.e eVar2 = K9.H.f5322a;
                InterfaceC0415h interfaceC0415hS = AbstractC0419l.s(jVar, R9.d.f7436t);
                k0 k0Var = eVar.f19029e.g;
                W1.i iVar = new W1.i(i11, cVar, i11);
                this.f6084t = null;
                this.f6085u = null;
                this.f6083s = 1;
                if (interfaceC0416i3 instanceof m0) {
                    throw ((m0) interfaceC0416i3).f6221r;
                }
                Object objA2 = O9.c.a(interfaceC0416i3, this, new O(iVar, (p150o9.c) null), new InterfaceC0415h[]{interfaceC0415hS, k0Var});
                if (objA2 != aVar) {
                    objA2 = yVar;
                }
                if (objA2 != aVar) {
                    objA2 = yVar;
                }
                return objA2 == aVar ? aVar : yVar;
            case 3:
                C1381t c1381t = (C1381t) obj2;
                int i15 = this.f6083s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        rVar = (p207v2.r) this.f6085u;
                        p110k9.a.e(obj);
                        objA = obj;
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fVar2 = (F4.f) this.f6084t;
                        rVar2 = (p207v2.r) this.f6085u;
                        p110k9.a.e(obj);
                        objE = obj;
                    }
                    b0Var = (p207v2.b0) objE;
                    p207v2.r rVar3 = rVar2;
                    fVar = fVar2;
                    rVar = rVar3;
                    if (b0Var != null) {
                        list = b0Var.f23207a;
                    } else {
                        list = null;
                    }
                    if ((list != null || list.isEmpty()) && rVar != null && (b0Var2 = rVar.f23285b) != null && (!b0Var2.f23207a.isEmpty())) {
                    }
                    if (b0Var != null) {
                        num = b0Var.f23208b;
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        if (rVar != null || (b0Var4 = rVar.f23285b) == null) {
                            num7 = null;
                        } else {
                            num7 = b0Var4.f23208b;
                        }
                        if (num7 != null) {
                            b0Var = rVar.f23285b;
                        }
                    }
                    b0Var3 = b0Var;
                    if (b0Var3 == null) {
                        num4 = c1381t.f23293b;
                    } else {
                        switch (fVar.f2394b) {
                            case 0:
                                num2 = b0Var3.f23208b;
                                if (num2 == null || (zA = b0Var3.a(num2.intValue())) == null || (num3 = (Integer) zA.f23196s) == null) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(num3.intValue() - 1);
                                }
                                break;
                            default:
                                num5 = b0Var3.f23208b;
                                if (num5 == null || (zA2 = b0Var3.a(num5.intValue())) == null || (num6 = (Integer) zA2.f23196s) == null) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(num6.intValue() - 1);
                                }
                                break;
                        }
                        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                            String str = "Refresh key " + numValueOf + " returned from PagingSource " + fVar;
                            p251z9.j.e(str, "message");
                            Log.d("Paging", str, null);
                        }
                        num4 = numValueOf;
                    }
                    if (rVar != null) {
                        rVar.f23284a.f23140i.e(null);
                    }
                    if (rVar != null) {
                        rVar.f23286c.e(null);
                    }
                    return new p207v2.r(new p207v2.G(num4, fVar, c1381t.f23294c, (C4.e) c1381t.f23296e.f16734t, b0Var3, new F2.t(0, c1381t, C1381t.class, "refresh", "refresh()V", 0, 0, 22)), b0Var3, AbstractC0405x.c());
                }
                p110k9.a.e(obj);
                rVar = (p207v2.r) this.f6085u;
                F4.f fVar3 = rVar != null ? rVar.f23284a.f23134b : null;
                this.f6085u = rVar;
                this.f6083s = 1;
                objA = C1381t.a(c1381t, fVar3, this);
                if (objA == aVar) {
                    return aVar;
                }
                fVar = (F4.f) objA;
                if (rVar != null) {
                    p207v2.G g = rVar.f23284a;
                    this.f6085u = rVar;
                    this.f6084t = fVar;
                    this.f6083s = 2;
                    objE = g.e(this);
                    if (objE == aVar) {
                        return aVar;
                    }
                    rVar2 = rVar;
                    fVar2 = fVar;
                    b0Var = (p207v2.b0) objE;
                    p207v2.r rVar4 = rVar2;
                    fVar = fVar2;
                    rVar = rVar4;
                } else {
                    b0Var = null;
                }
                if (b0Var != null) {
                    list = b0Var.f23207a;
                } else {
                    list = null;
                }
                b0Var = list != null ? b0Var2 : b0Var2;
                if (b0Var != null) {
                    num = b0Var.f23208b;
                } else {
                    num = null;
                }
                if (num == null) {
                    if (rVar != null) {
                        num7 = null;
                    } else {
                        num7 = null;
                    }
                    if (num7 != null) {
                        b0Var = rVar.f23285b;
                    }
                }
                b0Var3 = b0Var;
                if (b0Var3 == null) {
                    num4 = c1381t.f23293b;
                } else {
                    switch (fVar.f2394b) {
                        case 0:
                            num2 = b0Var3.f23208b;
                            if (num2 == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = null;
                            }
                            break;
                        default:
                            num5 = b0Var3.f23208b;
                            if (num5 == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = null;
                            }
                            break;
                    }
                    if (Build.ID != null) {
                        String str2 = "Refresh key " + numValueOf + " returned from PagingSource " + fVar;
                        p251z9.j.e(str2, "message");
                        Log.d("Paging", str2, null);
                    }
                    num4 = numValueOf;
                }
                if (rVar != null) {
                    rVar.f23284a.f23140i.e(null);
                }
                if (rVar != null) {
                    rVar.f23286c.e(null);
                }
                return new p207v2.r(new p207v2.G(num4, fVar, c1381t.f23294c, (C4.e) c1381t.f23296e.f16734t, b0Var3, new F2.t(0, c1381t, C1381t.class, "refresh", "refresh()V", 0, 0, 22)), b0Var3, AbstractC0405x.c());
            default:
                C1381t c1381t2 = (C1381t) obj2;
                int i16 = this.f6083s;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                InterfaceC0416i interfaceC0416i4 = (InterfaceC0416i) this.f6084t;
                p207v2.r rVar5 = (p207v2.r) this.f6085u;
                p207v2.N n6 = new p207v2.N(new C0424q(rVar5.f23284a.j, new K4.b(2, null, 6), 2), new p085i0.n(c1381t2, c1381t2.f23296e), new p151p.V(rVar5.f23284a));
                this.f6083s = 1;
                return interfaceC0416i4.b(n6, this) == aVar ? aVar : yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(p150o9.c cVar, Object obj, int i10) {
        super(3, cVar);
        this.f6082r = i10;
        this.f6086v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(p241y9.e eVar, p150o9.c cVar) {
        super(3, cVar);
        this.f6082r = 0;
        this.f6086v = (q9.i) eVar;
    }
}
