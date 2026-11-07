package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0911z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p213v8.b f14515a;

    static {
        p213v8.b bVar;
        Uri uri = A1.f13990a;
        synchronized (B1.class) {
            try {
                if (B1.f13995a == null) {
                    B1.R(new p213v8.b());
                }
                bVar = B1.f13995a;
            } catch (Throwable th) {
                throw th;
            }
        }
        f14515a = bVar;
    }
}
