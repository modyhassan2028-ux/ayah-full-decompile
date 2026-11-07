package T1;

import N9.InterfaceC0415h;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S9.c f7664a = S9.d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p248z6.c f7665b = new p248z6.c(25, (byte) 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4.e f7666c = new C4.e(new F.x(2, null, 2));

    public c0(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // T1.M
    public final Object a(p241y9.e eVar, q9.c cVar) throws Throwable {
        b0 b0Var;
        S9.c cVar2;
        Throwable th;
        boolean z10;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i10 = b0Var.f7663v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b0Var.f7663v = i10 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object obj = b0Var.f7661t;
        int i11 = b0Var.f7663v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = b0Var.f7660s;
            cVar2 = b0Var.f7659r;
            try {
                p110k9.a.e(obj);
                if (z10) {
                    cVar2.b(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z10) {
                    cVar2.b(null);
                }
                throw th;
            }
        }
        p110k9.a.e(obj);
        S9.c cVar3 = this.f7664a;
        boolean zG = cVar3.g();
        try {
            Object objValueOf = Boolean.valueOf(zG);
            b0Var.f7659r = cVar3;
            b0Var.f7660s = zG;
            b0Var.f7663v = 1;
            Object objInvoke = eVar.invoke(objValueOf, b0Var);
            Object obj2 = p161p9.a.f21156r;
            if (objInvoke == obj2) {
                return obj2;
            }
            cVar2 = cVar3;
            obj = objInvoke;
            z10 = zG;
            if (z10) {
                cVar2.b(null);
            }
            return obj;
        } catch (Throwable th3) {
            cVar2 = cVar3;
            th = th3;
            z10 = zG;
            if (z10) {
                cVar2.b(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // T1.M
    public final Object b(p241y9.c cVar, q9.c cVar2) throws Throwable {
        a0 a0Var;
        S9.c cVar3;
        Throwable th;
        S9.a aVar;
        if (cVar2 instanceof a0) {
            a0Var = (a0) cVar2;
            int i10 = a0Var.f7658v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f7658v = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar2);
            }
        } else {
            a0Var = new a0(this, cVar2);
        }
        Object obj = a0Var.f7656t;
        int i11 = a0Var.f7658v;
        p161p9.a aVar2 = p161p9.a.f21156r;
        try {
            if (i11 == 0) {
                p110k9.a.e(obj);
                a0Var.f7654r = cVar;
                cVar3 = this.f7664a;
                a0Var.f7655s = cVar3;
                a0Var.f7658v = 1;
                if (cVar3.e(a0Var) != aVar2) {
                }
                return aVar2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (S9.a) a0Var.f7654r;
                try {
                    p110k9.a.e(obj);
                    aVar.b(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.b(null);
                    throw th;
                }
            }
            S9.c cVar4 = a0Var.f7655s;
            p241y9.c cVar5 = (p241y9.c) a0Var.f7654r;
            p110k9.a.e(obj);
            cVar3 = cVar4;
            cVar = cVar5;
            a0Var.f7654r = cVar3;
            a0Var.f7655s = null;
            a0Var.f7658v = 2;
            Object objE = cVar.e(a0Var);
            if (objE != aVar2) {
                S9.c cVar6 = cVar3;
                obj = objE;
                aVar = cVar6;
                aVar.b(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th3) {
            S9.c cVar7 = cVar3;
            th = th3;
            aVar = cVar7;
            aVar.b(null);
            throw th;
        }
    }

    @Override // T1.M
    public final InterfaceC0415h c() {
        return this.f7666c;
    }

    @Override // T1.M
    public final Object d(A a9) {
        return new Integer(((AtomicInteger) this.f7665b.f24847s).incrementAndGet());
    }

    @Override // T1.M
    public final Object e(q9.c cVar) {
        return new Integer(((AtomicInteger) this.f7665b.f24847s).get());
    }
}
