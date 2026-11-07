package H7;

import I1.S;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class K implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3457r;

    public /* synthetic */ K(int i10) {
        this.f3457r = i10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3457r) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = S.f3689a;
                I1.G.c(view);
                break;
            default:
                p251z9.j.e(view, "v");
                WeakHashMap weakHashMap2 = S.f3689a;
                I1.G.c(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3457r) {
            case 0:
                break;
            default:
                p251z9.j.e(view, "v");
                break;
        }
    }

    private final void a(View view) {
    }
}
