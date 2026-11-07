package I1;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3707a;

    public Z(View view) {
        this.f3707a = new WeakReference(view);
    }

    public final void a(float f3) {
        View view = (View) this.f3707a.get();
        if (view != null) {
            view.animate().alpha(f3);
        }
    }

    public final void b() {
        View view = (View) this.f3707a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f3707a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(InterfaceC0242a0 interfaceC0242a0) {
        View view = (View) this.f3707a.get();
        if (view != null) {
            if (interfaceC0242a0 != null) {
                view.animate().setListener(new F7.e(interfaceC0242a0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f3) {
        View view = (View) this.f3707a.get();
        if (view != null) {
            view.animate().translationY(f3);
        }
    }
}
