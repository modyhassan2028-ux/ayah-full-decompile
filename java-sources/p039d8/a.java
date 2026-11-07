package p039d8;

import Ca.r;
import E2.AbstractC0129j0;
import E2.C0120f;
import E2.F;
import E2.F0;
import E2.RunnableC0118e;
import E2.RunnableC0147v;
import K9.AbstractC0405x;
import K9.C0389g;
import K9.U;
import R6.b;
import T6.k;
import U6.InterfaceC0530h;
import U6.y;
import Z0.B;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.AbstractC0909z;
import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzw;
import i7.AbstractC1002n;
import i7.B0;
import i7.B1;
import i7.C0974d1;
import i7.C0975e;
import i7.C0979f0;
import i7.C0981g;
import i7.C0982g0;
import i7.C0983g1;
import i7.C0985h0;
import i7.C1005o;
import i7.C1008p;
import i7.C1014r0;
import i7.C1020t0;
import i7.C1021t1;
import i7.C1023u0;
import i7.D0;
import i7.E0;
import i7.F1;
import i7.G;
import i7.G0;
import i7.H0;
import i7.I0;
import i7.InterfaceC1030w1;
import i7.J;
import i7.K0;
import i7.M0;
import i7.O;
import i7.Q;
import i7.Q1;
import i7.RunnableC1007o1;
import i7.RunnableC1015r1;
import i7.ServiceConnectionC0988i0;
import i7.ServiceConnectionC1018s1;
import i7.V;
import i7.V1;
import i7.X;
import i7.X1;
import i7.Y0;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p070g8.c;
import p085i0.n;
import p109k8.i;
import p118l7.d;
import p118l7.e;
import p118l7.f;
import p118l7.g;
import p118l7.h;
import p118l7.j;
import p118l7.l;
import p118l7.m;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f15705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15706t;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f15704r = i10;
        this.f15705s = obj;
        this.f15706t = obj2;
    }

    private final void a() {
        Y0 y10 = ((AppMeasurementDynamiteService) this.f15706t).f14525f.f17566D;
        C1023u0.l(y10);
        n nVar = (n) this.f15705s;
        y10.o();
        y10.p();
        n nVar2 = y10.f17233u;
        if (nVar != nVar2) {
            y.h("EventInterceptor already set.", nVar2 == null);
        }
        y10.f17233u = nVar;
    }

    private final void b() {
        C1023u0 c1023u0 = (C1023u0) ((Y0) this.f15705s).f16104r;
        O oR = c1023u0.r();
        String str = (String) this.f15706t;
        String str2 = oR.f17045H;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        oR.f17045H = str;
        if (z10) {
            c1023u0.r().t();
        }
    }

    private final void c() {
        C1021t1 c1021t1 = (C1021t1) this.f15706t;
        J j = c1021t1.f17552u;
        C1023u0 c1023u0 = (C1023u0) c1021t1.f16104r;
        if (j == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Failed to send current screen to service");
            return;
        }
        try {
            C0983g1 c0983g1 = (C0983g1) this.f15705s;
            if (c0983g1 == null) {
                j.N(0L, null, null, c1023u0.f17579r.getPackageName());
            } else {
                j.N(c0983g1.f17369c, c0983g1.f17367a, c0983g1.f17368b, c1023u0.f17579r.getPackageName());
            }
            c1021t1.B();
        } catch (RemoteException e10) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(e10, "Failed to send current screen to the service");
        }
    }

    private final void d() {
        C1021t1 c1021t1 = ((ServiceConnectionC1018s1) this.f15706t).f17547c;
        c1021t1.f17552u = null;
        if (((b) this.f15705s).f7234s != 7777) {
            c1021t1.D();
            return;
        }
        if (c1021t1.f17555x == null) {
            c1021t1.f17555x = Executors.newScheduledThreadPool(1);
        }
        c1021t1.f17555x.schedule(new RunnableC0147v(18, this), ((Long) G.f16929a0.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void e() {
        Q1 q10 = (Q1) this.f15705s;
        q10.B();
        Runnable runnable = (Runnable) this.f15706t;
        q10.c().o();
        if (q10.f17088G == null) {
            q10.f17088G = new ArrayList();
        }
        q10.f17088G.add(runnable);
        q10.q();
    }

    private final /* synthetic */ void f() {
        B b5 = (B) this.f15705s;
        JobParameters jobParameters = (JobParameters) this.f15706t;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC1030w1) ((Service) b5.f10875s)).c(jobParameters);
    }

    private final void g() {
        try {
            n();
        } catch (Error e10) {
            synchronized (((i) this.f15706t).f19059s) {
                ((i) this.f15706t).f19060t = 1;
                throw e10;
            }
        }
    }

    private final void h() {
        if (((o) this.f15705s).f19424d) {
            ((l) this.f15706t).f19416u.k();
            return;
        }
        try {
            ((l) this.f15706t).f19416u.j(((l) this.f15706t).f19415t.a((o) this.f15705s));
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                ((l) this.f15706t).f19416u.i((Exception) e10.getCause());
            } else {
                ((l) this.f15706t).f19416u.i(e10);
            }
        } catch (Exception e11) {
            ((l) this.f15706t).f19416u.i(e11);
        }
    }

    private final void i() {
        l lVar = (l) this.f15706t;
        o oVar = lVar.f19416u;
        try {
            o oVar2 = (o) lVar.f19415t.a((o) this.f15705s);
            if (oVar2 == null) {
                lVar.h(new NullPointerException("Continuation returned null"));
                return;
            }
            c cVar = j.f19404b;
            oVar2.b(cVar, lVar);
            oVar2.a(cVar, lVar);
            oVar2.f19422b.f(new m((Executor) cVar, (p118l7.c) lVar));
            oVar2.n();
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                oVar.i((Exception) e10.getCause());
            } else {
                oVar.i(e10);
            }
        } catch (Exception e11) {
            oVar.i(e11);
        }
    }

    private final void j() {
        synchronized (((m) this.f15706t).f19419t) {
            ((d) ((m) this.f15706t).f19420u).f((o) this.f15705s);
        }
    }

    private final void k() {
        synchronized (((m) this.f15706t).f19419t) {
            e eVar = (e) ((m) this.f15706t).f19420u;
            Exception excD = ((o) this.f15705s).d();
            y.f(excD);
            eVar.h(excD);
        }
    }

    private final void l() {
        synchronized (((m) this.f15706t).f19419t) {
            ((f) ((m) this.f15706t).f19420u).g(((o) this.f15705s).e());
        }
    }

    private final void m() {
        m mVar = (m) this.f15706t;
        try {
            o oVarH = ((h) mVar.f19419t).h(((o) this.f15705s).e());
            c cVar = j.f19404b;
            oVarH.b(cVar, mVar);
            oVarH.a(cVar, mVar);
            oVarH.f19422b.f(new m((Executor) cVar, (p118l7.c) mVar));
            oVarH.n();
        } catch (CancellationException unused) {
            mVar.e();
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                mVar.h((Exception) e10.getCause());
            } else {
                mVar.h(e10);
            }
        } catch (Exception e11) {
            mVar.h(e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f15705s).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p109k8.i.f19057w.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f15705s), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f15705s = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f15706t     // Catch: java.lang.Throwable -> L58
            k8.i r2 = (p109k8.i) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f19059s     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f15706t     // Catch: java.lang.Throwable -> L20
            k8.i r0 = (p109k8.i) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f19060t     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f19061u     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f19061u = r6     // Catch: java.lang.Throwable -> L20
            r0.f19060t = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f15706t     // Catch: java.lang.Throwable -> L20
            k8.i r4 = (p109k8.i) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f19059s     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f15705s = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f15706t     // Catch: java.lang.Throwable -> L20
            k8.i r0 = (p109k8.i) r0     // Catch: java.lang.Throwable -> L20
            r0.f19060t = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f15705s     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f15705s = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = p109k8.i.f19057w     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f15705s     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f15705s = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p039d8.a.n():void");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0350 A[Catch: NameNotFoundException -> 0x0375, TryCatch #12 {NameNotFoundException -> 0x0375, blocks: (B:113:0x0345, B:115:0x0350, B:117:0x035c), top: B:502:0x0345 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x035c A[Catch: NameNotFoundException -> 0x0375, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x0375, blocks: (B:113:0x0345, B:115:0x0350, B:117:0x035c), top: B:502:0x0345 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0361  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:134:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x03df  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:146:0x0400  */
    /* JADX WARN: Code duplicated, block: B:147:0x040b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0423  */
    /* JADX WARN: Code duplicated, block: B:152:0x0424  */
    /* JADX WARN: Code duplicated, block: B:155:0x0429 A[Catch: IllegalStateException -> 0x0438, TRY_LEAVE, TryCatch #7 {IllegalStateException -> 0x0438, blocks: (B:149:0x0417, B:153:0x0425, B:155:0x0429), top: B:494:0x0417 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x045b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0469  */
    /* JADX WARN: Code duplicated, block: B:166:0x0470  */
    /* JADX WARN: Code duplicated, block: B:170:0x048a  */
    /* JADX WARN: Code duplicated, block: B:171:0x048b A[Catch: NotFoundException -> 0x0490, TRY_LEAVE, TryCatch #17 {NotFoundException -> 0x0490, blocks: (B:168:0x047a, B:171:0x048b), top: B:506:0x047a }] */
    /* JADX WARN: Code duplicated, block: B:177:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:179:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:180:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:183:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:186:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:188:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:189:0x04da  */
    /* JADX WARN: Code duplicated, block: B:192:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:194:0x0541  */
    /* JADX WARN: Code duplicated, block: B:195:0x054a  */
    /* JADX WARN: Code duplicated, block: B:198:0x056c  */
    /* JADX WARN: Code duplicated, block: B:201:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:202:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:205:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:208:0x05c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:210:0x05cb A[PHI: r4
      0x05cb: PHI (r4v39 boolean) = (r4v33 boolean), (r4v32 boolean) binds: [B:209:0x05ca, B:206:0x05c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:213:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:215:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:216:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:219:0x060e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0626  */
    /* JADX WARN: Code duplicated, block: B:223:0x0645 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x0647  */
    /* JADX WARN: Code duplicated, block: B:228:0x0669  */
    /* JADX WARN: Code duplicated, block: B:230:0x067e A[PHI: r27 r32 r33
      0x067e: PHI (r27v5 i7.u0) = (r27v2 i7.u0), (r27v6 i7.u0) binds: [B:227:0x0667, B:225:0x064a] A[DONT_GENERATE, DONT_INLINE]
      0x067e: PHI (r32v3 Ca.r) = (r32v0 Ca.r), (r32v4 Ca.r) binds: [B:227:0x0667, B:225:0x064a] A[DONT_GENERATE, DONT_INLINE]
      0x067e: PHI (r33v3 i7.u0) = (r33v0 i7.u0), (r33v4 i7.u0) binds: [B:227:0x0667, B:225:0x064a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:232:0x068c  */
    /* JADX WARN: Code duplicated, block: B:233:0x068e  */
    /* JADX WARN: Code duplicated, block: B:243:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:245:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:246:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:249:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:252:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:255:0x0711  */
    /* JADX WARN: Code duplicated, block: B:257:0x071f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x0735  */
    /* JADX WARN: Code duplicated, block: B:263:0x0743 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x0767  */
    /* JADX WARN: Code duplicated, block: B:276:0x077e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0784  */
    /* JADX WARN: Code duplicated, block: B:280:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:284:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:287:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:292:0x0802  */
    /* JADX WARN: Code duplicated, block: B:294:0x0808  */
    /* JADX WARN: Code duplicated, block: B:296:0x0812  */
    /* JADX WARN: Code duplicated, block: B:297:0x081d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0827  */
    /* JADX WARN: Code duplicated, block: B:303:0x083d  */
    /* JADX WARN: Code duplicated, block: B:307:0x0849  */
    /* JADX WARN: Code duplicated, block: B:310:0x0857  */
    /* JADX WARN: Code duplicated, block: B:313:0x086b  */
    /* JADX WARN: Code duplicated, block: B:314:0x0870  */
    /* JADX WARN: Code duplicated, block: B:316:0x0882  */
    /* JADX WARN: Code duplicated, block: B:318:0x08a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x0918  */
    /* JADX WARN: Code duplicated, block: B:331:0x0934  */
    /* JADX WARN: Code duplicated, block: B:334:0x0940  */
    /* JADX WARN: Code duplicated, block: B:343:0x098a  */
    /* JADX WARN: Code duplicated, block: B:345:0x0992  */
    /* JADX WARN: Code duplicated, block: B:346:0x0994  */
    /* JADX WARN: Code duplicated, block: B:348:0x099c  */
    /* JADX WARN: Code duplicated, block: B:352:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:356:0x09de  */
    /* JADX WARN: Code duplicated, block: B:358:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:359:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:361:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:363:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:370:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:496:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x047a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:? A[LOOP:0: B:269:0x0761->B:514:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Type inference failed for: r0v125, types: [i7.X0] */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0530h interfaceC0530h;
        E0 e10;
        W w9;
        String string;
        String str;
        String str2;
        String str3;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        String str4;
        int i10;
        int iG;
        List listAsList;
        C1023u0 c1023u0;
        Bundle bundleZ;
        Integer numValueOf;
        String[] stringArray;
        C0974d1 c0974d1;
        V v10;
        V v11;
        V v12;
        V v13;
        String strU;
        int i11;
        AtomicInteger atomicInteger;
        long j;
        G0 g10;
        final Y0 y10;
        int iT;
        boolean zY;
        boolean z10;
        V v14;
        V1 v15;
        r rVar;
        H0 h0V;
        int i12;
        E0 e0D;
        E0 e0D2;
        E0 e11;
        C1023u0 c1023u1;
        r rVar2;
        C1023u0 c1023u2;
        H0 h7;
        boolean z11;
        C1023u0 c1023u3;
        E0 e0D3;
        E0 e0D4;
        Bundle bundle;
        C1005o c1005oC;
        Iterator it;
        Boolean boolA;
        C0979f0 c0979f0;
        C1020t0 c1020t0;
        V1 v16;
        C1023u0 c1023u4;
        r rVar3;
        X x9;
        boolean zA;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        boolean z12;
        long jMax;
        V v17;
        Context context;
        IntentFilter intentFilter;
        zzw zzwVar;
        boolean z13;
        Context context2;
        int i13;
        Iterator it2;
        String str5;
        V1 v18;
        String strB;
        Long lValueOf;
        switch (this.f15704r) {
            case 0:
                n nVar = (n) this.f15706t;
                try {
                    F9.n.w((b) this.f15705s);
                    Y0 y11 = (Y0) nVar.f16734t;
                    y11.o();
                    nVar.k();
                    y11.f17238z = false;
                    y11.f17218A = 1;
                    X x10 = ((C1023u0) y11.f16104r).f17584w;
                    C1023u0.m(x10);
                    x10.f17177D.b(((F1) nVar.f16733s).f16879r, "Successfully registered trigger URI");
                    y11.N();
                    return;
                } catch (Error e12) {
                    e = e12;
                    nVar.f(e);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    nVar.f(e);
                    return;
                } catch (ExecutionException e14) {
                    nVar.f(e14.getCause());
                    return;
                }
            case 1:
                RunnableC0118e runnableC0118e = (RunnableC0118e) this.f15706t;
                C0120f c0120f = (C0120f) runnableC0118e.f1659v;
                if (c0120f.g == runnableC0118e.f1656s) {
                    List list = (List) runnableC0118e.f1658u;
                    E2.r rVar4 = (E2.r) this.f15705s;
                    c0120f.f1665e = list;
                    c0120f.f1666f = DesugarCollections.unmodifiableList(list);
                    rVar4.a(c0120f.f1661a);
                    c0120f.a();
                    return;
                }
                return;
            case 2:
                F f3 = (F) this.f15705s;
                F0 f7 = f3.f1475e;
                E2.J j10 = (E2.J) this.f15706t;
                RecyclerView recyclerView = j10.f1532r;
                if (recyclerView == null || !recyclerView.f12873J || f3.f1479k || f7.b() == -1) {
                    return;
                }
                AbstractC0129j0 itemAnimator = j10.f1532r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList = j10.f1530p;
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        if (((F) arrayList.get(i14)).f1480l) {
                        }
                    }
                    Q5.a aVar = j10.f1527m;
                    aVar.getClass();
                    p251z9.j.e(f7, "viewHolder");
                    aVar.f6866e.e(f7);
                    return;
                }
                j10.f1532r.post(this);
                return;
            case 3:
                O8.c cVar = (O8.c) this.f15705s;
                Typeface typeface = (Typeface) this.f15706t;
                p244z1.a aVar2 = (p244z1.a) cVar.f6511r;
                if (aVar2 != null) {
                    aVar2.k(typeface);
                    return;
                }
                return;
            case 4:
                ((F1.i) this.f15705s).accept(this.f15706t);
                return;
            case 5:
                ((C0389g) this.f15706t).B((U) this.f15705s);
                return;
            case 6:
                int i15 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f15705s).run();
                    } catch (Throwable th) {
                        AbstractC0405x.s(th, p150o9.i.f20380r);
                    }
                    try {
                        Runnable runnableG0 = ((P9.h) this.f15706t).g0();
                        if (runnableG0 == null) {
                            return;
                        }
                        this.f15705s = runnableG0;
                        i15++;
                        if (i15 >= 16) {
                            P9.h hVar = (P9.h) this.f15706t;
                            if (P9.b.j(hVar.f6782u, hVar)) {
                                P9.h hVar2 = (P9.h) this.f15706t;
                                P9.b.i(hVar2.f6782u, hVar2, this);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        P9.h hVar3 = (P9.h) this.f15706t;
                        synchronized (hVar3.f6785x) {
                            P9.h.f6780y.decrementAndGet(hVar3);
                            throw th2;
                        }
                    }
                    break;
                }
                break;
            case 7:
                b bVar = (b) this.f15705s;
                k kVar = (k) this.f15706t;
                S6.a aVar3 = (S6.a) kVar.f7843b;
                T6.i iVar = (T6.i) ((T6.d) kVar.f7847f).j.get((T6.a) kVar.f7844c);
                if (iVar == null) {
                    return;
                }
                if (bVar.f7234s != 0) {
                    iVar.o(bVar, null);
                    return;
                }
                kVar.f7842a = true;
                if (aVar3.m()) {
                    if (!kVar.f7842a || (interfaceC0530h = (InterfaceC0530h) kVar.f7845d) == null) {
                        return;
                    }
                    aVar3.j(interfaceC0530h, (Set) kVar.f7846e);
                    return;
                }
                try {
                    aVar3.j(null, aVar3.c());
                    return;
                } catch (SecurityException e15) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e15);
                    aVar3.e("Failed to get service from broker.");
                    iVar.o(new b(10), null);
                    return;
                }
            case 8:
                D0 d1 = (D0) this.f15705s;
                d1.f();
                if (H8.e.q()) {
                    d1.c().x(this);
                    return;
                }
                AbstractC1002n abstractC1002n = (AbstractC1002n) this.f15706t;
                boolean z14 = abstractC1002n.f17472c != 0;
                abstractC1002n.f17472c = 0L;
                if (z14) {
                    abstractC1002n.a();
                    return;
                }
                return;
            case 9:
                ServiceConnectionC0988i0 serviceConnectionC0988i0 = (ServiceConnectionC0988i0) this.f15706t;
                C1023u0 c1023u5 = serviceConnectionC0988i0.f17414b.f17424b;
                C1014r0 c1014r0 = c1023u5.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.o();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", serviceConnectionC0988i0.f17413a);
                try {
                    A a9 = (A) ((C) this.f15705s);
                    Parcel parcelG = a9.g();
                    AbstractC0909z.b(parcelG, bundle2);
                    Parcel parcelC = a9.c(parcelG, 1);
                    Bundle bundle3 = (Bundle) AbstractC0909z.a(parcelC, Bundle.CREATOR);
                    parcelC.recycle();
                    if (bundle3 == null) {
                        X x11 = c1023u5.f17584w;
                        C1023u0.m(x11);
                        x11.f17182w.a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e16) {
                    X x12 = c1023u5.f17584w;
                    C1023u0.m(x12);
                    x12.f17182w.b(e16.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                C1014r0 c1014r1 = c1023u5.f17585x;
                C1023u0.m(c1014r1);
                c1014r1.o();
                throw new IllegalStateException("Unexpected call on client side");
            case 10:
                E0 e17 = E0.f16862s;
                C1023u0 c1023u6 = (C1023u0) this.f15706t;
                K0 k7 = (K0) this.f15705s;
                C1014r0 c1014r2 = c1023u6.f17585x;
                X x13 = c1023u6.f17584w;
                C0985h0 c0985h0 = c1023u6.f17583v;
                V1 v19 = c1023u6.f17587z;
                C1023u0.m(c1014r2);
                c1014r2.o();
                C0981g c0981g = c1023u6.f17582u;
                ((C1023u0) c0981g.f16104r).getClass();
                C1008p c1008p = new C1008p(c1023u6);
                c1008p.r();
                c1023u6.f17572J = c1008p;
                W w10 = k7.f17023d;
                O o10 = new O(c1023u6, k7.f17022c, w10 == null ? 0L : w10.f14146r);
                o10.q();
                c1023u6.f17573K = o10;
                Q q10 = new Q(c1023u6);
                q10.q();
                c1023u6.f17570H = q10;
                C1021t1 c1021t1 = new C1021t1(c1023u6);
                c1021t1.q();
                c1023u6.f17571I = c1021t1;
                boolean z15 = v19.f16847s;
                C1023u0 c1023u7 = (C1023u0) v19.f16104r;
                if (z15) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                v19.o();
                SecureRandom secureRandom = new SecureRandom();
                long jNextLong = secureRandom.nextLong();
                if (jNextLong == 0) {
                    jNextLong = secureRandom.nextLong();
                    if (jNextLong == 0) {
                        X x14 = ((C1023u0) v19.f16104r).f17584w;
                        C1023u0.m(x14);
                        x14.f17185z.a("Utils falling back to Random for random id");
                    }
                }
                v19.f17165u.set(jNextLong);
                c1023u7.T.incrementAndGet();
                v19.f16847s = true;
                if (c0985h0.f16847s) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                SharedPreferences sharedPreferences2 = ((C1023u0) c0985h0.f16104r).f17579r.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                c0985h0.f17400t = sharedPreferences2;
                boolean z16 = sharedPreferences2.getBoolean("has_been_opened", false);
                c0985h0.f17392I = z16;
                if (!z16) {
                    SharedPreferences.Editor editorEdit = c0985h0.f17400t.edit();
                    editorEdit.putBoolean("has_been_opened", true);
                    editorEdit.apply();
                }
                c0985h0.f17402v = new C0982g0(c0985h0, Math.max(0L, ((Long) G.f16937d.a(null)).longValue()));
                ((C1023u0) c0985h0.f16104r).T.incrementAndGet();
                c0985h0.f16847s = true;
                O o11 = c1023u6.f17573K;
                if (o11.f17002s) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                String str6 = "";
                C1023u0 c1023u8 = (C1023u0) o11.f16104r;
                X x15 = c1023u8.f17584w;
                X x16 = c1023u8.f17584w;
                C1023u0.m(x15);
                x15.f17178E.c(Long.valueOf(o11.f17038A), Long.valueOf(o11.f17052z), "sdkVersion bundled with app, dynamiteVersion");
                Context context3 = c1023u8.f17579r;
                String packageName = context3.getPackageName();
                PackageManager packageManager = context3.getPackageManager();
                String installerPackageName = "unknown";
                String str7 = "Unknown";
                try {
                    if (packageManager != null) {
                        e10 = e17;
                        w9 = w10;
                        try {
                            installerPackageName = packageManager.getInstallerPackageName(packageName);
                            break;
                        } catch (IllegalArgumentException unused) {
                            C1023u0.m(x16);
                            x16.f17182w.b(X.w(packageName), "Error retrieving app installer package name. appId");
                        }
                        String str8 = installerPackageName;
                        try {
                            if (str8 != null) {
                                if ("com.android.vending".equals(str8)) {
                                    installerPackageName = "";
                                }
                                packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                                if (packageInfo != null) {
                                    applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        string = applicationLabel.toString();
                                    } else {
                                        string = str7;
                                    }
                                    try {
                                        str4 = packageInfo.versionName;
                                        try {
                                            i10 = packageInfo.versionCode;
                                            str = string;
                                            str3 = str4;
                                            packageManager = packageManager;
                                            str2 = installerPackageName;
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            str7 = str4;
                                            C1023u0.m(x16);
                                            x16.f17182w.c(X.w(packageName), string, "Error retrieving package info. appId, appName");
                                            str = string;
                                            str2 = installerPackageName;
                                            str3 = str7;
                                            i10 = Integer.MIN_VALUE;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                    }
                                    break;
                                }
                                o11.f17046t = packageName;
                                o11.f17049w = str2;
                                o11.f17047u = str3;
                                o11.f17048v = i10;
                                o11.f17050x = str;
                                o11.f17051y = 0L;
                                iG = c1023u8.g();
                                if (iG == 0) {
                                    C1023u0.m(x16);
                                    x16.f17178E.a("App measurement collection enabled");
                                } else if (iG == 1) {
                                    C1023u0.m(x16);
                                    x16.f17176C.a("App measurement deactivated via the manifest");
                                } else if (iG == 3) {
                                    C1023u0.m(x16);
                                    x16.f17176C.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                } else if (iG == 4) {
                                    C1023u0.m(x16);
                                    x16.f17176C.a("App measurement disabled via the manifest");
                                } else if (iG == 6) {
                                    C1023u0.m(x16);
                                    x16.f17175B.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                } else if (iG == 7) {
                                    C1023u0.m(x16);
                                    x16.f17176C.a("App measurement disabled via the global data collection setting");
                                } else if (iG != 8) {
                                    C1023u0.m(x16);
                                    x16.f17176C.a("App measurement disabled");
                                    C1023u0.m(x16);
                                    x16.f17183x.a("Invalid scion state in identity");
                                } else {
                                    C1023u0.m(x16);
                                    x16.f17176C.a("App measurement disabled due to denied storage consent");
                                }
                                o11.f17042E = "";
                                strB = I0.b(context3, c1023u8.f17569G);
                                if (!TextUtils.isEmpty(strB)) {
                                    str6 = strB;
                                }
                                o11.f17042E = str6;
                                if (iG == 0) {
                                    C1023u0.m(x16);
                                    x16.f17178E.c(o11.f17046t, o11.f17042E, "App measurement enabled for app package, google app id");
                                    break;
                                }
                                listAsList = null;
                                o11.f17039B = null;
                                C0981g c0981g2 = c1023u8.f17582u;
                                c1023u0 = (C1023u0) c0981g2.f16104r;
                                y.c("analytics.safelisted_events");
                                bundleZ = c0981g2.z();
                                if (bundleZ != null) {
                                    if (bundleZ.containsKey("analytics.safelisted_events")) {
                                        numValueOf = Integer.valueOf(bundleZ.getInt("analytics.safelisted_events"));
                                    }
                                    if (numValueOf != null) {
                                        try {
                                            stringArray = c1023u0.f17579r.getResources().getStringArray(numValueOf.intValue());
                                            if (stringArray == null) {
                                                listAsList = Arrays.asList(stringArray);
                                                break;
                                            }
                                        } catch (Resources.NotFoundException e18) {
                                            X x17 = c1023u0.f17584w;
                                            C1023u0.m(x17);
                                            x17.f17182w.b(e18, "Failed to load string array from metadata: resource not found");
                                        }
                                    }
                                    if (listAsList != null) {
                                        o11.f17039B = listAsList;
                                    } else if (listAsList.isEmpty()) {
                                        C1023u0.m(x16);
                                        x16.f17175B.a("Safelisted event list is empty. Ignoring");
                                    } else {
                                        it2 = listAsList.iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                str5 = (String) it2.next();
                                                v18 = c1023u8.f17587z;
                                                C1023u0.k(v18);
                                            } else {
                                                o11.f17039B = listAsList;
                                            }
                                        } while (v18.r0("safelisted event", str5));
                                    }
                                    if (packageManager != null) {
                                        o11.f17041D = Z6.a.f(context3) ? 1 : 0;
                                    } else {
                                        o11.f17041D = 0;
                                    }
                                    ((C1023u0) o11.f16104r).T.incrementAndGet();
                                    o11.f17002s = true;
                                    c0974d1 = new C0974d1(c1023u6);
                                    c0974d1.q();
                                    c1023u6.f17574L = c0974d1;
                                    if (!c0974d1.f17002s) {
                                        throw new IllegalStateException("Can't initialize twice");
                                    }
                                    c0974d1.f17322t = (JobScheduler) ((C1023u0) c0974d1.f16104r).f17579r.getSystemService("jobscheduler");
                                    ((C1023u0) c0974d1.f16104r).T.incrementAndGet();
                                    c0974d1.f17002s = true;
                                    C1023u0.m(x13);
                                    v10 = x13.f17177D;
                                    v11 = x13.f17176C;
                                    v12 = x13.f17178E;
                                    v13 = x13.f17182w;
                                    c0981g.t();
                                    v11.b(133005L, "App measurement initialized, version");
                                    C1023u0.m(x13);
                                    v11.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    strU = o10.u();
                                    if (v19.Q(strU, c0981g.f17359t)) {
                                        C1023u0.m(x13);
                                        v11.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
                                        C1023u0.m(x13);
                                        v11.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strU)));
                                    }
                                    C1023u0.m(x13);
                                    v10.a("Debug-level message logging enabled");
                                    i11 = c1023u6.R;
                                    atomicInteger = c1023u6.T;
                                    if (i11 != atomicInteger.get()) {
                                        C1023u0.m(x13);
                                        v13.c(Integer.valueOf(c1023u6.R), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                                    }
                                    c1023u6.f17575M = true;
                                    j = c1023u6.U;
                                    g10 = G0.f16990t;
                                    y10 = c1023u6.f17566D;
                                    C1014r0 c1014r3 = c1023u6.f17585x;
                                    C1023u0.m(c1014r3);
                                    c1014r3.o();
                                    C1023u0.j(c1023u6.f17574L);
                                    iT = c1023u6.f17574L.t();
                                    R3.a();
                                    zY = c0981g.y(null, G.f16914R0);
                                    if (iT == 2) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (zY) {
                                        v19.o();
                                        if (v19.L() == 1) {
                                            v19.o();
                                            intentFilter = new IntentFilter();
                                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                            zzwVar = new zzw(c1023u7);
                                            z13 = z10;
                                            context2 = c1023u7.f17579r;
                                            v14 = v13;
                                            i13 = Build.VERSION.SDK_INT;
                                            v15 = v19;
                                            if (i13 >= 33) {
                                                Z6.a.j(context2, zzwVar, intentFilter);
                                            } else if (i13 >= 26) {
                                                Z6.a.i(context2, zzwVar, intentFilter);
                                            } else {
                                                context2.registerReceiver(zzwVar, intentFilter, null, null);
                                            }
                                            X x18 = c1023u7.f17584w;
                                            C1023u0.m(x18);
                                            x18.f17177D.a("Registered app receiver");
                                            if (z13) {
                                                C1023u0.j(c1023u6.f17574L);
                                                c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                            }
                                        } else if (z10) {
                                            z10 = true;
                                            v19.o();
                                            intentFilter = new IntentFilter();
                                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                            zzwVar = new zzw(c1023u7);
                                            z13 = z10;
                                            context2 = c1023u7.f17579r;
                                            v14 = v13;
                                            i13 = Build.VERSION.SDK_INT;
                                            v15 = v19;
                                            if (i13 >= 33) {
                                                Z6.a.j(context2, zzwVar, intentFilter);
                                            } else if (i13 >= 26) {
                                                Z6.a.i(context2, zzwVar, intentFilter);
                                            } else {
                                                context2.registerReceiver(zzwVar, intentFilter, null, null);
                                            }
                                            X x19 = c1023u7.f17584w;
                                            C1023u0.m(x19);
                                            x19.f17177D.a("Registered app receiver");
                                            if (z13) {
                                                C1023u0.j(c1023u6.f17574L);
                                                c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                            }
                                        } else {
                                            v14 = v13;
                                            v15 = v19;
                                        }
                                    } else if (z10) {
                                        z10 = true;
                                        v19.o();
                                        intentFilter = new IntentFilter();
                                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        zzwVar = new zzw(c1023u7);
                                        z13 = z10;
                                        context2 = c1023u7.f17579r;
                                        v14 = v13;
                                        i13 = Build.VERSION.SDK_INT;
                                        v15 = v19;
                                        if (i13 >= 33) {
                                            Z6.a.j(context2, zzwVar, intentFilter);
                                        } else if (i13 >= 26) {
                                            Z6.a.i(context2, zzwVar, intentFilter);
                                        } else {
                                            context2.registerReceiver(zzwVar, intentFilter, null, null);
                                        }
                                        X x110 = c1023u7.f17584w;
                                        C1023u0.m(x110);
                                        x110.f17177D.a("Registered app receiver");
                                        if (z13) {
                                            C1023u0.j(c1023u6.f17574L);
                                            c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                        }
                                    } else {
                                        v14 = v13;
                                        v15 = v19;
                                    }
                                    rVar = c0985h0.f17404x;
                                    h0V = c0985h0.v();
                                    i12 = h0V.f17000b;
                                    e0D = c0981g.D("google_analytics_default_allow_ad_storage", false);
                                    e0D2 = c0981g.D("google_analytics_default_allow_analytics_storage", false);
                                    e11 = e10;
                                    if (e0D == e11 || e0D2 != e11) {
                                        c1023u1 = c1023u7;
                                        rVar2 = rVar;
                                        c1023u2 = c1023u6;
                                        if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                                            EnumMap enumMap = new EnumMap(G0.class);
                                            enumMap.put(G0.f16989s, e0D);
                                            enumMap.put(g10, e0D2);
                                            h7 = new H0(enumMap, -10);
                                        }
                                        z11 = false;
                                        if (h7 != null) {
                                            C1023u0.l(y10);
                                            y10.K(h7, true);
                                        } else {
                                            h7 = h0V;
                                        }
                                        C1023u0.l(y10);
                                        c1023u3 = (C1023u0) y10.f16104r;
                                        y10.s(h7);
                                        c0985h0.o();
                                        int i16 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                        e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (e0D3 != e11) {
                                            C1023u0.m(x13);
                                            v12.b(e0D3, "Default ad personalization consent from Manifest");
                                        }
                                        e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                        if (e0D4 == e11 && H0.l(-10, i16)) {
                                            C1023u0.l(y10);
                                            EnumMap enumMap2 = new EnumMap(G0.class);
                                            enumMap2.put(G0.f16991u, e0D4);
                                            y10.J(new C1005o(enumMap2, -10, (Boolean) null, (String) null), true);
                                        } else if (TextUtils.isEmpty(c1023u2.r().v()) && (i16 == 0 || i16 == 30)) {
                                            C1023u0.l(y10);
                                            y10.J(new C1005o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        } else if (TextUtils.isEmpty(c1023u2.r().v()) && w9 != null && (bundle = w9.f14149u) != null && H0.l(30, i16)) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                        boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                        if (boolA != null || boolA.booleanValue()) {
                                            C1023u0.m(x13);
                                            v10.a("TCF client enabled.");
                                            C1023u0.l(y10);
                                            y10.o();
                                            X x20 = c1023u3.f17584w;
                                            C1023u0.m(x20);
                                            x20.f17177D.a("Register tcfPrefChangeListener.");
                                            if (y10.f17229L == null) {
                                                y10.f17230M = new M0(y10, c1023u3, 2);
                                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                        Y0 y12 = y10;
                                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                        C0981g c0981g3 = c1023u9.f17582u;
                                                        X x21 = c1023u9.f17584w;
                                                        if (!c0981g3.y(null, G.f16930a1)) {
                                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                C1023u0.m(x21);
                                                                x21.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                M0 m10 = y12.f17230M;
                                                                U6.y.f(m10);
                                                                m10.b(500L);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            C1023u0.m(x21);
                                                            x21.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m11 = y12.f17230M;
                                                            U6.y.f(m11);
                                                            m11.b(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            C0985h0 c0985h1 = c1023u3.f17583v;
                                            C1023u0.k(c0985h1);
                                            c0985h1.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                            C1023u0.l(y10);
                                            y10.u();
                                        }
                                        c0979f0 = c0985h0.f17403w;
                                        if (c0979f0.a() == 0) {
                                            C1023u0.m(x13);
                                            v12.b(Long.valueOf(j), "Persisting first open");
                                            c0979f0.b(j);
                                        }
                                        C1023u0.l(y10);
                                        c1020t0 = y10.f17226I;
                                        if (c1020t0.d() && c1020t0.c()) {
                                            C0985h0 c0985h2 = c1020t0.f17549r.f17583v;
                                            C1023u0.k(c0985h2);
                                            c0985h2.f17397N.k(null);
                                        }
                                        if (c1023u2.h()) {
                                            v16 = v15;
                                            c1023u4 = c1023u2;
                                            if (TextUtils.isEmpty(c1023u4.r().v())) {
                                                rVar3 = rVar2;
                                            } else {
                                                String strV = c1023u4.r().v();
                                                c0985h0.o();
                                                String string2 = c0985h0.s().getString("gmp_app_id", null);
                                                zIsEmpty = TextUtils.isEmpty(strV);
                                                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                                if (!zIsEmpty || zIsEmpty2) {
                                                    rVar3 = rVar2;
                                                } else {
                                                    y.f(strV);
                                                    if (strV.equals(string2)) {
                                                        rVar3 = rVar2;
                                                    } else {
                                                        C1023u0.m(x13);
                                                        v11.a("Rechecking which service to use due to a GMP App Id change");
                                                        c0985h0.o();
                                                        c0985h0.o();
                                                        Boolean boolValueOf = c0985h0.s().contains("measurement_enabled") ? Boolean.valueOf(c0985h0.s().getBoolean("measurement_enabled", true)) : null;
                                                        SharedPreferences.Editor editorEdit2 = c0985h0.s().edit();
                                                        editorEdit2.clear();
                                                        editorEdit2.apply();
                                                        if (boolValueOf != null) {
                                                            c0985h0.o();
                                                            SharedPreferences.Editor editorEdit3 = c0985h0.s().edit();
                                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                            editorEdit3.apply();
                                                        }
                                                        c1023u4.o().s();
                                                        c1023u4.f17571I.w();
                                                        c1023u4.f17571I.u();
                                                        c0979f0.b(j);
                                                        rVar3 = rVar2;
                                                        rVar3.k(null);
                                                    }
                                                }
                                                String strV2 = c1023u4.r().v();
                                                c0985h0.o();
                                                SharedPreferences.Editor editorEdit4 = c0985h0.s().edit();
                                                editorEdit4.putString("gmp_app_id", strV2);
                                                editorEdit4.apply();
                                            }
                                            if (!c0985h0.v().i(g10)) {
                                                rVar3.k(null);
                                            }
                                            C1023u0.l(y10);
                                            y10.f17236x.set(rVar3.j());
                                            try {
                                                c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused4) {
                                                r rVar5 = c0985h0.f17396M;
                                                if (!TextUtils.isEmpty(rVar5.j())) {
                                                    C1023u0.m(x13);
                                                    x9 = x13;
                                                    x9.f17185z.a("Remote config removed with active feature rollouts");
                                                    rVar5.k(null);
                                                }
                                                if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                                    zA = c1023u4.a();
                                                    sharedPreferences = c0985h0.f17400t;
                                                    if (sharedPreferences == null) {
                                                        zContains = z11;
                                                    } else {
                                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                    }
                                                    if (!zContains) {
                                                        c0985h0.x(!zA);
                                                    }
                                                    if (zA) {
                                                        C1023u0.l(y10);
                                                        y10.A();
                                                    }
                                                    B1 b5 = c1023u4.f17586y;
                                                    C1023u0.l(b5);
                                                    b5.f16834v.s();
                                                    c1023u4.p().s(new AtomicReference());
                                                    c1023u4.p().t(c0985h0.f17399P.L());
                                                }
                                                R3.a();
                                                if (c0981g.y(null, G.f16914R0)) {
                                                    v16.o();
                                                    if (v16.L() == 1) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = z11;
                                                    }
                                                    if (z12) {
                                                        long jIntValue = ((Integer) G.f16986y0.a(null)).intValue();
                                                        long jNextInt = new Random().nextInt(5000);
                                                        c1023u4.f17564B.getClass();
                                                        jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                        if (jMax > 500) {
                                                            C1023u0.m(x9);
                                                            v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                        }
                                                        C1023u0.l(y10);
                                                        y10.o();
                                                        if (y10.f17220C == null) {
                                                            y10.f17220C = new M0(y10, c1023u3, 0);
                                                        }
                                                        y10.f17220C.b(jMax);
                                                    }
                                                }
                                                c0985h0.f17389F.b(true);
                                                return;
                                            }
                                            x9 = x13;
                                            if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                                zA = c1023u4.a();
                                                sharedPreferences = c0985h0.f17400t;
                                                if (sharedPreferences == null) {
                                                    zContains = z11;
                                                } else {
                                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                }
                                                if (!zContains && !c0981g.B()) {
                                                    c0985h0.x(!zA);
                                                }
                                                if (zA) {
                                                    C1023u0.l(y10);
                                                    y10.A();
                                                }
                                                B1 b10 = c1023u4.f17586y;
                                                C1023u0.l(b10);
                                                b10.f16834v.s();
                                                c1023u4.p().s(new AtomicReference());
                                                c1023u4.p().t(c0985h0.f17399P.L());
                                            }
                                            break;
                                        } else {
                                            if (c1023u2.a()) {
                                                v16 = v15;
                                                if (v16.N("android.permission.INTERNET")) {
                                                    v17 = v14;
                                                } else {
                                                    C1023u0.m(x13);
                                                    v17 = v14;
                                                    v17.a("App is missing INTERNET permission");
                                                }
                                                if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                                    C1023u0.m(x13);
                                                    v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                                }
                                                c1023u4 = c1023u2;
                                                context = c1023u4.f17579r;
                                                if (!Z6.b.a(context).c() && !c0981g.r()) {
                                                    if (!V1.g0(context)) {
                                                        C1023u0.m(x13);
                                                        v17.a("AppMeasurementReceiver not registered/enabled");
                                                    }
                                                    if (!V1.H(context)) {
                                                        C1023u0.m(x13);
                                                        v17.a("AppMeasurementService not registered/enabled");
                                                    }
                                                }
                                                C1023u0.m(x13);
                                                v17.a("Uploading is not possible. App measurement disabled");
                                            } else {
                                                v16 = v15;
                                                c1023u4 = c1023u2;
                                            }
                                            x9 = x13;
                                        }
                                        R3.a();
                                        if (c0981g.y(null, G.f16914R0)) {
                                            v16.o();
                                            if (v16.L() == 1) {
                                                z12 = true;
                                            } else {
                                                z12 = z11;
                                            }
                                            if (z12) {
                                                long jIntValue2 = ((Integer) G.f16986y0.a(null)).intValue();
                                                long jNextInt2 = new Random().nextInt(5000);
                                                c1023u4.f17564B.getClass();
                                                jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    C1023u0.m(x9);
                                                    v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                C1023u0.l(y10);
                                                y10.o();
                                                if (y10.f17220C == null) {
                                                    y10.f17220C = new M0(y10, c1023u3, 0);
                                                }
                                                y10.f17220C.b(jMax);
                                            }
                                        }
                                        c0985h0.f17389F.b(true);
                                        return;
                                    }
                                    rVar2 = rVar;
                                    c1023u2 = c1023u6;
                                    c1023u1 = c1023u7;
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        z11 = false;
                                    } else {
                                        if (i12 == 0 && i12 != 30 && i12 != 10 && i12 != 40) {
                                            h7 = null;
                                            z11 = false;
                                            if (h7 != null) {
                                                C1023u0.l(y10);
                                                y10.K(h7, true);
                                            } else {
                                                h7 = h0V;
                                            }
                                            C1023u0.l(y10);
                                            c1023u3 = (C1023u0) y10.f16104r;
                                            y10.s(h7);
                                            c0985h0.o();
                                            int i17 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                            e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                            if (e0D3 != e11) {
                                                C1023u0.m(x13);
                                                v12.b(e0D3, "Default ad personalization consent from Manifest");
                                            }
                                            e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                            if (e0D4 == e11) {
                                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                        c1005oC = C1005o.c(30, bundle);
                                                        it = c1005oC.f17494e.values().iterator();
                                                        while (it.hasNext()) {
                                                            if (((E0) it.next()) != e11) {
                                                                C1023u0.l(y10);
                                                                y10.J(c1005oC, true);
                                                            }
                                                        }
                                                    }
                                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                    c1005oC = C1005o.c(30, bundle);
                                                    it = c1005oC.f17494e.values().iterator();
                                                    while (it.hasNext()) {
                                                        if (((E0) it.next()) != e11) {
                                                            C1023u0.l(y10);
                                                            y10.J(c1005oC, true);
                                                        }
                                                    }
                                                }
                                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                    c1005oC = C1005o.c(30, bundle);
                                                    it = c1005oC.f17494e.values().iterator();
                                                    while (it.hasNext()) {
                                                        if (((E0) it.next()) != e11) {
                                                            C1023u0.l(y10);
                                                            y10.J(c1005oC, true);
                                                        }
                                                    }
                                                }
                                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                            boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                            if (boolA != null) {
                                                C1023u0.m(x13);
                                                v10.a("TCF client enabled.");
                                                C1023u0.l(y10);
                                                y10.o();
                                                X x21 = c1023u3.f17584w;
                                                C1023u0.m(x21);
                                                x21.f17177D.a("Register tcfPrefChangeListener.");
                                                if (y10.f17229L == null) {
                                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                            Y0 y12 = y10;
                                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                            C0981g c0981g3 = c1023u9.f17582u;
                                                            X x22 = c1023u9.f17584w;
                                                            if (!c0981g3.y(null, G.f16930a1)) {
                                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                    C1023u0.m(x22);
                                                                    x22.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                    M0 m10 = y12.f17230M;
                                                                    U6.y.f(m10);
                                                                    m10.b(500L);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                C1023u0.m(x22);
                                                                x22.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                M0 m11 = y12.f17230M;
                                                                U6.y.f(m11);
                                                                m11.b(500L);
                                                            }
                                                        }
                                                    };
                                                }
                                                C0985h0 c0985h3 = c1023u3.f17583v;
                                                C1023u0.k(c0985h3);
                                                c0985h3.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                                C1023u0.l(y10);
                                                y10.u();
                                            } else {
                                                C1023u0.m(x13);
                                                v10.a("TCF client enabled.");
                                                C1023u0.l(y10);
                                                y10.o();
                                                X x22 = c1023u3.f17584w;
                                                C1023u0.m(x22);
                                                x22.f17177D.a("Register tcfPrefChangeListener.");
                                                if (y10.f17229L == null) {
                                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                            Y0 y12 = y10;
                                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                            C0981g c0981g3 = c1023u9.f17582u;
                                                            X x23 = c1023u9.f17584w;
                                                            if (!c0981g3.y(null, G.f16930a1)) {
                                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                    C1023u0.m(x23);
                                                                    x23.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                    M0 m10 = y12.f17230M;
                                                                    U6.y.f(m10);
                                                                    m10.b(500L);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                C1023u0.m(x23);
                                                                x23.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                M0 m11 = y12.f17230M;
                                                                U6.y.f(m11);
                                                                m11.b(500L);
                                                            }
                                                        }
                                                    };
                                                }
                                                C0985h0 c0985h4 = c1023u3.f17583v;
                                                C1023u0.k(c0985h4);
                                                c0985h4.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                                C1023u0.l(y10);
                                                y10.u();
                                            }
                                            c0979f0 = c0985h0.f17403w;
                                            if (c0979f0.a() == 0) {
                                                C1023u0.m(x13);
                                                v12.b(Long.valueOf(j), "Persisting first open");
                                                c0979f0.b(j);
                                            }
                                            C1023u0.l(y10);
                                            c1020t0 = y10.f17226I;
                                            if (c1020t0.d()) {
                                                C0985h0 c0985h5 = c1020t0.f17549r.f17583v;
                                                C1023u0.k(c0985h5);
                                                c0985h5.f17397N.k(null);
                                            }
                                            if (c1023u2.h()) {
                                                if (c1023u2.a()) {
                                                    v16 = v15;
                                                    if (v16.N("android.permission.INTERNET")) {
                                                        C1023u0.m(x13);
                                                        v17 = v14;
                                                        v17.a("App is missing INTERNET permission");
                                                    } else {
                                                        v17 = v14;
                                                    }
                                                    if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                                        C1023u0.m(x13);
                                                        v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                                    }
                                                    c1023u4 = c1023u2;
                                                    context = c1023u4.f17579r;
                                                    if (!Z6.b.a(context).c()) {
                                                        if (!V1.g0(context)) {
                                                            C1023u0.m(x13);
                                                            v17.a("AppMeasurementReceiver not registered/enabled");
                                                        }
                                                        if (!V1.H(context)) {
                                                            C1023u0.m(x13);
                                                            v17.a("AppMeasurementService not registered/enabled");
                                                        }
                                                    }
                                                    C1023u0.m(x13);
                                                    v17.a("Uploading is not possible. App measurement disabled");
                                                } else {
                                                    v16 = v15;
                                                    c1023u4 = c1023u2;
                                                }
                                                x9 = x13;
                                            } else {
                                                v16 = v15;
                                                c1023u4 = c1023u2;
                                                if (TextUtils.isEmpty(c1023u4.r().v())) {
                                                    String strV3 = c1023u4.r().v();
                                                    c0985h0.o();
                                                    String string3 = c0985h0.s().getString("gmp_app_id", null);
                                                    zIsEmpty = TextUtils.isEmpty(strV3);
                                                    boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                                    if (zIsEmpty) {
                                                        rVar3 = rVar2;
                                                    } else {
                                                        rVar3 = rVar2;
                                                    }
                                                    String strV4 = c1023u4.r().v();
                                                    c0985h0.o();
                                                    SharedPreferences.Editor editorEdit5 = c0985h0.s().edit();
                                                    editorEdit5.putString("gmp_app_id", strV4);
                                                    editorEdit5.apply();
                                                } else {
                                                    rVar3 = rVar2;
                                                }
                                                if (!c0985h0.v().i(g10)) {
                                                    rVar3.k(null);
                                                }
                                                C1023u0.l(y10);
                                                y10.f17236x.set(rVar3.j());
                                                c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                x9 = x13;
                                                if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                                    zA = c1023u4.a();
                                                    sharedPreferences = c0985h0.f17400t;
                                                    if (sharedPreferences == null) {
                                                        zContains = z11;
                                                    } else {
                                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                    }
                                                    if (!zContains) {
                                                        c0985h0.x(!zA);
                                                    }
                                                    if (zA) {
                                                        C1023u0.l(y10);
                                                        y10.A();
                                                    }
                                                    B1 b11 = c1023u4.f17586y;
                                                    C1023u0.l(b11);
                                                    b11.f16834v.s();
                                                    c1023u4.p().s(new AtomicReference());
                                                    c1023u4.p().t(c0985h0.f17399P.L());
                                                }
                                            }
                                            R3.a();
                                            if (c0981g.y(null, G.f16914R0)) {
                                                v16.o();
                                                if (v16.L() == 1) {
                                                    z12 = true;
                                                } else {
                                                    z12 = z11;
                                                }
                                                if (z12) {
                                                    long jIntValue3 = ((Integer) G.f16986y0.a(null)).intValue();
                                                    long jNextInt3 = new Random().nextInt(5000);
                                                    c1023u4.f17564B.getClass();
                                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                                    if (jMax > 500) {
                                                        C1023u0.m(x9);
                                                        v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                    }
                                                    C1023u0.l(y10);
                                                    y10.o();
                                                    if (y10.f17220C == null) {
                                                        y10.f17220C = new M0(y10, c1023u3, 0);
                                                    }
                                                    y10.f17220C.b(jMax);
                                                }
                                            }
                                            c0985h0.f17389F.b(true);
                                            return;
                                        }
                                        C1023u0.l(y10);
                                        z11 = false;
                                        y10.K(new H0(-10), false);
                                    }
                                    h7 = null;
                                    if (h7 != null) {
                                        C1023u0.l(y10);
                                        y10.K(h7, true);
                                    } else {
                                        h7 = h0V;
                                    }
                                    C1023u0.l(y10);
                                    c1023u3 = (C1023u0) y10.f16104r;
                                    y10.s(h7);
                                    c0985h0.o();
                                    int i18 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                    e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (e0D3 != e11) {
                                        C1023u0.m(x13);
                                        v12.b(e0D3, "Default ad personalization consent from Manifest");
                                    }
                                    e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                    if (e0D4 == e11) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                    boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                    if (boolA != null) {
                                        C1023u0.m(x13);
                                        v10.a("TCF client enabled.");
                                        C1023u0.l(y10);
                                        y10.o();
                                        X x23 = c1023u3.f17584w;
                                        C1023u0.m(x23);
                                        x23.f17177D.a("Register tcfPrefChangeListener.");
                                        if (y10.f17229L == null) {
                                            y10.f17230M = new M0(y10, c1023u3, 2);
                                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                    Y0 y12 = y10;
                                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                    C0981g c0981g3 = c1023u9.f17582u;
                                                    X x24 = c1023u9.f17584w;
                                                    if (!c0981g3.y(null, G.f16930a1)) {
                                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                                            C1023u0.m(x24);
                                                            x24.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m10 = y12.f17230M;
                                                            U6.y.f(m10);
                                                            m10.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        C1023u0.m(x24);
                                                        x24.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m11 = y12.f17230M;
                                                        U6.y.f(m11);
                                                        m11.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        C0985h0 c0985h6 = c1023u3.f17583v;
                                        C1023u0.k(c0985h6);
                                        c0985h6.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                        C1023u0.l(y10);
                                        y10.u();
                                    } else {
                                        C1023u0.m(x13);
                                        v10.a("TCF client enabled.");
                                        C1023u0.l(y10);
                                        y10.o();
                                        X x24 = c1023u3.f17584w;
                                        C1023u0.m(x24);
                                        x24.f17177D.a("Register tcfPrefChangeListener.");
                                        if (y10.f17229L == null) {
                                            y10.f17230M = new M0(y10, c1023u3, 2);
                                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                    Y0 y12 = y10;
                                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                    C0981g c0981g3 = c1023u9.f17582u;
                                                    X x25 = c1023u9.f17584w;
                                                    if (!c0981g3.y(null, G.f16930a1)) {
                                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                                            C1023u0.m(x25);
                                                            x25.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m10 = y12.f17230M;
                                                            U6.y.f(m10);
                                                            m10.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        C1023u0.m(x25);
                                                        x25.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m11 = y12.f17230M;
                                                        U6.y.f(m11);
                                                        m11.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        C0985h0 c0985h7 = c1023u3.f17583v;
                                        C1023u0.k(c0985h7);
                                        c0985h7.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                        C1023u0.l(y10);
                                        y10.u();
                                    }
                                    c0979f0 = c0985h0.f17403w;
                                    if (c0979f0.a() == 0) {
                                        C1023u0.m(x13);
                                        v12.b(Long.valueOf(j), "Persisting first open");
                                        c0979f0.b(j);
                                    }
                                    C1023u0.l(y10);
                                    c1020t0 = y10.f17226I;
                                    if (c1020t0.d()) {
                                        C0985h0 c0985h8 = c1020t0.f17549r.f17583v;
                                        C1023u0.k(c0985h8);
                                        c0985h8.f17397N.k(null);
                                    }
                                    if (c1023u2.h()) {
                                        if (c1023u2.a()) {
                                            v16 = v15;
                                            if (v16.N("android.permission.INTERNET")) {
                                                C1023u0.m(x13);
                                                v17 = v14;
                                                v17.a("App is missing INTERNET permission");
                                            } else {
                                                v17 = v14;
                                            }
                                            if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                                C1023u0.m(x13);
                                                v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            c1023u4 = c1023u2;
                                            context = c1023u4.f17579r;
                                            if (!Z6.b.a(context).c()) {
                                                if (!V1.g0(context)) {
                                                    C1023u0.m(x13);
                                                    v17.a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!V1.H(context)) {
                                                    C1023u0.m(x13);
                                                    v17.a("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            C1023u0.m(x13);
                                            v17.a("Uploading is not possible. App measurement disabled");
                                        } else {
                                            v16 = v15;
                                            c1023u4 = c1023u2;
                                        }
                                        x9 = x13;
                                    } else {
                                        v16 = v15;
                                        c1023u4 = c1023u2;
                                        if (TextUtils.isEmpty(c1023u4.r().v())) {
                                            String strV5 = c1023u4.r().v();
                                            c0985h0.o();
                                            String string4 = c0985h0.s().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strV5);
                                            boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                            if (zIsEmpty) {
                                                rVar3 = rVar2;
                                            } else {
                                                rVar3 = rVar2;
                                            }
                                            String strV6 = c1023u4.r().v();
                                            c0985h0.o();
                                            SharedPreferences.Editor editorEdit6 = c0985h0.s().edit();
                                            editorEdit6.putString("gmp_app_id", strV6);
                                            editorEdit6.apply();
                                        } else {
                                            rVar3 = rVar2;
                                        }
                                        if (!c0985h0.v().i(g10)) {
                                            rVar3.k(null);
                                        }
                                        C1023u0.l(y10);
                                        y10.f17236x.set(rVar3.j());
                                        c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        x9 = x13;
                                        if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                            zA = c1023u4.a();
                                            sharedPreferences = c0985h0.f17400t;
                                            if (sharedPreferences == null) {
                                                zContains = z11;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                c0985h0.x(!zA);
                                            }
                                            if (zA) {
                                                C1023u0.l(y10);
                                                y10.A();
                                            }
                                            B1 b12 = c1023u4.f17586y;
                                            C1023u0.l(b12);
                                            b12.f16834v.s();
                                            c1023u4.p().s(new AtomicReference());
                                            c1023u4.p().t(c0985h0.f17399P.L());
                                        }
                                    }
                                    R3.a();
                                    if (c0981g.y(null, G.f16914R0)) {
                                        v16.o();
                                        if (v16.L() == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = z11;
                                        }
                                        if (z12) {
                                            long jIntValue4 = ((Integer) G.f16986y0.a(null)).intValue();
                                            long jNextInt4 = new Random().nextInt(5000);
                                            c1023u4.f17564B.getClass();
                                            jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                C1023u0.m(x9);
                                                v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            C1023u0.l(y10);
                                            y10.o();
                                            if (y10.f17220C == null) {
                                                y10.f17220C = new M0(y10, c1023u3, 0);
                                            }
                                            y10.f17220C.b(jMax);
                                        }
                                    }
                                    c0985h0.f17389F.b(true);
                                    return;
                                }
                                X x25 = c1023u0.f17584w;
                                C1023u0.m(x25);
                                x25.f17182w.a("Failed to load metadata: Metadata bundle is null");
                                numValueOf = null;
                                if (numValueOf != null) {
                                    stringArray = c1023u0.f17579r.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                        break;
                                    }
                                }
                                if (listAsList != null) {
                                    o11.f17039B = listAsList;
                                } else if (listAsList.isEmpty()) {
                                    C1023u0.m(x16);
                                    x16.f17175B.a("Safelisted event list is empty. Ignoring");
                                } else {
                                    it2 = listAsList.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            str5 = (String) it2.next();
                                            v18 = c1023u8.f17587z;
                                            C1023u0.k(v18);
                                        } else {
                                            o11.f17039B = listAsList;
                                        }
                                    } while (v18.r0("safelisted event", str5));
                                }
                                if (packageManager != null) {
                                    o11.f17041D = Z6.a.f(context3) ? 1 : 0;
                                } else {
                                    o11.f17041D = 0;
                                }
                                ((C1023u0) o11.f16104r).T.incrementAndGet();
                                o11.f17002s = true;
                                c0974d1 = new C0974d1(c1023u6);
                                c0974d1.q();
                                c1023u6.f17574L = c0974d1;
                                if (!c0974d1.f17002s) {
                                    throw new IllegalStateException("Can't initialize twice");
                                }
                                c0974d1.f17322t = (JobScheduler) ((C1023u0) c0974d1.f16104r).f17579r.getSystemService("jobscheduler");
                                ((C1023u0) c0974d1.f16104r).T.incrementAndGet();
                                c0974d1.f17002s = true;
                                C1023u0.m(x13);
                                v10 = x13.f17177D;
                                v11 = x13.f17176C;
                                v12 = x13.f17178E;
                                v13 = x13.f17182w;
                                c0981g.t();
                                v11.b(133005L, "App measurement initialized, version");
                                C1023u0.m(x13);
                                v11.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                strU = o10.u();
                                if (v19.Q(strU, c0981g.f17359t)) {
                                    C1023u0.m(x13);
                                    v11.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    C1023u0.m(x13);
                                    v11.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strU)));
                                }
                                C1023u0.m(x13);
                                v10.a("Debug-level message logging enabled");
                                i11 = c1023u6.R;
                                atomicInteger = c1023u6.T;
                                if (i11 != atomicInteger.get()) {
                                    C1023u0.m(x13);
                                    v13.c(Integer.valueOf(c1023u6.R), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                                }
                                c1023u6.f17575M = true;
                                j = c1023u6.U;
                                g10 = G0.f16990t;
                                y10 = c1023u6.f17566D;
                                C1014r0 c1014r4 = c1023u6.f17585x;
                                C1023u0.m(c1014r4);
                                c1014r4.o();
                                C1023u0.j(c1023u6.f17574L);
                                iT = c1023u6.f17574L.t();
                                R3.a();
                                zY = c0981g.y(null, G.f16914R0);
                                if (iT == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (zY) {
                                    v19.o();
                                    if (v19.L() == 1) {
                                        v19.o();
                                        intentFilter = new IntentFilter();
                                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        zzwVar = new zzw(c1023u7);
                                        z13 = z10;
                                        context2 = c1023u7.f17579r;
                                        v14 = v13;
                                        i13 = Build.VERSION.SDK_INT;
                                        v15 = v19;
                                        if (i13 >= 33) {
                                            Z6.a.j(context2, zzwVar, intentFilter);
                                        } else if (i13 >= 26) {
                                            Z6.a.i(context2, zzwVar, intentFilter);
                                        } else {
                                            context2.registerReceiver(zzwVar, intentFilter, null, null);
                                        }
                                        X x111 = c1023u7.f17584w;
                                        C1023u0.m(x111);
                                        x111.f17177D.a("Registered app receiver");
                                        if (z13) {
                                            C1023u0.j(c1023u6.f17574L);
                                            c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                        }
                                    } else if (z10) {
                                        z10 = true;
                                        v19.o();
                                        intentFilter = new IntentFilter();
                                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        zzwVar = new zzw(c1023u7);
                                        z13 = z10;
                                        context2 = c1023u7.f17579r;
                                        v14 = v13;
                                        i13 = Build.VERSION.SDK_INT;
                                        v15 = v19;
                                        if (i13 >= 33) {
                                            Z6.a.j(context2, zzwVar, intentFilter);
                                        } else if (i13 >= 26) {
                                            Z6.a.i(context2, zzwVar, intentFilter);
                                        } else {
                                            context2.registerReceiver(zzwVar, intentFilter, null, null);
                                        }
                                        X x112 = c1023u7.f17584w;
                                        C1023u0.m(x112);
                                        x112.f17177D.a("Registered app receiver");
                                        if (z13) {
                                            C1023u0.j(c1023u6.f17574L);
                                            c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                        }
                                    } else {
                                        v14 = v13;
                                        v15 = v19;
                                    }
                                } else if (z10) {
                                    z10 = true;
                                    v19.o();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    zzwVar = new zzw(c1023u7);
                                    z13 = z10;
                                    context2 = c1023u7.f17579r;
                                    v14 = v13;
                                    i13 = Build.VERSION.SDK_INT;
                                    v15 = v19;
                                    if (i13 >= 33) {
                                        Z6.a.j(context2, zzwVar, intentFilter);
                                    } else if (i13 >= 26) {
                                        Z6.a.i(context2, zzwVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(zzwVar, intentFilter, null, null);
                                    }
                                    X x113 = c1023u7.f17584w;
                                    C1023u0.m(x113);
                                    x113.f17177D.a("Registered app receiver");
                                    if (z13) {
                                        C1023u0.j(c1023u6.f17574L);
                                        c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                    }
                                } else {
                                    v14 = v13;
                                    v15 = v19;
                                }
                                rVar = c0985h0.f17404x;
                                h0V = c0985h0.v();
                                i12 = h0V.f17000b;
                                e0D = c0981g.D("google_analytics_default_allow_ad_storage", false);
                                e0D2 = c0981g.D("google_analytics_default_allow_analytics_storage", false);
                                e11 = e10;
                                if (e0D == e11) {
                                    c1023u1 = c1023u7;
                                    rVar2 = rVar;
                                    c1023u2 = c1023u6;
                                    if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            if (i12 == 0) {
                                            }
                                            C1023u0.l(y10);
                                            z11 = false;
                                            y10.K(new H0(-10), false);
                                        } else {
                                            z11 = false;
                                        }
                                        h7 = null;
                                        if (h7 != null) {
                                            C1023u0.l(y10);
                                            y10.K(h7, true);
                                        } else {
                                            h7 = h0V;
                                        }
                                        C1023u0.l(y10);
                                        c1023u3 = (C1023u0) y10.f16104r;
                                        y10.s(h7);
                                        c0985h0.o();
                                        int i19 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                        e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (e0D3 != e11) {
                                            C1023u0.m(x13);
                                            v12.b(e0D3, "Default ad personalization consent from Manifest");
                                        }
                                        e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                        if (e0D4 == e11) {
                                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                    c1005oC = C1005o.c(30, bundle);
                                                    it = c1005oC.f17494e.values().iterator();
                                                    while (it.hasNext()) {
                                                        if (((E0) it.next()) != e11) {
                                                            C1023u0.l(y10);
                                                            y10.J(c1005oC, true);
                                                        }
                                                    }
                                                }
                                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                        boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                        if (boolA != null) {
                                            C1023u0.m(x13);
                                            v10.a("TCF client enabled.");
                                            C1023u0.l(y10);
                                            y10.o();
                                            X x26 = c1023u3.f17584w;
                                            C1023u0.m(x26);
                                            x26.f17177D.a("Register tcfPrefChangeListener.");
                                            if (y10.f17229L == null) {
                                                y10.f17230M = new M0(y10, c1023u3, 2);
                                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                        Y0 y12 = y10;
                                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                        C0981g c0981g3 = c1023u9.f17582u;
                                                        X x27 = c1023u9.f17584w;
                                                        if (!c0981g3.y(null, G.f16930a1)) {
                                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                C1023u0.m(x27);
                                                                x27.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                M0 m10 = y12.f17230M;
                                                                U6.y.f(m10);
                                                                m10.b(500L);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            C1023u0.m(x27);
                                                            x27.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m11 = y12.f17230M;
                                                            U6.y.f(m11);
                                                            m11.b(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            C0985h0 c0985h9 = c1023u3.f17583v;
                                            C1023u0.k(c0985h9);
                                            c0985h9.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                            C1023u0.l(y10);
                                            y10.u();
                                        } else {
                                            C1023u0.m(x13);
                                            v10.a("TCF client enabled.");
                                            C1023u0.l(y10);
                                            y10.o();
                                            X x27 = c1023u3.f17584w;
                                            C1023u0.m(x27);
                                            x27.f17177D.a("Register tcfPrefChangeListener.");
                                            if (y10.f17229L == null) {
                                                y10.f17230M = new M0(y10, c1023u3, 2);
                                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                        Y0 y12 = y10;
                                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                        C0981g c0981g3 = c1023u9.f17582u;
                                                        X x28 = c1023u9.f17584w;
                                                        if (!c0981g3.y(null, G.f16930a1)) {
                                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                C1023u0.m(x28);
                                                                x28.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                M0 m10 = y12.f17230M;
                                                                U6.y.f(m10);
                                                                m10.b(500L);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            C1023u0.m(x28);
                                                            x28.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m11 = y12.f17230M;
                                                            U6.y.f(m11);
                                                            m11.b(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            C0985h0 c0985h10 = c1023u3.f17583v;
                                            C1023u0.k(c0985h10);
                                            c0985h10.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                            C1023u0.l(y10);
                                            y10.u();
                                        }
                                        c0979f0 = c0985h0.f17403w;
                                        if (c0979f0.a() == 0) {
                                            C1023u0.m(x13);
                                            v12.b(Long.valueOf(j), "Persisting first open");
                                            c0979f0.b(j);
                                        }
                                        C1023u0.l(y10);
                                        c1020t0 = y10.f17226I;
                                        if (c1020t0.d()) {
                                            C0985h0 c0985h11 = c1020t0.f17549r.f17583v;
                                            C1023u0.k(c0985h11);
                                            c0985h11.f17397N.k(null);
                                        }
                                        if (c1023u2.h()) {
                                            if (c1023u2.a()) {
                                                v16 = v15;
                                                if (v16.N("android.permission.INTERNET")) {
                                                    C1023u0.m(x13);
                                                    v17 = v14;
                                                    v17.a("App is missing INTERNET permission");
                                                } else {
                                                    v17 = v14;
                                                }
                                                if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                                    C1023u0.m(x13);
                                                    v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                                }
                                                c1023u4 = c1023u2;
                                                context = c1023u4.f17579r;
                                                if (!Z6.b.a(context).c()) {
                                                    if (!V1.g0(context)) {
                                                        C1023u0.m(x13);
                                                        v17.a("AppMeasurementReceiver not registered/enabled");
                                                    }
                                                    if (!V1.H(context)) {
                                                        C1023u0.m(x13);
                                                        v17.a("AppMeasurementService not registered/enabled");
                                                    }
                                                }
                                                C1023u0.m(x13);
                                                v17.a("Uploading is not possible. App measurement disabled");
                                            } else {
                                                v16 = v15;
                                                c1023u4 = c1023u2;
                                            }
                                            x9 = x13;
                                        } else {
                                            v16 = v15;
                                            c1023u4 = c1023u2;
                                            if (TextUtils.isEmpty(c1023u4.r().v())) {
                                                String strV7 = c1023u4.r().v();
                                                c0985h0.o();
                                                String string5 = c0985h0.s().getString("gmp_app_id", null);
                                                zIsEmpty = TextUtils.isEmpty(strV7);
                                                boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                                                if (zIsEmpty) {
                                                    rVar3 = rVar2;
                                                } else {
                                                    rVar3 = rVar2;
                                                }
                                                String strV8 = c1023u4.r().v();
                                                c0985h0.o();
                                                SharedPreferences.Editor editorEdit7 = c0985h0.s().edit();
                                                editorEdit7.putString("gmp_app_id", strV8);
                                                editorEdit7.apply();
                                            } else {
                                                rVar3 = rVar2;
                                            }
                                            if (!c0985h0.v().i(g10)) {
                                                rVar3.k(null);
                                            }
                                            C1023u0.l(y10);
                                            y10.f17236x.set(rVar3.j());
                                            c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            x9 = x13;
                                            if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                                zA = c1023u4.a();
                                                sharedPreferences = c0985h0.f17400t;
                                                if (sharedPreferences == null) {
                                                    zContains = z11;
                                                } else {
                                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                }
                                                if (!zContains) {
                                                    c0985h0.x(!zA);
                                                }
                                                if (zA) {
                                                    C1023u0.l(y10);
                                                    y10.A();
                                                }
                                                B1 b13 = c1023u4.f17586y;
                                                C1023u0.l(b13);
                                                b13.f16834v.s();
                                                c1023u4.p().s(new AtomicReference());
                                                c1023u4.p().t(c0985h0.f17399P.L());
                                            }
                                        }
                                        R3.a();
                                        if (c0981g.y(null, G.f16914R0)) {
                                            v16.o();
                                            if (v16.L() == 1) {
                                                z12 = true;
                                            } else {
                                                z12 = z11;
                                            }
                                            if (z12) {
                                                long jIntValue5 = ((Integer) G.f16986y0.a(null)).intValue();
                                                long jNextInt5 = new Random().nextInt(5000);
                                                c1023u4.f17564B.getClass();
                                                jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    C1023u0.m(x9);
                                                    v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                C1023u0.l(y10);
                                                y10.o();
                                                if (y10.f17220C == null) {
                                                    y10.f17220C = new M0(y10, c1023u3, 0);
                                                }
                                                y10.f17220C.b(jMax);
                                            }
                                        }
                                        c0985h0.f17389F.b(true);
                                        return;
                                    }
                                    EnumMap enumMap3 = new EnumMap(G0.class);
                                    enumMap3.put(G0.f16989s, e0D);
                                    enumMap3.put(g10, e0D2);
                                    h7 = new H0(enumMap3, -10);
                                } else {
                                    c1023u1 = c1023u7;
                                    rVar2 = rVar;
                                    c1023u2 = c1023u6;
                                    if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            if (i12 == 0) {
                                            }
                                            C1023u0.l(y10);
                                            z11 = false;
                                            y10.K(new H0(-10), false);
                                        } else {
                                            z11 = false;
                                        }
                                        h7 = null;
                                        if (h7 != null) {
                                            C1023u0.l(y10);
                                            y10.K(h7, true);
                                        } else {
                                            h7 = h0V;
                                        }
                                        C1023u0.l(y10);
                                        c1023u3 = (C1023u0) y10.f16104r;
                                        y10.s(h7);
                                        c0985h0.o();
                                        int i110 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                        e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (e0D3 != e11) {
                                            C1023u0.m(x13);
                                            v12.b(e0D3, "Default ad personalization consent from Manifest");
                                        }
                                        e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                        if (e0D4 == e11) {
                                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                    c1005oC = C1005o.c(30, bundle);
                                                    it = c1005oC.f17494e.values().iterator();
                                                    while (it.hasNext()) {
                                                        if (((E0) it.next()) != e11) {
                                                            C1023u0.l(y10);
                                                            y10.J(c1005oC, true);
                                                        }
                                                    }
                                                }
                                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                        boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                        if (boolA != null) {
                                            C1023u0.m(x13);
                                            v10.a("TCF client enabled.");
                                            C1023u0.l(y10);
                                            y10.o();
                                            X x28 = c1023u3.f17584w;
                                            C1023u0.m(x28);
                                            x28.f17177D.a("Register tcfPrefChangeListener.");
                                            if (y10.f17229L == null) {
                                                y10.f17230M = new M0(y10, c1023u3, 2);
                                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                        Y0 y12 = y10;
                                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                        C0981g c0981g3 = c1023u9.f17582u;
                                                        X x29 = c1023u9.f17584w;
                                                        if (!c0981g3.y(null, G.f16930a1)) {
                                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                C1023u0.m(x29);
                                                                x29.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                M0 m10 = y12.f17230M;
                                                                U6.y.f(m10);
                                                                m10.b(500L);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            C1023u0.m(x29);
                                                            x29.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m11 = y12.f17230M;
                                                            U6.y.f(m11);
                                                            m11.b(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            C0985h0 c0985h12 = c1023u3.f17583v;
                                            C1023u0.k(c0985h12);
                                            c0985h12.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                            C1023u0.l(y10);
                                            y10.u();
                                        } else {
                                            C1023u0.m(x13);
                                            v10.a("TCF client enabled.");
                                            C1023u0.l(y10);
                                            y10.o();
                                            X x29 = c1023u3.f17584w;
                                            C1023u0.m(x29);
                                            x29.f17177D.a("Register tcfPrefChangeListener.");
                                            if (y10.f17229L == null) {
                                                y10.f17230M = new M0(y10, c1023u3, 2);
                                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                        Y0 y12 = y10;
                                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                        C0981g c0981g3 = c1023u9.f17582u;
                                                        X x210 = c1023u9.f17584w;
                                                        if (!c0981g3.y(null, G.f16930a1)) {
                                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                C1023u0.m(x210);
                                                                x210.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                                M0 m10 = y12.f17230M;
                                                                U6.y.f(m10);
                                                                m10.b(500L);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            C1023u0.m(x210);
                                                            x210.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m11 = y12.f17230M;
                                                            U6.y.f(m11);
                                                            m11.b(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            C0985h0 c0985h13 = c1023u3.f17583v;
                                            C1023u0.k(c0985h13);
                                            c0985h13.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                            C1023u0.l(y10);
                                            y10.u();
                                        }
                                        c0979f0 = c0985h0.f17403w;
                                        if (c0979f0.a() == 0) {
                                            C1023u0.m(x13);
                                            v12.b(Long.valueOf(j), "Persisting first open");
                                            c0979f0.b(j);
                                        }
                                        C1023u0.l(y10);
                                        c1020t0 = y10.f17226I;
                                        if (c1020t0.d()) {
                                            C0985h0 c0985h14 = c1020t0.f17549r.f17583v;
                                            C1023u0.k(c0985h14);
                                            c0985h14.f17397N.k(null);
                                        }
                                        if (c1023u2.h()) {
                                            if (c1023u2.a()) {
                                                v16 = v15;
                                                if (v16.N("android.permission.INTERNET")) {
                                                    C1023u0.m(x13);
                                                    v17 = v14;
                                                    v17.a("App is missing INTERNET permission");
                                                } else {
                                                    v17 = v14;
                                                }
                                                if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                                    C1023u0.m(x13);
                                                    v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                                }
                                                c1023u4 = c1023u2;
                                                context = c1023u4.f17579r;
                                                if (!Z6.b.a(context).c()) {
                                                    if (!V1.g0(context)) {
                                                        C1023u0.m(x13);
                                                        v17.a("AppMeasurementReceiver not registered/enabled");
                                                    }
                                                    if (!V1.H(context)) {
                                                        C1023u0.m(x13);
                                                        v17.a("AppMeasurementService not registered/enabled");
                                                    }
                                                }
                                                C1023u0.m(x13);
                                                v17.a("Uploading is not possible. App measurement disabled");
                                            } else {
                                                v16 = v15;
                                                c1023u4 = c1023u2;
                                            }
                                            x9 = x13;
                                        } else {
                                            v16 = v15;
                                            c1023u4 = c1023u2;
                                            if (TextUtils.isEmpty(c1023u4.r().v())) {
                                                String strV9 = c1023u4.r().v();
                                                c0985h0.o();
                                                String string6 = c0985h0.s().getString("gmp_app_id", null);
                                                zIsEmpty = TextUtils.isEmpty(strV9);
                                                boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                                                if (zIsEmpty) {
                                                    rVar3 = rVar2;
                                                } else {
                                                    rVar3 = rVar2;
                                                }
                                                String strV10 = c1023u4.r().v();
                                                c0985h0.o();
                                                SharedPreferences.Editor editorEdit8 = c0985h0.s().edit();
                                                editorEdit8.putString("gmp_app_id", strV10);
                                                editorEdit8.apply();
                                            } else {
                                                rVar3 = rVar2;
                                            }
                                            if (!c0985h0.v().i(g10)) {
                                                rVar3.k(null);
                                            }
                                            C1023u0.l(y10);
                                            y10.f17236x.set(rVar3.j());
                                            c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            x9 = x13;
                                            if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                                zA = c1023u4.a();
                                                sharedPreferences = c0985h0.f17400t;
                                                if (sharedPreferences == null) {
                                                    zContains = z11;
                                                } else {
                                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                }
                                                if (!zContains) {
                                                    c0985h0.x(!zA);
                                                }
                                                if (zA) {
                                                    C1023u0.l(y10);
                                                    y10.A();
                                                }
                                                B1 b14 = c1023u4.f17586y;
                                                C1023u0.l(b14);
                                                b14.f16834v.s();
                                                c1023u4.p().s(new AtomicReference());
                                                c1023u4.p().t(c0985h0.f17399P.L());
                                            }
                                        }
                                        R3.a();
                                        if (c0981g.y(null, G.f16914R0)) {
                                            v16.o();
                                            if (v16.L() == 1) {
                                                z12 = true;
                                            } else {
                                                z12 = z11;
                                            }
                                            if (z12) {
                                                long jIntValue6 = ((Integer) G.f16986y0.a(null)).intValue();
                                                long jNextInt6 = new Random().nextInt(5000);
                                                c1023u4.f17564B.getClass();
                                                jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    C1023u0.m(x9);
                                                    v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                C1023u0.l(y10);
                                                y10.o();
                                                if (y10.f17220C == null) {
                                                    y10.f17220C = new M0(y10, c1023u3, 0);
                                                }
                                                y10.f17220C.b(jMax);
                                            }
                                        }
                                        c0985h0.f17389F.b(true);
                                        return;
                                    }
                                    EnumMap enumMap4 = new EnumMap(G0.class);
                                    enumMap4.put(G0.f16989s, e0D);
                                    enumMap4.put(g10, e0D2);
                                    h7 = new H0(enumMap4, -10);
                                }
                                z11 = false;
                                if (h7 != null) {
                                    C1023u0.l(y10);
                                    y10.K(h7, true);
                                } else {
                                    h7 = h0V;
                                }
                                C1023u0.l(y10);
                                c1023u3 = (C1023u0) y10.f16104r;
                                y10.s(h7);
                                c0985h0.o();
                                int i111 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                if (e0D3 != e11) {
                                    C1023u0.m(x13);
                                    v12.b(e0D3, "Default ad personalization consent from Manifest");
                                }
                                e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                if (e0D4 == e11) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                                boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                if (boolA != null) {
                                    C1023u0.m(x13);
                                    v10.a("TCF client enabled.");
                                    C1023u0.l(y10);
                                    y10.o();
                                    X x210 = c1023u3.f17584w;
                                    C1023u0.m(x210);
                                    x210.f17177D.a("Register tcfPrefChangeListener.");
                                    if (y10.f17229L == null) {
                                        y10.f17230M = new M0(y10, c1023u3, 2);
                                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                Y0 y12 = y10;
                                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                C0981g c0981g3 = c1023u9.f17582u;
                                                X x211 = c1023u9.f17584w;
                                                if (!c0981g3.y(null, G.f16930a1)) {
                                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                                        C1023u0.m(x211);
                                                        x211.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m10 = y12.f17230M;
                                                        U6.y.f(m10);
                                                        m10.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    C1023u0.m(x211);
                                                    x211.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m11 = y12.f17230M;
                                                    U6.y.f(m11);
                                                    m11.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    C0985h0 c0985h15 = c1023u3.f17583v;
                                    C1023u0.k(c0985h15);
                                    c0985h15.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                    C1023u0.l(y10);
                                    y10.u();
                                } else {
                                    C1023u0.m(x13);
                                    v10.a("TCF client enabled.");
                                    C1023u0.l(y10);
                                    y10.o();
                                    X x211 = c1023u3.f17584w;
                                    C1023u0.m(x211);
                                    x211.f17177D.a("Register tcfPrefChangeListener.");
                                    if (y10.f17229L == null) {
                                        y10.f17230M = new M0(y10, c1023u3, 2);
                                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                Y0 y12 = y10;
                                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                C0981g c0981g3 = c1023u9.f17582u;
                                                X x212 = c1023u9.f17584w;
                                                if (!c0981g3.y(null, G.f16930a1)) {
                                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                                        C1023u0.m(x212);
                                                        x212.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m10 = y12.f17230M;
                                                        U6.y.f(m10);
                                                        m10.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    C1023u0.m(x212);
                                                    x212.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m11 = y12.f17230M;
                                                    U6.y.f(m11);
                                                    m11.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    C0985h0 c0985h16 = c1023u3.f17583v;
                                    C1023u0.k(c0985h16);
                                    c0985h16.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                    C1023u0.l(y10);
                                    y10.u();
                                }
                                c0979f0 = c0985h0.f17403w;
                                if (c0979f0.a() == 0) {
                                    C1023u0.m(x13);
                                    v12.b(Long.valueOf(j), "Persisting first open");
                                    c0979f0.b(j);
                                }
                                C1023u0.l(y10);
                                c1020t0 = y10.f17226I;
                                if (c1020t0.d()) {
                                    C0985h0 c0985h17 = c1020t0.f17549r.f17583v;
                                    C1023u0.k(c0985h17);
                                    c0985h17.f17397N.k(null);
                                }
                                if (c1023u2.h()) {
                                    if (c1023u2.a()) {
                                        v16 = v15;
                                        if (v16.N("android.permission.INTERNET")) {
                                            C1023u0.m(x13);
                                            v17 = v14;
                                            v17.a("App is missing INTERNET permission");
                                        } else {
                                            v17 = v14;
                                        }
                                        if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                            C1023u0.m(x13);
                                            v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        c1023u4 = c1023u2;
                                        context = c1023u4.f17579r;
                                        if (!Z6.b.a(context).c()) {
                                            if (!V1.g0(context)) {
                                                C1023u0.m(x13);
                                                v17.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!V1.H(context)) {
                                                C1023u0.m(x13);
                                                v17.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        C1023u0.m(x13);
                                        v17.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        v16 = v15;
                                        c1023u4 = c1023u2;
                                    }
                                    x9 = x13;
                                } else {
                                    v16 = v15;
                                    c1023u4 = c1023u2;
                                    if (TextUtils.isEmpty(c1023u4.r().v())) {
                                        String strV11 = c1023u4.r().v();
                                        c0985h0.o();
                                        String string7 = c0985h0.s().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strV11);
                                        boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                                        if (zIsEmpty) {
                                            rVar3 = rVar2;
                                        } else {
                                            rVar3 = rVar2;
                                        }
                                        String strV12 = c1023u4.r().v();
                                        c0985h0.o();
                                        SharedPreferences.Editor editorEdit9 = c0985h0.s().edit();
                                        editorEdit9.putString("gmp_app_id", strV12);
                                        editorEdit9.apply();
                                    } else {
                                        rVar3 = rVar2;
                                    }
                                    if (!c0985h0.v().i(g10)) {
                                        rVar3.k(null);
                                    }
                                    C1023u0.l(y10);
                                    y10.f17236x.set(rVar3.j());
                                    c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    x9 = x13;
                                    if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                        zA = c1023u4.a();
                                        sharedPreferences = c0985h0.f17400t;
                                        if (sharedPreferences == null) {
                                            zContains = z11;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            c0985h0.x(!zA);
                                        }
                                        if (zA) {
                                            C1023u0.l(y10);
                                            y10.A();
                                        }
                                        B1 b15 = c1023u4.f17586y;
                                        C1023u0.l(b15);
                                        b15.f16834v.s();
                                        c1023u4.p().s(new AtomicReference());
                                        c1023u4.p().t(c0985h0.f17399P.L());
                                    }
                                }
                                R3.a();
                                if (c0981g.y(null, G.f16914R0)) {
                                    v16.o();
                                    if (v16.L() == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = z11;
                                    }
                                    if (z12) {
                                        long jIntValue7 = ((Integer) G.f16986y0.a(null)).intValue();
                                        long jNextInt7 = new Random().nextInt(5000);
                                        c1023u4.f17564B.getClass();
                                        jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            C1023u0.m(x9);
                                            v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        C1023u0.l(y10);
                                        y10.o();
                                        if (y10.f17220C == null) {
                                            y10.f17220C = new M0(y10, c1023u3, 0);
                                        }
                                        y10.f17220C.b(jMax);
                                    }
                                }
                                c0985h0.f17389F.b(true);
                                return;
                            }
                            str8 = "manual_install";
                            packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                            if (packageInfo != null) {
                                applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    string = applicationLabel.toString();
                                } else {
                                    string = str7;
                                }
                                str4 = packageInfo.versionName;
                                i10 = packageInfo.versionCode;
                                str = string;
                                str3 = str4;
                                packageManager = packageManager;
                                str2 = installerPackageName;
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused5) {
                            string = str7;
                        }
                        installerPackageName = str8;
                        o11.f17046t = packageName;
                        o11.f17049w = str2;
                        o11.f17047u = str3;
                        o11.f17048v = i10;
                        o11.f17050x = str;
                        o11.f17051y = 0L;
                        iG = c1023u8.g();
                        if (iG == 0) {
                            C1023u0.m(x16);
                            x16.f17178E.a("App measurement collection enabled");
                        } else if (iG == 1) {
                            C1023u0.m(x16);
                            x16.f17176C.a("App measurement deactivated via the manifest");
                        } else if (iG == 3) {
                            C1023u0.m(x16);
                            x16.f17176C.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iG == 4) {
                            C1023u0.m(x16);
                            x16.f17176C.a("App measurement disabled via the manifest");
                        } else if (iG == 6) {
                            C1023u0.m(x16);
                            x16.f17175B.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iG == 7) {
                            C1023u0.m(x16);
                            x16.f17176C.a("App measurement disabled via the global data collection setting");
                        } else if (iG != 8) {
                            C1023u0.m(x16);
                            x16.f17176C.a("App measurement disabled");
                            C1023u0.m(x16);
                            x16.f17183x.a("Invalid scion state in identity");
                        } else {
                            C1023u0.m(x16);
                            x16.f17176C.a("App measurement disabled due to denied storage consent");
                        }
                        o11.f17042E = "";
                        strB = I0.b(context3, c1023u8.f17569G);
                        if (!TextUtils.isEmpty(strB)) {
                            str6 = strB;
                        }
                        o11.f17042E = str6;
                        if (iG == 0) {
                            C1023u0.m(x16);
                            x16.f17178E.c(o11.f17046t, o11.f17042E, "App measurement enabled for app package, google app id");
                            break;
                        }
                        listAsList = null;
                        o11.f17039B = null;
                        C0981g c0981g3 = c1023u8.f17582u;
                        c1023u0 = (C1023u0) c0981g3.f16104r;
                        y.c("analytics.safelisted_events");
                        bundleZ = c0981g3.z();
                        if (bundleZ != null) {
                            if (bundleZ.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleZ.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                stringArray = c1023u0.f17579r.getResources().getStringArray(numValueOf.intValue());
                                if (stringArray == null) {
                                    listAsList = Arrays.asList(stringArray);
                                    break;
                                }
                            }
                            if (listAsList != null) {
                                o11.f17039B = listAsList;
                            } else if (listAsList.isEmpty()) {
                                C1023u0.m(x16);
                                x16.f17175B.a("Safelisted event list is empty. Ignoring");
                            } else {
                                it2 = listAsList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        str5 = (String) it2.next();
                                        v18 = c1023u8.f17587z;
                                        C1023u0.k(v18);
                                    } else {
                                        o11.f17039B = listAsList;
                                    }
                                } while (v18.r0("safelisted event", str5));
                            }
                            if (packageManager != null) {
                                o11.f17041D = Z6.a.f(context3) ? 1 : 0;
                            } else {
                                o11.f17041D = 0;
                            }
                            ((C1023u0) o11.f16104r).T.incrementAndGet();
                            o11.f17002s = true;
                            c0974d1 = new C0974d1(c1023u6);
                            c0974d1.q();
                            c1023u6.f17574L = c0974d1;
                            if (!c0974d1.f17002s) {
                                throw new IllegalStateException("Can't initialize twice");
                            }
                            c0974d1.f17322t = (JobScheduler) ((C1023u0) c0974d1.f16104r).f17579r.getSystemService("jobscheduler");
                            ((C1023u0) c0974d1.f16104r).T.incrementAndGet();
                            c0974d1.f17002s = true;
                            C1023u0.m(x13);
                            v10 = x13.f17177D;
                            v11 = x13.f17176C;
                            v12 = x13.f17178E;
                            v13 = x13.f17182w;
                            c0981g.t();
                            v11.b(133005L, "App measurement initialized, version");
                            C1023u0.m(x13);
                            v11.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strU = o10.u();
                            if (v19.Q(strU, c0981g.f17359t)) {
                                C1023u0.m(x13);
                                v11.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                C1023u0.m(x13);
                                v11.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strU)));
                            }
                            C1023u0.m(x13);
                            v10.a("Debug-level message logging enabled");
                            i11 = c1023u6.R;
                            atomicInteger = c1023u6.T;
                            if (i11 != atomicInteger.get()) {
                                C1023u0.m(x13);
                                v13.c(Integer.valueOf(c1023u6.R), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            c1023u6.f17575M = true;
                            j = c1023u6.U;
                            g10 = G0.f16990t;
                            y10 = c1023u6.f17566D;
                            C1014r0 c1014r5 = c1023u6.f17585x;
                            C1023u0.m(c1014r5);
                            c1014r5.o();
                            C1023u0.j(c1023u6.f17574L);
                            iT = c1023u6.f17574L.t();
                            R3.a();
                            zY = c0981g.y(null, G.f16914R0);
                            if (iT == 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (zY) {
                                v19.o();
                                if (v19.L() == 1) {
                                    v19.o();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    zzwVar = new zzw(c1023u7);
                                    z13 = z10;
                                    context2 = c1023u7.f17579r;
                                    v14 = v13;
                                    i13 = Build.VERSION.SDK_INT;
                                    v15 = v19;
                                    if (i13 >= 33) {
                                        Z6.a.j(context2, zzwVar, intentFilter);
                                    } else if (i13 >= 26) {
                                        Z6.a.i(context2, zzwVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(zzwVar, intentFilter, null, null);
                                    }
                                    X x114 = c1023u7.f17584w;
                                    C1023u0.m(x114);
                                    x114.f17177D.a("Registered app receiver");
                                    if (z13) {
                                        C1023u0.j(c1023u6.f17574L);
                                        c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                    }
                                } else if (z10) {
                                    z10 = true;
                                    v19.o();
                                    intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    zzwVar = new zzw(c1023u7);
                                    z13 = z10;
                                    context2 = c1023u7.f17579r;
                                    v14 = v13;
                                    i13 = Build.VERSION.SDK_INT;
                                    v15 = v19;
                                    if (i13 >= 33) {
                                        Z6.a.j(context2, zzwVar, intentFilter);
                                    } else if (i13 >= 26) {
                                        Z6.a.i(context2, zzwVar, intentFilter);
                                    } else {
                                        context2.registerReceiver(zzwVar, intentFilter, null, null);
                                    }
                                    X x115 = c1023u7.f17584w;
                                    C1023u0.m(x115);
                                    x115.f17177D.a("Registered app receiver");
                                    if (z13) {
                                        C1023u0.j(c1023u6.f17574L);
                                        c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                    }
                                } else {
                                    v14 = v13;
                                    v15 = v19;
                                }
                            } else if (z10) {
                                z10 = true;
                                v19.o();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                zzwVar = new zzw(c1023u7);
                                z13 = z10;
                                context2 = c1023u7.f17579r;
                                v14 = v13;
                                i13 = Build.VERSION.SDK_INT;
                                v15 = v19;
                                if (i13 >= 33) {
                                    Z6.a.j(context2, zzwVar, intentFilter);
                                } else if (i13 >= 26) {
                                    Z6.a.i(context2, zzwVar, intentFilter);
                                } else {
                                    context2.registerReceiver(zzwVar, intentFilter, null, null);
                                }
                                X x116 = c1023u7.f17584w;
                                C1023u0.m(x116);
                                x116.f17177D.a("Registered app receiver");
                                if (z13) {
                                    C1023u0.j(c1023u6.f17574L);
                                    c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                }
                            } else {
                                v14 = v13;
                                v15 = v19;
                            }
                            rVar = c0985h0.f17404x;
                            h0V = c0985h0.v();
                            i12 = h0V.f17000b;
                            e0D = c0981g.D("google_analytics_default_allow_ad_storage", false);
                            e0D2 = c0981g.D("google_analytics_default_allow_analytics_storage", false);
                            e11 = e10;
                            if (e0D == e11) {
                                c1023u1 = c1023u7;
                                rVar2 = rVar;
                                c1023u2 = c1023u6;
                                if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (i12 == 0) {
                                        }
                                        C1023u0.l(y10);
                                        z11 = false;
                                        y10.K(new H0(-10), false);
                                    } else {
                                        z11 = false;
                                    }
                                    h7 = null;
                                    if (h7 != null) {
                                        C1023u0.l(y10);
                                        y10.K(h7, true);
                                    } else {
                                        h7 = h0V;
                                    }
                                    C1023u0.l(y10);
                                    c1023u3 = (C1023u0) y10.f16104r;
                                    y10.s(h7);
                                    c0985h0.o();
                                    int i112 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                    e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (e0D3 != e11) {
                                        C1023u0.m(x13);
                                        v12.b(e0D3, "Default ad personalization consent from Manifest");
                                    }
                                    e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                    if (e0D4 == e11) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                    boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                    if (boolA != null) {
                                        C1023u0.m(x13);
                                        v10.a("TCF client enabled.");
                                        C1023u0.l(y10);
                                        y10.o();
                                        X x212 = c1023u3.f17584w;
                                        C1023u0.m(x212);
                                        x212.f17177D.a("Register tcfPrefChangeListener.");
                                        if (y10.f17229L == null) {
                                            y10.f17230M = new M0(y10, c1023u3, 2);
                                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                    Y0 y12 = y10;
                                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                    C0981g c0981g4 = c1023u9.f17582u;
                                                    X x213 = c1023u9.f17584w;
                                                    if (!c0981g4.y(null, G.f16930a1)) {
                                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                                            C1023u0.m(x213);
                                                            x213.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m10 = y12.f17230M;
                                                            U6.y.f(m10);
                                                            m10.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        C1023u0.m(x213);
                                                        x213.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m11 = y12.f17230M;
                                                        U6.y.f(m11);
                                                        m11.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        C0985h0 c0985h18 = c1023u3.f17583v;
                                        C1023u0.k(c0985h18);
                                        c0985h18.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                        C1023u0.l(y10);
                                        y10.u();
                                    } else {
                                        C1023u0.m(x13);
                                        v10.a("TCF client enabled.");
                                        C1023u0.l(y10);
                                        y10.o();
                                        X x213 = c1023u3.f17584w;
                                        C1023u0.m(x213);
                                        x213.f17177D.a("Register tcfPrefChangeListener.");
                                        if (y10.f17229L == null) {
                                            y10.f17230M = new M0(y10, c1023u3, 2);
                                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                    Y0 y12 = y10;
                                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                    C0981g c0981g4 = c1023u9.f17582u;
                                                    X x214 = c1023u9.f17584w;
                                                    if (!c0981g4.y(null, G.f16930a1)) {
                                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                                            C1023u0.m(x214);
                                                            x214.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m10 = y12.f17230M;
                                                            U6.y.f(m10);
                                                            m10.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        C1023u0.m(x214);
                                                        x214.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m11 = y12.f17230M;
                                                        U6.y.f(m11);
                                                        m11.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        C0985h0 c0985h19 = c1023u3.f17583v;
                                        C1023u0.k(c0985h19);
                                        c0985h19.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                        C1023u0.l(y10);
                                        y10.u();
                                    }
                                    c0979f0 = c0985h0.f17403w;
                                    if (c0979f0.a() == 0) {
                                        C1023u0.m(x13);
                                        v12.b(Long.valueOf(j), "Persisting first open");
                                        c0979f0.b(j);
                                    }
                                    C1023u0.l(y10);
                                    c1020t0 = y10.f17226I;
                                    if (c1020t0.d()) {
                                        C0985h0 c0985h110 = c1020t0.f17549r.f17583v;
                                        C1023u0.k(c0985h110);
                                        c0985h110.f17397N.k(null);
                                    }
                                    if (c1023u2.h()) {
                                        if (c1023u2.a()) {
                                            v16 = v15;
                                            if (v16.N("android.permission.INTERNET")) {
                                                C1023u0.m(x13);
                                                v17 = v14;
                                                v17.a("App is missing INTERNET permission");
                                            } else {
                                                v17 = v14;
                                            }
                                            if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                                C1023u0.m(x13);
                                                v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            c1023u4 = c1023u2;
                                            context = c1023u4.f17579r;
                                            if (!Z6.b.a(context).c()) {
                                                if (!V1.g0(context)) {
                                                    C1023u0.m(x13);
                                                    v17.a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!V1.H(context)) {
                                                    C1023u0.m(x13);
                                                    v17.a("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            C1023u0.m(x13);
                                            v17.a("Uploading is not possible. App measurement disabled");
                                        } else {
                                            v16 = v15;
                                            c1023u4 = c1023u2;
                                        }
                                        x9 = x13;
                                    } else {
                                        v16 = v15;
                                        c1023u4 = c1023u2;
                                        if (TextUtils.isEmpty(c1023u4.r().v())) {
                                            String strV13 = c1023u4.r().v();
                                            c0985h0.o();
                                            String string8 = c0985h0.s().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strV13);
                                            boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                                            if (zIsEmpty) {
                                                rVar3 = rVar2;
                                            } else {
                                                rVar3 = rVar2;
                                            }
                                            String strV14 = c1023u4.r().v();
                                            c0985h0.o();
                                            SharedPreferences.Editor editorEdit10 = c0985h0.s().edit();
                                            editorEdit10.putString("gmp_app_id", strV14);
                                            editorEdit10.apply();
                                        } else {
                                            rVar3 = rVar2;
                                        }
                                        if (!c0985h0.v().i(g10)) {
                                            rVar3.k(null);
                                        }
                                        C1023u0.l(y10);
                                        y10.f17236x.set(rVar3.j());
                                        c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        x9 = x13;
                                        if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                            zA = c1023u4.a();
                                            sharedPreferences = c0985h0.f17400t;
                                            if (sharedPreferences == null) {
                                                zContains = z11;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                c0985h0.x(!zA);
                                            }
                                            if (zA) {
                                                C1023u0.l(y10);
                                                y10.A();
                                            }
                                            B1 b16 = c1023u4.f17586y;
                                            C1023u0.l(b16);
                                            b16.f16834v.s();
                                            c1023u4.p().s(new AtomicReference());
                                            c1023u4.p().t(c0985h0.f17399P.L());
                                        }
                                    }
                                    R3.a();
                                    if (c0981g.y(null, G.f16914R0)) {
                                        v16.o();
                                        if (v16.L() == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = z11;
                                        }
                                        if (z12) {
                                            long jIntValue8 = ((Integer) G.f16986y0.a(null)).intValue();
                                            long jNextInt8 = new Random().nextInt(5000);
                                            c1023u4.f17564B.getClass();
                                            jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                C1023u0.m(x9);
                                                v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            C1023u0.l(y10);
                                            y10.o();
                                            if (y10.f17220C == null) {
                                                y10.f17220C = new M0(y10, c1023u3, 0);
                                            }
                                            y10.f17220C.b(jMax);
                                        }
                                    }
                                    c0985h0.f17389F.b(true);
                                    return;
                                }
                                EnumMap enumMap5 = new EnumMap(G0.class);
                                enumMap5.put(G0.f16989s, e0D);
                                enumMap5.put(g10, e0D2);
                                h7 = new H0(enumMap5, -10);
                            } else {
                                c1023u1 = c1023u7;
                                rVar2 = rVar;
                                c1023u2 = c1023u6;
                                if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (i12 == 0) {
                                        }
                                        C1023u0.l(y10);
                                        z11 = false;
                                        y10.K(new H0(-10), false);
                                    } else {
                                        z11 = false;
                                    }
                                    h7 = null;
                                    if (h7 != null) {
                                        C1023u0.l(y10);
                                        y10.K(h7, true);
                                    } else {
                                        h7 = h0V;
                                    }
                                    C1023u0.l(y10);
                                    c1023u3 = (C1023u0) y10.f16104r;
                                    y10.s(h7);
                                    c0985h0.o();
                                    int i113 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                    e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (e0D3 != e11) {
                                        C1023u0.m(x13);
                                        v12.b(e0D3, "Default ad personalization consent from Manifest");
                                    }
                                    e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                    if (e0D4 == e11) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                                c1005oC = C1005o.c(30, bundle);
                                                it = c1005oC.f17494e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((E0) it.next()) != e11) {
                                                        C1023u0.l(y10);
                                                        y10.J(c1005oC, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                    boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                    if (boolA != null) {
                                        C1023u0.m(x13);
                                        v10.a("TCF client enabled.");
                                        C1023u0.l(y10);
                                        y10.o();
                                        X x214 = c1023u3.f17584w;
                                        C1023u0.m(x214);
                                        x214.f17177D.a("Register tcfPrefChangeListener.");
                                        if (y10.f17229L == null) {
                                            y10.f17230M = new M0(y10, c1023u3, 2);
                                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                    Y0 y12 = y10;
                                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                    C0981g c0981g4 = c1023u9.f17582u;
                                                    X x215 = c1023u9.f17584w;
                                                    if (!c0981g4.y(null, G.f16930a1)) {
                                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                                            C1023u0.m(x215);
                                                            x215.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m10 = y12.f17230M;
                                                            U6.y.f(m10);
                                                            m10.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        C1023u0.m(x215);
                                                        x215.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m11 = y12.f17230M;
                                                        U6.y.f(m11);
                                                        m11.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        C0985h0 c0985h111 = c1023u3.f17583v;
                                        C1023u0.k(c0985h111);
                                        c0985h111.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                        C1023u0.l(y10);
                                        y10.u();
                                    } else {
                                        C1023u0.m(x13);
                                        v10.a("TCF client enabled.");
                                        C1023u0.l(y10);
                                        y10.o();
                                        X x215 = c1023u3.f17584w;
                                        C1023u0.m(x215);
                                        x215.f17177D.a("Register tcfPrefChangeListener.");
                                        if (y10.f17229L == null) {
                                            y10.f17230M = new M0(y10, c1023u3, 2);
                                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                    Y0 y12 = y10;
                                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                    C0981g c0981g4 = c1023u9.f17582u;
                                                    X x216 = c1023u9.f17584w;
                                                    if (!c0981g4.y(null, G.f16930a1)) {
                                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                                            C1023u0.m(x216);
                                                            x216.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                            M0 m10 = y12.f17230M;
                                                            U6.y.f(m10);
                                                            m10.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        C1023u0.m(x216);
                                                        x216.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m11 = y12.f17230M;
                                                        U6.y.f(m11);
                                                        m11.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        C0985h0 c0985h112 = c1023u3.f17583v;
                                        C1023u0.k(c0985h112);
                                        c0985h112.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                        C1023u0.l(y10);
                                        y10.u();
                                    }
                                    c0979f0 = c0985h0.f17403w;
                                    if (c0979f0.a() == 0) {
                                        C1023u0.m(x13);
                                        v12.b(Long.valueOf(j), "Persisting first open");
                                        c0979f0.b(j);
                                    }
                                    C1023u0.l(y10);
                                    c1020t0 = y10.f17226I;
                                    if (c1020t0.d()) {
                                        C0985h0 c0985h113 = c1020t0.f17549r.f17583v;
                                        C1023u0.k(c0985h113);
                                        c0985h113.f17397N.k(null);
                                    }
                                    if (c1023u2.h()) {
                                        if (c1023u2.a()) {
                                            v16 = v15;
                                            if (v16.N("android.permission.INTERNET")) {
                                                C1023u0.m(x13);
                                                v17 = v14;
                                                v17.a("App is missing INTERNET permission");
                                            } else {
                                                v17 = v14;
                                            }
                                            if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                                C1023u0.m(x13);
                                                v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            c1023u4 = c1023u2;
                                            context = c1023u4.f17579r;
                                            if (!Z6.b.a(context).c()) {
                                                if (!V1.g0(context)) {
                                                    C1023u0.m(x13);
                                                    v17.a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!V1.H(context)) {
                                                    C1023u0.m(x13);
                                                    v17.a("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            C1023u0.m(x13);
                                            v17.a("Uploading is not possible. App measurement disabled");
                                        } else {
                                            v16 = v15;
                                            c1023u4 = c1023u2;
                                        }
                                        x9 = x13;
                                    } else {
                                        v16 = v15;
                                        c1023u4 = c1023u2;
                                        if (TextUtils.isEmpty(c1023u4.r().v())) {
                                            String strV15 = c1023u4.r().v();
                                            c0985h0.o();
                                            String string9 = c0985h0.s().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strV15);
                                            boolean zIsEmpty9 = TextUtils.isEmpty(string9);
                                            if (zIsEmpty) {
                                                rVar3 = rVar2;
                                            } else {
                                                rVar3 = rVar2;
                                            }
                                            String strV16 = c1023u4.r().v();
                                            c0985h0.o();
                                            SharedPreferences.Editor editorEdit11 = c0985h0.s().edit();
                                            editorEdit11.putString("gmp_app_id", strV16);
                                            editorEdit11.apply();
                                        } else {
                                            rVar3 = rVar2;
                                        }
                                        if (!c0985h0.v().i(g10)) {
                                            rVar3.k(null);
                                        }
                                        C1023u0.l(y10);
                                        y10.f17236x.set(rVar3.j());
                                        c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        x9 = x13;
                                        if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                            zA = c1023u4.a();
                                            sharedPreferences = c0985h0.f17400t;
                                            if (sharedPreferences == null) {
                                                zContains = z11;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                c0985h0.x(!zA);
                                            }
                                            if (zA) {
                                                C1023u0.l(y10);
                                                y10.A();
                                            }
                                            B1 b17 = c1023u4.f17586y;
                                            C1023u0.l(b17);
                                            b17.f16834v.s();
                                            c1023u4.p().s(new AtomicReference());
                                            c1023u4.p().t(c0985h0.f17399P.L());
                                        }
                                    }
                                    R3.a();
                                    if (c0981g.y(null, G.f16914R0)) {
                                        v16.o();
                                        if (v16.L() == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = z11;
                                        }
                                        if (z12) {
                                            long jIntValue9 = ((Integer) G.f16986y0.a(null)).intValue();
                                            long jNextInt9 = new Random().nextInt(5000);
                                            c1023u4.f17564B.getClass();
                                            jMax = Math.max(500L, ((jIntValue9 * 1000) + jNextInt9) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                C1023u0.m(x9);
                                                v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            C1023u0.l(y10);
                                            y10.o();
                                            if (y10.f17220C == null) {
                                                y10.f17220C = new M0(y10, c1023u3, 0);
                                            }
                                            y10.f17220C.b(jMax);
                                        }
                                    }
                                    c0985h0.f17389F.b(true);
                                    return;
                                }
                                EnumMap enumMap6 = new EnumMap(G0.class);
                                enumMap6.put(G0.f16989s, e0D);
                                enumMap6.put(g10, e0D2);
                                h7 = new H0(enumMap6, -10);
                            }
                            z11 = false;
                            if (h7 != null) {
                                C1023u0.l(y10);
                                y10.K(h7, true);
                            } else {
                                h7 = h0V;
                            }
                            C1023u0.l(y10);
                            c1023u3 = (C1023u0) y10.f16104r;
                            y10.s(h7);
                            c0985h0.o();
                            int i114 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                            e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                            if (e0D3 != e11) {
                                C1023u0.m(x13);
                                v12.b(e0D3, "Default ad personalization consent from Manifest");
                            }
                            e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                            if (e0D4 == e11) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                            boolA = c0981g.A("google_analytics_tcf_data_enabled");
                            if (boolA != null) {
                                C1023u0.m(x13);
                                v10.a("TCF client enabled.");
                                C1023u0.l(y10);
                                y10.o();
                                X x216 = c1023u3.f17584w;
                                C1023u0.m(x216);
                                x216.f17177D.a("Register tcfPrefChangeListener.");
                                if (y10.f17229L == null) {
                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            Y0 y12 = y10;
                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                            C0981g c0981g4 = c1023u9.f17582u;
                                            X x217 = c1023u9.f17584w;
                                            if (!c0981g4.y(null, G.f16930a1)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    C1023u0.m(x217);
                                                    x217.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m10 = y12.f17230M;
                                                    U6.y.f(m10);
                                                    m10.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                C1023u0.m(x217);
                                                x217.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m11 = y12.f17230M;
                                                U6.y.f(m11);
                                                m11.b(500L);
                                            }
                                        }
                                    };
                                }
                                C0985h0 c0985h114 = c1023u3.f17583v;
                                C1023u0.k(c0985h114);
                                c0985h114.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                C1023u0.l(y10);
                                y10.u();
                            } else {
                                C1023u0.m(x13);
                                v10.a("TCF client enabled.");
                                C1023u0.l(y10);
                                y10.o();
                                X x217 = c1023u3.f17584w;
                                C1023u0.m(x217);
                                x217.f17177D.a("Register tcfPrefChangeListener.");
                                if (y10.f17229L == null) {
                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            Y0 y12 = y10;
                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                            C0981g c0981g4 = c1023u9.f17582u;
                                            X x218 = c1023u9.f17584w;
                                            if (!c0981g4.y(null, G.f16930a1)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    C1023u0.m(x218);
                                                    x218.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m10 = y12.f17230M;
                                                    U6.y.f(m10);
                                                    m10.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                C1023u0.m(x218);
                                                x218.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m11 = y12.f17230M;
                                                U6.y.f(m11);
                                                m11.b(500L);
                                            }
                                        }
                                    };
                                }
                                C0985h0 c0985h115 = c1023u3.f17583v;
                                C1023u0.k(c0985h115);
                                c0985h115.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                C1023u0.l(y10);
                                y10.u();
                            }
                            c0979f0 = c0985h0.f17403w;
                            if (c0979f0.a() == 0) {
                                C1023u0.m(x13);
                                v12.b(Long.valueOf(j), "Persisting first open");
                                c0979f0.b(j);
                            }
                            C1023u0.l(y10);
                            c1020t0 = y10.f17226I;
                            if (c1020t0.d()) {
                                C0985h0 c0985h116 = c1020t0.f17549r.f17583v;
                                C1023u0.k(c0985h116);
                                c0985h116.f17397N.k(null);
                            }
                            if (c1023u2.h()) {
                                if (c1023u2.a()) {
                                    v16 = v15;
                                    if (v16.N("android.permission.INTERNET")) {
                                        C1023u0.m(x13);
                                        v17 = v14;
                                        v17.a("App is missing INTERNET permission");
                                    } else {
                                        v17 = v14;
                                    }
                                    if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                        C1023u0.m(x13);
                                        v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    c1023u4 = c1023u2;
                                    context = c1023u4.f17579r;
                                    if (!Z6.b.a(context).c()) {
                                        if (!V1.g0(context)) {
                                            C1023u0.m(x13);
                                            v17.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!V1.H(context)) {
                                            C1023u0.m(x13);
                                            v17.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    C1023u0.m(x13);
                                    v17.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    v16 = v15;
                                    c1023u4 = c1023u2;
                                }
                                x9 = x13;
                            } else {
                                v16 = v15;
                                c1023u4 = c1023u2;
                                if (TextUtils.isEmpty(c1023u4.r().v())) {
                                    String strV17 = c1023u4.r().v();
                                    c0985h0.o();
                                    String string10 = c0985h0.s().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strV17);
                                    boolean zIsEmpty10 = TextUtils.isEmpty(string10);
                                    if (zIsEmpty) {
                                        rVar3 = rVar2;
                                    } else {
                                        rVar3 = rVar2;
                                    }
                                    String strV18 = c1023u4.r().v();
                                    c0985h0.o();
                                    SharedPreferences.Editor editorEdit12 = c0985h0.s().edit();
                                    editorEdit12.putString("gmp_app_id", strV18);
                                    editorEdit12.apply();
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (!c0985h0.v().i(g10)) {
                                    rVar3.k(null);
                                }
                                C1023u0.l(y10);
                                y10.f17236x.set(rVar3.j());
                                c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                x9 = x13;
                                if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                    zA = c1023u4.a();
                                    sharedPreferences = c0985h0.f17400t;
                                    if (sharedPreferences == null) {
                                        zContains = z11;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        c0985h0.x(!zA);
                                    }
                                    if (zA) {
                                        C1023u0.l(y10);
                                        y10.A();
                                    }
                                    B1 b18 = c1023u4.f17586y;
                                    C1023u0.l(b18);
                                    b18.f16834v.s();
                                    c1023u4.p().s(new AtomicReference());
                                    c1023u4.p().t(c0985h0.f17399P.L());
                                }
                            }
                            R3.a();
                            if (c0981g.y(null, G.f16914R0)) {
                                v16.o();
                                if (v16.L() == 1) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if (z12) {
                                    long jIntValue10 = ((Integer) G.f16986y0.a(null)).intValue();
                                    long jNextInt10 = new Random().nextInt(5000);
                                    c1023u4.f17564B.getClass();
                                    jMax = Math.max(500L, ((jIntValue10 * 1000) + jNextInt10) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        C1023u0.m(x9);
                                        v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    C1023u0.l(y10);
                                    y10.o();
                                    if (y10.f17220C == null) {
                                        y10.f17220C = new M0(y10, c1023u3, 0);
                                    }
                                    y10.f17220C.b(jMax);
                                }
                            }
                            c0985h0.f17389F.b(true);
                            return;
                        }
                        X x218 = c1023u0.f17584w;
                        C1023u0.m(x218);
                        x218.f17182w.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = c1023u0.f17579r.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                                break;
                            }
                        }
                        if (listAsList != null) {
                            o11.f17039B = listAsList;
                        } else if (listAsList.isEmpty()) {
                            C1023u0.m(x16);
                            x16.f17175B.a("Safelisted event list is empty. Ignoring");
                        } else {
                            it2 = listAsList.iterator();
                            do {
                                if (it2.hasNext()) {
                                    str5 = (String) it2.next();
                                    v18 = c1023u8.f17587z;
                                    C1023u0.k(v18);
                                } else {
                                    o11.f17039B = listAsList;
                                }
                            } while (v18.r0("safelisted event", str5));
                        }
                        if (packageManager != null) {
                            o11.f17041D = Z6.a.f(context3) ? 1 : 0;
                        } else {
                            o11.f17041D = 0;
                        }
                        ((C1023u0) o11.f16104r).T.incrementAndGet();
                        o11.f17002s = true;
                        c0974d1 = new C0974d1(c1023u6);
                        c0974d1.q();
                        c1023u6.f17574L = c0974d1;
                        if (!c0974d1.f17002s) {
                            throw new IllegalStateException("Can't initialize twice");
                        }
                        c0974d1.f17322t = (JobScheduler) ((C1023u0) c0974d1.f16104r).f17579r.getSystemService("jobscheduler");
                        ((C1023u0) c0974d1.f16104r).T.incrementAndGet();
                        c0974d1.f17002s = true;
                        C1023u0.m(x13);
                        v10 = x13.f17177D;
                        v11 = x13.f17176C;
                        v12 = x13.f17178E;
                        v13 = x13.f17182w;
                        c0981g.t();
                        v11.b(133005L, "App measurement initialized, version");
                        C1023u0.m(x13);
                        v11.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strU = o10.u();
                        if (v19.Q(strU, c0981g.f17359t)) {
                            C1023u0.m(x13);
                            v11.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            C1023u0.m(x13);
                            v11.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strU)));
                        }
                        C1023u0.m(x13);
                        v10.a("Debug-level message logging enabled");
                        i11 = c1023u6.R;
                        atomicInteger = c1023u6.T;
                        if (i11 != atomicInteger.get()) {
                            C1023u0.m(x13);
                            v13.c(Integer.valueOf(c1023u6.R), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                        }
                        c1023u6.f17575M = true;
                        j = c1023u6.U;
                        g10 = G0.f16990t;
                        y10 = c1023u6.f17566D;
                        C1014r0 c1014r6 = c1023u6.f17585x;
                        C1023u0.m(c1014r6);
                        c1014r6.o();
                        C1023u0.j(c1023u6.f17574L);
                        iT = c1023u6.f17574L.t();
                        R3.a();
                        zY = c0981g.y(null, G.f16914R0);
                        if (iT == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (zY) {
                            v19.o();
                            if (v19.L() == 1) {
                                v19.o();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                zzwVar = new zzw(c1023u7);
                                z13 = z10;
                                context2 = c1023u7.f17579r;
                                v14 = v13;
                                i13 = Build.VERSION.SDK_INT;
                                v15 = v19;
                                if (i13 >= 33) {
                                    Z6.a.j(context2, zzwVar, intentFilter);
                                } else if (i13 >= 26) {
                                    Z6.a.i(context2, zzwVar, intentFilter);
                                } else {
                                    context2.registerReceiver(zzwVar, intentFilter, null, null);
                                }
                                X x117 = c1023u7.f17584w;
                                C1023u0.m(x117);
                                x117.f17177D.a("Registered app receiver");
                                if (z13) {
                                    C1023u0.j(c1023u6.f17574L);
                                    c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                }
                            } else if (z10) {
                                z10 = true;
                                v19.o();
                                intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                zzwVar = new zzw(c1023u7);
                                z13 = z10;
                                context2 = c1023u7.f17579r;
                                v14 = v13;
                                i13 = Build.VERSION.SDK_INT;
                                v15 = v19;
                                if (i13 >= 33) {
                                    Z6.a.j(context2, zzwVar, intentFilter);
                                } else if (i13 >= 26) {
                                    Z6.a.i(context2, zzwVar, intentFilter);
                                } else {
                                    context2.registerReceiver(zzwVar, intentFilter, null, null);
                                }
                                X x118 = c1023u7.f17584w;
                                C1023u0.m(x118);
                                x118.f17177D.a("Registered app receiver");
                                if (z13) {
                                    C1023u0.j(c1023u6.f17574L);
                                    c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                                }
                            } else {
                                v14 = v13;
                                v15 = v19;
                            }
                        } else if (z10) {
                            z10 = true;
                            v19.o();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            zzwVar = new zzw(c1023u7);
                            z13 = z10;
                            context2 = c1023u7.f17579r;
                            v14 = v13;
                            i13 = Build.VERSION.SDK_INT;
                            v15 = v19;
                            if (i13 >= 33) {
                                Z6.a.j(context2, zzwVar, intentFilter);
                            } else if (i13 >= 26) {
                                Z6.a.i(context2, zzwVar, intentFilter);
                            } else {
                                context2.registerReceiver(zzwVar, intentFilter, null, null);
                            }
                            X x119 = c1023u7.f17584w;
                            C1023u0.m(x119);
                            x119.f17177D.a("Registered app receiver");
                            if (z13) {
                                C1023u0.j(c1023u6.f17574L);
                                c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                            }
                        } else {
                            v14 = v13;
                            v15 = v19;
                        }
                        rVar = c0985h0.f17404x;
                        h0V = c0985h0.v();
                        i12 = h0V.f17000b;
                        e0D = c0981g.D("google_analytics_default_allow_ad_storage", false);
                        e0D2 = c0981g.D("google_analytics_default_allow_analytics_storage", false);
                        e11 = e10;
                        if (e0D == e11) {
                            c1023u1 = c1023u7;
                            rVar2 = rVar;
                            c1023u2 = c1023u6;
                            if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (i12 == 0) {
                                    }
                                    C1023u0.l(y10);
                                    z11 = false;
                                    y10.K(new H0(-10), false);
                                } else {
                                    z11 = false;
                                }
                                h7 = null;
                                if (h7 != null) {
                                    C1023u0.l(y10);
                                    y10.K(h7, true);
                                } else {
                                    h7 = h0V;
                                }
                                C1023u0.l(y10);
                                c1023u3 = (C1023u0) y10.f16104r;
                                y10.s(h7);
                                c0985h0.o();
                                int i115 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                if (e0D3 != e11) {
                                    C1023u0.m(x13);
                                    v12.b(e0D3, "Default ad personalization consent from Manifest");
                                }
                                e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                if (e0D4 == e11) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                                boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                if (boolA != null) {
                                    C1023u0.m(x13);
                                    v10.a("TCF client enabled.");
                                    C1023u0.l(y10);
                                    y10.o();
                                    X x219 = c1023u3.f17584w;
                                    C1023u0.m(x219);
                                    x219.f17177D.a("Register tcfPrefChangeListener.");
                                    if (y10.f17229L == null) {
                                        y10.f17230M = new M0(y10, c1023u3, 2);
                                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                Y0 y12 = y10;
                                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                C0981g c0981g4 = c1023u9.f17582u;
                                                X x2110 = c1023u9.f17584w;
                                                if (!c0981g4.y(null, G.f16930a1)) {
                                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                                        C1023u0.m(x2110);
                                                        x2110.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m10 = y12.f17230M;
                                                        U6.y.f(m10);
                                                        m10.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    C1023u0.m(x2110);
                                                    x2110.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m11 = y12.f17230M;
                                                    U6.y.f(m11);
                                                    m11.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    C0985h0 c0985h117 = c1023u3.f17583v;
                                    C1023u0.k(c0985h117);
                                    c0985h117.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                    C1023u0.l(y10);
                                    y10.u();
                                } else {
                                    C1023u0.m(x13);
                                    v10.a("TCF client enabled.");
                                    C1023u0.l(y10);
                                    y10.o();
                                    X x2110 = c1023u3.f17584w;
                                    C1023u0.m(x2110);
                                    x2110.f17177D.a("Register tcfPrefChangeListener.");
                                    if (y10.f17229L == null) {
                                        y10.f17230M = new M0(y10, c1023u3, 2);
                                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                Y0 y12 = y10;
                                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                C0981g c0981g4 = c1023u9.f17582u;
                                                X x2111 = c1023u9.f17584w;
                                                if (!c0981g4.y(null, G.f16930a1)) {
                                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                                        C1023u0.m(x2111);
                                                        x2111.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m10 = y12.f17230M;
                                                        U6.y.f(m10);
                                                        m10.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    C1023u0.m(x2111);
                                                    x2111.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m11 = y12.f17230M;
                                                    U6.y.f(m11);
                                                    m11.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    C0985h0 c0985h118 = c1023u3.f17583v;
                                    C1023u0.k(c0985h118);
                                    c0985h118.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                    C1023u0.l(y10);
                                    y10.u();
                                }
                                c0979f0 = c0985h0.f17403w;
                                if (c0979f0.a() == 0) {
                                    C1023u0.m(x13);
                                    v12.b(Long.valueOf(j), "Persisting first open");
                                    c0979f0.b(j);
                                }
                                C1023u0.l(y10);
                                c1020t0 = y10.f17226I;
                                if (c1020t0.d()) {
                                    C0985h0 c0985h119 = c1020t0.f17549r.f17583v;
                                    C1023u0.k(c0985h119);
                                    c0985h119.f17397N.k(null);
                                }
                                if (c1023u2.h()) {
                                    if (c1023u2.a()) {
                                        v16 = v15;
                                        if (v16.N("android.permission.INTERNET")) {
                                            C1023u0.m(x13);
                                            v17 = v14;
                                            v17.a("App is missing INTERNET permission");
                                        } else {
                                            v17 = v14;
                                        }
                                        if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                            C1023u0.m(x13);
                                            v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        c1023u4 = c1023u2;
                                        context = c1023u4.f17579r;
                                        if (!Z6.b.a(context).c()) {
                                            if (!V1.g0(context)) {
                                                C1023u0.m(x13);
                                                v17.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!V1.H(context)) {
                                                C1023u0.m(x13);
                                                v17.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        C1023u0.m(x13);
                                        v17.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        v16 = v15;
                                        c1023u4 = c1023u2;
                                    }
                                    x9 = x13;
                                } else {
                                    v16 = v15;
                                    c1023u4 = c1023u2;
                                    if (TextUtils.isEmpty(c1023u4.r().v())) {
                                        String strV19 = c1023u4.r().v();
                                        c0985h0.o();
                                        String string11 = c0985h0.s().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strV19);
                                        boolean zIsEmpty11 = TextUtils.isEmpty(string11);
                                        if (zIsEmpty) {
                                            rVar3 = rVar2;
                                        } else {
                                            rVar3 = rVar2;
                                        }
                                        String strV110 = c1023u4.r().v();
                                        c0985h0.o();
                                        SharedPreferences.Editor editorEdit13 = c0985h0.s().edit();
                                        editorEdit13.putString("gmp_app_id", strV110);
                                        editorEdit13.apply();
                                    } else {
                                        rVar3 = rVar2;
                                    }
                                    if (!c0985h0.v().i(g10)) {
                                        rVar3.k(null);
                                    }
                                    C1023u0.l(y10);
                                    y10.f17236x.set(rVar3.j());
                                    c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    x9 = x13;
                                    if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                        zA = c1023u4.a();
                                        sharedPreferences = c0985h0.f17400t;
                                        if (sharedPreferences == null) {
                                            zContains = z11;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            c0985h0.x(!zA);
                                        }
                                        if (zA) {
                                            C1023u0.l(y10);
                                            y10.A();
                                        }
                                        B1 b19 = c1023u4.f17586y;
                                        C1023u0.l(b19);
                                        b19.f16834v.s();
                                        c1023u4.p().s(new AtomicReference());
                                        c1023u4.p().t(c0985h0.f17399P.L());
                                    }
                                }
                                R3.a();
                                if (c0981g.y(null, G.f16914R0)) {
                                    v16.o();
                                    if (v16.L() == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = z11;
                                    }
                                    if (z12) {
                                        long jIntValue11 = ((Integer) G.f16986y0.a(null)).intValue();
                                        long jNextInt11 = new Random().nextInt(5000);
                                        c1023u4.f17564B.getClass();
                                        jMax = Math.max(500L, ((jIntValue11 * 1000) + jNextInt11) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            C1023u0.m(x9);
                                            v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        C1023u0.l(y10);
                                        y10.o();
                                        if (y10.f17220C == null) {
                                            y10.f17220C = new M0(y10, c1023u3, 0);
                                        }
                                        y10.f17220C.b(jMax);
                                    }
                                }
                                c0985h0.f17389F.b(true);
                                return;
                            }
                            EnumMap enumMap7 = new EnumMap(G0.class);
                            enumMap7.put(G0.f16989s, e0D);
                            enumMap7.put(g10, e0D2);
                            h7 = new H0(enumMap7, -10);
                        } else {
                            c1023u1 = c1023u7;
                            rVar2 = rVar;
                            c1023u2 = c1023u6;
                            if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (i12 == 0) {
                                    }
                                    C1023u0.l(y10);
                                    z11 = false;
                                    y10.K(new H0(-10), false);
                                } else {
                                    z11 = false;
                                }
                                h7 = null;
                                if (h7 != null) {
                                    C1023u0.l(y10);
                                    y10.K(h7, true);
                                } else {
                                    h7 = h0V;
                                }
                                C1023u0.l(y10);
                                c1023u3 = (C1023u0) y10.f16104r;
                                y10.s(h7);
                                c0985h0.o();
                                int i116 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                                e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                                if (e0D3 != e11) {
                                    C1023u0.m(x13);
                                    v12.b(e0D3, "Default ad personalization consent from Manifest");
                                }
                                e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                                if (e0D4 == e11) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                                            c1005oC = C1005o.c(30, bundle);
                                            it = c1005oC.f17494e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((E0) it.next()) != e11) {
                                                    C1023u0.l(y10);
                                                    y10.J(c1005oC, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                                boolA = c0981g.A("google_analytics_tcf_data_enabled");
                                if (boolA != null) {
                                    C1023u0.m(x13);
                                    v10.a("TCF client enabled.");
                                    C1023u0.l(y10);
                                    y10.o();
                                    X x2111 = c1023u3.f17584w;
                                    C1023u0.m(x2111);
                                    x2111.f17177D.a("Register tcfPrefChangeListener.");
                                    if (y10.f17229L == null) {
                                        y10.f17230M = new M0(y10, c1023u3, 2);
                                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                Y0 y12 = y10;
                                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                C0981g c0981g4 = c1023u9.f17582u;
                                                X x2112 = c1023u9.f17584w;
                                                if (!c0981g4.y(null, G.f16930a1)) {
                                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                                        C1023u0.m(x2112);
                                                        x2112.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m10 = y12.f17230M;
                                                        U6.y.f(m10);
                                                        m10.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    C1023u0.m(x2112);
                                                    x2112.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m11 = y12.f17230M;
                                                    U6.y.f(m11);
                                                    m11.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    C0985h0 c0985h1110 = c1023u3.f17583v;
                                    C1023u0.k(c0985h1110);
                                    c0985h1110.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                    C1023u0.l(y10);
                                    y10.u();
                                } else {
                                    C1023u0.m(x13);
                                    v10.a("TCF client enabled.");
                                    C1023u0.l(y10);
                                    y10.o();
                                    X x2112 = c1023u3.f17584w;
                                    C1023u0.m(x2112);
                                    x2112.f17177D.a("Register tcfPrefChangeListener.");
                                    if (y10.f17229L == null) {
                                        y10.f17230M = new M0(y10, c1023u3, 2);
                                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                                Y0 y12 = y10;
                                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                                C0981g c0981g4 = c1023u9.f17582u;
                                                X x2113 = c1023u9.f17584w;
                                                if (!c0981g4.y(null, G.f16930a1)) {
                                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                                        C1023u0.m(x2113);
                                                        x2113.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                        M0 m10 = y12.f17230M;
                                                        U6.y.f(m10);
                                                        m10.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    C1023u0.m(x2113);
                                                    x2113.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m11 = y12.f17230M;
                                                    U6.y.f(m11);
                                                    m11.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    C0985h0 c0985h1111 = c1023u3.f17583v;
                                    C1023u0.k(c0985h1111);
                                    c0985h1111.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                    C1023u0.l(y10);
                                    y10.u();
                                }
                                c0979f0 = c0985h0.f17403w;
                                if (c0979f0.a() == 0) {
                                    C1023u0.m(x13);
                                    v12.b(Long.valueOf(j), "Persisting first open");
                                    c0979f0.b(j);
                                }
                                C1023u0.l(y10);
                                c1020t0 = y10.f17226I;
                                if (c1020t0.d()) {
                                    C0985h0 c0985h1112 = c1020t0.f17549r.f17583v;
                                    C1023u0.k(c0985h1112);
                                    c0985h1112.f17397N.k(null);
                                }
                                if (c1023u2.h()) {
                                    if (c1023u2.a()) {
                                        v16 = v15;
                                        if (v16.N("android.permission.INTERNET")) {
                                            C1023u0.m(x13);
                                            v17 = v14;
                                            v17.a("App is missing INTERNET permission");
                                        } else {
                                            v17 = v14;
                                        }
                                        if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                            C1023u0.m(x13);
                                            v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        c1023u4 = c1023u2;
                                        context = c1023u4.f17579r;
                                        if (!Z6.b.a(context).c()) {
                                            if (!V1.g0(context)) {
                                                C1023u0.m(x13);
                                                v17.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!V1.H(context)) {
                                                C1023u0.m(x13);
                                                v17.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        C1023u0.m(x13);
                                        v17.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        v16 = v15;
                                        c1023u4 = c1023u2;
                                    }
                                    x9 = x13;
                                } else {
                                    v16 = v15;
                                    c1023u4 = c1023u2;
                                    if (TextUtils.isEmpty(c1023u4.r().v())) {
                                        String strV111 = c1023u4.r().v();
                                        c0985h0.o();
                                        String string12 = c0985h0.s().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strV111);
                                        boolean zIsEmpty12 = TextUtils.isEmpty(string12);
                                        if (zIsEmpty) {
                                            rVar3 = rVar2;
                                        } else {
                                            rVar3 = rVar2;
                                        }
                                        String strV112 = c1023u4.r().v();
                                        c0985h0.o();
                                        SharedPreferences.Editor editorEdit14 = c0985h0.s().edit();
                                        editorEdit14.putString("gmp_app_id", strV112);
                                        editorEdit14.apply();
                                    } else {
                                        rVar3 = rVar2;
                                    }
                                    if (!c0985h0.v().i(g10)) {
                                        rVar3.k(null);
                                    }
                                    C1023u0.l(y10);
                                    y10.f17236x.set(rVar3.j());
                                    c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    x9 = x13;
                                    if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                        zA = c1023u4.a();
                                        sharedPreferences = c0985h0.f17400t;
                                        if (sharedPreferences == null) {
                                            zContains = z11;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            c0985h0.x(!zA);
                                        }
                                        if (zA) {
                                            C1023u0.l(y10);
                                            y10.A();
                                        }
                                        B1 b110 = c1023u4.f17586y;
                                        C1023u0.l(b110);
                                        b110.f16834v.s();
                                        c1023u4.p().s(new AtomicReference());
                                        c1023u4.p().t(c0985h0.f17399P.L());
                                    }
                                }
                                R3.a();
                                if (c0981g.y(null, G.f16914R0)) {
                                    v16.o();
                                    if (v16.L() == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = z11;
                                    }
                                    if (z12) {
                                        long jIntValue12 = ((Integer) G.f16986y0.a(null)).intValue();
                                        long jNextInt12 = new Random().nextInt(5000);
                                        c1023u4.f17564B.getClass();
                                        jMax = Math.max(500L, ((jIntValue12 * 1000) + jNextInt12) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            C1023u0.m(x9);
                                            v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        C1023u0.l(y10);
                                        y10.o();
                                        if (y10.f17220C == null) {
                                            y10.f17220C = new M0(y10, c1023u3, 0);
                                        }
                                        y10.f17220C.b(jMax);
                                    }
                                }
                                c0985h0.f17389F.b(true);
                                return;
                            }
                            EnumMap enumMap8 = new EnumMap(G0.class);
                            enumMap8.put(G0.f16989s, e0D);
                            enumMap8.put(g10, e0D2);
                            h7 = new H0(enumMap8, -10);
                        }
                        z11 = false;
                        if (h7 != null) {
                            C1023u0.l(y10);
                            y10.K(h7, true);
                        } else {
                            h7 = h0V;
                        }
                        C1023u0.l(y10);
                        c1023u3 = (C1023u0) y10.f16104r;
                        y10.s(h7);
                        c0985h0.o();
                        int i117 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                        e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                        if (e0D3 != e11) {
                            C1023u0.m(x13);
                            v12.b(e0D3, "Default ad personalization consent from Manifest");
                        }
                        e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                        if (e0D4 == e11) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                            c1005oC = C1005o.c(30, bundle);
                            it = c1005oC.f17494e.values().iterator();
                            while (it.hasNext()) {
                                if (((E0) it.next()) != e11) {
                                    C1023u0.l(y10);
                                    y10.J(c1005oC, true);
                                }
                            }
                        }
                        boolA = c0981g.A("google_analytics_tcf_data_enabled");
                        if (boolA != null) {
                            C1023u0.m(x13);
                            v10.a("TCF client enabled.");
                            C1023u0.l(y10);
                            y10.o();
                            X x2113 = c1023u3.f17584w;
                            C1023u0.m(x2113);
                            x2113.f17177D.a("Register tcfPrefChangeListener.");
                            if (y10.f17229L == null) {
                                y10.f17230M = new M0(y10, c1023u3, 2);
                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        Y0 y12 = y10;
                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                        C0981g c0981g4 = c1023u9.f17582u;
                                        X x2114 = c1023u9.f17584w;
                                        if (!c0981g4.y(null, G.f16930a1)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                C1023u0.m(x2114);
                                                x2114.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m10 = y12.f17230M;
                                                U6.y.f(m10);
                                                m10.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C1023u0.m(x2114);
                                            x2114.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m11 = y12.f17230M;
                                            U6.y.f(m11);
                                            m11.b(500L);
                                        }
                                    }
                                };
                            }
                            C0985h0 c0985h1113 = c1023u3.f17583v;
                            C1023u0.k(c0985h1113);
                            c0985h1113.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                            C1023u0.l(y10);
                            y10.u();
                        } else {
                            C1023u0.m(x13);
                            v10.a("TCF client enabled.");
                            C1023u0.l(y10);
                            y10.o();
                            X x2114 = c1023u3.f17584w;
                            C1023u0.m(x2114);
                            x2114.f17177D.a("Register tcfPrefChangeListener.");
                            if (y10.f17229L == null) {
                                y10.f17230M = new M0(y10, c1023u3, 2);
                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        Y0 y12 = y10;
                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                        C0981g c0981g4 = c1023u9.f17582u;
                                        X x2115 = c1023u9.f17584w;
                                        if (!c0981g4.y(null, G.f16930a1)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                C1023u0.m(x2115);
                                                x2115.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m10 = y12.f17230M;
                                                U6.y.f(m10);
                                                m10.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C1023u0.m(x2115);
                                            x2115.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m11 = y12.f17230M;
                                            U6.y.f(m11);
                                            m11.b(500L);
                                        }
                                    }
                                };
                            }
                            C0985h0 c0985h1114 = c1023u3.f17583v;
                            C1023u0.k(c0985h1114);
                            c0985h1114.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                            C1023u0.l(y10);
                            y10.u();
                        }
                        c0979f0 = c0985h0.f17403w;
                        if (c0979f0.a() == 0) {
                            C1023u0.m(x13);
                            v12.b(Long.valueOf(j), "Persisting first open");
                            c0979f0.b(j);
                        }
                        C1023u0.l(y10);
                        c1020t0 = y10.f17226I;
                        if (c1020t0.d()) {
                            C0985h0 c0985h1115 = c1020t0.f17549r.f17583v;
                            C1023u0.k(c0985h1115);
                            c0985h1115.f17397N.k(null);
                        }
                        if (c1023u2.h()) {
                            if (c1023u2.a()) {
                                v16 = v15;
                                if (v16.N("android.permission.INTERNET")) {
                                    C1023u0.m(x13);
                                    v17 = v14;
                                    v17.a("App is missing INTERNET permission");
                                } else {
                                    v17 = v14;
                                }
                                if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                    C1023u0.m(x13);
                                    v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                c1023u4 = c1023u2;
                                context = c1023u4.f17579r;
                                if (!Z6.b.a(context).c()) {
                                    if (!V1.g0(context)) {
                                        C1023u0.m(x13);
                                        v17.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!V1.H(context)) {
                                        C1023u0.m(x13);
                                        v17.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                C1023u0.m(x13);
                                v17.a("Uploading is not possible. App measurement disabled");
                            } else {
                                v16 = v15;
                                c1023u4 = c1023u2;
                            }
                            x9 = x13;
                        } else {
                            v16 = v15;
                            c1023u4 = c1023u2;
                            if (TextUtils.isEmpty(c1023u4.r().v())) {
                                String strV113 = c1023u4.r().v();
                                c0985h0.o();
                                String string13 = c0985h0.s().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strV113);
                                boolean zIsEmpty13 = TextUtils.isEmpty(string13);
                                if (zIsEmpty) {
                                    rVar3 = rVar2;
                                } else {
                                    rVar3 = rVar2;
                                }
                                String strV114 = c1023u4.r().v();
                                c0985h0.o();
                                SharedPreferences.Editor editorEdit15 = c0985h0.s().edit();
                                editorEdit15.putString("gmp_app_id", strV114);
                                editorEdit15.apply();
                            } else {
                                rVar3 = rVar2;
                            }
                            if (!c0985h0.v().i(g10)) {
                                rVar3.k(null);
                            }
                            C1023u0.l(y10);
                            y10.f17236x.set(rVar3.j());
                            c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            x9 = x13;
                            if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                zA = c1023u4.a();
                                sharedPreferences = c0985h0.f17400t;
                                if (sharedPreferences == null) {
                                    zContains = z11;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    c0985h0.x(!zA);
                                }
                                if (zA) {
                                    C1023u0.l(y10);
                                    y10.A();
                                }
                                B1 b111 = c1023u4.f17586y;
                                C1023u0.l(b111);
                                b111.f16834v.s();
                                c1023u4.p().s(new AtomicReference());
                                c1023u4.p().t(c0985h0.f17399P.L());
                            }
                        }
                        R3.a();
                        if (c0981g.y(null, G.f16914R0)) {
                            v16.o();
                            if (v16.L() == 1) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (z12) {
                                long jIntValue13 = ((Integer) G.f16986y0.a(null)).intValue();
                                long jNextInt13 = new Random().nextInt(5000);
                                c1023u4.f17564B.getClass();
                                jMax = Math.max(500L, ((jIntValue13 * 1000) + jNextInt13) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    C1023u0.m(x9);
                                    v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                C1023u0.l(y10);
                                y10.o();
                                if (y10.f17220C == null) {
                                    y10.f17220C = new M0(y10, c1023u3, 0);
                                }
                                y10.f17220C.b(jMax);
                            }
                        }
                        c0985h0.f17389F.b(true);
                        return;
                    }
                    C1023u0.m(x16);
                    w9 = w10;
                    e10 = e17;
                    x16.f17182w.b(X.w(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    strB = I0.b(context3, c1023u8.f17569G);
                    if (!TextUtils.isEmpty(strB)) {
                        str6 = strB;
                    }
                    o11.f17042E = str6;
                    if (iG == 0) {
                        C1023u0.m(x16);
                        x16.f17178E.c(o11.f17046t, o11.f17042E, "App measurement enabled for app package, google app id");
                    }
                    break;
                } catch (IllegalStateException e19) {
                    C1023u0.m(x16);
                    x16.f17182w.c(X.w(packageName), e19, "Fetching Google App Id failed with exception. appId");
                }
                str2 = installerPackageName;
                str = str7;
                str3 = str;
                i10 = Integer.MIN_VALUE;
                o11.f17046t = packageName;
                o11.f17049w = str2;
                o11.f17047u = str3;
                o11.f17048v = i10;
                o11.f17050x = str;
                o11.f17051y = 0L;
                iG = c1023u8.g();
                if (iG == 0) {
                    C1023u0.m(x16);
                    x16.f17178E.a("App measurement collection enabled");
                } else if (iG == 1) {
                    C1023u0.m(x16);
                    x16.f17176C.a("App measurement deactivated via the manifest");
                } else if (iG == 3) {
                    C1023u0.m(x16);
                    x16.f17176C.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iG == 4) {
                    C1023u0.m(x16);
                    x16.f17176C.a("App measurement disabled via the manifest");
                } else if (iG == 6) {
                    C1023u0.m(x16);
                    x16.f17175B.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iG == 7) {
                    C1023u0.m(x16);
                    x16.f17176C.a("App measurement disabled via the global data collection setting");
                } else if (iG != 8) {
                    C1023u0.m(x16);
                    x16.f17176C.a("App measurement disabled");
                    C1023u0.m(x16);
                    x16.f17183x.a("Invalid scion state in identity");
                } else {
                    C1023u0.m(x16);
                    x16.f17176C.a("App measurement disabled due to denied storage consent");
                }
                o11.f17042E = "";
                listAsList = null;
                o11.f17039B = null;
                C0981g c0981g4 = c1023u8.f17582u;
                c1023u0 = (C1023u0) c0981g4.f16104r;
                y.c("analytics.safelisted_events");
                bundleZ = c0981g4.z();
                if (bundleZ != null) {
                    if (bundleZ.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleZ.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = c1023u0.f17579r.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                            break;
                        }
                    }
                    if (listAsList != null) {
                        o11.f17039B = listAsList;
                    } else if (listAsList.isEmpty()) {
                        C1023u0.m(x16);
                        x16.f17175B.a("Safelisted event list is empty. Ignoring");
                    } else {
                        it2 = listAsList.iterator();
                        do {
                            if (it2.hasNext()) {
                                str5 = (String) it2.next();
                                v18 = c1023u8.f17587z;
                                C1023u0.k(v18);
                            } else {
                                o11.f17039B = listAsList;
                            }
                        } while (v18.r0("safelisted event", str5));
                    }
                    if (packageManager != null) {
                        o11.f17041D = Z6.a.f(context3) ? 1 : 0;
                    } else {
                        o11.f17041D = 0;
                    }
                    ((C1023u0) o11.f16104r).T.incrementAndGet();
                    o11.f17002s = true;
                    c0974d1 = new C0974d1(c1023u6);
                    c0974d1.q();
                    c1023u6.f17574L = c0974d1;
                    if (!c0974d1.f17002s) {
                        throw new IllegalStateException("Can't initialize twice");
                    }
                    c0974d1.f17322t = (JobScheduler) ((C1023u0) c0974d1.f16104r).f17579r.getSystemService("jobscheduler");
                    ((C1023u0) c0974d1.f16104r).T.incrementAndGet();
                    c0974d1.f17002s = true;
                    C1023u0.m(x13);
                    v10 = x13.f17177D;
                    v11 = x13.f17176C;
                    v12 = x13.f17178E;
                    v13 = x13.f17182w;
                    c0981g.t();
                    v11.b(133005L, "App measurement initialized, version");
                    C1023u0.m(x13);
                    v11.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strU = o10.u();
                    if (v19.Q(strU, c0981g.f17359t)) {
                        C1023u0.m(x13);
                        v11.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        C1023u0.m(x13);
                        v11.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strU)));
                    }
                    C1023u0.m(x13);
                    v10.a("Debug-level message logging enabled");
                    i11 = c1023u6.R;
                    atomicInteger = c1023u6.T;
                    if (i11 != atomicInteger.get()) {
                        C1023u0.m(x13);
                        v13.c(Integer.valueOf(c1023u6.R), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    c1023u6.f17575M = true;
                    j = c1023u6.U;
                    g10 = G0.f16990t;
                    y10 = c1023u6.f17566D;
                    C1014r0 c1014r7 = c1023u6.f17585x;
                    C1023u0.m(c1014r7);
                    c1014r7.o();
                    C1023u0.j(c1023u6.f17574L);
                    iT = c1023u6.f17574L.t();
                    R3.a();
                    zY = c0981g.y(null, G.f16914R0);
                    if (iT == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (zY) {
                        v19.o();
                        if (v19.L() == 1) {
                            v19.o();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            zzwVar = new zzw(c1023u7);
                            z13 = z10;
                            context2 = c1023u7.f17579r;
                            v14 = v13;
                            i13 = Build.VERSION.SDK_INT;
                            v15 = v19;
                            if (i13 >= 33) {
                                Z6.a.j(context2, zzwVar, intentFilter);
                            } else if (i13 >= 26) {
                                Z6.a.i(context2, zzwVar, intentFilter);
                            } else {
                                context2.registerReceiver(zzwVar, intentFilter, null, null);
                            }
                            X x1110 = c1023u7.f17584w;
                            C1023u0.m(x1110);
                            x1110.f17177D.a("Registered app receiver");
                            if (z13) {
                                C1023u0.j(c1023u6.f17574L);
                                c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                            }
                        } else if (z10) {
                            z10 = true;
                            v19.o();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            zzwVar = new zzw(c1023u7);
                            z13 = z10;
                            context2 = c1023u7.f17579r;
                            v14 = v13;
                            i13 = Build.VERSION.SDK_INT;
                            v15 = v19;
                            if (i13 >= 33) {
                                Z6.a.j(context2, zzwVar, intentFilter);
                            } else if (i13 >= 26) {
                                Z6.a.i(context2, zzwVar, intentFilter);
                            } else {
                                context2.registerReceiver(zzwVar, intentFilter, null, null);
                            }
                            X x1111 = c1023u7.f17584w;
                            C1023u0.m(x1111);
                            x1111.f17177D.a("Registered app receiver");
                            if (z13) {
                                C1023u0.j(c1023u6.f17574L);
                                c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                            }
                        } else {
                            v14 = v13;
                            v15 = v19;
                        }
                    } else if (z10) {
                        z10 = true;
                        v19.o();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        zzwVar = new zzw(c1023u7);
                        z13 = z10;
                        context2 = c1023u7.f17579r;
                        v14 = v13;
                        i13 = Build.VERSION.SDK_INT;
                        v15 = v19;
                        if (i13 >= 33) {
                            Z6.a.j(context2, zzwVar, intentFilter);
                        } else if (i13 >= 26) {
                            Z6.a.i(context2, zzwVar, intentFilter);
                        } else {
                            context2.registerReceiver(zzwVar, intentFilter, null, null);
                        }
                        X x1112 = c1023u7.f17584w;
                        C1023u0.m(x1112);
                        x1112.f17177D.a("Registered app receiver");
                        if (z13) {
                            C1023u0.j(c1023u6.f17574L);
                            c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                        }
                    } else {
                        v14 = v13;
                        v15 = v19;
                    }
                    rVar = c0985h0.f17404x;
                    h0V = c0985h0.v();
                    i12 = h0V.f17000b;
                    e0D = c0981g.D("google_analytics_default_allow_ad_storage", false);
                    e0D2 = c0981g.D("google_analytics_default_allow_analytics_storage", false);
                    e11 = e10;
                    if (e0D == e11) {
                        c1023u1 = c1023u7;
                        rVar2 = rVar;
                        c1023u2 = c1023u6;
                        if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (i12 == 0) {
                                }
                                C1023u0.l(y10);
                                z11 = false;
                                y10.K(new H0(-10), false);
                            } else {
                                z11 = false;
                            }
                            h7 = null;
                            if (h7 != null) {
                                C1023u0.l(y10);
                                y10.K(h7, true);
                            } else {
                                h7 = h0V;
                            }
                            C1023u0.l(y10);
                            c1023u3 = (C1023u0) y10.f16104r;
                            y10.s(h7);
                            c0985h0.o();
                            int i118 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                            e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                            if (e0D3 != e11) {
                                C1023u0.m(x13);
                                v12.b(e0D3, "Default ad personalization consent from Manifest");
                            }
                            e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                            if (e0D4 == e11) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                            boolA = c0981g.A("google_analytics_tcf_data_enabled");
                            if (boolA != null) {
                                C1023u0.m(x13);
                                v10.a("TCF client enabled.");
                                C1023u0.l(y10);
                                y10.o();
                                X x2115 = c1023u3.f17584w;
                                C1023u0.m(x2115);
                                x2115.f17177D.a("Register tcfPrefChangeListener.");
                                if (y10.f17229L == null) {
                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            Y0 y12 = y10;
                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                            C0981g c0981g5 = c1023u9.f17582u;
                                            X x2116 = c1023u9.f17584w;
                                            if (!c0981g5.y(null, G.f16930a1)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    C1023u0.m(x2116);
                                                    x2116.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m10 = y12.f17230M;
                                                    U6.y.f(m10);
                                                    m10.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                C1023u0.m(x2116);
                                                x2116.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m11 = y12.f17230M;
                                                U6.y.f(m11);
                                                m11.b(500L);
                                            }
                                        }
                                    };
                                }
                                C0985h0 c0985h1116 = c1023u3.f17583v;
                                C1023u0.k(c0985h1116);
                                c0985h1116.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                C1023u0.l(y10);
                                y10.u();
                            } else {
                                C1023u0.m(x13);
                                v10.a("TCF client enabled.");
                                C1023u0.l(y10);
                                y10.o();
                                X x2116 = c1023u3.f17584w;
                                C1023u0.m(x2116);
                                x2116.f17177D.a("Register tcfPrefChangeListener.");
                                if (y10.f17229L == null) {
                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            Y0 y12 = y10;
                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                            C0981g c0981g5 = c1023u9.f17582u;
                                            X x2117 = c1023u9.f17584w;
                                            if (!c0981g5.y(null, G.f16930a1)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    C1023u0.m(x2117);
                                                    x2117.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m10 = y12.f17230M;
                                                    U6.y.f(m10);
                                                    m10.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                C1023u0.m(x2117);
                                                x2117.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m11 = y12.f17230M;
                                                U6.y.f(m11);
                                                m11.b(500L);
                                            }
                                        }
                                    };
                                }
                                C0985h0 c0985h1117 = c1023u3.f17583v;
                                C1023u0.k(c0985h1117);
                                c0985h1117.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                C1023u0.l(y10);
                                y10.u();
                            }
                            c0979f0 = c0985h0.f17403w;
                            if (c0979f0.a() == 0) {
                                C1023u0.m(x13);
                                v12.b(Long.valueOf(j), "Persisting first open");
                                c0979f0.b(j);
                            }
                            C1023u0.l(y10);
                            c1020t0 = y10.f17226I;
                            if (c1020t0.d()) {
                                C0985h0 c0985h1118 = c1020t0.f17549r.f17583v;
                                C1023u0.k(c0985h1118);
                                c0985h1118.f17397N.k(null);
                            }
                            if (c1023u2.h()) {
                                if (c1023u2.a()) {
                                    v16 = v15;
                                    if (v16.N("android.permission.INTERNET")) {
                                        C1023u0.m(x13);
                                        v17 = v14;
                                        v17.a("App is missing INTERNET permission");
                                    } else {
                                        v17 = v14;
                                    }
                                    if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                        C1023u0.m(x13);
                                        v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    c1023u4 = c1023u2;
                                    context = c1023u4.f17579r;
                                    if (!Z6.b.a(context).c()) {
                                        if (!V1.g0(context)) {
                                            C1023u0.m(x13);
                                            v17.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!V1.H(context)) {
                                            C1023u0.m(x13);
                                            v17.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    C1023u0.m(x13);
                                    v17.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    v16 = v15;
                                    c1023u4 = c1023u2;
                                }
                                x9 = x13;
                            } else {
                                v16 = v15;
                                c1023u4 = c1023u2;
                                if (TextUtils.isEmpty(c1023u4.r().v())) {
                                    String strV115 = c1023u4.r().v();
                                    c0985h0.o();
                                    String string14 = c0985h0.s().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strV115);
                                    boolean zIsEmpty14 = TextUtils.isEmpty(string14);
                                    if (zIsEmpty) {
                                        rVar3 = rVar2;
                                    } else {
                                        rVar3 = rVar2;
                                    }
                                    String strV116 = c1023u4.r().v();
                                    c0985h0.o();
                                    SharedPreferences.Editor editorEdit16 = c0985h0.s().edit();
                                    editorEdit16.putString("gmp_app_id", strV116);
                                    editorEdit16.apply();
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (!c0985h0.v().i(g10)) {
                                    rVar3.k(null);
                                }
                                C1023u0.l(y10);
                                y10.f17236x.set(rVar3.j());
                                c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                x9 = x13;
                                if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                    zA = c1023u4.a();
                                    sharedPreferences = c0985h0.f17400t;
                                    if (sharedPreferences == null) {
                                        zContains = z11;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        c0985h0.x(!zA);
                                    }
                                    if (zA) {
                                        C1023u0.l(y10);
                                        y10.A();
                                    }
                                    B1 b112 = c1023u4.f17586y;
                                    C1023u0.l(b112);
                                    b112.f16834v.s();
                                    c1023u4.p().s(new AtomicReference());
                                    c1023u4.p().t(c0985h0.f17399P.L());
                                }
                            }
                            R3.a();
                            if (c0981g.y(null, G.f16914R0)) {
                                v16.o();
                                if (v16.L() == 1) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if (z12) {
                                    long jIntValue14 = ((Integer) G.f16986y0.a(null)).intValue();
                                    long jNextInt14 = new Random().nextInt(5000);
                                    c1023u4.f17564B.getClass();
                                    jMax = Math.max(500L, ((jIntValue14 * 1000) + jNextInt14) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        C1023u0.m(x9);
                                        v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    C1023u0.l(y10);
                                    y10.o();
                                    if (y10.f17220C == null) {
                                        y10.f17220C = new M0(y10, c1023u3, 0);
                                    }
                                    y10.f17220C.b(jMax);
                                }
                            }
                            c0985h0.f17389F.b(true);
                            return;
                        }
                        EnumMap enumMap9 = new EnumMap(G0.class);
                        enumMap9.put(G0.f16989s, e0D);
                        enumMap9.put(g10, e0D2);
                        h7 = new H0(enumMap9, -10);
                    } else {
                        c1023u1 = c1023u7;
                        rVar2 = rVar;
                        c1023u2 = c1023u6;
                        if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (i12 == 0) {
                                }
                                C1023u0.l(y10);
                                z11 = false;
                                y10.K(new H0(-10), false);
                            } else {
                                z11 = false;
                            }
                            h7 = null;
                            if (h7 != null) {
                                C1023u0.l(y10);
                                y10.K(h7, true);
                            } else {
                                h7 = h0V;
                            }
                            C1023u0.l(y10);
                            c1023u3 = (C1023u0) y10.f16104r;
                            y10.s(h7);
                            c0985h0.o();
                            int i119 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                            e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                            if (e0D3 != e11) {
                                C1023u0.m(x13);
                                v12.b(e0D3, "Default ad personalization consent from Manifest");
                            }
                            e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                            if (e0D4 == e11) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                                        c1005oC = C1005o.c(30, bundle);
                                        it = c1005oC.f17494e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((E0) it.next()) != e11) {
                                                C1023u0.l(y10);
                                                y10.J(c1005oC, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                            boolA = c0981g.A("google_analytics_tcf_data_enabled");
                            if (boolA != null) {
                                C1023u0.m(x13);
                                v10.a("TCF client enabled.");
                                C1023u0.l(y10);
                                y10.o();
                                X x2117 = c1023u3.f17584w;
                                C1023u0.m(x2117);
                                x2117.f17177D.a("Register tcfPrefChangeListener.");
                                if (y10.f17229L == null) {
                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            Y0 y12 = y10;
                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                            C0981g c0981g5 = c1023u9.f17582u;
                                            X x2118 = c1023u9.f17584w;
                                            if (!c0981g5.y(null, G.f16930a1)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    C1023u0.m(x2118);
                                                    x2118.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m10 = y12.f17230M;
                                                    U6.y.f(m10);
                                                    m10.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                C1023u0.m(x2118);
                                                x2118.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m11 = y12.f17230M;
                                                U6.y.f(m11);
                                                m11.b(500L);
                                            }
                                        }
                                    };
                                }
                                C0985h0 c0985h1119 = c1023u3.f17583v;
                                C1023u0.k(c0985h1119);
                                c0985h1119.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                C1023u0.l(y10);
                                y10.u();
                            } else {
                                C1023u0.m(x13);
                                v10.a("TCF client enabled.");
                                C1023u0.l(y10);
                                y10.o();
                                X x2118 = c1023u3.f17584w;
                                C1023u0.m(x2118);
                                x2118.f17177D.a("Register tcfPrefChangeListener.");
                                if (y10.f17229L == null) {
                                    y10.f17230M = new M0(y10, c1023u3, 2);
                                    y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            Y0 y12 = y10;
                                            C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                            C0981g c0981g5 = c1023u9.f17582u;
                                            X x2119 = c1023u9.f17584w;
                                            if (!c0981g5.y(null, G.f16930a1)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    C1023u0.m(x2119);
                                                    x2119.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                    M0 m10 = y12.f17230M;
                                                    U6.y.f(m10);
                                                    m10.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                C1023u0.m(x2119);
                                                x2119.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m11 = y12.f17230M;
                                                U6.y.f(m11);
                                                m11.b(500L);
                                            }
                                        }
                                    };
                                }
                                C0985h0 c0985h11110 = c1023u3.f17583v;
                                C1023u0.k(c0985h11110);
                                c0985h11110.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                                C1023u0.l(y10);
                                y10.u();
                            }
                            c0979f0 = c0985h0.f17403w;
                            if (c0979f0.a() == 0) {
                                C1023u0.m(x13);
                                v12.b(Long.valueOf(j), "Persisting first open");
                                c0979f0.b(j);
                            }
                            C1023u0.l(y10);
                            c1020t0 = y10.f17226I;
                            if (c1020t0.d()) {
                                C0985h0 c0985h11111 = c1020t0.f17549r.f17583v;
                                C1023u0.k(c0985h11111);
                                c0985h11111.f17397N.k(null);
                            }
                            if (c1023u2.h()) {
                                if (c1023u2.a()) {
                                    v16 = v15;
                                    if (v16.N("android.permission.INTERNET")) {
                                        C1023u0.m(x13);
                                        v17 = v14;
                                        v17.a("App is missing INTERNET permission");
                                    } else {
                                        v17 = v14;
                                    }
                                    if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                        C1023u0.m(x13);
                                        v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    c1023u4 = c1023u2;
                                    context = c1023u4.f17579r;
                                    if (!Z6.b.a(context).c()) {
                                        if (!V1.g0(context)) {
                                            C1023u0.m(x13);
                                            v17.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!V1.H(context)) {
                                            C1023u0.m(x13);
                                            v17.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    C1023u0.m(x13);
                                    v17.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    v16 = v15;
                                    c1023u4 = c1023u2;
                                }
                                x9 = x13;
                            } else {
                                v16 = v15;
                                c1023u4 = c1023u2;
                                if (TextUtils.isEmpty(c1023u4.r().v())) {
                                    String strV117 = c1023u4.r().v();
                                    c0985h0.o();
                                    String string15 = c0985h0.s().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strV117);
                                    boolean zIsEmpty15 = TextUtils.isEmpty(string15);
                                    if (zIsEmpty) {
                                        rVar3 = rVar2;
                                    } else {
                                        rVar3 = rVar2;
                                    }
                                    String strV118 = c1023u4.r().v();
                                    c0985h0.o();
                                    SharedPreferences.Editor editorEdit17 = c0985h0.s().edit();
                                    editorEdit17.putString("gmp_app_id", strV118);
                                    editorEdit17.apply();
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (!c0985h0.v().i(g10)) {
                                    rVar3.k(null);
                                }
                                C1023u0.l(y10);
                                y10.f17236x.set(rVar3.j());
                                c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                x9 = x13;
                                if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                    zA = c1023u4.a();
                                    sharedPreferences = c0985h0.f17400t;
                                    if (sharedPreferences == null) {
                                        zContains = z11;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        c0985h0.x(!zA);
                                    }
                                    if (zA) {
                                        C1023u0.l(y10);
                                        y10.A();
                                    }
                                    B1 b113 = c1023u4.f17586y;
                                    C1023u0.l(b113);
                                    b113.f16834v.s();
                                    c1023u4.p().s(new AtomicReference());
                                    c1023u4.p().t(c0985h0.f17399P.L());
                                }
                            }
                            R3.a();
                            if (c0981g.y(null, G.f16914R0)) {
                                v16.o();
                                if (v16.L() == 1) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if (z12) {
                                    long jIntValue15 = ((Integer) G.f16986y0.a(null)).intValue();
                                    long jNextInt15 = new Random().nextInt(5000);
                                    c1023u4.f17564B.getClass();
                                    jMax = Math.max(500L, ((jIntValue15 * 1000) + jNextInt15) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        C1023u0.m(x9);
                                        v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    C1023u0.l(y10);
                                    y10.o();
                                    if (y10.f17220C == null) {
                                        y10.f17220C = new M0(y10, c1023u3, 0);
                                    }
                                    y10.f17220C.b(jMax);
                                }
                            }
                            c0985h0.f17389F.b(true);
                            return;
                        }
                        EnumMap enumMap10 = new EnumMap(G0.class);
                        enumMap10.put(G0.f16989s, e0D);
                        enumMap10.put(g10, e0D2);
                        h7 = new H0(enumMap10, -10);
                    }
                    z11 = false;
                    if (h7 != null) {
                        C1023u0.l(y10);
                        y10.K(h7, true);
                    } else {
                        h7 = h0V;
                    }
                    C1023u0.l(y10);
                    c1023u3 = (C1023u0) y10.f16104r;
                    y10.s(h7);
                    c0985h0.o();
                    int i1110 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                    e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                    if (e0D3 != e11) {
                        C1023u0.m(x13);
                        v12.b(e0D3, "Default ad personalization consent from Manifest");
                    }
                    e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                    if (e0D4 == e11) {
                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                            c1005oC = C1005o.c(30, bundle);
                            it = c1005oC.f17494e.values().iterator();
                            while (it.hasNext()) {
                                if (((E0) it.next()) != e11) {
                                    C1023u0.l(y10);
                                    y10.J(c1005oC, true);
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                            c1005oC = C1005o.c(30, bundle);
                            it = c1005oC.f17494e.values().iterator();
                            while (it.hasNext()) {
                                if (((E0) it.next()) != e11) {
                                    C1023u0.l(y10);
                                    y10.J(c1005oC, true);
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                        c1005oC = C1005o.c(30, bundle);
                        it = c1005oC.f17494e.values().iterator();
                        while (it.hasNext()) {
                            if (((E0) it.next()) != e11) {
                                C1023u0.l(y10);
                                y10.J(c1005oC, true);
                            }
                        }
                    }
                    boolA = c0981g.A("google_analytics_tcf_data_enabled");
                    if (boolA != null) {
                        C1023u0.m(x13);
                        v10.a("TCF client enabled.");
                        C1023u0.l(y10);
                        y10.o();
                        X x2119 = c1023u3.f17584w;
                        C1023u0.m(x2119);
                        x2119.f17177D.a("Register tcfPrefChangeListener.");
                        if (y10.f17229L == null) {
                            y10.f17230M = new M0(y10, c1023u3, 2);
                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    Y0 y12 = y10;
                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                    C0981g c0981g5 = c1023u9.f17582u;
                                    X x21110 = c1023u9.f17584w;
                                    if (!c0981g5.y(null, G.f16930a1)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            C1023u0.m(x21110);
                                            x21110.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m10 = y12.f17230M;
                                            U6.y.f(m10);
                                            m10.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        C1023u0.m(x21110);
                                        x21110.f17178E.a("IABTCF_TCString change picked up in listener.");
                                        M0 m11 = y12.f17230M;
                                        U6.y.f(m11);
                                        m11.b(500L);
                                    }
                                }
                            };
                        }
                        C0985h0 c0985h11112 = c1023u3.f17583v;
                        C1023u0.k(c0985h11112);
                        c0985h11112.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                        C1023u0.l(y10);
                        y10.u();
                    } else {
                        C1023u0.m(x13);
                        v10.a("TCF client enabled.");
                        C1023u0.l(y10);
                        y10.o();
                        X x21110 = c1023u3.f17584w;
                        C1023u0.m(x21110);
                        x21110.f17177D.a("Register tcfPrefChangeListener.");
                        if (y10.f17229L == null) {
                            y10.f17230M = new M0(y10, c1023u3, 2);
                            y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    Y0 y12 = y10;
                                    C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                    C0981g c0981g5 = c1023u9.f17582u;
                                    X x21111 = c1023u9.f17584w;
                                    if (!c0981g5.y(null, G.f16930a1)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            C1023u0.m(x21111);
                                            x21111.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m10 = y12.f17230M;
                                            U6.y.f(m10);
                                            m10.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        C1023u0.m(x21111);
                                        x21111.f17178E.a("IABTCF_TCString change picked up in listener.");
                                        M0 m11 = y12.f17230M;
                                        U6.y.f(m11);
                                        m11.b(500L);
                                    }
                                }
                            };
                        }
                        C0985h0 c0985h11113 = c1023u3.f17583v;
                        C1023u0.k(c0985h11113);
                        c0985h11113.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                        C1023u0.l(y10);
                        y10.u();
                    }
                    c0979f0 = c0985h0.f17403w;
                    if (c0979f0.a() == 0) {
                        C1023u0.m(x13);
                        v12.b(Long.valueOf(j), "Persisting first open");
                        c0979f0.b(j);
                    }
                    C1023u0.l(y10);
                    c1020t0 = y10.f17226I;
                    if (c1020t0.d()) {
                        C0985h0 c0985h11114 = c1020t0.f17549r.f17583v;
                        C1023u0.k(c0985h11114);
                        c0985h11114.f17397N.k(null);
                    }
                    if (c1023u2.h()) {
                        if (c1023u2.a()) {
                            v16 = v15;
                            if (v16.N("android.permission.INTERNET")) {
                                C1023u0.m(x13);
                                v17 = v14;
                                v17.a("App is missing INTERNET permission");
                            } else {
                                v17 = v14;
                            }
                            if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                C1023u0.m(x13);
                                v17.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            c1023u4 = c1023u2;
                            context = c1023u4.f17579r;
                            if (!Z6.b.a(context).c()) {
                                if (!V1.g0(context)) {
                                    C1023u0.m(x13);
                                    v17.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!V1.H(context)) {
                                    C1023u0.m(x13);
                                    v17.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            C1023u0.m(x13);
                            v17.a("Uploading is not possible. App measurement disabled");
                        } else {
                            v16 = v15;
                            c1023u4 = c1023u2;
                        }
                        x9 = x13;
                    } else {
                        v16 = v15;
                        c1023u4 = c1023u2;
                        if (TextUtils.isEmpty(c1023u4.r().v())) {
                            String strV119 = c1023u4.r().v();
                            c0985h0.o();
                            String string16 = c0985h0.s().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strV119);
                            boolean zIsEmpty16 = TextUtils.isEmpty(string16);
                            if (zIsEmpty) {
                                rVar3 = rVar2;
                            } else {
                                rVar3 = rVar2;
                            }
                            String strV1110 = c1023u4.r().v();
                            c0985h0.o();
                            SharedPreferences.Editor editorEdit18 = c0985h0.s().edit();
                            editorEdit18.putString("gmp_app_id", strV1110);
                            editorEdit18.apply();
                        } else {
                            rVar3 = rVar2;
                        }
                        if (!c0985h0.v().i(g10)) {
                            rVar3.k(null);
                        }
                        C1023u0.l(y10);
                        y10.f17236x.set(rVar3.j());
                        c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        x9 = x13;
                        if (!TextUtils.isEmpty(c1023u4.r().v())) {
                            zA = c1023u4.a();
                            sharedPreferences = c0985h0.f17400t;
                            if (sharedPreferences == null) {
                                zContains = z11;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                c0985h0.x(!zA);
                            }
                            if (zA) {
                                C1023u0.l(y10);
                                y10.A();
                            }
                            B1 b114 = c1023u4.f17586y;
                            C1023u0.l(b114);
                            b114.f16834v.s();
                            c1023u4.p().s(new AtomicReference());
                            c1023u4.p().t(c0985h0.f17399P.L());
                        }
                    }
                    R3.a();
                    if (c0981g.y(null, G.f16914R0)) {
                        v16.o();
                        if (v16.L() == 1) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (z12) {
                            long jIntValue16 = ((Integer) G.f16986y0.a(null)).intValue();
                            long jNextInt16 = new Random().nextInt(5000);
                            c1023u4.f17564B.getClass();
                            jMax = Math.max(500L, ((jIntValue16 * 1000) + jNextInt16) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                C1023u0.m(x9);
                                v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            C1023u0.l(y10);
                            y10.o();
                            if (y10.f17220C == null) {
                                y10.f17220C = new M0(y10, c1023u3, 0);
                            }
                            y10.f17220C.b(jMax);
                        }
                    }
                    c0985h0.f17389F.b(true);
                    return;
                }
                X x2120 = c1023u0.f17584w;
                C1023u0.m(x2120);
                x2120.f17182w.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = c1023u0.f17579r.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                        break;
                    }
                }
                if (listAsList != null) {
                    o11.f17039B = listAsList;
                } else if (listAsList.isEmpty()) {
                    C1023u0.m(x16);
                    x16.f17175B.a("Safelisted event list is empty. Ignoring");
                } else {
                    it2 = listAsList.iterator();
                    do {
                        if (it2.hasNext()) {
                            str5 = (String) it2.next();
                            v18 = c1023u8.f17587z;
                            C1023u0.k(v18);
                        } else {
                            o11.f17039B = listAsList;
                        }
                    } while (v18.r0("safelisted event", str5));
                }
                if (packageManager != null) {
                    o11.f17041D = Z6.a.f(context3) ? 1 : 0;
                } else {
                    o11.f17041D = 0;
                }
                ((C1023u0) o11.f16104r).T.incrementAndGet();
                o11.f17002s = true;
                c0974d1 = new C0974d1(c1023u6);
                c0974d1.q();
                c1023u6.f17574L = c0974d1;
                if (!c0974d1.f17002s) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                c0974d1.f17322t = (JobScheduler) ((C1023u0) c0974d1.f16104r).f17579r.getSystemService("jobscheduler");
                ((C1023u0) c0974d1.f16104r).T.incrementAndGet();
                c0974d1.f17002s = true;
                C1023u0.m(x13);
                v10 = x13.f17177D;
                v11 = x13.f17176C;
                v12 = x13.f17178E;
                v13 = x13.f17182w;
                c0981g.t();
                v11.b(133005L, "App measurement initialized, version");
                C1023u0.m(x13);
                v11.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strU = o10.u();
                if (v19.Q(strU, c0981g.f17359t)) {
                    C1023u0.m(x13);
                    v11.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    C1023u0.m(x13);
                    v11.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strU)));
                }
                C1023u0.m(x13);
                v10.a("Debug-level message logging enabled");
                i11 = c1023u6.R;
                atomicInteger = c1023u6.T;
                if (i11 != atomicInteger.get()) {
                    C1023u0.m(x13);
                    v13.c(Integer.valueOf(c1023u6.R), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                c1023u6.f17575M = true;
                j = c1023u6.U;
                g10 = G0.f16990t;
                y10 = c1023u6.f17566D;
                C1014r0 c1014r8 = c1023u6.f17585x;
                C1023u0.m(c1014r8);
                c1014r8.o();
                C1023u0.j(c1023u6.f17574L);
                iT = c1023u6.f17574L.t();
                R3.a();
                zY = c0981g.y(null, G.f16914R0);
                if (iT == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zY) {
                    v19.o();
                    if (v19.L() == 1) {
                        v19.o();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        zzwVar = new zzw(c1023u7);
                        z13 = z10;
                        context2 = c1023u7.f17579r;
                        v14 = v13;
                        i13 = Build.VERSION.SDK_INT;
                        v15 = v19;
                        if (i13 >= 33) {
                            Z6.a.j(context2, zzwVar, intentFilter);
                        } else if (i13 >= 26) {
                            Z6.a.i(context2, zzwVar, intentFilter);
                        } else {
                            context2.registerReceiver(zzwVar, intentFilter, null, null);
                        }
                        X x1113 = c1023u7.f17584w;
                        C1023u0.m(x1113);
                        x1113.f17177D.a("Registered app receiver");
                        if (z13) {
                            C1023u0.j(c1023u6.f17574L);
                            c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                        }
                    } else if (z10) {
                        z10 = true;
                        v19.o();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        zzwVar = new zzw(c1023u7);
                        z13 = z10;
                        context2 = c1023u7.f17579r;
                        v14 = v13;
                        i13 = Build.VERSION.SDK_INT;
                        v15 = v19;
                        if (i13 >= 33) {
                            Z6.a.j(context2, zzwVar, intentFilter);
                        } else if (i13 >= 26) {
                            Z6.a.i(context2, zzwVar, intentFilter);
                        } else {
                            context2.registerReceiver(zzwVar, intentFilter, null, null);
                        }
                        X x1114 = c1023u7.f17584w;
                        C1023u0.m(x1114);
                        x1114.f17177D.a("Registered app receiver");
                        if (z13) {
                            C1023u0.j(c1023u6.f17574L);
                            c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                        }
                    } else {
                        v14 = v13;
                        v15 = v19;
                    }
                } else if (z10) {
                    z10 = true;
                    v19.o();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    zzwVar = new zzw(c1023u7);
                    z13 = z10;
                    context2 = c1023u7.f17579r;
                    v14 = v13;
                    i13 = Build.VERSION.SDK_INT;
                    v15 = v19;
                    if (i13 >= 33) {
                        Z6.a.j(context2, zzwVar, intentFilter);
                    } else if (i13 >= 26) {
                        Z6.a.i(context2, zzwVar, intentFilter);
                    } else {
                        context2.registerReceiver(zzwVar, intentFilter, null, null);
                    }
                    X x1115 = c1023u7.f17584w;
                    C1023u0.m(x1115);
                    x1115.f17177D.a("Registered app receiver");
                    if (z13) {
                        C1023u0.j(c1023u6.f17574L);
                        c1023u6.f17574L.s(((Long) G.f16886C.a(null)).longValue());
                    }
                } else {
                    v14 = v13;
                    v15 = v19;
                }
                rVar = c0985h0.f17404x;
                h0V = c0985h0.v();
                i12 = h0V.f17000b;
                e0D = c0981g.D("google_analytics_default_allow_ad_storage", false);
                e0D2 = c0981g.D("google_analytics_default_allow_analytics_storage", false);
                e11 = e10;
                if (e0D == e11) {
                    c1023u1 = c1023u7;
                    rVar2 = rVar;
                    c1023u2 = c1023u6;
                    if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                            if (i12 == 0) {
                            }
                            C1023u0.l(y10);
                            z11 = false;
                            y10.K(new H0(-10), false);
                        } else {
                            z11 = false;
                        }
                        h7 = null;
                        if (h7 != null) {
                            C1023u0.l(y10);
                            y10.K(h7, true);
                        } else {
                            h7 = h0V;
                        }
                        C1023u0.l(y10);
                        c1023u3 = (C1023u0) y10.f16104r;
                        y10.s(h7);
                        c0985h0.o();
                        int i1111 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                        e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                        if (e0D3 != e11) {
                            C1023u0.m(x13);
                            v12.b(e0D3, "Default ad personalization consent from Manifest");
                        }
                        e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                        if (e0D4 == e11) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                            c1005oC = C1005o.c(30, bundle);
                            it = c1005oC.f17494e.values().iterator();
                            while (it.hasNext()) {
                                if (((E0) it.next()) != e11) {
                                    C1023u0.l(y10);
                                    y10.J(c1005oC, true);
                                }
                            }
                        }
                        boolA = c0981g.A("google_analytics_tcf_data_enabled");
                        if (boolA != null) {
                            C1023u0.m(x13);
                            v10.a("TCF client enabled.");
                            C1023u0.l(y10);
                            y10.o();
                            X x21111 = c1023u3.f17584w;
                            C1023u0.m(x21111);
                            x21111.f17177D.a("Register tcfPrefChangeListener.");
                            if (y10.f17229L == null) {
                                y10.f17230M = new M0(y10, c1023u3, 2);
                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        Y0 y12 = y10;
                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                        C0981g c0981g5 = c1023u9.f17582u;
                                        X x21112 = c1023u9.f17584w;
                                        if (!c0981g5.y(null, G.f16930a1)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                C1023u0.m(x21112);
                                                x21112.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m10 = y12.f17230M;
                                                U6.y.f(m10);
                                                m10.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C1023u0.m(x21112);
                                            x21112.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m11 = y12.f17230M;
                                            U6.y.f(m11);
                                            m11.b(500L);
                                        }
                                    }
                                };
                            }
                            C0985h0 c0985h11115 = c1023u3.f17583v;
                            C1023u0.k(c0985h11115);
                            c0985h11115.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                            C1023u0.l(y10);
                            y10.u();
                        } else {
                            C1023u0.m(x13);
                            v10.a("TCF client enabled.");
                            C1023u0.l(y10);
                            y10.o();
                            X x21112 = c1023u3.f17584w;
                            C1023u0.m(x21112);
                            x21112.f17177D.a("Register tcfPrefChangeListener.");
                            if (y10.f17229L == null) {
                                y10.f17230M = new M0(y10, c1023u3, 2);
                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        Y0 y12 = y10;
                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                        C0981g c0981g5 = c1023u9.f17582u;
                                        X x21113 = c1023u9.f17584w;
                                        if (!c0981g5.y(null, G.f16930a1)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                C1023u0.m(x21113);
                                                x21113.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m10 = y12.f17230M;
                                                U6.y.f(m10);
                                                m10.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C1023u0.m(x21113);
                                            x21113.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m11 = y12.f17230M;
                                            U6.y.f(m11);
                                            m11.b(500L);
                                        }
                                    }
                                };
                            }
                            C0985h0 c0985h11116 = c1023u3.f17583v;
                            C1023u0.k(c0985h11116);
                            c0985h11116.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                            C1023u0.l(y10);
                            y10.u();
                        }
                        c0979f0 = c0985h0.f17403w;
                        if (c0979f0.a() == 0) {
                            C1023u0.m(x13);
                            v12.b(Long.valueOf(j), "Persisting first open");
                            c0979f0.b(j);
                        }
                        C1023u0.l(y10);
                        c1020t0 = y10.f17226I;
                        if (c1020t0.d()) {
                            C0985h0 c0985h11117 = c1020t0.f17549r.f17583v;
                            C1023u0.k(c0985h11117);
                            c0985h11117.f17397N.k(null);
                        }
                        if (c1023u2.h()) {
                            if (c1023u2.a()) {
                                v16 = v15;
                                if (v16.N("android.permission.INTERNET")) {
                                    C1023u0.m(x13);
                                    v17 = v14;
                                    v17.a("App is missing INTERNET permission");
                                } else {
                                    v17 = v14;
                                }
                                if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                    C1023u0.m(x13);
                                    v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                c1023u4 = c1023u2;
                                context = c1023u4.f17579r;
                                if (!Z6.b.a(context).c()) {
                                    if (!V1.g0(context)) {
                                        C1023u0.m(x13);
                                        v17.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!V1.H(context)) {
                                        C1023u0.m(x13);
                                        v17.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                C1023u0.m(x13);
                                v17.a("Uploading is not possible. App measurement disabled");
                            } else {
                                v16 = v15;
                                c1023u4 = c1023u2;
                            }
                            x9 = x13;
                        } else {
                            v16 = v15;
                            c1023u4 = c1023u2;
                            if (TextUtils.isEmpty(c1023u4.r().v())) {
                                String strV1111 = c1023u4.r().v();
                                c0985h0.o();
                                String string17 = c0985h0.s().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strV1111);
                                boolean zIsEmpty17 = TextUtils.isEmpty(string17);
                                if (zIsEmpty) {
                                    rVar3 = rVar2;
                                } else {
                                    rVar3 = rVar2;
                                }
                                String strV1112 = c1023u4.r().v();
                                c0985h0.o();
                                SharedPreferences.Editor editorEdit19 = c0985h0.s().edit();
                                editorEdit19.putString("gmp_app_id", strV1112);
                                editorEdit19.apply();
                            } else {
                                rVar3 = rVar2;
                            }
                            if (!c0985h0.v().i(g10)) {
                                rVar3.k(null);
                            }
                            C1023u0.l(y10);
                            y10.f17236x.set(rVar3.j());
                            c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            x9 = x13;
                            if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                zA = c1023u4.a();
                                sharedPreferences = c0985h0.f17400t;
                                if (sharedPreferences == null) {
                                    zContains = z11;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    c0985h0.x(!zA);
                                }
                                if (zA) {
                                    C1023u0.l(y10);
                                    y10.A();
                                }
                                B1 b115 = c1023u4.f17586y;
                                C1023u0.l(b115);
                                b115.f16834v.s();
                                c1023u4.p().s(new AtomicReference());
                                c1023u4.p().t(c0985h0.f17399P.L());
                            }
                        }
                        R3.a();
                        if (c0981g.y(null, G.f16914R0)) {
                            v16.o();
                            if (v16.L() == 1) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (z12) {
                                long jIntValue17 = ((Integer) G.f16986y0.a(null)).intValue();
                                long jNextInt17 = new Random().nextInt(5000);
                                c1023u4.f17564B.getClass();
                                jMax = Math.max(500L, ((jIntValue17 * 1000) + jNextInt17) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    C1023u0.m(x9);
                                    v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                C1023u0.l(y10);
                                y10.o();
                                if (y10.f17220C == null) {
                                    y10.f17220C = new M0(y10, c1023u3, 0);
                                }
                                y10.f17220C.b(jMax);
                            }
                        }
                        c0985h0.f17389F.b(true);
                        return;
                    }
                    EnumMap enumMap11 = new EnumMap(G0.class);
                    enumMap11.put(G0.f16989s, e0D);
                    enumMap11.put(g10, e0D2);
                    h7 = new H0(enumMap11, -10);
                } else {
                    c1023u1 = c1023u7;
                    rVar2 = rVar;
                    c1023u2 = c1023u6;
                    if (H0.l(-10, c0985h0.s().getInt("consent_source", 100))) {
                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                            if (i12 == 0) {
                            }
                            C1023u0.l(y10);
                            z11 = false;
                            y10.K(new H0(-10), false);
                        } else {
                            z11 = false;
                        }
                        h7 = null;
                        if (h7 != null) {
                            C1023u0.l(y10);
                            y10.K(h7, true);
                        } else {
                            h7 = h0V;
                        }
                        C1023u0.l(y10);
                        c1023u3 = (C1023u0) y10.f16104r;
                        y10.s(h7);
                        c0985h0.o();
                        int i1112 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                        e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                        if (e0D3 != e11) {
                            C1023u0.m(x13);
                            v12.b(e0D3, "Default ad personalization consent from Manifest");
                        }
                        e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                        if (e0D4 == e11) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                if (TextUtils.isEmpty(c1023u2.r().v())) {
                                    c1005oC = C1005o.c(30, bundle);
                                    it = c1005oC.f17494e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((E0) it.next()) != e11) {
                                            C1023u0.l(y10);
                                            y10.J(c1005oC, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                            if (TextUtils.isEmpty(c1023u2.r().v())) {
                                c1005oC = C1005o.c(30, bundle);
                                it = c1005oC.f17494e.values().iterator();
                                while (it.hasNext()) {
                                    if (((E0) it.next()) != e11) {
                                        C1023u0.l(y10);
                                        y10.J(c1005oC, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                            c1005oC = C1005o.c(30, bundle);
                            it = c1005oC.f17494e.values().iterator();
                            while (it.hasNext()) {
                                if (((E0) it.next()) != e11) {
                                    C1023u0.l(y10);
                                    y10.J(c1005oC, true);
                                }
                            }
                        }
                        boolA = c0981g.A("google_analytics_tcf_data_enabled");
                        if (boolA != null) {
                            C1023u0.m(x13);
                            v10.a("TCF client enabled.");
                            C1023u0.l(y10);
                            y10.o();
                            X x21113 = c1023u3.f17584w;
                            C1023u0.m(x21113);
                            x21113.f17177D.a("Register tcfPrefChangeListener.");
                            if (y10.f17229L == null) {
                                y10.f17230M = new M0(y10, c1023u3, 2);
                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        Y0 y12 = y10;
                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                        C0981g c0981g5 = c1023u9.f17582u;
                                        X x21114 = c1023u9.f17584w;
                                        if (!c0981g5.y(null, G.f16930a1)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                C1023u0.m(x21114);
                                                x21114.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m10 = y12.f17230M;
                                                U6.y.f(m10);
                                                m10.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C1023u0.m(x21114);
                                            x21114.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m11 = y12.f17230M;
                                            U6.y.f(m11);
                                            m11.b(500L);
                                        }
                                    }
                                };
                            }
                            C0985h0 c0985h11118 = c1023u3.f17583v;
                            C1023u0.k(c0985h11118);
                            c0985h11118.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                            C1023u0.l(y10);
                            y10.u();
                        } else {
                            C1023u0.m(x13);
                            v10.a("TCF client enabled.");
                            C1023u0.l(y10);
                            y10.o();
                            X x21114 = c1023u3.f17584w;
                            C1023u0.m(x21114);
                            x21114.f17177D.a("Register tcfPrefChangeListener.");
                            if (y10.f17229L == null) {
                                y10.f17230M = new M0(y10, c1023u3, 2);
                                y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        Y0 y12 = y10;
                                        C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                        C0981g c0981g5 = c1023u9.f17582u;
                                        X x21115 = c1023u9.f17584w;
                                        if (!c0981g5.y(null, G.f16930a1)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                C1023u0.m(x21115);
                                                x21115.f17178E.a("IABTCF_TCString change picked up in listener.");
                                                M0 m10 = y12.f17230M;
                                                U6.y.f(m10);
                                                m10.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C1023u0.m(x21115);
                                            x21115.f17178E.a("IABTCF_TCString change picked up in listener.");
                                            M0 m11 = y12.f17230M;
                                            U6.y.f(m11);
                                            m11.b(500L);
                                        }
                                    }
                                };
                            }
                            C0985h0 c0985h11119 = c1023u3.f17583v;
                            C1023u0.k(c0985h11119);
                            c0985h11119.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                            C1023u0.l(y10);
                            y10.u();
                        }
                        c0979f0 = c0985h0.f17403w;
                        if (c0979f0.a() == 0) {
                            C1023u0.m(x13);
                            v12.b(Long.valueOf(j), "Persisting first open");
                            c0979f0.b(j);
                        }
                        C1023u0.l(y10);
                        c1020t0 = y10.f17226I;
                        if (c1020t0.d()) {
                            C0985h0 c0985h111110 = c1020t0.f17549r.f17583v;
                            C1023u0.k(c0985h111110);
                            c0985h111110.f17397N.k(null);
                        }
                        if (c1023u2.h()) {
                            if (c1023u2.a()) {
                                v16 = v15;
                                if (v16.N("android.permission.INTERNET")) {
                                    C1023u0.m(x13);
                                    v17 = v14;
                                    v17.a("App is missing INTERNET permission");
                                } else {
                                    v17 = v14;
                                }
                                if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                                    C1023u0.m(x13);
                                    v17.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                c1023u4 = c1023u2;
                                context = c1023u4.f17579r;
                                if (!Z6.b.a(context).c()) {
                                    if (!V1.g0(context)) {
                                        C1023u0.m(x13);
                                        v17.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!V1.H(context)) {
                                        C1023u0.m(x13);
                                        v17.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                C1023u0.m(x13);
                                v17.a("Uploading is not possible. App measurement disabled");
                            } else {
                                v16 = v15;
                                c1023u4 = c1023u2;
                            }
                            x9 = x13;
                        } else {
                            v16 = v15;
                            c1023u4 = c1023u2;
                            if (TextUtils.isEmpty(c1023u4.r().v())) {
                                String strV1113 = c1023u4.r().v();
                                c0985h0.o();
                                String string18 = c0985h0.s().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strV1113);
                                boolean zIsEmpty18 = TextUtils.isEmpty(string18);
                                if (zIsEmpty) {
                                    rVar3 = rVar2;
                                } else {
                                    rVar3 = rVar2;
                                }
                                String strV1114 = c1023u4.r().v();
                                c0985h0.o();
                                SharedPreferences.Editor editorEdit110 = c0985h0.s().edit();
                                editorEdit110.putString("gmp_app_id", strV1114);
                                editorEdit110.apply();
                            } else {
                                rVar3 = rVar2;
                            }
                            if (!c0985h0.v().i(g10)) {
                                rVar3.k(null);
                            }
                            C1023u0.l(y10);
                            y10.f17236x.set(rVar3.j());
                            c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            x9 = x13;
                            if (!TextUtils.isEmpty(c1023u4.r().v())) {
                                zA = c1023u4.a();
                                sharedPreferences = c0985h0.f17400t;
                                if (sharedPreferences == null) {
                                    zContains = z11;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    c0985h0.x(!zA);
                                }
                                if (zA) {
                                    C1023u0.l(y10);
                                    y10.A();
                                }
                                B1 b116 = c1023u4.f17586y;
                                C1023u0.l(b116);
                                b116.f16834v.s();
                                c1023u4.p().s(new AtomicReference());
                                c1023u4.p().t(c0985h0.f17399P.L());
                            }
                        }
                        R3.a();
                        if (c0981g.y(null, G.f16914R0)) {
                            v16.o();
                            if (v16.L() == 1) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (z12) {
                                long jIntValue18 = ((Integer) G.f16986y0.a(null)).intValue();
                                long jNextInt18 = new Random().nextInt(5000);
                                c1023u4.f17564B.getClass();
                                jMax = Math.max(500L, ((jIntValue18 * 1000) + jNextInt18) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    C1023u0.m(x9);
                                    v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                C1023u0.l(y10);
                                y10.o();
                                if (y10.f17220C == null) {
                                    y10.f17220C = new M0(y10, c1023u3, 0);
                                }
                                y10.f17220C.b(jMax);
                            }
                        }
                        c0985h0.f17389F.b(true);
                        return;
                    }
                    EnumMap enumMap12 = new EnumMap(G0.class);
                    enumMap12.put(G0.f16989s, e0D);
                    enumMap12.put(g10, e0D2);
                    h7 = new H0(enumMap12, -10);
                }
                z11 = false;
                if (h7 != null) {
                    C1023u0.l(y10);
                    y10.K(h7, true);
                } else {
                    h7 = h0V;
                }
                C1023u0.l(y10);
                c1023u3 = (C1023u0) y10.f16104r;
                y10.s(h7);
                c0985h0.o();
                int i1113 = C1005o.b(c0985h0.s().getString("dma_consent_settings", null)).f17490a;
                e0D3 = c0981g.D("google_analytics_default_allow_ad_personalization_signals", true);
                if (e0D3 != e11) {
                    C1023u0.m(x13);
                    v12.b(e0D3, "Default ad personalization consent from Manifest");
                }
                e0D4 = c0981g.D("google_analytics_default_allow_ad_user_data", true);
                if (e0D4 == e11) {
                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                        if (TextUtils.isEmpty(c1023u2.r().v())) {
                            c1005oC = C1005o.c(30, bundle);
                            it = c1005oC.f17494e.values().iterator();
                            while (it.hasNext()) {
                                if (((E0) it.next()) != e11) {
                                    C1023u0.l(y10);
                                    y10.J(c1005oC, true);
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                        c1005oC = C1005o.c(30, bundle);
                        it = c1005oC.f17494e.values().iterator();
                        while (it.hasNext()) {
                            if (((E0) it.next()) != e11) {
                                C1023u0.l(y10);
                                y10.J(c1005oC, true);
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                    if (TextUtils.isEmpty(c1023u2.r().v())) {
                        c1005oC = C1005o.c(30, bundle);
                        it = c1005oC.f17494e.values().iterator();
                        while (it.hasNext()) {
                            if (((E0) it.next()) != e11) {
                                C1023u0.l(y10);
                                y10.J(c1005oC, true);
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(c1023u2.r().v())) {
                    c1005oC = C1005o.c(30, bundle);
                    it = c1005oC.f17494e.values().iterator();
                    while (it.hasNext()) {
                        if (((E0) it.next()) != e11) {
                            C1023u0.l(y10);
                            y10.J(c1005oC, true);
                        }
                    }
                }
                boolA = c0981g.A("google_analytics_tcf_data_enabled");
                if (boolA != null) {
                    C1023u0.m(x13);
                    v10.a("TCF client enabled.");
                    C1023u0.l(y10);
                    y10.o();
                    X x21115 = c1023u3.f17584w;
                    C1023u0.m(x21115);
                    x21115.f17177D.a("Register tcfPrefChangeListener.");
                    if (y10.f17229L == null) {
                        y10.f17230M = new M0(y10, c1023u3, 2);
                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                Y0 y12 = y10;
                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                C0981g c0981g5 = c1023u9.f17582u;
                                X x21116 = c1023u9.f17584w;
                                if (!c0981g5.y(null, G.f16930a1)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        C1023u0.m(x21116);
                                        x21116.f17178E.a("IABTCF_TCString change picked up in listener.");
                                        M0 m10 = y12.f17230M;
                                        U6.y.f(m10);
                                        m10.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    C1023u0.m(x21116);
                                    x21116.f17178E.a("IABTCF_TCString change picked up in listener.");
                                    M0 m11 = y12.f17230M;
                                    U6.y.f(m11);
                                    m11.b(500L);
                                }
                            }
                        };
                    }
                    C0985h0 c0985h111111 = c1023u3.f17583v;
                    C1023u0.k(c0985h111111);
                    c0985h111111.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                    C1023u0.l(y10);
                    y10.u();
                } else {
                    C1023u0.m(x13);
                    v10.a("TCF client enabled.");
                    C1023u0.l(y10);
                    y10.o();
                    X x21116 = c1023u3.f17584w;
                    C1023u0.m(x21116);
                    x21116.f17177D.a("Register tcfPrefChangeListener.");
                    if (y10.f17229L == null) {
                        y10.f17230M = new M0(y10, c1023u3, 2);
                        y10.f17229L = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i7.X0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                Y0 y12 = y10;
                                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                                C0981g c0981g5 = c1023u9.f17582u;
                                X x21117 = c1023u9.f17584w;
                                if (!c0981g5.y(null, G.f16930a1)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        C1023u0.m(x21117);
                                        x21117.f17178E.a("IABTCF_TCString change picked up in listener.");
                                        M0 m10 = y12.f17230M;
                                        U6.y.f(m10);
                                        m10.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    C1023u0.m(x21117);
                                    x21117.f17178E.a("IABTCF_TCString change picked up in listener.");
                                    M0 m11 = y12.f17230M;
                                    U6.y.f(m11);
                                    m11.b(500L);
                                }
                            }
                        };
                    }
                    C0985h0 c0985h111112 = c1023u3.f17583v;
                    C1023u0.k(c0985h111112);
                    c0985h111112.t().registerOnSharedPreferenceChangeListener(y10.f17229L);
                    C1023u0.l(y10);
                    y10.u();
                }
                c0979f0 = c0985h0.f17403w;
                if (c0979f0.a() == 0) {
                    C1023u0.m(x13);
                    v12.b(Long.valueOf(j), "Persisting first open");
                    c0979f0.b(j);
                }
                C1023u0.l(y10);
                c1020t0 = y10.f17226I;
                if (c1020t0.d()) {
                    C0985h0 c0985h111113 = c1020t0.f17549r.f17583v;
                    C1023u0.k(c0985h111113);
                    c0985h111113.f17397N.k(null);
                }
                if (c1023u2.h()) {
                    if (c1023u2.a()) {
                        v16 = v15;
                        if (v16.N("android.permission.INTERNET")) {
                            C1023u0.m(x13);
                            v17 = v14;
                            v17.a("App is missing INTERNET permission");
                        } else {
                            v17 = v14;
                        }
                        if (!v16.N("android.permission.ACCESS_NETWORK_STATE")) {
                            C1023u0.m(x13);
                            v17.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        c1023u4 = c1023u2;
                        context = c1023u4.f17579r;
                        if (!Z6.b.a(context).c()) {
                            if (!V1.g0(context)) {
                                C1023u0.m(x13);
                                v17.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!V1.H(context)) {
                                C1023u0.m(x13);
                                v17.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        C1023u0.m(x13);
                        v17.a("Uploading is not possible. App measurement disabled");
                    } else {
                        v16 = v15;
                        c1023u4 = c1023u2;
                    }
                    x9 = x13;
                } else {
                    v16 = v15;
                    c1023u4 = c1023u2;
                    if (TextUtils.isEmpty(c1023u4.r().v())) {
                        String strV1115 = c1023u4.r().v();
                        c0985h0.o();
                        String string19 = c0985h0.s().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strV1115);
                        boolean zIsEmpty19 = TextUtils.isEmpty(string19);
                        if (zIsEmpty) {
                            rVar3 = rVar2;
                        } else {
                            rVar3 = rVar2;
                        }
                        String strV1116 = c1023u4.r().v();
                        c0985h0.o();
                        SharedPreferences.Editor editorEdit111 = c0985h0.s().edit();
                        editorEdit111.putString("gmp_app_id", strV1116);
                        editorEdit111.apply();
                    } else {
                        rVar3 = rVar2;
                    }
                    if (!c0985h0.v().i(g10)) {
                        rVar3.k(null);
                    }
                    C1023u0.l(y10);
                    y10.f17236x.set(rVar3.j());
                    c1023u1.f17579r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    x9 = x13;
                    if (!TextUtils.isEmpty(c1023u4.r().v())) {
                        zA = c1023u4.a();
                        sharedPreferences = c0985h0.f17400t;
                        if (sharedPreferences == null) {
                            zContains = z11;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            c0985h0.x(!zA);
                        }
                        if (zA) {
                            C1023u0.l(y10);
                            y10.A();
                        }
                        B1 b117 = c1023u4.f17586y;
                        C1023u0.l(b117);
                        b117.f16834v.s();
                        c1023u4.p().s(new AtomicReference());
                        c1023u4.p().t(c0985h0.f17399P.L());
                    }
                }
                R3.a();
                if (c0981g.y(null, G.f16914R0)) {
                    v16.o();
                    if (v16.L() == 1) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (z12) {
                        long jIntValue19 = ((Integer) G.f16986y0.a(null)).intValue();
                        long jNextInt19 = new Random().nextInt(5000);
                        c1023u4.f17564B.getClass();
                        jMax = Math.max(500L, ((jIntValue19 * 1000) + jNextInt19) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            C1023u0.m(x9);
                            v12.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        C1023u0.l(y10);
                        y10.o();
                        if (y10.f17220C == null) {
                            y10.f17220C = new M0(y10, c1023u3, 0);
                        }
                        y10.f17220C.b(jMax);
                    }
                }
                c0985h0.f17389F.b(true);
                return;
            case 11:
                Q1 q11 = ((B0) this.f15706t).f16830f;
                q11.B();
                C0975e c0975e = (C0975e) this.f15705s;
                if (c0975e.f17327t.b() == null) {
                    q11.getClass();
                    String str9 = c0975e.f17325r;
                    y.f(str9);
                    X1 x1Q = q11.Q(str9);
                    if (x1Q != null) {
                        q11.a0(c0975e, x1Q);
                        return;
                    }
                    return;
                }
                q11.getClass();
                String str10 = c0975e.f17325r;
                y.f(str10);
                X1 x1Q2 = q11.Q(str10);
                if (x1Q2 != null) {
                    q11.Z(c0975e, x1Q2);
                    return;
                }
                return;
            case 12:
                N n6 = (N) this.f15705s;
                Y0 y12 = (Y0) this.f15706t;
                C1023u0 c1023u9 = (C1023u0) y12.f16104r;
                C1023u0 c1023u10 = (C1023u0) y12.f16104r;
                B1 b20 = c1023u9.f17586y;
                C1023u0.l(b20);
                C1023u0 c1023u11 = (C1023u0) b20.f16104r;
                C0985h0 c0985h20 = c1023u11.f17583v;
                C1023u0.k(c0985h20);
                if (c0985h20.v().i(G0.f16990t)) {
                    C1023u0.k(c0985h20);
                    C0979f0 c0979f1 = c0985h20.f17391H;
                    c1023u11.f17564B.getClass();
                    if (!c0985h20.y(System.currentTimeMillis()) && c0979f1.a() != 0) {
                        lValueOf = Long.valueOf(c0979f1.a());
                    }
                    if (lValueOf == null) {
                        V1 v20 = c1023u10.f17587z;
                        C1023u0.k(v20);
                        v20.Z(n6, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            n6.D(null);
                            return;
                        } catch (RemoteException e20) {
                            X x30 = c1023u10.f17584w;
                            C1023u0.m(x30);
                            x30.f17182w.b(e20, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                X x31 = c1023u11.f17584w;
                C1023u0.m(x31);
                x31.f17175B.a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    n6.D(null);
                    return;
                }
                V1 v21 = c1023u10.f17587z;
                C1023u0.k(v21);
                v21.Z(n6, lValueOf.longValue());
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                ((Y0) this.f15706t).F((Boolean) this.f15705s, true);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                Y0 y13 = (Y0) this.f15706t;
                C1023u0 c1023u12 = (C1023u0) y13.f16104r;
                C0985h0 c0985h21 = c1023u12.f17583v;
                X x32 = c1023u12.f17584w;
                C1023u0.k(c0985h21);
                c0985h21.o();
                c0985h21.o();
                C1005o c1005oB = C1005o.b(c0985h21.s().getString("dma_consent_settings", null));
                C1005o c1005o = (C1005o) this.f15705s;
                int i20 = c1005o.f17490a;
                if (!H0.l(i20, c1005oB.f17490a)) {
                    C1023u0.m(x32);
                    x32.f17176C.b(Integer.valueOf(i20), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit20 = c0985h21.s().edit();
                editorEdit20.putString("dma_consent_settings", c1005o.f17491b);
                editorEdit20.apply();
                C1023u0.m(x32);
                x32.f17178E.b(c1005o, "Setting DMA consent(FE)");
                C1023u0 c1023u13 = (C1023u0) y13.f16104r;
                if (c1023u13.p().y()) {
                    C1021t1 c1021t1P = c1023u13.p();
                    c1021t1P.o();
                    c1021t1P.p();
                    c1021t1P.C(new RunnableC1015r1(c1021t1P, 1));
                    return;
                }
                C1021t1 c1021t1P2 = c1023u13.p();
                c1021t1P2.o();
                c1021t1P2.p();
                if (c1021t1P2.x()) {
                    c1021t1P2.C(new RunnableC1007o1(c1021t1P2, c1021t1P2.E(false)));
                    return;
                }
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                a();
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                ((ServiceConnectionC1018s1) this.f15706t).f17547c.z((ComponentName) this.f15705s);
                return;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                d();
                return;
            case 20:
                e();
                return;
            case 21:
                f();
                return;
            case 22:
                g();
                return;
            case 23:
                h();
                return;
            case 24:
                i();
                return;
            case 25:
                j();
                return;
            case 26:
                k();
                return;
            case 27:
                l();
                return;
            case 28:
                m();
                return;
            default:
                o oVar = (o) this.f15705s;
                try {
                    oVar.j(((Callable) this.f15706t).call());
                    return;
                } catch (Exception e21) {
                    oVar.i(e21);
                    return;
                } catch (Throwable th3) {
                    oVar.i(new RuntimeException(th3));
                    return;
                }
        }
    }

    public String toString() {
        String str;
        switch (this.f15704r) {
            case 0:
                android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(a.class.getSimpleName());
                n nVar = (n) this.f15706t;
                L5.c cVar = new L5.c(21, false);
                ((L5.c) rVar.f11366u).f5533t = cVar;
                rVar.f11366u = cVar;
                cVar.f5532s = nVar;
                return rVar.toString();
            case 22:
                Runnable runnable = (Runnable) this.f15705s;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((i) this.f15706t).f19060t;
                if (i10 == 1) {
                    str = "IDLE";
                } else if (i10 == 2) {
                    str = "QUEUING";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2, boolean z10) {
        this.f15704r = i10;
        this.f15706t = obj;
        this.f15705s = obj2;
    }

    public a(B b5, Q1 q10, Runnable runnable) {
        this.f15704r = 20;
        this.f15705s = q10;
        this.f15706t = runnable;
    }

    public a(ServiceConnectionC0988i0 serviceConnectionC0988i0, C c10, ServiceConnectionC0988i0 serviceConnectionC0988i1) {
        this.f15704r = 9;
        this.f15705s = c10;
        this.f15706t = serviceConnectionC0988i0;
    }

    public a(Y0 y10, N n6) {
        this.f15704r = 12;
        this.f15705s = n6;
        Objects.requireNonNull(y10);
        this.f15706t = y10;
    }

    public a(C1021t1 c1021t1, C0983g1 c0983g1) {
        this.f15704r = 17;
        this.f15705s = c0983g1;
        Objects.requireNonNull(c1021t1);
        this.f15706t = c1021t1;
    }

    public a(i iVar) {
        this.f15704r = 22;
        this.f15706t = iVar;
    }

    public a(E2.J j, F f3, int i10) {
        this.f15704r = 2;
        this.f15706t = j;
        this.f15705s = f3;
    }
}
