package p151p;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f20597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f20598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f20599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f20600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20602f;

    public U0(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f20601e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f20598b = rect3;
        Rect rect4 = new Rect();
        this.f20600d = rect4;
        Rect rect5 = new Rect();
        this.f20599c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f20597a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x9 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z11 = this.f20602f;
                if (z11 && !this.f20600d.contains(x9, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            } else if (action != 3) {
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f20602f;
                this.f20602f = false;
            }
            z12 = z11;
            z10 = true;
        } else if (this.f20598b.contains(x9, y10)) {
            this.f20602f = true;
            z10 = true;
        } else {
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f20599c;
        View view = this.f20597a;
        if (!z10 || rect.contains(x9, y10)) {
            motionEvent.setLocation(x9 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
