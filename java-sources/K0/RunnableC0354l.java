package K0;

import U0.C0515g;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.EnumC0766o;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p020c.ViewTreeObserverOnDrawListenerC0783h;
import p056f2.AbstractComponentCallbacksC0947u;
import u.AbstractC1355j;

/* JADX INFO: renamed from: K0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0354l implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5091s;

    public /* synthetic */ RunnableC0354l(int i10, Object obj) {
        this.f5090r = i10;
        this.f5091s = obj;
    }

    private final void a() {
        Ca.r rVar = (Ca.r) this.f5091s;
        Map mapA = null;
        ((AtomicReference) rVar.f850d).set(null);
        synchronized (rVar) {
            try {
                if (((AtomicMarkableReference) rVar.f849c).isMarked()) {
                    mapA = ((p178r8.e) ((AtomicMarkableReference) rVar.f849c).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) rVar.f849c;
                    atomicMarkableReference.set((p178r8.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapA != null) {
            p213v8.b bVar = (p213v8.b) rVar.f851e;
            ((p178r8.h) bVar.f23379b).h((String) bVar.f23378a, mapA, rVar.f848b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0228 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x022a A[LOOP:4: B:89:0x01ce->B:110:0x022a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:428:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, k9.g] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        int i10;
        View viewE;
        int width;
        long j;
        long j10;
        long j11;
        u.t tVar;
        AndroidComposeView androidComposeView;
        u.t tVar2;
        u.t tVar3;
        AbstractC1355j abstractC1355j;
        int[] iArr;
        long[] jArr;
        AbstractC1355j abstractC1355j2;
        u.t tVar4;
        AndroidComposeView androidComposeView2;
        int[] iArr2;
        long[] jArr2;
        long j12;
        int i11;
        long[] jArr3;
        int i12;
        long[] jArr4;
        long j13;
        char c10;
        int i13;
        char c11;
        Object obj;
        int i14 = 8;
        char c12 = 2;
        int i15 = 0;
        switch (this.f5090r) {
            case 0:
                AndroidComposeView androidComposeView3 = (AndroidComposeView) this.f5091s;
                androidComposeView3.f12017O0 = false;
                MotionEvent motionEvent = androidComposeView3.f12006I0;
                p251z9.j.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView3.N(motionEvent);
                return;
            case 1:
                E e10 = (E) this.f5091s;
                Trace.beginSection("measureAndLayout");
                try {
                    e10.f4902d.y(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        e10.n();
                        Trace.endSection();
                        e10.f4898L = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                Aa.a aVar = (Aa.a) this.f5091s;
                ((L6.i) ((M6.c) aVar.f557u)).w(new C6.b(7, aVar));
                return;
            case 3:
                ((android.support.v4.media.session.r) this.f5091s).O(true);
                return;
            case 4:
                L1.b bVar = ((L1.d) this.f5091s).f5439a;
                ViewParent parent = bVar.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(bVar);
                    return;
                }
                return;
            case 5:
                S7.e eVar = (S7.e) this.f5091s;
                eVar.f7525c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f7527e;
                R1.c cVar = sideSheetBehavior.f15179z;
                if (cVar != null && cVar.h()) {
                    eVar.a(eVar.f7524b);
                    return;
                } else {
                    if (sideSheetBehavior.f15178y == 2) {
                        sideSheetBehavior.x(eVar.f7524b);
                        return;
                    }
                    return;
                }
            case 6:
                RippleHostView.setRippleState$lambda$2((RippleHostView) this.f5091s);
                return;
            case 7:
                ((X7.d) this.f5091s).s(true);
                return;
            case 8:
                X7.j jVar = (X7.j) this.f5091s;
                boolean zIsPopupShowing = jVar.f10012h.isPopupShowing();
                jVar.s(zIsPopupShowing);
                jVar.f10016m = zIsPopupShowing;
                return;
            case 9:
                ((TextInputLayout) this.f5091s).f15334u.requestLayout();
                return;
            case 10:
                Z0.C c13 = (Z0.C) this.f5091s;
                android.support.v4.media.session.r rVar = c13.f10877b;
                Boolean boolValueOf = null;
                c13.f10887n = null;
                p011b0.e eVar2 = c13.f10886m;
                View view = c13.f10876a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    eVar2.g();
                    return;
                }
                Object[] objArr = eVar2.f13125r;
                int i16 = eVar2.f13127t;
                Boolean bool = null;
                for (int i17 = 0; i17 < i16; i17++) {
                    Z0.A a9 = (Z0.A) objArr[i17];
                    int iOrdinal = a9.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            boolValueOf = Boolean.FALSE;
                        } else if (iOrdinal == 2 || iOrdinal == 3) {
                            if (!p251z9.j.a(bool, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(a9 == Z0.A.f10871t);
                            }
                        }
                    } else {
                        boolValueOf = Boolean.TRUE;
                    }
                    bool = boolValueOf;
                }
                eVar2.g();
                if (p251z9.j.a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) rVar.f11365t.getValue()).restartInput((View) rVar.f11364s);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((p248z6.c) ((O8.c) rVar.f11366u).f6511r).L();
                    } else {
                        ((p248z6.c) ((O8.c) rVar.f11366u).f6511r).I();
                    }
                }
                if (p251z9.j.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) rVar.f11365t.getValue()).restartInput((View) rVar.f11364s);
                    return;
                }
                return;
            case 11:
                ((DrawerLayout) this.f5091s).d(false);
                return;
            case 12:
                androidx.drawerlayout.widget.a aVar2 = (androidx.drawerlayout.widget.a) this.f5091s;
                DrawerLayout drawerLayout = aVar2.f12574e;
                int i18 = aVar2.f12572c.f7213o;
                int i19 = aVar2.f12571b;
                boolean z10 = i19 == 3;
                if (z10) {
                    viewE = drawerLayout.e(3);
                    width = (viewE != null ? -viewE.getWidth() : 0) + i18;
                    i10 = 5;
                } else {
                    i10 = 5;
                    viewE = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i18;
                }
                if (viewE != null) {
                    if (((!z10 || viewE.getLeft() >= width) && (z10 || viewE.getLeft() <= width)) || drawerLayout.g(viewE) != 0) {
                        return;
                    }
                    Z1.c cVar2 = (Z1.c) viewE.getLayoutParams();
                    aVar2.f12572c.u(viewE, width, viewE.getTop());
                    cVar2.f10960c = true;
                    drawerLayout.invalidate();
                    View viewE2 = drawerLayout.e(i19 == 3 ? i10 : 3);
                    if (viewE2 != null) {
                        drawerLayout.c(viewE2, true);
                    }
                    if (drawerLayout.f12547K) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i20 = 0; i20 < childCount; i20++) {
                        drawerLayout.getChildAt(i20).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f12547K = true;
                    return;
                }
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                androidx.lifecycle.D d5 = (androidx.lifecycle.D) this.f5091s;
                androidx.lifecycle.w wVar = d5.f12613w;
                if (d5.f12609s == 0) {
                    d5.f12610t = true;
                    wVar.d(EnumC0766o.ON_PAUSE);
                }
                if (d5.f12608r == 0 && d5.f12610t) {
                    wVar.d(EnumC0766o.ON_STOP);
                    d5.f12611u = true;
                    return;
                }
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p013b2.s sVar = (p013b2.s) this.f5091s;
                synchronized (sVar.f13185d) {
                    try {
                        if (sVar.f13188h == null) {
                            return;
                        }
                        try {
                            F1.l lVarD = sVar.d();
                            int i21 = lVarD.f2180e;
                            if (i21 == 2) {
                                synchronized (sVar.f13185d) {
                                }
                            }
                            if (i21 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i21 + ")");
                            }
                            try {
                                Method method = E1.i.f1432b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                R7.f fVar = sVar.f13184c;
                                Context context = sVar.f13182a;
                                fVar.getClass();
                                F1.l[] lVarArr = {lVarD};
                                B9.a aVar3 = A1.f.f469a;
                                Y2.a.n("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceM = A1.f.f469a.m(context, lVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferK = F9.n.K(sVar.f13182a, lVarD.f2176a);
                                    if (mappedByteBufferK == null || typefaceM == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        Aa.a aVar4 = new Aa.a(typefaceM, Y2.a.e0(mappedByteBufferK));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (sVar.f13185d) {
                                            try {
                                                B9.a aVar5 = sVar.f13188h;
                                                if (aVar5 != null) {
                                                    aVar5.O(aVar4);
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                            break;
                                        }
                                        sVar.b();
                                        return;
                                    } catch (Throwable th4) {
                                        Method method2 = E1.i.f1432b;
                                        Trace.endSection();
                                        throw th4;
                                    }
                                } catch (Throwable th5) {
                                    Trace.endSection();
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                Method method3 = E1.i.f1432b;
                                Trace.endSection();
                                throw th6;
                            }
                            break;
                        } catch (Throwable th7) {
                            synchronized (sVar.f13185d) {
                                try {
                                    B9.a aVar6 = sVar.f13188h;
                                    if (aVar6 != null) {
                                        aVar6.N(th7);
                                    }
                                    sVar.b();
                                    return;
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        throw th9;
                    }
                }
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                ViewTreeObserverOnDrawListenerC0783h viewTreeObserverOnDrawListenerC0783h = (ViewTreeObserverOnDrawListenerC0783h) this.f5091s;
                Runnable runnable = viewTreeObserverOnDrawListenerC0783h.f13379s;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0783h.f13379s = null;
                    return;
                }
                return;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                p020c.k.c((p020c.k) this.f5091s);
                return;
            case 17:
                ((com.google.android.material.timepicker.e) this.f5091s).o();
                return;
            case 18:
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = (AbstractComponentCallbacksC0947u) this.f5091s;
                abstractComponentCallbacksC0947u.f16155h0.f16034w.I(abstractComponentCallbacksC0947u.f16164u);
                abstractComponentCallbacksC0947u.f16164u = null;
                return;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                Iterator it = ((p056f2.K) this.f5091s).f15973n.iterator();
                if (it.hasNext()) {
                    throw p245z2.a.z(it);
                }
                return;
            case 20:
                p131n0.c cVar3 = (p131n0.c) this.f5091s;
                boolean zF = cVar3.f();
                u.t tVar5 = cVar3.f19798C;
                AndroidComposeView androidComposeView4 = cVar3.f19802r;
                if (zF) {
                    androidComposeView4.y(true);
                    int[] iArr3 = tVar5.f22732b;
                    long[] jArr5 = tVar5.f22731a;
                    int length = jArr5.length - 2;
                    if (length >= 0) {
                        int i22 = 0;
                        j = 128;
                        j10 = 255;
                        while (true) {
                            long j14 = jArr5[i22];
                            j11 = -9187201950435737472L;
                            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i23 = 8 - ((~(i22 - length)) >>> 31);
                                int i24 = i15;
                                while (i24 < i23) {
                                    if ((j14 & 255) < 128) {
                                        int i25 = iArr3[(i22 << 3) + i24];
                                        c11 = c12;
                                        if (!cVar3.d().a(i25)) {
                                            cVar3.f19805u.add(new p131n0.d(i25, cVar3.f19797B, p131n0.e.f19816s, null));
                                            cVar3.f19809y.k(p110k9.y.f19095a);
                                        }
                                        j14 >>= 8;
                                        i24++;
                                        c12 = c11;
                                        i22 = i22;
                                    } else {
                                        c11 = c12;
                                    }
                                    j14 >>= 8;
                                    i24++;
                                    c12 = c11;
                                    i22 = i22;
                                }
                                c10 = c12;
                                int i26 = i22;
                                if (i23 == 8) {
                                    i13 = i26;
                                }
                            } else {
                                c10 = c12;
                                i13 = i22;
                            }
                            if (i13 != length) {
                                i22 = i13 + 1;
                                c12 = c10;
                                i15 = 0;
                            }
                        }
                    } else {
                        j = 128;
                        j10 = 255;
                        j11 = -9187201950435737472L;
                    }
                    cVar3.h(androidComposeView4.getSemanticsOwner().a(), cVar3.f19799D);
                    AbstractC1355j abstractC1355jD = cVar3.d();
                    int[] iArr4 = abstractC1355jD.f22732b;
                    long[] jArr6 = abstractC1355jD.f22731a;
                    int length2 = jArr6.length - 2;
                    if (length2 >= 0) {
                        int i27 = 0;
                        while (true) {
                            long j15 = jArr6[i27];
                            if ((((~j15) << 7) & j15 & j11) != j11) {
                                int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                int i29 = 0;
                                while (i29 < i28) {
                                    if ((j15 & j10) < j) {
                                        int i30 = iArr4[(i27 << 3) + i29];
                                        V0 v10 = (V0) tVar5.b(i30);
                                        W0 w9 = (W0) abstractC1355jD.b(i30);
                                        R0.p pVar = w9 != null ? w9.f5032a : null;
                                        if (pVar == null) {
                                            throw android.support.v4.media.session.p.s("no value for specified key");
                                        }
                                        int i31 = i14;
                                        int i32 = pVar.g;
                                        u.E e11 = pVar.f7119d.f7108r;
                                        if (v10 == null) {
                                            Object[] objArr2 = e11.f22670b;
                                            abstractC1355j2 = abstractC1355jD;
                                            long[] jArr7 = e11.f22669a;
                                            androidComposeView2 = androidComposeView4;
                                            int length3 = jArr7.length - 2;
                                            if (length3 >= 0) {
                                                iArr2 = iArr4;
                                                jArr2 = jArr6;
                                                int i33 = 0;
                                                while (true) {
                                                    long j16 = jArr7[i33];
                                                    j12 = j15;
                                                    if ((((~j16) << 7) & j16 & j11) != j11) {
                                                        int i34 = 8 - ((~(i33 - length3)) >>> 31);
                                                        for (int i35 = 0; i35 < i34; i35++) {
                                                            if ((j16 & j10) < j) {
                                                                j13 = j16;
                                                                R0.v vVar = (R0.v) objArr2[(i33 << 3) + i35];
                                                                R0.v vVar2 = R0.s.f7179z;
                                                                if (p251z9.j.a(vVar, vVar2)) {
                                                                    Object objG = e11.g(vVar2);
                                                                    if (objG == null) {
                                                                        objG = null;
                                                                    }
                                                                    List list = (List) objG;
                                                                    cVar3.j(i32, String.valueOf(list != null ? (C0515g) p120l9.m.g0(list) : null));
                                                                }
                                                            } else {
                                                                j13 = j16;
                                                            }
                                                            j16 = j13 >> i31;
                                                        }
                                                        if (i34 == i31) {
                                                            if (i33 != length3) {
                                                                i33++;
                                                                j15 = j12;
                                                                i31 = 8;
                                                            }
                                                        }
                                                    } else if (i33 != length3) {
                                                        i33++;
                                                        j15 = j12;
                                                        i31 = 8;
                                                    }
                                                }
                                            } else {
                                                iArr2 = iArr4;
                                                jArr2 = jArr6;
                                                j12 = j15;
                                            }
                                        } else {
                                            abstractC1355j2 = abstractC1355jD;
                                            androidComposeView2 = androidComposeView4;
                                            iArr2 = iArr4;
                                            jArr2 = jArr6;
                                            j12 = j15;
                                            Object[] objArr3 = e11.f22670b;
                                            long[] jArr8 = e11.f22669a;
                                            int length4 = jArr8.length - 2;
                                            if (length4 >= 0) {
                                                int i36 = 0;
                                                while (true) {
                                                    long j17 = jArr8[i36];
                                                    Object[] objArr4 = objArr3;
                                                    tVar4 = tVar5;
                                                    if ((((~j17) << 7) & j17 & j11) != j11) {
                                                        int i37 = 8 - ((~(i36 - length4)) >>> 31);
                                                        int i38 = 0;
                                                        while (i38 < i37) {
                                                            if ((j17 & j10) < j) {
                                                                i12 = i38;
                                                                R0.v vVar3 = (R0.v) objArr4[(i36 << 3) + i38];
                                                                jArr4 = jArr8;
                                                                R0.v vVar4 = R0.s.f7179z;
                                                                if (p251z9.j.a(vVar3, vVar4)) {
                                                                    Object objG2 = v10.f5026a.f7108r.g(vVar4);
                                                                    if (objG2 == null) {
                                                                        objG2 = null;
                                                                    }
                                                                    List list2 = (List) objG2;
                                                                    C0515g c0515g = list2 != null ? (C0515g) p120l9.m.g0(list2) : null;
                                                                    Object objG3 = e11.g(vVar4);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    List list3 = (List) objG3;
                                                                    C0515g c0515g2 = list3 != null ? (C0515g) p120l9.m.g0(list3) : null;
                                                                    if (!p251z9.j.a(c0515g, c0515g2)) {
                                                                        cVar3.j(i32, String.valueOf(c0515g2));
                                                                    }
                                                                }
                                                            } else {
                                                                i12 = i38;
                                                                jArr4 = jArr8;
                                                            }
                                                            j17 >>= 8;
                                                            i38 = i12 + 1;
                                                            jArr8 = jArr4;
                                                        }
                                                        jArr3 = jArr8;
                                                        if (i37 == 8) {
                                                        }
                                                    } else {
                                                        jArr3 = jArr8;
                                                    }
                                                    if (i36 != length4) {
                                                        i36++;
                                                        tVar5 = tVar4;
                                                        objArr3 = objArr4;
                                                        jArr8 = jArr3;
                                                    }
                                                }
                                            }
                                            i11 = 8;
                                        }
                                        tVar4 = tVar5;
                                        i11 = 8;
                                    } else {
                                        abstractC1355j2 = abstractC1355jD;
                                        tVar4 = tVar5;
                                        androidComposeView2 = androidComposeView4;
                                        iArr2 = iArr4;
                                        jArr2 = jArr6;
                                        j12 = j15;
                                        i11 = i14;
                                    }
                                    j15 = j12 >> i11;
                                    i29++;
                                    i14 = i11;
                                    abstractC1355jD = abstractC1355j2;
                                    androidComposeView4 = androidComposeView2;
                                    tVar5 = tVar4;
                                    iArr4 = iArr2;
                                    jArr6 = jArr2;
                                }
                                abstractC1355j = abstractC1355jD;
                                tVar = tVar5;
                                androidComposeView = androidComposeView4;
                                iArr = iArr4;
                                jArr = jArr6;
                                if (i28 == i14) {
                                }
                            } else {
                                abstractC1355j = abstractC1355jD;
                                tVar = tVar5;
                                androidComposeView = androidComposeView4;
                                iArr = iArr4;
                                jArr = jArr6;
                            }
                            if (i27 != length2) {
                                i27++;
                                abstractC1355jD = abstractC1355j;
                                androidComposeView4 = androidComposeView;
                                tVar5 = tVar;
                                iArr4 = iArr;
                                jArr6 = jArr;
                                i14 = 8;
                            }
                        }
                    } else {
                        tVar = tVar5;
                        androidComposeView = androidComposeView4;
                    }
                    tVar.c();
                    AbstractC1355j abstractC1355jD2 = cVar3.d();
                    int[] iArr5 = abstractC1355jD2.f22732b;
                    Object[] objArr5 = abstractC1355jD2.f22733c;
                    long[] jArr9 = abstractC1355jD2.f22731a;
                    int length5 = jArr9.length - 2;
                    if (length5 >= 0) {
                        int i39 = 0;
                        while (true) {
                            long j18 = jArr9[i39];
                            if ((((~j18) << 7) & j18 & j11) != j11) {
                                int i40 = 8 - ((~(i39 - length5)) >>> 31);
                                int i41 = 0;
                                while (i41 < i40) {
                                    if ((j18 & j10) < j) {
                                        int i42 = (i39 << 3) + i41;
                                        int i43 = iArr5[i42];
                                        V0 v11 = new V0(((W0) objArr5[i42]).f5032a, cVar3.d());
                                        tVar3 = tVar;
                                        tVar3.h(i43, v11);
                                    } else {
                                        tVar3 = tVar;
                                    }
                                    j18 >>= 8;
                                    i41++;
                                    tVar = tVar3;
                                }
                                tVar2 = tVar;
                                if (i40 == 8) {
                                }
                            } else {
                                tVar2 = tVar;
                            }
                            if (i39 != length5) {
                                i39++;
                                tVar = tVar2;
                            }
                        }
                    }
                    cVar3.f19799D = new V0(androidComposeView.getSemanticsOwner().a(), cVar3.d());
                    cVar3.f19800E = false;
                    return;
                }
                return;
            case 21:
                a();
                return;
            case 22:
                Activity activity = (Activity) this.f5091s;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = p216w1.d.g;
                Method method4 = p216w1.d.f23581f;
                int i44 = Build.VERSION.SDK_INT;
                if (i44 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i44 != 26 && i44 != 27) || method4 != null) && (p216w1.d.f23580e != null || p216w1.d.f23579d != null)) {
                    try {
                        Object obj2 = p216w1.d.f23578c.get(activity);
                        if (obj2 != null && (obj = p216w1.d.f23577b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            p216w1.c cVar4 = new p216w1.c(activity);
                            application.registerActivityLifecycleCallbacks(cVar4);
                            handler.post(new p169q7.b(1, cVar4, obj2));
                            try {
                                if (i44 == 26 || i44 == 27) {
                                    Boolean bool2 = Boolean.FALSE;
                                    method4.invoke(obj, obj2, null, null, 0, bool2, null, null, bool2, bool2);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new p169q7.b(2, application, cVar4));
                                return;
                            } catch (Throwable th10) {
                                handler.post(new p169q7.b(2, application, cVar4));
                                throw th10;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            default:
                ((CarouselLayoutManager) this.f5091s).Y0();
                return;
        }
    }
}
