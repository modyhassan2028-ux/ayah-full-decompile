package androidx.drawerlayout.widget;

import I1.B0;
import I1.I;
import I1.J;
import I1.S;
import K0.RunnableC0354l;
import N1.f;
import R1.c;
import W2.n;
import Z1.b;
import Z1.d;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int[] f12532h0 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int[] f12533i0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final boolean f12534j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final boolean f12535k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final boolean f12536l0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final a f12537A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12538B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12539C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12540D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public OnBackInvokedCallback f12541E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public OnBackInvokedDispatcher f12542F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f12543G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12544H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f12545I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f12546J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f12547K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public b f12548L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f12549M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f12550N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f12551O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Drawable f12552P;
    public Drawable Q;
    public Drawable R;
    public CharSequence S;
    public CharSequence T;
    public B0 U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f12553V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Drawable f12554W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Drawable f12555a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Drawable f12556b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Drawable f12557c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ArrayList f12558d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Rect f12559e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Matrix f12560f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final C6.b f12561g0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f12562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f12563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f12566v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f12567w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f12568x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f12569y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f12570z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f12534j0 = true;
        f12535k0 = true;
        f12536l0 = i10 >= 29;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public static boolean i(View view) {
        WeakHashMap weakHashMap = S.f3689a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean j(View view) {
        return ((Z1.c) view.getLayoutParams()).f10958a == 0;
    }

    public static boolean k(View view) {
        if (l(view)) {
            return (((Z1.c) view.getLayoutParams()).f10961d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    static boolean l(View view) {
        int i10 = ((Z1.c) view.getLayoutParams()).f10958a;
        WeakHashMap weakHashMap = S.f3689a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean m(View view) {
        if (l(view)) {
            return ((Z1.c) view.getLayoutParams()).f10959b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void a(b bVar) {
        if (this.f12549M == null) {
            this.f12549M = new ArrayList();
        }
        this.f12549M.add(bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            arrayList2 = this.f12558d0;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!l(childAt)) {
                arrayList2.add(childAt);
            } else if (k(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
            i12++;
        }
        if (!z10) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i10, layoutParams);
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i11);
            if ((((Z1.c) childAt.getLayoutParams()).f10961d & 1) == 1) {
                break;
            } else {
                i11++;
            }
        }
        if (childAt != null || l(view)) {
            WeakHashMap weakHashMap = S.f3689a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = S.f3689a;
            view.setImportantForAccessibility(1);
        }
        if (f12534j0) {
            return;
        }
        S.o(view, this.f12562r);
    }

    public final boolean b(int i10, View view) {
        return (h(view) & i10) == i10;
    }

    public final void c(View view, boolean z10) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        Z1.c cVar = (Z1.c) view.getLayoutParams();
        if (this.f12540D) {
            cVar.f10959b = 0.0f;
            cVar.f10961d = 0;
        } else if (z10) {
            cVar.f10961d |= 4;
            if (b(3, view)) {
                this.f12568x.u(view, -view.getWidth(), view.getTop());
            } else {
                this.f12569y.u(view, getWidth(), view.getTop());
            }
        } else {
            float f3 = ((Z1.c) view.getLayoutParams()).f10959b;
            float width = view.getWidth();
            int i10 = ((int) (width * 0.0f)) - ((int) (f3 * width));
            if (!b(3, view)) {
                i10 = -i10;
            }
            view.offsetLeftAndRight(i10);
            p(view, 0.0f);
            t(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof Z1.c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((Z1.c) getChildAt(i10).getLayoutParams()).f10959b);
        }
        this.f12566v = fMax;
        boolean zH = this.f12568x.h();
        boolean zH2 = this.f12569y.h();
        if (zH || zH2) {
            WeakHashMap weakHashMap = S.f3689a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(boolean z10) {
        int childCount = getChildCount();
        boolean zU = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Z1.c cVar = (Z1.c) childAt.getLayoutParams();
            if (l(childAt) && (!z10 || cVar.f10960c)) {
                zU |= b(3, childAt) ? this.f12568x.u(childAt, -childAt.getWidth(), childAt.getTop()) : this.f12569y.u(childAt, getWidth(), childAt.getTop());
                cVar.f10960c = false;
            }
        }
        a aVar = this.f12570z;
        aVar.f12574e.removeCallbacks(aVar.f12573d);
        a aVar2 = this.f12537A;
        aVar2.f12574e.removeCallbacks(aVar2.f12573d);
        if (zU) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f12566v <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.f12559e0 == null) {
                this.f12559e0 = new Rect();
            }
            childAt.getHitRect(this.f12559e0);
            if (this.f12559e0.contains((int) x9, (int) y10) && !j(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f12560f0 == null) {
                            this.f12560f0 = new Matrix();
                        }
                        matrix.invert(this.f12560f0);
                        motionEventObtain.transform(this.f12560f0);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zJ = j(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zJ) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && l(childAt) && childAt.getHeight() >= height) {
                    if (b(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f3 = this.f12566v;
        if (f3 > 0.0f && zJ) {
            int i13 = this.f12565u;
            Paint paint = this.f12567w;
            paint.setColor((i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * f3)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), paint);
            return zDrawChild;
        }
        if (this.Q != null && b(3, view)) {
            int intrinsicWidth = this.Q.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f12568x.f7213o, 1.0f));
            this.Q.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.Q.setAlpha((int) (fMax * 255.0f));
            this.Q.draw(canvas);
            return zDrawChild;
        }
        if (this.R != null && b(5, view)) {
            int intrinsicWidth2 = this.R.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f12569y.f7213o, 1.0f));
            this.R.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.R.setAlpha((int) (fMax2 * 255.0f));
            this.R.draw(canvas);
        }
        return zDrawChild;
    }

    public final View e(int i10) {
        WeakHashMap weakHashMap = S.f3689a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt) && m(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int g(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i10 = ((Z1.c) view.getLayoutParams()).f10958a;
        WeakHashMap weakHashMap = S.f3689a;
        int layoutDirection = getLayoutDirection();
        if (i10 == 3) {
            int i11 = this.f12543G;
            if (i11 != 3) {
                return i11;
            }
            int i12 = layoutDirection == 0 ? this.f12545I : this.f12546J;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f12544H;
            if (i13 != 3) {
                return i13;
            }
            int i14 = layoutDirection == 0 ? this.f12546J : this.f12545I;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f12545I;
            if (i15 != 3) {
                return i15;
            }
            int i16 = layoutDirection == 0 ? this.f12543G : this.f12544H;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f12546J;
        if (i17 != 3) {
            return i17;
        }
        int i18 = layoutDirection == 0 ? this.f12544H : this.f12543G;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Z1.c cVar = new Z1.c(-1, -1);
        cVar.f10958a = 0;
        return cVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof Z1.c) {
            Z1.c cVar = (Z1.c) layoutParams;
            Z1.c cVar2 = new Z1.c(cVar);
            cVar2.f10958a = 0;
            cVar2.f10958a = cVar.f10958a;
            return cVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Z1.c cVar3 = new Z1.c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar3.f10958a = 0;
            return cVar3;
        }
        Z1.c cVar4 = new Z1.c(layoutParams);
        cVar4.f10958a = 0;
        return cVar4;
    }

    public float getDrawerElevation() {
        if (f12535k0) {
            return this.f12563s;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f12552P;
    }

    public final int h(View view) {
        int i10 = ((Z1.c) view.getLayoutParams()).f10958a;
        WeakHashMap weakHashMap = S.f3689a;
        return Gravity.getAbsoluteGravity(i10, getLayoutDirection());
    }

    public final void n(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        Z1.c cVar = (Z1.c) view.getLayoutParams();
        if (this.f12540D) {
            cVar.f10959b = 1.0f;
            cVar.f10961d = 1;
            s(view, true);
            r(view);
            q();
        } else {
            cVar.f10961d |= 2;
            if (b(3, view)) {
                this.f12568x.u(view, 0, view.getTop());
            } else {
                this.f12569y.u(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    public final void o() {
        Drawable drawable;
        Drawable drawable2;
        if (f12535k0) {
            return;
        }
        WeakHashMap weakHashMap = S.f3689a;
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 0) {
            Drawable drawable3 = this.f12554W;
            if (drawable3 != null) {
                if (drawable3.isAutoMirrored()) {
                    drawable3.setLayoutDirection(layoutDirection);
                }
                drawable = this.f12554W;
            } else {
                drawable = this.f12556b0;
            }
        } else {
            Drawable drawable4 = this.f12555a0;
            if (drawable4 != null) {
                if (drawable4.isAutoMirrored()) {
                    drawable4.setLayoutDirection(layoutDirection);
                }
                drawable = this.f12555a0;
            } else {
                drawable = this.f12556b0;
            }
        }
        this.Q = drawable;
        int layoutDirection2 = getLayoutDirection();
        if (layoutDirection2 == 0) {
            Drawable drawable5 = this.f12555a0;
            if (drawable5 != null) {
                if (drawable5.isAutoMirrored()) {
                    drawable5.setLayoutDirection(layoutDirection2);
                }
                drawable2 = this.f12555a0;
            } else {
                drawable2 = this.f12557c0;
            }
        } else {
            Drawable drawable6 = this.f12554W;
            if (drawable6 != null) {
                if (drawable6.isAutoMirrored()) {
                    drawable6.setLayoutDirection(layoutDirection2);
                }
                drawable2 = this.f12554W;
            } else {
                drawable2 = this.f12557c0;
            }
        }
        this.R = drawable2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12540D = true;
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12540D = true;
        q();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f12553V || this.f12552P == null) {
            return;
        }
        B0 b5 = this.U;
        int iD = b5 != null ? b5.d() : 0;
        if (iD > 0) {
            this.f12552P.setBounds(0, 0, getWidth(), iD);
            this.f12552P.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewI;
        int actionMasked = motionEvent.getActionMasked();
        c cVar = this.f12568x;
        boolean zT = cVar.t(motionEvent) | this.f12569y.t(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d(true);
                this.f12547K = false;
            } else if (actionMasked == 2) {
                int length = cVar.f7204d.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if ((cVar.f7209k & (1 << i10)) != 0) {
                        float f3 = cVar.f7206f[i10] - cVar.f7204d[i10];
                        float f7 = cVar.g[i10] - cVar.f7205e[i10];
                        float f10 = (f7 * f7) + (f3 * f3);
                        int i11 = cVar.f7202b;
                        if (f10 > i11 * i11) {
                            a aVar = this.f12570z;
                            aVar.f12574e.removeCallbacks(aVar.f12573d);
                            a aVar2 = this.f12537A;
                            aVar2.f12574e.removeCallbacks(aVar2.f12573d);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                d(true);
                this.f12547K = false;
            }
            z10 = false;
        } else {
            float x9 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f12550N = x9;
            this.f12551O = y10;
            z10 = this.f12566v > 0.0f && (viewI = cVar.i((int) x9, (int) y10)) != null && j(viewI);
            this.f12547K = false;
        }
        if (!zT && !z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (!((Z1.c) getChildAt(i12).getLayoutParams()).f10960c) {
                }
            }
            if (!this.f12547K) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || f() == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewF = f();
        if (viewF != null && g(viewF) == 0) {
            d(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f3;
        int i14;
        boolean z11 = true;
        this.f12539C = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                Z1.c cVar = (Z1.c) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) cVar).topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(3, childAt)) {
                        float f7 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (cVar.f10959b * f7));
                        f3 = (measuredWidth + i14) / f7;
                    } else {
                        float f10 = measuredWidth;
                        int i18 = i15 - ((int) (cVar.f10959b * f10));
                        f3 = (i15 - i18) / f10;
                        i14 = i18;
                    }
                    boolean z12 = f3 != cVar.f10959b ? z11 : false;
                    int i19 = cVar.f10958a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = i20 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                            if (i23 > i24) {
                                i21 = i24 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    }
                    if (z12) {
                        p(childAt, f3);
                    }
                    int i27 = cVar.f10959b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f12536l0) {
            WeakHashMap weakHashMap = S.f3689a;
            B0 b0A = J.a(this);
            if (b0A != null) {
                A1.c cVarK = b0A.f3671a.k();
                c cVar2 = this.f12568x;
                cVar2.f7213o = Math.max(cVar2.f7214p, cVarK.f462a);
                c cVar3 = this.f12569y;
                cVar3.f7213o = Math.max(cVar3.f7214p, cVarK.f464c);
            }
        }
        this.f12539C = false;
        this.f12540D = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.U != null) {
            WeakHashMap weakHashMap = S.f3689a;
            if (getFitsSystemWindows()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        WeakHashMap weakHashMap2 = S.f3689a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                Z1.c cVar = (Z1.c) childAt.getLayoutParams();
                if (z10) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar.f10958a, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        B0 b0F = this.U;
                        if (absoluteGravity == 3) {
                            b0F = b0F.f(b0F.b(), b0F.d(), 0, b0F.a());
                        } else if (absoluteGravity == 5) {
                            b0F = b0F.f(0, b0F.d(), b0F.c(), b0F.a());
                        }
                        S.b(childAt, b0F);
                    } else {
                        B0 b0F2 = this.U;
                        if (absoluteGravity == 3) {
                            b0F2 = b0F2.f(b0F2.b(), b0F2.d(), 0, b0F2.a());
                        } else if (absoluteGravity == 5) {
                            b0F2 = b0F2.f(0, b0F2.d(), b0F2.c(), b0F2.a());
                        }
                        ((ViewGroup.MarginLayoutParams) cVar).leftMargin = b0F2.b();
                        ((ViewGroup.MarginLayoutParams) cVar).topMargin = b0F2.d();
                        ((ViewGroup.MarginLayoutParams) cVar).rightMargin = b0F2.c();
                        ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = b0F2.a();
                    }
                }
                if (j(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) cVar).leftMargin) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) cVar).topMargin) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, 1073741824));
                } else {
                    if (!l(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f12535k0) {
                        float fE = I.e(childAt);
                        float f3 = this.f12563s;
                        if (fE != f3) {
                            I.k(childAt, f3);
                        }
                    }
                    int iH = h(childAt);
                    int i13 = iH & 7;
                    boolean z13 = i13 == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException(p.B(new StringBuilder("Child drawer has absolute gravity "), (iH & 3) != 3 ? (iH & 5) == 5 ? "RIGHT" : Integer.toHexString(i13) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f12564t + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin, ((ViewGroup.MarginLayoutParams) cVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, ((ViewGroup.MarginLayoutParams) cVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewE;
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f6852r);
        int i10 = dVar.f10962t;
        if (i10 != 0 && (viewE = e(i10)) != null) {
            n(viewE);
        }
        int i11 = dVar.f10963u;
        if (i11 != 3) {
            setDrawerLockMode(i11, 3);
        }
        int i12 = dVar.f10964v;
        if (i12 != 3) {
            setDrawerLockMode(i12, 5);
        }
        int i13 = dVar.f10965w;
        if (i13 != 3) {
            setDrawerLockMode(i13, 8388611);
        }
        int i14 = dVar.f10966x;
        if (i14 != 3) {
            setDrawerLockMode(i14, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        o();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f10962t = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Z1.c cVar = (Z1.c) getChildAt(i10).getLayoutParams();
            int i11 = cVar.f10961d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                dVar.f10962t = cVar.f10958a;
                break;
            }
        }
        dVar.f10963u = this.f12543G;
        dVar.f10964v = this.f12544H;
        dVar.f10965w = this.f12545I;
        dVar.f10966x = this.f12546J;
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        c cVar = this.f12568x;
        cVar.m(motionEvent);
        this.f12569y.m(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x9 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f12550N = x9;
            this.f12551O = y10;
            this.f12547K = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            d(true);
            this.f12547K = false;
            return true;
        }
        float x10 = motionEvent.getX();
        float y11 = motionEvent.getY();
        View viewI = cVar.i((int) x10, (int) y11);
        if (viewI != null && j(viewI)) {
            float f3 = x10 - this.f12550N;
            float f7 = y11 - this.f12551O;
            int i10 = cVar.f7202b;
            if ((f7 * f7) + (f3 * f3) < i10 * i10) {
                int childCount = getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i11);
                    if ((((Z1.c) childAt.getLayoutParams()).f10961d & 1) == 1) {
                        break;
                    }
                    i11++;
                }
                z10 = childAt == null || g(childAt) == 2;
            }
        }
        d(z10);
        return true;
    }

    public final void p(View view, float f3) {
        Z1.c cVar = (Z1.c) view.getLayoutParams();
        if (f3 == cVar.f10959b) {
            return;
        }
        cVar.f10959b = f3;
        ArrayList arrayList = this.f12549M;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) this.f12549M.get(size)).a(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public final void q() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View viewF = f();
            OnBackInvokedDispatcher onBackInvokedDispatcherA = Z1.a.a(this);
            if (viewF == null || onBackInvokedDispatcherA == null || g(viewF) != 0) {
                z10 = false;
            } else {
                WeakHashMap weakHashMap = S.f3689a;
                if (isAttachedToWindow()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10 && this.f12542F == null) {
                if (this.f12541E == null) {
                    this.f12541E = Z1.a.b(new RunnableC0354l(11, this));
                }
                Z1.a.c(onBackInvokedDispatcherA, this.f12541E);
                this.f12542F = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f12542F) == null) {
                return;
            }
            Z1.a.d(onBackInvokedDispatcher, this.f12541E);
            this.f12542F = null;
        }
    }

    public final void r(View view) {
        J1.d dVar = J1.d.f4203n;
        S.l(dVar.a(), view);
        S.i(0, view);
        if (!k(view) || g(view) == 2) {
            return;
        }
        S.m(view, dVar, null, this.f12561g0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f12539C) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || l(childAt)) && !(z10 && childAt == view)) {
                WeakHashMap weakHashMap = S.f3689a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = S.f3689a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void setChildInsets(B0 b5, boolean z10) {
        this.U = b5;
        this.f12553V = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f3) {
        this.f12563s = f3;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                float f7 = this.f12563s;
                WeakHashMap weakHashMap = S.f3689a;
                I.k(childAt, f7);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(b bVar) {
        ArrayList arrayList;
        b bVar2 = this.f12548L;
        if (bVar2 != null && (arrayList = this.f12549M) != null) {
            arrayList.remove(bVar2);
        }
        if (bVar != null) {
            a(bVar);
        }
        this.f12548L = bVar;
    }

    public void setDrawerLockMode(int i10) {
        setDrawerLockMode(i10, 3);
        setDrawerLockMode(i10, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i10) {
        if (f12535k0) {
            return;
        }
        if ((i10 & 8388611) == 8388611) {
            this.f12554W = drawable;
        } else if ((i10 & 8388613) == 8388613) {
            this.f12555a0 = drawable;
        } else if ((i10 & 3) == 3) {
            this.f12556b0 = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.f12557c0 = drawable;
        }
        o();
        invalidate();
    }

    public void setDrawerTitle(int i10, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f3689a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        if (absoluteGravity == 3) {
            this.S = charSequence;
        } else if (absoluteGravity == 5) {
            this.T = charSequence;
        }
    }

    public void setScrimColor(int i10) {
        this.f12565u = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f12552P = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f12552P = new ColorDrawable(i10);
        invalidate();
    }

    public final void t(int i10, View view) {
        int i11;
        View rootView;
        int i12 = this.f12568x.f7201a;
        int i13 = this.f12569y.f7201a;
        if (i12 == 1 || i13 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (i12 != 2 && i13 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f3 = ((Z1.c) view.getLayoutParams()).f10959b;
            if (f3 == 0.0f) {
                Z1.c cVar = (Z1.c) view.getLayoutParams();
                if ((cVar.f10961d & 1) == 1) {
                    cVar.f10961d = 0;
                    ArrayList arrayList = this.f12549M;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((b) this.f12549M.get(size)).c(view);
                        }
                    }
                    s(view, false);
                    r(view);
                    q();
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f3 == 1.0f) {
                Z1.c cVar2 = (Z1.c) view.getLayoutParams();
                if ((cVar2.f10961d & 1) == 0) {
                    cVar2.f10961d = 1;
                    ArrayList arrayList2 = this.f12549M;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((b) this.f12549M.get(size2)).b(view);
                        }
                    }
                    s(view, true);
                    r(view);
                    q();
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i11 != this.f12538B) {
            this.f12538B = i11;
            ArrayList arrayList3 = this.f12549M;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((b) this.f12549M.get(size3)).getClass();
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12562r = new f(1);
        this.f12565u = -1728053248;
        this.f12567w = new Paint();
        this.f12540D = true;
        int i11 = 3;
        this.f12543G = 3;
        this.f12544H = 3;
        this.f12545I = 3;
        this.f12546J = 3;
        this.f12554W = null;
        this.f12555a0 = null;
        this.f12556b0 = null;
        this.f12557c0 = null;
        this.f12561g0 = new C6.b(12, this);
        setDescendantFocusability(262144);
        float f3 = getResources().getDisplayMetrics().density;
        this.f12564t = (int) ((64.0f * f3) + 0.5f);
        float f7 = f3 * 400.0f;
        a aVar = new a(this, 3);
        this.f12570z = aVar;
        a aVar2 = new a(this, 5);
        this.f12537A = aVar2;
        c cVar = new c(getContext(), this, aVar);
        cVar.f7202b = (int) (cVar.f7202b * 1.0f);
        this.f12568x = cVar;
        cVar.f7215q = 1;
        cVar.f7212n = f7;
        aVar.f12572c = cVar;
        c cVar2 = new c(getContext(), this, aVar2);
        cVar2.f7202b = (int) (1.0f * cVar2.f7202b);
        this.f12569y = cVar2;
        cVar2.f7215q = 2;
        cVar2.f7212n = f7;
        aVar2.f12572c = cVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = S.f3689a;
        setImportantForAccessibility(1);
        S.o(this, new P2.c(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            I.m(this, new n(i11));
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f12532h0);
            try {
                this.f12552P = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, Y1.a.f10374a, i10, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f12563s = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f12563s = getResources().getDimension(com.ayah.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f12558d0 = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerLockMode(int i10, int i11) {
        View viewE;
        WeakHashMap weakHashMap = S.f3689a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
        if (i11 == 3) {
            this.f12543G = i10;
        } else if (i11 == 5) {
            this.f12544H = i10;
        } else if (i11 == 8388611) {
            this.f12545I = i10;
        } else if (i11 == 8388613) {
            this.f12546J = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f12568x : this.f12569y).b();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewE = e(absoluteGravity)) != null) {
                n(viewE);
                return;
            }
            return;
        }
        View viewE2 = e(absoluteGravity);
        if (viewE2 != null) {
            c(viewE2, true);
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f12552P = i10 != 0 ? getContext().getDrawable(i10) : null;
        invalidate();
    }

    public void setDrawerShadow(int i10, int i11) {
        setDrawerShadow(getContext().getDrawable(i10), i11);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        Z1.c cVar = new Z1.c(context, attributeSet);
        cVar.f10958a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12533i0);
        cVar.f10958a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public void setDrawerLockMode(int i10, View view) {
        if (l(view)) {
            setDrawerLockMode(i10, ((Z1.c) view.getLayoutParams()).f10958a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
