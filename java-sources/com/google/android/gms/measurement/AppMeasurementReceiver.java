package com.google.android.gms.measurement;

import X4.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
import i7.C1023u0;
import i7.X;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f14523c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f14523c == null) {
            this.f14523c = new c(this);
        }
        c cVar = this.f14523c;
        cVar.getClass();
        X x9 = C1023u0.s(context, null, null).f17584w;
        C1023u0.m(x9);
        if (intent == null) {
            x9.f17185z.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        x9.f17178E.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                x9.f17185z.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        x9.f17178E.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) cVar.f9953r).getClass();
        SparseArray sparseArray = WakefulBroadcastReceiver.f12605a;
        synchronized (sparseArray) {
            try {
                int i10 = WakefulBroadcastReceiver.f12606b;
                int i11 = i10 + 1;
                WakefulBroadcastReceiver.f12606b = i11;
                if (i11 <= 0) {
                    WakefulBroadcastReceiver.f12606b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i10, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
