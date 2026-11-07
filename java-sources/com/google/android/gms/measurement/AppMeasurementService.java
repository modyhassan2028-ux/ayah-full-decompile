package com.google.android.gms.measurement;

import E2.RunnableC0118e;
import Z0.B;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
import i7.B0;
import i7.C1023u0;
import i7.InterfaceC1030w1;
import i7.Q1;
import i7.X;
import p039d8.a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1030w1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f14524r;

    @Override // i7.InterfaceC1030w1
    public final boolean a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // i7.InterfaceC1030w1
    public final void b(Intent intent) {
        SparseArray sparseArray = WakefulBroadcastReceiver.f12605a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = WakefulBroadcastReceiver.f12605a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i7.InterfaceC1030w1
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final B d() {
        if (this.f14524r == null) {
            this.f14524r = new B(13, this);
        }
        return this.f14524r;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        B bD = d();
        bD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new B0(Q1.C((Service) bD.f10875s));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        B bD = d();
        if (intent == null) {
            bD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) bD.f10875s;
        X x9 = C1023u0.s(service, null, null).f17584w;
        C1023u0.m(x9);
        String action = intent.getAction();
        x9.f17178E.c(Integer.valueOf(i11), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC0118e runnableC0118e = new RunnableC0118e(bD, i11, x9, intent);
        Q1 q1C = Q1.C(service);
        q1C.c().x(new a(bD, q1C, runnableC0118e));
        return 2;
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
