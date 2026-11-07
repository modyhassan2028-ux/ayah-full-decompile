package K0;

import K9.AbstractC0399q;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0399q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final p110k9.o f5035D = p110k9.a.d(Q.f4994y);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C9.b f5036E = new C9.b(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5037A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0333a0 f5039C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Choreographer f5040t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f5041u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5046z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f5042v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p120l9.k f5043w = new p120l9.k();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f5044x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f5045y = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final X f5038B = new X(this);

    public Y(Choreographer choreographer, Handler handler) {
        this.f5040t = choreographer;
        this.f5041u = handler;
        this.f5039C = new C0333a0(choreographer, this);
    }

    public static final void g0(Y y10) {
        boolean z10;
        do {
            Runnable runnableH0 = y10.h0();
            while (runnableH0 != null) {
                runnableH0.run();
                runnableH0 = y10.h0();
            }
            synchronized (y10.f5042v) {
                if (y10.f5043w.isEmpty()) {
                    z10 = false;
                    y10.f5046z = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // K9.AbstractC0399q
    public final void c0(p150o9.h hVar, Runnable runnable) {
        synchronized (this.f5042v) {
            this.f5043w.addLast(runnable);
            if (!this.f5046z) {
                this.f5046z = true;
                this.f5041u.post(this.f5038B);
                if (!this.f5037A) {
                    this.f5037A = true;
                    this.f5040t.postFrameCallback(this.f5038B);
                }
            }
        }
    }

    public final Runnable h0() {
        Runnable runnable;
        synchronized (this.f5042v) {
            p120l9.k kVar = this.f5043w;
            runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
        }
        return runnable;
    }
}
