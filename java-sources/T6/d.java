package T6;

import U6.C0532j;
import U6.C0534l;
import U6.J;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.H;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import u.C1351f;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f7814o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f7815p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f7816q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static d f7817r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0534l f7820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W6.c f7821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f7822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final R6.e f7823f;
    public final L5.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f7824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f7825i;
    public final ConcurrentHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1351f f7826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1351f f7827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H f7828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f7829n;

    public d(Context context, Looper looper) {
        R6.e eVar = R6.e.f7244d;
        this.f7818a = 10000L;
        this.f7819b = false;
        this.f7824h = new AtomicInteger(1);
        this.f7825i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f7826k = new C1351f(0);
        this.f7827l = new C1351f(0);
        this.f7829n = true;
        this.f7822e = context;
        H h7 = new H(looper, this);
        Looper.getMainLooper();
        this.f7828m = h7;
        this.f7823f = eVar;
        this.g = new L5.c(10);
        PackageManager packageManager = context.getPackageManager();
        if (Y6.b.f10443f == null) {
            Y6.b.f10443f = Boolean.valueOf(Y6.b.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (Y6.b.f10443f.booleanValue()) {
            this.f7829n = false;
        }
        h7.sendMessage(h7.obtainMessage(6));
    }

    public static Status b(a aVar, R6.b bVar) {
        return new Status(17, "API: " + ((String) aVar.f7806b.f5533t) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f7235t, bVar);
    }

    public static d e(Context context) {
        d dVar;
        synchronized (f7816q) {
            try {
                if (f7817r == null) {
                    Looper looper = J.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = R6.e.f7243c;
                    f7817r = new d(applicationContext, looper);
                }
                dVar = f7817r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final boolean a(R6.b bVar, int i10) {
        R6.e eVar = this.f7823f;
        eVar.getClass();
        Context context = this.f7822e;
        if (!Z6.a.f(context)) {
            int i11 = bVar.f7234s;
            PendingIntent activity = bVar.f7235t;
            if (!((i11 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = eVar.a(i11, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i12 = GoogleApiActivity.f13980s;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i11, PendingIntent.getActivity(context, 0, intent, p038d7.e.f15703a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final i c(S6.c cVar) {
        a aVar = cVar.f7510e;
        ConcurrentHashMap concurrentHashMap = this.j;
        i iVar = (i) concurrentHashMap.get(aVar);
        if (iVar == null) {
            iVar = new i(this, cVar);
            concurrentHashMap.put(aVar, iVar);
        }
        if (iVar.g.m()) {
            this.f7827l.add(aVar);
        }
        iVar.m();
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x003e  */
    public final void d() {
        C0532j c0532j;
        C0534l c0534l = this.f7820c;
        if (c0534l != null) {
            if (c0534l.f8289r > 0) {
                if (this.f7821d == null) {
                    this.f7821d = new W6.c(this.f7822e, W6.c.f9642i, U6.m.f8291b, S6.b.f7504b);
                }
                this.f7821d.a(c0534l);
            } else if (!this.f7819b) {
                synchronized (C0532j.class) {
                    try {
                        if (C0532j.f8278s == null) {
                            C0532j.f8278s = new C0532j(0);
                        }
                        c0532j = C0532j.f8278s;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0532j.getClass();
                int i10 = ((SparseIntArray) this.g.f5532s).get(203400000, -1);
                if (i10 == -1 || i10 == 0) {
                    if (this.f7821d == null) {
                        this.f7821d = new W6.c(this.f7822e, W6.c.f9642i, U6.m.f8291b, S6.b.f7504b);
                    }
                    this.f7821d.a(c0534l);
                }
            }
            this.f7820c = null;
        }
    }

    public final void f(R6.b bVar, int i10) {
        if (a(bVar, i10)) {
            return;
        }
        H h7 = this.f7828m;
        h7.sendMessage(h7.obtainMessage(5, i10, 0, bVar));
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0311  */
    /* JADX WARN: Code duplicated, block: B:166:0x0317  */
    /* JADX WARN: Code duplicated, block: B:168:0x0343  */
    /* JADX WARN: Code duplicated, block: B:170:0x034d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 T6.i, still in use, count: 2, list:
          (r3v5 T6.i) from 0x0309: IGET (r3v5 T6.i) A[WRAPPED] (LINE:778) T6.i.l int
          (r3v5 T6.i) from 0x030f: PHI (r3 I:??) = (r3v2 T6.i), (r3v5 T6.i) binds: [B:162:0x030e, B:217:0x030f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.d.handleMessage(android.os.Message):boolean");
    }
}
