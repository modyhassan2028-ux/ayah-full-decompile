package P4;

import E2.AbstractC0131k0;
import E2.B0;
import E2.C0148w;
import E2.C0149x;
import E2.C0150y;
import E2.InterfaceC0143q0;
import E2.RunnableC0147v;
import I1.S;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0131k0 implements InterfaceC0143q0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f6643C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f6644D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6645A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RunnableC0147v f6646B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f6649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f6650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6652f;
    public final StateListDrawable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f6653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6654i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f6660p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f6663s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f6670z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6661q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6662r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6664t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6665u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6666v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6667w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f6668x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f6669y = new int[2];

    public a(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6670z = valueAnimatorOfFloat;
        this.f6645A = 0;
        RunnableC0147v runnableC0147v = new RunnableC0147v(5, this);
        this.f6646B = runnableC0147v;
        C0148w c0148w = new C0148w(this, 1);
        this.f6649c = stateListDrawable;
        this.f6650d = drawable;
        this.g = stateListDrawable2;
        this.f6653h = drawable2;
        this.f6651e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f6652f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f6654i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f6647a = i11;
        this.f6648b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0149x(1, this));
        valueAnimatorOfFloat.addUpdateListener(new C0150y(3, this));
        RecyclerView recyclerView2 = this.f6663s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.h0(this);
            RecyclerView recyclerView3 = this.f6663s;
            recyclerView3.f12869H.remove(this);
            if (recyclerView3.f12871I == this) {
                recyclerView3.f12871I = null;
            }
            ArrayList arrayList = this.f6663s.f12856A0;
            if (arrayList != null) {
                arrayList.remove(c0148w);
            }
            this.f6663s.removeCallbacks(runnableC0147v);
        }
        this.f6663s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f6663s.f12869H.add(this);
            this.f6663s.j(c0148w);
        }
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
        int i10 = this.f6666v;
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
            this.f6667w = 1;
            this.f6660p = (int) motionEvent.getX();
        } else if (zJ) {
            this.f6667w = 2;
            this.f6657m = (int) motionEvent.getY();
        }
        l(2);
        return true;
    }

    @Override // E2.InterfaceC0143q0
    public final void c(MotionEvent motionEvent) {
        if (this.f6666v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zI = i(motionEvent.getX(), motionEvent.getY());
            if (zJ || zI) {
                if (zI) {
                    this.f6667w = 1;
                    this.f6660p = (int) motionEvent.getX();
                } else if (zJ) {
                    this.f6667w = 2;
                    this.f6657m = (int) motionEvent.getY();
                }
                l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f6666v == 2) {
            this.f6657m = 0.0f;
            this.f6660p = 0.0f;
            l(1);
            this.f6667w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f6666v == 2) {
            m();
            int i10 = this.f6667w;
            int i11 = this.f6648b;
            if (i10 == 1) {
                float x9 = motionEvent.getX();
                int[] iArr = this.f6669y;
                iArr[0] = i11;
                int i12 = this.f6661q - i11;
                iArr[1] = i12;
                float fMax = Math.max(i11, Math.min(i12, x9));
                if (Math.abs(this.f6659o - fMax) >= 2.0f) {
                    int iK = k(this.f6660p, fMax, iArr, this.f6663s.computeHorizontalScrollRange(), this.f6663s.computeHorizontalScrollOffset(), this.f6661q);
                    if (iK != 0) {
                        this.f6663s.scrollBy(iK, 0);
                    }
                    this.f6660p = fMax;
                }
            }
            if (this.f6667w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f6668x;
                iArr2[0] = i11;
                int i13 = this.f6662r - i11;
                iArr2[1] = i13;
                float fMax2 = Math.max(i11, Math.min(i13, y10));
                if (Math.abs(this.f6656l - fMax2) < 2.0f) {
                    return;
                }
                int iK2 = k(this.f6657m, fMax2, iArr2, this.f6663s.computeVerticalScrollRange(), this.f6663s.computeVerticalScrollOffset(), this.f6662r);
                if (iK2 != 0) {
                    this.f6663s.scrollBy(0, iK2);
                }
                this.f6657m = fMax2;
            }
        }
    }

    @Override // E2.AbstractC0131k0
    public final void h(Canvas canvas, RecyclerView recyclerView, B0 b5) {
        int i10 = this.f6661q;
        RecyclerView recyclerView2 = this.f6663s;
        if (i10 != recyclerView2.getWidth() || this.f6662r != recyclerView2.getHeight()) {
            this.f6661q = recyclerView2.getWidth();
            this.f6662r = recyclerView2.getHeight();
            l(0);
            return;
        }
        if (this.f6645A != 0) {
            if (this.f6664t) {
                int i11 = this.f6661q;
                int i12 = this.f6651e;
                int i13 = i11 - i12;
                int i14 = this.f6656l;
                int i15 = this.f6655k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f6649c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f6652f;
                int i18 = this.f6662r;
                Drawable drawable = this.f6650d;
                drawable.setBounds(0, 0, i17, i18);
                WeakHashMap weakHashMap = S.f3689a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f6665u) {
                int i19 = this.f6662r;
                int i20 = this.f6654i;
                int i21 = i19 - i20;
                int i22 = this.f6659o;
                int i23 = this.f6658n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f6661q;
                int i26 = this.j;
                Drawable drawable2 = this.f6653h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(0.0f, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    public final boolean i(float f3, float f7) {
        if (f7 < this.f6662r - this.f6654i) {
            return false;
        }
        int i10 = this.f6659o;
        int i11 = this.f6658n;
        return f3 >= ((float) (i10 - (i11 / 2))) && f3 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean j(float f3, float f7) {
        WeakHashMap weakHashMap = S.f3689a;
        int layoutDirection = this.f6663s.getLayoutDirection();
        int i10 = this.f6651e;
        if (layoutDirection == 1) {
            if (f3 > i10) {
                return false;
            }
        } else if (f3 < this.f6661q - i10) {
            return false;
        }
        int i11 = this.f6656l;
        int i12 = this.f6655k / 2;
        return f7 >= ((float) (i11 - i12)) && f7 <= ((float) (i12 + i11));
    }

    public final void l(int i10) {
        RunnableC0147v runnableC0147v = this.f6646B;
        StateListDrawable stateListDrawable = this.f6649c;
        if (i10 == 2 && this.f6666v != 2) {
            stateListDrawable.setState(f6643C);
            this.f6663s.removeCallbacks(runnableC0147v);
            this.f6663s.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (i10 == 0) {
            this.f6663s.invalidate();
        } else {
            m();
        }
        if (this.f6666v == 2 && i10 != 2) {
            stateListDrawable.setState(f6644D);
            this.f6663s.removeCallbacks(runnableC0147v);
            this.f6663s.postDelayed(runnableC0147v, 1200);
            this.f6663s.getParent().requestDisallowInterceptTouchEvent(false);
        } else if (i10 == 1) {
            this.f6663s.removeCallbacks(runnableC0147v);
            this.f6663s.postDelayed(runnableC0147v, 1500);
        }
        this.f6666v = i10;
    }

    public final void m() {
        int i10 = this.f6645A;
        ValueAnimator valueAnimator = this.f6670z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f6645A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // E2.InterfaceC0143q0
    public final void e(boolean z10) {
    }
}
