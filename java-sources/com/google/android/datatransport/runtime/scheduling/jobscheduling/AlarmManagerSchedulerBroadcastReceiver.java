package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D6.s;
import E6.j;
import E6.v;
import K6.e;
import O6.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.r;
import android.util.Base64;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13971a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        v.b(context);
        r rVarA = j.a();
        rVarA.N(queryParameter);
        rVarA.f11366u = a.b(iIntValue);
        if (queryParameter2 != null) {
            rVarA.f11365t = Base64.decode(queryParameter2, 0);
        }
        s sVar = v.a().f1969d;
        ((Executor) sVar.f1312e).execute(new e(sVar, rVarA.x(), i10, new K6.a()));
    }
}
