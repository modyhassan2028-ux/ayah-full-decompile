package androidx.viewpager.widget;

import E2.C0140p;
import E2.G;
import E2.RunnableC0147v;
import H7.C0228b;
import I1.I;
import I1.S;
import L5.c;
import Z2.a;
import Z2.e;
import Z2.f;
import Z2.g;
import Z2.h;
import Z2.i;
import Z2.j;
import Z2.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f13003f0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final G f13004g0 = new G(4);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final C0140p f13005h0 = new C0140p(9);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f13006A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13007B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13008C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13009D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f13010E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f13011F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f13012G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f13013H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f13014I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f13015J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f13016K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f13017L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f13018M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public VelocityTracker f13019N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f13020O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public EdgeEffect f13021P;
    public EdgeEffect Q;
    public boolean R;
    public boolean S;
    public int T;
    public ArrayList U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public i f13022V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public i f13023W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ArrayList f13024a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f13025b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ArrayList f13026c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RunnableC0147v f13027d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f13028e0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f13029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f13030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f13031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Parcelable f13032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Scroller f13033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f13035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f13036y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f13037z;

    public ViewPager(Context context) {
        super(context);
        this.f13029r = new ArrayList();
        this.f13030s = new f();
        this.f13031t = new Rect();
        this.f13032u = null;
        this.f13036y = -3.4028235E38f;
        this.f13037z = Float.MAX_VALUE;
        this.f13009D = 1;
        this.f13018M = -1;
        this.R = true;
        this.f13027d0 = new RunnableC0147v(11, this);
        this.f13028e0 = 0;
        g();
    }

    public static boolean b(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (!(view instanceof ViewGroup)) {
            return z10 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i14 = i11 + scrollX;
            if (i14 < childAt.getLeft() || i14 >= childAt.getRight() || (i13 = i12 + scrollY) < childAt.getTop() || i13 >= childAt.getBottom() || !b(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z10 || !view.canScrollHorizontally(-i10)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f13008C != z10) {
            this.f13008C = z10;
        }
    }

    public final boolean a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        boolean zRequestFocus = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f13031t;
            if (i10 == 17) {
                int i11 = d(rect, viewFindNextFocus).left;
                int i12 = d(rect, viewFindFocus).left;
                if (viewFindFocus == null || i11 < i12) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            } else if (i10 == 66) {
                int i13 = d(rect, viewFindNextFocus).left;
                int i14 = d(rect, viewFindFocus).left;
                if (viewFindFocus == null || i13 > i14) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
        } else if (i10 != 17) {
        }
        if (zRequestFocus) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zRequestFocus;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12).getVisibility() == 0) {
                    e();
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10).getVisibility() == 0) {
                e();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        g gVar = (g) layoutParams;
        boolean z10 = gVar.f10973a | (view.getClass().getAnnotation(e.class) != null);
        gVar.f10973a = z10;
        if (!this.f13007B) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public final void c(boolean z10) {
        int i10 = 0;
        boolean z11 = this.f13028e0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f13033v.isFinished()) {
                this.f13033v.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f13033v.getCurrX();
                int currY = this.f13033v.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        i(currX);
                    }
                }
            }
        }
        while (true) {
            ArrayList arrayList = this.f13029r;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((f) arrayList.get(i10)).getClass();
            i10++;
        }
        if (z11) {
            RunnableC0147v runnableC0147v = this.f13027d0;
            if (!z10) {
                runnableC0147v.run();
            } else {
                WeakHashMap weakHashMap = S.f3689a;
                postOnAnimation(runnableC0147v);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f13033v.isFinished() || !this.f13033v.computeScrollOffset()) {
            c(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f13033v.getCurrX();
        int currY = this.f13033v.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!i(currX)) {
                this.f13033v.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = S.f3689a;
        postInvalidateOnAnimation();
    }

    public final Rect d(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zA;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zA = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zA = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zA = a(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zA = a(1);
                        } else {
                            zA = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zA = false;
                    } else {
                        zA = a(66);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    zA = false;
                } else {
                    zA = a(17);
                }
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).getVisibility() == 0) {
                e();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zDraw = false;
        if (getOverScrollMode() != 0) {
            this.f13021P.finish();
            this.Q.finish();
        } else {
            if (!this.f13021P.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f13036y * width);
                this.f13021P.setSize(height, width);
                zDraw = this.f13021P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.Q.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f13037z + 1.0f)) * width2);
                this.Q.setSize(height2, width2);
                zDraw |= this.Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            WeakHashMap weakHashMap = S.f3689a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13035x;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        ArrayList arrayList = this.f13029r;
        if (arrayList.size() <= 0) {
            return;
        }
        ((f) arrayList.get(0)).getClass();
        throw null;
    }

    public final f f() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13029r;
            if (i10 >= arrayList.size()) {
                return null;
            }
            f fVar = (f) arrayList.get(i10);
            if (fVar.f10971a == 0) {
                return fVar;
            }
            i10++;
        }
    }

    public final void g() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f13033v = new Scroller(context, f13004g0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f13014I = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13021P = new EdgeEffect(context);
        this.Q = new EdgeEffect(context);
        this.f13020O = (int) (2.0f * f3);
        this.f13012G = (int) (f3 * 16.0f);
        S.o(this, new C0228b(2, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        I.m(this, new c(this));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.f13025b0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        ((g) ((View) this.f13026c0.get(i11)).getLayoutParams()).getClass();
        return 0;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.f13009D;
    }

    public int getPageMargin() {
        return this.f13034w;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void h(int i10, float f3, int i11) {
        int iMax;
        int width;
        int left;
        if (this.T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f10973a) {
                    int i13 = gVar.f10974b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        i iVar = this.f13022V;
        if (iVar != null) {
            iVar.b(i10, f3);
        }
        ArrayList arrayList = this.U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                i iVar2 = (i) this.U.get(i15);
                if (iVar2 != null) {
                    iVar2.b(i10, f3);
                }
            }
        }
        i iVar3 = this.f13023W;
        if (iVar3 != null) {
            iVar3.b(i10, f3);
        }
        this.S = true;
    }

    public final boolean i(int i10) {
        int i11;
        ArrayList arrayList = this.f13029r;
        if (arrayList.size() == 0) {
            if (!this.R) {
                this.S = false;
                h(0, 0.0f, 0);
                if (!this.S) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f13034w / clientWidth : 0.0f;
        int i12 = -1;
        boolean z10 = true;
        float f7 = 0.0f;
        int i13 = 0;
        f fVar = null;
        while (i13 < arrayList.size()) {
            f fVar2 = (f) arrayList.get(i13);
            if (!z10 && fVar2.f10971a != (i11 = i12 + 1)) {
                f fVar3 = this.f13030s;
                fVar3.f10972b = f7 + 0.0f + f3;
                fVar3.f10971a = i11;
                throw null;
            }
            f7 = fVar2.f10972b;
            float f10 = f7 + 0.0f + f3;
            if (!z10 && scrollX < f7) {
                break;
            }
            if (scrollX < f10 || i13 == arrayList.size() - 1) {
                fVar = fVar2;
                break;
            }
            i12 = fVar2.f10971a;
            i13++;
            z10 = false;
            fVar = fVar2;
        }
        int clientWidth2 = getClientWidth();
        int i14 = this.f13034w;
        int i15 = clientWidth2 + i14;
        float f11 = clientWidth2;
        int i16 = fVar.f10971a;
        float f12 = ((i10 / f11) - fVar.f10972b) / (0.0f + (i14 / f11));
        this.S = false;
        h(i16, f12, (int) (i15 * f12));
        if (this.S) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final void j() {
        if (this.f13025b0 != 0) {
            ArrayList arrayList = this.f13026c0;
            if (arrayList == null) {
                this.f13026c0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f13026c0.add(getChildAt(i10));
            }
            Collections.sort(this.f13026c0, f13005h0);
        }
    }

    public final void k(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f13029r.isEmpty()) {
            if (!this.f13033v.isFinished()) {
                this.f13033v.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f fVarF = f();
        int iMin = (int) ((fVarF != null ? Math.min(fVarF.f10972b, this.f13037z) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            c(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f13027d0);
        Scroller scroller = this.f13033v;
        if (scroller != null && !scroller.isFinished()) {
            this.f13033v.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13034w <= 0 || this.f13035x == null) {
            return;
        }
        this.f13029r.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r13.f13011F != false) goto L84;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f10973a) {
                    int i18 = gVar.f10974b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt2 = getChildAt(i28);
            if (childAt2.getVisibility() != 8 && !((g) childAt2.getLayoutParams()).f10973a) {
                e();
            }
        }
        this.T = i16;
        if (this.R) {
            f fVarF = f();
            int iMax3 = fVarF != null ? (int) (Math.max(this.f13036y, Math.min(fVarF.f10972b, this.f13037z)) * getClientWidth()) : 0;
            z11 = false;
            c(false);
            scrollTo(iMax3, 0);
            i(iMax3);
        } else {
            z11 = false;
        }
        this.R = z11;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f13013H = Math.min(measuredWidth / 10, this.f13012G);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f10973a) {
                int i15 = gVar2.f10974b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f13006A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f13007B = true;
        j();
        this.f13007B = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f10973a)) {
                gVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.f13006A);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = 1;
            i13 = childCount;
            i11 = 0;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i13) {
            if (getChildAt(i11).getVisibility() == 0) {
                e();
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f6852r);
        this.f13032u = kVar.f10976u;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f10975t = 0;
        return kVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f13034w;
            k(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f13007B) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f13024a0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f13024a0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h) this.f13024a0.get(i10)).c(this);
        }
    }

    public void setCurrentItem(int i10) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f13009D) {
            this.f13009D = i10;
            j();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f13022V = iVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f13034w;
        this.f13034w = i10;
        int width = getWidth();
        k(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f13035x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z10, j jVar) {
        setPageTransformer(z10, jVar, 2);
    }

    public void setScrollState(int i10) {
        if (this.f13028e0 == i10) {
            return;
        }
        this.f13028e0 = i10;
        i iVar = this.f13022V;
        if (iVar != null) {
            iVar.a(i10);
        }
        ArrayList arrayList = this.U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.U.get(i11);
                if (iVar2 != null) {
                    iVar2.a(i10);
                }
            }
        }
        i iVar3 = this.f13023W;
        if (iVar3 != null) {
            iVar3.a(i10);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13035x;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13003f0);
        gVar.f10974b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return gVar;
    }

    public void setCurrentItem(int i10, boolean z10) {
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z10, j jVar, int i10) {
        boolean z11 = jVar != null;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.f13025b0 = z10 ? 2 : 1;
        } else {
            this.f13025b0 = 0;
        }
        if (z11) {
            j();
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13029r = new ArrayList();
        this.f13030s = new f();
        this.f13031t = new Rect();
        this.f13032u = null;
        this.f13036y = -3.4028235E38f;
        this.f13037z = Float.MAX_VALUE;
        this.f13009D = 1;
        this.f13018M = -1;
        this.R = true;
        this.f13027d0 = new RunnableC0147v(11, this);
        this.f13028e0 = 0;
        g();
    }
}
