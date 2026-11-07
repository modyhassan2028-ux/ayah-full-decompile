package com.google.android.material.tabs;

import E2.C0150y;
import H1.d;
import H7.H;
import I1.I;
import I1.S;
import R7.i;
import W7.f;
import W7.g;
import Z2.e;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p181s2.s;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
@e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final d f15202o0 = new d(16);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f15203A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f15204B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f15205C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f15206D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ColorStateList f15207E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f15208F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15209G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final PorterDuff.Mode f15210H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final float f15211I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final float f15212J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f15213K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15214L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f15215M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f15216N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f15217O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f15218P;
    public int Q;
    public final int R;
    public int S;
    public int T;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f15219V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f15220W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15221a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f15222b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public a f15223c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TimeInterpolator f15224d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public W7.c f15225e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ArrayList f15226f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public g f15227g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ValueAnimator f15228h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ViewPager f15229i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public f f15230j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public W7.b f15231k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f15232l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f15233m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final H1.c f15234n0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f15236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f15237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final W7.e f15238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f15239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15242y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f15243z;

    public final class TabView extends LinearLayout {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final /* synthetic */ int f15244C = 0;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f15245A;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public b f15247r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public TextView f15248s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImageView f15249t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public View f15250u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p159p7.a f15251v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public View f15252w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f15253x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f15254y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Drawable f15255z;

        public TabView(Context context) {
            super(context);
            this.f15245A = 2;
            e(context);
            int i10 = TabLayout.this.f15239v;
            int i11 = TabLayout.this.f15240w;
            int i12 = TabLayout.this.f15241x;
            int i13 = TabLayout.this.f15242y;
            WeakHashMap weakHashMap = S.f3689a;
            setPaddingRelative(i10, i11, i12, i13);
            setGravity(17);
            setOrientation(!TabLayout.this.U ? 1 : 0);
            setClickable(true);
            S.q(this, Build.VERSION.SDK_INT >= 24 ? new O8.c(K1.g(getContext())) : new O8.c((Object) null));
        }

        private p159p7.a getBadge() {
            return this.f15251v;
        }

        private p159p7.a getOrCreateBadge() {
            if (this.f15251v == null) {
                this.f15251v = new p159p7.a(getContext(), null);
            }
            b();
            p159p7.a aVar = this.f15251v;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.f15251v != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f15250u;
                if (view != null) {
                    p159p7.a aVar = this.f15251v;
                    if (aVar != null) {
                        if (aVar.d() != null) {
                            aVar.d().setForeground(null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f15250u = null;
                }
            }
        }

        public final void b() {
            b bVar;
            if (this.f15251v != null) {
                if (this.f15252w != null) {
                    a();
                    return;
                }
                ImageView imageView = this.f15249t;
                if (imageView != null && (bVar = this.f15247r) != null && bVar.f15256a != null) {
                    if (this.f15250u == imageView) {
                        c(imageView);
                        return;
                    }
                    a();
                    ImageView imageView2 = this.f15249t;
                    if (this.f15251v == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    p159p7.a aVar = this.f15251v;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.i(imageView2, null);
                    if (aVar.d() != null) {
                        aVar.d().setForeground(aVar);
                    } else {
                        imageView2.getOverlay().add(aVar);
                    }
                    this.f15250u = imageView2;
                    return;
                }
                TextView textView = this.f15248s;
                if (textView == null || this.f15247r == null) {
                    a();
                    return;
                }
                if (this.f15250u == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.f15248s;
                if (this.f15251v == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                p159p7.a aVar2 = this.f15251v;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                aVar2.setBounds(rect2);
                aVar2.i(textView2, null);
                if (aVar2.d() != null) {
                    aVar2.d().setForeground(aVar2);
                } else {
                    textView2.getOverlay().add(aVar2);
                }
                this.f15250u = textView2;
            }
        }

        public final void c(View view) {
            p159p7.a aVar = this.f15251v;
            if (aVar == null || view != this.f15250u) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(view, null);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0020  */
        public final void d() {
            boolean z10;
            f();
            b bVar = this.f15247r;
            if (bVar == null) {
                z10 = false;
            } else {
                TabLayout tabLayout = bVar.f15261f;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != bVar.f15259d) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            setSelected(z10);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f15255z;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f15255z.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(Context context) {
            GradientDrawable gradientDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i10 = tabLayout.f15213K;
            if (i10 != 0) {
                Drawable drawableE = Y2.a.E(context, i10);
                this.f15255z = drawableE;
                if (drawableE != null && drawableE.isStateful()) {
                    this.f15255z.setState(getDrawableState());
                }
            } else {
                this.f15255z = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (tabLayout.f15207E != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = O7.a.a(tabLayout.f15207E);
                boolean z10 = tabLayout.f15222b0;
                if (z10) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z10 ? null : gradientDrawable3);
            }
            WeakHashMap weakHashMap = S.f3689a;
            setBackground(rippleDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i10;
            ViewParent parent;
            b bVar = this.f15247r;
            View view = bVar != null ? bVar.f15260e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f15252w;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f15252w);
                    }
                    addView(view);
                }
                this.f15252w = view;
                TextView textView = this.f15248s;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f15249t;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f15249t.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f15253x = textView2;
                if (textView2 != null) {
                    this.f15245A = textView2.getMaxLines();
                }
                this.f15254y = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f15252w;
                if (view3 != null) {
                    removeView(view3);
                    this.f15252w = null;
                }
                this.f15253x = null;
                this.f15254y = null;
            }
            if (this.f15252w == null) {
                if (this.f15249t == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.ayah.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f15249t = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f15248s == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.ayah.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f15248s = textView3;
                    addView(textView3);
                    this.f15245A = this.f15248s.getMaxLines();
                }
                TextView textView4 = this.f15248s;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.f15243z);
                if (!isSelected() || (i10 = tabLayout.f15204B) == -1) {
                    this.f15248s.setTextAppearance(tabLayout.f15203A);
                } else {
                    this.f15248s.setTextAppearance(i10);
                }
                ColorStateList colorStateList = tabLayout.f15205C;
                if (colorStateList != null) {
                    this.f15248s.setTextColor(colorStateList);
                }
                g(this.f15248s, this.f15249t, true);
                b();
                ImageView imageView3 = this.f15249t;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new c(this, imageView3));
                }
                TextView textView5 = this.f15248s;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new c(this, textView5));
                }
            } else {
                TextView textView6 = this.f15253x;
                if (textView6 != null || this.f15254y != null) {
                    g(textView6, this.f15254y, false);
                }
            }
            if (bVar == null || TextUtils.isEmpty(bVar.f15258c)) {
                return;
            }
            setContentDescription(bVar.f15258c);
        }

        public final void g(TextView textView, ImageView imageView, boolean z10) {
            boolean z11;
            Drawable drawable;
            b bVar = this.f15247r;
            Drawable drawableMutate = (bVar == null || (drawable = bVar.f15256a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                drawableMutate.setTintList(tabLayout.f15206D);
                PorterDuff.Mode mode = tabLayout.f15210H;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            b bVar2 = this.f15247r;
            CharSequence charSequence = bVar2 != null ? bVar2.f15257b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z11 = false;
                } else {
                    this.f15247r.getClass();
                    z11 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iG = (z11 && imageView.getVisibility() == 0) ? (int) H.g(getContext(), 8) : 0;
                if (tabLayout.U) {
                    if (iG != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iG);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iG != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iG;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            b bVar3 = this.f15247r;
            CharSequence charSequence2 = bVar3 != null ? bVar3.f15258c : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (zIsEmpty) {
                    charSequence = charSequence2;
                }
                p017b7.g.r0(this, charSequence);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f15248s, this.f15249t, this.f15252w};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f15248s, this.f15249t, this.f15252w};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public b getTab() {
            return this.f15247r;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            p159p7.a aVar = this.f15251v;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.f15251v.c());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) J1.f.a(0, 1, this.f15247r.f15259d, 1, false, isSelected()).f4217a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) J1.d.g.f4211a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.ayah.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.f15214L, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f15248s != null) {
                float f3 = tabLayout.f15211I;
                int i12 = this.f15245A;
                ImageView imageView = this.f15249t;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f15248s;
                    if (textView != null && textView.getLineCount() > 1) {
                        f3 = tabLayout.f15212J;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f15248s.getTextSize();
                int lineCount = this.f15248s.getLineCount();
                int maxLines = this.f15248s.getMaxLines();
                if (f3 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (tabLayout.T == 1 && f3 > textSize && lineCount == 1) {
                        Layout layout = this.f15248s.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f3 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f15248s.setTextSize(0, f3);
                    this.f15248s.setMaxLines(i12);
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f15247r == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            b bVar = this.f15247r;
            TabLayout tabLayout = bVar.f15261f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.h(bVar, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f15248s;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f15249t;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f15252w;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(b bVar) {
            if (bVar != this.f15247r) {
                this.f15247r = bVar;
                d();
            }
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public static ColorStateList e(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f15236s;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar != null && bVar.f15256a != null && !TextUtils.isEmpty(bVar.f15257b)) {
                return !this.U ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f15215M;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.T;
        if (i11 == 0 || i11 == 2) {
            return this.f15217O;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f15238u.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        W7.e eVar = this.f15238u;
        int childCount = eVar.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = eVar.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).f();
                    }
                }
                i11++;
            }
        }
    }

    public final void a(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        b bVar = (b) f15202o0.a();
        if (bVar == null) {
            bVar = new b();
            bVar.f15259d = -1;
        }
        bVar.f15261f = this;
        H1.c cVar = this.f15234n0;
        TabView tabView = cVar != null ? (TabView) cVar.a() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(bVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(bVar.f15258c)) {
            tabView.setContentDescription(bVar.f15257b);
        } else {
            tabView.setContentDescription(bVar.f15258c);
        }
        bVar.g = tabView;
        CharSequence charSequence = tabItem.f15199r;
        if (charSequence != null) {
            if (TextUtils.isEmpty(bVar.f15258c) && !TextUtils.isEmpty(charSequence)) {
                bVar.g.setContentDescription(charSequence);
            }
            bVar.f15257b = charSequence;
            TabView tabView2 = bVar.g;
            if (tabView2 != null) {
                tabView2.d();
            }
        }
        Drawable drawable = tabItem.f15200s;
        if (drawable != null) {
            bVar.f15256a = drawable;
            TabLayout tabLayout = bVar.f15261f;
            if (tabLayout.Q == 1 || tabLayout.T == 2) {
                tabLayout.k(true);
            }
            TabView tabView3 = bVar.g;
            if (tabView3 != null) {
                tabView3.d();
            }
        }
        int i10 = tabItem.f15201t;
        if (i10 != 0) {
            bVar.f15260e = LayoutInflater.from(bVar.g.getContext()).inflate(i10, (ViewGroup) bVar.g, false);
            TabView tabView4 = bVar.g;
            if (tabView4 != null) {
                tabView4.d();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            bVar.f15258c = tabItem.getContentDescription();
            TabView tabView5 = bVar.g;
            if (tabView5 != null) {
                tabView5.d();
            }
        }
        ArrayList arrayList = this.f15236s;
        boolean zIsEmpty = arrayList.isEmpty();
        int size = arrayList.size();
        if (bVar.f15261f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        bVar.f15259d = size;
        arrayList.add(size, bVar);
        int size2 = arrayList.size();
        int i11 = -1;
        for (int i12 = size + 1; i12 < size2; i12++) {
            if (((b) arrayList.get(i12)).f15259d == this.f15235r) {
                i11 = i12;
            }
            ((b) arrayList.get(i12)).f15259d = i12;
        }
        this.f15235r = i11;
        TabView tabView6 = bVar.g;
        tabView6.setSelected(false);
        tabView6.setActivated(false);
        int i13 = bVar.f15259d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.T == 1 && this.Q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f15238u.addView(tabView6, i13, layoutParams);
        if (zIsEmpty) {
            TabLayout tabLayout2 = bVar.f15261f;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout2.h(bVar, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        a(view);
    }

    public final void b(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = S.f3689a;
            if (isLaidOut()) {
                W7.e eVar = this.f15238u;
                int childCount = eVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (eVar.getChildAt(i11).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iD = d(i10, 0.0f);
                if (scrollX != iD) {
                    f();
                    this.f15228h0.setIntValues(scrollX, iD);
                    this.f15228h0.start();
                }
                ValueAnimator valueAnimator = eVar.f9648r;
                if (valueAnimator != null && valueAnimator.isRunning() && eVar.f9649s.f15235r != i10) {
                    eVar.f9648r.cancel();
                }
                eVar.d(i10, this.R, true);
                return;
            }
        }
        setScrollPosition(i10, 0.0f, true);
    }

    public final void c() {
        int i10 = this.T;
        int iMax = (i10 == 0 || i10 == 2) ? Math.max(0, this.f15218P - this.f15239v) : 0;
        WeakHashMap weakHashMap = S.f3689a;
        W7.e eVar = this.f15238u;
        eVar.setPaddingRelative(iMax, 0, 0, 0);
        int i11 = this.T;
        if (i11 == 0) {
            int i12 = this.Q;
            if (i12 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i12 == 1) {
                eVar.setGravity(1);
            } else if (i12 == 2) {
            }
            eVar.setGravity(8388611);
        } else if (i11 == 1 || i11 == 2) {
            if (this.Q == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            eVar.setGravity(1);
        }
        k(true);
    }

    public final int d(int i10, float f3) {
        W7.e eVar;
        View childAt;
        int i11 = this.T;
        if ((i11 != 0 && i11 != 2) || (childAt = (eVar = this.f15238u).getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < eVar.getChildCount() ? eVar.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f3);
        WeakHashMap weakHashMap = S.f3689a;
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    public final void f() {
        if (this.f15228h0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15228h0 = valueAnimator;
            valueAnimator.setInterpolator(this.f15224d0);
            this.f15228h0.setDuration(this.R);
            this.f15228h0.addUpdateListener(new C0150y(5, this));
        }
    }

    public final void g() {
        W7.e eVar = this.f15238u;
        int childCount = eVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.f15234n0.c(tabView);
            }
            requestLayout();
        }
        Iterator it = this.f15236s.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            it.remove();
            bVar.f15261f = null;
            bVar.g = null;
            bVar.f15256a = null;
            bVar.f15257b = null;
            bVar.f15258c = null;
            bVar.f15259d = -1;
            bVar.f15260e = null;
            f15202o0.c(bVar);
        }
        this.f15237t = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        b bVar = this.f15237t;
        if (bVar != null) {
            return bVar.f15259d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f15236s.size();
    }

    public int getTabGravity() {
        return this.Q;
    }

    public ColorStateList getTabIconTint() {
        return this.f15206D;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f15221a0;
    }

    public int getTabIndicatorGravity() {
        return this.S;
    }

    public int getTabMaxWidth() {
        return this.f15214L;
    }

    public int getTabMode() {
        return this.T;
    }

    public ColorStateList getTabRippleColor() {
        return this.f15207E;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f15208F;
    }

    public ColorStateList getTabTextColors() {
        return this.f15205C;
    }

    public final void h(b bVar, boolean z10) {
        b bVar2 = this.f15237t;
        ArrayList arrayList = this.f15226f0;
        if (bVar2 == bVar) {
            if (bVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((W7.c) arrayList.get(size)).getClass();
                }
                b(bVar.f15259d);
                return;
            }
            return;
        }
        int i10 = bVar != null ? bVar.f15259d : -1;
        if (z10) {
            if ((bVar2 == null || bVar2.f15259d == -1) && i10 != -1) {
                setScrollPosition(i10, 0.0f, true);
            } else {
                b(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f15237t = bVar;
        if (bVar2 != null && bVar2.f15261f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((W7.c) arrayList.get(size2)).getClass();
            }
        }
        if (bVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((g) ((W7.c) arrayList.get(size3))).f9653a.setCurrentItem(bVar.f15259d);
            }
        }
    }

    public final void i(int i10, float f3, boolean z10, boolean z11, boolean z12) {
        float f7 = i10 + f3;
        int iRound = Math.round(f7);
        if (iRound >= 0) {
            W7.e eVar = this.f15238u;
            if (iRound >= eVar.getChildCount()) {
                return;
            }
            if (z11) {
                eVar.f9649s.f15235r = Math.round(f7);
                ValueAnimator valueAnimator = eVar.f9648r;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.f9648r.cancel();
                }
                eVar.c(eVar.getChildAt(i10), eVar.getChildAt(i10 + 1), f3);
            }
            ValueAnimator valueAnimator2 = this.f15228h0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15228h0.cancel();
            }
            int iD = d(i10, f3);
            int scrollX = getScrollX();
            boolean z13 = (i10 < getSelectedTabPosition() && iD >= scrollX) || (i10 > getSelectedTabPosition() && iD <= scrollX) || i10 == getSelectedTabPosition();
            WeakHashMap weakHashMap = S.f3689a;
            if (getLayoutDirection() == 1) {
                z13 = (i10 < getSelectedTabPosition() && iD <= scrollX) || (i10 > getSelectedTabPosition() && iD >= scrollX) || i10 == getSelectedTabPosition();
            }
            if (z13 || this.f15233m0 == 1 || z12) {
                if (i10 < 0) {
                    iD = 0;
                }
                scrollTo(iD, 0);
            }
            if (z10) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void j(ViewPager viewPager, boolean z10, boolean z11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f15229i0;
        if (viewPager2 != null) {
            f fVar = this.f15230j0;
            if (fVar != null && (arrayList2 = viewPager2.U) != null) {
                arrayList2.remove(fVar);
            }
            W7.b bVar = this.f15231k0;
            if (bVar != null && (arrayList = this.f15229i0.f13024a0) != null) {
                arrayList.remove(bVar);
            }
        }
        g gVar = this.f15227g0;
        ArrayList arrayList3 = this.f15226f0;
        if (gVar != null) {
            arrayList3.remove(gVar);
            this.f15227g0 = null;
        }
        if (viewPager != null) {
            this.f15229i0 = viewPager;
            if (this.f15230j0 == null) {
                this.f15230j0 = new f(this);
            }
            f fVar2 = this.f15230j0;
            fVar2.f9652c = 0;
            fVar2.f9651b = 0;
            if (viewPager.U == null) {
                viewPager.U = new ArrayList();
            }
            viewPager.U.add(fVar2);
            g gVar2 = new g(viewPager);
            this.f15227g0 = gVar2;
            if (!arrayList3.contains(gVar2)) {
                arrayList3.add(gVar2);
            }
            viewPager.getAdapter();
            if (this.f15231k0 == null) {
                this.f15231k0 = new W7.b(this);
            }
            W7.b bVar2 = this.f15231k0;
            bVar2.getClass();
            if (viewPager.f13024a0 == null) {
                viewPager.f13024a0 = new ArrayList();
            }
            viewPager.f13024a0.add(bVar2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f15229i0 = null;
            g();
        }
        this.f15232l0 = z11;
    }

    public final void k(boolean z10) {
        int i10 = 0;
        while (true) {
            W7.e eVar = this.f15238u;
            if (i10 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.T == 1 && this.Q == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.D(this);
        if (this.f15229i0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                j((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f15232l0) {
            setupWithViewPager(null);
            this.f15232l0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            W7.e eVar = this.f15238u;
            if (i10 >= eVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).f15255z) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.f15255z.draw(canvas);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) J1.e.a(1, getTabCount(), 1).f4215a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iRound = Math.round(H.g(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iG = this.f15216N;
            if (iG <= 0) {
                iG = (int) (size - H.g(getContext(), 56));
            }
            this.f15214L = iG;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.T;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        u0.B(this, f3);
    }

    public void setInlineLabel(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        int i10 = 0;
        while (true) {
            W7.e eVar = this.f15238u;
            if (i10 >= eVar.getChildCount()) {
                c();
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.U ? 1 : 0);
                TextView textView = tabView.f15253x;
                if (textView == null && tabView.f15254y == null) {
                    tabView.g(tabView.f15248s, tabView.f15249t, true);
                } else {
                    tabView.g(textView, tabView.f15254y, false);
                }
            }
            i10++;
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(W7.d dVar) {
        setOnTabSelectedListener((W7.c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f15228h0.addListener(animatorListener);
    }

    public void setScrollPosition(int i10, float f3, boolean z10) {
        setScrollPosition(i10, f3, z10, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f15208F = drawableMutate;
        int i10 = this.f15209G;
        if (i10 != 0) {
            drawableMutate.setTint(i10);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f15220W;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f15208F.getIntrinsicHeight();
        }
        this.f15238u.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f15209G = i10;
        Drawable drawable = this.f15208F;
        if (i10 != 0) {
            drawable.setTint(i10);
        } else {
            drawable.setTintList(null);
        }
        k(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.S != i10) {
            this.S = i10;
            WeakHashMap weakHashMap = S.f3689a;
            this.f15238u.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f15220W = i10;
        this.f15238u.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f15206D != colorStateList) {
            this.f15206D = colorStateList;
            ArrayList arrayList = this.f15236s;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TabView tabView = ((b) arrayList.get(i10)).g;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(s.e(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f15221a0 = i10;
        if (i10 == 0) {
            this.f15223c0 = new a();
            return;
        }
        if (i10 == 1) {
            this.f15223c0 = new W7.a(0);
        } else {
            if (i10 == 2) {
                this.f15223c0 = new W7.a(1);
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f15219V = z10;
        int i10 = W7.e.f9647t;
        W7.e eVar = this.f15238u;
        eVar.a(eVar.f9649s.getSelectedTabPosition());
        WeakHashMap weakHashMap = S.f3689a;
        eVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.T) {
            this.T = i10;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f15207E == colorStateList) {
            return;
        }
        this.f15207E = colorStateList;
        int i10 = 0;
        while (true) {
            W7.e eVar = this.f15238u;
            if (i10 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i11 = TabView.f15244C;
                ((TabView) childAt).e(context);
            }
            i10++;
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(s.e(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f15205C != colorStateList) {
            this.f15205C = colorStateList;
            ArrayList arrayList = this.f15236s;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TabView tabView = ((b) arrayList.get(i10)).g;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(Z2.a aVar) {
        g();
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f15222b0 == z10) {
            return;
        }
        this.f15222b0 = z10;
        int i10 = 0;
        while (true) {
            W7.e eVar = this.f15238u;
            if (i10 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i10);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i11 = TabView.f15244C;
                ((TabView) childAt).e(context);
            }
            i10++;
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        a(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(W7.c cVar) {
        W7.c cVar2 = this.f15225e0;
        ArrayList arrayList = this.f15226f0;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.f15225e0 = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    public void setScrollPosition(int i10, float f3, boolean z10, boolean z11) {
        i(i10, f3, z10, z11, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z10) {
        j(viewPager, z10, false);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, com.ayah.R.style.Widget_Design_TabLayout), attributeSet, i10);
        this.f15235r = -1;
        this.f15236s = new ArrayList();
        this.f15204B = -1;
        this.f15209G = 0;
        this.f15214L = Integer.MAX_VALUE;
        this.f15220W = -1;
        this.f15226f0 = new ArrayList();
        this.f15234n0 = new H1.c(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        W7.e eVar = new W7.e(this, context2);
        this.f15238u = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19661d0, i10, com.ayah.R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListD = A1.b.d(getBackground());
        if (colorStateListD != null) {
            i iVar = new i();
            iVar.m(colorStateListD);
            iVar.k(context2);
            WeakHashMap weakHashMap = S.f3689a;
            iVar.l(I.e(this));
            setBackground(iVar);
        }
        setSelectedTabIndicator(va.g.z(context2, typedArrayM, 5));
        setSelectedTabIndicatorColor(typedArrayM.getColor(8, 0));
        eVar.b(typedArrayM.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM.getDimensionPixelSize(16, 0);
        this.f15242y = dimensionPixelSize;
        this.f15241x = dimensionPixelSize;
        this.f15240w = dimensionPixelSize;
        this.f15239v = dimensionPixelSize;
        this.f15239v = typedArrayM.getDimensionPixelSize(19, dimensionPixelSize);
        this.f15240w = typedArrayM.getDimensionPixelSize(20, dimensionPixelSize);
        this.f15241x = typedArrayM.getDimensionPixelSize(18, dimensionPixelSize);
        this.f15242y = typedArrayM.getDimensionPixelSize(17, dimensionPixelSize);
        if (u0.z(context2, com.ayah.R.attr.isMaterial3Theme, false)) {
            this.f15243z = com.ayah.R.attr.textAppearanceTitleSmall;
        } else {
            this.f15243z = com.ayah.R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayM.getResourceId(24, com.ayah.R.style.TextAppearance_Design_Tab);
        this.f15203A = resourceId;
        int[] iArr = p073h.a.f16403z;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f15211I = dimensionPixelSize2;
            this.f15205C = va.g.w(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM.hasValue(22)) {
                this.f15204B = typedArrayM.getResourceId(22, resourceId);
            }
            int i11 = this.f15204B;
            if (i11 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i11, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListW = va.g.w(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListW != null) {
                        this.f15205C = e(this.f15205C.getDefaultColor(), colorStateListW.getColorForState(new int[]{R.attr.state_selected}, colorStateListW.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayM.hasValue(25)) {
                this.f15205C = va.g.w(context2, typedArrayM, 25);
            }
            if (typedArrayM.hasValue(23)) {
                this.f15205C = e(this.f15205C.getDefaultColor(), typedArrayM.getColor(23, 0));
            }
            this.f15206D = va.g.w(context2, typedArrayM, 3);
            this.f15210H = H.o(typedArrayM.getInt(4, -1), null);
            this.f15207E = va.g.w(context2, typedArrayM, 21);
            this.R = typedArrayM.getInt(6, 300);
            this.f15224d0 = p050e8.b.T(context2, com.ayah.R.attr.motionEasingEmphasizedInterpolator, p137n7.a.f20016b);
            this.f15215M = typedArrayM.getDimensionPixelSize(14, -1);
            this.f15216N = typedArrayM.getDimensionPixelSize(13, -1);
            this.f15213K = typedArrayM.getResourceId(0, 0);
            this.f15218P = typedArrayM.getDimensionPixelSize(1, 0);
            this.T = typedArrayM.getInt(15, 1);
            this.Q = typedArrayM.getInt(2, 0);
            this.U = typedArrayM.getBoolean(12, false);
            this.f15222b0 = typedArrayM.getBoolean(26, false);
            typedArrayM.recycle();
            Resources resources = getResources();
            this.f15212J = resources.getDimensionPixelSize(com.ayah.R.dimen.design_tab_text_size_2line);
            this.f15217O = resources.getDimensionPixelSize(com.ayah.R.dimen.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void setTabTextColors(int i10, int i11) {
        setTabTextColors(e(i10, i11));
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(Y2.a.E(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
