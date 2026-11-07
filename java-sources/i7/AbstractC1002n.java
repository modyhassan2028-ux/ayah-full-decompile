package i7;

import android.os.Handler;

/* JADX INFO: renamed from: i7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1002n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.H f17469d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0 f17470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p039d8.a f17471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f17472c;

    public AbstractC1002n(D0 d1) {
        U6.y.f(d1);
        this.f17470a = d1;
        this.f17471b = new p039d8.a(8, this, d1, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            D0 d1 = this.f17470a;
            d1.e().getClass();
            this.f17472c = System.currentTimeMillis();
            if (d().postDelayed(this.f17471b, j)) {
                return;
            }
            d1.b().f17182w.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f17472c = 0L;
        d().removeCallbacks(this.f17471b);
    }

    public final Handler d() {
        com.google.android.gms.internal.measurement.H h7;
        if (f17469d != null) {
            return f17469d;
        }
        synchronized (AbstractC1002n.class) {
            try {
                if (f17469d == null) {
                    f17469d = new com.google.android.gms.internal.measurement.H(this.f17470a.d().getMainLooper(), 0);
                }
                h7 = f17469d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h7;
    }
}
