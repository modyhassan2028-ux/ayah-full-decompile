package com.google.android.gms.measurement.internal;

import E2.RunnableC0147v;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.R3;
import i7.C1014r0;
import i7.C1023u0;
import i7.G;
import i7.X;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1023u0 f14526a;

    public zzw(C1023u0 c1023u0) {
        this.f14526a = c1023u0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1023u0 c1023u0 = this.f14526a;
        if (intent == null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17185z.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17185z.a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                X x11 = c1023u0.f17584w;
                C1023u0.m(x11);
                x11.f17178E.a("[sgtm] App Receiver notified batches are available");
                C1014r0 c1014r0 = c1023u0.f17585x;
                C1023u0.m(c1014r0);
                c1014r0.x(new RunnableC0147v(21, this));
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            R3.a();
            if (c1023u0.f17582u.y(null, G.f16914R0)) {
                X x12 = c1023u0.f17584w;
                C1023u0.m(x12);
                x12.f17178E.a("App receiver notified triggers are available");
                C1014r0 c1014r1 = c1023u0.f17585x;
                C1023u0.m(c1014r1);
                c1014r1.x(new RunnableC0147v(22, c1023u0));
                return;
            }
            return;
        }
        X x13 = c1023u0.f17584w;
        C1023u0.m(x13);
        x13.f17185z.a("App receiver called with unknown action");
    }
}
