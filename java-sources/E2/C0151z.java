package E2;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: E2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0151z extends AbstractC0131k0 implements InterfaceC0143q0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f1797C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f1798D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1799A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RunnableC0147v f1800B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f1803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f1804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1806f;
    public final StateListDrawable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f1807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1808i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1814p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f1817s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f1824z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1815q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1816r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1818t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1819u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1820v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1821w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f1822x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f1823y = new int[2];

    public C0151z(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        int i13 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1824z = valueAnimatorOfFloat;
        this.f1799A = 0;
        RunnableC0147v runnableC0147v = new RunnableC0147v(i13, this);
        this.f1800B = runnableC0147v;
        C0148w c0148w = new C0148w(this, i13);
        this.f1803c = stateListDrawable;
        this.f1804d = drawable;
        this.g = stateListDrawable2;
        this.f1807h = drawable2;
        this.f1805e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f1806f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f1808i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f1801a = i11;
        this.f1802b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0149x(i13, this));
        valueAnimatorOfFloat.addUpdateListener(new C0150y(0, this));
        RecyclerView recyclerView2 = this.f1817s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.h0(this);
            RecyclerView recyclerView3 = this.f1817s;
            recyclerView3.f12869H.remove(this);
            if (recyclerView3.f12871I == this) {
                recyclerView3.f12871I = null;
            }
            ArrayList arrayList = this.f1817s.f12856A0;
            if (arrayList != null) {
                arrayList.remove(c0148w);
            }
            this.f1817s.removeCallbacks(runnableC0147v);
        }
        this.f1817s = recyclerView;
        recyclerView.i(this);
        this.f1817s.f12869H.add(this);
        this.f1817s.j(c0148w);
    }

    public static int k(float f3, float f7, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f7 - f3) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    @Override // E2.InterfaceC0143q0
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f1820v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zJ = j(motionEvent.getX(), motionEvent.getY());
        boolean zI = i(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zJ && !zI) {
            return false;
        }
        if (zI) {
            this.f1821w = 1;
            this.f1814p = (int) motionEvent.getX();
        } else if (zJ) {
            this.f1821w = 2;
            this.f1811m = (int) motionEvent.getY();
        }
        l(2);
        return true;
    }

    @Override // E2.InterfaceC0143q0
    public final void c(MotionEvent motionEvent) {
        if (this.f1820v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zI = i(motionEvent.getX(), motionEvent.getY());
            if (zJ || zI) {
                if (zI) {
                    this.f1821w = 1;
                    this.f1814p = (int) motionEvent.getX();
                } else if (zJ) {
                    this.f1821w = 2;
                    this.f1811m = (int) motionEvent.getY();
                }
                l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f1820v == 2) {
            this.f1811m = 0.0f;
            this.f1814p = 0.0f;
            l(1);
            this.f1821w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f1820v == 2) {
            m();
            int i10 = this.f1821w;
            int i11 = this.f1802b;
            if (i10 == 1) {
                float x9 = motionEvent.getX();
                int[] iArr = this.f1823y;
                iArr[0] = i11;
                int i12 = this.f1815q - i11;
                iArr[1] = i12;
                float fMax = Math.max(i11, Math.min(i12, x9));
                if (Math.abs(this.f1813o - fMax) >= 2.0f) {
                    int iK = k(this.f1814p, fMax, iArr, this.f1817s.computeHorizontalScrollRange(), this.f1817s.computeHorizontalScrollOffset(), this.f1815q);
                    if (iK != 0) {
                        this.f1817s.scrollBy(iK, 0);
                    }
                    this.f1814p = fMax;
                }
            }
            if (this.f1821w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f1822x;
                iArr2[0] = i11;
                int i13 = this.f1816r - i11;
                iArr2[1] = i13;
                float fMax2 = Math.max(i11, Math.min(i13, y10));
                if (Math.abs(this.f1810l - fMax2) < 2.0f) {
                    return;
                }
                int iK2 = k(this.f1811m, fMax2, iArr2, this.f1817s.computeVerticalScrollRange(), this.f1817s.computeVerticalScrollOffset(), this.f1816r);
                if (iK2 != 0) {
                    this.f1817s.scrollBy(0, iK2);
                }
                this.f1811m = fMax2;
            }
        }
    }

    @Override // E2.AbstractC0131k0
    public final void h(Canvas canvas, RecyclerView recyclerView, B0 b5) {
        if (this.f1815q != this.f1817s.getWidth() || this.f1816r != this.f1817s.getHeight()) {
            this.f1815q = this.f1817s.getWidth();
            this.f1816r = this.f1817s.getHeight();
            l(0);
            return;
        }
        if (this.f1799A != 0) {
            if (this.f1818t) {
                int i10 = this.f1815q;
                int i11 = this.f1805e;
                int i12 = i10 - i11;
                int i13 = this.f1810l;
                int i14 = this.f1809k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f1803c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f1806f;
                int i17 = this.f1816r;
                Drawable drawable = this.f1804d;
                drawable.setBounds(0, 0, i16, i17);
                if (this.f1817s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f1819u) {
                int i18 = this.f1816r;
                int i19 = this.f1808i;
                int i20 = i18 - i19;
                int i21 = this.f1813o;
                int i22 = this.f1812n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f1815q;
                int i25 = this.j;
                Drawable drawable2 = this.f1807h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    public final boolean i(float f3, float f7) {
        if (f7 < this.f1816r - this.f1808i) {
            return false;
        }
        int i10 = this.f1813o;
        int i11 = this.f1812n;
        return f3 >= ((float) (i10 - (i11 / 2))) && f3 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean j(float f3, float f7) {
        int layoutDirection = this.f1817s.getLayoutDirection();
        int i10 = this.f1805e;
        if (layoutDirection == 1) {
            if (f3 > i10) {
                return false;
            }
        } else if (f3 < this.f1815q - i10) {
            return false;
        }
        int i11 = this.f1810l;
        int i12 = this.f1809k / 2;
        return f7 >= ((float) (i11 - i12)) && f7 <= ((float) (i12 + i11));
    }

    public final void l(int i10) {
        RunnableC0147v runnableC0147v = this.f1800B;
        StateListDrawable stateListDrawable = this.f1803c;
        if (i10 == 2 && this.f1820v != 2) {
            stateListDrawable.setState(f1797C);
            this.f1817s.removeCallbacks(runnableC0147v);
        }
        if (i10 == 0) {
            this.f1817s.invalidate();
        } else {
            m();
        }
        if (this.f1820v == 2 && i10 != 2) {
            stateListDrawable.setState(f1798D);
            this.f1817s.removeCallbacks(runnableC0147v);
            this.f1817s.postDelayed(runnableC0147v, 1200);
        } else if (i10 == 1) {
            this.f1817s.removeCallbacks(runnableC0147v);
            this.f1817s.postDelayed(runnableC0147v, 1500);
        }
        this.f1820v = i10;
    }

    public final void m() {
        int i10 = this.f1799A;
        ValueAnimator valueAnimator = this.f1824z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f1799A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // E2.InterfaceC0143q0
    public final void e(boolean z10) {
    }
}
