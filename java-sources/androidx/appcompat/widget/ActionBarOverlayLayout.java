package androidx.appcompat.widget;

import E2.C0127i0;
import F7.e;
import I1.B0;
import I1.G;
import I1.I;
import I1.InterfaceC0263p;
import I1.InterfaceC0264q;
import I1.S;
import I1.m0;
import I1.o0;
import I1.p0;
import I1.q0;
import I1.r0;
import I1.y0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.ayah.R;
import java.util.WeakHashMap;
import p084i.J;
import p130n.j;
import p140o.k;
import p140o.v;
import p151p.C1236d;
import p151p.C1238e;
import p151p.C1250k;
import p151p.InterfaceC1234c;
import p151p.InterfaceC1239e0;
import p151p.InterfaceC1241f0;
import p151p.RunnableC1232b;
import p151p.i1;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1239e0, InterfaceC0263p, InterfaceC0264q {
    public static final int[] T = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final B0 U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final Rect f11449V;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11450A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11451B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f11452C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f11453D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f11454E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Rect f11455F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f11456G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public B0 f11457H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public B0 f11458I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public B0 f11459J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public B0 f11460K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public InterfaceC1234c f11461L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public OverScroller f11462M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ViewPropertyAnimator f11463N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final e f11464O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final RunnableC1232b f11465P;
    public final RunnableC1232b Q;
    public final C0127i0 R;
    public final C1238e S;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ContentFrameLayout f11468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ActionBarContainer f11469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC1241f0 f11470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f11471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11473y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11474z;

    static {
        r0 o0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            o0Var = new q0();
        } else if (i10 >= 30) {
            o0Var = new p0();
        } else {
            o0Var = i10 >= 29 ? new o0() : new m0();
        }
        o0Var.g(A1.c.c(0, 1, 0, 1));
        U = o0Var.b();
        f11449V = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean c(View view, Rect rect, boolean z10) {
        boolean z11;
        C1236d c1236d = (C1236d) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) c1236d).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c1236d).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) c1236d).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) c1236d).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) c1236d).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) c1236d).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) c1236d).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) c1236d).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // I1.InterfaceC0263p
    public final void a(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // I1.InterfaceC0263p
    public final void b(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1236d;
    }

    public final void d() {
        removeCallbacks(this.f11465P);
        removeCallbacks(this.Q);
        ViewPropertyAnimator viewPropertyAnimator = this.f11463N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f11471w != null) {
            if (this.f11469u.getVisibility() == 0) {
                translationY = (int) (this.f11469u.getTranslationY() + this.f11469u.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f11471w.setBounds(0, translationY, getWidth(), this.f11471w.getIntrinsicHeight() + translationY);
            this.f11471w.draw(canvas);
        }
    }

    public final void e(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(T);
        this.f11466r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f11471w = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f11462M = new OverScroller(context);
    }

    @Override // I1.InterfaceC0263p
    public final void f(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // I1.InterfaceC0264q
    public final void g(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        i(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1236d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1236d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f11469u;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0127i0 c0127i0 = this.R;
        return c0127i0.f1682b | c0127i0.f1681a;
    }

    public CharSequence getTitle() {
        k();
        return ((i1) this.f11470v).f20674a.getTitle();
    }

    public final void h(int i10) {
        k();
        if (i10 == 2) {
            ((i1) this.f11470v).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i10 == 5) {
            ((i1) this.f11470v).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // I1.InterfaceC0263p
    public final void i(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // I1.InterfaceC0263p
    public final boolean j(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public final void k() {
        InterfaceC1241f0 wrapper;
        if (this.f11468t == null) {
            this.f11468t = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f11469u = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1241f0) {
                wrapper = (InterfaceC1241f0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f11470v = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        B0 b0H = B0.h(this, windowInsets);
        boolean zC = c(this.f11469u, new Rect(b0H.b(), b0H.d(), b0H.c(), b0H.a()), false);
        WeakHashMap weakHashMap = S.f3689a;
        Rect rect = this.f11453D;
        I.b(this, b0H, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        y0 y0Var = b0H.f3671a;
        B0 b0N = y0Var.n(i10, i11, i12, i13);
        this.f11457H = b0N;
        boolean z10 = true;
        if (!this.f11458I.equals(b0N)) {
            this.f11458I = this.f11457H;
            zC = true;
        }
        Rect rect2 = this.f11454E;
        if (rect2.equals(rect)) {
            z10 = zC;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return y0Var.a().f3671a.c().f3671a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e(getContext());
        WeakHashMap weakHashMap = S.f3689a;
        G.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C1236d c1236d = (C1236d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c1236d).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c1236d).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        B0 b5;
        int i12;
        r0 m0Var;
        k();
        measureChildWithMargins(this.f11469u, i10, 0, i11, 0);
        C1236d c1236d = (C1236d) this.f11469u.getLayoutParams();
        int iMax = Math.max(0, this.f11469u.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1236d).leftMargin + ((ViewGroup.MarginLayoutParams) c1236d).rightMargin);
        int iMax2 = Math.max(0, this.f11469u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1236d).topMargin + ((ViewGroup.MarginLayoutParams) c1236d).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f11469u.getMeasuredState());
        WeakHashMap weakHashMap = S.f3689a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.f11466r;
            if (this.f11473y && this.f11469u.getTabContainer() != null) {
                measuredHeight += this.f11466r;
            }
        } else {
            measuredHeight = this.f11469u.getVisibility() != 8 ? this.f11469u.getMeasuredHeight() : 0;
        }
        Rect rect = this.f11453D;
        Rect rect2 = this.f11455F;
        rect2.set(rect);
        this.f11459J = this.f11457H;
        if (this.f11472x || z10) {
            A1.c cVarC = A1.c.c(this.f11459J.b(), this.f11459J.d() + measuredHeight, this.f11459J.c(), this.f11459J.a());
            b5 = this.f11459J;
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 34) {
                m0Var = new q0(b5);
            } else if (i12 >= 30) {
                m0Var = new p0(b5);
            } else if (i12 >= 29) {
                m0Var = new o0(b5);
            } else {
                m0Var = new m0(b5);
            }
            m0Var.g(cVarC);
            this.f11459J = m0Var.b();
        } else {
            C1238e c1238e = this.S;
            B0 b10 = U;
            Rect rect3 = this.f11456G;
            I.b(c1238e, b10, rect3);
            if (rect3.equals(f11449V)) {
                A1.c cVarC2 = A1.c.c(this.f11459J.b(), this.f11459J.d() + measuredHeight, this.f11459J.c(), this.f11459J.a());
                b5 = this.f11459J;
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 34) {
                    m0Var = new q0(b5);
                } else if (i12 >= 30) {
                    m0Var = new p0(b5);
                } else if (i12 >= 29) {
                    m0Var = new o0(b5);
                } else {
                    m0Var = new m0(b5);
                }
                m0Var.g(cVarC2);
                this.f11459J = m0Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f11459J = this.f11459J.f3671a.n(0, measuredHeight, 0, 0);
            }
        }
        c(this.f11468t, rect2, true);
        if (!this.f11460K.equals(this.f11459J)) {
            B0 b11 = this.f11459J;
            this.f11460K = b11;
            S.b(this.f11468t, b11);
        }
        measureChildWithMargins(this.f11468t, i10, 0, i11, 0);
        C1236d c1236d2 = (C1236d) this.f11468t.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f11468t.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1236d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1236d2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f11468t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1236d2).topMargin + ((ViewGroup.MarginLayoutParams) c1236d2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f11468t.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f7, boolean z10) {
        if (!this.f11474z || !z10) {
            return false;
        }
        this.f11462M.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f11462M.getFinalY() > this.f11469u.getHeight()) {
            d();
            this.Q.run();
        } else {
            d();
            this.f11465P.run();
        }
        this.f11450A = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f11451B + i11;
        this.f11451B = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        J j;
        j jVar;
        this.R.f1681a = i10;
        this.f11451B = getActionBarHideOffset();
        d();
        InterfaceC1234c interfaceC1234c = this.f11461L;
        if (interfaceC1234c == null || (jVar = (j = (J) interfaceC1234c).f16546w) == null) {
            return;
        }
        jVar.a();
        j.f16546w = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f11469u.getVisibility() != 0) {
            return false;
        }
        return this.f11474z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f11474z || this.f11450A) {
            return;
        }
        if (this.f11451B <= this.f11469u.getHeight()) {
            d();
            postDelayed(this.f11465P, 600L);
        } else {
            d();
            postDelayed(this.Q, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.f11452C ^ i10;
        this.f11452C = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        InterfaceC1234c interfaceC1234c = this.f11461L;
        if (interfaceC1234c != null) {
            J j = (J) interfaceC1234c;
            j.f16542s = !z11;
            if (z10 || !z11) {
                if (j.f16543t) {
                    j.f16543t = false;
                    j.i0(true);
                }
            } else if (!j.f16543t) {
                j.f16543t = true;
                j.i0(true);
            }
        }
        if ((i11 & 256) == 0 || this.f11461L == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f3689a;
        G.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f11467s = i10;
        InterfaceC1234c interfaceC1234c = this.f11461L;
        if (interfaceC1234c != null) {
            ((J) interfaceC1234c).f16541r = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        d();
        this.f11469u.setTranslationY(-Math.max(0, Math.min(i10, this.f11469u.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1234c interfaceC1234c) {
        this.f11461L = interfaceC1234c;
        if (getWindowToken() != null) {
            ((J) this.f11461L).f16541r = this.f11467s;
            int i10 = this.f11452C;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = S.f3689a;
                G.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f11473y = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f11474z) {
            this.f11474z = z10;
            if (z10) {
                return;
            }
            d();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        k();
        i1 i1Var = (i1) this.f11470v;
        i1Var.f20677d = i10 != 0 ? Y2.a.E(i1Var.f20674a.getContext(), i10) : null;
        i1Var.c();
    }

    public void setLogo(int i10) {
        k();
        i1 i1Var = (i1) this.f11470v;
        i1Var.f20678e = i10 != 0 ? Y2.a.E(i1Var.f20674a.getContext(), i10) : null;
        i1Var.c();
    }

    @Override // p151p.InterfaceC1239e0
    public void setMenu(Menu menu, v vVar) {
        k();
        i1 i1Var = (i1) this.f11470v;
        Toolbar toolbar = i1Var.f20674a;
        if (i1Var.f20684m == null) {
            C1250k c1250k = new C1250k(toolbar.getContext());
            i1Var.f20684m = c1250k;
            c1250k.f20715z = R.id.action_menu_presenter;
        }
        C1250k c1250k2 = i1Var.f20684m;
        c1250k2.f20711v = vVar;
        toolbar.setMenu((k) menu, c1250k2);
    }

    @Override // p151p.InterfaceC1239e0
    public void setMenuPrepared() {
        k();
        ((i1) this.f11470v).f20683l = true;
    }

    public void setOverlayMode(boolean z10) {
        this.f11472x = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // p151p.InterfaceC1239e0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((i1) this.f11470v).f20682k = callback;
    }

    @Override // p151p.InterfaceC1239e0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        i1 i1Var = (i1) this.f11470v;
        if (i1Var.g) {
            return;
        }
        Toolbar toolbar = i1Var.f20674a;
        i1Var.f20680h = charSequence;
        if ((i1Var.f20675b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i1Var.g) {
                S.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11467s = 0;
        this.f11453D = new Rect();
        this.f11454E = new Rect();
        this.f11455F = new Rect();
        this.f11456G = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        B0 b5 = B0.f3670b;
        this.f11457H = b5;
        this.f11458I = b5;
        this.f11459J = b5;
        this.f11460K = b5;
        this.f11464O = new e(12, this);
        this.f11465P = new RunnableC1232b(this, 0);
        this.Q = new RunnableC1232b(this, 1);
        e(context);
        this.R = new C0127i0();
        C1238e c1238e = new C1238e(context);
        c1238e.setWillNotDraw(true);
        this.S = c1238e;
        addView(c1238e);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1236d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        i1 i1Var = (i1) this.f11470v;
        i1Var.f20677d = drawable;
        i1Var.c();
    }
}
