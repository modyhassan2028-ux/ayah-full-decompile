package com.google.android.gms.measurement;

import F1.o;
import H8.e;
import U6.y;
import Z0.B;
import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0846m0;
import com.google.android.gms.internal.measurement.Z;
import i7.InterfaceC1030w1;
import i7.Q1;
import i7.X;
import j$.util.Objects;
import p039d8.a;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements InterfaceC1030w1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f14522r;

    @Override // i7.InterfaceC1030w1
    public final boolean a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // i7.InterfaceC1030w1
    public final void b(Intent intent) {
    }

    @Override // i7.InterfaceC1030w1
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final B d() {
        if (this.f14522r == null) {
            this.f14522r = new B(13, this);
        }
        return this.f14522r;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f10875s).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f10875s).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        B bD = d();
        Service service = (Service) bD.f10875s;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            y.f(string);
            Q1 q1C = Q1.C(service);
            X xB = q1C.b();
            e eVar = q1C.f17084C.f17581t;
            xB.f17178E.b(string, "Local AppMeasurementJobService called. action");
            q1C.c().x(new a(bD, q1C, new o((Object) bD, (Object) xB, (Parcelable) jobParameters, 9)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        y.f(string);
        C0846m0 c0846m0C = C0846m0.c(service, null);
        a aVar = new a(21, bD, jobParameters);
        c0846m0C.getClass();
        c0846m0C.a(new Z(c0846m0C, aVar, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
