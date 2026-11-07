package com.google.android.material.bottomsheet;

import Da.r;
import E2.C0150y;
import G1.f;
import H7.H;
import I1.C0241a;
import I1.C0243b;
import I1.I;
import I1.S;
import J7.g;
import P2.d;
import R1.c;
import R7.i;
import R7.o;
import S7.e;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p020c.C0776a;
import p151p.N;
import p193t7.a;
import u1.b;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b implements J7.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ColorStateList f14651A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f14652B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f14653C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14654D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f14655E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f14656F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f14657G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f14658H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f14659I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f14660J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f14661K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f14662L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f14663M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f14664N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f14665O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final o f14666P;
    public boolean Q;
    public final e R;
    public final ValueAnimator S;
    public final int T;
    public int U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f14667V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final float f14668W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f14669X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final float f14670Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f14671Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f14672a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f14673b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f14674c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public c f14675d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f14676e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f14677f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f14678g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final float f14679h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f14680i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f14681j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f14682k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public WeakReference f14683l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public WeakReference f14684m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public WeakReference f14685n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ArrayList f14686o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public VelocityTracker f14687p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public g f14688q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14689r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f14690r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14691s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f14692s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f14693t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f14694t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14695u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public HashMap f14696u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14697v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final SparseIntArray f14698v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14699w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final d f14700w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f14702y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i f14703z;

    public BottomSheetBehavior() {
        this.f14689r = 0;
        this.f14691s = true;
        this.f14652B = -1;
        this.f14653C = -1;
        this.R = new e(this);
        this.f14668W = 0.5f;
        this.f14670Y = -1.0f;
        this.f14673b0 = true;
        this.f14674c0 = 4;
        this.f14679h0 = 0.1f;
        this.f14686o0 = new ArrayList();
        this.f14692s0 = -1;
        this.f14698v0 = new SparseIntArray();
        this.f14700w0 = new d(2, this);
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = S.f3689a;
        if (I.h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewB = B(viewGroup.getChildAt(i10));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public static BottomSheetBehavior C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof u1.e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        b bVar = ((u1.e) layoutParams).f22806a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int D(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final void A(int i10) {
        View view = (View) this.f14683l0.get();
        if (view != null) {
            ArrayList arrayList = this.f14686o0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.f14669X;
            if (i10 <= i11 && i11 != E()) {
                E();
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((a) arrayList.get(i12)).b(view);
            }
        }
    }

    public final int E() {
        if (this.f14691s) {
            return this.U;
        }
        return Math.max(this.T, this.f14659I ? 0 : this.f14664N);
    }

    public final int F(int i10) {
        if (i10 == 3) {
            return E();
        }
        if (i10 == 4) {
            return this.f14669X;
        }
        if (i10 == 5) {
            return this.f14682k0;
        }
        if (i10 == 6) {
            return this.f14667V;
        }
        throw new IllegalArgumentException(p123m2.c.r(i10, "Invalid state to get top offset: "));
    }

    public final boolean G() {
        WeakReference weakReference = this.f14683l0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f14683l0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void H() {
        this.f14690r0 = -1;
        this.f14692s0 = -1;
        VelocityTracker velocityTracker = this.f14687p0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14687p0 = null;
        }
    }

    public final void I(BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.f14684m0) == null) {
            this.f14684m0 = new WeakReference(bottomSheetDragHandleView);
            Q(1, bottomSheetDragHandleView);
        } else {
            z(1, (View) weakReference.get());
            this.f14684m0 = null;
        }
    }

    public final void J(boolean z10) {
        if (this.f14671Z != z10) {
            this.f14671Z = z10;
            if (!z10 && this.f14674c0 == 5) {
                L(4);
            }
            P();
        }
    }

    public final void K(int i10) {
        if (i10 == -1) {
            if (this.f14699w) {
                return;
            } else {
                this.f14699w = true;
            }
        } else {
            if (!this.f14699w && this.f14697v == i10) {
                return;
            }
            this.f14699w = false;
            this.f14697v = Math.max(0, i10);
        }
        T();
    }

    public final void L(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(p.B(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f14671Z && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f14691s && F(i10) <= this.U) ? 3 : i10;
        WeakReference weakReference = this.f14683l0;
        if (weakReference == null || weakReference.get() == null) {
            M(i10);
            return;
        }
        View view = (View) this.f14683l0.get();
        N n6 = new N(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = S.f3689a;
            if (view.isAttachedToWindow()) {
                view.post(n6);
                return;
            }
        }
        n6.run();
    }

    public final void M(int i10) {
        View view;
        if (this.f14674c0 == i10) {
            return;
        }
        this.f14674c0 = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z10 = this.f14671Z;
        }
        WeakReference weakReference = this.f14683l0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            S(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            S(false);
        }
        R(i10, true);
        while (true) {
            ArrayList arrayList = this.f14686o0;
            if (i11 >= arrayList.size()) {
                P();
                return;
            } else {
                ((a) arrayList.get(i11)).c(i10, view);
                i11++;
            }
        }
    }

    public final boolean N(View view, float f3) {
        if (this.f14672a0) {
            return true;
        }
        if (view.getTop() < this.f14669X) {
            return false;
        }
        return Math.abs(((f3 * this.f14679h0) + ((float) view.getTop())) - ((float) this.f14669X)) / ((float) y()) > 0.5f;
    }

    public final void O(View view, int i10, boolean z10) {
        int iF = F(i10);
        c cVar = this.f14675d0;
        if (cVar == null || (!z10 ? cVar.u(view, view.getLeft(), iF) : cVar.s(view.getLeft(), iF))) {
            M(i10);
            return;
        }
        M(2);
        R(i10, true);
        this.R.a(i10);
    }

    public final void P() {
        WeakReference weakReference = this.f14683l0;
        if (weakReference != null) {
            Q(0, (View) weakReference.get());
        }
        WeakReference weakReference2 = this.f14684m0;
        if (weakReference2 != null) {
            Q(1, (View) weakReference2.get());
        }
    }

    public final void Q(int i10, View view) {
        int iA;
        int i11;
        if (view == null) {
            return;
        }
        z(i10, view);
        int i12 = 6;
        if (!this.f14691s && this.f14674c0 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            r rVar = new r(i12, 11, this);
            ArrayList arrayListF = S.f(view);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayListF.size()) {
                    int i14 = 0;
                    int i15 = -1;
                    while (true) {
                        int[] iArr = S.f3692d;
                        if (i14 >= 32 || i15 != -1) {
                            break;
                        }
                        int i16 = iArr[i14];
                        boolean z10 = true;
                        for (int i17 = 0; i17 < arrayListF.size(); i17++) {
                            z10 &= ((J1.d) arrayListF.get(i17)).a() != i16;
                        }
                        if (z10) {
                            i15 = i16;
                        }
                        i14++;
                    }
                    iA = i15;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((J1.d) arrayListF.get(i13)).f4211a).getLabel())) {
                    iA = ((J1.d) arrayListF.get(i13)).a();
                    break;
                }
                i13++;
            }
            if (iA != -1) {
                i11 = iA;
                J1.d dVar = new J1.d(null, i11, string, rVar, null);
                View.AccessibilityDelegate accessibilityDelegateD = S.d(view);
                C0243b c0243b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C0241a ? ((C0241a) accessibilityDelegateD).f3708a : new C0243b(accessibilityDelegateD);
                if (c0243b == null) {
                    c0243b = new C0243b();
                }
                S.o(view, c0243b);
                S.l(dVar.a(), view);
                S.f(view).add(dVar);
                S.i(0, view);
            } else {
                i11 = iA;
            }
            this.f14698v0.put(i10, i11);
        }
        if (this.f14671Z) {
            int i18 = 5;
            if (this.f14674c0 != 5) {
                S.m(view, J1.d.f4203n, null, new r(i18, 11, this));
            }
        }
        int i19 = this.f14674c0;
        int i20 = 4;
        int i21 = 3;
        if (i19 == 3) {
            S.m(view, J1.d.f4202m, null, new r(this.f14691s ? 4 : 6, 11, this));
            return;
        }
        if (i19 == 4) {
            S.m(view, J1.d.f4201l, null, new r(this.f14691s ? 3 : 6, 11, this));
        } else {
            if (i19 != 6) {
                return;
            }
            S.m(view, J1.d.f4202m, null, new r(i20, 11, this));
            S.m(view, J1.d.f4201l, null, new r(i21, 11, this));
        }
    }

    public final void R(int i10, boolean z10) {
        i iVar;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.f14674c0 == 3 && (this.f14665O || G());
        if (this.Q == z11 || (iVar = this.f14703z) == null) {
            return;
        }
        this.Q = z11;
        ValueAnimator valueAnimator = this.S;
        if (!z10 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            iVar.n(this.Q ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(iVar.f7325r.f7301i, z11 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void S(boolean z10) {
        WeakReference weakReference = this.f14683l0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f14696u0 != null) {
                    return;
                } else {
                    this.f14696u0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f14683l0.get() && z10) {
                    this.f14696u0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.f14696u0 = null;
        }
    }

    public final void T() {
        View view;
        if (this.f14683l0 != null) {
            w();
            if (this.f14674c0 != 4 || (view = (View) this.f14683l0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // J7.b
    public final void a() {
        g gVar = this.f14688q0;
        if (gVar == null) {
            return;
        }
        int i10 = gVar.f4369d;
        int i11 = gVar.f4368c;
        C0776a c0776a = gVar.f4371f;
        gVar.f4371f = null;
        if (c0776a != null) {
            float f3 = c0776a.f13367c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.f14671Z) {
                    AnimatorSet animatorSetB = gVar.b();
                    animatorSetB.setDuration(p137n7.a.c(i11, f3, i10));
                    animatorSetB.start();
                    L(4);
                    return;
                }
                F7.e eVar = new F7.e(14, this);
                View view = gVar.f4367b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new p076h2.a(1));
                objectAnimatorOfFloat.setDuration(p137n7.a.c(i11, f3, i10));
                objectAnimatorOfFloat.addListener(new F7.e(3, gVar));
                objectAnimatorOfFloat.addListener(eVar);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        L(this.f14671Z ? 5 : 4);
    }

    @Override // J7.b
    public final void b(C0776a c0776a) {
        g gVar = this.f14688q0;
        if (gVar == null) {
            return;
        }
        if (gVar.f4371f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0776a c0776a2 = gVar.f4371f;
        gVar.f4371f = c0776a;
        if (c0776a2 == null) {
            return;
        }
        gVar.c(c0776a.f13367c);
    }

    @Override // J7.b
    public final void c(C0776a c0776a) {
        g gVar = this.f14688q0;
        if (gVar == null) {
            return;
        }
        gVar.f4371f = c0776a;
    }

    @Override // J7.b
    public final void d() {
        g gVar = this.f14688q0;
        if (gVar == null || gVar.a() == null) {
            return;
        }
        AnimatorSet animatorSetB = gVar.b();
        animatorSetB.setDuration(gVar.f4370e);
        animatorSetB.start();
    }

    @Override // u1.b
    public final void g(u1.e eVar) {
        this.f14683l0 = null;
        this.f14675d0 = null;
        this.f14688q0 = null;
    }

    @Override // u1.b
    public final void j() {
        this.f14683l0 = null;
        this.f14675d0 = null;
        this.f14688q0 = null;
    }

    @Override // u1.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        c cVar;
        if (!view.isShown() || !this.f14673b0) {
            this.f14676e0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H();
        }
        if (this.f14687p0 == null) {
            this.f14687p0 = VelocityTracker.obtain();
        }
        this.f14687p0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.f14692s0 = (int) motionEvent.getY();
            if (this.f14674c0 != 2) {
                WeakReference weakReference = this.f14685n0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.t(view2, x9, this.f14692s0)) {
                    this.f14690r0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f14694t0 = true;
                }
            }
            this.f14676e0 = this.f14690r0 == -1 && !coordinatorLayout.t(view, x9, this.f14692s0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f14694t0 = false;
            this.f14690r0 = -1;
            if (this.f14676e0) {
                this.f14676e0 = false;
                return false;
            }
        }
        if (this.f14676e0 || (cVar = this.f14675d0) == null || !cVar.t(motionEvent)) {
            WeakReference weakReference2 = this.f14685n0;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f14676e0 || this.f14674c0 == 1 || coordinatorLayout.t(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f14675d0 == null || (i10 = this.f14692s0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.f14675d0.f7202b) {
                return false;
            }
        }
        return true;
    }

    @Override // u1.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = S.f3689a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.f14683l0 == null) {
            this.f14701x = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = (Build.VERSION.SDK_INT < 29 || this.f14655E || this.f14699w) ? false : true;
            if (this.f14656F || this.f14657G || this.f14658H || this.f14660J || this.f14661K || this.f14662L || z10) {
                H.f(view, new f((BottomSheetBehavior) this, z10));
            }
            S.r(view, new p193t7.f(view));
            this.f14683l0 = new WeakReference(view);
            this.f14688q0 = new g(view);
            i iVar = this.f14703z;
            if (iVar != null) {
                view.setBackground(iVar);
                float fE = this.f14670Y;
                if (fE == -1.0f) {
                    fE = I.e(view);
                }
                iVar.l(fE);
            } else {
                ColorStateList colorStateList = this.f14651A;
                if (colorStateList != null) {
                    I.i(view, colorStateList);
                }
            }
            P();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f14675d0 == null) {
            this.f14675d0 = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f14700w0);
        }
        int top = view.getTop();
        coordinatorLayout.v(i10, view);
        this.f14681j0 = coordinatorLayout.getWidth();
        this.f14682k0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f14680i0 = height;
        int iMin = this.f14682k0;
        int i12 = iMin - height;
        int i13 = this.f14664N;
        if (i12 < i13) {
            boolean z11 = this.f14659I;
            int i14 = this.f14653C;
            if (z11) {
                if (i14 != -1) {
                    iMin = Math.min(iMin, i14);
                }
                this.f14680i0 = iMin;
            } else {
                int iMin2 = iMin - i13;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f14680i0 = iMin2;
            }
        }
        this.U = Math.max(0, this.f14682k0 - this.f14680i0);
        this.f14667V = (int) ((1.0f - this.f14668W) * this.f14682k0);
        w();
        int i15 = this.f14674c0;
        if (i15 == 3) {
            view.offsetTopAndBottom(E());
        } else if (i15 == 6) {
            view.offsetTopAndBottom(this.f14667V);
        } else if (this.f14671Z && i15 == 5) {
            view.offsetTopAndBottom(this.f14682k0);
        } else if (i15 == 4) {
            view.offsetTopAndBottom(this.f14669X);
        } else if (i15 == 1 || i15 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        R(this.f14674c0, false);
        this.f14685n0 = new WeakReference(B(view));
        while (true) {
            ArrayList arrayList = this.f14686o0;
            if (i11 >= arrayList.size()) {
                return true;
            }
            ((a) arrayList.get(i11)).a(view);
            i11++;
        }
    }

    @Override // u1.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f14652B, marginLayoutParams.width), D(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f14653C, marginLayoutParams.height));
        return true;
    }

    @Override // u1.b
    public final boolean n(View view) {
        WeakReference weakReference = this.f14685n0;
        return (weakReference == null || view != weakReference.get() || this.f14674c0 == 3) ? false : true;
    }

    @Override // u1.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f14685n0;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        boolean z10 = this.f14673b0;
        if (i11 > 0) {
            if (i13 < E()) {
                int iE = top - E();
                iArr[1] = iE;
                int i14 = -iE;
                WeakHashMap weakHashMap = S.f3689a;
                view.offsetTopAndBottom(i14);
                M(3);
            } else {
                if (!z10) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap2 = S.f3689a;
                view.offsetTopAndBottom(-i11);
                M(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i15 = this.f14669X;
            if (i13 > i15 && !this.f14671Z) {
                int i16 = top - i15;
                iArr[1] = i16;
                int i17 = -i16;
                WeakHashMap weakHashMap3 = S.f3689a;
                view.offsetTopAndBottom(i17);
                M(4);
            } else {
                if (!z10) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap4 = S.f3689a;
                view.offsetTopAndBottom(-i11);
                M(1);
            }
        }
        A(view.getTop());
        this.f14677f0 = i11;
        this.f14678g0 = true;
    }

    @Override // u1.b
    public final void r(View view, Parcelable parcelable) {
        p193t7.b bVar = (p193t7.b) parcelable;
        int i10 = this.f14689r;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f14697v = bVar.f22621u;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f14691s = bVar.f22622v;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f14671Z = bVar.f22623w;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f14672a0 = bVar.f22624x;
            }
        }
        int i11 = bVar.f22620t;
        if (i11 == 1 || i11 == 2) {
            this.f14674c0 = 4;
        } else {
            this.f14674c0 = i11;
        }
    }

    @Override // u1.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new p193t7.b(this);
    }

    @Override // u1.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f14677f0 = 0;
        this.f14678g0 = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // u1.b
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        int i12 = 3;
        if (view.getTop() == E()) {
            M(3);
            return;
        }
        WeakReference weakReference = this.f14685n0;
        if (weakReference != null && view2 == weakReference.get() && this.f14678g0) {
            if (this.f14677f0 > 0) {
                if (!this.f14691s && view.getTop() > this.f14667V) {
                    i12 = 6;
                }
            } else if (this.f14671Z) {
                VelocityTracker velocityTracker = this.f14687p0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f14693t);
                    yVelocity = this.f14687p0.getYVelocity(this.f14690r0);
                }
                if (N(view, yVelocity)) {
                    i12 = 5;
                } else if (this.f14677f0 == 0) {
                    top2 = view.getTop();
                    if (this.f14691s) {
                        i11 = this.f14667V;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - this.f14669X)) {
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f14669X)) {
                            i12 = 4;
                        }
                        i12 = 6;
                    } else if (Math.abs(top2 - this.U) >= Math.abs(top2 - this.f14669X)) {
                        i12 = 4;
                    }
                } else {
                    if (!this.f14691s) {
                        top = view.getTop();
                        if (Math.abs(top - this.f14667V) < Math.abs(top - this.f14669X)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.f14677f0 == 0) {
                top2 = view.getTop();
                if (this.f14691s) {
                    i11 = this.f14667V;
                    if (top2 < i11) {
                        if (top2 >= Math.abs(top2 - this.f14669X)) {
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f14669X)) {
                        i12 = 4;
                    }
                    i12 = 6;
                } else if (Math.abs(top2 - this.U) >= Math.abs(top2 - this.f14669X)) {
                    i12 = 4;
                }
            } else {
                if (!this.f14691s) {
                    top = view.getTop();
                    if (Math.abs(top - this.f14667V) < Math.abs(top - this.f14669X)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            O(view, i12, false);
            this.f14678g0 = false;
        }
    }

    @Override // u1.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f14674c0;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        c cVar = this.f14675d0;
        if (cVar != null && (this.f14673b0 || i10 == 1)) {
            cVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            H();
        }
        if (this.f14687p0 == null) {
            this.f14687p0 = VelocityTracker.obtain();
        }
        this.f14687p0.addMovement(motionEvent);
        if (this.f14675d0 != null && ((this.f14673b0 || this.f14674c0 == 1) && actionMasked == 2 && !this.f14676e0)) {
            float fAbs = Math.abs(this.f14692s0 - motionEvent.getY());
            c cVar2 = this.f14675d0;
            if (fAbs > cVar2.f7202b) {
                cVar2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f14676e0;
    }

    public final void w() {
        int iY = y();
        if (this.f14691s) {
            this.f14669X = Math.max(this.f14682k0 - iY, this.U);
        } else {
            this.f14669X = this.f14682k0 - iY;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final float x() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f3;
        float f7 = 0.0f;
        if (this.f14703z != null && (weakReference = this.f14683l0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f14683l0.get();
            if (G() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fI = this.f14703z.i();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fI <= 0.0f) {
                        f3 = 0.0f;
                    } else {
                        f3 = radius / fI;
                    }
                } else {
                    f3 = 0.0f;
                }
                i iVar = this.f14703z;
                float fA = iVar.f7325r.f7294a.f7353f.a(iVar.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f7 = radius2 / fA;
                    }
                }
                return Math.max(f3, f7);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int i10;
        if (this.f14699w) {
            return Math.min(Math.max(this.f14701x, this.f14682k0 - ((this.f14681j0 * 9) / 16)), this.f14680i0) + this.f14663M;
        }
        return (this.f14655E || this.f14656F || (i10 = this.f14654D) <= 0) ? this.f14697v + this.f14663M : Math.max(this.f14697v, i10 + this.f14702y);
    }

    public final void z(int i10, View view) {
        if (view == null) {
            return;
        }
        S.l(524288, view);
        S.i(0, view);
        S.l(262144, view);
        S.i(0, view);
        S.l(1048576, view);
        S.i(0, view);
        SparseIntArray sparseIntArray = this.f14698v0;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 != -1) {
            S.l(i11, view);
            S.i(0, view);
            sparseIntArray.delete(i10);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        this.f14689r = 0;
        this.f14691s = true;
        this.f14652B = -1;
        this.f14653C = -1;
        this.R = new e(this);
        this.f14668W = 0.5f;
        this.f14670Y = -1.0f;
        this.f14673b0 = true;
        this.f14674c0 = 4;
        this.f14679h0 = 0.1f;
        this.f14686o0 = new ArrayList();
        this.f14692s0 = -1;
        this.f14698v0 = new SparseIntArray();
        this.f14700w0 = new d(2, this);
        this.f14702y = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.g);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f14651A = va.g.w(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f14666P = o.d(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.f14666P;
        if (oVar != null) {
            i iVar = new i(oVar);
            this.f14703z = iVar;
            iVar.k(context);
            ColorStateList colorStateList = this.f14651A;
            if (colorStateList != null) {
                this.f14703z.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f14703z.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.S = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.S.addUpdateListener(new C0150y(9, this));
        this.f14670Y = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f14652B = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f14653C = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            K(i10);
        } else {
            K(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        J(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f14655E = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f14691s != z10) {
            this.f14691s = z10;
            if (this.f14683l0 != null) {
                w();
            }
            M((this.f14691s && this.f14674c0 == 6) ? 3 : this.f14674c0);
            R(this.f14674c0, true);
            P();
        }
        this.f14672a0 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f14673b0 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f14689r = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f3 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f3 > 0.0f && f3 < 1.0f) {
            this.f14668W = f3;
            if (this.f14683l0 != null) {
                this.f14667V = (int) ((1.0f - f3) * this.f14682k0);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i11 = typedValuePeekValue2.data;
                if (i11 >= 0) {
                    this.T = i11;
                    R(this.f14674c0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.T = dimensionPixelOffset;
                    R(this.f14674c0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f14695u = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f14656F = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f14657G = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f14658H = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f14659I = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f14660J = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f14661K = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f14662L = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f14665O = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f14693t = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // u1.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
