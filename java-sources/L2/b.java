package L2;

import F2.A;
import F2.C0162g;
import F2.u;
import F2.z;
import H2.v;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f5448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5449t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f5450u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f5451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f5452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f5453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f5454y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z10, boolean z11, u uVar, p150o9.c cVar, p241y9.c cVar2, int i10) {
        super(2, cVar);
        this.f5447r = i10;
        this.f5451v = z10;
        this.f5452w = z11;
        this.f5453x = uVar;
        this.f5454y = cVar2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5447r) {
            case 0:
                b bVar = new b(this.f5451v, this.f5452w, this.f5453x, cVar, this.f5454y, 0);
                bVar.f5450u = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f5451v, this.f5452w, this.f5453x, cVar, this.f5454y, 1);
                bVar2.f5450u = obj;
                return bVar2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        A a9 = (A) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f5447r) {
            case 0:
                break;
        }
        return ((b) create(a9, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        z zVar;
        A a9;
        z zVar2;
        A a10;
        Object objE;
        A a11;
        Object objA;
        Object obj2;
        z zVar3;
        A a12;
        z zVar4;
        A a13;
        Object objE2;
        A a14;
        Object objA2;
        Object obj3;
        switch (this.f5447r) {
            case 0:
                int i10 = this.f5449t;
                p241y9.c cVar = this.f5454y;
                u uVar = this.f5453x;
                boolean z10 = this.f5452w;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    A a15 = (A) this.f5450u;
                    if (!this.f5451v) {
                        j.c(a15, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return cVar.e(((v) a15).c());
                    }
                    zVar = z10 ? z.f2341r : z.f2342s;
                    if (z10) {
                        z zVar5 = zVar;
                        a9 = a15;
                        zVar2 = zVar5;
                    } else {
                        this.f5450u = a15;
                        this.f5448s = zVar;
                        this.f5449t = 1;
                        Object objA3 = a15.a(this);
                        if (objA3 == aVar) {
                            return aVar;
                        }
                        a10 = a15;
                        obj = objA3;
                    }
                    a aVar2 = new a(0, null, cVar);
                    this.f5450u = a9;
                    this.f5448s = null;
                    this.f5449t = 3;
                    obj = a9.b(zVar2, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!z10) {
                        return obj;
                    }
                    this.f5450u = obj;
                    this.f5449t = 4;
                    objA = a9.a(this);
                    if (objA == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = objA;
                    if (((Boolean) obj).booleanValue()) {
                        return obj2;
                    }
                    uVar.d().a();
                    return obj2;
                }
                if (i10 == 1) {
                    zVar = this.f5448s;
                    a10 = (A) this.f5450u;
                    p110k9.a.e(obj);
                } else if (i10 == 2) {
                    zVar = this.f5448s;
                    a11 = (A) this.f5450u;
                    p110k9.a.e(obj);
                    zVar2 = zVar;
                    a9 = a11;
                    a aVar3 = new a(0, null, cVar);
                    this.f5450u = a9;
                    this.f5448s = null;
                    this.f5449t = 3;
                    obj = a9.b(zVar2, aVar3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!z10) {
                        return obj;
                    }
                    this.f5450u = obj;
                    this.f5449t = 4;
                    objA = a9.a(this);
                    if (objA == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = objA;
                } else if (i10 == 3) {
                    a9 = (A) this.f5450u;
                    p110k9.a.e(obj);
                    if (!z10) {
                        return obj;
                    }
                    this.f5450u = obj;
                    this.f5449t = 4;
                    objA = a9.a(this);
                    if (objA == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = objA;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj4 = this.f5450u;
                    p110k9.a.e(obj);
                    obj2 = obj4;
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                uVar.d().a();
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    zVar2 = zVar;
                    a9 = a10;
                } else {
                    C0162g c0162gD = uVar.d();
                    this.f5450u = a10;
                    this.f5448s = zVar;
                    this.f5449t = 2;
                    u uVar2 = c0162gD.f2277a;
                    if ((uVar2.g() && !uVar2.j()) || (objE = c0162gD.f2278b.e(this)) != aVar) {
                        objE = y.f19095a;
                    }
                    if (objE == aVar) {
                        return aVar;
                    }
                    a11 = a10;
                    zVar2 = zVar;
                    a9 = a11;
                }
                a aVar4 = new a(0, null, cVar);
                this.f5450u = a9;
                this.f5448s = null;
                this.f5449t = 3;
                obj = a9.b(zVar2, aVar4, this);
                if (obj == aVar) {
                    return aVar;
                }
                if (!z10) {
                    return obj;
                }
                this.f5450u = obj;
                this.f5449t = 4;
                objA = a9.a(this);
                if (objA == aVar) {
                    return aVar;
                }
                obj2 = obj;
                obj = objA;
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                uVar.d().a();
                return obj2;
            default:
                int i11 = this.f5449t;
                p241y9.c cVar2 = this.f5454y;
                u uVar3 = this.f5453x;
                boolean z11 = this.f5452w;
                p161p9.a aVar5 = p161p9.a.f21156r;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    A a16 = (A) this.f5450u;
                    if (!this.f5451v) {
                        j.c(a16, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return cVar2.e(((v) a16).c());
                    }
                    zVar3 = z11 ? z.f2341r : z.f2342s;
                    if (z11) {
                        z zVar6 = zVar3;
                        a12 = a16;
                        zVar4 = zVar6;
                    } else {
                        this.f5450u = a16;
                        this.f5448s = zVar3;
                        this.f5449t = 1;
                        Object objA4 = a16.a(this);
                        if (objA4 == aVar5) {
                            return aVar5;
                        }
                        a13 = a16;
                        obj = objA4;
                    }
                    a aVar6 = new a(1, null, cVar2);
                    this.f5450u = a12;
                    this.f5448s = null;
                    this.f5449t = 3;
                    obj = a12.b(zVar4, aVar6, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    if (!z11) {
                        return obj;
                    }
                    this.f5450u = obj;
                    this.f5449t = 4;
                    objA2 = a12.a(this);
                    if (objA2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = objA2;
                    if (((Boolean) obj).booleanValue()) {
                        return obj3;
                    }
                    uVar3.d().a();
                    return obj3;
                }
                if (i11 == 1) {
                    zVar3 = this.f5448s;
                    a13 = (A) this.f5450u;
                    p110k9.a.e(obj);
                } else if (i11 == 2) {
                    zVar3 = this.f5448s;
                    a14 = (A) this.f5450u;
                    p110k9.a.e(obj);
                    zVar4 = zVar3;
                    a12 = a14;
                    a aVar7 = new a(1, null, cVar2);
                    this.f5450u = a12;
                    this.f5448s = null;
                    this.f5449t = 3;
                    obj = a12.b(zVar4, aVar7, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    if (!z11) {
                        return obj;
                    }
                    this.f5450u = obj;
                    this.f5449t = 4;
                    objA2 = a12.a(this);
                    if (objA2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = objA2;
                } else if (i11 == 3) {
                    a12 = (A) this.f5450u;
                    p110k9.a.e(obj);
                    if (!z11) {
                        return obj;
                    }
                    this.f5450u = obj;
                    this.f5449t = 4;
                    objA2 = a12.a(this);
                    if (objA2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = objA2;
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj5 = this.f5450u;
                    p110k9.a.e(obj);
                    obj3 = obj5;
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                uVar3.d().a();
                return obj3;
                if (((Boolean) obj).booleanValue()) {
                    zVar4 = zVar3;
                    a12 = a13;
                } else {
                    C0162g c0162gD2 = uVar3.d();
                    this.f5450u = a13;
                    this.f5448s = zVar3;
                    this.f5449t = 2;
                    u uVar4 = c0162gD2.f2277a;
                    if ((uVar4.g() && !uVar4.j()) || (objE2 = c0162gD2.f2278b.e(this)) != aVar5) {
                        objE2 = y.f19095a;
                    }
                    if (objE2 == aVar5) {
                        return aVar5;
                    }
                    a14 = a13;
                    zVar4 = zVar3;
                    a12 = a14;
                }
                a aVar8 = new a(1, null, cVar2);
                this.f5450u = a12;
                this.f5448s = null;
                this.f5449t = 3;
                obj = a12.b(zVar4, aVar8, this);
                if (obj == aVar5) {
                    return aVar5;
                }
                if (!z11) {
                    return obj;
                }
                this.f5450u = obj;
                this.f5449t = 4;
                objA2 = a12.a(this);
                if (objA2 == aVar5) {
                    return aVar5;
                }
                obj3 = obj;
                obj = objA2;
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                uVar3.d().a();
                return obj3;
        }
    }
}
