package E2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class I extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1511a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f1512b;

    public I(J j) {
        this.f1512b = j;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM;
        F0 f0O;
        J j = this.f1512b;
        Q5.a aVar = j.f1527m;
        if (!this.f1511a || (viewM = j.m(motionEvent)) == null || (f0O = j.f1532r.O(viewM)) == null) {
            return;
        }
        RecyclerView recyclerView = j.f1532r;
        if ((H.b(aVar.e(recyclerView, f0O), recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i10 = j.f1526l;
            if (pointerId == i10) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x9 = motionEvent.getX(iFindPointerIndex);
                float y10 = motionEvent.getY(iFindPointerIndex);
                j.f1520d = x9;
                j.f1521e = y10;
                j.f1524i = 0.0f;
                j.f1523h = 0.0f;
                aVar.getClass();
                j.r(f0O, 2);
            }
        }
    }
}
