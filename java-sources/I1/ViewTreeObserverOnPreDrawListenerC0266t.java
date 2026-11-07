package I1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: I1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0266t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f3782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewTreeObserver f3783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f3784t;

    public ViewTreeObserverOnPreDrawListenerC0266t(View view, Runnable runnable) {
        this.f3782r = view;
        this.f3783s = view.getViewTreeObserver();
        this.f3784t = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0266t viewTreeObserverOnPreDrawListenerC0266t = new ViewTreeObserverOnPreDrawListenerC0266t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0266t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0266t);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f3783s.isAlive();
        View view = this.f3782r;
        if (zIsAlive) {
            this.f3783s.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f3784t.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3783s = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f3783s.isAlive();
        View view2 = this.f3782r;
        if (zIsAlive) {
            this.f3783s.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
