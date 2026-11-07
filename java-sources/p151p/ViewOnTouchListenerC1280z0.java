package p151p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: p.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1280z0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A0 f20805r;

    public ViewOnTouchListenerC1280z0(A0 a9) {
        this.f20805r = a9;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        A0 a9 = this.f20805r;
        RunnableC1276x0 runnableC1276x0 = a9.f20516I;
        Handler handler = a9.f20520M;
        C1279z c1279z = a9.Q;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && c1279z != null && c1279z.isShowing() && x9 >= 0 && x9 < c1279z.getWidth() && y10 >= 0 && y10 < c1279z.getHeight()) {
            handler.postDelayed(runnableC1276x0, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC1276x0);
        return false;
    }
}
