package p151p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: p.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1264r0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC1266s0 f20770s;

    public /* synthetic */ RunnableC1264r0(AbstractViewOnTouchListenerC1266s0 abstractViewOnTouchListenerC1266s0, int i10) {
        this.f20769r = i10;
        this.f20770s = abstractViewOnTouchListenerC1266s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20769r) {
            case 0:
                ViewParent parent = this.f20770s.f20775u.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC1266s0 abstractViewOnTouchListenerC1266s0 = this.f20770s;
                abstractViewOnTouchListenerC1266s0.a();
                View view = abstractViewOnTouchListenerC1266s0.f20775u;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1266s0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1266s0.f20778x = true;
                    break;
                }
                break;
        }
    }
}
