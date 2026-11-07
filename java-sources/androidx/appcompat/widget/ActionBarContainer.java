package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ayah.R;
import p151p.C1230a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f11419A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ScrollingTabContainerView f11421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f11422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f11423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f11424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f11425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f11426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f11427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11428z;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11424v;
        if (drawable != null && drawable.isStateful()) {
            this.f11424v.setState(getDrawableState());
        }
        Drawable drawable2 = this.f11425w;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f11425w.setState(getDrawableState());
        }
        Drawable drawable3 = this.f11426x;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f11426x.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f11421s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11424v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f11425w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f11426x;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11422t = findViewById(R.id.action_bar);
        this.f11423u = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f11420r || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        ScrollingTabContainerView scrollingTabContainerView = this.f11421s;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f11427y) {
            Drawable drawable2 = this.f11426x;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f11424v != null) {
                if (this.f11422t.getVisibility() == 0) {
                    this.f11424v.setBounds(this.f11422t.getLeft(), this.f11422t.getTop(), this.f11422t.getRight(), this.f11422t.getBottom());
                } else {
                    View view = this.f11423u;
                    if (view == null || view.getVisibility() != 0) {
                        this.f11424v.setBounds(0, 0, 0, 0);
                    } else {
                        this.f11424v.setBounds(this.f11423u.getLeft(), this.f11423u.getTop(), this.f11423u.getRight(), this.f11423u.getBottom());
                    }
                }
                z12 = true;
            }
            this.f11428z = z13;
            if (!z13 || (drawable = this.f11425w) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f11422t == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f11419A) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f11422t == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        ScrollingTabContainerView scrollingTabContainerView = this.f11421s;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f11422t;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f11423u;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f11423u);
        } else {
            iA = a(this.f11422t);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f11421s) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f11424v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f11424v);
        }
        this.f11424v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f11422t;
            if (view != null) {
                this.f11424v.setBounds(view.getLeft(), this.f11422t.getTop(), this.f11422t.getRight(), this.f11422t.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f11427y ? !(this.f11424v != null || this.f11425w != null) : this.f11426x == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f11426x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f11426x);
        }
        this.f11426x = drawable;
        boolean z10 = this.f11427y;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f11426x) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f11424v != null || this.f11425w != null) : this.f11426x == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f11425w;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f11425w);
        }
        this.f11425w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f11428z && (drawable2 = this.f11425w) != null) {
                drawable2.setBounds(this.f11421s.getLeft(), this.f11421s.getTop(), this.f11421s.getRight(), this.f11421s.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f11427y ? !(this.f11424v != null || this.f11425w != null) : this.f11426x == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f11421s;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f11421s = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f11420r = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f11424v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f11425w;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f11426x;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f11424v;
        boolean z10 = this.f11427y;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f11425w && this.f11428z) {
            return true;
        }
        return (drawable == this.f11426x && z10) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1230a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p073h.a.f16380a);
        boolean z10 = false;
        this.f11424v = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f11425w = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f11419A = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f11427y = true;
            this.f11426x = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f11427y ? !(this.f11424v != null || this.f11425w != null) : this.f11426x == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
