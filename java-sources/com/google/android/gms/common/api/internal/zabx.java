package com.google.android.gms.common.api.internal;

import L5.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class zabx extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13989b;

    public zabx(c cVar) {
        this.f13989b = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f13989b.f5533t;
            throw null;
        }
    }
}
