package androidx.appcompat.widget;

import I1.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p074h0.i;
import p151p.C1268t0;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int[] f11564A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable f11565B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11566C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11567D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f11568E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f11569F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f11576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f11578z;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1268t0;
    }

    public final void d(Canvas canvas, int i10) {
        this.f11565B.setBounds(getPaddingLeft() + this.f11569F, i10, (getWidth() - getPaddingRight()) - this.f11569F, this.f11567D + i10);
        this.f11565B.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.f11565B.setBounds(i10, getPaddingTop() + this.f11569F, this.f11566C + i10, (getHeight() - getPaddingBottom()) - this.f11569F);
        this.f11565B.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1268t0 generateDefaultLayoutParams() {
        int i10 = this.f11573u;
        if (i10 == 0) {
            return new C1268t0(-2, -2);
        }
        if (i10 == 1) {
            return new C1268t0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1268t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1268t0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f11571s < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f11571s;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f11571s == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f11572t;
        if (this.f11573u == 1 && (i10 = this.f11574v & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f11575w) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f11575w;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1268t0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f11571s;
    }

    public Drawable getDividerDrawable() {
        return this.f11565B;
    }

    public int getDividerPadding() {
        return this.f11569F;
    }

    public int getDividerWidth() {
        return this.f11566C;
    }

    public int getGravity() {
        return this.f11574v;
    }

    public int getOrientation() {
        return this.f11573u;
    }

    public int getShowDividers() {
        return this.f11568E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f11576x;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1268t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1268t0) {
            return new C1268t0((C1268t0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1268t0((ViewGroup.MarginLayoutParams) layoutParams) : new C1268t0(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.f11568E & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f11568E & 4) != 0;
        }
        if ((this.f11568E & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int bottom;
        if (this.f11565B == null) {
            return;
        }
        int i11 = 0;
        if (this.f11573u == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && i(i11)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1268t0) childAt.getLayoutParams())).topMargin) - this.f11567D);
                }
                i11++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f11567D;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1268t0) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = q1.f20766a;
        boolean z11 = getLayoutDirection() == 1;
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i11)) {
                C1268t0 c1268t0 = (C1268t0) childAt3.getLayoutParams();
                e(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1268t0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1268t0).leftMargin) - this.f11566C);
            }
            i11++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1268t0 c1268t1 = (C1268t0) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1268t1).leftMargin;
                    i10 = this.f11566C;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1268t1).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f11566C;
                right = left - i10;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        int i21;
        int paddingTop;
        int i22;
        int i23;
        int i24;
        int i25 = 8;
        char c10 = 2;
        if (this.f11573u == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i26 = i12 - i10;
            int paddingRight = i26 - getPaddingRight();
            int paddingRight2 = (i26 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i27 = this.f11574v;
            int i28 = i27 & 112;
            int i29 = 8388615 & i27;
            if (i28 != 16) {
                paddingTop = i28 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f11575w;
            } else {
                paddingTop = getPaddingTop() + (((i13 - i11) - this.f11575w) / 2);
            }
            int i30 = 0;
            while (i30 < virtualChildCount) {
                View childAt = getChildAt(i30);
                if (childAt != null && childAt.getVisibility() != i25) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C1268t0 c1268t0 = (C1268t0) childAt.getLayoutParams();
                    int i31 = ((LinearLayout.LayoutParams) c1268t0).gravity;
                    if (i31 < 0) {
                        i31 = i29;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i24 = ((LinearLayout.LayoutParams) c1268t0).leftMargin + paddingLeft2;
                        } else {
                            i22 = paddingRight - measuredWidth;
                            i23 = ((LinearLayout.LayoutParams) c1268t0).rightMargin;
                        }
                        if (i(i30)) {
                            paddingTop += this.f11567D;
                        }
                        int i32 = paddingTop + ((LinearLayout.LayoutParams) c1268t0).topMargin;
                        childAt.layout(i24, i32, measuredWidth + i24, i32 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1268t0).bottomMargin + i32;
                    } else {
                        i22 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c1268t0).leftMargin;
                        i23 = ((LinearLayout.LayoutParams) c1268t0).rightMargin;
                    }
                    i24 = i22 - i23;
                    if (i(i30)) {
                        paddingTop += this.f11567D;
                    }
                    int i33 = paddingTop + ((LinearLayout.LayoutParams) c1268t0).topMargin;
                    childAt.layout(i24, i33, measuredWidth + i24, i33 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1268t0).bottomMargin + i33;
                }
                i30++;
                c10 = c10;
                i25 = 8;
            }
            return;
        }
        boolean z11 = q1.f20766a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i34 = i13 - i11;
        int paddingBottom = i34 - getPaddingBottom();
        int paddingBottom2 = (i34 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i35 = this.f11574v;
        int i36 = 8388615 & i35;
        int i37 = i35 & 112;
        boolean z13 = this.f11570r;
        int[] iArr = this.f11578z;
        int[] iArr2 = this.f11564A;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i36, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f11575w;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f11575w) / 2);
        }
        if (z12) {
            i15 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i14 = 1;
            i15 = 0;
        }
        int i38 = 0;
        while (i38 < virtualChildCount2) {
            int i39 = (i14 * i38) + i15;
            View childAt2 = getChildAt(i39);
            if (childAt2 == null) {
                i16 = i15;
            } else {
                i16 = i15;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C1268t0 c1268t1 = (C1268t0) childAt2.getLayoutParams();
                    int i40 = paddingLeft;
                    if (z13) {
                        i17 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) c1268t1).height != -1 ? childAt2.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) c1268t1).gravity;
                        if (i18 < 0) {
                            i18 = i37;
                        }
                        i19 = i18 & 112;
                        if (i19 != 16) {
                            if (i19 != 48) {
                                i20 = i17 + ((LinearLayout.LayoutParams) c1268t1).topMargin;
                                if (baseline != -1) {
                                    i20 = (iArr[1] - baseline) + i20;
                                }
                            } else if (i19 != 80) {
                                i20 = i17;
                            } else {
                                i20 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c1268t1).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (i(i39)) {
                                i21 = i40 + this.f11566C;
                            } else {
                                i21 = i40;
                            }
                            int i41 = i21 + ((LinearLayout.LayoutParams) c1268t1).leftMargin;
                            childAt2.layout(i41, i20, i41 + measuredWidth2, i20 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1268t1).rightMargin + i41;
                        } else {
                            i20 = ((paddingBottom2 - measuredHeight3) / 2) + i17 + ((LinearLayout.LayoutParams) c1268t1).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c1268t1).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        if (i(i39)) {
                            i21 = i40 + this.f11566C;
                        } else {
                            i21 = i40;
                        }
                        int i42 = i21 + ((LinearLayout.LayoutParams) c1268t1).leftMargin;
                        childAt2.layout(i42, i20, i42 + measuredWidth2, i20 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1268t1).rightMargin + i42;
                    } else {
                        i17 = paddingTop2;
                    }
                    i18 = ((LinearLayout.LayoutParams) c1268t1).gravity;
                    if (i18 < 0) {
                        i18 = i37;
                    }
                    i19 = i18 & 112;
                    if (i19 != 16) {
                        if (i19 != 48) {
                            i20 = i17 + ((LinearLayout.LayoutParams) c1268t1).topMargin;
                            if (baseline != -1) {
                                i20 = (iArr[1] - baseline) + i20;
                            }
                        } else if (i19 != 80) {
                            i20 = i17;
                        } else {
                            i20 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c1268t1).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i39)) {
                            i21 = i40 + this.f11566C;
                        } else {
                            i21 = i40;
                        }
                        int i43 = i21 + ((LinearLayout.LayoutParams) c1268t1).leftMargin;
                        childAt2.layout(i43, i20, i43 + measuredWidth2, i20 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1268t1).rightMargin + i43;
                    } else {
                        i20 = ((paddingBottom2 - measuredHeight3) / 2) + i17 + ((LinearLayout.LayoutParams) c1268t1).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) c1268t1).bottomMargin;
                    }
                    i20 -= measuredHeight;
                    if (i(i39)) {
                        i21 = i40 + this.f11566C;
                    } else {
                        i21 = i40;
                    }
                    int i44 = i21 + ((LinearLayout.LayoutParams) c1268t1).leftMargin;
                    childAt2.layout(i44, i20, i44 + measuredWidth2, i20 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c1268t1).rightMargin + i44;
                }
                i38++;
                i15 = i16;
                paddingTop2 = i17;
            }
            i17 = paddingTop2;
            i38++;
            i15 = i16;
            paddingTop2 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:233:0x0501  */
    /* JADX WARN: Code duplicated, block: B:235:0x0505  */
    /* JADX WARN: Code duplicated, block: B:237:0x0526  */
    /* JADX WARN: Code duplicated, block: B:243:0x0536  */
    /* JADX WARN: Code duplicated, block: B:246:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0540  */
    /* JADX WARN: Code duplicated, block: B:250:0x0547 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054a  */
    /* JADX WARN: Code duplicated, block: B:366:0x079c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMax;
        int i15;
        int baseline;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        boolean z10;
        boolean z11;
        C1268t0 c1268t0;
        View view;
        int i20;
        int[] iArr2;
        int i21;
        int i22;
        boolean z12;
        int i23;
        int measuredHeight;
        boolean z13;
        boolean z14;
        int iMax2;
        int i24;
        int baseline2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z15;
        int i30;
        int i31;
        int i32;
        View view2;
        boolean z16;
        LinearLayoutCompat linearLayoutCompat = this;
        int i33 = -2;
        int iMax3 = 0;
        int i34 = 1073741824;
        int i35 = 8;
        if (linearLayoutCompat.f11573u == 1) {
            linearLayoutCompat.f11575w = 0;
            int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i36 = linearLayoutCompat.f11571s;
            boolean z17 = linearLayoutCompat.f11577y;
            int i37 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z18 = false;
            int i38 = 0;
            boolean z19 = false;
            boolean z20 = true;
            float f3 = 0.0f;
            int iMax6 = 0;
            while (i37 < virtualChildCount) {
                int i39 = mode;
                View childAt = linearLayoutCompat.getChildAt(i37);
                if (childAt == null) {
                    linearLayoutCompat.f11575w = linearLayoutCompat.f11575w;
                } else {
                    if (childAt.getVisibility() != i35) {
                        if (linearLayoutCompat.i(i37)) {
                            linearLayoutCompat.f11575w += linearLayoutCompat.f11567D;
                        }
                        C1268t0 c1268t1 = (C1268t0) childAt.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) c1268t1).weight;
                        f3 += f7;
                        if (mode2 == i34 && ((LinearLayout.LayoutParams) c1268t1).height == 0 && f7 > 0.0f) {
                            int i40 = linearLayoutCompat.f11575w;
                            linearLayoutCompat.f11575w = Math.max(i40, ((LinearLayout.LayoutParams) c1268t1).topMargin + i40 + ((LinearLayout.LayoutParams) c1268t1).bottomMargin);
                            view2 = childAt;
                            i29 = mode2;
                            i30 = i36;
                            z15 = z17;
                            i31 = i37;
                            z18 = true;
                            i32 = i39;
                        } else {
                            if (((LinearLayout.LayoutParams) c1268t1).height != 0 || f7 <= 0.0f) {
                                i28 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c1268t1).height = i33;
                                i28 = 0;
                            }
                            i29 = mode2;
                            z15 = z17;
                            i30 = i36;
                            i31 = i37;
                            i32 = i39;
                            linearLayoutCompat.measureChildWithMargins(childAt, i10, 0, i11, f3 == 0.0f ? linearLayoutCompat.f11575w : 0);
                            if (i28 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c1268t1).height = i28;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i41 = linearLayoutCompat.f11575w;
                            view2 = childAt;
                            linearLayoutCompat.f11575w = Math.max(i41, i41 + measuredHeight2 + ((LinearLayout.LayoutParams) c1268t1).topMargin + ((LinearLayout.LayoutParams) c1268t1).bottomMargin);
                            if (z15) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i30 >= 0 && i30 == i31 + 1) {
                            linearLayoutCompat.f11572t = linearLayoutCompat.f11575w;
                        }
                        if (i31 < i30 && ((LinearLayout.LayoutParams) c1268t1).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i32 == 1073741824 || ((LinearLayout.LayoutParams) c1268t1).width != -1) {
                            z16 = false;
                        } else {
                            z16 = true;
                            z19 = true;
                        }
                        int i42 = ((LinearLayout.LayoutParams) c1268t1).leftMargin + ((LinearLayout.LayoutParams) c1268t1).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i42;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z21 = z16;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i38, measuredState);
                        if (z20) {
                            i38 = iCombineMeasuredStates;
                            boolean z22 = ((LinearLayout.LayoutParams) c1268t1).width == -1;
                            if (((LinearLayout.LayoutParams) c1268t1).weight > 0.0f) {
                                if (!z21) {
                                    i42 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i42);
                            } else {
                                if (!z21) {
                                    i42 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i42);
                            }
                            z20 = z22;
                        } else {
                            i38 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c1268t1).weight > 0.0f) {
                            if (!z21) {
                                i42 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i42);
                        } else {
                            if (!z21) {
                                i42 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i42);
                        }
                        z20 = z22;
                    }
                    i37 = i31 + 1;
                    i36 = i30;
                    mode = i32;
                    z17 = z15;
                    mode2 = i29;
                    i33 = -2;
                    i34 = 1073741824;
                    i35 = 8;
                }
                i29 = mode2;
                i30 = i36;
                z15 = z17;
                i31 = i37;
                i32 = i39;
                i37 = i31 + 1;
                i36 = i30;
                mode = i32;
                z17 = z15;
                mode2 = i29;
                i33 = -2;
                i34 = 1073741824;
                i35 = 8;
            }
            int i43 = mode;
            int i44 = mode2;
            boolean z23 = z17;
            int i45 = i38;
            int i46 = i11;
            if (linearLayoutCompat.f11575w > 0 && linearLayoutCompat.i(virtualChildCount)) {
                linearLayoutCompat.f11575w += linearLayoutCompat.f11567D;
            }
            if (z23 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                linearLayoutCompat.f11575w = 0;
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View childAt2 = linearLayoutCompat.getChildAt(i47);
                    if (childAt2 == null) {
                        linearLayoutCompat.f11575w = linearLayoutCompat.f11575w;
                    } else if (childAt2.getVisibility() != 8) {
                        C1268t0 c1268t2 = (C1268t0) childAt2.getLayoutParams();
                        int i48 = linearLayoutCompat.f11575w;
                        linearLayoutCompat.f11575w = Math.max(i48, i48 + iMax6 + ((LinearLayout.LayoutParams) c1268t2).topMargin + ((LinearLayout.LayoutParams) c1268t2).bottomMargin);
                    }
                }
            }
            int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f11575w;
            linearLayoutCompat.f11575w = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i46, 0);
            int i49 = (iResolveSizeAndState & 16777215) - linearLayoutCompat.f11575w;
            if (z18 || (i49 != 0 && f3 > 0.0f)) {
                float f10 = linearLayoutCompat.f11576x;
                if (f10 > 0.0f) {
                    f3 = f10;
                }
                linearLayoutCompat.f11575w = 0;
                int iCombineMeasuredStates2 = i45;
                int i50 = 0;
                while (i50 < virtualChildCount) {
                    View childAt3 = linearLayoutCompat.getChildAt(i50);
                    if (childAt3.getVisibility() == 8) {
                        i50 = i50;
                    } else {
                        C1268t0 c1268t3 = (C1268t0) childAt3.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) c1268t3).weight;
                        if (f11 > 0.0f) {
                            int i51 = (int) ((i49 * f11) / f3);
                            f3 -= f11;
                            i49 -= i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) c1268t3).leftMargin + ((LinearLayout.LayoutParams) c1268t3).rightMargin, ((LinearLayout.LayoutParams) c1268t3).width);
                            if (((LinearLayout.LayoutParams) c1268t3).height == 0) {
                                i27 = 1073741824;
                                if (i44 == 1073741824) {
                                    if (i51 <= 0) {
                                        i51 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i51, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i51;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i27));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i52 = ((LinearLayout.LayoutParams) c1268t3).leftMargin + ((LinearLayout.LayoutParams) c1268t3).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i52;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i43 != 1073741824) {
                            i26 = -1;
                            if (((LinearLayout.LayoutParams) c1268t3).width == -1) {
                                measuredWidth2 = i52;
                            }
                        } else {
                            i26 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z24 = z20 && ((LinearLayout.LayoutParams) c1268t3).width == i26;
                        int i53 = linearLayoutCompat.f11575w;
                        linearLayoutCompat.f11575w = Math.max(i53, childAt3.getMeasuredHeight() + i53 + ((LinearLayout.LayoutParams) c1268t3).topMargin + ((LinearLayout.LayoutParams) c1268t3).bottomMargin);
                        z20 = z24;
                    }
                    i50++;
                }
                linearLayoutCompat.f11575w = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f11575w;
                i45 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z23 && i44 != 1073741824) {
                    for (int i54 = 0; i54 < virtualChildCount; i54++) {
                        View childAt4 = linearLayoutCompat.getChildAt(i54);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1268t0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z20 || i43 == 1073741824) {
                iMax4 = iMax3;
            }
            linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax4, linearLayoutCompat.getSuggestedMinimumWidth()), i10, i45), iResolveSizeAndState);
            if (z19) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                int i55 = 0;
                while (i55 < virtualChildCount) {
                    View childAt5 = linearLayoutCompat.getChildAt(i55);
                    if (childAt5.getVisibility() != 8) {
                        C1268t0 c1268t4 = (C1268t0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1268t4).width == -1) {
                            int i56 = ((LinearLayout.LayoutParams) c1268t4).height;
                            ((LinearLayout.LayoutParams) c1268t4).height = childAt5.getMeasuredHeight();
                            linearLayoutCompat.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i46, 0);
                            ((LinearLayout.LayoutParams) c1268t4).height = i56;
                        }
                    }
                    i55++;
                    i46 = i11;
                }
                return;
            }
            return;
        }
        int i57 = i10;
        linearLayoutCompat.f11575w = 0;
        int virtualChildCount2 = linearLayoutCompat.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i57);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (linearLayoutCompat.f11578z == null || linearLayoutCompat.f11564A == null) {
            linearLayoutCompat.f11578z = new int[4];
            linearLayoutCompat.f11564A = new int[4];
        }
        int[] iArr3 = linearLayoutCompat.f11578z;
        int[] iArr4 = linearLayoutCompat.f11564A;
        iArr3[3] = -1;
        char c10 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = linearLayoutCompat.f11570r;
        boolean z26 = linearLayoutCompat.f11577y;
        boolean z27 = mode3 == 1073741824;
        float f12 = 0.0f;
        boolean z28 = true;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i58 < virtualChildCount2) {
            char c11 = c10;
            View childAt6 = linearLayoutCompat.getChildAt(i58);
            if (childAt6 == null) {
                linearLayoutCompat.f11575w = linearLayoutCompat.f11575w;
                i19 = i58;
                i24 = i60;
                iArr2 = iArr3;
                iArr = iArr4;
                z10 = z25;
                z11 = z26;
            } else {
                int i61 = i59;
                if (childAt6.getVisibility() == 8) {
                    i57 = i10;
                    i19 = i58;
                    i24 = i60;
                    iArr = iArr4;
                    z10 = z25;
                    z11 = z26;
                    i59 = i61;
                    iArr2 = iArr3;
                } else {
                    if (linearLayoutCompat.i(i58)) {
                        linearLayoutCompat.f11575w += linearLayoutCompat.f11566C;
                    }
                    C1268t0 c1268t5 = (C1268t0) childAt6.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) c1268t5).weight;
                    f12 += f13;
                    int i62 = i58;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c1268t5).width == 0 && f13 > 0.0f) {
                        if (z27) {
                            linearLayoutCompat.f11575w = ((LinearLayout.LayoutParams) c1268t5).leftMargin + ((LinearLayout.LayoutParams) c1268t5).rightMargin + linearLayoutCompat.f11575w;
                        } else {
                            int i63 = linearLayoutCompat.f11575w;
                            linearLayoutCompat.f11575w = Math.max(i63, ((LinearLayout.LayoutParams) c1268t5).leftMargin + i63 + ((LinearLayout.LayoutParams) c1268t5).rightMargin);
                        }
                        if (z25) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            i20 = i61;
                            i19 = i62;
                            c1268t0 = c1268t5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i57 = i10;
                            i21 = i60;
                            i18 = iMax7;
                        } else {
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            z30 = true;
                            i20 = i61;
                            i19 = i62;
                            i22 = 1073741824;
                            c1268t0 = c1268t5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i57 = i10;
                            i21 = i60;
                            i18 = iMax7;
                        }
                        if (mode4 == i22 && ((LinearLayout.LayoutParams) c1268t0).height == -1) {
                            z12 = true;
                            z29 = true;
                        } else {
                            z12 = false;
                        }
                        i23 = ((LinearLayout.LayoutParams) c1268t0).topMargin + ((LinearLayout.LayoutParams) c1268t0).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i23;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z10) {
                            baseline2 = view.getBaseline();
                            z13 = z12;
                            if (baseline2 != -1) {
                                i25 = ((LinearLayout.LayoutParams) c1268t0).gravity;
                                if (i25 < 0) {
                                    i25 = linearLayoutCompat.f11574v;
                                }
                                int i64 = (((i25 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i64] = Math.max(iArr2[i64], baseline2);
                                iArr[i64] = Math.max(iArr[i64], measuredHeight - baseline2);
                            }
                        } else {
                            z13 = z12;
                        }
                        int iMax9 = Math.max(i20, measuredHeight);
                        if (z28 || ((LinearLayout.LayoutParams) c1268t0).height != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((LinearLayout.LayoutParams) c1268t0).weight > 0.0f) {
                            if (!z13) {
                                i23 = measuredHeight;
                            }
                            iMax7 = Math.max(i18, i23);
                            iMax2 = i21;
                        } else {
                            if (!z13) {
                                i23 = measuredHeight;
                            }
                            iMax2 = Math.max(i21, i23);
                            iMax7 = i18;
                        }
                        int i65 = iMax2;
                        i59 = iMax9;
                        i24 = i65;
                        z28 = z14;
                    } else {
                        if (((LinearLayout.LayoutParams) c1268t5).width != 0 || f13 <= 0.0f) {
                            i17 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c1268t5).width = -2;
                            i17 = 0;
                        }
                        iArr = iArr4;
                        i18 = iMax7;
                        i19 = i62;
                        z10 = z25;
                        z11 = z26;
                        int i66 = i17;
                        c1268t0 = c1268t5;
                        view = childAt6;
                        i20 = i61;
                        i57 = i10;
                        iArr2 = iArr3;
                        i21 = i60;
                        linearLayoutCompat.measureChildWithMargins(view, i57, f12 == 0.0f ? linearLayoutCompat.f11575w : 0, i11, 0);
                        if (i66 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c1268t0).width = i66;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z27) {
                            linearLayoutCompat.f11575w = ((LinearLayout.LayoutParams) c1268t0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c1268t0).rightMargin + linearLayoutCompat.f11575w;
                        } else {
                            int i67 = linearLayoutCompat.f11575w;
                            linearLayoutCompat.f11575w = Math.max(i67, i67 + measuredWidth3 + ((LinearLayout.LayoutParams) c1268t0).leftMargin + ((LinearLayout.LayoutParams) c1268t0).rightMargin);
                        }
                        if (z11) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i22 = 1073741824;
                    if (mode4 == i22) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i23 = ((LinearLayout.LayoutParams) c1268t0).topMargin + ((LinearLayout.LayoutParams) c1268t0).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i23;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z10) {
                        baseline2 = view.getBaseline();
                        z13 = z12;
                        if (baseline2 != -1) {
                            i25 = ((LinearLayout.LayoutParams) c1268t0).gravity;
                            if (i25 < 0) {
                                i25 = linearLayoutCompat.f11574v;
                            }
                            int i68 = (((i25 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i68] = Math.max(iArr2[i68], baseline2);
                            iArr[i68] = Math.max(iArr[i68], measuredHeight - baseline2);
                        }
                    } else {
                        z13 = z12;
                    }
                    int iMax10 = Math.max(i20, measuredHeight);
                    if (z28) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (((LinearLayout.LayoutParams) c1268t0).weight > 0.0f) {
                        if (!z13) {
                            i23 = measuredHeight;
                        }
                        iMax7 = Math.max(i18, i23);
                        iMax2 = i21;
                    } else {
                        if (!z13) {
                            i23 = measuredHeight;
                        }
                        iMax2 = Math.max(i21, i23);
                        iMax7 = i18;
                    }
                    int i69 = iMax2;
                    i59 = iMax10;
                    i24 = i69;
                    z28 = z14;
                }
            }
            i60 = i24;
            i58 = i19 + 1;
            c10 = c11;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z10;
            z26 = z11;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c12 = c10;
        boolean z31 = z25;
        boolean z32 = z26;
        int i70 = i59;
        int i71 = i60;
        int i72 = iMax7;
        if (linearLayoutCompat.f11575w > 0 && linearLayoutCompat.i(virtualChildCount2)) {
            linearLayoutCompat.f11575w += linearLayoutCompat.f11566C;
        }
        int i73 = iArr5[1];
        int iMax11 = (i73 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) ? i70 : Math.max(i70, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[c12]))));
        if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            linearLayoutCompat.f11575w = 0;
            for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                View childAt7 = linearLayoutCompat.getChildAt(i74);
                if (childAt7 == null) {
                    linearLayoutCompat.f11575w = linearLayoutCompat.f11575w;
                } else if (childAt7.getVisibility() != 8) {
                    C1268t0 c1268t6 = (C1268t0) childAt7.getLayoutParams();
                    if (z27) {
                        linearLayoutCompat.f11575w = ((LinearLayout.LayoutParams) c1268t6).leftMargin + iMax8 + ((LinearLayout.LayoutParams) c1268t6).rightMargin + linearLayoutCompat.f11575w;
                    } else {
                        int i75 = linearLayoutCompat.f11575w;
                        linearLayoutCompat.f11575w = Math.max(i75, i75 + iMax8 + ((LinearLayout.LayoutParams) c1268t6).leftMargin + ((LinearLayout.LayoutParams) c1268t6).rightMargin);
                    }
                }
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f11575w;
        linearLayoutCompat.f11575w = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i57, 0);
        int i76 = (iResolveSizeAndState2 & 16777215) - linearLayoutCompat.f11575w;
        if (z30 || (i76 != 0 && f12 > 0.0f)) {
            float f14 = linearLayoutCompat.f11576x;
            if (f14 > 0.0f) {
                f12 = f14;
            }
            iArr5[3] = -1;
            iArr5[c12] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c12] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            linearLayoutCompat.f11575w = 0;
            iMax11 = -1;
            int i77 = 0;
            while (i77 < virtualChildCount2) {
                View childAt8 = linearLayoutCompat.getChildAt(i77);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    C1268t0 c1268t7 = (C1268t0) childAt8.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c1268t7).weight;
                    if (f15 > 0.0f) {
                        int i78 = (int) ((i76 * f15) / f12);
                        f12 -= f15;
                        i76 -= i78;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) c1268t7).topMargin + ((LinearLayout.LayoutParams) c1268t7).bottomMargin, ((LinearLayout.LayoutParams) c1268t7).height);
                        if (((LinearLayout.LayoutParams) c1268t7).width == 0) {
                            i16 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i78 <= 0) {
                                    i78 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i78, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i16 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i78;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i16), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z27) {
                        linearLayoutCompat.f11575w = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1268t7).leftMargin + ((LinearLayout.LayoutParams) c1268t7).rightMargin + linearLayoutCompat.f11575w;
                    } else {
                        int i79 = linearLayoutCompat.f11575w;
                        linearLayoutCompat.f11575w = Math.max(i79, childAt8.getMeasuredWidth() + i79 + ((LinearLayout.LayoutParams) c1268t7).leftMargin + ((LinearLayout.LayoutParams) c1268t7).rightMargin);
                    }
                    boolean z33 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c1268t7).height == -1;
                    int i80 = ((LinearLayout.LayoutParams) c1268t7).topMargin + ((LinearLayout.LayoutParams) c1268t7).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i80;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z33) {
                        i80 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i71, i80);
                    if (z28) {
                        i15 = -1;
                        boolean z34 = ((LinearLayout.LayoutParams) c1268t7).height == -1;
                        if (!z31 && (baseline = childAt8.getBaseline()) != i15) {
                            int i81 = ((LinearLayout.LayoutParams) c1268t7).gravity;
                            if (i81 < 0) {
                                i81 = linearLayoutCompat.f11574v;
                            }
                            int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i82] = Math.max(iArr5[i82], baseline);
                            iArr6[i82] = Math.max(iArr6[i82], measuredHeight4 - baseline);
                        }
                        z28 = z34;
                        i71 = iMax12;
                    } else {
                        i15 = -1;
                    }
                    if (!z31) {
                    }
                    z28 = z34;
                    i71 = iMax12;
                }
                i77++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
            linearLayoutCompat.f11575w = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f11575w;
            int i83 = iArr5[1];
            if (i83 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) {
                i14 = 0;
            } else {
                i14 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i83, iArr5[c12]))));
            }
            iMax = i71;
        } else {
            iMax = Math.max(i71, i72);
            if (z32 && mode3 != 1073741824) {
                for (int i84 = 0; i84 < virtualChildCount2; i84++) {
                    View childAt9 = linearLayoutCompat.getChildAt(i84);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1268t0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
            i14 = 0;
        }
        if (!z28 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        linearLayoutCompat.setMeasuredDimension(i12 | (iCombineMeasuredStates3 & i13), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax11, linearLayoutCompat.getSuggestedMinimumHeight()), i11, iCombineMeasuredStates3 << 16));
        if (z29) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i85 = i14;
            while (i85 < virtualChildCount2) {
                View childAt10 = linearLayoutCompat.getChildAt(i85);
                if (childAt10.getVisibility() != 8) {
                    C1268t0 c1268t8 = (C1268t0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1268t8).height == -1) {
                        int i86 = ((LinearLayout.LayoutParams) c1268t8).width;
                        ((LinearLayout.LayoutParams) c1268t8).width = childAt10.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(childAt10, i57, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c1268t8).width = i86;
                    }
                }
                i85++;
                linearLayoutCompat = this;
                i57 = i10;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f11570r = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f11571s = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f11565B) {
            return;
        }
        this.f11565B = drawable;
        if (drawable != null) {
            this.f11566C = drawable.getIntrinsicWidth();
            this.f11567D = drawable.getIntrinsicHeight();
        } else {
            this.f11566C = 0;
            this.f11567D = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f11569F = i10;
    }

    public void setGravity(int i10) {
        if (this.f11574v != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f11574v = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f11574v;
        if ((8388615 & i12) != i11) {
            this.f11574v = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f11577y = z10;
    }

    public void setOrientation(int i10) {
        if (this.f11573u != i10) {
            this.f11573u = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f11568E) {
            requestLayout();
        }
        this.f11568E = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f11574v;
        if ((i12 & 112) != i11) {
            this.f11574v = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f11576x = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11570r = true;
        this.f11571s = -1;
        this.f11572t = 0;
        this.f11574v = 8388659;
        int[] iArr = p073h.a.f16393p;
        i iVarB = i.B(context, attributeSet, iArr, i10);
        S.n(this, context, iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f11576x = typedArray.getFloat(4, -1.0f);
        this.f11571s = typedArray.getInt(3, -1);
        this.f11577y = typedArray.getBoolean(7, false);
        setDividerDrawable(iVarB.r(5));
        this.f11568E = typedArray.getInt(8, 0);
        this.f11569F = typedArray.getDimensionPixelSize(6, 0);
        iVarB.C();
    }
}
