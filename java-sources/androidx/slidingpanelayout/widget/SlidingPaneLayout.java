package androidx.slidingpanelayout.widget;

import B1.a;
import I1.B0;
import I1.J;
import I1.S;
import K9.A;
import K9.AbstractC0405x;
import O9.y;
import P2.b;
import P2.d;
import P2.e;
import P2.h;
import R1.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.f;
import androidx.window.layout.g;
import androidx.window.layout.q;
import androidx.window.layout.s;
import androidx.window.layout.t;
import androidx.window.layout.v;
import androidx.window.layout.w;
import androidx.window.layout.x;
import androidx.window.layout.z;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final boolean f12952O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12953A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12954B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f12955C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f12956D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final CopyOnWriteArrayList f12957E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final c f12958F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f12959G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f12960H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Rect f12961I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ArrayList f12962J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f12963K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public g f12964L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p248z6.c f12965M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public b f12966N;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f12969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f12970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f12972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f12973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f12974y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12975z;

    static {
        f12952O = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    private A1.c getSystemGestureInsets() {
        if (!f12952O) {
            return null;
        }
        WeakHashMap weakHashMap = S.f3689a;
        B0 b0A = J.a(this);
        if (b0A != null) {
            return b0A.f3671a.k();
        }
        return null;
    }

    private void setFoldingFeatureObserver(b bVar) {
        this.f12966N = bVar;
        bVar.getClass();
        p248z6.c cVar = this.f12965M;
        j.e(cVar, "onFoldingFeatureChangeListener");
        bVar.f6587d = cVar;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return this.f12971v && ((e) view.getLayoutParams()).f6596c && this.f12973x > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i10, layoutParams);
            return;
        }
        h hVar = new h(view.getContext());
        hVar.addView(view);
        super.addView(hVar, i10, layoutParams);
    }

    public final boolean b() {
        WeakHashMap weakHashMap = S.f3689a;
        return getLayoutDirection() == 1;
    }

    public final boolean c() {
        return !this.f12971v || this.f12973x == 0.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        c cVar = this.f12958F;
        if (cVar.h()) {
            if (!this.f12971v) {
                cVar.a();
            } else {
                WeakHashMap weakHashMap = S.f3689a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final void d(float f3) {
        boolean zB = b();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f12972w) {
                float f7 = 1.0f - this.f12974y;
                int i11 = this.f12954B;
                this.f12974y = f3;
                int i12 = ((int) (f7 * i11)) - ((int) ((1.0f - f3) * i11));
                if (zB) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int right;
        super.draw(canvas);
        Drawable drawable = b() ? this.f12970u : this.f12969t;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (b()) {
            right = childAt.getRight();
            i10 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i11 = left - intrinsicWidth;
            i10 = left;
            right = i11;
        }
        drawable.setBounds(right, top, i10, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zB = b() ^ c();
        c cVar = this.f12958F;
        if (zB) {
            cVar.f7215q = 1;
            A1.c systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                cVar.f7213o = Math.max(cVar.f7214p, systemGestureInsets.f462a);
            }
        } else {
            cVar.f7215q = 2;
            A1.c systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                cVar.f7213o = Math.max(cVar.f7214p, systemGestureInsets2.f464c);
            }
        }
        e eVar = (e) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f12971v && !eVar.f6595b && this.f12972w != null) {
            Rect rect = this.f12961I;
            canvas.getClipBounds(rect);
            if (b()) {
                rect.left = Math.max(rect.left, this.f12972w.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f12972w.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final boolean e(float f3) {
        int paddingLeft;
        if (this.f12971v) {
            boolean zB = b();
            e eVar = (e) this.f12972w.getLayoutParams();
            if (zB) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                paddingLeft = (int) (getWidth() - (((f3 * this.f12975z) + paddingRight) + this.f12972w.getWidth()));
            } else {
                paddingLeft = (int) ((f3 * this.f12975z) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
            }
            View view = this.f12972w;
            if (this.f12958F.u(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap weakHashMap = S.f3689a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    public final void f(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zB = b();
        int width = zB ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount && (childAt = getChildAt(i10)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zB ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zB ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i10++;
            view2 = view;
            zB = zB;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -1);
        eVar.f6594a = 0.0f;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar.f6594a = 0.0f;
            return eVar;
        }
        e eVar2 = new e(layoutParams);
        eVar2.f6594a = 0.0f;
        return eVar2;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f12968s;
    }

    public final int getLockMode() {
        return this.f12963K;
    }

    public int getParallaxDistance() {
        return this.f12954B;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f12967r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        p150o9.c cVar;
        Activity activity;
        super.onAttachedToWindow();
        this.f12960H = true;
        if (this.f12966N != null) {
            Context context = getContext();
            while (true) {
                cVar = null;
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                b bVar = this.f12966N;
                bVar.getClass();
                A a9 = bVar.f6586c;
                if (a9 != null) {
                    a9.e(null);
                }
                bVar.f6586c = AbstractC0405x.x(AbstractC0405x.b(AbstractC0405x.n(bVar.f6585b)), null, new y(bVar, activity, cVar, 1), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        A a9;
        super.onDetachedFromWindow();
        this.f12960H = true;
        b bVar = this.f12966N;
        if (bVar != null && (a9 = bVar.f6586c) != null) {
            a9.e(null);
        }
        ArrayList arrayList = this.f12962J;
        if (arrayList.size() > 0) {
            throw p.u(0, arrayList);
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = this.f12971v;
        c cVar = this.f12958F;
        if (!z11 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            cVar.getClass();
            this.f12959G = c.l(childAt, x9, y10);
        }
        if (!this.f12971v || (this.f12953A && actionMasked != 0)) {
            cVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            cVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f12953A = false;
            float x10 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.f12955C = x10;
            this.f12956D = y11;
            cVar.getClass();
            if (c.l(this.f12972w, (int) x10, (int) y11) && a(this.f12972w)) {
                z10 = true;
            }
            return !cVar.t(motionEvent) || z10;
        }
        if (actionMasked == 2) {
            float x11 = motionEvent.getX();
            float y12 = motionEvent.getY();
            float fAbs = Math.abs(x11 - this.f12955C);
            float fAbs2 = Math.abs(y12 - this.f12956D);
            if (fAbs > cVar.f7202b && fAbs2 > fAbs) {
                cVar.b();
                this.f12953A = true;
                return false;
            }
        }
        z10 = false;
        if (cVar.t(motionEvent)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        g gVar;
        int iWidth;
        p024c3.b bVar;
        f fVar;
        f fVar2 = f.f13075c;
        boolean zB = b();
        int i19 = i12 - i10;
        int paddingRight = zB ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f12960H) {
            this.f12973x = (this.f12971v && this.f12959G) ? 0.0f : 1.0f;
        }
        int i20 = paddingRight;
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                z11 = zB;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.f6595b) {
                    int i22 = i19 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i22) - i20) - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    this.f12975z = iMin;
                    int i23 = zB ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    z11 = zB;
                    eVar.f6596c = (measuredWidth / 2) + ((i20 + i23) + iMin) > i22;
                    float f3 = iMin;
                    int i24 = (int) (this.f12973x * f3);
                    i14 = i23 + i24 + i20;
                    this.f12973x = i24 / f3;
                } else {
                    z11 = zB;
                    if (!this.f12971v || (i15 = this.f12954B) == 0) {
                        i14 = paddingRight;
                    } else {
                        i16 = (int) ((1.0f - this.f12973x) * i15);
                        i14 = paddingRight;
                    }
                    if (z11) {
                        i18 = (i19 - i14) + i16;
                        i17 = i18 - measuredWidth;
                    } else {
                        i17 = i14 - i16;
                        i18 = i17 + measuredWidth;
                    }
                    childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                    gVar = this.f12964L;
                    if (gVar != null) {
                        bVar = gVar.f13082a;
                        if (bVar.f13446c - bVar.f13444a > bVar.f13447d - bVar.f13445b) {
                            fVar = f.f13076d;
                        } else {
                            fVar = fVar2;
                        }
                        if (fVar == fVar2 || !gVar.a()) {
                            iWidth = 0;
                        } else {
                            iWidth = this.f12964L.f13082a.a().width();
                        }
                    } else {
                        iWidth = 0;
                    }
                    paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                    i20 = i14;
                }
                i16 = 0;
                if (z11) {
                    i18 = (i19 - i14) + i16;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i14 - i16;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                gVar = this.f12964L;
                if (gVar != null) {
                    bVar = gVar.f13082a;
                    if (bVar.f13446c - bVar.f13444a > bVar.f13447d - bVar.f13445b) {
                        fVar = f.f13076d;
                    } else {
                        fVar = fVar2;
                    }
                    if (fVar == fVar2) {
                        iWidth = 0;
                    } else {
                        iWidth = 0;
                    }
                } else {
                    iWidth = 0;
                }
                paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                i20 = i14;
            }
            i21++;
            zB = z11;
        }
        if (this.f12960H) {
            if (this.f12971v && this.f12954B != 0) {
                d(this.f12973x);
            }
            f(this.f12972w);
        }
        this.f12960H = false;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[PHI: r17
      0x0089: PHI (r17v3 float) = (r17v1 float), (r17v4 float) binds: [B:19:0x007f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01af  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int paddingTop;
        int iMin;
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int i13;
        ArrayList arrayList;
        int i14;
        int i15;
        int minimumWidth;
        int iMax2;
        int i16;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z10;
        int i17;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        ?? r10 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f12972w = null;
        int i18 = 0;
        boolean z11 = false;
        int i19 = iMax3;
        float f3 = 0.0f;
        while (true) {
            i12 = 8;
            if (i18 >= childCount) {
                break;
            }
            View childAt = getChildAt(i18);
            e eVar = (e) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                eVar.f6596c = r10;
            } else {
                float f7 = eVar.f6594a;
                if (f7 > 0.0f) {
                    f3 += f7;
                    if (((ViewGroup.MarginLayoutParams) eVar).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), (int) r10);
                        i16 = ((ViewGroup.MarginLayoutParams) eVar).width;
                        if (i16 == -2) {
                            if (mode == 0) {
                                i17 = mode;
                            } else {
                                i17 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i17);
                        } else if (i16 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) eVar).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i19 -= measuredWidth;
                        if (i18 != 0) {
                            if (i19 < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            eVar.f6595b = z10;
                            z11 |= z10;
                            if (z10) {
                                this.f12972w = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), (int) r10);
                    i16 = ((ViewGroup.MarginLayoutParams) eVar).width;
                    if (i16 == -2) {
                        if (mode == 0) {
                            i17 = mode;
                        } else {
                            i17 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i17);
                    } else if (i16 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) eVar).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i19 -= measuredWidth2;
                    if (i18 != 0) {
                        if (i19 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        eVar.f6595b = z10;
                        z11 |= z10;
                        if (z10) {
                            this.f12972w = childAt;
                        }
                    }
                }
            }
            i18++;
            r10 = 0;
        }
        int i20 = 1;
        if (z11 || f3 > 0.0f) {
            int i21 = 0;
            while (i21 < childCount) {
                View childAt2 = getChildAt(i21);
                if (childAt2.getVisibility() == i12) {
                    i13 = i21;
                } else {
                    e eVar2 = (e) childAt2.getLayoutParams();
                    int i22 = ((ViewGroup.MarginLayoutParams) eVar2).width;
                    float f10 = eVar2.f6594a;
                    int measuredWidth3 = (i22 != 0 || f10 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z11) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (f10 > 0.0f) {
                        iMax = ((int) ((f10 * Math.max(0, i19)) / f3)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    e eVar3 = (e) childAt2.getLayoutParams();
                    i13 = i21;
                    int iMakeMeasureSpec3 = (((ViewGroup.MarginLayoutParams) eVar3).width != 0 || eVar3.f6594a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i11, paddingBottom, ((ViewGroup.MarginLayoutParams) eVar3).height);
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i21 = i13 + 1;
                i12 = 8;
            }
        }
        g gVar = this.f12964L;
        if (gVar == null || !gVar.a() || this.f12964L.f13082a.a().left == 0 || this.f12964L.f13082a.a().top != 0) {
            arrayList = null;
        } else {
            g gVar2 = this.f12964L;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i23 = iArr[0];
            Rect rect = new Rect(i23, iArr[1], getWidth() + i23, getWidth() + iArr[1]);
            Rect rect2 = new Rect(gVar2.f13082a.a());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 == null) {
                arrayList = null;
            } else {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z11) {
            int i24 = 0;
            while (i24 < childCount) {
                View childAt3 = getChildAt(i24);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i24);
                    e eVar4 = (e) childAt3.getLayoutParams();
                    int i25 = ((ViewGroup.MarginLayoutParams) eVar4).leftMargin + ((ViewGroup.MarginLayoutParams) eVar4).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) != i20) {
                        boolean z12 = childAt3 instanceof h;
                        if (z12) {
                            i15 = 0;
                            View childAt4 = ((h) childAt3).getChildAt(0);
                            WeakHashMap weakHashMap = S.f3689a;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            i15 = 0;
                            WeakHashMap weakHashMap2 = S.f3689a;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z12 ? ((h) childAt3).getChildAt(i15).getMinimumWidth() : childAt3.getMinimumWidth())) {
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i25, 1073741824), iMakeMeasureSpec4);
                    if (i24 != 0) {
                        i14 = 1;
                        eVar4.f6595b = true;
                        this.f12972w = childAt3;
                        z11 = true;
                    }
                    i24++;
                    i20 = i14;
                }
                i14 = 1;
                i24++;
                i20 = i14;
            }
        }
        boolean z13 = z11;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.f12971v = z13;
        c cVar = this.f12958F;
        if (cVar.f7201a == 0 || z13) {
            return;
        }
        cVar.a();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof P2.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        P2.g gVar = (P2.g) parcelable;
        super.onRestoreInstanceState(gVar.f6852r);
        if (gVar.f6597t) {
            if (!this.f12971v) {
                this.f12959G = true;
            }
            if (this.f12960H || e(0.0f)) {
                this.f12959G = true;
            }
        } else {
            if (!this.f12971v) {
                this.f12959G = false;
            }
            if (this.f12960H || e(1.0f)) {
                this.f12959G = false;
            }
        }
        this.f12959G = gVar.f6597t;
        setLockMode(gVar.f6598u);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        P2.g gVar = new P2.g(super.onSaveInstanceState());
        gVar.f6597t = this.f12971v ? c() : this.f12959G;
        gVar.f6598u = this.f12963K;
        return gVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f12960H = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12971v) {
            return super.onTouchEvent(motionEvent);
        }
        c cVar = this.f12958F;
        cVar.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f12955C = x9;
            this.f12956D = y10;
            return true;
        }
        if (actionMasked == 1 && a(this.f12972w)) {
            float x10 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f3 = x10 - this.f12955C;
            float f7 = y11 - this.f12956D;
            int i10 = cVar.f7202b;
            if ((f7 * f7) + (f3 * f3) < i10 * i10 && c.l(this.f12972w, (int) x10, (int) y11)) {
                if (!this.f12971v) {
                    this.f12959G = false;
                }
                if (this.f12960H || e(1.0f)) {
                    this.f12959G = false;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof h) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f12971v) {
            return;
        }
        this.f12959G = view == this.f12972w;
    }

    @Deprecated
    public void setCoveredFadeColor(int i10) {
        this.f12968s = i10;
    }

    public final void setLockMode(int i10) {
        this.f12963K = i10;
    }

    @Deprecated
    public void setPanelSlideListener(P2.f fVar) {
        if (fVar != null) {
            this.f12957E.add(fVar);
        }
    }

    public void setParallaxDistance(int i10) {
        this.f12954B = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f12969t = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f12970u = drawable;
    }

    @Deprecated
    public void setShadowResource(int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(getContext().getDrawable(i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(getContext().getDrawable(i10));
    }

    @Deprecated
    public void setSliderFadeColor(int i10) {
        this.f12967r = i10;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i10) {
        w dVar;
        Executor cVar;
        super(context, attributeSet, i10);
        this.f12967r = 0;
        this.f12973x = 1.0f;
        this.f12957E = new CopyOnWriteArrayList();
        this.f12960H = true;
        this.f12961I = new Rect();
        this.f12962J = new ArrayList();
        this.f12965M = new p248z6.c(23, this);
        float f3 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        S.o(this, new P2.c(this));
        setImportantForAccessibility(1);
        c cVar2 = new c(getContext(), this, new d(0, this));
        cVar2.f7202b = (int) (2.0f * cVar2.f7202b);
        this.f12958F = cVar2;
        cVar2.f7212n = f3 * 400.0f;
        int i11 = x.f13110a;
        z.f13113a.getClass();
        s sVar = null;
        try {
            WindowLayoutComponent windowLayoutComponentA = androidx.window.layout.j.a();
            dVar = windowLayoutComponentA == null ? null : new androidx.window.layout.d(windowLayoutComponentA);
        } catch (Throwable unused) {
        }
        if (dVar == null) {
            v vVar = v.f13106c;
            if (v.f13106c == null) {
                ReentrantLock reentrantLock = v.f13107d;
                reentrantLock.lock();
                try {
                    if (v.f13106c == null) {
                        try {
                            p024c3.e eVarB = q.b();
                            if (eVarB != null) {
                                p024c3.e eVar = p024c3.e.f13454w;
                                j.e(eVar, "other");
                                Object value = eVarB.f13459v.getValue();
                                j.d(value, "<get-bigInteger>(...)");
                                Object value2 = eVar.f13459v.getValue();
                                j.d(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    s sVar2 = new s(context);
                                    if (sVar2.e()) {
                                        sVar = sVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        v.f13106c = new v(sVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            dVar = v.f13106c;
            j.b(dVar);
        }
        t tVar = new t(dVar);
        androidx.window.layout.y.f13112b.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            cVar = a.c(context);
        } else {
            cVar = new E1.c(new Handler(context.getMainLooper()), 0);
        }
        setFoldingFeatureObserver(new b(tVar, cVar));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f6594a = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f6593d);
        eVar.f6594a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }
}
