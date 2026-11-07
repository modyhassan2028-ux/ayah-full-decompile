package androidx.core.widget;

import E2.C0127i0;
import I1.C0257j;
import I1.C0262o;
import I1.C0269w;
import I1.I;
import I1.InterfaceC0261n;
import I1.InterfaceC0264q;
import I1.S;
import N1.d;
import N1.f;
import N1.g;
import N1.h;
import N1.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.a;
import p185s8.u0;
import p248z6.c;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0264q, InterfaceC0261n {
    public static final float T = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final f U = new f(0);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int[] f12348V = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12349A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f12350B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12351C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public VelocityTracker f12352D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f12353E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12354F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f12355G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f12356H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f12357I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f12358J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int[] f12359K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int[] f12360L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12361M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f12362N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public i f12363O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C0127i0 f12364P;
    public final C0262o Q;
    public float R;
    public final C0257j S;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f12365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f12366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f12367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final OverScroller f12368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final EdgeEffect f12369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EdgeEffect f12370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0269w f12371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12372y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12373z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private C0269w getScrollFeedbackProvider() {
        if (this.f12371x == null) {
            this.f12371x = new C0269w(this);
        }
        return this.f12371x;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // I1.InterfaceC0263p
    public final void a(View view, View view2, int i10, int i11) {
        C0127i0 c0127i0 = this.f12364P;
        if (i11 == 1) {
            c0127i0.f1682b = i10;
        } else {
            c0127i0.f1681a = i10;
        }
        this.Q.g(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // I1.InterfaceC0263p
    public final void b(View view, int i10, int i11, int[] iArr, int i12) {
        this.Q.c(i10, i11, i12, iArr, null);
    }

    public final boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f12367t;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(d(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.f12368u.isFinished()) {
            return;
        }
        this.f12368u.computeScrollOffset();
        int currY = this.f12368u.getCurrY();
        int i11 = currY - this.f12362N;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f12369v;
        EdgeEffect edgeEffect2 = this.f12370w;
        if (i11 <= 0 || a.I(edgeEffect) == 0.0f) {
            if (i11 < 0 && a.I(edgeEffect2) != 0.0f) {
                float f3 = height;
                iRound = Math.round(a.W(edgeEffect2, (i11 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (iRound != i11) {
                    edgeEffect2.finish();
                }
            }
            int i12 = i11;
            this.f12362N = currY;
            iArr = this.f12360L;
            iArr[1] = 0;
            this.Q.c(0, i12, 1, iArr, null);
            i10 = i12 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                g.a(this, Math.abs(this.f12368u.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                p(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i10 - scrollY2;
                iArr[1] = 0;
                this.Q.d(0, scrollY2, 0, i13, this.f12359K, 1, iArr);
                i10 = i13 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f12368u.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f12368u.getCurrVelocity());
                    }
                }
                this.f12368u.abortAnimation();
                w(1);
            }
            if (this.f12368u.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(a.W(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect.finish();
        }
        i11 -= iRound;
        int i14 = i11;
        this.f12362N = currY;
        iArr = this.f12360L;
        iArr[1] = 0;
        this.Q.c(0, i14, 1, iArr, null);
        i10 = i14 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            g.a(this, Math.abs(this.f12368u.getCurrVelocity()));
        }
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            p(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i15 = i10 - scrollY4;
            iArr[1] = 0;
            this.Q.d(0, scrollY4, 0, i15, this.f12359K, 1, iArr);
            i10 = i15 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f12368u.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f12368u.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f12368u.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f12368u.getCurrVelocity());
            }
            this.f12368u.abortAnimation();
            w(1);
        }
        if (this.f12368u.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final int d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || e(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f7, boolean z10) {
        return this.Q.a(f3, f7, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f7) {
        return this.Q.b(f3, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.Q.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.Q.d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f12369v;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f12370w;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean e(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f12367t.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : c(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : c(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // I1.InterfaceC0263p
    public final void f(int i10, View view) {
        C0127i0 c0127i0 = this.f12364P;
        if (i10 == 1) {
            c0127i0.f1682b = 0;
        } else {
            c0127i0.f1681a = 0;
        }
        w(i10);
    }

    @Override // I1.InterfaceC0264q
    public final void g(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(i13, i14, iArr);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0127i0 c0127i0 = this.f12364P;
        return c0127i0.f1682b | c0127i0.f1681a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.R == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.R = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.R;
    }

    public final void h(int i10) {
        if (getChildCount() > 0) {
            this.f12368u.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.Q.g(2, 1);
            this.f12362N = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                g.a(this, Math.abs(this.f12368u.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.Q.f(0);
    }

    @Override // I1.InterfaceC0263p
    public final void i(View view, int i10, int i11, int i12, int i13, int i14) {
        n(i13, i14, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.Q.f3768d;
    }

    @Override // I1.InterfaceC0263p
    public final boolean j(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final boolean k(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f12367t;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i10, int i11) {
        Rect rect = this.f12367t;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.Q.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12358J) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f12372y = (int) motionEvent.getY(i10);
            this.f12358J = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f12352D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12349A = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f12351C) {
            if (u0.t(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i10 = 9;
                width = (int) motionEvent.getX();
            } else if (u0.t(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * axisValue)), i10, motionEvent, width, 1, u0.t(motionEvent, 8194));
                if (i10 == 0) {
                    return true;
                }
                this.S.a(motionEvent, i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f12351C) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x9 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x9 < childAt.getLeft() || x9 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f12368u.isFinished()) {
                        z10 = false;
                    }
                    this.f12351C = z10;
                    velocityTracker = this.f12352D;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f12352D = null;
                    }
                } else {
                    this.f12372y = y10;
                    this.f12358J = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f12352D;
                    if (velocityTracker3 == null) {
                        this.f12352D = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f12352D.addMovement(motionEvent);
                    this.f12368u.computeScrollOffset();
                    if (!v(motionEvent) && this.f12368u.isFinished()) {
                        z10 = false;
                    }
                    this.f12351C = z10;
                    this.Q.g(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z10 = false;
                }
                this.f12351C = z10;
                velocityTracker = this.f12352D;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f12352D = null;
                }
            }
        } else if (i10 == 1) {
            this.f12351C = false;
            this.f12358J = -1;
            velocityTracker2 = this.f12352D;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f12352D = null;
            }
            if (this.f12368u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 2) {
            int i11 = this.f12358J;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f12372y) > this.f12355G && (2 & getNestedScrollAxes()) == 0) {
                        this.f12351C = true;
                        this.f12372y = y11;
                        if (this.f12352D == null) {
                            this.f12352D = VelocityTracker.obtain();
                        }
                        this.f12352D.addMovement(motionEvent);
                        this.f12361M = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f12351C = false;
            this.f12358J = -1;
            velocityTracker2 = this.f12352D;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f12352D = null;
            }
            if (this.f12368u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 6) {
            o(motionEvent);
        }
        return this.f12351C;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f12373z = false;
        View view = this.f12350B;
        if (view != null && l(view, this)) {
            View view2 = this.f12350B;
            Rect rect = this.f12367t;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iD = d(rect);
            if (iD != 0) {
                scrollBy(0, iD);
            }
        }
        this.f12350B = null;
        if (!this.f12349A) {
            if (this.f12363O != null) {
                scrollTo(getScrollX(), this.f12363O.f5993r);
                this.f12363O = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f12349A = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f12353E && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f7, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        h((int) f7);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f7) {
        return this.Q.b(f3, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.Q.c(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f12363O = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f5993r = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f12367t;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iD = d(rect);
        if (iD != 0) {
            if (this.f12354F) {
                u(0, iD, false);
            } else {
                scrollBy(0, iD);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return j(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        f(0, view);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fW;
        int iRound;
        int i10;
        ViewParent parent2;
        if (this.f12352D == null) {
            this.f12352D = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12361M = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f12361M);
        C0262o c0262o = this.Q;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f12369v;
            EdgeEffect edgeEffect2 = this.f12370w;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f12352D;
                velocityTracker.computeCurrentVelocity(1000, this.f12357I);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f12358J);
                if (Math.abs(yVelocity) >= this.f12356H) {
                    if (a.I(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            h(-yVelocity);
                        }
                    } else if (a.I(edgeEffect2) != 0.0f) {
                        int i11 = -yVelocity;
                        if (t(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            h(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f7 = i12;
                        if (!c0262o.b(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            h(i12);
                        }
                    }
                } else if (this.f12368u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f12358J = -1;
                this.f12351C = false;
                VelocityTracker velocityTracker2 = this.f12352D;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f12352D = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f12358J);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f12358J + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.f12372y - y10;
                    float x9 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (a.I(edgeEffect) != 0.0f) {
                        fW = -a.W(edgeEffect, -height, x9);
                        if (a.I(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (a.I(edgeEffect2) != 0.0f) {
                        fW = a.W(edgeEffect2, height, 1.0f - x9);
                        if (a.I(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f3 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i10 = i13 - iRound;
                        if (!this.f12351C && Math.abs(i10) > this.f12355G) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f12351C = true;
                            if (i10 > 0) {
                                i10 -= this.f12355G;
                            } else {
                                i10 += this.f12355G;
                            }
                        }
                        if (this.f12351C) {
                            int iS = s(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f12372y = y10 - iS;
                            this.f12361M += iS;
                        }
                    }
                    f3 = fW;
                    iRound = Math.round(f3 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i10 = i13 - iRound;
                    if (!this.f12351C) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f12351C = true;
                        if (i10 > 0) {
                            i10 -= this.f12355G;
                        } else {
                            i10 += this.f12355G;
                        }
                    }
                    if (this.f12351C) {
                        int iS2 = s(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f12372y = y10 - iS2;
                        this.f12361M += iS2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f12351C && getChildCount() > 0) {
                    if (this.f12368u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f12358J = -1;
                this.f12351C = false;
                VelocityTracker velocityTracker3 = this.f12352D;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f12352D = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f12372y = (int) motionEvent.getY(actionIndex);
                this.f12358J = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f12372y = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f12358J));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f12351C && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f12368u.isFinished()) {
                this.f12368u.abortAnimation();
                w(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f12372y = y11;
            this.f12358J = pointerId;
            c0262o.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f12352D;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i16 <= i13) {
            if (i16 < 0) {
                i15 = 0;
            } else {
                i15 = i16;
                z11 = false;
            }
            if (z11 && !this.Q.f(1)) {
                this.f12368u.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i14, i15);
            return !z10 || z11;
        }
        i15 = i13;
        z11 = true;
        if (z11) {
            this.f12368u.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z10) {
        }
    }

    public final void q(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f12367t;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        r(i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            s(z11 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f12373z) {
            this.f12350B = view2;
        } else {
            Rect rect = this.f12367t;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iD = d(rect);
            if (iD != 0) {
                scrollBy(0, iD);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iD = d(rect);
        boolean z11 = iD != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iD);
                return z11;
            }
            u(0, iD, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f12352D) != null) {
            velocityTracker.recycle();
            this.f12352D = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f12373z = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    public final int s(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        C0262o c0262o = this.Q;
        if (i13 == 1) {
            c0262o.g(2, i13);
        }
        boolean zC = this.Q.c(0, i10, i13, this.f12360L, this.f12359K);
        int[] iArr = this.f12359K;
        int[] iArr2 = this.f12360L;
        if (zC) {
            i14 = i10 - iArr2[1];
            i15 = iArr[1];
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z13 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z14 = p(i14, 0, scrollY, scrollRange) && !c0262o.f(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f3790a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr2[1] = 0;
        this.Q.d(0, scrollY2, 0, i14 - scrollY2, this.f12359K, i13, iArr2);
        int i16 = i15 + iArr[1];
        int i17 = i14 - iArr2[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.f12370w;
        EdgeEffect edgeEffect2 = this.f12369v;
        if (i18 >= 0) {
            if (i18 > scrollRange && z13) {
                a.W(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
                if (motionEvent != null) {
                    z11 = false;
                    getScrollFeedbackProvider().f3790a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
                } else {
                    z11 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z12 = z11;
            } else {
                z12 = z14;
            }
            if (z12 && i13 == 0 && (velocityTracker = this.f12352D) != null) {
                velocityTracker.clear();
            }
            if (i13 == 1) {
                w(i13);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i16;
        }
        if (z13) {
            a.W(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f3790a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z11 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z12 = z11;
        } else {
            postInvalidateOnAnimation();
            z12 = z11;
        }
        if (z12) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            w(i13);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i16;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f12353E) {
            this.f12353E = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C0262o c0262o = this.Q;
        if (c0262o.f3768d) {
            View view = c0262o.f3767c;
            WeakHashMap weakHashMap = S.f3689a;
            I.n(view);
        }
        c0262o.f3768d = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f12354F = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.Q.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fI = a.I(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f3 = this.f12365r * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d5 = T;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f3))) < fI;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f12366s > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f12368u.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z10) {
                this.Q.g(2, 1);
            } else {
                w(1);
            }
            this.f12362N = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f12368u.isFinished()) {
                this.f12368u.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f12366s = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f12369v;
        if (a.I(edgeEffect) != 0.0f) {
            a.W(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f12370w;
        if (a.I(edgeEffect2) == 0.0f) {
            return z10;
        }
        a.W(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i10) {
        this.Q.h(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i10);
        this.f12367t = new Rect();
        this.f12373z = true;
        this.f12349A = false;
        this.f12350B = null;
        this.f12351C = false;
        this.f12354F = true;
        this.f12358J = -1;
        this.f12359K = new int[2];
        this.f12360L = new int[2];
        this.S = new C0257j(getContext(), new c(22, this));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            edgeEffect = d.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f12369v = edgeEffect;
        if (i11 >= 31) {
            edgeEffect2 = d.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f12370w = edgeEffect2;
        this.f12365r = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f12368u = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f12355G = viewConfiguration.getScaledTouchSlop();
        this.f12356H = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12357I = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12348V, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f12364P = new C0127i0();
        this.Q = new C0262o(this);
        setNestedScrollingEnabled(true);
        S.o(this, U);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(h hVar) {
    }
}
