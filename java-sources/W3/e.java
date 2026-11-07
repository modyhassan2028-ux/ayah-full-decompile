package W3;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6.b f9598a;

    public e(C6.b bVar) {
        this.f9598a = bVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        j.e(motionEvent, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        j.e(motionEvent, "e");
        this.f9598a.j(new c(motionEvent.getX(), motionEvent.getY()));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        j.e(motionEvent, "e");
        this.f9598a.j(new d(motionEvent.getX(), motionEvent.getY()));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        j.e(motionEvent, "e");
        this.f9598a.j(b.f9595f);
        return true;
    }
}
