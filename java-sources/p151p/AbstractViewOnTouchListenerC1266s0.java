package p151p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p140o.A;

/* JADX INFO: renamed from: p.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1266s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f20772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f20773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20774t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final View f20775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RunnableC1264r0 f20776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RunnableC1264r0 f20777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20779y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f20780z = new int[2];

    public AbstractViewOnTouchListenerC1266s0(View view) {
        this.f20775u = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f20772r = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f20773s = tapTimeout;
        this.f20774t = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1264r0 runnableC1264r0 = this.f20777w;
        View view = this.f20775u;
        if (runnableC1264r0 != null) {
            view.removeCallbacks(runnableC1264r0);
        }
        RunnableC1264r0 runnableC1264r1 = this.f20776v;
        if (runnableC1264r1 != null) {
            view.removeCallbacks(runnableC1264r1);
        }
    }

    public abstract A b();

    public abstract boolean c();

    public boolean d() {
        A aB = b();
        if (aB == null || !aB.a()) {
            return true;
        }
        aB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        C1261p0 c1261p0G;
        boolean z11 = this.f20778x;
        View view2 = this.f20775u;
        if (z11) {
            A aB = b();
            if (aB != null && aB.a() && (c1261p0G = aB.g()) != null && c1261p0G.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f20780z;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c1261p0G.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = c1261p0G.b(motionEventObtainNoHistory, this.f20779y);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f20779y = motionEvent.getPointerId(0);
                    if (this.f20776v == null) {
                        this.f20776v = new RunnableC1264r0(this, 0);
                    }
                    view2.postDelayed(this.f20776v, this.f20773s);
                    if (this.f20777w == null) {
                        this.f20777w = new RunnableC1264r0(this, 1);
                    }
                    view2.postDelayed(this.f20777w, this.f20774t);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f20779y);
                    if (iFindPointerIndex >= 0) {
                        float x9 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f3 = this.f20772r;
                        float f7 = -f3;
                        if (x9 < f7 || y10 < f7 || x9 >= (view2.getRight() - view2.getLeft()) + f3 || y10 >= (view2.getBottom() - view2.getTop()) + f3) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z10 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f20778x = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f20778x = false;
        this.f20779y = -1;
        RunnableC1264r0 runnableC1264r0 = this.f20776v;
        if (runnableC1264r0 != null) {
            this.f20775u.removeCallbacks(runnableC1264r0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
