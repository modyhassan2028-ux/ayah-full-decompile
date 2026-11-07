package i7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class G1 extends L1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AlarmManager f16995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z1 f16996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f16997w;

    public G1(Q1 q10) {
        super(q10);
        this.f16995u = (AlarmManager) ((C1023u0) this.f16104r).f17579r.getSystemService("alarm");
    }

    @Override // i7.L1
    public final void r() {
        AlarmManager alarmManager = this.f16995u;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            u();
        }
    }

    public final void s() {
        p();
        X x9 = ((C1023u0) this.f16104r).f17584w;
        C1023u0.m(x9);
        x9.f17178E.a("Unscheduling upload");
        AlarmManager alarmManager = this.f16995u;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        t().c();
        if (Build.VERSION.SDK_INT >= 24) {
            u();
        }
    }

    public final AbstractC1002n t() {
        if (this.f16996v == null) {
            this.f16996v = new z1(this, this.f17001s.f17084C, 1);
        }
        return this.f16996v;
    }

    public final void u() {
        JobScheduler jobScheduler = (JobScheduler) ((C1023u0) this.f16104r).f17579r.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(v());
        }
    }

    public final int v() {
        if (this.f16997w == null) {
            this.f16997w = Integer.valueOf("measurement".concat(String.valueOf(((C1023u0) this.f16104r).f17579r.getPackageName())).hashCode());
        }
        return this.f16997w.intValue();
    }

    public final PendingIntent w() {
        Context context = ((C1023u0) this.f16104r).f17579r;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.F.f14024a);
    }
}
