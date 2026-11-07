package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f14127a;

    public S2(Unsafe unsafe) {
        this.f14127a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b5);

    public abstract boolean b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z10);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, float f3);

    public abstract double f(long j, Object obj);

    public abstract void g(Object obj, long j, double d5);
}
