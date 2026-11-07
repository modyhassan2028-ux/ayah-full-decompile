package androidx.viewpager.widget;

import Z2.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f12977G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f12978H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f12979I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f12980J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f12981K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f12982L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Paint f12983M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Rect f12984N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f12985O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f12986P;
    public boolean Q;
    public final int R;
    public boolean S;
    public float T;
    public float U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f12987V;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void c(int i10, float f3, boolean z10) {
        int height = getHeight();
        TextView textView = this.f12996t;
        int left = textView.getLeft();
        int i11 = this.f12982L;
        int right = textView.getRight() + i11;
        int i12 = height - this.f12978H;
        Rect rect = this.f12984N;
        rect.set(left - i11, i12, right, height);
        super.c(i10, f3, z10);
        this.f12985O = (int) (Math.abs(f3 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i11, i12, textView.getRight() + i11, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f12986P;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f12981K);
    }

    public int getTabIndicatorColor() {
        return this.f12977G;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f12996t;
        int left = textView.getLeft();
        int i10 = this.f12982L;
        int i11 = left - i10;
        int right = textView.getRight() + i10;
        int i12 = height - this.f12978H;
        int i13 = (this.f12985O << 24) | (this.f12977G & 16777215);
        Paint paint = this.f12983M;
        paint.setColor(i13);
        float f3 = height;
        canvas.drawRect(i11, i12, right, f3, paint);
        if (this.f12986P) {
            paint.setColor((this.f12977G & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.R, getWidth() - getPaddingRight(), f3, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.S) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.T = x9;
            this.U = y10;
            this.S = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f12996t;
            int left = textView.getLeft();
            int i10 = this.f12982L;
            if (x9 < left - i10) {
                ViewPager viewPager = this.f12994r;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                return true;
            }
            if (x9 > textView.getRight() + i10) {
                ViewPager viewPager2 = this.f12994r;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x9 - this.T);
            float f3 = this.f12987V;
            if (fAbs > f3 || Math.abs(y10 - this.U) > f3) {
                this.S = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        if (this.Q) {
            return;
        }
        this.f12986P = (i10 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.Q) {
            return;
        }
        this.f12986P = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        if (this.Q) {
            return;
        }
        this.f12986P = i10 == 0;
    }

    public void setDrawFullUnderline(boolean z10) {
        this.f12986P = z10;
        this.Q = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f12979I;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(int i10) {
        this.f12977G = i10;
        this.f12983M.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i10) {
        setTabIndicatorColor(getContext().getColor(i10));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i10) {
        int i11 = this.f12980J;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f12983M = paint;
        this.f12984N = new Rect();
        this.f12985O = 255;
        this.f12986P = false;
        this.Q = false;
        int i10 = this.f12993D;
        this.f12977G = i10;
        paint.setColor(i10);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f12978H = (int) ((3.0f * f3) + 0.5f);
        this.f12979I = (int) ((6.0f * f3) + 0.5f);
        this.f12980J = (int) (64.0f * f3);
        this.f12982L = (int) ((16.0f * f3) + 0.5f);
        this.R = (int) ((1.0f * f3) + 0.5f);
        this.f12981K = (int) ((f3 * 32.0f) + 0.5f);
        this.f12987V = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f12995s.setFocusable(true);
        this.f12995s.setOnClickListener(new b(this, 0));
        this.f12997u.setFocusable(true);
        this.f12997u.setOnClickListener(new b(this, 1));
        if (getBackground() == null) {
            this.f12986P = true;
        }
    }
}
