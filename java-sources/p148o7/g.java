package p148o7;

import F1.o;
import I1.S;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f20358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public OverScroller f20359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public VelocityTracker f20364z;

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // u1.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y10;
        boolean z10;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.f20363y < 0) {
            this.f20363y = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f20360v) {
            int i10 = this.f20361w;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                int y11 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y11 - this.f20362x) > this.f20363y) {
                    this.f20362x = y11;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f20361w = -1;
                    int x9 = (int) motionEvent.getX();
                    y10 = (int) motionEvent.getY();
                    WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f14556E;
                    if (weakReference == null) {
                    }
                    this.f20360v = z10;
                    if (z10) {
                        this.f20362x = y10;
                        this.f20361w = motionEvent.getPointerId(0);
                        if (this.f20364z == null) {
                            this.f20364z = VelocityTracker.obtain();
                        }
                        overScroller = this.f20359u;
                        if (overScroller != null) {
                            this.f20359u.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.f20364z;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f20361w = -1;
                int x10 = (int) motionEvent.getX();
                y10 = (int) motionEvent.getY();
                WeakReference weakReference2 = ((AppBarLayout.BaseBehavior) this).f14556E;
                z10 = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.t(view, x10, y10);
                this.f20360v = z10;
                if (z10) {
                    this.f20362x = y10;
                    this.f20361w = motionEvent.getPointerId(0);
                    if (this.f20364z == null) {
                        this.f20364z = VelocityTracker.obtain();
                    }
                    overScroller = this.f20359u;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f20359u.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f20364z;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe A[ADDED_TO_REGION] */
    @Override // u1.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f20361w);
                if (iFindPointerIndex != -1) {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i10 = this.f20362x - y10;
                    this.f20362x = y10;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    z(coordinatorLayout, view, y() - i10, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f20361w = motionEvent.getPointerId(i11);
                    this.f20362x = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z10 = false;
            velocityTracker2 = this.f20364z;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f20360v || z10;
        }
        VelocityTracker velocityTracker3 = this.f20364z;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f20364z.computeCurrentVelocity(1000);
            float yVelocity = this.f20364z.getYVelocity(this.f20361w);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i12 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.f20358t;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f20358t = null;
            }
            if (this.f20359u == null) {
                this.f20359u = new OverScroller(view.getContext());
            }
            this.f20359u.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f20359u.computeScrollOffset()) {
                o oVar = new o(this, coordinatorLayout, view, 10);
                this.f20358t = oVar;
                WeakHashMap weakHashMap = S.f3689a;
                view.postOnAnimation(oVar);
            } else {
                ((AppBarLayout.BaseBehavior) this).G(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.f14529C) {
                    appBarLayout2.e(appBarLayout2.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                }
            }
            z10 = true;
        }
        this.f20360v = false;
        this.f20361w = -1;
        velocityTracker = this.f20364z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20364z = null;
        }
        velocityTracker2 = this.f20364z;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f20360v) {
        }
        z10 = false;
        this.f20360v = false;
        this.f20361w = -1;
        velocityTracker = this.f20364z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20364z = null;
        }
        velocityTracker2 = this.f20364z;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f20360v) {
        }
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);
}
