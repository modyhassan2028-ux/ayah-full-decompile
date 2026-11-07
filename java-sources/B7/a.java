package B7;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Dialog f648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f651u;

    public a(Dialog dialog, Rect rect) {
        this.f648r = dialog;
        this.f649s = rect.left;
        this.f650t = rect.top;
        this.f651u = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f649s;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f650t;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f651u;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f648r.onTouchEvent(motionEventObtain);
    }
}
