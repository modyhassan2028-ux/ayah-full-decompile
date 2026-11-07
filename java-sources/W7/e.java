package W7;

import H7.C0233g;
import H7.H;
import I1.S;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends LinearLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f9647t = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f9648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TabLayout f9649s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TabLayout tabLayout, Context context) {
        super(context);
        this.f9649s = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        TabLayout tabLayout = this.f9649s;
        if (tabLayout.f15233m0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i10);
            com.google.android.material.tabs.a aVar = tabLayout.f15223c0;
            Drawable drawable = tabLayout.f15208F;
            aVar.getClass();
            RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
            tabLayout.f15235r = i10;
        }
    }

    public final void b(int i10) {
        TabLayout tabLayout = this.f9649s;
        Rect bounds = tabLayout.f15208F.getBounds();
        tabLayout.f15208F.setBounds(bounds.left, 0, bounds.right, i10);
        requestLayout();
    }

    public final void c(View view, View view2, float f3) {
        TabLayout tabLayout = this.f9649s;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f15208F;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f15208F.getBounds().bottom);
        } else {
            tabLayout.f15223c0.b(tabLayout, view, view2, f3, tabLayout.f15208F);
        }
        WeakHashMap weakHashMap = S.f3689a;
        postInvalidateOnAnimation();
    }

    public final void d(int i10, int i11, boolean z10) {
        TabLayout tabLayout = this.f9649s;
        if (tabLayout.f15235r == i10) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i10);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f15235r = i10;
        C0233g c0233g = new C0233g(this, childAt, childAt2);
        if (!z10) {
            this.f9648r.removeAllUpdateListeners();
            this.f9648r.addUpdateListener(c0233g);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9648r = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f15224d0);
        valueAnimator.setDuration(i11);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c0233g);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f9649s;
        int iHeight = tabLayout.f15208F.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f15208F.getIntrinsicHeight();
        }
        int i10 = tabLayout.S;
        if (i10 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i10 != 1) {
            height = 0;
            if (i10 != 2) {
                iHeight = i10 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f15208F.getBounds().width() > 0) {
            Rect bounds = tabLayout.f15208F.getBounds();
            tabLayout.f15208F.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f15208F.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ValueAnimator valueAnimator = this.f9648r;
        TabLayout tabLayout = this.f9649s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f15235r == -1) {
            tabLayout.f15235r = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f15235r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f9649s;
        boolean z10 = true;
        if (tabLayout.Q == 1 || tabLayout.T == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) H.g(getContext(), 16)) * 2)) {
                boolean z11 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z11 = true;
                    }
                }
                z10 = z11;
            } else {
                tabLayout.Q = 0;
                tabLayout.k(false);
            }
            if (z10) {
                super.onMeasure(i10, i11);
            }
        }
    }
}
