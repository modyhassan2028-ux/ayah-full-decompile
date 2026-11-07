package Q8;

import K9.AbstractC0405x;
import T1.InterfaceC0491h;
import android.util.Log;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T8.j f6984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f6985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f6986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f6987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0491h f6988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f6989f;
    public final p150o9.h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public K f6990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6991i;
    public String j;

    public f0(T8.j jVar, X x9, T t2, k0 k0Var, InterfaceC0491h interfaceC0491h, F f3, p150o9.h hVar) {
        p251z9.j.e(jVar, "sessionsSettings");
        p251z9.j.e(x9, "sessionGenerator");
        p251z9.j.e(t2, "sessionFirelogPublisher");
        p251z9.j.e(k0Var, "timeProvider");
        p251z9.j.e(interfaceC0491h, "sessionDataStore");
        p251z9.j.e(f3, "processDataManager");
        p251z9.j.e(hVar, "backgroundDispatcher");
        this.f6984a = jVar;
        this.f6985b = x9;
        this.f6986c = t2;
        this.f6987d = k0Var;
        this.f6988e = interfaceC0491h;
        this.f6989f = f3;
        this.g = hVar;
        this.j = "";
        AbstractC0405x.x(AbstractC0405x.b(hVar), null, new b0(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(f0 f0Var, String str, c0 c0Var, p150o9.c cVar) {
        e0 e0Var;
        String str2;
        f0Var.getClass();
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i10 = e0Var.f6978v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e0Var.f6978v = i10 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(f0Var, cVar);
            }
        } else {
            e0Var = new e0(f0Var, cVar);
        }
        Object objB = e0Var.f6976t;
        p161p9.a aVar = p161p9.a.f21156r;
        int i11 = e0Var.f6978v;
        if (i11 == 0) {
            p110k9.a.e(objB);
            if (p251z9.j.a(f0Var.j, str)) {
                return p110k9.y.f19095a;
            }
            f0Var.j = str;
            R8.c cVar2 = R8.c.f7404a;
            e0Var.f6974r = str;
            e0Var.f6975s = c0Var;
            e0Var.f6978v = 1;
            objB = cVar2.b(e0Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = e0Var.f6975s;
            str = e0Var.f6974r;
            p110k9.a.e(objB);
        }
        for (p160p8.j jVar : ((Map) objB).values()) {
            R8.e eVar = new R8.e(str);
            jVar.getClass();
            String str3 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            p160p8.i iVar = jVar.f21079b;
            synchronized (iVar) {
                if (!Objects.equals(iVar.f21077c, str)) {
                    p160p8.i.a(iVar.f21075a, iVar.f21076b, str);
                    iVar.f21077c = str;
                }
            }
            int iOrdinal = c0Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + R8.d.f7406r + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    throw new A6.a();
                }
                str2 = "Notified " + R8.d.f7406r + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return p110k9.y.f19095a;
    }

    public final void b() {
        this.f6991i = false;
        if (this.f6990h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f6989f.a());
        AbstractC0405x.x(AbstractC0405x.b(this.g), null, new b0(this, null, 1), 3);
    }

    public final boolean c(K k7) {
        Map map = k7.f6901c;
        boolean z10 = true;
        F f3 = this.f6989f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + f3.a());
            return true;
        }
        f3.getClass();
        D d5 = (D) map.get(f3.a());
        if (d5 != null && d5.f6883a == f3.f6889c && p251z9.j.a(d5.f6884b, (String) f3.f6890d.getValue())) {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseSessions", "Process " + f3.a() + " is stale");
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public final boolean d(K k7) {
        I9.a aVarD;
        long jS0;
        j0 j0Var = k7.f6900b;
        P p10 = k7.f6899a;
        if (j0Var == null) {
            Log.d("FirebaseSessions", "Session " + p10.f6906a + " has not backgrounded yet");
            return false;
        }
        j0 j0VarA = this.f6987d.a();
        int i10 = I9.a.f3852u;
        long jT0 = p017b7.g.t0(j0VarA.f7029a - j0Var.f7029a, I9.c.MILLISECONDS);
        T8.j jVar = this.f6984a;
        I9.a aVarD2 = jVar.f7958a.d();
        if (aVarD2 != null) {
            jS0 = aVarD2.f3853r;
            if (jS0 <= 0 || I9.a.e(jS0)) {
                aVarD = jVar.f7959b.d();
                if (aVarD != null) {
                    jS0 = aVarD.f3853r;
                    if (jS0 > 0 || I9.a.e(jS0)) {
                        jS0 = p017b7.g.s0(30, I9.c.MINUTES);
                    }
                } else {
                    jS0 = p017b7.g.s0(30, I9.c.MINUTES);
                }
            }
        } else {
            aVarD = jVar.f7959b.d();
            if (aVarD != null) {
                jS0 = aVarD.f3853r;
                if (jS0 > 0) {
                    jS0 = p017b7.g.s0(30, I9.c.MINUTES);
                } else {
                    jS0 = p017b7.g.s0(30, I9.c.MINUTES);
                }
            } else {
                jS0 = p017b7.g.s0(30, I9.c.MINUTES);
            }
        }
        boolean z10 = I9.a.c(jT0, jS0) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + p10.f6906a + " is expired");
        }
        return z10;
    }
}
