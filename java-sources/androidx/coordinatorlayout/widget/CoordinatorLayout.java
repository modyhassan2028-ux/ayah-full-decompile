package androidx.coordinatorlayout.widget;

import Aa.a;
import E2.C0127i0;
import E2.C0140p;
import F7.q;
import H1.d;
import I1.B0;
import I1.G;
import I1.I;
import I1.InterfaceC0263p;
import I1.InterfaceC0264q;
import I1.S;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p151p.C1256n;
import u.O;
import u1.b;
import u1.c;
import u1.e;
import u1.f;
import u1.g;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0263p, InterfaceC0264q {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f12289K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Class[] f12290L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final ThreadLocal f12291M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final C0140p f12292N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final d f12293O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f12294A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f12295B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public q f12296C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12297D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B0 f12298E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12299F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f12300G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f12301H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1256n f12302I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0127i0 f12303J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f12304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f12305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f12306t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f12307u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f12308v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f12309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12311y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f12312z;

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f12289K = r10 != null ? r10.getName() : null;
        f12292N = new C0140p(14);
        f12290L = new Class[]{Context.class, AttributeSet.class};
        f12291M = new ThreadLocal();
        f12293O = new d(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public static void A(int i10, View view) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f22813i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = S.f3689a;
            view.offsetLeftAndRight(i10 - i11);
            eVar.f22813i = i10;
        }
    }

    public static void B(int i10, View view) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = S.f3689a;
            view.offsetTopAndBottom(i10 - i11);
            eVar.j = i10;
        }
    }

    public static Rect k() {
        Rect rect = (Rect) f12293O.a();
        return rect == null ? new Rect() : rect;
    }

    public static void q(int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = eVar.f22808c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = eVar.f22809d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e s(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f22807b) {
            if (view instanceof u1.a) {
                b behavior = ((u1.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                b bVar = eVar.f22806a;
                if (bVar != behavior) {
                    if (bVar != null) {
                        bVar.j();
                    }
                    eVar.f22806a = behavior;
                    eVar.f22807b = true;
                    if (behavior != null) {
                        behavior.g(eVar);
                    }
                }
                eVar.f22807b = true;
                return eVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar2 = (b) cVar.value().getDeclaredConstructor(null).newInstance(null);
                    b bVar3 = eVar.f22806a;
                    if (bVar3 != bVar2) {
                        if (bVar3 != null) {
                            bVar3.j();
                        }
                        eVar.f22806a = bVar2;
                        eVar.f22807b = true;
                        if (bVar2 != null) {
                            bVar2.g(eVar);
                        }
                    }
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            eVar.f22807b = true;
        }
        return eVar;
    }

    public final void C() {
        WeakHashMap weakHashMap = S.f3689a;
        if (!getFitsSystemWindows()) {
            I.m(this, null);
            return;
        }
        if (this.f12302I == null) {
            this.f12302I = new C1256n(6, this);
        }
        I.m(this, this.f12302I);
        setSystemUiVisibility(1280);
    }

    @Override // I1.InterfaceC0263p
    public final void a(View view, View view2, int i10, int i11) {
        C0127i0 c0127i0 = this.f12303J;
        if (i11 == 1) {
            c0127i0.f1682b = i10;
        } else {
            c0127i0.f1681a = i10;
        }
        this.f12295B = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // I1.InterfaceC0263p
    public final void b(View view, int i10, int i11, int[] iArr, int i12) {
        b bVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i12) && (bVar = eVar.f22806a) != null) {
                    int[] iArr2 = this.f12308v;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            u(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        b bVar = ((e) view.getLayoutParams()).f22806a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12300G;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // I1.InterfaceC0263p
    public final void f(int i10, View view) {
        C0127i0 c0127i0 = this.f12303J;
        if (i10 == 1) {
            c0127i0.f1682b = 0;
        } else {
            c0127i0.f1681a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i10)) {
                b bVar = eVar.f22806a;
                if (bVar != null) {
                    bVar.u(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    eVar.f22816m = false;
                } else if (i10 == 1) {
                    eVar.f22817n = false;
                }
                eVar.f22818o = false;
            }
        }
        this.f12295B = null;
    }

    @Override // I1.InterfaceC0264q
    public final void g(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z10 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i14) && (bVar = eVar.f22806a) != null) {
                    int[] iArr2 = this.f12308v;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.p(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            u(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        y();
        return DesugarCollections.unmodifiableList(this.f12304r);
    }

    public final B0 getLastWindowInsets() {
        return this.f12298E;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0127i0 c0127i0 = this.f12303J;
        return c0127i0.f1682b | c0127i0.f1681a;
    }

    public Drawable getStatusBarBackground() {
        return this.f12300G;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // I1.InterfaceC0263p
    public final void i(View view, int i10, int i11, int i12, int i13, int i14) {
        g(view, i10, i11, i12, i13, 0, this.f12309w);
    }

    @Override // I1.InterfaceC0263p
    public final boolean j(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f22806a;
                if (bVar != null) {
                    boolean zT = bVar.t(this, childAt, view, view2, i10, i11);
                    z10 |= zT;
                    if (i11 == 0) {
                        eVar.f22816m = zT;
                    } else if (i11 == 1) {
                        eVar.f22817n = zT;
                    }
                } else if (i11 == 0) {
                    eVar.f22816m = false;
                } else if (i11 == 1) {
                    eVar.f22817n = false;
                }
            }
        }
        return z10;
    }

    public final void l(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void m(View view) {
        List list = (List) ((O) this.f12305s.f555s).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            b bVar = ((e) view2.getLayoutParams()).f22806a;
            if (bVar != null) {
                bVar.h(this, view2, view);
            }
        }
    }

    public final void n(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            p(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList o(View view) {
        O o10 = (O) this.f12305s.f555s;
        int i10 = o10.f22703t;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) o10.i(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o10.f(i11));
            }
        }
        ArrayList arrayList3 = this.f12307u;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(false);
        int i10 = 1;
        if (this.f12297D) {
            if (this.f12296C == null) {
                this.f12296C = new q(i10, this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f12296C);
        }
        if (this.f12298E == null) {
            WeakHashMap weakHashMap = S.f3689a;
            if (getFitsSystemWindows()) {
                G.c(this);
            }
        }
        this.f12311y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        if (this.f12297D && this.f12296C != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f12296C);
        }
        View view = this.f12295B;
        if (view != null) {
            f(0, view);
        }
        this.f12311y = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f12299F || this.f12300G == null) {
            return;
        }
        B0 b5 = this.f12298E;
        int iD = b5 != null ? b5.d() : 0;
        if (iD > 0) {
            this.f12300G.setBounds(0, 0, getWidth(), iD);
            this.f12300G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z(true);
        }
        boolean zX = x(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zX;
        }
        z(true);
        return zX;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b bVar;
        WeakHashMap weakHashMap = S.f3689a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f12304r;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f22806a) == null || !bVar.l(this, view, layoutDirection))) {
                v(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        b bVar;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        ArrayList arrayList;
        int i20;
        View view;
        int i21;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.y();
        int childCount = coordinatorLayout.getChildCount();
        int i22 = 0;
        loop0: while (true) {
            i12 = 1;
            if (i22 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i22);
            O o10 = (O) coordinatorLayout.f12305s.f555s;
            int i23 = o10.f22703t;
            for (int i24 = 0; i24 < i23; i24++) {
                ArrayList arrayList2 = (ArrayList) o10.i(i24);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z10 = true;
                    break loop0;
                }
            }
            i22++;
        }
        if (z10 != coordinatorLayout.f12297D) {
            if (z10) {
                if (coordinatorLayout.f12311y) {
                    if (coordinatorLayout.f12296C == null) {
                        coordinatorLayout.f12296C = new q(i12, coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f12296C);
                }
                coordinatorLayout.f12297D = true;
            } else {
                if (coordinatorLayout.f12311y && coordinatorLayout.f12296C != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f12296C);
                }
                coordinatorLayout.f12297D = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = S.f3689a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i25 = paddingLeft + paddingRight;
        int i26 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z13 = coordinatorLayout.f12298E != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f12304r;
        int size3 = arrayList3.size();
        int i27 = 0;
        int iCombineMeasuredStates = 0;
        while (i27 < size3) {
            View view2 = (View) arrayList3.get(i27);
            int i28 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i14 = size3;
                i21 = i27;
                i16 = paddingLeft;
                suggestedMinimumWidth = i28;
                z11 = false;
                i18 = paddingRight;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i29 = eVar.f22810e;
                if (i29 < 0 || mode == 0) {
                    i13 = suggestedMinimumHeight;
                } else {
                    int iR = coordinatorLayout.r(i29);
                    int i30 = eVar.f22808c;
                    if (i30 == 0) {
                        i30 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, layoutDirection) & 7;
                    i13 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z12) && !(absoluteGravity == 5 && z12)) {
                        if ((absoluteGravity == 5 && !z12) || (absoluteGravity == 3 && z12)) {
                            iMax = Math.max(0, iR - paddingLeft);
                        }
                        if (z13 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iC = coordinatorLayout.f12298E.c() + coordinatorLayout.f12298E.b();
                            int iA = coordinatorLayout.f12298E.a() + coordinatorLayout.f12298E.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        bVar = eVar.f22806a;
                        if (bVar != null) {
                            z11 = false;
                            i16 = paddingLeft;
                            i17 = i28;
                            i18 = paddingRight;
                            i19 = i13;
                            arrayList = arrayList3;
                            int i31 = iMakeMeasureSpec;
                            i21 = i27;
                            int i32 = iMakeMeasureSpec2;
                            zM = bVar.m(this, view2, i31, i15, i32);
                            view = view2;
                            iMakeMeasureSpec = i31;
                            i20 = i32;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i17, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int iMax3 = Math.max(i19, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i16 = paddingLeft;
                            i17 = i28;
                            z11 = false;
                            i18 = paddingRight;
                            i19 = i13;
                            arrayList = arrayList3;
                            i20 = iMakeMeasureSpec2;
                            view = view2;
                            i21 = i27;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i15, i20, 0);
                        int iMax4 = Math.max(i17, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax5 = Math.max(i19, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iR);
                    }
                    int i33 = size3;
                    i15 = iMax;
                    i14 = i33;
                    if (z13) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    bVar = eVar.f22806a;
                    if (bVar != null) {
                        z11 = false;
                        i16 = paddingLeft;
                        i17 = i28;
                        i18 = paddingRight;
                        i19 = i13;
                        arrayList = arrayList3;
                        int i34 = iMakeMeasureSpec;
                        i21 = i27;
                        int i35 = iMakeMeasureSpec2;
                        zM = bVar.m(this, view2, i34, i15, i35);
                        view = view2;
                        iMakeMeasureSpec = i34;
                        i20 = i35;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i17, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax7 = Math.max(i19, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i16 = paddingLeft;
                        i17 = i28;
                        z11 = false;
                        i18 = paddingRight;
                        i19 = i13;
                        arrayList = arrayList3;
                        i20 = iMakeMeasureSpec2;
                        view = view2;
                        i21 = i27;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i15, i20, 0);
                    int iMax8 = Math.max(i17, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax9 = Math.max(i19, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i14 = size3;
                i15 = 0;
                if (z13) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                bVar = eVar.f22806a;
                if (bVar != null) {
                    z11 = false;
                    i16 = paddingLeft;
                    i17 = i28;
                    i18 = paddingRight;
                    i19 = i13;
                    arrayList = arrayList3;
                    int i36 = iMakeMeasureSpec;
                    i21 = i27;
                    int i37 = iMakeMeasureSpec2;
                    zM = bVar.m(this, view2, i36, i15, i37);
                    view = view2;
                    iMakeMeasureSpec = i36;
                    i20 = i37;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i17, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax11 = Math.max(i19, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i16 = paddingLeft;
                    i17 = i28;
                    z11 = false;
                    i18 = paddingRight;
                    i19 = i13;
                    arrayList = arrayList3;
                    i20 = iMakeMeasureSpec2;
                    view = view2;
                    i21 = i27;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i15, i20, 0);
                int iMax12 = Math.max(i17, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int iMax13 = Math.max(i19, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i27 = i21 + 1;
            paddingLeft = i16;
            paddingRight = i18;
            size3 = i14;
            arrayList3 = arrayList;
        }
        int i38 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i38), View.resolveSizeAndState(suggestedMinimumHeight, i11, i38 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f7, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f22806a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f7) {
        b bVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f22806a) != null) {
                    zN |= bVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        b(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        i(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f6852r);
        SparseArray sparseArray = fVar.f22820t;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            b bVar = s(childAt).f22806a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f22806a;
            if (id != -1 && bVar != null && (parcelableS = bVar.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        fVar.f22820t = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return j(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        f(0, view);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zX;
        boolean zV;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12294A == null) {
            zX = x(motionEvent, 1);
            if (!zX) {
                zV = false;
            }
            motionEventObtain = null;
            if (this.f12294A == null) {
                zV |= super.onTouchEvent(motionEvent);
            } else if (zX) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zV;
            }
            z(false);
            return zV;
        }
        zX = false;
        b bVar = ((e) this.f12294A.getLayoutParams()).f22806a;
        if (bVar != null) {
            zV = bVar.v(this, this.f12294A, motionEvent);
        } else {
            zV = false;
        }
        motionEventObtain = null;
        if (this.f12294A == null) {
            zV |= super.onTouchEvent(motionEvent);
        } else if (zX) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        z(false);
        return zV;
    }

    public final void p(Rect rect, View view) {
        ThreadLocal threadLocal = g.f22821a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f22821a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f22822b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int r(int i10) {
        int[] iArr = this.f12312z;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        b bVar = ((e) view.getLayoutParams()).f22806a;
        if (bVar == null || !bVar.q(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f12310x) {
            return;
        }
        z(false);
        this.f12310x = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        C();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f12301H = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f12300G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f12300G = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f12300G.setState(getDrawableState());
                }
                Drawable drawable3 = this.f12300G;
                WeakHashMap weakHashMap = S.f3689a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f12300G.setVisible(getVisibility() == 0, false);
                this.f12300G.setCallback(this);
            }
            WeakHashMap weakHashMap2 = S.f3689a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? getContext().getDrawable(i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f12300G;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f12300G.setVisible(z10, false);
    }

    public final boolean t(View view, int i10, int i11) {
        d dVar = f12293O;
        Rect rectK = k();
        p(rectK, view);
        try {
            return rectK.contains(i10, i11);
        } finally {
            rectK.setEmpty();
            dVar.c(rectK);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void u(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean zH;
        boolean z10;
        boolean z11;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        e eVar;
        int i19;
        View view;
        b bVar;
        WeakHashMap weakHashMap = S.f3689a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f12304r;
        int size = arrayList2.size();
        Rect rectK = k();
        Rect rectK2 = k();
        Rect rectK3 = k();
        int i20 = 0;
        while (true) {
            d dVar = f12293O;
            if (i20 >= size) {
                Rect rect2 = rectK3;
                rectK.setEmpty();
                dVar.c(rectK);
                rectK2.setEmpty();
                dVar.c(rectK2);
                rect2.setEmpty();
                dVar.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i20);
            e eVar2 = (e) view2.getLayoutParams();
            if (i10 != 0 || view2.getVisibility() != 8) {
                int i21 = 0;
                while (i21 < i20) {
                    if (eVar2.f22815l == ((View) arrayList2.get(i21))) {
                        e eVar3 = (e) view2.getLayoutParams();
                        if (eVar3.f22814k != null) {
                            Rect rectK4 = k();
                            Rect rectK5 = k();
                            e eVar4 = eVar2;
                            Rect rectK6 = k();
                            p(rectK4, eVar3.f22814k);
                            n(view2, rectK5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            eVar = eVar4;
                            i19 = i21;
                            layoutDirection = layoutDirection;
                            view = view3;
                            q(layoutDirection, rectK4, rectK6, eVar3, measuredWidth, measuredHeight);
                            boolean z12 = (rectK6.left == rectK5.left && rectK6.top == rectK5.top) ? false : true;
                            l(eVar3, rectK6, measuredWidth, measuredHeight);
                            int i22 = rectK6.left - rectK5.left;
                            int i23 = rectK6.top - rectK5.top;
                            if (i22 != 0) {
                                WeakHashMap weakHashMap2 = S.f3689a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap weakHashMap3 = S.f3689a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z12 && (bVar = eVar3.f22806a) != null) {
                                bVar.h(this, view, eVar3.f22814k);
                            }
                            rectK4.setEmpty();
                            dVar.c(rectK4);
                            rectK5.setEmpty();
                            dVar.c(rectK5);
                            rectK6.setEmpty();
                            dVar.c(rectK6);
                        } else {
                            eVar = eVar2;
                            i19 = i21;
                            view = view2;
                        }
                    } else {
                        eVar = eVar2;
                        i19 = i21;
                        view = view2;
                    }
                    i21 = i19 + 1;
                    eVar2 = eVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i20 = i20;
                    rectK3 = rectK3;
                }
                ArrayList arrayList3 = arrayList2;
                e eVar5 = eVar2;
                int i24 = size;
                Rect rect3 = rectK3;
                i11 = i20;
                View view4 = view2;
                n(view4, rectK2, true);
                if (eVar5.g != 0 && !rectK2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.g, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rectK.top = Math.max(rectK.top, rectK2.bottom);
                    } else if (i25 == 80) {
                        rectK.bottom = Math.max(rectK.bottom, getHeight() - rectK2.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rectK.left = Math.max(rectK.left, rectK2.right);
                    } else if (i26 == 5) {
                        rectK.right = Math.max(rectK.right, getWidth() - rectK2.left);
                    }
                }
                if (eVar5.f22812h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = S.f3689a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        e eVar6 = (e) view4.getLayoutParams();
                        b bVar2 = eVar6.f22806a;
                        Rect rectK7 = k();
                        Rect rectK8 = k();
                        rectK8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (bVar2 == null || !bVar2.e(rectK7, view4)) {
                            rectK7.set(rectK8);
                        } else if (!rectK8.contains(rectK7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectK7.toShortString() + " | Bounds:" + rectK8.toShortString());
                        }
                        rectK8.setEmpty();
                        dVar.c(rectK8);
                        if (rectK7.isEmpty()) {
                            rectK7.setEmpty();
                            dVar.c(rectK7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.f22812h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (rectK7.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.j) >= (i18 = rectK.top)) {
                                z10 = false;
                            } else {
                                B(i18 - i17, view4);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectK7.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.j) < (i16 = rectK.bottom)) {
                                B(height - i16, view4);
                                z10 = true;
                            }
                            if (!z10) {
                                B(0, view4);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (rectK7.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.f22813i) >= (i15 = rectK.left)) {
                                z11 = false;
                            } else {
                                A(i15 - i14, view4);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectK7.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.f22813i) < (i13 = rectK.right)) {
                                A(width - i13, view4);
                                z11 = true;
                            }
                            if (!z11) {
                                A(0, view4);
                            }
                            rectK7.setEmpty();
                            dVar.c(rectK7);
                        }
                    }
                }
                if (i10 != 2) {
                    rect = rect3;
                    rect.set(((e) view4.getLayoutParams()).f22819p);
                    if (rect.equals(rectK2)) {
                        arrayList = arrayList3;
                        i12 = i24;
                    } else {
                        ((e) view4.getLayoutParams()).f22819p.set(rectK2);
                    }
                } else {
                    rect = rect3;
                }
                int i27 = i11 + 1;
                i12 = i24;
                while (true) {
                    arrayList = arrayList3;
                    if (i27 >= i12) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i27);
                    e eVar7 = (e) view5.getLayoutParams();
                    b bVar3 = eVar7.f22806a;
                    if (bVar3 != null && bVar3.f(view5, view4)) {
                        if (i10 == 0 && eVar7.f22818o) {
                            eVar7.f22818o = false;
                        } else {
                            if (i10 != 2) {
                                zH = bVar3.h(this, view5, view4);
                            } else {
                                bVar3.i(this, view4);
                                zH = true;
                            }
                            if (i10 == 1) {
                                eVar7.f22818o = zH;
                            }
                        }
                    }
                    i27++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i12 = size;
                rect = rectK3;
                i11 = i20;
            }
            i20 = i11 + 1;
            rectK3 = rect;
            size = i12;
            arrayList2 = arrayList;
        }
    }

    public final void v(int i10, View view) {
        int i11;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f22814k;
        if (view2 == null && eVar.f22811f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f12293O;
        if (view2 != null) {
            Rect rectK = k();
            Rect rectK2 = k();
            try {
                p(rectK, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                q(i10, rectK, rectK2, eVar2, measuredWidth, measuredHeight);
                l(eVar2, rectK2, measuredWidth, measuredHeight);
                view.layout(rectK2.left, rectK2.top, rectK2.right, rectK2.bottom);
                return;
            } finally {
                rectK.setEmpty();
                dVar.c(rectK);
                rectK2.setEmpty();
                dVar.c(rectK2);
            }
        }
        int i12 = eVar.f22810e;
        if (i12 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            Rect rectK3 = k();
            rectK3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f12298E != null) {
                WeakHashMap weakHashMap = S.f3689a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectK3.left = this.f12298E.b() + rectK3.left;
                    rectK3.top = this.f12298E.d() + rectK3.top;
                    rectK3.right -= this.f12298E.c();
                    rectK3.bottom -= this.f12298E.a();
                }
            }
            Rect rectK4 = k();
            int i13 = eVar3.f22808c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectK3, rectK4, i10);
            view.layout(rectK4.left, rectK4.top, rectK4.right, rectK4.bottom);
            rectK3.setEmpty();
            dVar.c(rectK3);
            rectK4.setEmpty();
            dVar.c(rectK4);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i14 = eVar4.f22808c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int iR = r(i12) - measuredWidth2;
        if (i15 == 1) {
            iR += measuredWidth2 / 2;
        } else if (i15 == 5) {
            iR += measuredWidth2;
        }
        if (i16 != 16) {
            i11 = i16 != 80 ? 0 : measuredHeight2;
        } else {
            i11 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iR, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12300G;
    }

    public final void w(int i10, int i11, int i12, View view) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public final boolean x(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f12306t;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        C0140p c0140p = f12292N;
        if (c0140p != null) {
            Collections.sort(arrayList, c0140p);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            b bVar = ((e) view.getLayoutParams()).f22806a;
            if (zK && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        bVar.k(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        bVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && bVar != null) {
                if (i10 == 0) {
                    zK = bVar.k(this, view, motionEvent);
                } else if (i10 == 1) {
                    zK = bVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.f12294A = view;
                }
            }
        }
        arrayList.clear();
        return zK;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void y() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.y():void");
    }

    public final void z(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVar = ((e) childAt.getLayoutParams()).f22806a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    bVar.k(this, childAt, motionEventObtain);
                } else {
                    bVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f12294A = null;
        this.f12310x = false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f12304r = new ArrayList();
        this.f12305s = new a(19);
        this.f12306t = new ArrayList();
        this.f12307u = new ArrayList();
        this.f12308v = new int[2];
        this.f12309w = new int[2];
        this.f12303J = new C0127i0();
        int[] iArr = p188t1.a.f22581a;
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f12312z = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr2 = coordinatorLayout.f12312z;
                iArr2[i11] = (int) (iArr2[i11] * f3);
            }
        }
        coordinatorLayout.f12300G = typedArray.getDrawable(1);
        typedArray.recycle();
        C();
        super.setOnHierarchyChangeListener(new u1.d(this));
        WeakHashMap weakHashMap = S.f3689a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
