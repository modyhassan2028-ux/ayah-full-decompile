package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0821h0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f14327a = Executors.defaultThreadFactory();

    public ThreadFactoryC0821h0(C0846m0 c0846m0) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f14327a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
