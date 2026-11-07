package p148o7;

import B9.a;
import I1.B0;
import I1.S;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.WeakHashMap;
import u1.b;
import u1.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f20365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f20366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20368w;

    public h() {
        this.f20365t = new Rect();
        this.f20366u = new Rect();
        this.f20367v = 0;
    }

    @Override // u1.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout appBarLayoutZ;
        B0 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 != -1 && i13 != -2) || (appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.o(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap weakHashMap = S.f3689a;
            if (appBarLayoutZ.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = appBarLayoutZ.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutZ.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.w(i10, i11, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i13 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    @Override // p148o7.i
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout appBarLayoutZ = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.o(view));
        if (appBarLayoutZ == null) {
            coordinatorLayout.v(i10, view);
            this.f20367v = 0;
            return;
        }
        e eVar = (e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int bottom = appBarLayoutZ.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int bottom2 = ((appBarLayoutZ.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        Rect rect = this.f20365t;
        rect.set(paddingLeft, bottom, width, bottom2);
        B0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = S.f3689a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i11 = eVar.f22808c;
        if (i11 == 0) {
            i11 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f20366u;
        Gravity.apply(i11, measuredWidth, measuredHeight, rect, rect2, i10);
        int iY = y(appBarLayoutZ);
        view.layout(rect2.left, rect2.top - iY, rect2.right, rect2.bottom - iY);
        this.f20367v = rect2.top - appBarLayoutZ.getBottom();
    }

    public final int y(View view) {
        int i10;
        if (this.f20368w == 0) {
            return 0;
        }
        float f3 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            b bVar = ((e) appBarLayout.getLayoutParams()).f22806a;
            int iY = bVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) bVar).y() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iY > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f3 = (iY / i10) + 1.0f;
            }
        }
        int i11 = this.f20368w;
        return a.i((int) (f3 * i11), 0, i11);
    }

    public h(int i10) {
        super(0);
        this.f20365t = new Rect();
        this.f20366u = new Rect();
        this.f20367v = 0;
    }
}
