package androidx.compose.ui.platform;

import A.C0029l;
import A.M0;
import A0.c;
import D0.C0083a;
import D0.C0086d;
import D0.C0087e;
import D0.C0092j;
import D0.C0095m;
import D0.InterfaceC0091i;
import D0.x;
import D0.y;
import E2.RunnableC0147v;
import H0.Y;
import I1.C0249e;
import I1.T;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0280d0;
import J0.C0296t;
import J0.C0298v;
import J0.G;
import J0.I;
import J0.J;
import J0.K;
import J0.M;
import J0.V;
import J0.X;
import J0.Z;
import J0.j0;
import J0.q0;
import J0.r0;
import J0.t0;
import J0.w0;
import J0.x0;
import J0.z0;
import K0.B0;
import K0.C0337c0;
import K0.C0342f;
import K0.C0343f0;
import K0.C0344g;
import K0.C0346h;
import K0.C0347h0;
import K0.C0349i0;
import K0.C0356m;
import K0.C0360o;
import K0.C0361o0;
import K0.C0362p;
import K0.C0363p0;
import K0.C0364q;
import K0.C0367s;
import K0.C0369t;
import K0.C0371u;
import K0.C0375w;
import K0.C0378x0;
import K0.C0380y0;
import K0.E;
import K0.E0;
import K0.InterfaceC0345g0;
import K0.O;
import K0.P;
import K0.RunnableC0354l;
import K0.ViewTreeObserverOnGlobalLayoutListenerC0348i;
import K0.ViewTreeObserverOnScrollChangedListenerC0350j;
import K0.ViewTreeObserverOnTouchModeChangeListenerC0352k;
import K0.W;
import K0.X0;
import K0.Y0;
import K0.c1;
import K0.d1;
import K0.f1;
import K0.g1;
import K9.AbstractC0405x;
import M.k;
import R0.q;
import R0.s;
import S0.a;
import S0.b;
import Z.C;
import Z.C0672b;
import Z.C0681f0;
import Z.S;
import Z0.B;
import Z0.o;
import Z0.z;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.InterfaceC0757f;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.w;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import l0.r;
import p063g1.e;
import p063g1.m;
import p093j0.n;
import p093j0.u;
import p122m0.d;
import p122m0.l;
import p150o9.h;
import p162q0.f;
import p162q0.i;
import p180s0.C1294c;
import p180s0.C1296e;
import p180s0.F;
import p180s0.p;
import p251z9.j;
import p251z9.v;
import u.A;
import u.AbstractC1356k;
import u.C1360o;
import u.t;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements r0, x0, InterfaceC0091i, InterfaceC0757f {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static Class f11987U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static Method f11988V0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0337c0 f11989A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C0378x0 f11990A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final I f11991B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final C0681f0 f11992B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f11993C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f11994C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final a f11995D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final C0681f0 f11996D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final AndroidComposeView f11997E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final C0361o0 f11998E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final q f11999F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final c f12000F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final E f12001G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final I0.c f12002G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p131n0.c f12003H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final W f12004H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0342f f12005I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public MotionEvent f12006I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C1296e f12007J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public long f12008J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final l f12009K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final k f12010K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList f12011L;
    public final A L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f12012M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final RunnableC0147v f12013M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f12014N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final RunnableC0354l f12015N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f12016O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f12017O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C0092j f12018P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final C0371u f12019P0;
    public final y Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final InterfaceC0345g0 f12020Q0;
    public p241y9.c R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f12021R0;
    public final p122m0.a S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final C0249e f12022S0;
    public final d T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final C0369t f12023T0;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C0346h f12024V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C0344g f12025W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final t0 f12026a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f12027b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public AndroidViewsHandler f12028c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public DrawChildContainer f12029d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public p063g1.a f12030e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f12031f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final X f12032g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f12033h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int[] f12034i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final float[] f12035j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final float[] f12036k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final float[] f12037l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f12038m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f12039n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f12040o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f12041p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final C0681f0 f12042q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f12043r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final C f12044r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12045s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public p241y9.c f12046s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final K f12047t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0348i f12048t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0681f0 f12049u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC0350j f12050u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p162q0.k f12051v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC0352k f12052v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h f12053w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Z0.C f12054w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p141o0.a f12055x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final z f12056x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B0 f12057y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final AtomicReference f12058y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p f12059z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final C0363p0 f12060z0;

    /* JADX WARN: Type inference failed for: r1v34, types: [K0.i] */
    /* JADX WARN: Type inference failed for: r1v36, types: [K0.k] */
    public AndroidComposeView(Context context, h hVar) {
        d dVar;
        m mVar;
        super(context);
        this.f12043r = 9205357640488583168L;
        int i10 = 1;
        this.f12045s = true;
        this.f12047t = new K();
        e eVarA = B1.a(context);
        S s10 = S.f10641u;
        this.f12049u = new C0681f0(eVarA, s10);
        R0.d dVar2 = new R0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar2);
        AbstractC0274a0 abstractC0274a0 = new AbstractC0274a0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f12061a.hashCode();
            }

            @Override // J0.AbstractC0274a0
            public final l0.q k() {
                C0343f0 c0343f0 = new C0343f0();
                c0343f0.f5072F = this.f12061a;
                return c0343f0;
            }

            @Override // J0.AbstractC0274a0
            public final void l(l0.q qVar) {
                ((C0343f0) qVar).f5072F = this.f12061a;
            }
        };
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        this.f12051v = new p162q0.k(new E5.c(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", i12, i11, 3), new C0362p(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", i12, i11, 0), new E5.c(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", i12, i11, 4), new F2.t(i13, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", i12, i11, 2), new F2.t(i13, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", i12, i11, 3), new C0364q(i13, 0, AndroidComposeView.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        this.f12053w = hVar;
        this.f12055x = new p141o0.a();
        this.f12057y = new B0();
        int i14 = 0;
        r rVarA = androidx.compose.ui.input.key.a.a(new C0367s(this, i14));
        r rVarA2 = androidx.compose.ui.input.rotary.a.a();
        this.f12059z = new p();
        this.f11989A = new C0337c0(ViewConfiguration.get(context));
        int i15 = 3;
        I i16 = new I(3);
        i16.b0(Y.f3180b);
        i16.Z(getDensity());
        i16.d0(getViewConfiguration());
        i16.c0(android.support.v4.media.session.p.d(emptySemanticsElement, rVarA2).b(rVarA).b(((p162q0.k) getFocusOwner()).f21207i).b(getDragAndDropManager().f20209c).b(abstractC0274a0));
        this.f11991B = i16;
        t tVar = AbstractC1356k.f22736a;
        this.f11993C = new t();
        getLayoutNodes();
        this.f11995D = new a();
        this.f11997E = this;
        this.f11999F = new q(getRoot(), dVar2, getLayoutNodes());
        E e10 = new E(this);
        this.f12001G = e10;
        final AndroidComposeView androidComposeView = this;
        androidComposeView.f12003H = new p131n0.c(androidComposeView, new F2.t(0, androidComposeView, P.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 1));
        C0342f c0342f = new C0342f();
        Object systemService = context.getSystemService("accessibility");
        j.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        androidComposeView.f12005I = c0342f;
        androidComposeView.f12007J = new C1296e(androidComposeView);
        androidComposeView.f12009K = new l();
        androidComposeView.f12011L = new ArrayList();
        androidComposeView.f12018P = new C0092j();
        I root = androidComposeView.getRoot();
        y yVar = new y();
        yVar.f1158s = root;
        yVar.f1159t = new C0087e((C0298v) root.f3914W.f4064c);
        yVar.f1160u = new O8.c(4);
        yVar.f1161v = new C0296t();
        androidComposeView.Q = yVar;
        androidComposeView.R = C0360o.f5135s;
        androidComposeView.S = h() ? new p122m0.a(androidComposeView, androidComposeView.getAutofillTree()) : null;
        if (h()) {
            AutofillManager autofillManagerE = J1.c.e(context.getSystemService(J1.c.g()));
            if (autofillManagerE == null) {
                throw android.support.v4.media.session.p.s("Autofill service could not be located.");
            }
            androidComposeView = this;
            dVar = new d(new N0.a(autofillManagerE), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            dVar = null;
        }
        androidComposeView.T = dVar;
        androidComposeView.f12024V = new C0346h(context);
        androidComposeView.f12025W = new C0344g(androidComposeView.getClipboardManager());
        androidComposeView.f12026a0 = new t0(new C0367s(androidComposeView, i10));
        androidComposeView.f12032g0 = new X(androidComposeView.getRoot());
        long j = Integer.MAX_VALUE;
        androidComposeView.f12033h0 = (j & 4294967295L) | (j << 32);
        androidComposeView.f12034i0 = new int[]{0, 0};
        float[] fArrA = p180s0.A.a();
        androidComposeView.f12035j0 = fArrA;
        androidComposeView.f12036k0 = p180s0.A.a();
        androidComposeView.f12037l0 = p180s0.A.a();
        androidComposeView.f12038m0 = -1L;
        androidComposeView.f12040o0 = 9187343241974906880L;
        androidComposeView.f12041p0 = true;
        androidComposeView.f12042q0 = C0672b.r(null);
        androidComposeView.f12044r0 = C0672b.o(new C0371u(androidComposeView, i10));
        androidComposeView.f12048t0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: K0.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class cls = AndroidComposeView.f11987U0;
                this.f5078r.Q();
            }
        };
        androidComposeView.f12050u0 = new ViewTreeObserverOnScrollChangedListenerC0350j(0, androidComposeView);
        androidComposeView.f12052v0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: K0.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                this.f5088r.f12000F0.f459a.setValue(new A0.a(z10 ? 1 : 2));
            }
        };
        Z0.C c10 = new Z0.C(androidComposeView.getView(), androidComposeView);
        androidComposeView.f12054w0 = c10;
        androidComposeView.f12056x0 = new z(c10);
        androidComposeView.f12058y0 = new AtomicReference(null);
        androidComposeView.f12060z0 = new C0363p0(androidComposeView.getTextInputService());
        androidComposeView.f11990A0 = new C0378x0();
        androidComposeView.f11992B0 = new C0681f0(AbstractC0813f2.s(context), s10);
        Configuration configuration = context.getResources().getConfiguration();
        int i17 = Build.VERSION.SDK_INT;
        androidComposeView.f11994C0 = i17 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        m mVar2 = m.f16261r;
        if (layoutDirection != 0) {
            mVar = layoutDirection != 1 ? null : m.f16262s;
        } else {
            mVar = mVar2;
        }
        androidComposeView.f11996D0 = C0672b.r(mVar != null ? mVar : mVar2);
        androidComposeView.f11998E0 = new C0361o0(1, androidComposeView);
        androidComposeView.f12000F0 = new c(androidComposeView.isInTouchMode() ? 1 : 2);
        androidComposeView.f12002G0 = new I0.c(androidComposeView);
        androidComposeView.f12004H0 = new W(androidComposeView);
        androidComposeView.f12010K0 = new k(28);
        androidComposeView.L0 = new A();
        androidComposeView.f12013M0 = new RunnableC0147v(i15, androidComposeView);
        androidComposeView.f12015N0 = new RunnableC0354l(i14, androidComposeView);
        androidComposeView.f12019P0 = new C0371u(androidComposeView, i14);
        androidComposeView.f12020Q0 = i17 < 29 ? new C0347h0(fArrA) : new C0349i0();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.f12003H);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        if (i17 >= 26) {
            O.f4966a.a(androidComposeView, 1, false);
        }
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        I1.S.o(androidComposeView, e10);
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().b(androidComposeView);
        if (i17 >= 29) {
            K0.K.f4952a.a(androidComposeView);
        }
        androidComposeView.f12022S0 = i17 >= 31 ? new C0249e() : null;
        androidComposeView.f12023T0 = new C0369t(androidComposeView);
    }

    public static final void a(AndroidComposeView androidComposeView, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        E e10 = androidComposeView.f12001G;
        if (j.a(str, e10.f4893G)) {
            int iD2 = e10.f4891E.d(i10);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!j.a(str, e10.f4894H) || (iD = e10.f4892F.d(i10)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static final boolean g(AndroidComposeView androidComposeView, p162q0.d dVar, p171r0.e eVar) {
        Integer numD;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((dVar == null || (numD = f.D(dVar.f21191a)) == null) ? 130 : numD.intValue(), eVar != null ? F.s(eVar) : null);
    }

    @p110k9.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @p110k9.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0356m get_viewTreeOwners() {
        return (C0356m) this.f12042q0.getValue();
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).C();
            } else if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt);
            }
        }
    }

    public static long k(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View l(int i10, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (j.a(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewL = l(i10, viewGroup.getChildAt(i11));
                    if (viewL != null) {
                        return viewL;
                    }
                }
            }
        }
        return null;
    }

    public static void p(I i10) {
        i10.D();
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            p((I) objArr[i12]);
        }
    }

    public static boolean r(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !E0.f4923a.a(motionEvent, i10));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private void setDensity(p063g1.c cVar) {
        this.f12049u.setValue(cVar);
    }

    private void setFontFamilyResolver(Y0.d dVar) {
        this.f11992B0.setValue(dVar);
    }

    private void setLayoutDirection(m mVar) {
        this.f11996D0.setValue(mVar);
    }

    private final void set_viewTreeOwners(C0356m c0356m) {
        this.f12042q0.setValue(c0356m);
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void A(InterfaceC0771u interfaceC0771u) {
    }

    public final void B(q0 q0Var, boolean z10) {
        ArrayList arrayList = this.f12011L;
        if (!z10) {
            if (this.f12014N) {
                return;
            }
            arrayList.remove(q0Var);
            ArrayList arrayList2 = this.f12012M;
            if (arrayList2 != null) {
                arrayList2.remove(q0Var);
                return;
            }
            return;
        }
        if (!this.f12014N) {
            arrayList.add(q0Var);
            return;
        }
        ArrayList arrayList3 = this.f12012M;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f12012M = arrayList3;
        }
        arrayList3.add(q0Var);
    }

    public final void C() {
        d dVar;
        if (this.U) {
            u uVar = getSnapshotObserver().f4170a;
            synchronized (uVar.g) {
                try {
                    p011b0.e eVar = uVar.f18691f;
                    int i10 = eVar.f13127t;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        p093j0.t tVar = (p093j0.t) eVar.f13125r[i12];
                        tVar.e();
                        if (!(tVar.f18681f.f22673e != 0)) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = eVar.f13125r;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    Arrays.fill(eVar.f13125r, i13, i10, (Object) null);
                    eVar.f13127t = i13;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.U = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f12028c0;
        if (androidViewsHandler != null) {
            j(androidViewsHandler);
        }
        if (h() && (dVar = this.T) != null) {
            u.u uVar2 = dVar.f19468h;
            if (uVar2.f22763d == 0 && dVar.f19469i) {
                dVar.f19462a.a();
                dVar.f19469i = false;
            }
            if (uVar2.f22763d != 0) {
                dVar.f19469i = true;
            }
        }
        while (this.L0.h() && this.L0.e(0) != null) {
            int i14 = this.L0.f22651b;
            for (int i15 = 0; i15 < i14; i15++) {
                p241y9.a aVar = (p241y9.a) this.L0.e(i15);
                A a9 = this.L0;
                if (i15 < 0 || i15 >= a9.f22651b) {
                    a9.m(i15);
                    throw null;
                }
                Object[] objArr2 = a9.f22650a;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.L0.k(0, i14);
        }
    }

    public final p171r0.e D() {
        if (isFocused()) {
            p162q0.t tVarG = f.g(((p162q0.k) getFocusOwner()).f21205f);
            if (tVarG != null) {
                return f.j(tVarG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return f.d(viewFindFocus, this);
        }
        return null;
    }

    public final void E(I i10) {
        E e10 = this.f12001G;
        e10.f4887A = true;
        if (e10.u()) {
            e10.v(i10);
        }
        p131n0.c cVar = this.f12003H;
        cVar.f19808x = true;
        if (cVar.f()) {
            cVar.f19809y.k(p110k9.y.f19095a);
        }
    }

    public final void F(I i10, boolean z10, boolean z11, boolean z12) {
        I iU;
        I iU2;
        V v10;
        J j;
        X x9 = this.f12032g0;
        if (!z10) {
            if (x9.p(i10, z11) && z12) {
                L(i10);
                return;
            }
            return;
        }
        k kVar = x9.f4012b;
        I i11 = i10.f3932y;
        M m10 = i10.f3915X;
        if (i11 == null) {
            G0.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = m10.f3948d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new A6.a();
                }
                if (!m10.f3949e || z11) {
                    m10.f3949e = true;
                    m10.f3958p.f4033M = true;
                    if (i10.f3924g0) {
                        return;
                    }
                    if ((j.a(i10.J(), Boolean.TRUE) || (m10.f3949e && (i10.s() == G.f3889r || !((v10 = m10.f3959q) == null || (j = v10.f3997J) == null || !j.e())))) && ((iU = i10.u()) == null || !iU.f3915X.f3949e)) {
                        kVar.f(i10, true);
                    } else if ((i10.I() || X.h(i10)) && ((iU2 = i10.u()) == null || !iU2.r())) {
                        kVar.f(i10, false);
                    }
                    if (x9.f4014d || !z12) {
                        return;
                    }
                    L(i10);
                    return;
                }
                return;
            }
        }
        x9.f4017h.b(new J0.W(i10, true, z11));
    }

    public final void G(I i10, boolean z10, boolean z11) {
        M m10 = i10.f3915X;
        X x9 = this.f12032g0;
        if (!z10) {
            x9.getClass();
            int iOrdinal = m10.f3948d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new A6.a();
            }
            I iU = i10.u();
            boolean z12 = iU == null || iU.I();
            if (!z11) {
                if (i10.r()) {
                    return;
                }
                if (i10.q() && i10.I() == z12 && i10.I() == m10.f3958p.f4032L) {
                    return;
                }
            }
            Z z13 = m10.f3958p;
            z13.f4034N = true;
            z13.f4035O = true;
            if (!i10.f3924g0 && z13.f4032L && z12) {
                if ((iU == null || !iU.q()) && (iU == null || !iU.r())) {
                    x9.f4012b.f(i10, false);
                }
                if (x9.f4014d) {
                    return;
                }
                L(null);
                return;
            }
            return;
        }
        k kVar = x9.f4012b;
        int iOrdinal2 = m10.f3948d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new A6.a();
                }
            }
        }
        if ((m10.f3949e || m10.f3950f) && !z11) {
            return;
        }
        m10.f3950f = true;
        m10.g = true;
        Z z14 = m10.f3958p;
        z14.f4034N = true;
        z14.f4035O = true;
        if (i10.f3924g0) {
            return;
        }
        I iU2 = i10.u();
        if (j.a(i10.J(), Boolean.TRUE) && ((iU2 == null || !iU2.f3915X.f3949e) && (iU2 == null || !iU2.f3915X.f3950f))) {
            kVar.f(i10, true);
        } else if (i10.I() && ((iU2 == null || !iU2.q()) && (iU2 == null || !iU2.r()))) {
            kVar.f(i10, false);
        }
        if (x9.f4014d) {
            return;
        }
        L(null);
    }

    public final void H() {
        E e10 = this.f12001G;
        e10.f4887A = true;
        if (e10.u() && !e10.f4898L) {
            e10.f4898L = true;
            e10.f4908l.post(e10.f4899M);
        }
        p131n0.c cVar = this.f12003H;
        cVar.f19808x = true;
        if (!cVar.f() || cVar.f19800E) {
            return;
        }
        cVar.f19800E = true;
        cVar.f19810z.post(cVar.f19801F);
    }

    public final void I() {
        if (this.f12039n0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f12038m0) {
            this.f12038m0 = jCurrentAnimationTimeMillis;
            InterfaceC0345g0 interfaceC0345g0 = this.f12020Q0;
            float[] fArr = this.f12036k0;
            interfaceC0345g0.a(this, fArr);
            P.j(fArr, this.f12037l0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f12034i0;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f7 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f12040o0 = (((long) Float.floatToRawIntBits(f3 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f7 - iArr[1])) & 4294967295L);
        }
    }

    public final void J(MotionEvent motionEvent) {
        this.f12038m0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0345g0 interfaceC0345g0 = this.f12020Q0;
        float[] fArr = this.f12036k0;
        interfaceC0345g0.a(this, fArr);
        P.j(fArr, this.f12037l0);
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jB = p180s0.A.b((((long) Float.floatToRawIntBits(x9)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.f12040o0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final void K(q0 q0Var) {
        k kVar;
        p011b0.e eVar;
        Reference referencePoll;
        if (this.f12029d0 != null) {
            d1 d1Var = ViewLayer.f12073G;
        }
        do {
            kVar = this.f12010K0;
            ReferenceQueue referenceQueue = (ReferenceQueue) kVar.f5619t;
            eVar = (p011b0.e) kVar.f5618s;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar.k(referencePoll);
            }
        } while (referencePoll != null);
        eVar.b(new WeakReference(q0Var, (ReferenceQueue) kVar.f5619t));
        this.f12011L.remove(q0Var);
    }

    public final void L(I i10) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (i10 != null) {
            while (i10 != null && i10.f3915X.f3958p.f4023C == G.f3889r) {
                if (!this.f12031f0) {
                    I iU = i10.u();
                    if (iU == null) {
                        break;
                    }
                    long j = ((C0298v) iU.f3914W.f4064c).f3171u;
                    if (p063g1.a.f(j) && p063g1.a.e(j)) {
                        break;
                    }
                }
                i10 = i10.u();
            }
            if (i10 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long M(long j) {
        I();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f12040o0 >> 32));
        return p180s0.A.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f12040o0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f12037l0);
    }

    public final int N(MotionEvent motionEvent) {
        Object obj;
        if (this.f12021R0) {
            this.f12021R0 = false;
            int metaState = motionEvent.getMetaState();
            this.f12057y.getClass();
            g1.f5074a.setValue(new D0.E(metaState));
        }
        C0092j c0092j = this.f12018P;
        k kVarA = c0092j.a(motionEvent, this);
        y yVar = this.Q;
        if (kVarA == null) {
            if (!yVar.f1157r) {
                ((C1360o) ((O8.c) yVar.f1160u).f6511r).b();
                ((C0087e) yVar.f1159t).f();
            }
            return 0;
        }
        List list = (List) kVarA.f5618s;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i10 = size - 1;
            obj = list.get(size);
            if (((x) obj).f1152e) {
                break;
            }
            if (i10 < 0) {
                obj = null;
                break;
            }
            size = i10;
        }
        x xVar = (x) obj;
        if (xVar != null) {
            this.f12043r = xVar.f1151d;
        }
        int iF = yVar.f(kVarA, this, t(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iF & 1) != 0) {
            return iF;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c0092j.f1107c.delete(pointerId);
        c0092j.f1106b.delete(pointerId);
        return iF;
    }

    public final void O(MotionEvent motionEvent, int i10, long j, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f3 = pointerCoords.x;
            long jX = x((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jX >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jX & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        k kVarA = this.f12018P.a(motionEventObtain, this);
        j.b(kVarA);
        this.Q.f(kVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void P(p241y9.e eVar, q9.c cVar) {
        C0375w c0375w;
        if (cVar instanceof C0375w) {
            c0375w = (C0375w) cVar;
            int i10 = c0375w.f5200t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0375w.f5200t = i10 - Integer.MIN_VALUE;
            } else {
                c0375w = new C0375w(this, cVar);
            }
        } else {
            c0375w = new C0375w(this, cVar);
        }
        Object obj = c0375w.f5198r;
        int i11 = c0375w.f5200t;
        if (i11 == 0) {
            p110k9.a.e(obj);
            C0367s c0367s = new C0367s(this, 2);
            c0375w.f5200t = 1;
            if (AbstractC0405x.j(new C0029l(c0367s, this.f12058y0, eVar, (p150o9.c) null), c0375w) == p161p9.a.f21156r) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        throw new A6.a();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    public final void Q() {
        boolean z10;
        boolean z11;
        int[] iArr = this.f12034i0;
        getLocationOnScreen(iArr);
        long j = this.f12033h0;
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        int i12 = iArr[0];
        if (i10 == i12 && i11 == iArr[1] && this.f12038m0 >= 0) {
            z10 = false;
        } else {
            this.f12033h0 = (4294967295L & ((long) iArr[1])) | (((long) i12) << 32);
            if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                z10 = false;
            } else {
                getRoot().f3915X.f3958p.k0();
                z10 = true;
            }
        }
        I();
        a rectManager = getRectManager();
        long j10 = this.f12033h0;
        long jL = g.L(this.f12040o0);
        rectManager.getClass();
        float[] fArr = this.f12036k0;
        int iE = B1.e(fArr);
        b bVar = rectManager.f7457b;
        if ((iE & 2) != 0) {
            fArr = null;
        }
        if (p063g1.j.a(jL, bVar.f7466c)) {
            z11 = false;
        } else {
            bVar.f7466c = jL;
            z11 = true;
        }
        if (!p063g1.j.a(j10, bVar.f7467d)) {
            bVar.f7467d = j10;
            z11 = true;
        }
        if (fArr != null) {
            z11 = true;
        }
        rectManager.f7460e = z11 || rectManager.f7460e;
        this.f12032g0.a(z10);
        getRectManager().a();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (h()) {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a(sparseArray);
            }
            p122m0.a aVar = this.S;
            if (aVar != null) {
                Z6.a.h(aVar, sparseArray);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final void b(InterfaceC0771u interfaceC0771u) {
        setShowLayoutBounds(C0378x0.a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f12001G.m(false, i10, this.f12043r);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f12001G.m(true, i10, this.f12043r);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            p(getRoot());
        }
        y(true);
        n.k().m();
        this.f12014N = true;
        p pVar = this.f12059z;
        C1294c c1294c = pVar.f21838a;
        Canvas canvas2 = c1294c.f21818a;
        c1294c.f21818a = canvas;
        getRoot().j(c1294c, null);
        pVar.f21838a.f21818a = canvas2;
        ArrayList arrayList = this.f12011L;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((q0) arrayList.get(i10)).h();
            }
        }
        if (ViewLayer.f12077K) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f12014N = false;
        ArrayList arrayList2 = this.f12012M;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        F0.a aVar;
        int size;
        C0280d0 c0280d0;
        l0.q qVarF;
        C0280d0 c0280d1;
        if (this.f12017O0) {
            RunnableC0354l runnableC0354l = this.f12015N0;
            removeCallbacks(runnableC0354l);
            if (motionEvent.getActionMasked() == 8) {
                this.f12017O0 = false;
            } else {
                runnableC0354l.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (r(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (o(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = T.f3695a;
            Z6.a.e(viewConfiguration);
        } else {
            T.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i10 >= 26) {
            Z6.a.d(viewConfiguration);
        } else {
            T.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        p162q0.j focusOwner = getFocusOwner();
        C0086d c0086d = new C0086d(12, this, motionEvent);
        p162q0.k kVar = (p162q0.k) focusOwner;
        if (kVar.g.f21198f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        p162q0.t tVarG = f.g(kVar.f21205f);
        if (tVarG != null) {
            if (!tVarG.f19339r.f19338E) {
                G0.a.b("visitAncestors called on an unattached node");
            }
            l0.q qVar = tVarG.f19339r;
            I iX = AbstractC0283f.x(tVarG);
            loop0: while (true) {
                if (iX == null) {
                    qVarF = null;
                    break;
                }
                if ((((l0.q) iX.f3914W.f4067f).f19342u & 16384) != 0) {
                    while (qVar != null) {
                        if ((qVar.f19341t & 16384) != 0) {
                            p011b0.e eVar = null;
                            qVarF = qVar;
                            while (qVarF != null) {
                                if (qVarF instanceof F0.a) {
                                    break loop0;
                                }
                                if ((qVarF.f19341t & 16384) != 0 && (qVarF instanceof AbstractC0291n)) {
                                    int i11 = 0;
                                    for (l0.q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                        if ((qVar2.f19341t & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                qVarF = qVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new p011b0.e(new l0.q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                qVarF = AbstractC0283f.f(eVar);
                            }
                        }
                        qVar = qVar.f19343v;
                    }
                }
                iX = iX.u();
                qVar = (iX == null || (c0280d1 = iX.f3914W) == null) ? null : (z0) c0280d1.f4066e;
            }
            aVar = (F0.a) qVarF;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            F0.a aVar2 = aVar;
            if (!aVar2.f19339r.f19338E) {
                G0.a.b("visitAncestors called on an unattached node");
            }
            l0.q qVar3 = aVar2.f19339r.f19343v;
            I iX2 = AbstractC0283f.x(aVar);
            ArrayList arrayList = null;
            while (iX2 != null) {
                if ((((l0.q) iX2.f3914W.f4067f).f19342u & 16384) != 0) {
                    while (qVar3 != null) {
                        if ((qVar3.f19341t & 16384) != 0) {
                            l0.q qVarF2 = qVar3;
                            p011b0.e eVar2 = null;
                            while (qVarF2 != null) {
                                if (qVarF2 instanceof F0.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(qVarF2);
                                } else if ((qVarF2.f19341t & 16384) != 0 && (qVarF2 instanceof AbstractC0291n)) {
                                    int i12 = 0;
                                    for (l0.q qVar4 = ((AbstractC0291n) qVarF2).f4151G; qVar4 != null; qVar4 = qVar4.f19344w) {
                                        if ((qVar4.f19341t & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                qVarF2 = qVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new p011b0.e(new l0.q[16]);
                                                }
                                                if (qVarF2 != null) {
                                                    eVar2.b(qVarF2);
                                                    qVarF2 = null;
                                                }
                                                eVar2.b(qVar4);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                qVarF2 = AbstractC0283f.f(eVar2);
                            }
                        }
                        qVar3 = qVar3.f19343v;
                    }
                }
                iX2 = iX2.u();
                qVar3 = (iX2 == null || (c0280d0 = iX2.f3914W) == null) ? null : (z0) c0280d0.f4066e;
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i13 = size - 1;
                    ((F0.a) arrayList.get(size)).getClass();
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
            }
            l0.q qVarF3 = aVar2.f19339r;
            p011b0.e eVar3 = null;
            while (qVarF3 != null) {
                if (qVarF3 instanceof F0.a) {
                } else if ((qVarF3.f19341t & 16384) != 0 && (qVarF3 instanceof AbstractC0291n)) {
                    int i14 = 0;
                    for (l0.q qVar5 = ((AbstractC0291n) qVarF3).f4151G; qVar5 != null; qVar5 = qVar5.f19344w) {
                        if ((qVar5.f19341t & 16384) != 0) {
                            i14++;
                            if (i14 == 1) {
                                qVarF3 = qVar5;
                            } else {
                                if (eVar3 == null) {
                                    eVar3 = new p011b0.e(new l0.q[16]);
                                }
                                if (qVarF3 != null) {
                                    eVar3.b(qVarF3);
                                    qVarF3 = null;
                                }
                                eVar3.b(qVar5);
                            }
                        }
                    }
                    if (i14 == 1) {
                    }
                }
                qVarF3 = AbstractC0283f.f(eVar3);
            }
            if (!((Boolean) c0086d.invoke()).booleanValue()) {
                l0.q qVarF4 = aVar2.f19339r;
                p011b0.e eVar4 = null;
                while (qVarF4 != null) {
                    if (qVarF4 instanceof F0.a) {
                    } else if ((qVarF4.f19341t & 16384) != 0 && (qVarF4 instanceof AbstractC0291n)) {
                        int i15 = 0;
                        for (l0.q qVar6 = ((AbstractC0291n) qVarF4).f4151G; qVar6 != null; qVar6 = qVar6.f19344w) {
                            if ((qVar6.f19341t & 16384) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    qVarF4 = qVar6;
                                } else {
                                    if (eVar4 == null) {
                                        eVar4 = new p011b0.e(new l0.q[16]);
                                    }
                                    if (qVarF4 != null) {
                                        eVar4.b(qVarF4);
                                        qVarF4 = null;
                                    }
                                    eVar4.b(qVar6);
                                }
                            }
                        }
                        if (i15 == 1) {
                        }
                    }
                    qVarF4 = AbstractC0283f.f(eVar4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        C0360o c0360o = ((F0.a) arrayList.get(i16)).f2148F;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10 = this.f12017O0;
        RunnableC0354l runnableC0354l = this.f12015N0;
        if (z10) {
            removeCallbacks(runnableC0354l);
            runnableC0354l.run();
        }
        if (!r(motionEvent) && isAttachedToWindow()) {
            E e10 = this.f12001G;
            AndroidComposeView androidComposeView = e10.f4902d;
            AccessibilityManager accessibilityManager = e10.g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x9 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    androidComposeView.y(true);
                    C0296t c0296t = new C0296t();
                    I root = androidComposeView.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x9)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
                    C0280d0 c0280d0 = root.f3914W;
                    j0 j0Var = (j0) c0280d0.f4065d;
                    p180s0.G g = j0.f4120Y;
                    ((j0) c0280d0.f4065d).J0(j0.f4124c0, j0Var.A0(jFloatToRawIntBits), c0296t, 1, true);
                    int iE = AbstractC0813f2.E(c0296t);
                    while (true) {
                        if (-1 < iE) {
                            Object objE = c0296t.f4167r.e(iE);
                            j.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                            I iX = AbstractC0283f.x((l0.q) objE);
                            if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(iX) == null) {
                                if (iX.f3914W.g(8)) {
                                    int iZ = e10.z(iX.f3926s);
                                    R0.p pVarB = F9.n.b(iX, false);
                                    if (P.l(pVarB)) {
                                        if (!pVarB.i().f7108r.c(s.f7178y)) {
                                            i10 = iZ;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                iE--;
                            }
                        }
                        i10 = Integer.MIN_VALUE;
                        break;
                    }
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i11 = e10.f4903e;
                    if (i11 != i10) {
                        e10.f4903e = i10;
                        E.D(e10, i10, 128, null, 12);
                        E.D(e10, i11, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i12 = e10.f4903e;
                    if (i12 == Integer.MIN_VALUE) {
                        androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i12 != Integer.MIN_VALUE) {
                        e10.f4903e = Integer.MIN_VALUE;
                        E.D(e10, Integer.MIN_VALUE, 128, null, 12);
                        E.D(e10, i12, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && t(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f12006I0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f12006I0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f12017O0 = true;
                        postDelayed(runnableC0354l, 8L);
                        return false;
                    }
                } else if ((o(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (u(motionEvent)) {
                if ((o(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((p162q0.k) getFocusOwner()).c(keyEvent, new C0086d(11, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f12057y.getClass();
        g1.f5074a.setValue(new D0.E(metaState));
        return ((p162q0.k) getFocusOwner()).c(keyEvent, i.f21199r) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0280d0 c0280d0;
        if (isFocused()) {
            p162q0.k kVar = (p162q0.k) getFocusOwner();
            if (kVar.g.f21198f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                p162q0.t tVarG = f.g(kVar.f21205f);
                if (tVarG != null) {
                    if (!tVarG.f19339r.f19338E) {
                        G0.a.b("visitAncestors called on an unattached node");
                    }
                    l0.q qVar = tVarG.f19339r;
                    I iX = AbstractC0283f.x(tVarG);
                    while (iX != null) {
                        if ((((l0.q) iX.f3914W.f4067f).f19342u & 131072) != 0) {
                            while (qVar != null) {
                                if ((qVar.f19341t & 131072) != 0) {
                                    l0.q qVarF = qVar;
                                    p011b0.e eVar = null;
                                    while (qVarF != null) {
                                        if ((qVarF.f19341t & 131072) != 0 && (qVarF instanceof AbstractC0291n)) {
                                            int i10 = 0;
                                            for (l0.q qVar2 = ((AbstractC0291n) qVarF).f4151G; qVar2 != null; qVar2 = qVar2.f19344w) {
                                                if ((qVar2.f19341t & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        qVarF = qVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new p011b0.e(new l0.q[16]);
                                                        }
                                                        if (qVarF != null) {
                                                            eVar.b(qVarF);
                                                            qVarF = null;
                                                        }
                                                        eVar.b(qVar2);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        qVarF = AbstractC0283f.f(eVar);
                                    }
                                }
                                qVar = qVar.f19343v;
                            }
                        }
                        iX = iX.u();
                        qVar = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            K0.J.f4949a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12017O0) {
            RunnableC0354l runnableC0354l = this.f12015N0;
            removeCallbacks(runnableC0354l);
            MotionEvent motionEvent2 = this.f12006I0;
            j.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f12017O0 = false;
            } else {
                runnableC0354l.run();
            }
        }
        if (!r(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || u(motionEvent))) {
            int iO = o(motionEvent);
            if ((iO & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iO & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void e(InterfaceC0771u interfaceC0771u) {
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return l(i10, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        p171r0.e eVarD;
        if (view == null || this.f12032g0.f4013c) {
            return super.focusSearch(view, i10);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (view == this) {
            p162q0.t tVarG = f.g(((p162q0.k) getFocusOwner()).f21205f);
            eVarD = tVarG != null ? f.j(tVarG) : null;
            if (eVarD == null) {
                eVarD = f.d(view, this);
            }
        } else {
            eVarD = f.d(view, this);
        }
        p162q0.d dVarE = f.E(i10);
        int i11 = dVarE != null ? dVarE.f21191a : 6;
        v vVar = new v();
        if (((p162q0.k) getFocusOwner()).d(i11, eVarD, new C0.h(vVar, 3)) != null) {
            Object obj = vVar.f24886r;
            if (obj != null) {
                if (viewFindNextFocus != null) {
                    if (i11 == 1 || i11 == 2) {
                        return super.focusSearch(view, i10);
                    }
                    j.b(obj);
                    if (f.p(f.j((p162q0.t) obj), f.d(viewFindNextFocus, this), eVarD, i11)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return view;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f12028c0 == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.f12028c0 = androidViewsHandler;
            addView(androidViewsHandler, -1);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.f12028c0;
        j.b(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // J0.r0
    public p122m0.g getAutofill() {
        return this.S;
    }

    @Override // J0.r0
    public p122m0.k getAutofillManager() {
        return this.T;
    }

    @Override // J0.r0
    public l getAutofillTree() {
        return this.f12009K;
    }

    public final p241y9.c getConfigurationChangeObserver() {
        return this.R;
    }

    public final p131n0.c getContentCaptureManager$ui_release() {
        return this.f12003H;
    }

    @Override // J0.r0
    public h getCoroutineContext() {
        return this.f12053w;
    }

    @Override // J0.r0
    public p063g1.c getDensity() {
        return (p063g1.c) this.f12049u.getValue();
    }

    @Override // J0.r0
    public p162q0.j getFocusOwner() {
        return this.f12051v;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        p171r0.e eVarD = D();
        if (eVarD != null) {
            rect.left = Math.round(eVarD.f21389a);
            rect.top = Math.round(eVarD.f21390b);
            rect.right = Math.round(eVarD.f21391c);
            rect.bottom = Math.round(eVarD.f21392d);
            return;
        }
        if (j.a(((p162q0.k) getFocusOwner()).d(6, null, C0360o.f5136t), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // J0.r0
    public Y0.d getFontFamilyResolver() {
        return (Y0.d) this.f11992B0.getValue();
    }

    @Override // J0.r0
    public Y0.c getFontLoader() {
        return this.f11990A0;
    }

    @Override // J0.r0
    public p180s0.v getGraphicsContext() {
        return this.f12007J;
    }

    @Override // J0.r0
    public p243z0.a getHapticFeedBack() {
        return this.f11998E0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f12032g0.f4012b.y();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // J0.r0
    public A0.b getInputModeManager() {
        return this.f12000F0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f12038m0;
    }

    @Override // android.view.View, android.view.ViewParent, J0.r0
    public m getLayoutDirection() {
        return (m) this.f11996D0.getValue();
    }

    public long getMeasureIteration() {
        X x9 = this.f12032g0;
        if (!x9.f4013c) {
            G0.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return x9.g;
    }

    @Override // J0.r0
    public I0.c getModifierLocalManager() {
        return this.f12002G0;
    }

    @Override // J0.r0
    public H0.T getPlacementScope() {
        int i10 = H0.W.f3177b;
        return new H0.F(1, this);
    }

    @Override // J0.r0
    public D0.t getPointerIconService() {
        return this.f12023T0;
    }

    @Override // J0.r0
    public a getRectManager() {
        return this.f11995D;
    }

    @Override // J0.r0
    public I getRoot() {
        return this.f11991B;
    }

    public x0 getRootForTest() {
        return this.f11997E;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C0249e c0249e;
        if (Build.VERSION.SDK_INT < 31 || (c0249e = this.f12022S0) == null) {
            return false;
        }
        return ((Boolean) ((C0681f0) c0249e.f3724b).getValue()).booleanValue();
    }

    @Override // J0.r0
    public q getSemanticsOwner() {
        return this.f11999F;
    }

    @Override // J0.r0
    public K getSharedDrawScope() {
        return this.f12047t;
    }

    @Override // J0.r0
    public boolean getShowLayoutBounds() {
        return this.f12027b0;
    }

    @Override // J0.r0
    public t0 getSnapshotObserver() {
        return this.f12026a0;
    }

    @Override // J0.r0
    public X0 getSoftwareKeyboardController() {
        return this.f12060z0;
    }

    @Override // J0.r0
    public z getTextInputService() {
        return this.f12056x0;
    }

    @Override // J0.r0
    public Y0 getTextToolbar() {
        return this.f12004H0;
    }

    public View getView() {
        return this;
    }

    @Override // J0.r0
    public c1 getViewConfiguration() {
        return this.f11989A;
    }

    public final C0356m getViewTreeOwners() {
        return (C0356m) this.f12044r0.getValue();
    }

    @Override // J0.r0
    public f1 getWindowInfo() {
        return this.f12057y;
    }

    public final d get_autofillManager$ui_release() {
        return this.T;
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void i(InterfaceC0771u interfaceC0771u) {
    }

    public final void m(I i10, boolean z10) {
        this.f12032g0.f(i10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int o(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        removeCallbacks(this.f12013M0);
        try {
            J(motionEvent);
            this.f12039n0 = true;
            y(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f12006I0;
                boolean z10 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                y yVar = this.Q;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!yVar.f1157r) {
                                ((C1360o) ((O8.c) yVar.f1160u).f6511r).b();
                                ((C0087e) yVar.f1159t).f();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z10) {
                            motionEvent2 = motionEvent3;
                        } else {
                            O(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked2 == 3 || actionMasked2 == 9 || !t(motionEvent)) {
                    androidComposeView = this;
                } else {
                    androidComposeView = this;
                    androidComposeView.O(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = androidComposeView.f12006I0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = androidComposeView.f12006I0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C0092j c0092j = androidComposeView.f12018P;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c0092j.f1107c.delete(pointerId);
                            c0092j.f1106b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = androidComposeView.f12006I0;
                        float x9 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = androidComposeView.f12006I0;
                        boolean z12 = (x9 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = androidComposeView.f12006I0;
                        boolean z13 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                c0092j.f1107c.delete(pointerId);
                                c0092j.f1106b.delete(pointerId);
                            }
                            C0087e c0087e = (C0087e) yVar.f1159t;
                            if (c0087e.f1095c) {
                                c0087e.f1095c = true;
                            } else {
                                ((C0095m) c0087e.g).f1117a.g();
                            }
                        }
                    }
                }
                androidComposeView.f12006I0 = MotionEvent.obtainNoHistory(motionEvent);
                int iN = N(motionEvent);
                Trace.endSection();
                androidComposeView.f12039n0 = false;
                return iN;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f12039n0 = false;
            throw th3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        w wVarH;
        InterfaceC0771u interfaceC0771u;
        p122m0.a aVar;
        super.onAttachedToWindow();
        boolean zHasWindowFocus = hasWindowFocus();
        B0 b5 = this.f12057y;
        b5.f4872a.setValue(Boolean.valueOf(zHasWindowFocus));
        b5.getClass();
        q(getRoot());
        p(getRoot());
        getSnapshotObserver().f4170a.e();
        if (h() && (aVar = this.S) != null) {
            p122m0.j.f19471a.a(aVar);
        }
        InterfaceC0771u interfaceC0771uD = androidx.lifecycle.K.d(this);
        M2.e eVarH = p000a.a.H(this);
        C0356m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC0771uD != null && eVarH != null && (interfaceC0771uD != (interfaceC0771u = viewTreeOwners.f5097a) || eVarH != interfaceC0771u))) {
            if (interfaceC0771uD == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (eVarH == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (wVarH = viewTreeOwners.f5097a.h()) != null) {
                wVarH.f(this);
            }
            interfaceC0771uD.h().a(this);
            C0356m c0356m = new C0356m(interfaceC0771uD, eVarH);
            set_viewTreeOwners(c0356m);
            p241y9.c cVar = this.f12046s0;
            if (cVar != null) {
                cVar.e(c0356m);
            }
            this.f12046s0 = null;
        }
        this.f12000F0.f459a.setValue(new A0.a(isInTouchMode() ? 1 : 2));
        C0356m viewTreeOwners2 = getViewTreeOwners();
        w wVarH2 = viewTreeOwners2 != null ? viewTreeOwners2.f5097a.h() : null;
        if (wVarH2 == null) {
            throw android.support.v4.media.session.p.s("No lifecycle owner exists");
        }
        wVarH2.a(this);
        wVarH2.a(this.f12003H);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f12048t0);
        getViewTreeObserver().addOnScrollChangedListener(this.f12050u0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f12052v0);
        if (Build.VERSION.SDK_INT >= 31) {
            K0.M.f4957a.b(this);
        }
        d dVar = this.T;
        if (dVar != null) {
            ((p162q0.k) getFocusOwner()).f21208k.a(dVar);
            getSemanticsOwner().f7125d.a(dVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        l0.t tVar = (l0.t) this.f12058y0.get();
        K0.V v10 = (K0.V) (tVar != null ? tVar.f19349b : null);
        if (v10 == null) {
            return this.f12054w0.f10879d;
        }
        l0.t tVar2 = (l0.t) v10.f5025u.get();
        C0380y0 c0380y0 = (C0380y0) (tVar2 != null ? tVar2.f19349b : null);
        return c0380y0 != null && (c0380y0.f5209e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(B1.a(getContext()));
        this.f12057y.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f11994C0) {
            this.f11994C0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(AbstractC0813f2.s(getContext()));
        }
        this.R.e(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection oVar;
        int i10;
        l0.t tVar = (l0.t) this.f12058y0.get();
        K0.V v10 = (K0.V) (tVar != null ? tVar.f19349b : null);
        if (v10 == null) {
            Z0.C c10 = this.f12054w0;
            if (c10.f10879d) {
                Z0.k kVar = c10.f10882h;
                Z0.y yVar = c10.g;
                int i11 = kVar.f10933e;
                boolean z10 = kVar.f10929a;
                if (i11 == 1) {
                    i10 = z10 ? 6 : 0;
                } else if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 2) {
                    i10 = 2;
                } else if (i11 == 6) {
                    i10 = 5;
                } else if (i11 == 5) {
                    i10 = 7;
                } else if (i11 == 3) {
                    i10 = 3;
                } else if (i11 == 4) {
                    i10 = 4;
                } else {
                    if (i11 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i10;
                int i12 = kVar.f10932d;
                if (i12 == 1) {
                    editorInfo.inputType = 1;
                } else if (i12 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i10;
                } else if (i12 == 3) {
                    editorInfo.inputType = 2;
                } else if (i12 == 4) {
                    editorInfo.inputType = 3;
                } else if (i12 == 5) {
                    editorInfo.inputType = 17;
                } else if (i12 == 6) {
                    editorInfo.inputType = 33;
                } else if (i12 == 7) {
                    editorInfo.inputType = 129;
                } else if (i12 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i12 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z10) {
                    int i13 = editorInfo.inputType;
                    if ((i13 & 1) == 1) {
                        editorInfo.inputType = i13 | 131072;
                        if (i11 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i14 = editorInfo.inputType;
                if ((i14 & 1) == 1) {
                    int i15 = kVar.f10930b;
                    if (i15 == 1) {
                        editorInfo.inputType = i14 | 4096;
                    } else if (i15 == 2) {
                        editorInfo.inputType = i14 | 8192;
                    } else if (i15 == 3) {
                        editorInfo.inputType = i14 | 16384;
                    }
                    if (kVar.f10931c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = yVar.f10954b;
                int i16 = U0.K.f8034c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                K1.c.c(editorInfo, yVar.f10953a.f8060s);
                editorInfo.imeOptions |= 33554432;
                if (p013b2.j.d()) {
                    p013b2.j.a().i(editorInfo);
                }
                Z0.u uVar = new Z0.u(c10.g, new B(0, c10), c10.f10882h.f10931c);
                c10.f10883i.add(new WeakReference(uVar));
                return uVar;
            }
        } else {
            l0.t tVar2 = (l0.t) v10.f5025u.get();
            C0380y0 c0380y0 = (C0380y0) (tVar2 != null ? tVar2.f19349b : null);
            if (c0380y0 != null) {
                synchronized (c0380y0.f5207c) {
                    if (c0380y0.f5209e) {
                        return null;
                    }
                    M.q qVarA = c0380y0.f5205a.a(editorInfo);
                    M0 m10 = new M0(18, c0380y0);
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 34) {
                        oVar = new Z0.q(qVarA, m10);
                    } else if (i17 >= 25) {
                        oVar = new Z0.p(qVarA, m10);
                    } else {
                        oVar = i17 >= 24 ? new o(qVarA, m10) : new Z0.n(qVarA, m10);
                    }
                    c0380y0.f5208d.b(new J0.E0(oVar));
                    return oVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        p131n0.c cVar = this.f12003H;
        cVar.getClass();
        N7.f.f(cVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p122m0.a aVar;
        super.onDetachedFromWindow();
        u uVar = getSnapshotObserver().f4170a;
        C6.b bVar = uVar.f18692h;
        if (bVar != null) {
            bVar.h();
        }
        uVar.b();
        this.f12057y.getClass();
        C0356m viewTreeOwners = getViewTreeOwners();
        w wVarH = viewTreeOwners != null ? viewTreeOwners.f5097a.h() : null;
        if (wVarH == null) {
            throw android.support.v4.media.session.p.s("No lifecycle owner exists");
        }
        wVarH.f(this.f12003H);
        wVarH.f(this);
        if (h() && (aVar = this.S) != null) {
            p122m0.j.f19471a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f12048t0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f12050u0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f12052v0);
        if (Build.VERSION.SDK_INT >= 31) {
            K0.M.f4957a.a(this);
        }
        d dVar = this.T;
        if (dVar != null) {
            getSemanticsOwner().f7125d.i(dVar);
            ((p162q0.k) getFocusOwner()).f21208k.i(dVar);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        f.e(((p162q0.k) getFocusOwner()).f21205f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f12038m0 = 0L;
        this.f12032g0.j(this.f12019P0);
        this.f12030e0 = null;
        Q();
        if (this.f12028c0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        X x9 = this.f12032g0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                q(getRoot());
            }
            long jK = k(i10);
            long jK2 = k(i11);
            long jZ = AbstractC0813f2.z((int) (jK >>> 32), (int) (jK & 4294967295L), (int) (jK2 >>> 32), (int) (4294967295L & jK2));
            p063g1.a aVar = this.f12030e0;
            if (aVar == null) {
                this.f12030e0 = new p063g1.a(jZ);
                this.f12031f0 = false;
            } else if (!p063g1.a.b(aVar.f16246a, jZ)) {
                this.f12031f0 = true;
            }
            x9.q(jZ);
            x9.l();
            setMeasuredDimension(getRoot().f3915X.f3958p.f3168r, getRoot().f3915X.f3958p.f3169s);
            if (this.f12028c0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f3915X.f3958p.f3168r, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f3915X.f3958p.f3169s, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        if (!h() || viewStructure == null) {
            return;
        }
        d dVar = this.T;
        if (dVar != null) {
            I i11 = dVar.f19463b.f7122a;
            AutofillId autofillId = dVar.g;
            String str = dVar.f19466e;
            a aVar = dVar.f19465d;
            F9.n.N(viewStructure, i11, autofillId, str, aVar);
            Object[] objArr = u.K.f22696a;
            A a9 = new A(2);
            a9.a(i11);
            a9.a(viewStructure);
            while (a9.h()) {
                Object objJ = a9.j(a9.f22651b - 1);
                j.c(objJ, "null cannot be cast to non-null type android.view.ViewStructure");
                ViewStructure viewStructure2 = (ViewStructure) objJ;
                Object objJ2 = a9.j(a9.f22651b - 1);
                j.c(objJ2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                p011b0.b bVar = (p011b0.b) ((I) objJ2).o();
                int i12 = bVar.f13119r.f13127t;
                for (int i13 = 0; i13 < i12; i13++) {
                    I i14 = (I) bVar.get(i13);
                    if (!i14.f3924g0 && i14.H() && i14.I()) {
                        R0.j jVarW = i14.w();
                        if (jVarW != null) {
                            u.E e10 = jVarW.f7108r;
                            if (e10.b(R0.i.g) || e10.b(s.f7169p) || e10.b(s.f7170q)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                F9.n.N(viewStructureNewChild, i14, dVar.g, str, aVar);
                                a9.a(i14);
                                a9.a(viewStructureNewChild);
                            } else {
                                a9.a(i14);
                                a9.a(viewStructure2);
                            }
                        } else {
                            a9.a(i14);
                            a9.a(viewStructure2);
                        }
                    }
                }
            }
        }
        p122m0.a aVar2 = this.S;
        if (aVar2 != null) {
            l lVar = aVar2.f19455b;
            LinkedHashMap linkedHashMap = lVar.f19472a;
            LinkedHashMap linkedHashMap2 = lVar.f19472a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                p122m0.h.c(viewStructureNewChild2, aVar2.f19457d, iIntValue);
                viewStructureNewChild2.setId(iIntValue, aVar2.f19454a.getContext().getPackageName(), null, null);
                p122m0.h.d(viewStructureNewChild2, 1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        D0.s sVar;
        int toolType = motionEvent.getToolType(i10);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (sVar = ((C0369t) getPointerIconService()).f5165a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Context context = getContext();
        return sVar instanceof C0083a ? PointerIcon.getSystemIcon(context, ((C0083a) sVar).f1085b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        m mVar;
        if (this.f12045s) {
            m mVar2 = m.f16261r;
            if (i10 != 0) {
                mVar = i10 != 1 ? null : m.f16262s;
            } else {
                mVar = mVar2;
            }
            if (mVar != null) {
                mVar2 = mVar;
            }
            setLayoutDirection(mVar2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0249e c0249e;
        if (Build.VERSION.SDK_INT < 31 || (c0249e = this.f12022S0) == null) {
            return;
        }
        c0249e.c(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        p131n0.c cVar = this.f12003H;
        cVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (j.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            N7.f.c(cVar, longSparseArray);
        } else {
            cVar.f19802r.post(new F2.x(10, cVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zA;
        this.f12057y.f4872a.setValue(Boolean.valueOf(z10));
        this.f12021R0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zA = C0378x0.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        p(getRoot());
    }

    public final void q(I i10) {
        this.f12032g0.p(i10, false);
        p011b0.e eVarZ = i10.z();
        Object[] objArr = eVarZ.f13125r;
        int i11 = eVarZ.f13127t;
        for (int i12 = 0; i12 < i11; i12++) {
            q((I) objArr[i12]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int iOrdinal = ((p162q0.k) getFocusOwner()).f21205f.x0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i10, rect);
        }
        if (iOrdinal != 3) {
            throw new A6.a();
        }
        p162q0.d dVarE = f.E(i10);
        int i11 = dVarE != null ? dVarE.f21191a : 7;
        return j.a(((p162q0.k) getFocusOwner()).d(i11, rect != null ? new p171r0.e(rect.left, rect.top, rect.right, rect.bottom) : null, new F.v(i11, 1)), Boolean.TRUE);
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void s(InterfaceC0771u interfaceC0771u) {
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f12001G.f4905h = j;
    }

    public final void setConfigurationChangeObserver(p241y9.c cVar) {
        this.R = cVar;
    }

    public final void setContentCaptureManager$ui_release(p131n0.c cVar) {
        this.f12003H = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(h hVar) {
        this.f12053w = hVar;
        l0.q qVar = (l0.q) getRoot().f3914W.f4067f;
        if (qVar instanceof D0.O) {
            ((D0.O) qVar).x0();
        }
        if (!qVar.f19339r.f19338E) {
            G0.a.b("visitSubtreeIf called on an unattached node");
        }
        p011b0.e eVar = new p011b0.e(new l0.q[16]);
        l0.q qVar2 = qVar.f19339r;
        l0.q qVar3 = qVar2.f19344w;
        if (qVar3 == null) {
            AbstractC0283f.b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i10 = eVar.f13127t;
            if (i10 == 0) {
                return;
            }
            l0.q qVar4 = (l0.q) eVar.l(i10 - 1);
            if ((qVar4.f19342u & 16) != 0) {
                for (l0.q qVar5 = qVar4; qVar5 != null; qVar5 = qVar5.f19344w) {
                    if ((qVar5.f19341t & 16) != 0) {
                        ?? F10 = qVar5;
                        ?? eVar2 = 0;
                        while (F10 != 0) {
                            if (F10 instanceof w0) {
                                w0 w0Var = (w0) F10;
                                if (w0Var instanceof D0.O) {
                                    ((D0.O) w0Var).x0();
                                }
                            } else if ((F10.f19341t & 16) != 0 && (F10 instanceof AbstractC0291n)) {
                                l0.q qVar6 = ((AbstractC0291n) F10).f4151G;
                                int i11 = 0;
                                F10 = F10;
                                eVar2 = eVar2;
                                while (qVar6 != null) {
                                    if ((qVar6.f19341t & 16) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            eVar2 = eVar2;
                                            F10 = qVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new p011b0.e(new l0.q[16]);
                                            }
                                            if (F10 != 0) {
                                                eVar2.b(F10);
                                                F10 = 0;
                                            }
                                            eVar2.b(qVar6);
                                        }
                                    }
                                    qVar6 = qVar6.f19344w;
                                    F10 = F10;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F10 = AbstractC0283f.f(eVar2);
                        }
                    }
                }
            }
            AbstractC0283f.b(eVar, qVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f12038m0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(p241y9.c cVar) {
        C0356m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.e(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f12046s0 = cVar;
    }

    @Override // J0.r0
    public void setShowLayoutBounds(boolean z10) {
        this.f12027b0 = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x9 && x9 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f12006I0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void v(float[] fArr) {
        I();
        p180s0.A.e(fArr, this.f12036k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f12040o0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f12040o0 & 4294967295L));
        float[] fArr2 = this.f12035j0;
        p180s0.A.d(fArr2);
        p180s0.A.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        P.p(fArr, fArr2);
    }

    @Override // androidx.lifecycle.InterfaceC0757f
    public final /* synthetic */ void w(InterfaceC0771u interfaceC0771u) {
    }

    public final long x(long j) {
        I();
        long jB = p180s0.A.b(j, this.f12036k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f12040o0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f12040o0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void y(boolean z10) {
        C0371u c0371u;
        X x9 = this.f12032g0;
        if (x9.f4012b.y() || ((p011b0.e) x9.f4015e.f5618s).f13127t != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    c0371u = this.f12019P0;
                } finally {
                    Trace.endSection();
                }
            } else {
                c0371u = null;
            }
            if (x9.j(c0371u)) {
                requestLayout();
            }
            x9.a(false);
            if (this.f12016O) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f12016O = false;
            }
        }
    }

    public final void z(I i10, long j) {
        X x9 = this.f12032g0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            x9.k(i10, j);
            if (!x9.f4012b.y()) {
                x9.a(false);
                if (this.f12016O) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f12016O = false;
                }
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        j.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // J0.r0
    public C0342f getAccessibilityManager() {
        return this.f12005I;
    }

    @Override // J0.r0
    public C0344g getClipboard() {
        return this.f12025W;
    }

    @Override // J0.r0
    public C0346h getClipboardManager() {
        return this.f12024V;
    }

    @Override // J0.r0
    public p141o0.a getDragAndDropManager() {
        return this.f12055x;
    }

    public t getLayoutNodes() {
        return this.f11993C;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
