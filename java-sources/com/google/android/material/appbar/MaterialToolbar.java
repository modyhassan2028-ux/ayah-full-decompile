package com.google.android.material.appbar;

import E2.C0140p;
import H7.H;
import I1.I;
import I1.S;
import R7.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p140o.k;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f14583t0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Integer f14584o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f14585p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f14586q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ImageView.ScaleType f14587r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Boolean f14588s0;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f14587r0;
    }

    public Integer getNavigationIconTint() {
        return this.f14584o0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof k;
        if (z10) {
            ((k) menu).y();
        }
        super.m(i10);
        if (z10) {
            ((k) menu).x();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u0.D(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        C0140p c0140p = H.f3449c;
        ImageView imageView2 = null;
        if (this.f14585p0 || this.f14586q0) {
            ArrayList arrayListK = H.k(this, getTitle());
            TextView textView = arrayListK.isEmpty() ? null : (TextView) Collections.min(arrayListK, c0140p);
            ArrayList arrayListK2 = H.k(this, getSubtitle());
            TextView textView2 = arrayListK2.isEmpty() ? null : (TextView) Collections.max(arrayListK2, c0140p);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f14585p0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f14586q0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt2 = getChildAt(i16);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f14588s0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f14587r0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        u0.B(this, f3);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f14588s0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f14588s0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f14587r0 != scaleType) {
            this.f14587r0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f14584o0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f14584o0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f14584o0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f14586q0 != z10) {
            this.f14586q0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f14585p0 != z10) {
            this.f14585p0 = z10;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListD;
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayM = H.m(context2, attributeSet, p128m7.a.f19644L, i10, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM.hasValue(2)) {
            setNavigationIconTint(typedArrayM.getColor(2, -1));
        }
        this.f14585p0 = typedArrayM.getBoolean(4, false);
        this.f14586q0 = typedArrayM.getBoolean(3, false);
        int i11 = typedArrayM.getInt(1, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f14583t0;
            if (i11 < scaleTypeArr.length) {
                this.f14587r0 = scaleTypeArr[i11];
            }
        }
        if (typedArrayM.hasValue(0)) {
            this.f14588s0 = Boolean.valueOf(typedArrayM.getBoolean(0, false));
        }
        typedArrayM.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListD = ColorStateList.valueOf(0);
        } else {
            colorStateListD = A1.b.d(background);
        }
        if (colorStateListD != null) {
            i iVar = new i();
            iVar.m(colorStateListD);
            iVar.k(context2);
            WeakHashMap weakHashMap = S.f3689a;
            iVar.l(I.e(this));
            setBackground(iVar);
        }
    }
}
