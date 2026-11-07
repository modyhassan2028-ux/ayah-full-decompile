package i7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: i7.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0974d1 extends I {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JobScheduler f17322t;

    @Override // i7.I
    public final boolean r() {
        return true;
    }

    public final void s(long j) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        p();
        o();
        JobScheduler jobScheduler = this.f17322t;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c1023u0.f17579r.getPackageName())).hashCode()) != null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iT = t();
        if (iT != 2) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17178E.b(android.support.v4.media.session.p.F(iT), "[sgtm] Not eligible for Scion upload");
            return;
        }
        X x11 = c1023u0.f17584w;
        C1023u0.m(x11);
        x11.f17178E.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(c1023u0.f17579r.getPackageName())).hashCode(), new ComponentName(c1023u0.f17579r, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f17322t;
        U6.y.f(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        X x12 = c1023u0.f17584w;
        C1023u0.m(x12);
        x12.f17178E.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int t() {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        p();
        o();
        if (this.f17322t == null) {
            return 7;
        }
        Boolean boolA = c1023u0.f17582u.A("google_analytics_sgtm_upload_enabled");
        if (!(boolA == null ? false : boolA.booleanValue())) {
            return 8;
        }
        if (c1023u0.r().f17038A < 119000) {
            return 6;
        }
        if (!V1.I(c1023u0.f17579r, "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return !c1023u0.p().v() ? 5 : 2;
        }
        return 4;
    }
}
