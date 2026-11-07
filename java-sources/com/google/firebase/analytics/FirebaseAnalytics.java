package com.google.firebase.analytics;

import J8.d;
import U6.y;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0786a0;
import com.google.android.gms.internal.measurement.C0846m0;
import com.google.android.gms.internal.measurement.Y;
import i7.Z0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000a.a;
import p060f8.b;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f15393b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0846m0 f15394a;

    public FirebaseAnalytics(C0846m0 c0846m0) {
        y.f(c0846m0);
        this.f15394a = c0846m0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f15393b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f15393b == null) {
                        f15393b = new FirebaseAnalytics(C0846m0.c(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15393b;
    }

    @Keep
    public static Z0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C0846m0 c0846m0C = C0846m0.c(context, bundle);
        if (c0846m0C == null) {
            return null;
        }
        return new b(c0846m0C);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            o oVarD = d.e().d();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return (String) a.m(oVarD, 30000L);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        Y yB = Y.b(activity);
        C0846m0 c0846m0 = this.f15394a;
        c0846m0.getClass();
        c0846m0.a(new C0786a0(c0846m0, yB, str, str2));
    }
}
