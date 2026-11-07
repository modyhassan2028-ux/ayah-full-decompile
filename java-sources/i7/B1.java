package i7;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends I {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.H f16832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final X4.c f16834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A1 f16835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p085i0.n f16836x;

    public B1(C1023u0 c1023u0) {
        super(c1023u0);
        this.f16833u = true;
        this.f16834v = new X4.c(this);
        this.f16835w = new A1(this);
        this.f16836x = new p085i0.n(4, this);
    }

    @Override // i7.I
    public final boolean r() {
        return false;
    }

    public final void s() {
        o();
        if (this.f16832t == null) {
            this.f16832t = new com.google.android.gms.internal.measurement.H(Looper.getMainLooper(), 0);
        }
    }
}
