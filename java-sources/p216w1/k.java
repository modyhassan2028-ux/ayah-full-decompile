package p216w1;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JobWorkItem f23590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f23591b;

    public k(l lVar, JobWorkItem jobWorkItem) {
        this.f23591b = lVar;
        this.f23590a = jobWorkItem;
    }

    @Override // p216w1.j
    public final void a() {
        synchronized (this.f23591b.f23593b) {
            try {
                JobParameters jobParameters = this.f23591b.f23594c;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.f23590a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p216w1.j
    public final Intent getIntent() {
        return this.f23590a.getIntent();
    }
}
