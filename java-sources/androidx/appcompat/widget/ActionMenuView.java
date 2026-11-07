package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import i7.D;
import p140o.i;
import p140o.j;
import p140o.k;
import p140o.m;
import p140o.v;
import p140o.y;
import p151p.C1240f;
import p151p.C1246i;
import p151p.C1250k;
import p151p.C1254m;
import p151p.C1256n;
import p151p.C1268t0;
import p151p.InterfaceC1252l;
import p151p.InterfaceC1258o;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements j, y {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public k f11475G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Context f11476H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f11477I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f11478J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1250k f11479K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public v f11480L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public i f11481M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f11482N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f11483O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f11484P;
    public final int Q;
    public InterfaceC1258o R;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static C1254m j() {
        C1254m c1254m = new C1254m(-2, -2);
        c1254m.f20734a = false;
        ((LinearLayout.LayoutParams) c1254m).gravity = 16;
        return c1254m;
    }

    public static C1254m k(ViewGroup.LayoutParams layoutParams) {
        C1254m c1254m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C1254m) {
            C1254m c1254m2 = (C1254m) layoutParams;
            c1254m = new C1254m(c1254m2);
            c1254m.f20734a = c1254m2.f20734a;
        } else {
            c1254m = new C1254m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1254m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1254m).gravity = 16;
        }
        return c1254m;
    }

    @Override // p140o.y
    public final void b(k kVar) {
        this.f11475G = kVar;
    }

    @Override // p140o.j
    public final boolean c(m mVar) {
        return this.f11475G.q(mVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1254m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C1268t0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final C1268t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1254m(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f11475G == null) {
            Context context = getContext();
            k kVar = new k(context);
            this.f11475G = kVar;
            kVar.f20138e = new C1256n(0, this);
            C1250k c1250k = new C1250k(context);
            this.f11479K = c1250k;
            c1250k.f20694D = true;
            c1250k.f20695E = true;
            v d5 = this.f11480L;
            if (d5 == null) {
                d5 = new D(9);
            }
            c1250k.f20711v = d5;
            this.f11475G.b(c1250k, this.f11476H);
            C1250k c1250k2 = this.f11479K;
            c1250k2.f20714y = this;
            this.f11475G = c1250k2.f20709t;
        }
        return this.f11475G;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1250k c1250k = this.f11479K;
        C1246i c1246i = c1250k.f20691A;
        if (c1246i != null) {
            return c1246i.getDrawable();
        }
        if (c1250k.f20693C) {
            return c1250k.f20692B;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f11477I;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C1268t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i10) {
        boolean zB = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC1252l)) {
            zB = ((InterfaceC1252l) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof InterfaceC1252l)) ? zB : ((InterfaceC1252l) childAt2).d() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1250k c1250k = this.f11479K;
        if (c1250k != null) {
            c1250k.e(false);
            if (this.f11479K.g()) {
                this.f11479K.d();
                this.f11479K.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1250k c1250k = this.f11479K;
        if (c1250k != null) {
            c1250k.d();
            C1240f c1240f = c1250k.f20702L;
            if (c1240f == null || !c1240f.b()) {
                return;
            }
            c1240f.f20204i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f11482N) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = q1.f20766a;
        boolean z12 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C1254m c1254m = (C1254m) childAt.getLayoutParams();
                if (c1254m.f20734a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1254m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1254m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1254m).leftMargin) + ((LinearLayout.LayoutParams) c1254m).rightMargin;
                    l(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C1254m c1254m2 = (C1254m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1254m2.f20734a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c1254m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1254m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C1254m c1254m3 = (C1254m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1254m3.f20734a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) c1254m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1254m3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        k kVar;
        boolean z10 = this.f11482N;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f11482N = z11;
        if (z10 != z11) {
            this.f11483O = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f11482N && (kVar = this.f11475G) != null && size != this.f11483O) {
            this.f11483O = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f11482N || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                C1254m c1254m = (C1254m) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) c1254m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1254m).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f11484P;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z12 = false;
        int i24 = 0;
        long j = 0;
        while (true) {
            i12 = this.Q;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                C1254m c1254m2 = (C1254m) childAt.getLayoutParams();
                c1254m2.f20739f = false;
                c1254m2.f20736c = 0;
                c1254m2.f20735b = 0;
                c1254m2.f20737d = false;
                ((LinearLayout.LayoutParams) c1254m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1254m2).rightMargin = 0;
                c1254m2.f20738e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = c1254m2.f20734a ? 1 : i19;
                C1254m c1254m3 = (C1254m) childAt.getLayoutParams();
                int i28 = i19;
                i14 = i21;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i26, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i27 <= 0 || (z14 && i27 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                c1254m3.f20737d = !c1254m3.f20734a && z15;
                c1254m3.f20735b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (c1254m2.f20737d) {
                    i24++;
                }
                if (c1254m2.f20734a) {
                    z12 = true;
                }
                i19 = i28 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j |= (long) (1 << i23);
                }
            }
            i23++;
            size3 = i25;
            paddingBottom = i26;
            i21 = i14;
        }
        int i29 = size3;
        int i30 = i19;
        int i31 = i21;
        boolean z16 = z12 && i22 == 2;
        int i32 = i30;
        boolean z17 = false;
        while (true) {
            if (i24 <= 0 || i32 <= 0) {
                i13 = iMax;
                break;
            }
            int i33 = Integer.MAX_VALUE;
            long j10 = 0;
            int i34 = 0;
            int i35 = 0;
            while (i35 < childCount2) {
                int i36 = iMax;
                C1254m c1254m4 = (C1254m) getChildAt(i35).getLayoutParams();
                boolean z18 = z16;
                if (c1254m4.f20737d) {
                    int i37 = c1254m4.f20735b;
                    if (i37 < i33) {
                        j10 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j10 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                z16 = z18;
                iMax = i36;
            }
            i13 = iMax;
            boolean z19 = z16;
            j |= j10;
            if (i34 > i32) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                C1254m c1254m5 = (C1254m) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j11 = 1 << i39;
                if ((j10 & j11) != 0) {
                    if (z19 && c1254m5.f20738e) {
                        r11 = 1;
                        r11 = 1;
                        if (i32 == 1) {
                            childAt2.setPadding(i12 + i31, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1254m5.f20735b += r11;
                    c1254m5.f20739f = r11;
                    i32--;
                } else if (c1254m5.f20735b == i38) {
                    j |= j11;
                }
                i39++;
                z12 = z20;
            }
            z16 = z19;
            iMax = i13;
            z17 = true;
        }
        boolean z21 = !z12 && i22 == 1;
        if (i32 > 0 && j != 0 && (i32 < i22 - 1 || z21 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z21) {
                if ((j & 1) != 0 && !((C1254m) getChildAt(0).getLayoutParams()).f20738e) {
                    fBitCount -= 0.5f;
                }
                int i40 = childCount2 - 1;
                if ((j & ((long) (1 << i40))) != 0 && !((C1254m) getChildAt(i40).getLayoutParams()).f20738e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i32 * i31) / fBitCount) : 0;
            boolean z22 = z17;
            for (int i42 = 0; i42 < childCount2; i42++) {
                if ((j & ((long) (1 << i42))) != 0) {
                    View childAt3 = getChildAt(i42);
                    C1254m c1254m6 = (C1254m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1254m6.f20736c = i41;
                        c1254m6.f20739f = true;
                        if (i42 == 0 && !c1254m6.f20738e) {
                            ((LinearLayout.LayoutParams) c1254m6).leftMargin = (-i41) / 2;
                        }
                        z22 = true;
                    } else if (c1254m6.f20734a) {
                        c1254m6.f20736c = i41;
                        c1254m6.f20739f = true;
                        ((LinearLayout.LayoutParams) c1254m6).rightMargin = (-i41) / 2;
                        z22 = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) c1254m6).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1254m6).rightMargin = i41 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = getChildAt(i43);
                C1254m c1254m7 = (C1254m) childAt4.getLayoutParams();
                if (c1254m7.f20739f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1254m7.f20735b * i31) + c1254m7.f20736c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i29);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f11479K.f20699I = z10;
    }

    public void setMenuCallbacks(v vVar, i iVar) {
        this.f11480L = vVar;
        this.f11481M = iVar;
    }

    public void setOnMenuItemClickListener(InterfaceC1258o interfaceC1258o) {
        this.R = interfaceC1258o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1250k c1250k = this.f11479K;
        C1246i c1246i = c1250k.f20691A;
        if (c1246i != null) {
            c1246i.setImageDrawable(drawable);
        } else {
            c1250k.f20693C = true;
            c1250k.f20692B = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f11478J = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f11477I != i10) {
            this.f11477I = i10;
            if (i10 == 0) {
                this.f11476H = getContext();
            } else {
                this.f11476H = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C1250k c1250k) {
        this.f11479K = c1250k;
        c1250k.f20714y = this;
        this.f11475G = c1250k.f20709t;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f11484P = (int) (56.0f * f3);
        this.Q = (int) (f3 * 4.0f);
        this.f11476H = context;
        this.f11477I = 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1254m(getContext(), attributeSet);
    }
}
