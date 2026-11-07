package I2;

import F2.A;
import F2.z;
import H2.o;
import H2.v;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements A, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3805a;

    public d(a aVar) {
        this.f3805a = aVar;
    }

    @Override // F2.A
    public final Object a(i iVar) {
        return Boolean.valueOf(this.f3805a.f3798r.z());
    }

    @Override // F2.A
    public final Object b(z zVar, p241y9.e eVar, i iVar) {
        return e(zVar, eVar, iVar);
    }

    @Override // H2.v
    public final Q2.a c() {
        return this.f3805a;
    }

    @Override // F2.m
    public final Object d(String str, p241y9.c cVar, q9.c cVar2) {
        g gVarA0 = this.f3805a.a0(str);
        try {
            Object objE = cVar.e(gVarA0);
            p186s9.b.b(gVarA0, null);
            return objE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p186s9.b.b(gVarA0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(z zVar, p241y9.e eVar, q9.c cVar) throws Throwable {
        c cVar2;
        Throwable th;
        R2.a aVar;
        d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f3804v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f3804v = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f3802t;
        int i11 = cVar2.f3804v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            R2.a aVar2 = this.f3805a.f3798r;
            aVar2.z();
            int iOrdinal = zVar.ordinal();
            if (iOrdinal == 0) {
                aVar2.x();
            } else if (iOrdinal == 1) {
                aVar2.M();
            } else {
                if (iOrdinal != 2) {
                    throw new A6.a();
                }
                aVar2.beginTransaction();
            }
            try {
                Object oVar = new o(1, this);
                cVar2.f3800r = this;
                cVar2.f3801s = aVar2;
                cVar2.f3804v = 1;
                Object objInvoke = eVar.invoke(oVar, cVar2);
                Object obj2 = p161p9.a.f21156r;
                if (objInvoke == obj2) {
                    return obj2;
                }
                obj = objInvoke;
                aVar = aVar2;
                dVar = this;
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar2;
                dVar = this;
                aVar.f();
                if (!aVar.z()) {
                    dVar.getClass();
                }
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = cVar2.f3801s;
            dVar = cVar2.f3800r;
            try {
                p110k9.a.e(obj);
            } catch (Throwable th3) {
                th = th3;
                aVar.f();
                if (!aVar.z()) {
                    dVar.getClass();
                }
                throw th;
            }
        }
        aVar.J();
        aVar.f();
        if (!aVar.z()) {
            dVar.getClass();
        }
        return obj;
    }
}
