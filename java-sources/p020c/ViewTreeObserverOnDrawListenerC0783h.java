package p020c;

import K0.RunnableC0354l;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;
import p251z9.j;

/* JADX INFO: renamed from: c.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0783h implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f13378r = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Runnable f13379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f13381u;

    public ViewTreeObserverOnDrawListenerC0783h(ComponentActivity componentActivity) {
        this.f13381u = componentActivity;
    }

    public final void a(View view) {
        if (this.f13380t) {
            return;
        }
        this.f13380t = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j.e(runnable, "runnable");
        this.f13379s = runnable;
        View decorView = this.f13381u.getWindow().getDecorView();
        j.d(decorView, "window.decorView");
        if (!this.f13380t) {
            decorView.postOnAnimation(new RunnableC0354l(15, this));
        } else if (j.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f13379s;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f13378r) {
                this.f13380t = false;
                this.f13381u.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f13379s = null;
        r rVar = (r) this.f13381u.f11383x.getValue();
        synchronized (rVar.f13397b) {
            z10 = rVar.f13398c;
        }
        if (z10) {
            this.f13380t = false;
            this.f13381u.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13381u.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
