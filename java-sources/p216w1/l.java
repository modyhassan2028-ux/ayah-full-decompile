package p216w1;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class l extends JobServiceEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobIntentService f23592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobParameters f23594c;

    public l(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.f23593b = new Object();
        this.f23592a = jobIntentService;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final k b() {
        synchronized (this.f23593b) {
            try {
                JobParameters jobParameters = this.f23594c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f23592a.getClassLoader());
                return new k(this, jobWorkItemDequeueWork);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f23594c = jobParameters;
        this.f23592a.a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        g gVar = this.f23592a.f12317t;
        if (gVar != null) {
            gVar.cancel(false);
        }
        synchronized (this.f23593b) {
            this.f23594c = null;
        }
        return true;
    }
}
