package E2;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC0143q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f1463a;

    public E(J j) {
        this.f1463a = j;
    }

    @Override // E2.InterfaceC0143q0
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        J j = this.f1463a;
        j.f1538x.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        F f3 = null;
        if (actionMasked == 0) {
            j.f1526l = motionEvent.getPointerId(0);
            j.f1520d = motionEvent.getX();
            j.f1521e = motionEvent.getY();
            VelocityTracker velocityTracker = j.f1534t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            j.f1534t = VelocityTracker.obtain();
            if (j.f1519c == null) {
                ArrayList arrayList = j.f1530p;
                if (!arrayList.isEmpty()) {
                    View viewM = j.m(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        F f7 = (F) arrayList.get(size);
                        if (f7.f1475e.f1486a == viewM) {
                            f3 = f7;
                            break;
                        }
                    }
                }
                if (f3 != null) {
                    F0 f10 = f3.f1475e;
                    j.f1520d -= f3.f1478i;
                    j.f1521e -= f3.j;
                    j.l(f10, true);
                    if (j.f1517a.remove(f10.f1486a)) {
                        j.f1527m.getClass();
                        H.a(f10);
                    }
                    j.r(f10, f3.f1476f);
                    j.s(j.f1529o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            j.f1526l = -1;
            j.r(null, 0);
        } else {
            int i10 = j.f1526l;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                j.j(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = j.f1534t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return j.f1519c != null;
    }

    @Override // E2.InterfaceC0143q0
    public final void c(MotionEvent motionEvent) {
        J j = this.f1463a;
        RunnableC0147v runnableC0147v = j.f1533s;
        j.f1538x.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = j.f1534t;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (j.f1526l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(j.f1526l);
        if (iFindPointerIndex >= 0) {
            j.j(actionMasked, iFindPointerIndex, motionEvent);
        }
        F0 f3 = j.f1519c;
        if (f3 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    j.s(j.f1529o, iFindPointerIndex, motionEvent);
                    j.p(f3);
                    j.f1532r.removeCallbacks(runnableC0147v);
                    runnableC0147v.run();
                    j.f1532r.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == j.f1526l) {
                    j.f1526l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    j.s(j.f1529o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = j.f1534t;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        j.r(null, 0);
        j.f1526l = -1;
    }

    @Override // E2.InterfaceC0143q0
    public final void e(boolean z10) {
        if (z10) {
            this.f1463a.r(null, 0);
        }
    }
}
