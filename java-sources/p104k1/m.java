package p104k1;

import I1.B0;
import I1.I;
import I1.S;
import I1.r;
import Z.C0672b;
import Z.C0681f0;
import Z.C0698o;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.WeakHashMap;
import p094j1.a;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractComposeView implements r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0681f0 f18929A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f18930B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f18931C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f18932D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f18933E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Window f18934z;

    public m(Context context, Window window) {
        super(context, null, 6, 0);
        this.f18934z = window;
        this.f18929A = C0672b.r(k.f18927a);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(this, this);
        S.r(this, new a(this, 1));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(C0698o c0698o) {
        c0698o.T(1735448596);
        ((e) this.f18929A.getValue()).invoke(c0698o, 0);
        c0698o.p(false);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void e(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i14 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i15 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i10, int i11) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        Window window = this.f18934z;
        int i12 = (mode != Integer.MIN_VALUE || this.f18930B || this.f18931C || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = size - paddingRight;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - paddingBottom;
        int i15 = i14 >= 0 ? i14 : 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f18930B || this.f18931C || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f18933E;
    }

    @Override // I1.r
    public final B0 p(View view, B0 b5) {
        if (!this.f18931C) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return b5.f3671a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return b5;
    }
}
