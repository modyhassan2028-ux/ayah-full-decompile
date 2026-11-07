package E2;

import A.o1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: E2.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0135m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0124h f1715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f1716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M.k f1717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M.k f1718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Q f1719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1720f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1722i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1727o;

    public AbstractC0135m0() {
        O8.c cVar = new O8.c(this);
        p248z6.c cVar2 = new p248z6.c(4, this);
        this.f1717c = new M.k(cVar);
        this.f1718d = new M.k(cVar2);
        this.f1720f = false;
        this.g = false;
        this.f1721h = true;
        this.f1722i = true;
    }

    public static int A(View view) {
        Rect rect = ((C0137n0) view.getLayoutParams()).f1734b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int B(View view) {
        Rect rect = ((C0137n0) view.getLayoutParams()).f1734b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C0137n0) view.getLayoutParams()).f1733a.c();
    }

    public static C0133l0 I(Context context, AttributeSet attributeSet, int i10, int i11) {
        C0133l0 c0133l0 = new C0133l0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D2.a.f1162a, i10, i11);
        c0133l0.f1705a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0133l0.f1706b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0133l0.f1707c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0133l0.f1708d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0133l0;
    }

    public static boolean N(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void O(View view, int i10, int i11, int i12, int i13) {
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        Rect rect = c0137n0.f1734b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) c0137n0).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) c0137n0).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) c0137n0).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0137n0).bottomMargin);
    }

    public static int h(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int x(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, i10 - i12);
        if (z10) {
            if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                i11 = 0;
                i13 = 0;
            } else {
                i13 = iMax;
            }
        } else if (i13 >= 0) {
            i11 = 1073741824;
        } else if (i13 == -1) {
            i13 = iMax;
        } else if (i13 != -2) {
            i11 = 0;
            i13 = 0;
        } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
            i13 = iMax;
            i11 = Integer.MIN_VALUE;
        } else {
            i13 = iMax;
            i11 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public boolean A0() {
        return false;
    }

    public final boolean B0(View view, int i10, int i11, C0137n0 c0137n0) {
        return (this.f1721h && N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) c0137n0).width) && N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) c0137n0).height)) ? false : true;
    }

    public final int C() {
        RecyclerView recyclerView = this.f1716b;
        AbstractC0115c0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public abstract void C0(RecyclerView recyclerView, B0 b5, int i10);

    public final int D() {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void D0(Q q10) {
        Q q11 = this.f1719e;
        if (q11 != null && q10 != q11 && q11.f1608e) {
            q11.j();
        }
        this.f1719e = q10;
        RecyclerView recyclerView = this.f1716b;
        E0 e10 = recyclerView.f12917v0;
        e10.f1470x.removeCallbacks(e10);
        e10.f1466t.abortAnimation();
        if (q10.f1610h) {
            Log.w("RecyclerView", "An instance of " + q10.getClass().getSimpleName() + " was started more than once. Each instance of" + q10.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        q10.f1605b = recyclerView;
        q10.f1606c = this;
        int i10 = q10.f1604a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f12923y0.f1443a = i10;
        q10.f1608e = true;
        q10.f1607d = true;
        q10.f1609f = recyclerView.f12863E.r(i10);
        q10.f1605b.f12917v0.b();
        q10.f1610h = true;
    }

    public final int E() {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public boolean E0() {
        return false;
    }

    public final int F() {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(u0 u0Var, B0 b5) {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView == null || recyclerView.f12861D == null || !f()) {
            return 1;
        }
        return this.f1716b.f12861D.a();
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C0137n0) view.getLayoutParams()).f1734b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f1716b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f1716b.f12859C;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public boolean M() {
        return false;
    }

    public void P(int i10) {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            int iW = recyclerView.f12918w.w();
            for (int i11 = 0; i11 < iW; i11++) {
                recyclerView.f12918w.v(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void Q(int i10) {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            int iW = recyclerView.f12918w.w();
            for (int i11 = 0; i11 < iW; i11++) {
                recyclerView.f12918w.v(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public abstract void T(RecyclerView recyclerView);

    public abstract View U(View view, int i10, u0 u0Var, B0 b5);

    public void V(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1716b;
        u0 u0Var = recyclerView.f12912t;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1716b.canScrollVertically(-1) && !this.f1716b.canScrollHorizontally(-1) && !this.f1716b.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        AbstractC0115c0 abstractC0115c0 = this.f1716b.f12861D;
        if (abstractC0115c0 != null) {
            accessibilityEvent.setItemCount(abstractC0115c0.a());
        }
    }

    public void W(u0 u0Var, B0 b5, J1.g gVar) {
        if (this.f1716b.canScrollVertically(-1) || this.f1716b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            gVar.v(true);
            gVar.k(67108864, true);
        }
        if (this.f1716b.canScrollVertically(1) || this.f1716b.canScrollHorizontally(1)) {
            gVar.a(4096);
            gVar.v(true);
            gVar.k(67108864, true);
        }
        gVar.n(J1.e.a(J(u0Var, b5), y(u0Var, b5), 0));
    }

    public void X(u0 u0Var, B0 b5, View view, J1.g gVar) {
        gVar.o(J1.f.a(f() ? H(view) : 0, 1, e() ? H(view) : 0, 1, false, false));
    }

    public final void Y(View view, J1.g gVar) {
        F0 f0P = RecyclerView.P(view);
        if (f0P == null || f0P.i()) {
            return;
        }
        C0124h c0124h = this.f1715a;
        if (((ArrayList) c0124h.f1676e).contains(f0P.f1486a)) {
            return;
        }
        RecyclerView recyclerView = this.f1716b;
        X(recyclerView.f12912t, recyclerView.f12923y0, view, gVar);
    }

    public final void b(View view, int i10, boolean z10) {
        F0 f0P = RecyclerView.P(view);
        if (z10 || f0P.i()) {
            u.O o10 = (u.O) this.f1716b.f12920x.f5618s;
            Q0 q0A = (Q0) o10.get(f0P);
            if (q0A == null) {
                q0A = Q0.a();
                o10.put(f0P, q0A);
            }
            q0A.f1619a |= 1;
        } else {
            this.f1716b.f12920x.I(f0P);
        }
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        if (f0P.q() || f0P.j()) {
            if (f0P.j()) {
                f0P.f1497n.l(f0P);
            } else {
                f0P.j &= -33;
            }
            this.f1715a.c(view, i10, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f1716b) {
                C0124h c0124h = this.f1715a;
                o1 o1Var = (o1) c0124h.f1675d;
                int iIndexOfChild = ((C0111a0) c0124h.f1674c).f1640a.indexOfChild(view);
                int iC = (iIndexOfChild == -1 || o1Var.e(iIndexOfChild)) ? -1 : iIndexOfChild - o1Var.c(iIndexOfChild);
                if (i10 == -1) {
                    i10 = this.f1715a.w();
                }
                if (iC == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f1716b.indexOfChild(view));
                    throw new IllegalStateException(p245z2.a.C(this.f1716b, sb));
                }
                if (iC != i10) {
                    AbstractC0135m0 abstractC0135m0 = this.f1716b.f12863E;
                    View viewV = abstractC0135m0.v(iC);
                    if (viewV == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + abstractC0135m0.f1716b.toString());
                    }
                    abstractC0135m0.v(iC);
                    abstractC0135m0.f1715a.n(iC);
                    C0137n0 c0137n1 = (C0137n0) viewV.getLayoutParams();
                    F0 f0P2 = RecyclerView.P(viewV);
                    if (f0P2.i()) {
                        u.O o11 = (u.O) abstractC0135m0.f1716b.f12920x.f5618s;
                        Q0 q0A2 = (Q0) o11.get(f0P2);
                        if (q0A2 == null) {
                            q0A2 = Q0.a();
                            o11.put(f0P2, q0A2);
                        }
                        q0A2.f1619a = 1 | q0A2.f1619a;
                    } else {
                        abstractC0135m0.f1716b.f12920x.I(f0P2);
                    }
                    abstractC0135m0.f1715a.c(viewV, i10, c0137n1, f0P2.i());
                }
            } else {
                this.f1715a.a(view, i10, false);
                c0137n0.f1735c = true;
                Q q10 = this.f1719e;
                if (q10 != null && q10.f1608e) {
                    q10.f1605b.getClass();
                    F0 f0P3 = RecyclerView.P(view);
                    if ((f0P3 != null ? f0P3.c() : -1) == q10.f1604a) {
                        q10.f1609f = view;
                        if (RecyclerView.f12847U0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c0137n0.f1736d) {
            if (RecyclerView.f12847U0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c0137n0.f1733a);
            }
            f0P.f1486a.invalidate();
            c0137n0.f1736d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public final void d(Rect rect, View view) {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.Q(view));
        }
    }

    public abstract boolean e();

    public abstract void e0(u0 u0Var, B0 b5);

    public abstract boolean f();

    public abstract void f0(B0 b5);

    public boolean g(C0137n0 c0137n0) {
        return c0137n0 != null;
    }

    public Parcelable h0() {
        return null;
    }

    public boolean j0(int i10, Bundle bundle) {
        RecyclerView recyclerView = this.f1716b;
        return k0(recyclerView.f12912t, recyclerView.f12923y0, i10, bundle);
    }

    public abstract int k(B0 b5);

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r8
      0x0062: PHI (r8v8 int) = (r8v5 int), (r8v18 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean k0(u0 u0Var, B0 b5, int i10, Bundle bundle) {
        int iG;
        int iE;
        float f3;
        if (this.f1716b != null) {
            int iHeight = this.f1727o;
            int iWidth = this.f1726n;
            Rect rect = new Rect();
            if (this.f1716b.getMatrix().isIdentity() && this.f1716b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i10 == 4096) {
                iG = this.f1716b.canScrollVertically(1) ? (iHeight - G()) - D() : 0;
                if (this.f1716b.canScrollHorizontally(1)) {
                    iE = (iWidth - E()) - F();
                } else {
                    iE = 0;
                }
            } else if (i10 != 8192) {
                iG = 0;
                iE = 0;
            } else {
                iG = this.f1716b.canScrollVertically(-1) ? -((iHeight - G()) - D()) : 0;
                if (this.f1716b.canScrollHorizontally(-1)) {
                    iE = -((iWidth - E()) - F());
                } else {
                    iE = 0;
                }
            }
            if (iG != 0 || iE != 0) {
                if (bundle != null) {
                    f3 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                    if (f3 < 0.0f) {
                        if (RecyclerView.f12846T0) {
                            throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f3 + ")");
                        }
                    }
                } else {
                    f3 = 1.0f;
                }
                if (Float.compare(f3, Float.POSITIVE_INFINITY) != 0) {
                    if (Float.compare(1.0f, f3) != 0 && Float.compare(0.0f, f3) != 0) {
                        iE = (int) (iE * f3);
                        iG = (int) (iG * f3);
                    }
                    this.f1716b.n0(iE, iG, true);
                    return true;
                }
                RecyclerView recyclerView = this.f1716b;
                AbstractC0115c0 abstractC0115c0 = recyclerView.f12861D;
                if (abstractC0115c0 != null) {
                    if (i10 == 4096) {
                        recyclerView.o0(abstractC0115c0.a() - 1);
                        return true;
                    }
                    if (i10 != 8192) {
                        return true;
                    }
                    recyclerView.o0(0);
                    return true;
                }
            }
        }
        return false;
    }

    public abstract int l(B0 b5);

    public final void l0(u0 u0Var) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            if (!RecyclerView.P(v(iW)).p()) {
                View viewV = v(iW);
                o0(iW);
                u0Var.h(viewV);
            }
        }
    }

    public abstract int m(B0 b5);

    public final void m0(u0 u0Var) {
        ArrayList arrayList = u0Var.f1778a;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((F0) arrayList.get(i10)).f1486a;
            F0 f0P = RecyclerView.P(view);
            if (!f0P.p()) {
                f0P.o(false);
                if (f0P.k()) {
                    this.f1716b.removeDetachedView(view, false);
                }
                AbstractC0129j0 abstractC0129j0 = this.f1716b.f12897g0;
                if (abstractC0129j0 != null) {
                    abstractC0129j0.d(f0P);
                }
                f0P.o(true);
                F0 f0P2 = RecyclerView.P(view);
                f0P2.f1497n = null;
                f0P2.f1498o = false;
                f0P2.j &= -33;
                u0Var.i(f0P2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = u0Var.f1779b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f1716b.invalidate();
        }
    }

    public abstract int n(B0 b5);

    public final void n0(View view, u0 u0Var) {
        C0124h c0124h = this.f1715a;
        C0111a0 c0111a0 = (C0111a0) c0124h.f1674c;
        int i10 = c0124h.f1673b;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0124h.f1673b = 1;
            c0124h.f1677f = view;
            int iIndexOfChild = c0111a0.f1640a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((o1) c0124h.f1675d).j(iIndexOfChild)) {
                    c0124h.J(view);
                }
                c0111a0.c(iIndexOfChild);
            }
            c0124h.f1673b = 0;
            c0124h.f1677f = null;
            u0Var.h(view);
        } catch (Throwable th) {
            c0124h.f1673b = 0;
            c0124h.f1677f = null;
            throw th;
        }
    }

    public abstract int o(B0 b5);

    public final void o0(int i10) {
        if (v(i10) != null) {
            C0124h c0124h = this.f1715a;
            C0111a0 c0111a0 = (C0111a0) c0124h.f1674c;
            int i11 = c0124h.f1673b;
            if (i11 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i11 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iX = c0124h.x(i10);
                View childAt = c0111a0.f1640a.getChildAt(iX);
                if (childAt != null) {
                    c0124h.f1673b = 1;
                    c0124h.f1677f = childAt;
                    if (((o1) c0124h.f1675d).j(iX)) {
                        c0124h.J(childAt);
                    }
                    c0111a0.c(iX);
                }
            } finally {
                c0124h.f1673b = 0;
                c0124h.f1677f = null;
            }
        }
    }

    public abstract int p(B0 b5);

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    public boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iE = E();
        int iG = G();
        int iF = this.f1726n - F();
        int iD = this.f1727o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iE;
        int iMin = Math.min(0, i10);
        int i11 = top - iG;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iF;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iD);
        if (this.f1716b.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iE2 = E();
                int iG2 = G();
                int iF2 = this.f1726n - F();
                int iD2 = this.f1727o - D();
                Rect rect2 = this.f1716b.f12855A;
                z(rect2, focusedChild);
                if (rect2.left - i13 < iF2 && rect2.right - i13 > iE2 && rect2.top - i14 < iD2 && rect2.bottom - i14 > iG2) {
                    if (i13 == 0) {
                    }
                    if (z10) {
                        recyclerView.scrollBy(i13, i14);
                        return true;
                    }
                    recyclerView.n0(i13, i14, false);
                    return true;
                }
            }
        } else if (i13 == 0 || i14 != 0) {
            if (z10) {
                recyclerView.scrollBy(i13, i14);
                return true;
            }
            recyclerView.n0(i13, i14, false);
            return true;
        }
        return false;
    }

    public final void q(u0 u0Var) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            F0 f0P = RecyclerView.P(viewV);
            if (f0P.p()) {
                if (RecyclerView.f12847U0) {
                    Log.d("RecyclerView", "ignoring view " + f0P);
                }
            } else if (!f0P.g() || f0P.i() || this.f1716b.f12861D.f1652s) {
                v(iW);
                this.f1715a.n(iW);
                u0Var.j(viewV);
                this.f1716b.f12920x.I(f0P);
            } else {
                o0(iW);
                u0Var.i(f0P);
            }
        }
    }

    public final void q0() {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public View r(int i10) {
        int iW = w();
        for (int i11 = 0; i11 < iW; i11++) {
            View viewV = v(i11);
            F0 f0P = RecyclerView.P(viewV);
            if (f0P != null && f0P.c() == i10 && !f0P.p() && (this.f1716b.f12923y0.g || !f0P.i())) {
                return viewV;
            }
        }
        return null;
    }

    public abstract int r0(int i10, u0 u0Var, B0 b5);

    public abstract C0137n0 s();

    public abstract void s0(int i10);

    public C0137n0 t(Context context, AttributeSet attributeSet) {
        return new C0137n0(context, attributeSet);
    }

    public abstract int t0(int i10, u0 u0Var, B0 b5);

    public C0137n0 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0137n0) {
            return new C0137n0((C0137n0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0137n0((ViewGroup.MarginLayoutParams) layoutParams) : new C0137n0(layoutParams);
    }

    public final void u0(RecyclerView recyclerView) {
        v0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View v(int i10) {
        C0124h c0124h = this.f1715a;
        if (c0124h != null) {
            return c0124h.v(i10);
        }
        return null;
    }

    public final void v0(int i10, int i11) {
        this.f1726n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f1724l = mode;
        if (mode == 0 && !RecyclerView.f12850X0) {
            this.f1726n = 0;
        }
        this.f1727o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f1725m = mode2;
        if (mode2 != 0 || RecyclerView.f12850X0) {
            return;
        }
        this.f1727o = 0;
    }

    public final int w() {
        C0124h c0124h = this.f1715a;
        if (c0124h != null) {
            return c0124h.w();
        }
        return 0;
    }

    public void w0(Rect rect, int i10, int i11) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.f1716b;
        WeakHashMap weakHashMap = I1.S.f3689a;
        this.f1716b.setMeasuredDimension(h(i10, iF, recyclerView.getMinimumWidth()), h(i11, iD, this.f1716b.getMinimumHeight()));
    }

    public final void x0(int i10, int i11) {
        int iW = w();
        if (iW == 0) {
            this.f1716b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iW; i16++) {
            View viewV = v(i16);
            Rect rect = this.f1716b.f12855A;
            z(rect, viewV);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f1716b.f12855A.set(i15, i13, i12, i14);
        w0(this.f1716b.f12855A, i10, i11);
    }

    public int y(u0 u0Var, B0 b5) {
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView == null || recyclerView.f12861D == null || !e()) {
            return 1;
        }
        return this.f1716b.f12861D.a();
    }

    public final void y0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1716b = null;
            this.f1715a = null;
            this.f1726n = 0;
            this.f1727o = 0;
        } else {
            this.f1716b = recyclerView;
            this.f1715a = recyclerView.f12918w;
            this.f1726n = recyclerView.getWidth();
            this.f1727o = recyclerView.getHeight();
        }
        this.f1724l = 1073741824;
        this.f1725m = 1073741824;
    }

    public void z(Rect rect, View view) {
        boolean z10 = RecyclerView.f12846T0;
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        Rect rect2 = c0137n0.f1734b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0137n0).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0137n0).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0137n0).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0137n0).bottomMargin);
    }

    public final boolean z0(View view, int i10, int i11, C0137n0 c0137n0) {
        return (!view.isLayoutRequested() && this.f1721h && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) c0137n0).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) c0137n0).height)) ? false : true;
    }

    public void R() {
    }

    public void a0() {
    }

    public void S(RecyclerView recyclerView) {
    }

    public void g0(Parcelable parcelable) {
    }

    public void i0(int i10) {
    }

    public void Z(int i10, int i11) {
    }

    public void b0(int i10, int i11) {
    }

    public void c0(int i10, int i11) {
    }

    public void d0(int i10, int i11) {
    }

    public void j(int i10, A a9) {
    }

    public void i(int i10, int i11, B0 b5, A a9) {
    }
}
