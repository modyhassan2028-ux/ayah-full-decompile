package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D6.s;
import E6.j;
import E6.v;
import F2.x;
import K6.e;
import O6.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.support.v4.media.session.r;
import android.util.Base64;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13972r = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        v.b(getApplicationContext());
        r rVarA = j.a();
        rVarA.N(string);
        rVarA.f11366u = a.b(i10);
        if (string2 != null) {
            rVarA.f11365t = Base64.decode(string2, 0);
        }
        s sVar = v.a().f1969d;
        ((Executor) sVar.f1312e).execute(new e(sVar, rVarA.x(), i11, new x(1, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
