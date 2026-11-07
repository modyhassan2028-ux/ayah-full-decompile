package com.google.android.material.floatingactionbutton;

import E7.a;
import E7.b;
import F7.d;
import F7.k;
import F7.l;
import F7.m;
import F7.q;
import F7.u;
import F7.w;
import G.a0;
import H7.AbstractC0231e;
import H7.H;
import I1.S;
import O8.c;
import R7.i;
import R7.o;
import R7.z;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p137n7.e;
import p151p.C1256n;
import p151p.C1273w;
import p185s8.u0;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements a, z, u1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f14929A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14930B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f14931C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f14932D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a0 f14933E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final b f14934F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public w f14935G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f14936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f14937t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f14938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f14939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f14940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14943z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private u getImpl() {
        if (this.f14935G == null) {
            this.f14935G = new w(this, new c((Object) this));
        }
        return this.f14935G;
    }

    public final void c(p177r7.a aVar) {
        u impl = getImpl();
        if (impl.f2513t == null) {
            impl.f2513t = new ArrayList();
        }
        impl.f2513t.add(aVar);
    }

    public final void d(p177r7.a aVar) {
        u impl = getImpl();
        if (impl.f2512s == null) {
            impl.f2512s = new ArrayList();
        }
        impl.f2512s.add(aVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(C1256n c1256n) {
        u impl = getImpl();
        k kVar = new k(this, c1256n);
        if (impl.f2514u == null) {
            impl.f2514u = new ArrayList();
        }
        impl.f2514u.add(kVar);
    }

    public final int f(int i10) {
        int i11 = this.f14942y;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(p177r7.c cVar, boolean z10) {
        u impl = getImpl();
        M.k kVar = cVar == null ? null : new M.k(this, cVar, 15);
        FloatingActionButton floatingActionButton = impl.f2515v;
        FloatingActionButton floatingActionButton2 = impl.f2515v;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f2511r == 1) {
                return;
            }
        } else if (impl.f2511r != 2) {
            return;
        }
        Animator animator = impl.f2505l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = S.f3689a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z10 ? 8 : 4, z10);
            if (kVar != null) {
                ((p000a.a) kVar.f5618s).V((FloatingActionButton) kVar.f5619t);
                return;
            }
            return;
        }
        e eVar = impl.f2507n;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, u.f2486F, u.f2487G);
        animatorSetB.addListener(new l(impl, z10, kVar));
        ArrayList arrayList = impl.f2513t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f14936s;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f14937t;
    }

    @Override // u1.a
    public u1.b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f2503i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().f2500e;
    }

    public int getCustomSize() {
        return this.f14942y;
    }

    public int getExpandedComponentIdHint() {
        return this.f14934F.f1974a;
    }

    public e getHideMotionSpec() {
        return getImpl().f2507n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f14940w;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f14940w;
    }

    public o getShapeAppearanceModel() {
        o oVar = getImpl().f2496a;
        oVar.getClass();
        return oVar;
    }

    public e getShowMotionSpec() {
        return getImpl().f2506m;
    }

    public int getSize() {
        return this.f14941x;
    }

    public int getSizeDimension() {
        return f(this.f14941x);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f14938u;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f14939v;
    }

    public boolean getUseCompatPadding() {
        return this.f14930B;
    }

    public final boolean h() {
        u impl = getImpl();
        if (impl.f2515v.getVisibility() == 0) {
            if (impl.f2511r != 1) {
                return false;
            }
        } else if (impl.f2511r == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        u impl = getImpl();
        if (impl.f2515v.getVisibility() != 0) {
            if (impl.f2511r != 2) {
                return false;
            }
        } else if (impl.f2511r == 1) {
            return false;
        }
        return true;
    }

    public final void j(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f14931C;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f14938u;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f14939v;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1273w.c(colorForState, mode));
    }

    public final void l(p177r7.b bVar, boolean z10) {
        u impl = getImpl();
        M.k kVar = bVar == null ? null : new M.k(this, bVar, 15);
        FloatingActionButton floatingActionButton = impl.f2515v;
        Matrix matrix = impl.f2494A;
        FloatingActionButton floatingActionButton2 = impl.f2515v;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f2511r == 2) {
                return;
            }
        } else if (impl.f2511r != 1) {
            return;
        }
        Animator animator = impl.f2505l;
        if (animator != null) {
            animator.cancel();
        }
        int i10 = 0;
        boolean z11 = impl.f2506m == null;
        WeakHashMap weakHashMap = S.f3689a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f2509p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (kVar != null) {
                ((p000a.a) kVar.f5618s).X();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f3 = z11 ? 0.4f : 0.0f;
            impl.f2509p = f3;
            impl.a(f3, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        e eVar = impl.f2506m;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, u.f2484D, u.f2485E);
        animatorSetB.addListener(new m(impl, z10, kVar));
        ArrayList arrayList = impl.f2512s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                animatorSetB.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f2515v;
        i iVar = impl.f2497b;
        if (iVar != null) {
            u0.C(floatingActionButton, iVar);
        }
        if (impl instanceof w) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f2495B == null) {
            impl.f2495B = new q(0, impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f2495B);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f2515v.getViewTreeObserver();
        q qVar = impl.f2495B;
        if (qVar != null) {
            viewTreeObserver.removeOnPreDrawListener(qVar);
            impl.f2495B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f14943z = (sizeDimension - this.f14929A) / 2;
        getImpl().r();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f14931C;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof V7.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        V7.a aVar = (V7.a) parcelable;
        super.onRestoreInstanceState(aVar.f6852r);
        Bundle bundle = (Bundle) aVar.f8418t.get("expandableWidgetHelper");
        bundle.getClass();
        b bVar = this.f14934F;
        bVar.getClass();
        bVar.f1975b = bundle.getBoolean("expanded", false);
        bVar.f1974a = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f1975b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.f1976c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        V7.a aVar = new V7.a(parcelableOnSaveInstanceState);
        b bVar = this.f14934F;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f1975b);
        bundle.putInt("expandedComponentIdHint", bVar.f1974a);
        aVar.f8418t.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f14932D;
            rect.set(0, 0, measuredWidth, measuredHeight);
            j(rect);
            w wVar = this.f14935G;
            int i10 = -(wVar.f2501f ? Math.max((wVar.f2504k - wVar.f2515v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i10, i10);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f14936s != colorStateList) {
            this.f14936s = colorStateList;
            u impl = getImpl();
            i iVar = impl.f2497b;
            if (iVar != null) {
                iVar.setTintList(colorStateList);
            }
            d dVar = impl.f2499d;
            if (dVar != null) {
                if (colorStateList != null) {
                    dVar.f2441m = colorStateList.getColorForState(dVar.getState(), dVar.f2441m);
                }
                dVar.f2444p = colorStateList;
                dVar.f2442n = true;
                dVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f14937t != mode) {
            this.f14937t = mode;
            i iVar = getImpl().f2497b;
            if (iVar != null) {
                iVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f3) {
        u impl = getImpl();
        if (impl.f2502h != f3) {
            impl.f2502h = f3;
            impl.k(f3, impl.f2503i, impl.j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f3) {
        u impl = getImpl();
        if (impl.f2503i != f3) {
            impl.f2503i = f3;
            impl.k(impl.f2502h, f3, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f3) {
        u impl = getImpl();
        if (impl.j != f3) {
            impl.j = f3;
            impl.k(impl.f2502h, impl.f2503i, f3);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f14942y) {
            this.f14942y = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        i iVar = getImpl().f2497b;
        if (iVar != null) {
            iVar.l(f3);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f2501f) {
            getImpl().f2501f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f14934F.f1974a = i10;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().f2507n = eVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(e.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            u impl = getImpl();
            float f3 = impl.f2509p;
            impl.f2509p = f3;
            Matrix matrix = impl.f2494A;
            impl.a(f3, matrix);
            impl.f2515v.setImageMatrix(matrix);
            if (this.f14938u != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f14933E.m(i10);
        k();
    }

    public void setMaxImageSize(int i10) {
        this.f14929A = i10;
        u impl = getImpl();
        if (impl.f2510q != i10) {
            impl.f2510q = i10;
            float f3 = impl.f2509p;
            impl.f2509p = f3;
            Matrix matrix = impl.f2494A;
            impl.a(f3, matrix);
            impl.f2515v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f3) {
        super.setScaleX(f3);
        getImpl().l();
    }

    @Override // android.view.View
    public void setScaleY(float f3) {
        super.setScaleY(f3);
        getImpl().l();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        u impl = getImpl();
        impl.g = z10;
        impl.r();
    }

    @Override // R7.z
    public void setShapeAppearanceModel(o oVar) {
        getImpl().o(oVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().f2506m = eVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(e.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f14942y = 0;
        if (i10 != this.f14941x) {
            this.f14941x = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f14938u != colorStateList) {
            this.f14938u = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f14939v != mode) {
            this.f14939v = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f3) {
        super.setTranslationX(f3);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationY(float f3) {
        super.setTranslationY(f3);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationZ(float f3) {
        super.setTranslationZ(f3);
        getImpl().m();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f14930B != z10) {
            this.f14930B = z10;
            getImpl().i();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends u1.b {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Rect f14944r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f14945s;

        public BaseBehavior() {
            this.f14945s = true;
        }

        @Override // u1.b
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f14931C;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // u1.b
        public final void g(u1.e eVar) {
            if (eVar.f22812h == 0) {
                eVar.f22812h = 80;
            }
        }

        @Override // u1.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof u1.e ? ((u1.e) layoutParams).f22806a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // u1.b
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListO = coordinatorLayout.o(floatingActionButton);
            int size = arrayListO.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) arrayListO.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof u1.e ? ((u1.e) layoutParams).f22806a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.v(i10, floatingActionButton);
            Rect rect = floatingActionButton.f14931C;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                u1.e eVar = (u1.e) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    WeakHashMap weakHashMap = S.f3689a;
                    floatingActionButton.offsetTopAndBottom(i11);
                }
                if (i13 != 0) {
                    WeakHashMap weakHashMap2 = S.f3689a;
                    floatingActionButton.offsetLeftAndRight(i13);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            u1.e eVar = (u1.e) floatingActionButton.getLayoutParams();
            if (!this.f14945s || eVar.f22811f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f14944r == null) {
                this.f14944r = new Rect();
            }
            Rect rect = this.f14944r;
            AbstractC0231e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            u1.e eVar = (u1.e) floatingActionButton.getLayoutParams();
            if (!this.f14945s || eVar.f22811f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((u1.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19680t);
            this.f14945s = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f14940w != colorStateList) {
            this.f14940w = colorStateList;
            getImpl().n(this.f14940w);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_Design_FloatingActionButton), attributeSet, i10);
        this.f14931C = new Rect();
        this.f14932D = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19679s, i10, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f14936s = g.w(context2, typedArrayM, 1);
        this.f14937t = H.o(typedArrayM.getInt(2, -1), null);
        this.f14940w = g.w(context2, typedArrayM, 12);
        this.f14941x = typedArrayM.getInt(7, -1);
        this.f14942y = typedArrayM.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayM.getDimensionPixelSize(3, 0);
        float dimension = typedArrayM.getDimension(4, 0.0f);
        float dimension2 = typedArrayM.getDimension(9, 0.0f);
        float dimension3 = typedArrayM.getDimension(11, 0.0f);
        this.f14930B = typedArrayM.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayM.getDimensionPixelSize(10, 0));
        e eVarA = e.a(context2, typedArrayM, 15);
        e eVarA2 = e.a(context2, typedArrayM, 8);
        o oVarA = o.c(context2, attributeSet, i10, R.style.Widget_Design_FloatingActionButton, o.f7347m).a();
        boolean z10 = typedArrayM.getBoolean(5, false);
        setEnabled(typedArrayM.getBoolean(0, true));
        typedArrayM.recycle();
        a0 a0Var = new a0(this);
        this.f14933E = a0Var;
        a0Var.j(attributeSet, i10);
        b bVar = new b();
        bVar.f1975b = false;
        bVar.f1974a = 0;
        bVar.f1976c = this;
        this.f14934F = bVar;
        getImpl().o(oVarA);
        getImpl().g(this.f14936s, this.f14937t, this.f14940w, dimensionPixelSize);
        getImpl().f2504k = dimensionPixelSize2;
        u impl = getImpl();
        if (impl.f2502h != dimension) {
            impl.f2502h = dimension;
            impl.k(dimension, impl.f2503i, impl.j);
        }
        u impl2 = getImpl();
        if (impl2.f2503i != dimension2) {
            impl2.f2503i = dimension2;
            impl2.k(impl2.f2502h, dimension2, impl2.j);
        }
        u impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.k(impl3.f2502h, impl3.f2503i, dimension3);
        }
        getImpl().f2506m = eVarA;
        getImpl().f2507n = eVarA2;
        getImpl().f2501f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
