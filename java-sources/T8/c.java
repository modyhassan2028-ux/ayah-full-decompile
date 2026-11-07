package T8;

import A.C0029l;
import K9.AbstractC0405x;
import Q8.C0455b;
import Q8.C0470q;
import Q8.C0478z;
import Q8.k0;
import android.os.Build;
import android.util.Log;
import java.util.Map;
import p110k9.y;
import p120l9.w;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o {
    public static final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H9.m f7937h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f7938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.e f7939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0455b f7940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f7941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f7942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S9.c f7943f;

    static {
        int i10 = I9.a.f3852u;
        g = (int) I9.a.g(p017b7.g.s0(24, I9.c.HOURS), I9.c.SECONDS);
        f7937h = new H9.m("/");
    }

    public c(k0 k0Var, J8.e eVar, C0455b c0455b, d dVar, n nVar) {
        p251z9.j.e(k0Var, "timeProvider");
        p251z9.j.e(eVar, "firebaseInstallationsApi");
        p251z9.j.e(c0455b, "appInfo");
        p251z9.j.e(dVar, "configsFetcher");
        p251z9.j.e(nVar, "settingsCache");
        this.f7938a = k0Var;
        this.f7939b = eVar;
        this.f7940c = c0455b;
        this.f7941d = dVar;
        this.f7942e = nVar;
        this.f7943f = S9.d.a();
    }

    @Override // T8.o
    public final Boolean a() {
        return this.f7942e.a().f7947a;
    }

    @Override // T8.o
    public final Double b() {
        return this.f7942e.a().f7948b;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:59:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:59:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0162  */
    /* JADX WARN: Code duplicated, block: B:54:0x0166  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00bc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // T8.o
    public final Object c(p150o9.c cVar) throws Throwable {
        b bVar;
        S9.a aVar;
        S9.a aVar2;
        c cVar2;
        String str;
        Object objI;
        S9.a aVar3;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f7936v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f7936v = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (q9.c) cVar);
            }
        } else {
            bVar = new b(this, (q9.c) cVar);
        }
        Object objA = bVar.f7934t;
        ?? r10 = bVar.f7936v;
        y yVar = y.f19095a;
        p150o9.c cVar3 = null;
        p161p9.a aVar4 = p161p9.a.f21156r;
        try {
            if (r10 == 0) {
                p110k9.a.e(objA);
                S9.c cVar4 = this.f7943f;
                if (!cVar4.f() && !this.f7942e.b()) {
                    return yVar;
                }
                bVar.f7932r = this;
                bVar.f7933s = cVar4;
                bVar.f7936v = 1;
                if (cVar4.e(bVar) != aVar4) {
                    aVar2 = cVar4;
                    cVar2 = this;
                }
                return aVar4;
            }
            if (r10 == 1) {
                aVar2 = bVar.f7933s;
                cVar2 = (c) bVar.f7932r;
                p110k9.a.e(objA);
            } else {
                if (r10 == 2) {
                    aVar2 = bVar.f7933s;
                    cVar2 = (c) bVar.f7932r;
                    p110k9.a.e(objA);
                    str = ((C0478z) objA).f7066a;
                    if (str.equals("")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        aVar2.b(null);
                        return yVar;
                    }
                    p110k9.j jVar = new p110k9.j("X-Crashlytics-Installation-ID", str);
                    String str2 = Build.MANUFACTURER + Build.MODEL;
                    cVar2.getClass();
                    H9.m mVar = f7937h;
                    p110k9.j jVar2 = new p110k9.j("X-Crashlytics-Device-Model", mVar.d(str2));
                    String str3 = Build.VERSION.INCREMENTAL;
                    p251z9.j.d(str3, "INCREMENTAL");
                    p110k9.j jVar3 = new p110k9.j("X-Crashlytics-OS-Build-Version", mVar.d(str3));
                    String str4 = Build.VERSION.RELEASE;
                    p251z9.j.d(str4, "RELEASE");
                    p110k9.j jVar4 = new p110k9.j("X-Crashlytics-OS-Display-Version", mVar.d(str4));
                    cVar2.f7940c.getClass();
                    Map mapI0 = w.i0(jVar, jVar2, jVar3, jVar4, new p110k9.j("X-Crashlytics-API-Client-Version", "3.0.0"));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    d dVar = cVar2.f7941d;
                    O9.y yVar2 = new O9.y(cVar2, cVar3, 9);
                    K4.b bVar2 = new K4.b(2, null, 4);
                    bVar.f7932r = aVar2;
                    bVar.f7933s = null;
                    bVar.f7936v = 3;
                    objI = AbstractC0405x.I(dVar.f7945b, new C0029l(dVar, mapI0, yVar2, bVar2, (p150o9.c) null), bVar);
                    if (objI != aVar4) {
                        objI = yVar;
                    }
                    if (objI != aVar4) {
                        aVar3 = aVar2;
                    }
                    return aVar4;
                }
                if (r10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (S9.a) bVar.f7932r;
                try {
                    p110k9.a.e(objA);
                    aVar3 = aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar.b(null);
                    throw th;
                }
            }
            aVar3.b(null);
            return yVar;
            if (!cVar2.f7942e.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                aVar2.b(null);
                return yVar;
            }
            C0470q c0470q = C0478z.f7065c;
            J8.e eVar = cVar2.f7939b;
            bVar.f7932r = cVar2;
            bVar.f7933s = aVar2;
            bVar.f7936v = 2;
            objA = c0470q.a(eVar, bVar);
            if (objA != aVar4) {
                str = ((C0478z) objA).f7066a;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    aVar2.b(null);
                    return yVar;
                }
                p110k9.j jVar5 = new p110k9.j("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                cVar2.getClass();
                H9.m mVar2 = f7937h;
                p110k9.j jVar6 = new p110k9.j("X-Crashlytics-Device-Model", mVar2.d(str5));
                String str6 = Build.VERSION.INCREMENTAL;
                p251z9.j.d(str6, "INCREMENTAL");
                p110k9.j jVar7 = new p110k9.j("X-Crashlytics-OS-Build-Version", mVar2.d(str6));
                String str7 = Build.VERSION.RELEASE;
                p251z9.j.d(str7, "RELEASE");
                p110k9.j jVar8 = new p110k9.j("X-Crashlytics-OS-Display-Version", mVar2.d(str7));
                cVar2.f7940c.getClass();
                Map mapI1 = w.i0(jVar5, jVar6, jVar7, jVar8, new p110k9.j("X-Crashlytics-API-Client-Version", "3.0.0"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                d dVar2 = cVar2.f7941d;
                O9.y yVar3 = new O9.y(cVar2, cVar3, 9);
                K4.b bVar3 = new K4.b(2, null, 4);
                bVar.f7932r = aVar2;
                bVar.f7933s = null;
                bVar.f7936v = 3;
                objI = AbstractC0405x.I(dVar2.f7945b, new C0029l(dVar2, mapI1, yVar3, bVar3, (p150o9.c) null), bVar);
                if (objI != aVar4) {
                    objI = yVar;
                }
                if (objI != aVar4) {
                    aVar3 = aVar2;
                    aVar3.b(null);
                    return yVar;
                }
            }
            return aVar4;
        } catch (Throwable th2) {
            th = th2;
            aVar = r10;
        }
    }

    @Override // T8.o
    public final I9.a d() {
        Integer num = this.f7942e.a().f7949c;
        if (num == null) {
            return null;
        }
        int i10 = I9.a.f3852u;
        return new I9.a(p017b7.g.s0(num.intValue(), I9.c.SECONDS));
    }
}
