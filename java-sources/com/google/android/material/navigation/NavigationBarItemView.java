package com.google.android.material.navigation;

import I1.S;
import K7.b;
import K7.c;
import K7.d;
import R7.f;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.K1;
import java.util.WeakHashMap;
import p017b7.g;
import p140o.m;
import p140o.x;
import p159p7.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarItemView extends FrameLayout implements x {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f15011a0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final f f15012b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final d f15013c0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15014A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15015B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final FrameLayout f15016C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final View f15017D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f15018E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ViewGroup f15019F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final TextView f15020G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final TextView f15021H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15022I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f15023J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public m f15024K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ColorStateList f15025L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Drawable f15026M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Drawable f15027N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ValueAnimator f15028O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public f f15029P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f15030V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public a f15031W;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15032r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f15033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f15034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15035u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f15038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f15039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f15040z;

    static {
        int i10 = 11;
        f15012b0 = new f(i10);
        f15013c0 = new d(i10);
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.f15032r = false;
        this.f15022I = -1;
        this.f15023J = 0;
        this.f15029P = f15012b0;
        this.Q = 0.0f;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.f15030V = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f15016C = (FrameLayout) findViewById(com.ayah.R.id.navigation_bar_item_icon_container);
        this.f15017D = findViewById(com.ayah.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.ayah.R.id.navigation_bar_item_icon_view);
        this.f15018E = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.ayah.R.id.navigation_bar_item_labels_group);
        this.f15019F = viewGroup;
        TextView textView = (TextView) findViewById(com.ayah.R.id.navigation_bar_item_small_label_view);
        this.f15020G = textView;
        TextView textView2 = (TextView) findViewById(com.ayah.R.id.navigation_bar_item_large_label_view);
        this.f15021H = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f15035u = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f15036v = viewGroup.getPaddingBottom();
        this.f15037w = getResources().getDimensionPixelSize(com.ayah.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = S.f3689a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        b(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new b(0, this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static void f(TextView textView, int i10) {
        int iRound;
        textView.setTextAppearance(i10);
        Context context = textView.getContext();
        if (i10 == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p128m7.a.f19663e0);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public static void g(View view, float f3, float f7, int i10) {
        view.setScaleX(f3);
        view.setScaleY(f7);
        view.setVisibility(i10);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f15016C;
        return frameLayout != null ? frameLayout : this.f15018E;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        a aVar = this.f15031W;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f15031W.f21010v.f21041b.f21028N.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f15018E.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    public static void j(int i10, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    @Override // p140o.x
    public final void a(m mVar) {
        this.f15024K = mVar;
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setIcon(mVar.getIcon());
        setTitle(mVar.f20166e);
        setId(mVar.f20162a);
        if (!TextUtils.isEmpty(mVar.f20176q)) {
            setContentDescription(mVar.f20176q);
        }
        CharSequence charSequence = !TextUtils.isEmpty(mVar.f20177r) ? mVar.f20177r : mVar.f20166e;
        if (Build.VERSION.SDK_INT > 23) {
            g.r0(this, charSequence);
        }
        setVisibility(mVar.isVisible() ? 0 : 8);
        this.f15032r = true;
    }

    public final void b(float f3, float f7) {
        this.f15038x = f3 - f7;
        this.f15039y = (f7 * 1.0f) / f3;
        this.f15040z = (f3 * 1.0f) / f7;
    }

    public final void c() {
        m mVar = this.f15024K;
        if (mVar != null) {
            setChecked(mVar.isChecked());
        }
    }

    public final void d() {
        Drawable rippleDrawable = this.f15034t;
        ColorStateList colorStateList = this.f15033s;
        FrameLayout frameLayout = this.f15016C;
        RippleDrawable rippleDrawable2 = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.R && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(O7.a.c(this.f15033s), null, activeIndicatorDrawable);
                z10 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(O7.a.a(this.f15033s), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = S.f3689a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f15016C;
        if (frameLayout != null && this.R) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f3, float f7) {
        View view = this.f15017D;
        if (view != null) {
            f fVar = this.f15029P;
            fVar.getClass();
            view.setScaleX(p137n7.a.a(0.4f, 1.0f, f3));
            view.setScaleY(fVar.g(f3, f7));
            view.setAlpha(p137n7.a.b(0.0f, 1.0f, f7 == 0.0f ? 0.8f : 0.0f, f7 == 0.0f ? 1.0f : 0.2f, f3));
        }
        this.Q = f3;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f15017D;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public a getBadge() {
        return this.f15031W;
    }

    public int getItemBackgroundResId() {
        return com.ayah.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // p140o.x
    public m getItemData() {
        return this.f15024K;
    }

    public int getItemDefaultMarginResId() {
        return com.ayah.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f15022I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f15019F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f15037w : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f15019F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i10) {
        View view = this.f15017D;
        if (view == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.S, i10 - (this.f15030V * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.U && this.f15014A == 2) ? iMin : this.T;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        m mVar = this.f15024K;
        if (mVar != null && mVar.isCheckable() && this.f15024K.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f15011a0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a aVar = this.f15031W;
        if (aVar != null && aVar.isVisible()) {
            m mVar = this.f15024K;
            CharSequence charSequence = mVar.f20166e;
            if (!TextUtils.isEmpty(mVar.f20176q)) {
                charSequence = this.f15024K.f20176q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f15031W.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) J1.f.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f4217a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) J1.d.g.f4211a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.ayah.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new F1.a(i10, 1, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f15017D;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.R = z10;
        d();
        View view = this.f15017D;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.T = i10;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f15037w != i10) {
            this.f15037w = i10;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f15030V = i10;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.U = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.S = i10;
        i(getWidth());
    }

    public void setBadge(a aVar) {
        a aVar2 = this.f15031W;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.f15018E;
        if (aVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f15031W != null) {
                setClipChildren(true);
                setClipToPadding(true);
                a aVar3 = this.f15031W;
                if (aVar3 != null) {
                    if (aVar3.d() != null) {
                        aVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.f15031W = null;
            }
        }
        this.f15031W = aVar;
        if (imageView == null || aVar == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        a aVar4 = this.f15031W;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar4.setBounds(rect);
        aVar4.i(imageView, null);
        if (aVar4.d() != null) {
            aVar4.d().setForeground(aVar4);
        } else {
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    public void setChecked(boolean z10) {
        TextView textView = this.f15021H;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f15020G;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f3 = z10 ? 1.0f : 0.0f;
        if (this.R && this.f15032r) {
            WeakHashMap weakHashMap = S.f3689a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f15028O;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f15028O = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.Q, f3);
                this.f15028O = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new c(this, f3));
                this.f15028O.setInterpolator(p050e8.b.T(getContext(), com.ayah.R.attr.motionEasingEmphasizedInterpolator, p137n7.a.f20016b));
                this.f15028O.setDuration(p050e8.b.S(getContext(), com.ayah.R.attr.motionDurationLong2, getResources().getInteger(com.ayah.R.integer.material_motion_duration_long_1)));
                this.f15028O.start();
            } else {
                e(f3, f3);
            }
        } else {
            e(f3, f3);
        }
        int i10 = this.f15014A;
        ViewGroup viewGroup = this.f15019F;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    h(getIconOrContainer(), this.f15035u, 49);
                    j(this.f15036v, viewGroup);
                    textView.setVisibility(0);
                } else {
                    h(getIconOrContainer(), this.f15035u, 17);
                    j(0, viewGroup);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i10 == 1) {
                j(this.f15036v, viewGroup);
                if (z10) {
                    h(getIconOrContainer(), (int) (this.f15035u + this.f15038x), 49);
                    g(textView, 1.0f, 1.0f, 0);
                    float f7 = this.f15039y;
                    g(textView2, f7, f7, 4);
                } else {
                    h(getIconOrContainer(), this.f15035u, 49);
                    float f10 = this.f15040z;
                    g(textView, f10, f10, 4);
                    g(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                h(getIconOrContainer(), this.f15035u, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f15015B) {
            if (z10) {
                h(getIconOrContainer(), this.f15035u, 49);
                j(this.f15036v, viewGroup);
                textView.setVisibility(0);
            } else {
                h(getIconOrContainer(), this.f15035u, 17);
                j(0, viewGroup);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            j(this.f15036v, viewGroup);
            if (z10) {
                h(getIconOrContainer(), (int) (this.f15035u + this.f15038x), 49);
                g(textView, 1.0f, 1.0f, 0);
                float f11 = this.f15039y;
                g(textView2, f11, f11, 4);
            } else {
                h(getIconOrContainer(), this.f15035u, 49);
                float f12 = this.f15040z;
                g(textView, f12, f12, 4);
                g(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f15020G.setEnabled(z10);
        this.f15021H.setEnabled(z10);
        this.f15018E.setEnabled(z10);
        Object obj = null;
        if (z10) {
            S.q(this, Build.VERSION.SDK_INT >= 24 ? new O8.c(K1.g(getContext())) : new O8.c(obj));
        } else {
            S.q(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f15026M) {
            return;
        }
        this.f15026M = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f15027N = drawable;
            ColorStateList colorStateList = this.f15025L;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f15018E.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.f15018E;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f15025L = colorStateList;
        if (this.f15024K == null || (drawable = this.f15027N) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f15027N.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : getContext().getDrawable(i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f15036v != i10) {
            this.f15036v = i10;
            c();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f15035u != i10) {
            this.f15035u = i10;
            c();
        }
    }

    public void setItemPosition(int i10) {
        this.f15022I = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f15033s = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f15014A != i10) {
            this.f15014A = i10;
            if (this.U && i10 == 2) {
                this.f15029P = f15013c0;
            } else {
                this.f15029P = f15012b0;
            }
            i(getWidth());
            c();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f15015B != z10) {
            this.f15015B = z10;
            c();
        }
    }

    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearanceActive(int i10) {
        this.f15023J = i10;
        TextView textView = this.f15021H;
        f(textView, i10);
        b(this.f15020G.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        setTextAppearanceActive(this.f15023J);
        TextView textView = this.f15021H;
        textView.setTypeface(textView.getTypeface(), z10 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) {
        TextView textView = this.f15020G;
        f(textView, i10);
        b(textView.getTextSize(), this.f15021H.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f15020G.setTextColor(colorStateList);
            this.f15021H.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f15020G.setText(charSequence);
        this.f15021H.setText(charSequence);
        m mVar = this.f15024K;
        if (mVar == null || TextUtils.isEmpty(mVar.f20176q)) {
            setContentDescription(charSequence);
        }
        m mVar2 = this.f15024K;
        if (mVar2 != null && !TextUtils.isEmpty(mVar2.f20177r)) {
            charSequence = this.f15024K.f20177r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            g.r0(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f15034t = drawable;
        d();
    }
}
