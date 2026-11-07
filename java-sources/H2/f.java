package H2;

import A.C0030l0;
import K9.AbstractC0405x;
import U6.C0532j;
import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f3265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f3266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ThreadLocal f3267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f3268u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f3269v;

    public f(M.k kVar) {
        this.f3267t = new ThreadLocal();
        this.f3268u = new AtomicBoolean(false);
        int i10 = I9.a.f3852u;
        this.f3269v = p017b7.g.s0(30, I9.c.SECONDS);
        m mVar = new m(1, new B3.f(2, kVar));
        this.f3265r = mVar;
        this.f3266s = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x0154 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #2 {all -> 0x01a6, blocks: (B:63:0x012b, B:68:0x0149, B:70:0x0154, B:84:0x01aa, B:85:0x01b1), top: B:110:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:76:0x018e A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:74:0x0188, B:76:0x018e, B:78:0x019a, B:80:0x019e), top: B:108:0x0188 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #2 {all -> 0x01a6, blocks: (B:63:0x012b, B:68:0x0149, B:70:0x0154, B:84:0x01aa, B:85:0x01b1), top: B:110:0x012b }] */
    @Override // H2.b
    public final Object C(boolean z10, p241y9.e eVar, q9.c cVar) {
        e eVar2;
        p251z9.v vVar;
        Throwable th;
        m mVar;
        m mVar2;
        p150o9.h hVar;
        f fVar;
        p241y9.e eVar3;
        p251z9.v vVar2;
        boolean z11;
        Object obj;
        p251z9.v vVar3;
        u uVar;
        g gVar;
        boolean z12 = z10;
        if (cVar instanceof e) {
            eVar2 = (e) cVar;
            int i10 = eVar2.f3255A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f3255A = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(this, cVar);
            }
        } else {
            eVar2 = new e(this, cVar);
        }
        Object objI = eVar2.f3263y;
        int i11 = eVar2.f3255A;
        p150o9.c cVar2 = null;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(objI);
            if (this.f3268u.get()) {
                u0.F(21, "Connection pool is closed");
                throw null;
            }
            ThreadLocal threadLocal = this.f3267t;
            u uVar2 = (u) threadLocal.get();
            C0532j c0532j = a.f3247s;
            if (uVar2 == null) {
                a aVar2 = (a) eVar2.getContext().i(c0532j);
                uVar2 = aVar2 != null ? aVar2.f3248r : null;
            }
            if (uVar2 == null) {
                m mVar3 = z12 ? this.f3265r : this.f3266s;
                vVar = new p251z9.v();
                try {
                    p150o9.h context = eVar2.getContext();
                    long j = this.f3269v;
                    d dVar = new d(0, this, z12);
                    eVar2.f3256r = this;
                    eVar2.f3257s = (Serializable) eVar;
                    eVar2.f3258t = mVar3;
                    eVar2.f3259u = vVar;
                    eVar2.f3260v = context;
                    eVar2.f3261w = vVar;
                    eVar2.f3262x = z12;
                    eVar2.f3255A = 3;
                    Object objB = mVar3.b(j, dVar, eVar2);
                    if (objB != aVar) {
                        mVar2 = mVar3;
                        objI = objB;
                        hVar = context;
                        fVar = this;
                        eVar3 = eVar;
                        vVar2 = vVar;
                        g gVar2 = (g) objI;
                        gVar2.getClass();
                        p251z9.j.e(hVar, "context");
                        gVar2.f3272t = hVar;
                        gVar2.f3273u = new Throwable();
                        if (fVar.f3265r == fVar.f3266s) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        vVar2.f24886r = new u(gVar2, z11);
                        obj = vVar.f24886r;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        u uVar3 = (u) obj;
                        a aVar3 = new a(uVar3);
                        ThreadLocal threadLocal2 = fVar.f3267t;
                        p251z9.j.e(threadLocal2, "<this>");
                        p150o9.h hVarZ = Y2.a.Z(aVar3, new P9.v(uVar3, threadLocal2));
                        C0030l0 c0030l0 = new C0030l0(eVar3, vVar, null, 13);
                        eVar2.f3256r = mVar2;
                        eVar2.f3257s = vVar;
                        eVar2.f3258t = null;
                        eVar2.f3259u = null;
                        eVar2.f3260v = null;
                        eVar2.f3261w = null;
                        eVar2.f3255A = 4;
                        objI = AbstractC0405x.I(hVarZ, c0030l0, eVar2);
                        if (objI != aVar) {
                            vVar3 = vVar;
                            mVar = mVar2;
                            uVar = (u) vVar3.f24886r;
                            if (uVar != null) {
                                gVar = uVar.f3335a;
                                if (uVar.f3338d.compareAndSet(false, true)) {
                                    u0.o(gVar, "ROLLBACK TRANSACTION");
                                }
                                gVar.f3272t = null;
                                gVar.f3273u = null;
                                mVar.e(gVar);
                            }
                            return objI;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mVar = mVar3;
                }
            } else {
                if (!z12 && uVar2.f3336b) {
                    u0.F(1, "Cannot upgrade connection from reader to writer");
                    throw null;
                }
                if (eVar2.getContext().i(c0532j) == null) {
                    a aVar4 = new a(uVar2);
                    p251z9.j.e(threadLocal, "<this>");
                    p150o9.h hVarZ2 = Y2.a.Z(aVar4, new P9.v(uVar2, threadLocal));
                    C0030l0 c0030l1 = new C0030l0(eVar, uVar2, cVar2, 12);
                    eVar2.f3255A = 1;
                    Object objI2 = AbstractC0405x.I(hVarZ2, c0030l1, eVar2);
                    if (objI2 != aVar) {
                        return objI2;
                    }
                } else {
                    eVar2.f3255A = 2;
                    Object objInvoke = eVar.invoke(uVar2, eVar2);
                    if (objInvoke != aVar) {
                        return objInvoke;
                    }
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            p110k9.a.e(objI);
            return objI;
        }
        if (i11 == 2) {
            p110k9.a.e(objI);
            return objI;
        }
        if (i11 == 3) {
            z12 = eVar2.f3262x;
            vVar2 = eVar2.f3261w;
            p150o9.h hVar2 = eVar2.f3260v;
            p251z9.v vVar4 = eVar2.f3259u;
            m mVar4 = eVar2.f3258t;
            eVar3 = (p241y9.e) eVar2.f3257s;
            f fVar2 = (f) eVar2.f3256r;
            try {
                p110k9.a.e(objI);
                hVar = hVar2;
                vVar = vVar4;
                fVar = fVar2;
                mVar2 = mVar4;
                try {
                    g gVar3 = (g) objI;
                    gVar3.getClass();
                    p251z9.j.e(hVar, "context");
                    gVar3.f3272t = hVar;
                    gVar3.f3273u = new Throwable();
                    if (fVar.f3265r == fVar.f3266s && z12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    vVar2.f24886r = new u(gVar3, z11);
                    obj = vVar.f24886r;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    u uVar4 = (u) obj;
                    a aVar5 = new a(uVar4);
                    ThreadLocal threadLocal3 = fVar.f3267t;
                    p251z9.j.e(threadLocal3, "<this>");
                    p150o9.h hVarZ3 = Y2.a.Z(aVar5, new P9.v(uVar4, threadLocal3));
                    C0030l0 c0030l2 = new C0030l0(eVar3, vVar, null, 13);
                    eVar2.f3256r = mVar2;
                    eVar2.f3257s = vVar;
                    eVar2.f3258t = null;
                    eVar2.f3259u = null;
                    eVar2.f3260v = null;
                    eVar2.f3261w = null;
                    eVar2.f3255A = 4;
                    objI = AbstractC0405x.I(hVarZ3, c0030l2, eVar2);
                    if (objI != aVar) {
                        vVar3 = vVar;
                        mVar = mVar2;
                        uVar = (u) vVar3.f24886r;
                        if (uVar != null) {
                            gVar = uVar.f3335a;
                            if (uVar.f3338d.compareAndSet(false, true)) {
                                u0.o(gVar, "ROLLBACK TRANSACTION");
                            }
                            gVar.f3272t = null;
                            gVar.f3273u = null;
                            mVar.e(gVar);
                        }
                        return objI;
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    mVar = mVar2;
                }
            } catch (Throwable th4) {
                th = th4;
                vVar = vVar4;
                mVar = mVar4;
            }
        } else {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar3 = (p251z9.v) eVar2.f3257s;
            mVar = (m) eVar2.f3256r;
            try {
                p110k9.a.e(objI);
                try {
                    uVar = (u) vVar3.f24886r;
                    if (uVar != null) {
                        gVar = uVar.f3335a;
                        if (uVar.f3338d.compareAndSet(false, true)) {
                            try {
                                u0.o(gVar, "ROLLBACK TRANSACTION");
                            } catch (SQLException unused) {
                            }
                        }
                        gVar.f3272t = null;
                        gVar.f3273u = null;
                        mVar.e(gVar);
                    }
                } catch (Throwable unused2) {
                }
                return objI;
            } catch (Throwable th5) {
                vVar = vVar3;
                th = th5;
            }
        }
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                u uVar5 = (u) vVar.f24886r;
                if (uVar5 == null) {
                    throw th6;
                }
                if (uVar5.f3338d.compareAndSet(false, true)) {
                    try {
                        u0.o(uVar5.f3335a, "ROLLBACK TRANSACTION");
                    } catch (SQLException unused3) {
                    }
                }
                g gVar4 = uVar5.f3335a;
                gVar4.f3272t = null;
                gVar4.f3273u = null;
                mVar.e(gVar4);
                throw th6;
            } catch (Throwable th7) {
                p110k9.a.a(th, th7);
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f3268u.compareAndSet(false, true)) {
            this.f3265r.c();
            this.f3266s.c();
        }
    }

    public f(final M.k kVar, final String str, int i10) {
        p251z9.j.e(str, "fileName");
        this.f3267t = new ThreadLocal();
        final int i11 = 0;
        this.f3268u = new AtomicBoolean(false);
        int i12 = I9.a.f3852u;
        this.f3269v = p017b7.g.s0(30, I9.c.SECONDS);
        if (i10 > 0) {
            this.f3265r = new m(i10, new p241y9.a() { // from class: H2.c
                @Override // p241y9.a
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            Q2.a aVarC = kVar.c(str);
                            u0.o(aVarC, "PRAGMA query_only = 1");
                            return aVarC;
                        default:
                            return kVar.c(str);
                    }
                }
            });
            final int i13 = 1;
            this.f3266s = new m(1, new p241y9.a() { // from class: H2.c
                @Override // p241y9.a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            Q2.a aVarC = kVar.c(str);
                            u0.o(aVarC, "PRAGMA query_only = 1");
                            return aVarC;
                        default:
                            return kVar.c(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
