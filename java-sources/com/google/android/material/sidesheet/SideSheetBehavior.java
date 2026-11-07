package com.google.android.material.sidesheet;

import B0.c;
import I1.I;
import I1.S;
import J1.q;
import J7.j;
import P2.d;
import R7.C0479a;
import R7.i;
import R7.m;
import R7.o;
import S7.a;
import S7.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p020c.C0776a;
import u1.b;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b implements J7.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f15157A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f15158B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15159C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15160D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f15161E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f15162F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public WeakReference f15163G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public WeakReference f15164H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f15165I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public VelocityTracker f15166J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public j f15167K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15168L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final LinkedHashSet f15169M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final d f15170N;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f15171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f15172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ColorStateList f15173t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o f15174u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f15175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f15176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f15177x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15178y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public R1.c f15179z;

    public SideSheetBehavior() {
        this.f15175v = new e(this);
        this.f15177x = true;
        this.f15178y = 5;
        this.f15158B = 0.1f;
        this.f15165I = -1;
        this.f15169M = new LinkedHashSet();
        this.f15170N = new d(1, this);
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f15163G;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.l(262144, view);
        S.i(0, view);
        S.l(1048576, view);
        S.i(0, view);
        final int i10 = 5;
        if (this.f15178y != 5) {
            S.m(view, J1.d.f4203n, null, new q() { // from class: S7.b
                @Override // J1.q
                public final boolean f(View view2) {
                    this.f7516r.w(i10);
                    return true;
                }
            });
        }
        final int i11 = 3;
        if (this.f15178y != 3) {
            S.m(view, J1.d.f4201l, null, new q() { // from class: S7.b
                @Override // J1.q
                public final boolean f(View view2) {
                    this.f7516r.w(i11);
                    return true;
                }
            });
        }
    }

    @Override // J7.b
    public final void a() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        j jVar = this.f15167K;
        if (jVar == null) {
            return;
        }
        C0776a c0776a = jVar.f4371f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jVar.f4371f = null;
        int i10 = 5;
        if (c0776a == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        c cVar = this.f15171r;
        if (cVar != null && cVar.N() != 0) {
            i10 = 3;
        }
        F7.e eVar = new F7.e(6, this);
        WeakReference weakReference = this.f15164H;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iB = this.f15171r.B(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: S7.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f7518a.f15171r.j0(marginLayoutParams, p137n7.a.c(iB, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        jVar.c(c0776a, i10, eVar, animatorUpdateListener);
    }

    @Override // J7.b
    public final void b(C0776a c0776a) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        j jVar = this.f15167K;
        if (jVar == null) {
            return;
        }
        c cVar = this.f15171r;
        int i10 = (cVar == null || cVar.N() == 0) ? 5 : 3;
        if (jVar.f4371f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0776a c0776a2 = jVar.f4371f;
        jVar.f4371f = c0776a;
        if (c0776a2 != null) {
            jVar.d(i10, c0776a.f13367c, c0776a.f13368d == 0);
        }
        WeakReference weakReference = this.f15163G;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f15163G.get();
        WeakReference weakReference2 = this.f15164H;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f15171r.j0(marginLayoutParams, (int) ((view.getScaleX() * this.f15159C) + this.f15162F));
        view2.requestLayout();
    }

    @Override // J7.b
    public final void c(C0776a c0776a) {
        j jVar = this.f15167K;
        if (jVar == null) {
            return;
        }
        jVar.f4371f = c0776a;
    }

    @Override // J7.b
    public final void d() {
        j jVar = this.f15167K;
        if (jVar == null) {
            return;
        }
        jVar.b();
    }

    @Override // u1.b
    public final void g(u1.e eVar) {
        this.f15163G = null;
        this.f15179z = null;
        this.f15167K = null;
    }

    @Override // u1.b
    public final void j() {
        this.f15163G = null;
        this.f15179z = null;
        this.f15167K = null;
    }

    @Override // u1.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        R1.c cVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && S.e(view) == null) || !this.f15177x) {
            this.f15157A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f15166J) != null) {
            velocityTracker.recycle();
            this.f15166J = null;
        }
        if (this.f15166J == null) {
            this.f15166J = VelocityTracker.obtain();
        }
        this.f15166J.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f15168L = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f15157A) {
            this.f15157A = false;
            return false;
        }
        return (this.f15157A || (cVar = this.f15179z) == null || !cVar.t(motionEvent)) ? false : true;
    }

    @Override // u1.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View view2;
        View view3;
        int i11;
        View viewFindViewById;
        WeakHashMap weakHashMap = S.f3689a;
        int i12 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f15163G;
        i iVar = this.f15172s;
        int iK = 0;
        if (weakReference == null) {
            this.f15163G = new WeakReference(view);
            this.f15167K = new j(view);
            if (iVar != null) {
                view.setBackground(iVar);
                float fE = this.f15176w;
                if (fE == -1.0f) {
                    fE = I.e(view);
                }
                iVar.l(fE);
            } else {
                ColorStateList colorStateList = this.f15173t;
                if (colorStateList != null) {
                    I.i(view, colorStateList);
                }
            }
            int i13 = this.f15178y == 5 ? 4 : 0;
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (S.e(view) == null) {
                S.p(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i14 = Gravity.getAbsoluteGravity(((u1.e) view.getLayoutParams()).f22808c, i10) == 3 ? 1 : 0;
        c cVar = this.f15171r;
        if (cVar == null || cVar.N() != i14) {
            u1.e eVar = null;
            o oVar = this.f15174u;
            if (i14 == 0) {
                this.f15171r = new a(this, i12);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f15163G;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof u1.e)) {
                        eVar = (u1.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        m mVarG = oVar.g();
                        mVarG.f7342f = new C0479a(0.0f);
                        mVarG.g = new C0479a(0.0f);
                        o oVarA = mVarG.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(oVarA);
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalArgumentException(p245z2.a.B(i14, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f15171r = new a(this, iK);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f15163G;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof u1.e)) {
                        eVar = (u1.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        m mVarG2 = oVar.g();
                        mVarG2.f7341e = new C0479a(0.0f);
                        mVarG2.f7343h = new C0479a(0.0f);
                        o oVarA2 = mVarG2.a();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(oVarA2);
                        }
                    }
                }
            }
        }
        if (this.f15179z == null) {
            this.f15179z = new R1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f15170N);
        }
        int iK2 = this.f15171r.K(view);
        coordinatorLayout.v(i10, view);
        this.f15160D = coordinatorLayout.getWidth();
        this.f15161E = this.f15171r.L(coordinatorLayout);
        this.f15159C = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f15162F = marginLayoutParams != null ? this.f15171r.d(marginLayoutParams) : 0;
        int i15 = this.f15178y;
        if (i15 == 1 || i15 == 2) {
            iK = iK2 - this.f15171r.K(view);
        } else if (i15 != 3) {
            if (i15 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f15178y);
            }
            iK = this.f15171r.G();
        }
        view.offsetLeftAndRight(iK);
        if (this.f15164H == null && (i11 = this.f15165I) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f15164H = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f15169M.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // u1.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // u1.b
    public final void r(View view, Parcelable parcelable) {
        int i10 = ((S7.d) parcelable).f7522t;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f15178y = i10;
    }

    @Override // u1.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new S7.d(this);
    }

    @Override // u1.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f15178y == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.f15179z.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f15166J) != null) {
            velocityTracker.recycle();
            this.f15166J = null;
        }
        if (this.f15166J == null) {
            this.f15166J = VelocityTracker.obtain();
        }
        this.f15166J.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.f15157A && y()) {
            float fAbs = Math.abs(this.f15168L - motionEvent.getX());
            R1.c cVar = this.f15179z;
            if (fAbs > cVar.f7202b) {
                cVar.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f15157A;
    }

    public final void w(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(p.B(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f15163G;
        if (weakReference == null || weakReference.get() == null) {
            x(i10);
            return;
        }
        View view = (View) this.f15163G.get();
        M.d dVar = new M.d(i10, 1, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = S.f3689a;
            if (view.isAttachedToWindow()) {
                view.post(dVar);
                return;
            }
        }
        dVar.run();
    }

    public final void x(int i10) {
        View view;
        if (this.f15178y == i10) {
            return;
        }
        this.f15178y = i10;
        WeakReference weakReference = this.f15163G;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f15178y == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f15169M.iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
        A();
    }

    public final boolean y() {
        if (this.f15179z != null) {
            return this.f15177x || this.f15178y == 1;
        }
        return false;
    }

    public final void z(View view, int i10, boolean z10) {
        int iE;
        if (i10 == 3) {
            iE = this.f15171r.E();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException(p123m2.c.r(i10, "Invalid state to get outer edge offset: "));
            }
            iE = this.f15171r.G();
        }
        R1.c cVar = this.f15179z;
        if (cVar == null || (!z10 ? cVar.u(view, iE, view.getTop()) : cVar.s(iE, view.getTop()))) {
            x(i10);
        } else {
            x(2);
            this.f15175v.a(i10);
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f15175v = new e(this);
        this.f15177x = true;
        this.f15178y = 5;
        this.f15158B = 0.1f;
        this.f15165I = -1;
        this.f15169M = new LinkedHashSet();
        this.f15170N = new d(1, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19652Y);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f15173t = g.w(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f15174u = o.d(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f15165I = resourceId;
            WeakReference weakReference = this.f15164H;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f15164H = null;
            WeakReference weakReference2 = this.f15163G;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = S.f3689a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        o oVar = this.f15174u;
        if (oVar != null) {
            i iVar = new i(oVar);
            this.f15172s = iVar;
            iVar.k(context);
            ColorStateList colorStateList = this.f15173t;
            if (colorStateList != null) {
                this.f15172s.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f15172s.setTint(typedValue.data);
            }
        }
        this.f15176w = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f15177x = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
