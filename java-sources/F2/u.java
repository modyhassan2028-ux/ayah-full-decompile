package F2;

import E2.W;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P9.d f2320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p150o9.h f2321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f2322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f2323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f2324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0162g f2325f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2326h;
    public final M.k g = new M.k(new t(0, this, u.class, "onClosed", "onClosed()V", 0, 0, 0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f2327i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2328k = true;

    public List a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p120l9.w.g0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(p171r0.a.d((F9.c) entry.getKey()), entry.getValue());
        }
        return p120l9.r.f19440r;
    }

    public abstract C0162g b();

    public W c() {
        throw new p110k9.i();
    }

    public final C0162g d() {
        C0162g c0162g = this.f2325f;
        if (c0162g != null) {
            return c0162g;
        }
        p251z9.j.k("internalTracker");
        throw null;
    }

    public Set e() {
        return p120l9.m.G0(new ArrayList(p120l9.n.a0(p120l9.t.f19442r, 10)));
    }

    public LinkedHashMap f() {
        int iG0 = p120l9.w.g0(p120l9.n.a0(p120l9.t.f19442r, 10));
        if (iG0 < 16) {
            iG0 = 16;
        }
        return new LinkedHashMap(iG0);
    }

    public final boolean g() {
        p pVar = this.f2324e;
        if (pVar != null) {
            return pVar.c() != null;
        }
        p251z9.j.k("connectionManager");
        throw null;
    }

    public final boolean h() {
        if (!j()) {
            return false;
        }
        p pVar = this.f2324e;
        if (pVar == null) {
            p251z9.j.k("connectionManager");
            throw null;
        }
        R2.c cVarC = pVar.c();
        if (cVarC != null) {
            return cVarC.U().z();
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final void i(Q2.a aVar) {
        p251z9.j.e(aVar, "connection");
        C0162g c0162gD = d();
        K k7 = c0162gD.f2278b;
        k7.getClass();
        Q2.c cVarA0 = aVar.a0("PRAGMA query_only");
        try {
            cVarA0.R();
            boolean zI = cVarA0.I();
            p186s9.b.b(cVarA0, null);
            if (!zI) {
                u0.o(aVar, "PRAGMA temp_store = MEMORY");
                u0.o(aVar, "PRAGMA recursive_triggers = 1");
                u0.o(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (k7.f2245d) {
                    u0.o(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    u0.o(aVar, H9.v.P0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                Ca.r rVar = k7.f2248h;
                ReentrantLock reentrantLock = (ReentrantLock) rVar.f849c;
                reentrantLock.lock();
                try {
                    rVar.f848b = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (c0162gD.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                p186s9.b.b(cVarA0, th2);
                throw th3;
            }
        }
    }

    public final boolean j() {
        p pVar = this.f2324e;
        if (pVar == null) {
            p251z9.j.k("connectionManager");
            throw null;
        }
        R2.a aVar = pVar.g;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object k(boolean z10, p241y9.e eVar, q9.c cVar) {
        p pVar = this.f2324e;
        if (pVar != null) {
            return pVar.f2298f.C(z10, eVar, cVar);
        }
        p251z9.j.k("connectionManager");
        throw null;
    }
}
