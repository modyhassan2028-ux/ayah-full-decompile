package H2;

import F2.A;
import F2.z;
import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import p110k9.y;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class u implements A, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f3335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p120l9.k f3337c = new p120l9.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3338d = new AtomicBoolean(false);

    public u(g gVar, boolean z10) {
        this.f3335a = gVar;
        this.f3336b = z10;
    }

    @Override // F2.A
    public final Object a(q9.i iVar) {
        if (this.f3338d.get()) {
            u0.F(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().i(a.f3247s);
        if (aVar != null && aVar.f3248r == this) {
            return Boolean.valueOf(!this.f3337c.isEmpty());
        }
        u0.F(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // F2.A
    public final Object b(z zVar, p241y9.e eVar, q9.i iVar) {
        if (this.f3338d.get()) {
            u0.F(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().i(a.f3247s);
        if (aVar != null && aVar.f3248r == this) {
            return g(zVar, eVar, iVar);
        }
        u0.F(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // H2.v
    public final Q2.a c() {
        return this.f3335a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // F2.m
    public final Object d(String str, p241y9.c cVar, q9.c cVar2) {
        t tVar;
        g gVar;
        u uVar;
        if (cVar2 instanceof t) {
            tVar = (t) cVar2;
            int i10 = tVar.f3334x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f3334x = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar2);
            }
        } else {
            tVar = new t(this, cVar2);
        }
        Object obj = tVar.f3332v;
        int i11 = tVar.f3334x;
        if (i11 == 0) {
            p110k9.a.e(obj);
            if (this.f3338d.get()) {
                u0.F(21, "Connection is recycled");
                throw null;
            }
            a aVar = (a) tVar.getContext().i(a.f3247s);
            if (aVar == null || aVar.f3248r != this) {
                u0.F(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            tVar.f3328r = this;
            tVar.f3329s = str;
            tVar.f3330t = cVar;
            gVar = this.f3335a;
            tVar.f3331u = gVar;
            tVar.f3334x = 1;
            Object objE = gVar.f3271s.e(tVar);
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (objE == aVar2) {
                return aVar2;
            }
            uVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g gVar2 = tVar.f3331u;
            cVar = tVar.f3330t;
            String str2 = tVar.f3329s;
            uVar = tVar.f3328r;
            p110k9.a.e(obj);
            gVar = gVar2;
            str = str2;
        }
        try {
            n nVar = new n(uVar, uVar.f3335a.a0(str));
            try {
                Object objE2 = cVar.e(nVar);
                p186s9.b.b(nVar, null);
                gVar.b(null);
                return objE2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p186s9.b.b(nVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            gVar.b(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(z zVar, q9.c cVar) {
        q qVar;
        g gVar;
        u uVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f3315w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f3315w = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.f3313u;
        int i11 = qVar.f3315w;
        if (i11 == 0) {
            p110k9.a.e(obj);
            qVar.f3310r = this;
            qVar.f3311s = zVar;
            gVar = this.f3335a;
            qVar.f3312t = gVar;
            qVar.f3315w = 1;
            Object objE = gVar.f3271s.e(qVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
            uVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g gVar2 = qVar.f3312t;
            z zVar2 = qVar.f3311s;
            uVar = qVar.f3310r;
            p110k9.a.e(obj);
            gVar = gVar2;
            zVar = zVar2;
        }
        try {
            p120l9.k kVar = uVar.f3337c;
            g gVar3 = uVar.f3335a;
            int i12 = kVar.f19438t;
            if (kVar.isEmpty()) {
                int iOrdinal = zVar.ordinal();
                if (iOrdinal == 0) {
                    u0.o(gVar3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    u0.o(gVar3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new A6.a();
                    }
                    u0.o(gVar3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                u0.o(gVar3, "SAVEPOINT '" + i12 + '\'');
            }
            kVar.addLast(new p(i12));
            y yVar = y.f19095a;
            gVar.b(null);
            return yVar;
        } catch (Throwable th) {
            gVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z10, q9.c cVar) {
        r rVar;
        g gVar;
        u uVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f3321w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f3321w = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f3319u;
        int i11 = rVar.f3321w;
        if (i11 == 0) {
            p110k9.a.e(obj);
            rVar.f3316r = this;
            gVar = this.f3335a;
            rVar.f3317s = gVar;
            rVar.f3318t = z10;
            rVar.f3321w = 1;
            Object objE = gVar.f3271s.e(rVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
            uVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = rVar.f3318t;
            gVar = rVar.f3317s;
            uVar = rVar.f3316r;
            p110k9.a.e(obj);
        }
        try {
            p120l9.k kVar = uVar.f3337c;
            g gVar2 = uVar.f3335a;
            if (kVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            p pVar = (p) p120l9.m.u0(kVar);
            if (z10) {
                pVar.getClass();
                if (kVar.isEmpty()) {
                    u0.o(gVar2, "END TRANSACTION");
                } else {
                    u0.o(gVar2, "RELEASE SAVEPOINT '" + pVar.f3309a + '\'');
                }
            } else if (kVar.isEmpty()) {
                u0.o(gVar2, "ROLLBACK TRANSACTION");
            } else {
                u0.o(gVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + pVar.f3309a + '\'');
            }
            y yVar = y.f19095a;
            gVar.b(null);
            return yVar;
        } catch (Throwable th) {
            gVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(z zVar, p241y9.e eVar, q9.c cVar) throws Throwable {
        s sVar;
        u uVar;
        u uVar2;
        int i10;
        SQLException e10;
        Throwable th;
        boolean z10;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i11 = sVar.f3327w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.f3327w = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objInvoke = sVar.f3325u;
        int i12 = sVar.f3327w;
        p161p9.a aVar = p161p9.a.f21156r;
        try {
            if (i12 == 0) {
                p110k9.a.e(objInvoke);
                if (zVar == null) {
                    zVar = z.f2341r;
                }
                sVar.f3322r = this;
                sVar.f3323s = (Serializable) eVar;
                sVar.f3327w = 1;
                if (e(zVar, sVar) != aVar) {
                    uVar = this;
                }
                return aVar;
            }
            if (i12 == 1) {
                eVar = (p241y9.e) sVar.f3323s;
                uVar = (u) sVar.f3322r;
                p110k9.a.e(objInvoke);
            } else {
                if (i12 != 2) {
                    if (i12 == 3 || i12 == 4) {
                        Object obj = sVar.f3322r;
                        p110k9.a.e(objInvoke);
                        return obj;
                    }
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) sVar.f3323s;
                    th = (Throwable) sVar.f3322r;
                    try {
                        p110k9.a.e(objInvoke);
                        throw th;
                    } catch (SQLException e11) {
                        e10 = e11;
                        if (th != null) {
                            throw e10;
                        }
                        p110k9.a.a(th, e10);
                        throw th;
                    }
                }
                i10 = sVar.f3324t;
                uVar2 = (u) sVar.f3322r;
                try {
                    p110k9.a.e(objInvoke);
                    z10 = i10 != 0;
                    sVar.f3322r = objInvoke;
                    sVar.f3327w = 3;
                    if (uVar2.f(z10, sVar) != aVar) {
                        return aVar;
                    }
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    uVar = uVar2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            sVar.f3322r = th;
                            sVar.f3323s = th3;
                            sVar.f3327w = 5;
                            if (uVar.f(false, sVar) != aVar) {
                                throw th3;
                            }
                        } catch (SQLException e12) {
                            e10 = e12;
                            th = th3;
                            if (th != null) {
                                throw e10;
                            }
                            p110k9.a.a(th, e10);
                            throw th;
                        }
                    }
                }
            }
            o oVar = new o(0, uVar);
            sVar.f3322r = uVar;
            sVar.f3323s = null;
            sVar.f3324t = 1;
            sVar.f3327w = 2;
            objInvoke = eVar.invoke(oVar, sVar);
            if (objInvoke != aVar) {
                uVar2 = uVar;
                i10 = 1;
                if (i10 != 0) {
                }
                sVar.f3322r = objInvoke;
                sVar.f3327w = 3;
                if (uVar2.f(z10, sVar) != aVar) {
                    return objInvoke;
                }
            }
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
