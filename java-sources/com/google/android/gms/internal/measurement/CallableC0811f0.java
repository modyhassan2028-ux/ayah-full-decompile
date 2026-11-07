package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0811f0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CallableC0811f0 f14243a = new CallableC0811f0();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0892v2 c0892v2 = new C0892v2("internal.platform", 4);
        c0892v2.f14326s.put("getVersion", new C0892v2("getVersion", 3));
        return c0892v2;
    }
}
