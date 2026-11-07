package U7;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8315r;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f8315r) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }
}
