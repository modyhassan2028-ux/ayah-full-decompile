package E2;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.os.Messenger;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.measurement.internal.zzw;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import i7.A1;
import i7.B1;
import i7.C0967b0;
import i7.C0969c;
import i7.C0973d0;
import i7.C0979f0;
import i7.C0981g;
import i7.C0985h0;
import i7.C0991j0;
import i7.C0999m;
import i7.C1003n0;
import i7.C1014r0;
import i7.C1021t1;
import i7.C1023u0;
import i7.C1027v1;
import i7.G1;
import i7.Q1;
import i7.RunnableC1007o1;
import i7.RunnableC1015r1;
import i7.RunnableC1036y1;
import i7.ServiceConnectionC1018s1;
import i7.V1;
import i7.Y0;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p056f2.AbstractComponentCallbacksC0947u;
import p151p.C1261p0;

/* JADX INFO: renamed from: E2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0147v implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1786s;

    public /* synthetic */ RunnableC0147v(int i10, Object obj) {
        this.f1785r = i10;
        this.f1786s = obj;
    }

    private final void a() {
        na.a aVarB;
        long jNanoTime;
        na.a aVarB2;
        na.d dVar = (na.d) this.f1786s;
        synchronized (dVar) {
            dVar.g++;
            aVarB = dVar.b();
        }
        if (aVarB == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(aVarB.f20033a);
                Logger logger = ((na.d) this.f1786s).f20048b;
                na.c cVar = aVarB.f20035c;
                p251z9.j.b(cVar);
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    va.g.f(logger, aVarB, cVar, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jA = aVarB.a();
                    if (zIsLoggable) {
                        va.g.f(logger, aVarB, cVar, "finished run in " + va.g.p(System.nanoTime() - jNanoTime));
                    }
                    na.d dVar2 = (na.d) this.f1786s;
                    synchronized (dVar2) {
                        na.d.a(dVar2, aVarB, jA, true);
                        aVarB2 = dVar2.b();
                    }
                    if (aVarB2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    aVarB = aVarB2;
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        va.g.f(logger, aVarB, cVar, "failed a run in " + va.g.p(System.nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    na.d dVar3 = (na.d) this.f1786s;
                    synchronized (dVar3) {
                        na.d.a(dVar3, aVarB, -1L, false);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setName(name);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x0529  */
    /* JADX WARN: Code duplicated, block: B:65:0x0278  */
    @Override // java.lang.Runnable
    public final void run() {
        int iD;
        int height;
        int i10 = 3;
        int i11 = 2;
        int i12 = 1;
        int iD2 = 0;
        switch (this.f1785r) {
            case 0:
                C0151z c0151z = (C0151z) this.f1786s;
                ValueAnimator valueAnimator = c0151z.f1824z;
                int i13 = c0151z.f1799A;
                if (i13 == 1) {
                    valueAnimator.cancel();
                } else if (i13 != 2) {
                    return;
                }
                c0151z.f1799A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 1:
                J j = (J) this.f1786s;
                if (j.f1519c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = j.f1516B;
                    long j11 = j10 != Long.MIN_VALUE ? jCurrentTimeMillis - j10 : 0L;
                    AbstractC0135m0 layoutManager = j.f1532r.getLayoutManager();
                    if (j.f1515A == null) {
                        j.f1515A = new Rect();
                    }
                    layoutManager.d(j.f1515A, j.f1519c.f1486a);
                    if (layoutManager.e()) {
                        int i14 = (int) (j.j + j.f1523h);
                        int paddingLeft = (i14 - j.f1515A.left) - j.f1532r.getPaddingLeft();
                        float f3 = j.f1523h;
                        if ((f3 >= 0.0f || paddingLeft >= 0) && (f3 <= 0.0f || (paddingLeft = ((j.f1519c.f1486a.getWidth() + i14) + j.f1515A.right) - (j.f1532r.getWidth() - j.f1532r.getPaddingRight())) <= 0)) {
                            iD = 0;
                        } else {
                            iD = paddingLeft;
                        }
                    } else {
                        iD = 0;
                    }
                    if (layoutManager.f()) {
                        int i15 = (int) (j.f1525k + j.f1524i);
                        int paddingTop = (i15 - j.f1515A.top) - j.f1532r.getPaddingTop();
                        float f7 = j.f1524i;
                        if (f7 < 0.0f && paddingTop < 0) {
                            iD2 = paddingTop;
                        } else if (f7 > 0.0f && (height = ((j.f1519c.f1486a.getHeight() + i15) + j.f1515A.bottom) - (j.f1532r.getHeight() - j.f1532r.getPaddingBottom())) > 0) {
                            iD2 = height;
                        }
                    }
                    if (iD != 0) {
                        Q5.a aVar = j.f1527m;
                        RecyclerView recyclerView = j.f1532r;
                        int width = j.f1519c.f1486a.getWidth();
                        j.f1532r.getWidth();
                        iD = aVar.d(recyclerView, width, iD, j11);
                    }
                    int i16 = iD;
                    if (iD2 != 0) {
                        Q5.a aVar2 = j.f1527m;
                        RecyclerView recyclerView2 = j.f1532r;
                        int height2 = j.f1519c.f1486a.getHeight();
                        j.f1532r.getHeight();
                        iD2 = aVar2.d(recyclerView2, height2, iD2, j11);
                    }
                    if (i16 == 0 && iD2 == 0) {
                        j.f1516B = Long.MIN_VALUE;
                        return;
                    }
                    if (j.f1516B == Long.MIN_VALUE) {
                        j.f1516B = jCurrentTimeMillis;
                    }
                    j.f1532r.scrollBy(i16, iD2);
                    F0 f10 = j.f1519c;
                    if (f10 != null) {
                        j.p(f10);
                    }
                    j.f1532r.removeCallbacks(j.f1533s);
                    RecyclerView recyclerView3 = j.f1532r;
                    WeakHashMap weakHashMap = I1.S.f3689a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.f1786s).F0();
                return;
            case 3:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f1786s;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.f12006I0;
                if (motionEvent != null) {
                    iD2 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (iD2 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i17 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    AndroidComposeView androidComposeView2 = (AndroidComposeView) this.f1786s;
                    androidComposeView2.O(motionEvent, i17, androidComposeView2.f12008J0, false);
                    return;
                }
                return;
            case 4:
                N1.e eVar = (N1.e) this.f1786s;
                C1261p0 c1261p0 = eVar.f5985t;
                N1.a aVar3 = eVar.f5983r;
                if (eVar.f5980F) {
                    if (eVar.f5978D) {
                        eVar.f5978D = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar3.f5968e = jCurrentAnimationTimeMillis;
                        aVar3.g = -1L;
                        aVar3.f5969f = jCurrentAnimationTimeMillis;
                        aVar3.f5970h = 0.5f;
                    }
                    if ((aVar3.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.g + ((long) aVar3.f5971i)) || !eVar.e()) {
                        eVar.f5980F = false;
                        return;
                    }
                    if (eVar.f5979E) {
                        eVar.f5979E = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c1261p0.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar3.f5969f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar3.a(jCurrentAnimationTimeMillis2);
                    long j12 = jCurrentAnimationTimeMillis2 - aVar3.f5969f;
                    aVar3.f5969f = jCurrentAnimationTimeMillis2;
                    eVar.f5982H.scrollListBy((int) (j12 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar3.f5967d));
                    WeakHashMap weakHashMap2 = I1.S.f3689a;
                    c1261p0.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                P4.a aVar4 = (P4.a) this.f1786s;
                ValueAnimator valueAnimator2 = aVar4.f6670z;
                int i18 = aVar4.f6645A;
                if (i18 == 1) {
                    valueAnimator2.cancel();
                } else if (i18 != 2) {
                    return;
                }
                aVar4.f6645A = 3;
                valueAnimator2.setFloatValues(((Float) valueAnimator2.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator2.setDuration(500);
                valueAnimator2.start();
                return;
            case 6:
                ((R1.c) this.f1786s).r(0);
                return;
            case 7:
                ((T6.i) this.f1786s).h();
                return;
            case 8:
                S6.a aVar5 = ((T6.i) ((O8.c) this.f1786s).f6511r).g;
                aVar5.e(aVar5.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 9:
                throw null;
            case 10:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1786s).f15332t.f10043x;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 11:
                ViewPager viewPager = (ViewPager) this.f1786s;
                viewPager.setScrollState(0);
                viewPager.j();
                return;
            case 12:
                DialogFragment dialogFragment = (DialogFragment) this.f1786s;
                dialogFragment.f12582r0.onDismiss(dialogFragment.f12590z0);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = (AbstractComponentCallbacksC0947u) this.f1786s;
                if (abstractComponentCallbacksC0947u.f16148a0 != null) {
                    abstractComponentCallbacksC0947u.i().getClass();
                    return;
                }
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                ((p056f2.K) this.f1786s).A(true);
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                p084i.E e10 = (p084i.E) this.f1786s;
                Window.Callback callback = e10.f16507f;
                Menu menuF0 = e10.f0();
                p140o.k kVar = menuF0 instanceof p140o.k ? (p140o.k) menuF0 : null;
                if (kVar != null) {
                    kVar.y();
                }
                try {
                    menuF0.clear();
                    if (!callback.onCreatePanelMenu(0, menuF0) || !callback.onPreparePanel(0, null, menuF0)) {
                        menuF0.clear();
                    }
                    if (kVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (kVar != null) {
                        kVar.x();
                    }
                }
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                ((C0973d0) this.f1786s).f17319a.N();
                return;
            case 17:
                C1021t1 c1021t1 = ((ServiceConnectionC1018s1) this.f1786s).f17547c;
                c1021t1.z(new ComponentName(((C1023u0) c1021t1.f16104r).f17579r, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 18:
                C1021t1 c1021t2 = ((ServiceConnectionC1018s1) ((p039d8.a) this.f1786s).f15706t).f17547c;
                C1014r0 c1014r0 = ((C1023u0) c1021t2.f16104r).f17585x;
                C1023u0.m(c1014r0);
                c1014r0.x(new RunnableC1015r1(c1021t2, iD2));
                return;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                RunnableC1036y1 runnableC1036y1 = (RunnableC1036y1) this.f1786s;
                B1 b5 = (B1) runnableC1036y1.f17698t.f16734t;
                b5.o();
                C1023u0 c1023u0 = (C1023u0) b5.f16104r;
                i7.X x9 = c1023u0.f17584w;
                Context context = c1023u0.f17579r;
                C1023u0.m(x9);
                x9.f17177D.a("Application going to the background");
                C0985h0 c0985h0 = c1023u0.f17583v;
                C1023u0.k(c0985h0);
                c0985h0.f17393J.b(true);
                b5.o();
                b5.f16833u = true;
                C0981g c0981g = c1023u0.f17582u;
                if (!c0981g.C()) {
                    long j13 = runnableC1036y1.f17697s;
                    A1 a9 = b5.f16835w;
                    a9.a(j13, false, false);
                    a9.f16818c.c();
                }
                long j14 = runnableC1036y1.f17696r;
                C1023u0.m(x9);
                x9.f17176C.b(Long.valueOf(j14), "Application backgrounded at: timestamp_millis");
                Y0 y10 = c1023u0.f17566D;
                C1023u0.l(y10);
                y10.o();
                C1023u0 c1023u1 = (C1023u0) y10.f16104r;
                y10.p();
                C1021t1 c1021t1P = c1023u1.p();
                c1021t1P.o();
                c1021t1P.p();
                if (c1021t1P.v()) {
                    V1 v10 = ((C1023u0) c1021t1P.f16104r).f17587z;
                    C1023u0.k(v10);
                    if (v10.W() >= 242600) {
                        C1021t1 c1021t1P2 = c1023u1.p();
                        c1021t1P2.o();
                        c1021t1P2.p();
                        c1021t1P2.C(new RunnableC1007o1(c1021t1P2, c1021t1P2.E(true), i11));
                    }
                } else {
                    C1021t1 c1021t1P3 = c1023u1.p();
                    c1021t1P3.o();
                    c1021t1P3.p();
                    c1021t1P3.C(new RunnableC1007o1(c1021t1P3, c1021t1P3.E(true), i11));
                }
                if (c0981g.y(null, i7.G.f16910O0)) {
                    V1 v11 = c1023u0.f17587z;
                    C1023u0.k(v11);
                    long jV = v11.Q(context.getPackageName(), c0981g.f17359t) ? 1000L : c0981g.v(context.getPackageName(), i7.G.f16890E);
                    C1023u0.m(x9);
                    x9.f17178E.b(Long.valueOf(jV), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    C1023u0.j(c1023u0.f17574L);
                    c1023u0.f17574L.s(jV);
                    return;
                }
                return;
            case 20:
                Q1 q10 = (Q1) this.f1786s;
                q10.c().o();
                q10.f17083B = new C0991j0(q10);
                C0999m c0999m = new C0999m(q10);
                c0999m.q();
                q10.f17106t = c0999m;
                C1003n0 c1003n0 = q10.f17104r;
                C0981g c0981gE0 = q10.e0();
                U6.y.f(c1003n0);
                c0981gE0.f17360u = c1003n0;
                C1027v1 c1027v1 = new C1027v1(q10);
                c1027v1.q();
                q10.f17112z = c1027v1;
                C0969c c0969c = new C0969c(q10);
                c0969c.q();
                q10.f17109w = c0969c;
                C0967b0 c0967b0 = new C0967b0(q10, i12);
                c0967b0.q();
                q10.f17111y = c0967b0;
                G1 g10 = new G1(q10);
                g10.q();
                q10.f17108v = g10;
                q10.f17107u = new C0973d0(q10);
                if (q10.f17090I != q10.f17091J) {
                    q10.b().f17182w.c(Integer.valueOf(q10.f17090I), Integer.valueOf(q10.f17091J), "Not all upload components initialized");
                }
                q10.f17085D.set(true);
                q10.b().f17178E.a("UploadController is now fully initialized");
                q10.c().o();
                C0999m c0999m2 = q10.f17106t;
                Q1.U(c0999m2);
                c0999m2.y();
                C0999m c0999m3 = q10.f17106t;
                Q1.U(c0999m3);
                c0999m3.o();
                c0999m3.p();
                if (c0999m3.V()) {
                    i7.F f11 = i7.G.f16982w0;
                    if (((Long) f11.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseD0 = c0999m3.d0();
                        C1023u0 c1023u2 = (C1023u0) c0999m3.f16104r;
                        c1023u2.f17564B.getClass();
                        int iDelete = sQLiteDatabaseD0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(f11.a(null))});
                        if (iDelete > 0) {
                            i7.X x10 = c1023u2.f17584w;
                            C1023u0.m(x10);
                            x10.f17178E.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (q10.f17112z.f17625y.a() == 0) {
                    C0979f0 c0979f0 = q10.f17112z.f17625y;
                    q10.e().getClass();
                    c0979f0.b(System.currentTimeMillis());
                }
                q10.N();
                return;
            case 21:
                C1023u0 c1023u3 = ((zzw) this.f1786s).f14526a;
                C1023u0.j(c1023u3.f17574L);
                c1023u3.f17574L.s(((Long) i7.G.f16888D.a(null)).longValue());
                return;
            case 22:
                C1023u0 c1023u4 = (C1023u0) this.f1786s;
                V1 v12 = c1023u4.f17587z;
                Y0 y11 = c1023u4.f17566D;
                C1023u0.k(v12);
                v12.o();
                if (v12.L() != 1) {
                    i7.X x11 = c1023u4.f17584w;
                    C1023u0.m(x11);
                    x11.f17185z.a("registerTrigger called but app not eligible");
                    return;
                }
                C1023u0.l(y11);
                y11.o();
                i7.M0 m10 = y11.f17220C;
                if (m10 != null) {
                    m10.c();
                }
                C1023u0.l(y11);
                new Thread(new i7.L0(y11, i10)).start();
                return;
            case 23:
                p102k.e eVar2 = (p102k.e) this.f1786s;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 24:
                synchronized (((p118l7.m) this.f1786s).f19419t) {
                    ((p118l7.c) ((p118l7.m) this.f1786s).f19420u).e();
                    break;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                p143o2.f fVar = (p143o2.f) this.f1786s;
                fVar.f20277f.f12704v.remove(((Messenger) fVar.f20275d.f10875s).getBinder());
                return;
            case 27:
                C1261p0 c1261p1 = (C1261p0) this.f1786s;
                c1261p1.f20754C = null;
                c1261p1.drawableStateChanged();
                return;
            case 28:
                ((Toolbar) this.f1786s).v();
                return;
            default:
                S7.e eVar3 = (S7.e) this.f1786s;
                eVar3.f7525c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar3.f7527e;
                R1.c cVar = bottomSheetBehavior.f14675d0;
                if (cVar != null && cVar.h()) {
                    eVar3.a(eVar3.f7524b);
                    return;
                } else {
                    if (bottomSheetBehavior.f14674c0 == 2) {
                        bottomSheetBehavior.M(eVar3.f7524b);
                        return;
                    }
                    return;
                }
        }
    }

    public RunnableC0147v(T6.g gVar, Da.r rVar) {
        this.f1785r = 9;
        this.f1786s = rVar;
    }

    public RunnableC0147v(C0973d0 c0973d0, boolean z10) {
        this.f1785r = 16;
        this.f1786s = c0973d0;
    }

    public RunnableC0147v(Q1 q10, p013b2.n nVar) {
        this.f1785r = 20;
        this.f1786s = q10;
    }
}
