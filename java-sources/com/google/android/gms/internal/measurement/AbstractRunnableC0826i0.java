package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0826i0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f14333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f14334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0846m0 f14336u;

    public AbstractRunnableC0826i0(C0846m0 c0846m0, boolean z10) {
        Objects.requireNonNull(c0846m0);
        this.f14336u = c0846m0;
        this.f14333r = System.currentTimeMillis();
        this.f14334s = SystemClock.elapsedRealtime();
        this.f14335t = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0846m0 c0846m0 = this.f14336u;
        if (c0846m0.f14361e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            c0846m0.b(e10, false, this.f14335t);
            b();
        }
    }
}
