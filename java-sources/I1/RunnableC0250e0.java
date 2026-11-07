package I1;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.media.MediaBrowserServiceCompat;
import com.google.android.gms.internal.measurement.C0827i1;
import com.google.android.gms.internal.measurement.C0832j1;
import com.google.android.gms.internal.measurement.C0837k1;
import com.google.android.gms.internal.measurement.C0842l1;
import com.google.android.gms.internal.measurement.C0872r2;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i7.BinderC0998l1;
import i7.BinderC1001m1;
import i7.C0967b0;
import i7.C0999m;
import i7.C1011q;
import i7.C1021t1;
import i7.C1022u;
import i7.C1023u0;
import i7.I1;
import i7.J1;
import i7.K1;
import i7.Q1;
import i7.R1;
import i7.V1;
import i7.X1;
import i7.Y0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: I1.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0250e0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3729v;

    public /* synthetic */ RunnableC0250e0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3725r = i10;
        this.f3726s = obj;
        this.f3727t = obj2;
        this.f3728u = obj3;
        this.f3729v = obj4;
    }

    private final void a() {
        C1021t1 c1021t1 = (C1021t1) this.f3726s;
        AtomicReference atomicReference = (AtomicReference) this.f3727t;
        X1 x9 = (X1) this.f3728u;
        J1 j10 = (J1) this.f3729v;
        synchronized (atomicReference) {
            try {
                i7.J j = c1021t1.f17552u;
                if (j != null) {
                    j.j(x9, j10, new BinderC1001m1(c1021t1, atomicReference));
                    c1021t1.B();
                } else {
                    i7.X x10 = ((C1023u0) c1021t1.f16104r).f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.a("[sgtm] Failed to get upload batches; not connected to service");
                }
            } catch (RemoteException e10) {
                i7.X x11 = ((C1023u0) c1021t1.f16104r).f17584w;
                C1023u0.m(x11);
                x11.f17182w.b(e10, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0440  */
    /* JADX WARN: Code duplicated, block: B:124:0x0455 A[LOOP:2: B:122:0x044f->B:124:0x0455, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x04a5 A[Catch: r2 -> 0x050d, LOOP:3: B:127:0x049b->B:129:0x04a5, LOOP_END, TryCatch #6 {r2 -> 0x050d, blocks: (B:126:0x048e, B:127:0x049b, B:129:0x04a5, B:130:0x04db, B:132:0x04f6), top: B:155:0x048e }] */
    /* JADX WARN: Code duplicated, block: B:132:0x04f6 A[Catch: r2 -> 0x050d, TRY_LEAVE, TryCatch #6 {r2 -> 0x050d, blocks: (B:126:0x048e, B:127:0x049b, B:129:0x04a5, B:130:0x04db, B:132:0x04f6), top: B:155:0x048e }] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        I1 i10;
        C0827i1 c0827i1;
        int i11;
        switch (this.f3725r) {
            case 0:
                C0254g0.i((View) this.f3726s, (l0) this.f3727t, (M.k) this.f3728u);
                ((ValueAnimator) this.f3729v).start();
                return;
            case 1:
                i7.B0 b5 = (i7.B0) this.f3726s;
                String str = (String) this.f3727t;
                J1 j10 = (J1) this.f3728u;
                i7.N n6 = (i7.N) this.f3729v;
                Q1 q10 = b5.f16830f;
                q10.B();
                q10.c().o();
                q10.l0();
                C0999m c0999m = q10.f17106t;
                Q1.U(c0999m);
                Object obj = null;
                List<R1> listT = c0999m.t(str, j10, ((Integer) i7.G.f16884B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (R1 r10 : listT) {
                    String str2 = r10.f17118c;
                    long j = r10.f17122h;
                    long j11 = r10.f17116a;
                    if (q10.s(str, str2)) {
                        int i12 = r10.f17123i;
                        if (i12 > 0) {
                            if (i12 <= ((Integer) i7.G.f16987z.a(obj)).intValue()) {
                                long jMin = Math.min(((Long) i7.G.f16983x.a(obj)).longValue() * (1 << (i12 - 1)), ((Long) i7.G.f16985y.a(obj)).longValue());
                                q10.e().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : r10.f17119d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    long j12 = r10.f17116a;
                                    C0832j1 c0832j1 = r10.f17117b;
                                    i10 = new I1(j12, c0832j1.a(), r10.f17118c, bundle, r10.f17120e.f17357r, r10.g, "");
                                    try {
                                        c0827i1 = (C0827i1) C0967b0.b0(C0832j1.w(), i10.f17013s);
                                        for (i11 = 0; i11 < ((C0832j1) c0827i1.f14329s).q(); i11++) {
                                            C0837k1 c0837k1 = (C0837k1) ((C0832j1) c0827i1.f14329s).r(i11).i();
                                            q10.e().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            c0837k1.b();
                                            ((C0842l1) c0837k1.f14329s).f0(jCurrentTimeMillis);
                                            c0827i1.b();
                                            ((C0832j1) c0827i1.f14329s).y(i11, (C0842l1) c0837k1.e());
                                        }
                                        i10.f17013s = ((C0832j1) c0827i1.e()).a();
                                        if (Log.isLoggable(q10.b().y(), 2)) {
                                            C0967b0 c0967b0 = q10.f17110x;
                                            Q1.U(c0967b0);
                                            i10.f17018x = c0967b0.R((C0832j1) c0827i1.e());
                                        }
                                        arrayList.add(i10);
                                    } catch (C0872r2 unused) {
                                        q10.b().f17185z.b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            q10.b().f17178E.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j11), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r8.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            long j13 = r10.f17116a;
                            C0832j1 c0832j2 = r10.f17117b;
                            i10 = new I1(j13, c0832j2.a(), r10.f17118c, bundle, r10.f17120e.f17357r, r10.g, "");
                            c0827i1 = (C0827i1) C0967b0.b0(C0832j1.w(), i10.f17013s);
                            while (i11 < ((C0832j1) c0827i1.f14329s).q()) {
                                C0837k1 c0837k2 = (C0837k1) ((C0832j1) c0827i1.f14329s).r(i11).i();
                                q10.e().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                c0837k2.b();
                                ((C0842l1) c0837k2.f14329s).f0(jCurrentTimeMillis2);
                                c0827i1.b();
                                ((C0832j1) c0827i1.f14329s).y(i11, (C0842l1) c0837k2.e());
                            }
                            i10.f17013s = ((C0832j1) c0827i1.e()).a();
                            if (Log.isLoggable(q10.b().y(), 2)) {
                                C0967b0 c0967b1 = q10.f17110x;
                                Q1.U(c0967b1);
                                i10.f17018x = c0967b1.R((C0832j1) c0827i1.e());
                            }
                            arrayList.add(i10);
                        }
                        obj = null;
                    } else {
                        q10.b().f17178E.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j11), r10.f17118c);
                    }
                }
                try {
                    n6.I(new K1(arrayList));
                    q10.b().f17178E.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e10) {
                    q10.b().f17182w.c(str, e10, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 2:
                C1021t1 c1021t1P = ((AppMeasurementDynamiteService) this.f3729v).f14525f.p();
                com.google.android.gms.internal.measurement.N n10 = (com.google.android.gms.internal.measurement.N) this.f3726s;
                C1022u c1022u = (C1022u) this.f3727t;
                String str3 = (String) this.f3728u;
                c1021t1P.o();
                c1021t1P.p();
                C1023u0 c1023u0 = (C1023u0) c1021t1P.f16104r;
                V1 v10 = c1023u0.f17587z;
                C1023u0.k(v10);
                if (R6.f.f7246b.b(((C1023u0) v10.f16104r).f17579r, 12451000) == 0) {
                    c1021t1P.C(new RunnableC0250e0(c1021t1P, c1022u, str3, n10, 6, false));
                    return;
                }
                i7.X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17185z.a("Not bundling data. Service unavailable or out of date");
                V1 v11 = c1023u0.f17587z;
                C1023u0.k(v11);
                v11.b0(n10, new byte[0]);
                return;
            case 3:
                i7.B0 b10 = (i7.B0) this.f3726s;
                Bundle bundle2 = (Bundle) this.f3727t;
                String str4 = (String) this.f3728u;
                X1 x10 = (X1) this.f3729v;
                Q1 q11 = b10.f16830f;
                boolean zY = q11.e0().y(null, i7.G.f16921W0);
                if (bundle2.isEmpty() && zY) {
                    C0999m c0999m2 = q11.f17106t;
                    Q1.U(c0999m2);
                    c0999m2.o();
                    c0999m2.p();
                    try {
                        c0999m2.d0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e11) {
                        i7.X x11 = ((C1023u0) c0999m2.f16104r).f17584w;
                        C1023u0.m(x11);
                        x11.f17182w.b(e11, "Error clearing default event params");
                        return;
                    }
                }
                C0999m c0999m3 = q11.f17106t;
                Q1.U(c0999m3);
                C1023u0 c1023u1 = (C1023u0) c0999m3.f16104r;
                c0999m3.o();
                c0999m3.p();
                C1011q c1011q = new C1011q((C1023u0) c0999m3.f16104r, "", str4, "dep", 0L, 0L, bundle2);
                C0967b0 c0967b2 = c0999m3.f17001s.f17110x;
                Q1.U(c0967b2);
                byte[] bArrA = c0967b2.Q(c1011q).a();
                i7.X x12 = c1023u1.f17584w;
                C1023u0.m(x12);
                x12.f17178E.c(str4, Integer.valueOf(bArrA.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (c0999m3.d0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        C1023u0.m(x12);
                        x12.f17182w.b(i7.X.w(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e12) {
                    C1023u0.m(x12);
                    x12.f17182w.c(i7.X.w(str4), e12, "Error storing default event parameters. appId");
                }
                C0999m c0999m4 = q11.f17106t;
                Q1.U(c0999m4);
                long j14 = x10.U;
                try {
                    if (c0999m4.Z("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j14)}, 0L) <= 0 && c0999m4.Z("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j14)}, 0L) > 0) {
                        C0999m c0999m5 = q11.f17106t;
                        Q1.U(c0999m5);
                        c0999m5.G(str4, Long.valueOf(j14), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e13) {
                    i7.X x13 = ((C1023u0) c0999m4.f16104r).f17584w;
                    C1023u0.m(x13);
                    x13.f17182w.b(e13, "Error checking backfill conditions");
                    return;
                }
            case 4:
                String str5 = (String) this.f3727t;
                String str6 = (String) this.f3728u;
                C1021t1 c1021t1P2 = ((C1023u0) ((Y0) this.f3729v).f16104r).p();
                AtomicReference atomicReference = (AtomicReference) this.f3726s;
                c1021t1P2.o();
                c1021t1P2.p();
                c1021t1P2.C(new i7.A0(c1021t1P2, atomicReference, str5, str6, c1021t1P2.E(false), 1));
                return;
            case 5:
                C1021t1 c1021t1P3 = ((AppMeasurementDynamiteService) this.f3729v).f14525f.p();
                com.google.android.gms.internal.measurement.N n11 = (com.google.android.gms.internal.measurement.N) this.f3726s;
                String str7 = (String) this.f3727t;
                String str8 = (String) this.f3728u;
                c1021t1P3.o();
                c1021t1P3.p();
                c1021t1P3.C(new i7.A0(c1021t1P3, str7, str8, c1021t1P3.E(false), n11));
                return;
            case 6:
                com.google.android.gms.internal.measurement.N n12 = (com.google.android.gms.internal.measurement.N) this.f3728u;
                C1021t1 c1021t1 = (C1021t1) this.f3729v;
                byte[] bArrX = null;
                try {
                    try {
                        i7.J j15 = c1021t1.f17552u;
                        if (j15 != null) {
                            bArrX = j15.x((C1022u) this.f3726s, (String) this.f3727t);
                            c1021t1.B();
                            V1 v12 = ((C1023u0) c1021t1.f16104r).f17587z;
                            C1023u0.k(v12);
                            v12.b0(n12, bArrX);
                            return;
                        }
                        C1023u0 c1023u2 = (C1023u0) c1021t1.f16104r;
                        i7.X x14 = c1023u2.f17584w;
                        C1023u0.m(x14);
                        x14.f17182w.a("Discarding data. Failed to send event to service to bundle");
                        V1 v13 = c1023u2.f17587z;
                        C1023u0.k(v13);
                        v13.b0(n12, null);
                        return;
                    } catch (RemoteException e14) {
                        i7.X x15 = ((C1023u0) c1021t1.f16104r).f17584w;
                        C1023u0.m(x15);
                        x15.f17182w.b(e14, "Failed to send event to the service to bundle");
                    }
                } catch (Throwable th) {
                    V1 v14 = ((C1023u0) c1021t1.f16104r).f17587z;
                    C1023u0.k(v14);
                    v14.b0(n12, null);
                    throw th;
                }
                break;
            case 7:
                C1021t1 c1021t2 = (C1021t1) this.f3726s;
                AtomicReference atomicReference2 = (AtomicReference) this.f3727t;
                X1 x16 = (X1) this.f3728u;
                Bundle bundle3 = (Bundle) this.f3729v;
                synchronized (atomicReference2) {
                    try {
                        i7.J j16 = c1021t2.f17552u;
                        if (j16 != null) {
                            j16.u(x16, bundle3, new BinderC0998l1(c1021t2, atomicReference2));
                            c1021t2.B();
                            return;
                        } else {
                            i7.X x17 = ((C1023u0) c1021t2.f16104r).f17584w;
                            C1023u0.m(x17);
                            x17.f17182w.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e15) {
                        i7.X x18 = ((C1023u0) c1021t2.f16104r).f17584w;
                        C1023u0.m(x18);
                        x18.f17182w.b(e15, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 8:
                a();
                return;
            case 9:
                Q1 q12 = (Q1) ((Z0.B) this.f3729v).f10875s;
                V1 v1K0 = q12.k0();
                q12.e().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String str9 = (String) this.f3726s;
                C1022u c1022uS = v1K0.S((String) this.f3727t, (Bundle) this.f3728u, "auto", jCurrentTimeMillis3, false);
                U6.y.f(c1022uS);
                q12.h(c1022uS, str9);
                return;
            case 10:
                p140o.e eVar = (p140o.e) ((Z0.B) this.f3729v).f10875s;
                p140o.m mVar = (p140o.m) this.f3727t;
                p140o.d dVar = (p140o.d) this.f3726s;
                if (dVar != null) {
                    eVar.Q = true;
                    dVar.f20093b.c(false);
                    eVar.Q = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((p140o.k) this.f3728u).q(mVar, null, 4);
                    return;
                }
                return;
            default:
                String str10 = (String) this.f3727t;
                IBinder binder = ((Messenger) ((Z0.B) this.f3726s).f10875s).getBinder();
                X4.c cVar = (X4.c) this.f3729v;
                p143o2.f fVar = (p143o2.f) ((MediaBrowserServiceCompat) cVar.f9953r).f12704v.get(binder);
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str10);
                    return;
                }
                HashMap map = fVar.f20276e;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) cVar.f9953r;
                IBinder iBinder = (IBinder) this.f3728u;
                mediaBrowserServiceCompat.getClass();
                boolean z10 = false;
                if (iBinder != null) {
                    List list = (List) map.get(str10);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (iBinder == ((H1.b) it.next()).f3241a) {
                                it.remove();
                                z10 = true;
                            }
                        }
                        if (list.size() == 0) {
                            map.remove(str10);
                        }
                    }
                } else if (map.remove(str10) != null) {
                    z10 = true;
                }
                if (z10) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + str10 + " which is not subscribed");
                return;
        }
    }

    public /* synthetic */ RunnableC0250e0(Object obj, Object obj2, Object obj3, Object obj4, int i10, boolean z10) {
        this.f3725r = i10;
        this.f3726s = obj2;
        this.f3727t = obj3;
        this.f3728u = obj4;
        this.f3729v = obj;
    }

    public RunnableC0250e0(Y0 y10, AtomicReference atomicReference, String str, String str2) {
        this.f3725r = 4;
        this.f3726s = atomicReference;
        this.f3727t = str;
        this.f3728u = str2;
        Objects.requireNonNull(y10);
        this.f3729v = y10;
    }
}
