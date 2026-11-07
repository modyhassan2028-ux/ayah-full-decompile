package com.google.android.material.bottomappbar;

import H7.H;
import H7.I;
import H7.J;
import I1.S;
import R7.C0479a;
import R7.i;
import R7.l;
import R7.o;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p050e8.b;
import p151p.C1256n;
import p151p.V;
import p151p.e1;
import p177r7.c;
import p177r7.d;
import p177r7.f;
import p177r7.g;
import p185s8.u0;
import u.O;
import u1.e;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements u1.a {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final /* synthetic */ int f14616M0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final boolean f14617A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final boolean f14618B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final boolean f14619C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f14620D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f14621E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f14622F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public Behavior f14623G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f14624H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f14625I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f14626J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final p177r7.a f14627K0;
    public final C1256n L0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Integer f14628o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final i f14629p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AnimatorSet f14630q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AnimatorSet f14631r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f14632s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f14633t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f14634u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int f14635v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f14636w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f14637x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final boolean f14638y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f14639z0;

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public static void L(BottomAppBar bottomAppBar, View view) {
        e eVar = (e) view.getLayoutParams();
        eVar.f22809d = 17;
        int i10 = bottomAppBar.f14634u0;
        if (i10 == 1) {
            eVar.f22809d = 49;
        }
        if (i10 == 0) {
            eVar.f22809d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f14624H0;
    }

    private int getFabAlignmentAnimationDuration() {
        return b.S(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return E(this.f14632s0);
    }

    private float getFabTranslationY() {
        if (this.f14634u0 == 1) {
            return -getTopEdgeTreatment().f21594w;
        }
        View viewC = C();
        return viewC != null ? (-((getMeasuredHeight() + getBottomInset()) - viewC.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f14626J0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f14625I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g getTopEdgeTreatment() {
        return (g) this.f14629p0.f7325r.f7294a.f7355i;
    }

    public final View C() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((O) coordinatorLayout.f12305s.f555s).get(this);
        ArrayList arrayList = coordinatorLayout.f12307u;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int D(ActionMenuView actionMenuView, int i10, boolean z10) {
        int dimensionPixelOffset = 0;
        if (this.f14637x0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zL = H.l(this);
        int measuredWidth = zL ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof e1) && (((e1) childAt.getLayoutParams()).f20655a & 8388615) == 8388611) {
                measuredWidth = zL ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zL ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zL ? this.f14625I0 : -this.f14626J0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zL) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    public final float E(int i10) {
        boolean zL = H.l(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewC = C();
        int i11 = zL ? this.f14626J0 : this.f14625I0;
        return ((getMeasuredWidth() / 2) - ((this.f14636w0 == -1 || viewC == null) ? this.f14635v0 + i11 : ((viewC.getMeasuredWidth() / 2) + this.f14636w0) + i11)) * (zL ? -1 : 1);
    }

    public final boolean F() {
        View viewC = C();
        FloatingActionButton floatingActionButton = viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null;
        return floatingActionButton != null && floatingActionButton.i();
    }

    public final void G(int i10, boolean z10) {
        WeakHashMap weakHashMap = S.f3689a;
        if (!isLaidOut()) {
            this.f14621E0 = false;
            int i11 = this.f14620D0;
            if (i11 != 0) {
                this.f14620D0 = 0;
                getMenu().clear();
                m(i11);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f14631r0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!F()) {
            i10 = 0;
            z10 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        int i12 = 2;
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - D(actionMenuView, i10, z10)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new d(this, actionMenuView, i10, z10));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.f14631r0 = animatorSet3;
        animatorSet3.addListener(new p177r7.a(this, i12));
        this.f14631r0.start();
    }

    public final void H() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f14631r0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (F()) {
            K(actionMenuView, this.f14632s0, this.f14622F0, false);
        } else {
            K(actionMenuView, 0, false, false);
        }
    }

    public final void I() {
        getTopEdgeTreatment().f21595x = getFabTranslationX();
        this.f14629p0.n((this.f14622F0 && F() && this.f14634u0 == 1) ? 1.0f : 0.0f);
        View viewC = C();
        if (viewC != null) {
            viewC.setTranslationY(getFabTranslationY());
            viewC.setTranslationX(getFabTranslationX());
        }
    }

    public final void J(int i10) {
        float f3 = i10;
        if (f3 != getTopEdgeTreatment().f21593v) {
            getTopEdgeTreatment().f21593v = f3;
            this.f14629p0.invalidateSelf();
        }
    }

    public final void K(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        p177r7.e eVar = new p177r7.e(this, actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f14629p0.f7325r.f7298e;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f21594w;
    }

    public int getFabAlignmentMode() {
        return this.f14632s0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f14636w0;
    }

    public int getFabAnchorMode() {
        return this.f14634u0;
    }

    public int getFabAnimationMode() {
        return this.f14633t0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f21592u;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f21591t;
    }

    public boolean getHideOnScroll() {
        return this.f14639z0;
    }

    public int getMenuAlignmentMode() {
        return this.f14637x0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.C(this, this.f14629p0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            AnimatorSet animatorSet = this.f14631r0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f14630q0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            I();
            View viewC = C();
            if (viewC != null) {
                WeakHashMap weakHashMap = S.f3689a;
                if (viewC.isLaidOut()) {
                    viewC.post(new I(2, viewC));
                }
            }
        }
        H();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f6852r);
        this.f14632s0 = fVar.f21589t;
        this.f14622F0 = fVar.f21590u;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f21589t = this.f14632s0;
        fVar.f21590u = this.f14622F0;
        return fVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.f14629p0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f3) {
        if (f3 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().u(f3);
            this.f14629p0.invalidateSelf();
            I();
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        i iVar = this.f14629p0;
        iVar.l(f3);
        int iH = iVar.f7325r.f7306o - iVar.h();
        Behavior behavior = getBehavior();
        behavior.f14607y = iH;
        if (behavior.f14606x == 1) {
            setTranslationY(behavior.f14605w + iH);
        }
    }

    public void setFabAlignmentMode(int i10) {
        setFabAlignmentModeAndReplaceMenu(i10, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i10, int i11) {
        this.f14620D0 = i11;
        int i12 = 1;
        this.f14621E0 = true;
        G(i10, this.f14622F0);
        if (this.f14632s0 != i10) {
            WeakHashMap weakHashMap = S.f3689a;
            if (isLaidOut()) {
                AnimatorSet animatorSet = this.f14630q0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f14633t0 == 1) {
                    View viewC = C();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewC instanceof FloatingActionButton ? (FloatingActionButton) viewC : null, "translationX", E(i10));
                    objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                    arrayList.add(objectAnimatorOfFloat);
                } else {
                    View viewC2 = C();
                    FloatingActionButton floatingActionButton = viewC2 instanceof FloatingActionButton ? (FloatingActionButton) viewC2 : null;
                    if (floatingActionButton != null && !floatingActionButton.h()) {
                        floatingActionButton.g(new c(this, i10), true);
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                animatorSet2.setInterpolator(b.T(getContext(), R.attr.motionEasingEmphasizedInterpolator, p137n7.a.f20015a));
                this.f14630q0 = animatorSet2;
                animatorSet2.addListener(new p177r7.a(this, i12));
                this.f14630q0.start();
            }
        }
        this.f14632s0 = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f14636w0 != i10) {
            this.f14636w0 = i10;
            I();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f14634u0 = i10;
        I();
        View viewC = C();
        if (viewC != null) {
            L(this, viewC);
            viewC.requestLayout();
            this.f14629p0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f14633t0 = i10;
    }

    public void setFabCornerSize(float f3) {
        if (f3 != getTopEdgeTreatment().f21596y) {
            getTopEdgeTreatment().f21596y = f3;
            this.f14629p0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f3) {
        if (f3 != getFabCradleMargin()) {
            getTopEdgeTreatment().f21592u = f3;
            this.f14629p0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f3) {
        if (f3 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f21591t = f3;
            this.f14629p0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f14639z0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f14637x0 != i10) {
            this.f14637x0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                K(actionMenuView, this.f14632s0, F(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f14628o0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f14628o0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f14628o0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // u1.a
    public Behavior getBehavior() {
        if (this.f14623G0 == null) {
            this.f14623G0 = new Behavior();
        }
        return this.f14623G0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final Rect f14640A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public WeakReference f14641B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f14642C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final a f14643D;

        public Behavior() {
            this.f14643D = new a(this);
            this.f14640A = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, u1.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f14641B = new WeakReference(bottomAppBar);
            int i11 = BottomAppBar.f14616M0;
            View viewC = bottomAppBar.C();
            if (viewC != null) {
                WeakHashMap weakHashMap = S.f3689a;
                if (!viewC.isLaidOut()) {
                    BottomAppBar.L(bottomAppBar, viewC);
                    this.f14642C = ((ViewGroup.MarginLayoutParams) ((e) viewC.getLayoutParams())).bottomMargin;
                    if (viewC instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewC;
                        if (bottomAppBar.f14634u0 == 0 && bottomAppBar.f14638y0) {
                            I1.I.k(floatingActionButton, 0.0f);
                            floatingActionButton.setCompatElevation(0.0f);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c(bottomAppBar.f14627K0);
                        floatingActionButton.d(new p177r7.a(bottomAppBar, 3));
                        floatingActionButton.e(bottomAppBar.L0);
                    }
                    viewC.addOnLayoutChangeListener(this.f14643D);
                    bottomAppBar.I();
                }
            }
            coordinatorLayout.v(i10, bottomAppBar);
            super.l(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, u1.b
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.t(coordinatorLayout, bottomAppBar, view2, view3, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14643D = new a(this);
            this.f14640A = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i10);
        i iVar = new i();
        this.f14629p0 = iVar;
        int i11 = 0;
        this.f14620D0 = 0;
        this.f14621E0 = false;
        this.f14622F0 = true;
        this.f14627K0 = new p177r7.a(this, i11);
        this.L0 = new C1256n(4, this);
        Context context2 = getContext();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19662e, i10, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListW = va.g.w(context2, typedArrayM, 1);
        if (typedArrayM.hasValue(12)) {
            setNavigationIconTint(typedArrayM.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayM.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayM.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayM.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayM.getDimensionPixelOffset(9, 0);
        this.f14632s0 = typedArrayM.getInt(3, 0);
        this.f14633t0 = typedArrayM.getInt(6, 0);
        this.f14634u0 = typedArrayM.getInt(5, 1);
        this.f14638y0 = typedArrayM.getBoolean(16, true);
        this.f14637x0 = typedArrayM.getInt(11, 0);
        this.f14639z0 = typedArrayM.getBoolean(10, false);
        this.f14617A0 = typedArrayM.getBoolean(13, false);
        this.f14618B0 = typedArrayM.getBoolean(14, false);
        this.f14619C0 = typedArrayM.getBoolean(15, false);
        this.f14636w0 = typedArrayM.getDimensionPixelOffset(4, -1);
        boolean z10 = typedArrayM.getBoolean(0, true);
        typedArrayM.recycle();
        this.f14635v0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        g gVar = new g(i11);
        gVar.f21596y = -1.0f;
        gVar.f21592u = dimensionPixelOffset;
        gVar.f21591t = dimensionPixelOffset2;
        gVar.u(dimensionPixelOffset3);
        gVar.f21595x = 0.0f;
        l lVar = new l();
        l lVar2 = new l();
        l lVar3 = new l();
        l lVar4 = new l();
        C0479a c0479a = new C0479a(0.0f);
        C0479a c0479a2 = new C0479a(0.0f);
        C0479a c0479a3 = new C0479a(0.0f);
        C0479a c0479a4 = new C0479a(0.0f);
        int i12 = 0;
        R7.f fVar = new R7.f(i12);
        R7.f fVar2 = new R7.f(i12);
        R7.f fVar3 = new R7.f(i12);
        o oVar = new o();
        oVar.f7348a = lVar;
        oVar.f7349b = lVar2;
        oVar.f7350c = lVar3;
        oVar.f7351d = lVar4;
        oVar.f7352e = c0479a;
        oVar.f7353f = c0479a2;
        oVar.g = c0479a3;
        oVar.f7354h = c0479a4;
        oVar.f7355i = gVar;
        oVar.j = fVar;
        oVar.f7356k = fVar2;
        oVar.f7357l = fVar3;
        iVar.setShapeAppearanceModel(oVar);
        if (z10) {
            iVar.q(2);
        } else {
            iVar.q(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        iVar.o();
        iVar.k(context2);
        setElevation(dimensionPixelSize);
        iVar.setTintList(colorStateListW);
        WeakHashMap weakHashMap = S.f3689a;
        setBackground(iVar);
        V v10 = new V(this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p128m7.a.f19683w, i10, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.recycle();
        H.f(this, new J(z11, z12, z13, v10));
    }
}
