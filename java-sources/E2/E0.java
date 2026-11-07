package E2;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public OverScroller f1466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Interpolator f1467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1470x;

    public E0(RecyclerView recyclerView) {
        this.f1470x = recyclerView;
        G g = RecyclerView.f12853a1;
        this.f1467u = g;
        this.f1468v = false;
        this.f1469w = false;
        this.f1466t = new OverScroller(recyclerView.getContext(), g);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.f1470x;
        recyclerView.setScrollState(2);
        this.f1465s = 0;
        this.f1464r = 0;
        Interpolator interpolator = this.f1467u;
        G g = RecyclerView.f12853a1;
        if (interpolator != g) {
            this.f1467u = g;
            this.f1466t = new OverScroller(recyclerView.getContext(), g);
        }
        this.f1466t.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f1468v) {
            this.f1469w = true;
            return;
        }
        RecyclerView recyclerView = this.f1470x;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = I1.S.f3689a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i10, int i11, int i12, Interpolator interpolator) {
        RecyclerView recyclerView = this.f1470x;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.f12853a1;
        }
        if (this.f1467u != interpolator) {
            this.f1467u = interpolator;
            this.f1466t = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f1465s = 0;
        this.f1464r = 0;
        recyclerView.setScrollState(2);
        this.f1466t.startScroll(0, 0, i10, i11, i13);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f1470x;
        int[] iArr = recyclerView.f12876K0;
        if (recyclerView.f12863E == null) {
            recyclerView.removeCallbacks(this);
            this.f1466t.abortAnimation();
            return;
        }
        this.f1469w = false;
        this.f1468v = true;
        recyclerView.p();
        OverScroller overScroller = this.f1466t;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f1464r;
            int i16 = currY - this.f1465s;
            this.f1464r = currX;
            this.f1465s = currY;
            int iO = RecyclerView.o(i15, recyclerView.f12893c0, recyclerView.f12895e0, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i16, recyclerView.f12894d0, recyclerView.f12896f0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f12876K0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.f12861D != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.k0(iO, iO2, iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                int i19 = iO - i17;
                int i20 = iO2 - i18;
                Q q10 = recyclerView.f12863E.f1719e;
                if (q10 != null && !q10.f1607d && q10.f1608e) {
                    int iB = recyclerView.f12923y0.b();
                    if (iB == 0) {
                        q10.j();
                    } else if (q10.f1604a >= iB) {
                        q10.f1604a = iB - 1;
                        q10.h(i17, i18);
                    } else {
                        q10.h(i17, i18);
                    }
                }
                i10 = i19;
                i12 = i17;
                i11 = i20;
                i13 = i18;
            } else {
                i10 = iO;
                i11 = iO2;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f12867G.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f12876K0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i12, i13, i10, i11, null, 1, iArr3);
            int i21 = i10 - iArr[0];
            int i22 = i11 - iArr[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.x(i12, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
            Q q11 = recyclerView.f12863E.f1719e;
            if ((q11 == null || !q11.f1607d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i21 < 0) {
                        i14 = -currVelocity;
                    } else {
                        i14 = i21 > 0 ? currVelocity : 0;
                    }
                    if (i22 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i22 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.f12893c0.isFinished()) {
                            recyclerView.f12893c0.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.f12895e0.isFinished()) {
                            recyclerView.f12895e0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.f12894d0.isFinished()) {
                            recyclerView.f12894d0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f12896f0.isFinished()) {
                            recyclerView.f12896f0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f12851Y0) {
                    A a9 = recyclerView.f12921x0;
                    int[] iArr4 = (int[]) a9.f1437e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    a9.f1436d = 0;
                }
            } else {
                b();
                C c10 = recyclerView.f12919w0;
                if (c10 != null) {
                    c10.a(recyclerView, i12, i13);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC0121f0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        Q q12 = recyclerView.f12863E.f1719e;
        if (q12 != null && q12.f1607d) {
            q12.h(0, 0);
        }
        this.f1468v = false;
        if (!this.f1469w) {
            recyclerView.setScrollState(0);
            recyclerView.s0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = I1.S.f3689a;
            recyclerView.postOnAnimation(this);
        }
    }
}
