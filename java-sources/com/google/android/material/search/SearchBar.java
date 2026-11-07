package com.google.android.material.search;

import C6.b;
import H7.H;
import H8.e;
import I1.I;
import I1.S;
import K0.ViewOnAttachStateChangeListenerC0381z;
import P7.a;
import R7.i;
import R7.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p140o.k;
import p148o7.c;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ int f15115D0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final i f15116A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final AccessibilityManager f15117B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final b f15118C0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final TextView f15119o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f15120p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f15121q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e f15122r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Drawable f15123s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f15124t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f15125u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public View f15126v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Integer f15127w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Drawable f15128x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f15129y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f15130z0;

    public SearchBar(Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonJ = H.j(this);
        if (imageButtonJ == null) {
            return;
        }
        imageButtonJ.setClickable(!z10);
        imageButtonJ.setFocusable(!z10);
        Drawable background = imageButtonJ.getBackground();
        if (background != null) {
            this.f15128x0 = background;
        }
        imageButtonJ.setBackgroundDrawable(z10 ? null : this.f15128x0);
        x();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f15120p0 && this.f15126v0 == null && !(view instanceof ActionMenuView)) {
            this.f15126v0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return this.f15126v0;
    }

    public float getCompatElevation() {
        i iVar = this.f15116A0;
        if (iVar != null) {
            return iVar.f7325r.f7304m;
        }
        WeakHashMap weakHashMap = S.f3689a;
        return I.e(this);
    }

    public float getCornerSize() {
        return this.f15116A0.i();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.f15119o0.getHint();
    }

    public int getMenuResId() {
        return this.f15129y0;
    }

    public int getStrokeColor() {
        return this.f15116A0.f7325r.f7297d.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f15116A0.f7325r.j;
    }

    public CharSequence getText() {
        return this.f15119o0.getText();
    }

    public TextView getTextView() {
        return this.f15119o0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof k;
        if (z10) {
            ((k) menu).y();
        }
        super.m(i10);
        this.f15129y0 = i10;
        if (z10) {
            ((k) menu).x();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.C(this, this.f15116A0);
        if (this.f15121q0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i10 = marginLayoutParams.leftMargin;
            if (i10 == 0) {
                i10 = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i10;
            int i11 = marginLayoutParams.topMargin;
            if (i11 == 0) {
                i11 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i11;
            int i12 = marginLayoutParams.rightMargin;
            if (i12 != 0) {
                dimensionPixelSize = i12;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i13 = marginLayoutParams.bottomMargin;
            if (i13 != 0) {
                dimensionPixelSize2 = i13;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        y();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i10 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f15126v0;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i14 = measuredWidth + measuredWidth2;
            int measuredHeight = this.f15126v0.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i15 = measuredHeight + measuredHeight2;
            View view2 = this.f15126v0;
            WeakHashMap weakHashMap = S.f3689a;
            if (getLayoutDirection() == 1) {
                view2.layout(getMeasuredWidth() - i14, measuredHeight2, getMeasuredWidth() - measuredWidth2, i15);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i14, i15);
            }
        }
        x();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        View view = this.f15126v0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f6852r);
        setText(aVar.f6722t);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f6722t = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f15126v0;
        if (view2 != null) {
            removeView(view2);
            this.f15126v0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f15130z0 = z10;
        y();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        i iVar = this.f15116A0;
        if (iVar != null) {
            iVar.l(f3);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f15119o0.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int iB;
        if (this.f15124t0 && drawable != null) {
            Integer num = this.f15127w0;
            if (num != null) {
                iB = num.intValue();
            } else {
                iB = Y2.a.B(drawable == this.f15123s0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface, this);
            }
            drawable = drawable.mutate();
            drawable.setTint(iB);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f15125u0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f15122r0.getClass();
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f15116A0.r(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f3) {
        if (getStrokeWidth() != f3) {
            this.f15116A0.s(f3);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f15119o0.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void x() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z10 = getLayoutDirection() == 1;
        ImageButton imageButtonJ = H.j(this);
        if (imageButtonJ == null || !imageButtonJ.isClickable()) {
            width = 0;
        } else {
            width = z10 ? getWidth() - imageButtonJ.getLeft() : imageButtonJ.getRight();
        }
        ActionMenuView actionMenuViewH = H.h(this);
        if (actionMenuViewH != null) {
            right = z10 ? actionMenuViewH.getRight() : getWidth() - actionMenuViewH.getLeft();
        }
        float f3 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f3, 0.0f, -width, 0.0f);
    }

    public final void y() {
        if (getLayoutParams() instanceof c) {
            c cVar = (c) getLayoutParams();
            if (this.f15130z0) {
                if (cVar.f20352a == 0) {
                    cVar.f20352a = 53;
                }
            } else if (cVar.f20352a == 53) {
                cVar.f20352a = 0;
            }
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f15131x;

        public ScrollingViewBehavior() {
            this.f15131x = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, u1.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.f15131x && (view2 instanceof AppBarLayout)) {
                this.f15131x = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15131x = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public void setHint(int i10) {
        this.f15119o0.setHint(i10);
    }

    public void setText(int i10) {
        this.f15119o0.setText(i10);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_Material3_SearchBar), attributeSet, i10);
        this.f15129y0 = -1;
        this.f15118C0 = new b(9, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawableE = Y2.a.E(context2, getDefaultNavigationIconResource());
        this.f15123s0 = drawableE;
        e eVar = new e(13);
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.f15122r0 = eVar;
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.U, i10, R.style.Widget_Material3_SearchBar, new int[0]);
        o oVarA = o.d(context2, attributeSet, i10, R.style.Widget_Material3_SearchBar).a();
        int color = typedArrayM.getColor(3, 0);
        float dimension = typedArrayM.getDimension(6, 0.0f);
        this.f15121q0 = typedArrayM.getBoolean(4, true);
        this.f15130z0 = typedArrayM.getBoolean(5, true);
        boolean z10 = typedArrayM.getBoolean(8, false);
        this.f15125u0 = typedArrayM.getBoolean(7, false);
        this.f15124t0 = typedArrayM.getBoolean(12, true);
        if (typedArrayM.hasValue(9)) {
            this.f15127w0 = Integer.valueOf(typedArrayM.getColor(9, -1));
        }
        int resourceId = typedArrayM.getResourceId(0, -1);
        String string = typedArrayM.getString(1);
        String string2 = typedArrayM.getString(2);
        float dimension2 = typedArrayM.getDimension(11, -1.0f);
        int color2 = typedArrayM.getColor(10, 0);
        typedArrayM.recycle();
        if (!z10) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableE);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.f15120p0 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.f15119o0 = textView;
        WeakHashMap weakHashMap = S.f3689a;
        I.k(this, dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        if (getNavigationIcon() == null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        i iVar = new i(oVarA);
        this.f15116A0 = iVar;
        iVar.k(getContext());
        this.f15116A0.l(dimension);
        if (dimension2 >= 0.0f) {
            i iVar2 = this.f15116A0;
            iVar2.s(dimension2);
            iVar2.r(ColorStateList.valueOf(color2));
        }
        int iB = Y2.a.B(R.attr.colorControlHighlight, this);
        this.f15116A0.m(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
        i iVar3 = this.f15116A0;
        setBackground(new RippleDrawable(colorStateListValueOf, iVar3, iVar3));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f15117B0 = accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0381z(3, this));
        }
    }
}
