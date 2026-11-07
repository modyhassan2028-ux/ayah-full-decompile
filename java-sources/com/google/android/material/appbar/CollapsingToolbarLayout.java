package com.google.android.material.appbar;

import E2.C0150y;
import H7.AbstractC0231e;
import H7.C0230d;
import H7.H;
import I1.B0;
import I1.G;
import I1.I;
import I1.S;
import Z0.B;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.ayah.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p148o7.e;
import p148o7.f;
import p148o7.j;
import p181s2.s;
import p185s8.u0;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f14557A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0230d f14558B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final D7.a f14559C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f14560D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f14561E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f14562F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f14563G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f14564H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f14565I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ValueAnimator f14566J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f14567K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final TimeInterpolator f14568L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final TimeInterpolator f14569M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f14570N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public e f14571O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f14572P;
    public int Q;
    public B0 R;
    public int S;
    public boolean T;
    public int U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f14573V;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewGroup f14576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f14577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f14578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14582z;

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public static j b(View view) {
        j jVar = (j) view.getTag(R.id.view_offset_helper);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(view);
        view.setTag(R.id.view_offset_helper, jVar2);
        return jVar2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListValueOf;
        Context context = getContext();
        TypedValue typedValueY = u0.y(context, R.attr.colorSurfaceContainer);
        if (typedValueY != null) {
            int i10 = typedValueY.resourceId;
            if (i10 != 0) {
                colorStateListValueOf = s.e(context, i10);
            } else {
                int i11 = typedValueY.data;
                if (i11 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i11);
                } else {
                    colorStateListValueOf = null;
                }
            }
        } else {
            colorStateListValueOf = null;
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        D7.a aVar = this.f14559C;
        return aVar.a(aVar.f1339d, dimension);
    }

    public final void a() {
        View view;
        if (this.f14574r) {
            ViewGroup viewGroup = null;
            this.f14576t = null;
            this.f14577u = null;
            int i10 = this.f14575s;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f14576t = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.f14577u = view;
                }
            }
            if (this.f14576t == null) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f14576t = viewGroup;
            }
            c();
            this.f14574r = false;
        }
    }

    public final void c() {
        View view;
        if (!this.f14560D && (view = this.f14578v) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f14578v);
            }
        }
        if (!this.f14560D || this.f14576t == null) {
            return;
        }
        if (this.f14578v == null) {
            this.f14578v = new View(getContext());
        }
        if (this.f14578v.getParent() == null) {
            this.f14576t.addView(this.f14578v, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p148o7.d;
    }

    public final void d() {
        if (this.f14562F == null && this.f14563G == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f14572P < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f14576t == null && (drawable = this.f14562F) != null && this.f14564H > 0) {
            drawable.mutate().setAlpha(this.f14564H);
            this.f14562F.draw(canvas);
        }
        if (this.f14560D && this.f14561E) {
            ViewGroup viewGroup = this.f14576t;
            C0230d c0230d = this.f14558B;
            if (viewGroup == null || this.f14562F == null || this.f14564H <= 0 || this.Q != 1 || c0230d.f3494b >= c0230d.f3500e) {
                c0230d.d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f14562F.getBounds(), Region.Op.DIFFERENCE);
                c0230d.d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f14563G == null || this.f14564H <= 0) {
            return;
        }
        B0 b5 = this.R;
        int iD = b5 != null ? b5.d() : 0;
        if (iD > 0) {
            this.f14563G.setBounds(0, -this.f14572P, getWidth(), iD - this.f14572P);
            this.f14563G.mutate().setAlpha(this.f14564H);
            this.f14563G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z10;
        View view2;
        Drawable drawable = this.f14562F;
        if (drawable == null || this.f14564H <= 0 || ((view2 = this.f14577u) == null || view2 == this ? view != this.f14576t : view != view2)) {
            z10 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.Q == 1 && view != null && this.f14560D) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f14562F.mutate().setAlpha(this.f14564H);
            this.f14562F.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14563G;
        boolean z10 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f14562F;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        C0230d c0230d = this.f14558B;
        if (c0230d != null) {
            c0230d.R = drawableState;
            ColorStateList colorStateList2 = c0230d.f3518o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c0230d.f3516n) != null && colorStateList.isStateful())) {
                c0230d.i(false);
                z10 = true;
            }
            state |= z10;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z10, int i10, int i11, int i12, int i13) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f14560D || (view = this.f14578v) == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f3689a;
        int titleMarginStart = 0;
        boolean z11 = view.isAttachedToWindow() && this.f14578v.getVisibility() == 0;
        this.f14561E = z11;
        if (z11 || z10) {
            boolean z12 = getLayoutDirection() == 1;
            View view2 = this.f14577u;
            if (view2 == null) {
                view2 = this.f14576t;
            }
            int height = ((getHeight() - b(view2).f20372b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((p148o7.d) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f14578v;
            Rect rect = this.f14557A;
            AbstractC0231e.a(this, view3, rect);
            ViewGroup viewGroup = this.f14576t;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            } else {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            }
            int i14 = rect.left + (z12 ? titleMarginEnd : titleMarginStart);
            int i15 = rect.top + height + titleMarginTop;
            int i16 = rect.right;
            if (!z12) {
                titleMarginStart = titleMarginEnd;
            }
            int i17 = i16 - titleMarginStart;
            int i18 = (rect.bottom + height) - titleMarginBottom;
            C0230d c0230d = this.f14558B;
            Rect rect2 = c0230d.f3505h;
            if (rect2.left != i14 || rect2.top != i15 || rect2.right != i17 || rect2.bottom != i18) {
                rect2.set(i14, i15, i17, i18);
                c0230d.S = true;
            }
            int i19 = z12 ? this.f14581y : this.f14579w;
            int i20 = rect.top + this.f14580x;
            int i21 = (i12 - i10) - (z12 ? this.f14579w : this.f14581y);
            int i22 = (i13 - i11) - this.f14582z;
            Rect rect3 = c0230d.g;
            if (rect3.left != i19 || rect3.top != i20 || rect3.right != i21 || rect3.bottom != i22) {
                rect3.set(i19, i20, i21, i22);
                c0230d.S = true;
            }
            c0230d.i(z10);
        }
    }

    public final void f() {
        CharSequence title;
        if (this.f14576t != null && this.f14560D && TextUtils.isEmpty(this.f14558B.f3477G)) {
            ViewGroup viewGroup = this.f14576t;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p148o7.d dVar = new p148o7.d(-1, -1);
        dVar.f20355a = 0;
        dVar.f20356b = 0.5f;
        return dVar;
    }

    public int getCollapsedTitleGravity() {
        return this.f14558B.f3510k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f14558B.f3514m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f14558B.f3529w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f14562F;
    }

    public int getExpandedTitleGravity() {
        return this.f14558B.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f14582z;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f14581y;
    }

    public int getExpandedTitleMarginStart() {
        return this.f14579w;
    }

    public int getExpandedTitleMarginTop() {
        return this.f14580x;
    }

    public float getExpandedTitleTextSize() {
        return this.f14558B.f3512l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f14558B.f3532z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f14558B.f3523q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f14558B.f3508i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f14558B.f3508i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f14558B.f3508i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f14558B.f3517n0;
    }

    public int getScrimAlpha() {
        return this.f14564H;
    }

    public long getScrimAnimationDuration() {
        return this.f14567K;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f14570N;
        if (i10 >= 0) {
            return i10 + this.S + this.U;
        }
        B0 b5 = this.R;
        int iD = b5 != null ? b5.d() : 0;
        WeakHashMap weakHashMap = S.f3689a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f14563G;
    }

    public CharSequence getTitle() {
        if (this.f14560D) {
            return this.f14558B.f3477G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.Q;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f14558B.f3487V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f14558B.f3476F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.Q == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = S.f3689a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f14571O == null) {
                this.f14571O = new e(this);
            }
            e eVar = this.f14571O;
            if (appBarLayout.f14550y == null) {
                appBarLayout.f14550y = new ArrayList();
            }
            if (eVar != null && !appBarLayout.f14550y.contains(eVar)) {
                appBarLayout.f14550y.add(eVar);
            }
            G.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14558B.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        e eVar = this.f14571O;
        if (eVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f14550y) != null) {
            arrayList.remove(eVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        B0 b5 = this.R;
        if (b5 != null) {
            int iD = b5.d();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                WeakHashMap weakHashMap = S.f3689a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            j jVarB = b(getChildAt(i15));
            View view = jVarB.f20371a;
            jVarB.f20372b = view.getTop();
            jVarB.f20373c = view.getLeft();
        }
        e(false, i10, i11, i12, i13);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            b(getChildAt(i16)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        B0 b5 = this.R;
        int iD = b5 != null ? b5.d() : 0;
        if ((mode == 0 || this.T) && iD > 0) {
            this.S = iD;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        if (this.f14573V) {
            C0230d c0230d = this.f14558B;
            if (c0230d.f3517n0 > 1) {
                f();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i12 = c0230d.f3520p;
                if (i12 > 1) {
                    TextPaint textPaint = c0230d.U;
                    textPaint.setTextSize(c0230d.f3512l);
                    textPaint.setTypeface(c0230d.f3532z);
                    textPaint.setLetterSpacing(c0230d.f3504g0);
                    collapsingToolbarLayout.U = (i12 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.U, 1073741824));
                }
            } else {
                collapsingToolbarLayout = this;
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f14576t;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f14577u;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f14562F;
        if (drawable != null) {
            ViewGroup viewGroup = this.f14576t;
            if (this.Q == 1 && viewGroup != null && this.f14560D) {
                i11 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f14558B.l(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f14558B.k(i10);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C0230d c0230d = this.f14558B;
        if (c0230d.f3518o != colorStateList) {
            c0230d.f3518o = colorStateList;
            c0230d.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f3) {
        C0230d c0230d = this.f14558B;
        if (c0230d.f3514m != f3) {
            c0230d.f3514m = f3;
            c0230d.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C0230d c0230d = this.f14558B;
        if (c0230d.m(typeface)) {
            c0230d.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f14562F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f14562F = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f14576t;
                if (this.Q == 1 && viewGroup != null && this.f14560D) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.f14562F.setCallback(this);
                this.f14562F.setAlpha(this.f14564H);
            }
            WeakHashMap weakHashMap = S.f3689a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(getContext().getDrawable(i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        C0230d c0230d = this.f14558B;
        if (c0230d.j != i10) {
            c0230d.j = i10;
            c0230d.i(false);
        }
    }

    public void setExpandedTitleMargin(int i10, int i11, int i12, int i13) {
        this.f14579w = i10;
        this.f14580x = i11;
        this.f14581y = i12;
        this.f14582z = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f14582z = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f14581y = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f14579w = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f14580x = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f14558B.n(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C0230d c0230d = this.f14558B;
        if (c0230d.f3516n != colorStateList) {
            c0230d.f3516n = colorStateList;
            c0230d.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f3) {
        C0230d c0230d = this.f14558B;
        if (c0230d.f3512l != f3) {
            c0230d.f3512l = f3;
            c0230d.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C0230d c0230d = this.f14558B;
        if (c0230d.o(typeface)) {
            c0230d.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f14573V = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.T = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f14558B.f3523q0 = i10;
    }

    public void setLineSpacingAdd(float f3) {
        this.f14558B.f3519o0 = f3;
    }

    public void setLineSpacingMultiplier(float f3) {
        this.f14558B.f3521p0 = f3;
    }

    public void setMaxLines(int i10) {
        C0230d c0230d = this.f14558B;
        if (i10 != c0230d.f3517n0) {
            c0230d.f3517n0 = i10;
            Bitmap bitmap = c0230d.f3481K;
            if (bitmap != null) {
                bitmap.recycle();
                c0230d.f3481K = null;
            }
            c0230d.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f14558B.f3480J = z10;
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f14564H) {
            if (this.f14562F != null && (viewGroup = this.f14576t) != null) {
                WeakHashMap weakHashMap = S.f3689a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.f14564H = i10;
            WeakHashMap weakHashMap2 = S.f3689a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f14567K = j;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f14570N != i10) {
            this.f14570N = i10;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        WeakHashMap weakHashMap = S.f3689a;
        setScrimsShown(z10, isLaidOut() && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(f fVar) {
        C0230d c0230d = this.f14558B;
        if (fVar != null) {
            c0230d.i(true);
        } else {
            c0230d.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f14563G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f14563G = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f14563G.setState(getDrawableState());
                }
                Drawable drawable3 = this.f14563G;
                WeakHashMap weakHashMap = S.f3689a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f14563G.setVisible(getVisibility() == 0, false);
                this.f14563G.setCallback(this);
                this.f14563G.setAlpha(this.f14564H);
            }
            WeakHashMap weakHashMap2 = S.f3689a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(getContext().getDrawable(i10));
    }

    public void setTitle(CharSequence charSequence) {
        C0230d c0230d = this.f14558B;
        if (charSequence == null || !TextUtils.equals(c0230d.f3477G, charSequence)) {
            c0230d.f3477G = charSequence;
            c0230d.f3478H = null;
            Bitmap bitmap = c0230d.f3481K;
            if (bitmap != null) {
                bitmap.recycle();
                c0230d.f3481K = null;
            }
            c0230d.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i10) {
        this.Q = i10;
        boolean z10 = i10 == 1;
        this.f14558B.f3496c = z10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.Q == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.f14562F == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        C0230d c0230d = this.f14558B;
        c0230d.f3476F = truncateAt;
        c0230d.i(false);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f14560D) {
            this.f14560D = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C0230d c0230d = this.f14558B;
        c0230d.f3487V = timeInterpolator;
        c0230d.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f14563G;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f14563G.setVisible(z10, false);
        }
        Drawable drawable2 = this.f14562F;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.f14562F.setVisible(z10, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14562F || drawable == this.f14563G;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p148o7.d dVar = new p148o7.d(context, attributeSet);
        dVar.f20355a = 0;
        dVar.f20356b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19676p);
        dVar.f20355a = typedArrayObtainStyledAttributes.getInt(0, 0);
        dVar.f20356b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        ColorStateList colorStateListW;
        ColorStateList colorStateListW2;
        TextUtils.TruncateAt truncateAt;
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_Design_CollapsingToolbar), attributeSet, i10);
        this.f14574r = true;
        this.f14557A = new Rect();
        this.f14570N = -1;
        this.S = 0;
        this.U = 0;
        Context context2 = getContext();
        C0230d c0230d = new C0230d(this);
        this.f14558B = c0230d;
        c0230d.f3488W = p137n7.a.f20019e;
        c0230d.i(false);
        c0230d.f3480J = false;
        this.f14559C = new D7.a(context2);
        H.c(context2, attributeSet, i10, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = p128m7.a.f19675o;
        H.d(context2, attributeSet, iArr, i10, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, R.style.Widget_Design_CollapsingToolbar);
        int i12 = typedArrayObtainStyledAttributes.getInt(4, 8388691);
        if (c0230d.j != i12) {
            c0230d.j = i12;
            c0230d.i(false);
        }
        c0230d.l(typedArrayObtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f14582z = dimensionPixelSize;
        this.f14581y = dimensionPixelSize;
        this.f14580x = dimensionPixelSize;
        this.f14579w = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f14579w = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f14581y = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f14580x = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f14582z = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.f14560D = typedArrayObtainStyledAttributes.getBoolean(20, true);
        setTitle(typedArrayObtainStyledAttributes.getText(18));
        c0230d.n(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        c0230d.k(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            c0230d.n(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            c0230d.k(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            int i13 = typedArrayObtainStyledAttributes.getInt(22, -1);
            if (i13 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i13 == 1) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i13 != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            }
            setTitleEllipsize(truncateAt);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11) && c0230d.f3516n != (colorStateListW2 = g.w(context2, typedArrayObtainStyledAttributes, 11))) {
            c0230d.f3516n = colorStateListW2;
            c0230d.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2) && c0230d.f3518o != (colorStateListW = g.w(context2, typedArrayObtainStyledAttributes, 2))) {
            c0230d.f3518o = colorStateListW;
            c0230d.i(false);
        }
        this.f14570N = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (typedArrayObtainStyledAttributes.hasValue(14) && (i11 = typedArrayObtainStyledAttributes.getInt(14, 1)) != c0230d.f3517n0) {
            c0230d.f3517n0 = i11;
            Bitmap bitmap = c0230d.f3481K;
            if (bitmap != null) {
                bitmap.recycle();
                c0230d.f3481K = null;
            }
            c0230d.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            c0230d.f3487V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(21, 0));
            c0230d.i(false);
        }
        this.f14567K = typedArrayObtainStyledAttributes.getInt(15, 600);
        this.f14568L = p050e8.b.T(context2, R.attr.motionEasingStandardInterpolator, p137n7.a.f20017c);
        this.f14569M = p050e8.b.T(context2, R.attr.motionEasingStandardInterpolator, p137n7.a.f20018d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(19, 0));
        this.f14575s = typedArrayObtainStyledAttributes.getResourceId(23, -1);
        this.T = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f14573V = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        B b5 = new B(27, this);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(this, b5);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setScrimsShown(boolean z10, boolean z11) {
        TimeInterpolator timeInterpolator;
        if (this.f14565I != z10) {
            if (z11) {
                int i10 = z10 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.f14566J;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f14566J = valueAnimator2;
                    if (i10 > this.f14564H) {
                        timeInterpolator = this.f14568L;
                    } else {
                        timeInterpolator = this.f14569M;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f14566J.addUpdateListener(new C0150y(8, this));
                } else if (valueAnimator.isRunning()) {
                    this.f14566J.cancel();
                }
                this.f14566J.setDuration(this.f14567K);
                this.f14566J.setIntValues(this.f14564H, i10);
                this.f14566J.start();
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f14565I = z10;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        p148o7.d dVar = new p148o7.d(-1, -1);
        dVar.f20355a = 0;
        dVar.f20356b = 0.5f;
        return dVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p148o7.d dVar = new p148o7.d(layoutParams);
        dVar.f20355a = 0;
        dVar.f20356b = 0.5f;
        return dVar;
    }
}
