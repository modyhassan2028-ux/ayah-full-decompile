package com.google.android.material.appbar;

import H7.C0230d;
import H7.H;
import I1.B0;
import I1.I;
import I1.InterfaceC0261n;
import I1.S;
import R7.i;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p085i0.n;
import p148o7.g;
import p148o7.h;
import p148o7.j;
import p148o7.k;
import p185s8.u0;
import p245z2.a;
import u.O;
import u1.e;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements u1.a {
    public static final /* synthetic */ int Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14527A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14528B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14529C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14530D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public WeakReference f14531E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f14532F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ValueAnimator f14533G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f14534H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ArrayList f14535I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final long f14536J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final TimeInterpolator f14537K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f14538L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Drawable f14539M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Integer f14540N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final float f14541O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Behavior f14542P;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public B0 f14549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f14550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14551z;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends h {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // u1.b
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // u1.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            u1.b bVar = ((e) view2.getLayoutParams()).f22806a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f14552A) + this.f20367v) - y(view2);
                WeakHashMap weakHashMap = S.f3689a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f14529C) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // u1.b
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                S.o(coordinatorLayout, null);
            }
        }

        @Override // u1.b
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.o(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f20365t;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.setExpanded(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.T);
            this.f20368w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public static p148o7.c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            p148o7.c cVar = new p148o7.c((LinearLayout.LayoutParams) layoutParams);
            cVar.f20352a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            p148o7.c cVar2 = new p148o7.c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.f20352a = 1;
            return cVar2;
        }
        p148o7.c cVar3 = new p148o7.c(layoutParams);
        cVar3.f20352a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p148o7.c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p148o7.c cVar = new p148o7.c(context, attributeSet);
        cVar.f20352a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19656b);
        cVar.f20352a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.f20353b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new n(10);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.f20354c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        Behavior behavior = this.f14542P;
        d dVarF = (behavior == null || this.f14544s == -1 || this.f14548w != 0) ? null : behavior.F(Q1.b.f6851s, this);
        this.f14544s = -1;
        this.f14545t = -1;
        this.f14546u = -1;
        if (dVarF != null) {
            Behavior behavior2 = this.f14542P;
            if (behavior2.f14555D != null) {
                return;
            }
            behavior2.f14555D = dVarF;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p148o7.c;
    }

    public final void d(int i10) {
        this.f14543r = i10;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = S.f3689a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f14550y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                p148o7.e eVar = (p148o7.e) this.f14550y.get(i11);
                if (eVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = eVar.f20357a;
                    collapsingToolbarLayout.f14572P = i10;
                    C0230d c0230d = collapsingToolbarLayout.f14558B;
                    B0 b5 = collapsingToolbarLayout.R;
                    int iD = b5 != null ? b5.d() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i12);
                        p148o7.d dVar = (p148o7.d) childAt.getLayoutParams();
                        j jVarB = CollapsingToolbarLayout.b(childAt);
                        int i13 = dVar.f20355a;
                        if (i13 == 1) {
                            jVarB.b(B9.a.i(-i10, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f20372b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((p148o7.d) childAt.getLayoutParams())).bottomMargin));
                        } else if (i13 == 2) {
                            jVarB.b(Math.round((-i10) * dVar.f20356b));
                        }
                    }
                    collapsingToolbarLayout.d();
                    if (collapsingToolbarLayout.f14563G != null && iD > 0) {
                        WeakHashMap weakHashMap2 = S.f3689a;
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    WeakHashMap weakHashMap3 = S.f3689a;
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
                    float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    float f3 = minimumHeight;
                    float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f3);
                    c0230d.f3498d = fMin;
                    c0230d.f3500e = p.n(1.0f, fMin, 0.5f, fMin);
                    c0230d.f3502f = collapsingToolbarLayout.f14572P + minimumHeight;
                    c0230d.p(Math.abs(i10) / f3);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f14539M == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f14543r);
        this.f14539M.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14539M;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z10) {
        if (this.f14551z || this.f14528B == z10) {
            return false;
        }
        this.f14528B = z10;
        refreshDrawableState();
        if (!(getBackground() instanceof i)) {
            return true;
        }
        if (this.f14532F) {
            g(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f14529C) {
            return true;
        }
        float f3 = this.f14541O;
        g(z10 ? 0.0f : f3, z10 ? f3 : 0.0f);
        return true;
    }

    public final boolean f(View view) {
        int i10;
        if (this.f14531E == null && (i10 = this.f14530D) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f14530D);
            }
            if (viewFindViewById != null) {
                this.f14531E = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f14531E;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void g(float f3, float f7) {
        ValueAnimator valueAnimator = this.f14533G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f7);
        this.f14533G = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f14536J);
        this.f14533G.setInterpolator(this.f14537K);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f14534H;
        if (animatorUpdateListener != null) {
            this.f14533G.addUpdateListener(animatorUpdateListener);
        }
        this.f14533G.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p148o7.c cVar = new p148o7.c(-1, -2);
        cVar.f20352a = 1;
        return cVar;
    }

    @Override // u1.a
    public u1.b getBehavior() {
        Behavior behavior = new Behavior();
        this.f14542P = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f14545t;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                p148o7.c cVar = (p148o7.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f20352a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        WeakHashMap weakHashMap = S.f3689a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i12 & 2) != 0) {
                            WeakHashMap weakHashMap2 = S.f3689a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = S.f3689a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i11 += iMin;
                    }
                    iMin = minimumHeight + i13;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = S.f3689a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f14545t = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f14546u;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                p148o7.c cVar = (p148o7.c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.f20352a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap = S.f3689a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f14546u = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f14530D;
    }

    public i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof i) {
            return (i) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = S.f3689a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f14548w;
    }

    public Drawable getStatusBarForeground() {
        return this.f14539M;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        B0 b5 = this.f14549x;
        if (b5 != null) {
            return b5.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f14544s;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                p148o7.c cVar = (p148o7.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f20352a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = S.f3689a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i12 & 2) != 0) {
                    WeakHashMap weakHashMap2 = S.f3689a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f14544s = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.D(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f14538L == null) {
            this.f14538L = new int[4];
        }
        int[] iArr = this.f14538L;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f14527A;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969606;
        iArr[1] = (z10 && this.f14528B) ? R.attr.state_lifted : -2130969607;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969602;
        iArr[3] = (z10 && this.f14528B) ? R.attr.state_collapsed : -2130969601;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f14531E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14531E = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap weakHashMap = S.f3689a;
        boolean z11 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.f14547v = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((p148o7.c) getChildAt(i14).getLayoutParams()).f20354c != null) {
                this.f14547v = true;
                break;
            }
        }
        Drawable drawable = this.f14539M;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f14551z) {
            return;
        }
        if (!this.f14529C) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i16 = ((p148o7.c) getChildAt(i15).getLayoutParams()).f20352a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.f14527A != z11) {
            this.f14527A = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = S.f3689a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = B9.a.i(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        u0.B(this, f3);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap weakHashMap = S.f3689a;
        setExpanded(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f14529C = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f14530D = -1;
        if (view != null) {
            this.f14531E = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f14531E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14531E = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f14530D = i10;
        WeakReference weakReference = this.f14531E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14531E = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f14551z = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f14539M;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f14539M = drawableMutate;
            if (drawableMutate instanceof i) {
                numValueOf = Integer.valueOf(((i) drawableMutate).f7322L);
            } else {
                ColorStateList colorStateListD = A1.b.d(drawableMutate);
                if (colorStateListD != null) {
                    numValueOf = Integer.valueOf(colorStateListD.getDefaultColor());
                }
            }
            this.f14540N = numValueOf;
            Drawable drawable3 = this.f14539M;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f14539M.setState(getDrawableState());
                }
                Drawable drawable4 = this.f14539M;
                WeakHashMap weakHashMap = S.f3689a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.f14539M.setVisible(getVisibility() == 0, false);
                this.f14539M.setCallback(this);
            }
            if (this.f14539M != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap weakHashMap2 = S.f3689a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(Y2.a.E(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f3) {
        k.a(this, f3);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f14539M;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14539M;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends g {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f14552A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f14553B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public ValueAnimator f14554C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public d f14555D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public WeakReference f14556E;

        public BaseBehavior() {
            this.f20361w = -1;
            this.f20363y = -1;
        }

        public static View B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((e) childAt.getLayoutParams()).f22806a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof InterfaceC0261n) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View childAt;
            boolean zF;
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (childAt != null) {
                int i13 = ((p148o7.c) childAt.getLayoutParams()).f20352a;
                if ((i13 & 1) != 0) {
                    WeakHashMap weakHashMap = S.f3689a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zF = true;
                    if (i11 <= 0 || (i13 & 12) == 0 ? (i13 & 2) == 0 || (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zF = false;
                    }
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (appBarLayout.f14529C) {
                zF = appBarLayout.f(D(coordinatorLayout));
            }
            boolean zE = appBarLayout.e(zF);
            if (!z10) {
                if (zE) {
                    List list = (List) ((O) coordinatorLayout.f12305s.f555s).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f12307u;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        u1.b bVar = ((e) ((View) arrayList.get(i14)).getLayoutParams()).f22806a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).f20368w == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(y() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            if (iY == i10) {
                ValueAnimator valueAnimator = this.f14554C;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f14554C.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f14554C;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f14554C = valueAnimator3;
                valueAnimator3.setInterpolator(p137n7.a.f20019e);
                this.f14554C.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f14554C.setDuration(Math.min(iRound, 600));
            this.f14554C.setIntValues(iY, i10);
            this.f14554C.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i11;
            int downNestedPreScrollRange;
            if (i10 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i10 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i12 = i11;
                int i13 = downNestedPreScrollRange;
                if (i12 != i13) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i10, i12, i13);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f14529C) {
                appBarLayout2.e(appBarLayout2.f(view));
            }
        }

        public final d F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = Q1.b.f6851s;
                    }
                    d dVar = new d(parcelable);
                    boolean z10 = iW == 0;
                    dVar.f14596u = z10;
                    dVar.f14595t = !z10 && (-iW) >= appBarLayout.getTotalScrollRange();
                    dVar.f14597v = i10;
                    WeakHashMap weakHashMap = S.f3689a;
                    dVar.f14599x = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.f14598w = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                p148o7.c cVar = (p148o7.c) childAt.getLayoutParams();
                if ((cVar.f20352a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i11 = -iY;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                p148o7.c cVar2 = (p148o7.c) childAt2.getLayoutParams();
                int i12 = cVar2.f20352a;
                if ((i12 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap weakHashMap = S.f3689a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        WeakHashMap weakHashMap2 = S.f3689a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i12 & 5) == 5) {
                        WeakHashMap weakHashMap3 = S.f3689a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    C(coordinatorLayout, appBarLayout, B9.a.i(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // p148o7.i, u1.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f14555D;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            C(coordinatorLayout, appBarLayout, i11);
                        } else {
                            A(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.f14595t) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.f14596u) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.f14597v);
                int i12 = -childAt.getBottom();
                if (this.f14555D.f14599x) {
                    WeakHashMap weakHashMap = S.f3689a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i12;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f14555D.f14598w) + i12;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f14548w = 0;
            this.f14555D = null;
            int i13 = B9.a.i(w(), -appBarLayout.getTotalScrollRange(), 0);
            j jVar = this.f20369r;
            if (jVar != null) {
                jVar.b(i13);
            } else {
                this.f20370s = i13;
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.d(w());
            if (S.d(coordinatorLayout) != null) {
                return true;
            }
            S.o(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // u1.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.w(i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // u1.b
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // u1.b
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout, y() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i12 == 0 && S.d(coordinatorLayout2) == null) {
                S.o(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // u1.b
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.f14555D = (d) parcelable;
            } else {
                this.f14555D = null;
            }
        }

        @Override // u1.b
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d dVarF = F(absSavedState, (AppBarLayout) view);
            return dVarF == null ? absSavedState : dVarF;
        }

        @Override // u1.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.f14529C || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z10 && (valueAnimator = this.f14554C) != null) {
                valueAnimator.cancel();
            }
            this.f14556E = null;
            this.f14553B = i11;
            return z10;
        }

        @Override // u1.b
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f14553B == 0 || i10 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f14529C) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f14556E = new WeakReference(view2);
        }

        @Override // p148o7.g
        public final int y() {
            return w() + this.f14552A;
        }

        @Override // p148o7.g
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int top;
            boolean zB;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iY = y();
            int i13 = 0;
            if (i11 == 0 || iY < i11 || iY > i12) {
                this.f14552A = 0;
            } else {
                int i14 = B9.a.i(i10, i11, i12);
                if (iY != i14) {
                    if (!appBarLayout.f14547v) {
                        top = i14;
                        break;
                    }
                    int iAbs = Math.abs(i14);
                    int childCount = appBarLayout.getChildCount();
                    int i15 = 0;
                    while (true) {
                        if (i15 < childCount) {
                            View childAt = appBarLayout.getChildAt(i15);
                            p148o7.c cVar = (p148o7.c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f20354c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i16 = cVar.f20352a;
                                    if ((i16 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                        if ((i16 & 2) != 0) {
                                            WeakHashMap weakHashMap = S.f3689a;
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    WeakHashMap weakHashMap2 = S.f3689a;
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f3 = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f3) * f3)) * Integer.signum(i14);
                                        break;
                                    }
                                }
                            } else {
                                i15++;
                            }
                        }
                        top = i14;
                        break;
                    }
                    j jVar = this.f20369r;
                    if (jVar != null) {
                        zB = jVar.b(top);
                    } else {
                        this.f20370s = top;
                        zB = false;
                    }
                    int i17 = iY - i14;
                    this.f14552A = i14 - top;
                    int i18 = 1;
                    if (zB) {
                        int i19 = 0;
                        while (i19 < appBarLayout.getChildCount()) {
                            p148o7.c cVar2 = (p148o7.c) appBarLayout.getChildAt(i19).getLayoutParams();
                            n nVar = cVar2.f20353b;
                            if (nVar != null && (cVar2.f20352a & i18) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i19);
                                float fW = w();
                                Rect rect = (Rect) nVar.f16734t;
                                Rect rect2 = (Rect) nVar.f16733s;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect2.top - Math.abs(fW);
                                if (fAbs <= 0.0f) {
                                    float fH = 1.0f - B9.a.h(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fH * fH)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect.height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap weakHashMap3 = S.f3689a;
                                    childAt2.setClipBounds(rect);
                                } else {
                                    WeakHashMap weakHashMap4 = S.f3689a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setVisibility(0);
                                }
                            }
                            i19++;
                            i18 = 1;
                        }
                    }
                    if (!zB && appBarLayout.f14547v) {
                        coordinatorLayout.m(appBarLayout);
                    }
                    appBarLayout.d(w());
                    H(coordinatorLayout, appBarLayout, i14, i14 < iY ? -1 : 1, false);
                    i13 = i17;
                }
            }
            if (S.d(coordinatorLayout) != null) {
                return i13;
            }
            S.o(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f20361w = -1;
            this.f20363y = -1;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        Integer numValueOf;
        int color;
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_Design_AppBarLayout), attributeSet, i10);
        this.f14544s = -1;
        this.f14545t = -1;
        this.f14546u = -1;
        this.f14548w = 0;
        this.f14535I = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i11 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayM = H.m(context3, attributeSet, k.f20375a, i10, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayM.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM.getResourceId(0, 0)));
            }
            typedArrayM.recycle();
            TypedArray typedArrayM2 = H.m(context2, attributeSet, p128m7.a.f19654a, i10, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayM2.getDrawable(0);
            WeakHashMap weakHashMap = S.f3689a;
            setBackground(drawable);
            final ColorStateList colorStateListW = va.g.w(context2, typedArrayM2, 6);
            this.f14532F = colorStateListW != null;
            final ColorStateList colorStateListD = A1.b.d(getBackground());
            if (colorStateListD != null) {
                final i iVar = new i();
                iVar.m(colorStateListD);
                if (colorStateListW != null) {
                    Context context4 = getContext();
                    TypedValue typedValueY = u0.y(context4, R.attr.colorSurface);
                    if (typedValueY != null) {
                        int i12 = typedValueY.resourceId;
                        if (i12 != 0) {
                            color = context4.getColor(i12);
                        } else {
                            color = typedValueY.data;
                        }
                        numValueOf = Integer.valueOf(color);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.f14534H = new ValueAnimator.AnimatorUpdateListener() { // from class: o7.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            AppBarLayout appBarLayout = this.f20345a;
                            ArrayList arrayList = appBarLayout.f14535I;
                            int iV = Y2.a.V(colorStateListD.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListW.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iV);
                            i iVar2 = iVar;
                            iVar2.m(colorStateListValueOf);
                            if (appBarLayout.f14539M != null && (num2 = appBarLayout.f14540N) != null && num2.equals(num)) {
                                appBarLayout.f14539M.setTint(iV);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                if (obj != null) {
                                    throw new ClassCastException();
                                }
                                if (iVar2.f7325r.f7296c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(iVar);
                } else {
                    iVar.k(context2);
                    this.f14534H = new ValueAnimator.AnimatorUpdateListener() { // from class: o7.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i13 = AppBarLayout.Q;
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            iVar.l(fFloatValue);
                            AppBarLayout appBarLayout = this.f20350a;
                            Drawable drawable2 = appBarLayout.f14539M;
                            if (drawable2 instanceof i) {
                                ((i) drawable2).l(fFloatValue);
                            }
                            Iterator it = appBarLayout.f14535I.iterator();
                            if (it.hasNext()) {
                                throw a.z(it);
                            }
                        }
                    };
                    setBackground(iVar);
                }
            }
            this.f14536J = p050e8.b.S(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f14537K = p050e8.b.T(context2, R.attr.motionEasingStandardInterpolator, p137n7.a.f20015a);
            if (typedArrayM2.hasValue(4)) {
                this.f14548w = typedArrayM2.getBoolean(4, false) ? 1 : 2;
                requestLayout();
            }
            if (typedArrayM2.hasValue(3)) {
                k.a(this, typedArrayM2.getDimensionPixelSize(3, 0));
            }
            if (i11 >= 26) {
                if (typedArrayM2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayM2.getBoolean(2, false));
                }
                if (typedArrayM2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayM2.getBoolean(1, false));
                }
            }
            this.f14541O = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f14529C = typedArrayM2.getBoolean(5, false);
            this.f14530D = typedArrayM2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayM2.getDrawable(8));
            typedArrayM2.recycle();
            I.m(this, new X4.c(this));
        } catch (Throwable th) {
            typedArrayM.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        p148o7.c cVar = new p148o7.c(-1, -2);
        cVar.f20352a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public void setExpanded(boolean z10, boolean z11) {
        this.f14548w = (z10 ? 1 : 2) | (z11 ? 4 : 0) | 8;
        requestLayout();
    }
}
