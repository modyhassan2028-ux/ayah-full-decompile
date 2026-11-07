package p084i;

import Y2.a;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p130n.c;

/* JADX INFO: loaded from: classes.dex */
public final class v extends ContentFrameLayout {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x f16633z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, c cVar) {
        super(cVar);
        this.f16633z = xVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f16633z.u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x9 < -5 || y10 < -5 || x9 > getWidth() + 5 || y10 > getHeight() + 5) {
                x xVar = this.f16633z;
                xVar.s(xVar.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(a.E(getContext(), i10));
    }
}
