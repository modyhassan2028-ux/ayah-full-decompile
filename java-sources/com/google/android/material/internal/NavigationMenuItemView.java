package com.google.android.material.internal;

import H7.C0228b;
import I1.S;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p017b7.g;
import p140o.m;
import p140o.x;
import p151p.C1268t0;
import p244z1.j;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements x {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f14981a0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f14982M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f14983N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f14984O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f14985P;
    public final CheckedTextView Q;
    public FrameLayout R;
    public m S;
    public ColorStateList T;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Drawable f14986V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C0228b f14987W;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.R == null) {
                this.R = (FrameLayout) ((ViewStub) findViewById(com.ayah.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.R.removeAllViews();
            this.R.addView(view);
        }
    }

    @Override // p140o.x
    public final void a(m mVar) {
        StateListDrawable stateListDrawable;
        this.S = mVar;
        int i10 = mVar.f20162a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(mVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.ayah.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f14981a0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f3689a;
            setBackground(stateListDrawable);
        }
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setTitle(mVar.f20166e);
        setIcon(mVar.getIcon());
        setActionView(mVar.getActionView());
        setContentDescription(mVar.f20176q);
        g.r0(this, mVar.f20177r);
        m mVar2 = this.S;
        CharSequence charSequence = mVar2.f20166e;
        CheckedTextView checkedTextView = this.Q;
        if (charSequence == null && mVar2.getIcon() == null && this.S.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.R;
            if (frameLayout != null) {
                C1268t0 c1268t0 = (C1268t0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1268t0).width = -1;
                this.R.setLayoutParams(c1268t0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.R;
        if (frameLayout2 != null) {
            C1268t0 c1268t1 = (C1268t0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1268t1).width = -2;
            this.R.setLayoutParams(c1268t1);
        }
    }

    @Override // p140o.x
    public m getItemData() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        m mVar = this.S;
        if (mVar != null && mVar.isCheckable() && this.S.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14981a0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f14984O != z10) {
            this.f14984O = z10;
            this.f14987W.h(this.Q, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.Q;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f14985P) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.U) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.T);
            }
            int i10 = this.f14982M;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f14983N) {
            if (this.f14986V == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = j.f24770a;
                Drawable drawable2 = resources.getDrawable(com.ayah.R.drawable.navigation_empty_icon, theme);
                this.f14986V = drawable2;
                if (drawable2 != null) {
                    int i11 = this.f14982M;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f14986V;
        }
        this.Q.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.Q.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f14982M = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.T = colorStateList;
        this.U = colorStateList != null;
        m mVar = this.S;
        if (mVar != null) {
            setIcon(mVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.Q.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f14983N = z10;
    }

    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearance(int i10) {
        this.Q.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.Q.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.Q.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14985P = true;
        C0228b c0228b = new C0228b(1, this);
        this.f14987W = c0228b;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.ayah.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.ayah.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.ayah.R.id.design_menu_item_text);
        this.Q = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.o(checkedTextView, c0228b);
    }
}
