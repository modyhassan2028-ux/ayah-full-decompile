package G;

import Z.t0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* JADX INFO: renamed from: G.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0168b implements e0, t0, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f2657x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f2658r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2660t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2663w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p011b0.e f2659s = new p011b0.e(new d0[16]);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Choreographer f2661u = Choreographer.getInstance();

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public RunnableC0168b(View view) {
        float refreshRate;
        this.f2658r = view;
        if (f2657x == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f2657x = (long) (1000000000 / refreshRate);
        }
    }

    @Override // G.e0
    public final void a(d0 d0Var) {
        this.f2659s.b(d0Var);
        if (this.f2660t) {
            return;
        }
        this.f2660t = true;
        this.f2658r.post(this);
    }

    @Override // Z.t0
    public final void b() {
        this.f2662v = true;
    }

    @Override // Z.t0
    public final void d() {
        this.f2662v = false;
        this.f2658r.removeCallbacks(this);
        this.f2661u.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f2662v) {
            this.f2663w = j;
            this.f2658r.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p011b0.e eVar = this.f2659s;
        if (eVar.f13127t == 0 || !this.f2660t || !this.f2662v || this.f2658r.getWindowVisibility() != 0) {
            this.f2660t = false;
            return;
        }
        C0167a c0167a = new C0167a(this.f2663w + f2657x);
        boolean z10 = false;
        while (eVar.f13127t != 0 && !z10) {
            if (Math.max(0L, c0167a.f2652a - System.nanoTime()) <= 0 || ((d0) eVar.f13125r[0]).a(c0167a)) {
                z10 = true;
            } else {
                eVar.l(0);
            }
        }
        if (z10) {
            this.f2661u.postFrameCallback(this);
        } else {
            this.f2660t = false;
        }
    }

    @Override // Z.t0
    public final void c() {
    }
}
