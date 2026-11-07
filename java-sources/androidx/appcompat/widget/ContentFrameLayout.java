package androidx.appcompat.widget;

import I1.Z;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p084i.n;
import p084i.x;
import p140o.k;
import p151p.C1240f;
import p151p.C1250k;
import p151p.InterfaceC1237d0;
import p151p.InterfaceC1239e0;
import p151p.i1;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TypedValue f11556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TypedValue f11557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TypedValue f11558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TypedValue f11559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TypedValue f11560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TypedValue f11561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f11562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InterfaceC1237d0 f11563y;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f11560v == null) {
            this.f11560v = new TypedValue();
        }
        return this.f11560v;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f11561w == null) {
            this.f11561w = new TypedValue();
        }
        return this.f11561w;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f11558t == null) {
            this.f11558t = new TypedValue();
        }
        return this.f11558t;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f11559u == null) {
            this.f11559u = new TypedValue();
        }
        return this.f11559u;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f11556r == null) {
            this.f11556r = new TypedValue();
        }
        return this.f11556r;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f11557s == null) {
            this.f11557s = new TypedValue();
        }
        return this.f11557s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1237d0 interfaceC1237d0 = this.f11563y;
        if (interfaceC1237d0 != null) {
            interfaceC1237d0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1250k c1250k;
        super.onDetachedFromWindow();
        InterfaceC1237d0 interfaceC1237d0 = this.f11563y;
        if (interfaceC1237d0 != null) {
            x xVar = ((n) interfaceC1237d0).f16620r;
            InterfaceC1239e0 interfaceC1239e0 = xVar.f16659I;
            if (interfaceC1239e0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1239e0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.f11470v).f20674a.f11705r;
                if (actionMenuView != null && (c1250k = actionMenuView.f11479K) != null) {
                    c1250k.d();
                    C1240f c1240f = c1250k.f20702L;
                    if (c1240f != null && c1240f.b()) {
                        c1240f.f20204i.dismiss();
                    }
                }
            }
            if (xVar.f16664N != null) {
                xVar.f16653C.getDecorView().removeCallbacks(xVar.f16665O);
                if (xVar.f16664N.isShowing()) {
                    try {
                        xVar.f16664N.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                xVar.f16664N = null;
            }
            Z z10 = xVar.f16666P;
            if (z10 != null) {
                z10.b();
            }
            k kVar = xVar.B(0).f16640h;
            if (kVar != null) {
                kVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f11562x;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f11559u : this.f11558t;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                iMakeMeasureSpec = i10;
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        iMakeMeasureSpec = i10;
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    iMakeMeasureSpec = i10;
                    z10 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i11;
        } else {
            TypedValue typedValue2 = z12 ? this.f11560v : this.f11561w;
            if (typedValue2 == null || (i14 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i11;
            } else {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i11;
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i11;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f11557s : this.f11556r;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        i13 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    i13 -= rect.left + rect.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC1237d0 interfaceC1237d0) {
        this.f11563y = interfaceC1237d0;
    }

    public void setDecorPadding(int i10, int i11, int i12, int i13) {
        this.f11562x.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11562x = new Rect();
    }
}
