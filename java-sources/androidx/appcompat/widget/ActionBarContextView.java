package androidx.appcompat.widget;

import H7.ViewOnClickListenerC0238l;
import I1.S;
import I1.Z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ayah.R;
import p140o.k;
import p140o.y;
import p151p.C1240f;
import p151p.C1250k;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f11429A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f11430B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f11431C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f11432D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinearLayout f11433E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f11434F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f11435G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f11436H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f11437I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f11438J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f11439K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E7.b f11440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f11441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ActionMenuView f11442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1250k f11443u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Z f11445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f11448z;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(p130n.a aVar) {
        View view = this.f11430B;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f11439K, (ViewGroup) this, false);
            this.f11430B = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f11430B);
        }
        View viewFindViewById = this.f11430B.findViewById(R.id.action_mode_close_button);
        this.f11431C = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0238l(4, aVar));
        k kVarC = aVar.c();
        C1250k c1250k = this.f11443u;
        if (c1250k != null) {
            c1250k.d();
            C1240f c1240f = c1250k.f20702L;
            if (c1240f != null && c1240f.b()) {
                c1240f.f20204i.dismiss();
            }
        }
        C1250k c1250k2 = new C1250k(getContext());
        this.f11443u = c1250k2;
        c1250k2.f20694D = true;
        c1250k2.f20695E = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        kVarC.b(this.f11443u, this.f11441s);
        C1250k c1250k3 = this.f11443u;
        y yVar = c1250k3.f20714y;
        if (yVar == null) {
            y yVar2 = (y) c1250k3.f20710u.inflate(c1250k3.f20712w, (ViewGroup) this, false);
            c1250k3.f20714y = yVar2;
            yVar2.b(c1250k3.f20709t);
            c1250k3.e(true);
        }
        y yVar3 = c1250k3.f20714y;
        if (yVar != yVar3) {
            ((ActionMenuView) yVar3).setPresenter(c1250k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) yVar3;
        this.f11442t = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f11442t, layoutParams);
    }

    public final void d() {
        if (this.f11433E == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f11433E = linearLayout;
            this.f11434F = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f11435G = (TextView) this.f11433E.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f11436H;
            if (i10 != 0) {
                this.f11434F.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f11437I;
            if (i11 != 0) {
                this.f11435G.setTextAppearance(getContext(), i11);
            }
        }
        this.f11434F.setText(this.f11448z);
        this.f11435G.setText(this.f11429A);
        boolean zIsEmpty = TextUtils.isEmpty(this.f11448z);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f11429A);
        this.f11435G.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f11433E.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f11433E.getParent() == null) {
            addView(this.f11433E);
        }
    }

    public final void e() {
        removeAllViews();
        this.f11432D = null;
        this.f11442t = null;
        this.f11443u = null;
        View view = this.f11431C;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f11445w != null ? this.f11440r.f1974a : getVisibility();
    }

    public int getContentHeight() {
        return this.f11444v;
    }

    public CharSequence getSubtitle() {
        return this.f11429A;
    }

    public CharSequence getTitle() {
        return this.f11448z;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            Z z10 = this.f11445w;
            if (z10 != null) {
                z10.b();
            }
            super.setVisibility(i10);
        }
    }

    public final Z i(long j, int i10) {
        Z z10 = this.f11445w;
        if (z10 != null) {
            z10.b();
        }
        E7.b bVar = this.f11440r;
        if (i10 != 0) {
            Z zA = S.a(this);
            zA.a(0.0f);
            zA.c(j);
            ((ActionBarContextView) bVar.f1976c).f11445w = zA;
            bVar.f1974a = i10;
            zA.d(bVar);
            return zA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        Z zA2 = S.a(this);
        zA2.a(1.0f);
        zA2.c(j);
        ((ActionBarContextView) bVar.f1976c).f11445w = zA2;
        bVar.f1974a = i10;
        zA2.d(bVar);
        return zA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p073h.a.f16380a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1250k c1250k = this.f11443u;
        if (c1250k != null) {
            c1250k.f20698H = E6.k.b(c1250k.f20708s).c();
            k kVar = c1250k.f20709t;
            if (kVar != null) {
                kVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1250k c1250k = this.f11443u;
        if (c1250k != null) {
            c1250k.d();
            C1240f c1240f = this.f11443u.f20702L;
            if (c1240f == null || !c1240f.b()) {
                return;
            }
            c1240f.f20204i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f11447y = false;
        }
        if (!this.f11447y) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f11447y = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f11447y = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = q1.f20766a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f11430B;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11430B.getLayoutParams();
            int i14 = z12 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = z12 ? paddingRight - i14 : paddingRight + i14;
            int iG = g(i16, paddingTop, paddingTop2, this.f11430B, z12) + i16;
            paddingRight = z12 ? iG - i15 : iG + i15;
        }
        LinearLayout linearLayout = this.f11433E;
        if (linearLayout != null && this.f11432D == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f11433E, z12);
        }
        View view2 = this.f11432D;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z12);
        }
        int paddingLeft = z12 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f11442t;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f11444v;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f11430B;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11430B.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f11442t;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f11442t, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f11433E;
        if (linearLayout != null && this.f11432D == null) {
            if (this.f11438J) {
                this.f11433E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f11433E.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f11433E.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f11432D;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f11432D.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f11444v > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11446x = false;
        }
        if (!this.f11446x) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f11446x = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f11446x = false;
        return true;
    }

    public void setContentHeight(int i10) {
        this.f11444v = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f11432D;
        if (view2 != null) {
            removeView(view2);
        }
        this.f11432D = view;
        if (view != null && (linearLayout = this.f11433E) != null) {
            removeView(linearLayout);
            this.f11433E = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f11429A = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f11448z = charSequence;
        d();
        S.p(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f11438J) {
            requestLayout();
        }
        this.f11438J = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i10);
        E7.b bVar = new E7.b();
        bVar.f1976c = this;
        bVar.f1975b = false;
        this.f11440r = bVar;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f11441s = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f11441s = context;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p073h.a.f16383d, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = Y2.a.E(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        }
        setBackground(drawable);
        this.f11436H = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f11437I = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f11444v = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f11439K = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
