package androidx.viewpager2.widget;

import Aa.a;
import E2.AbstractC0115c0;
import E2.AbstractC0129j0;
import E2.AbstractC0135m0;
import I1.S;
import X4.c;
import Z0.B;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import p014b3.b;
import p014b3.d;
import p014b3.e;
import p014b3.f;
import p014b3.g;
import p014b3.h;
import p014b3.i;
import p014b3.j;
import p014b3.l;
import p014b3.m;
import p014b3.n;
import p014b3.o;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public n f13038A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public m f13039B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public f f13040C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public b f13041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B f13042E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public d f13043F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public AbstractC0129j0 f13044G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13045H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f13046I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f13047J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public a f13048K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f13049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f13050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f13051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f13054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f13055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13056y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Parcelable f13057z;

    public ViewPager2(Context context) {
        super(context);
        this.f13049r = new Rect();
        this.f13050s = new Rect();
        this.f13051t = new b();
        this.f13053v = false;
        this.f13054w = new g(0, this);
        this.f13056y = -1;
        this.f13044G = null;
        this.f13045H = false;
        this.f13046I = true;
        this.f13047J = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        aVar.f557u = this;
        aVar.f554r = new c(aVar);
        aVar.f555s = new B(3, aVar);
        this.f13048K = aVar;
        n nVar = new n(this, context);
        this.f13038A = nVar;
        nVar.setId(View.generateViewId());
        this.f13038A.setDescendantFocusability(131072);
        j jVar = new j(this);
        this.f13055x = jVar;
        this.f13038A.setLayoutManager(jVar);
        this.f13038A.setScrollingTouchSlop(1);
        int[] iArr = p004a3.a.f11161a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        S.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f13038A.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            n nVar2 = this.f13038A;
            i iVar = new i();
            if (nVar2.T == null) {
                nVar2.T = new ArrayList();
            }
            nVar2.T.add(iVar);
            f fVar = new f(this);
            this.f13040C = fVar;
            this.f13042E = new B(2, fVar);
            m mVar = new m(this);
            this.f13039B = mVar;
            mVar.a(this.f13038A);
            this.f13038A.j(this.f13040C);
            b bVar = new b();
            this.f13041D = bVar;
            this.f13040C.f13215a = bVar;
            h hVar = new h(this, 0);
            h hVar2 = new h(this, 1);
            ((ArrayList) bVar.f13207b).add(hVar);
            ((ArrayList) this.f13041D.f13207b).add(hVar2);
            a aVar2 = this.f13048K;
            n nVar3 = this.f13038A;
            aVar2.getClass();
            nVar3.setImportantForAccessibility(2);
            aVar2.f556t = new g(1, aVar2);
            ViewPager2 viewPager2 = (ViewPager2) aVar2.f557u;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f13041D.f13207b).add(this.f13051t);
            d dVar = new d(this.f13055x);
            this.f13043F = dVar;
            ((ArrayList) this.f13041D.f13207b).add(dVar);
            n nVar4 = this.f13038A;
            attachViewToParent(nVar4, 0, nVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean b() {
        return this.f13055x.f1716b.getLayoutDirection() == 1;
    }

    public final void c() {
        AbstractC0115c0 adapter;
        if (this.f13056y == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f13057z != null) {
            this.f13057z = null;
        }
        int iMax = Math.max(0, Math.min(this.f13056y, adapter.a() - 1));
        this.f13052u = iMax;
        this.f13056y = -1;
        this.f13038A.l0(iMax);
        this.f13048K.J();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f13038A.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f13038A.canScrollVertically(i10);
    }

    public final void d(int i10, boolean z10) {
        b bVar;
        AbstractC0115c0 adapter = getAdapter();
        if (adapter == null) {
            if (this.f13056y != -1) {
                this.f13056y = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.a() - 1);
        int i11 = this.f13052u;
        if (iMin == i11 && this.f13040C.f13220f == 0) {
            return;
        }
        if (iMin == i11 && z10) {
            return;
        }
        double d5 = i11;
        this.f13052u = iMin;
        this.f13048K.J();
        f fVar = this.f13040C;
        if (fVar.f13220f != 0) {
            fVar.e();
            e eVar = fVar.g;
            d5 = ((double) eVar.f13212a) + ((double) eVar.f13213b);
        }
        f fVar2 = this.f13040C;
        fVar2.getClass();
        fVar2.f13219e = z10 ? 2 : 3;
        boolean z11 = fVar2.f13222i != iMin;
        fVar2.f13222i = iMin;
        fVar2.c(2);
        if (z11 && (bVar = fVar2.f13215a) != null) {
            bVar.c(iMin);
        }
        if (!z10) {
            this.f13038A.l0(iMin);
            return;
        }
        double d9 = iMin;
        if (Math.abs(d9 - d5) <= 3.0d) {
            this.f13038A.o0(iMin);
            return;
        }
        this.f13038A.l0(d9 > d5 ? iMin - 3 : iMin + 3);
        n nVar = this.f13038A;
        nVar.post(new F1.a(iMin, nVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof o) {
            int i10 = ((o) parcelable).f13232r;
            sparseArray.put(this.f13038A.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e() {
        m mVar = this.f13039B;
        if (mVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewE = mVar.e(this.f13055x);
        if (viewE == null) {
            return;
        }
        this.f13055x.getClass();
        int iH = AbstractC0135m0.H(viewE);
        if (iH != this.f13052u && getScrollState() == 0) {
            this.f13041D.c(iH);
        }
        this.f13053v = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f13048K.getClass();
        this.f13048K.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC0115c0 getAdapter() {
        return this.f13038A.getAdapter();
    }

    public int getCurrentItem() {
        return this.f13052u;
    }

    public int getItemDecorationCount() {
        return this.f13038A.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f13047J;
    }

    public int getOrientation() {
        return this.f13055x.f12835p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        n nVar = this.f13038A;
        if (getOrientation() == 0) {
            height = nVar.getWidth() - nVar.getPaddingLeft();
            paddingBottom = nVar.getPaddingRight();
        } else {
            height = nVar.getHeight() - nVar.getPaddingTop();
            paddingBottom = nVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f13040C.f13220f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f13048K.f557u;
        if (viewPager2.getAdapter() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iA = viewPager2.getAdapter().a();
            iA2 = 1;
        } else {
            iA2 = viewPager2.getAdapter().a();
            iA = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) J1.e.a(iA, iA2, 0).f4215a);
        AbstractC0115c0 adapter = viewPager2.getAdapter();
        if (adapter == null || (iA3 = adapter.a()) == 0 || !viewPager2.f13046I) {
            return;
        }
        if (viewPager2.f13052u > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f13052u < iA3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f13038A.getMeasuredWidth();
        int measuredHeight = this.f13038A.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f13049r;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f13050s;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f13038A.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f13053v) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f13038A, i10, i11);
        int measuredWidth = this.f13038A.getMeasuredWidth();
        int measuredHeight = this.f13038A.getMeasuredHeight();
        int measuredState = this.f13038A.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.getSuperState());
        this.f13056y = oVar.f13233s;
        this.f13057z = oVar.f13234t;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f13232r = this.f13038A.getId();
        int i10 = this.f13056y;
        if (i10 == -1) {
            i10 = this.f13052u;
        }
        oVar.f13233s = i10;
        Parcelable parcelable = this.f13057z;
        if (parcelable != null) {
            oVar.f13234t = parcelable;
            return oVar;
        }
        this.f13038A.getAdapter();
        return oVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        this.f13048K.getClass();
        if (i10 != 8192 && i10 != 4096) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a aVar = this.f13048K;
        ViewPager2 viewPager2 = (ViewPager2) aVar.f557u;
        if (i10 != 8192 && i10 != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i10 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager3 = (ViewPager2) aVar.f557u;
        if (viewPager3.f13046I) {
            viewPager3.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(AbstractC0115c0 abstractC0115c0) {
        AbstractC0115c0 adapter = this.f13038A.getAdapter();
        a aVar = this.f13048K;
        if (adapter != null) {
            adapter.f1651r.unregisterObserver((g) aVar.f556t);
        } else {
            aVar.getClass();
        }
        g gVar = this.f13054w;
        if (adapter != null) {
            adapter.f1651r.unregisterObserver(gVar);
        }
        this.f13038A.setAdapter(abstractC0115c0);
        this.f13052u = 0;
        c();
        a aVar2 = this.f13048K;
        aVar2.J();
        if (abstractC0115c0 != null) {
            abstractC0115c0.f1651r.registerObserver((g) aVar2.f556t);
        }
        if (abstractC0115c0 != null) {
            abstractC0115c0.f1651r.registerObserver(gVar);
        }
    }

    public void setCurrentItem(int i10) {
        setCurrentItem(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f13048K.J();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f13047J = i10;
        this.f13038A.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f13055x.f1(i10);
        this.f13048K.J();
    }

    public void setPageTransformer(l lVar) {
        if (lVar != null) {
            if (!this.f13045H) {
                this.f13044G = this.f13038A.getItemAnimator();
                this.f13045H = true;
            }
            this.f13038A.setItemAnimator(null);
        } else if (this.f13045H) {
            this.f13038A.setItemAnimator(this.f13044G);
            this.f13044G = null;
            this.f13045H = false;
        }
        d dVar = this.f13043F;
        if (lVar == ((l) dVar.f13211c)) {
            return;
        }
        dVar.f13211c = lVar;
        if (lVar == null) {
            return;
        }
        f fVar = this.f13040C;
        fVar.e();
        e eVar = fVar.g;
        double d5 = ((double) eVar.f13212a) + ((double) eVar.f13213b);
        int i10 = (int) d5;
        float f3 = (float) (d5 - ((double) i10));
        this.f13043F.b(i10, f3, Math.round(getPageSize() * f3));
    }

    public void setUserInputEnabled(boolean z10) {
        this.f13046I = z10;
        this.f13048K.J();
    }

    public void setCurrentItem(int i10, boolean z10) {
        Object obj = this.f13042E.f10875s;
        d(i10, z10);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13049r = new Rect();
        this.f13050s = new Rect();
        this.f13051t = new b();
        this.f13053v = false;
        this.f13054w = new g(0, this);
        this.f13056y = -1;
        this.f13044G = null;
        this.f13045H = false;
        this.f13046I = true;
        this.f13047J = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13049r = new Rect();
        this.f13050s = new Rect();
        this.f13051t = new b();
        this.f13053v = false;
        this.f13054w = new g(0, this);
        this.f13056y = -1;
        this.f13044G = null;
        this.f13045H = false;
        this.f13046I = true;
        this.f13047J = -1;
        a(context, attributeSet);
    }
}
