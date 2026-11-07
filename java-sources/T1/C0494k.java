package T1;

import A.k1;

/* JADX INFO: renamed from: T1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0494k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S9.a f7694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p251z9.r f7695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f7696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f7697d;

    public C0494k(S9.a aVar, p251z9.r rVar, p251z9.v vVar, B b5) {
        this.f7694a = aVar;
        this.f7695b = rVar;
        this.f7696c = vVar;
        this.f7697d = b5;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(k1 k1Var, q9.c cVar) throws Throwable {
        C0493j c0493j;
        S9.a aVar;
        B b5;
        p251z9.r rVar;
        p251z9.v vVar;
        p241y9.e eVar;
        S9.a aVar2;
        S9.a aVar3;
        B b10;
        Object obj;
        if (cVar instanceof C0493j) {
            c0493j = (C0493j) cVar;
            int i10 = c0493j.f7693y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0493j.f7693y = i10 - Integer.MIN_VALUE;
            } else {
                c0493j = new C0493j(this, cVar);
            }
        } else {
            c0493j = new C0493j(this, cVar);
        }
        Object obj2 = c0493j.f7691w;
        int i11 = c0493j.f7693y;
        p161p9.a aVar4 = p161p9.a.f21156r;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj2);
                c0493j.f7686r = k1Var;
                aVar = this.f7694a;
                c0493j.f7687s = aVar;
                p251z9.r rVar2 = this.f7695b;
                c0493j.f7688t = rVar2;
                p251z9.v vVar2 = this.f7696c;
                c0493j.f7689u = vVar2;
                b5 = this.f7697d;
                c0493j.f7690v = b5;
                c0493j.f7693y = 1;
                if (aVar.e(c0493j) != aVar4) {
                    rVar = rVar2;
                    vVar = vVar2;
                    eVar = k1Var;
                }
                return aVar4;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0493j.f7688t;
                    vVar = (p251z9.v) c0493j.f7687s;
                    aVar2 = (S9.a) c0493j.f7686r;
                    try {
                        p110k9.a.e(obj2);
                        vVar.f24886r = obj;
                        Object obj3 = vVar.f24886r;
                        aVar2.b(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        aVar2.b(null);
                        throw th;
                    }
                }
                b10 = (B) c0493j.f7688t;
                vVar = (p251z9.v) c0493j.f7687s;
                aVar3 = (S9.a) c0493j.f7686r;
                try {
                    p110k9.a.e(obj2);
                    if (!p251z9.j.a(obj2, vVar.f24886r)) {
                        c0493j.f7686r = aVar3;
                        c0493j.f7687s = vVar;
                        c0493j.f7688t = obj2;
                        c0493j.f7693y = 3;
                        if (b10.k(obj2, false, c0493j) != aVar4) {
                            obj = obj2;
                            aVar2 = aVar3;
                            vVar.f24886r = obj;
                        }
                        return aVar4;
                    }
                    aVar2 = aVar3;
                    Object obj4 = vVar.f24886r;
                    aVar2.b(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    aVar2.b(null);
                    throw th;
                }
            }
            B b11 = c0493j.f7690v;
            vVar = c0493j.f7689u;
            rVar = (p251z9.r) c0493j.f7688t;
            S9.a aVar5 = (S9.a) c0493j.f7687s;
            p241y9.e eVar2 = (p241y9.e) c0493j.f7686r;
            p110k9.a.e(obj2);
            b5 = b11;
            eVar = eVar2;
            aVar = aVar5;
            if (rVar.f24882r) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = vVar.f24886r;
            c0493j.f7686r = aVar;
            c0493j.f7687s = vVar;
            c0493j.f7688t = b5;
            c0493j.f7689u = null;
            c0493j.f7690v = null;
            c0493j.f7693y = 2;
            Object objInvoke = eVar.invoke(obj5, c0493j);
            if (objInvoke != aVar4) {
                aVar3 = aVar;
                obj2 = objInvoke;
                b10 = b5;
                if (!p251z9.j.a(obj2, vVar.f24886r)) {
                    c0493j.f7686r = aVar3;
                    c0493j.f7687s = vVar;
                    c0493j.f7688t = obj2;
                    c0493j.f7693y = 3;
                    if (b10.k(obj2, false, c0493j) != aVar4) {
                        obj = obj2;
                        aVar2 = aVar3;
                        vVar.f24886r = obj;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = vVar.f24886r;
                aVar2.b(null);
                return obj6;
            }
            return aVar4;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.b(null);
            throw th;
        }
    }
}
