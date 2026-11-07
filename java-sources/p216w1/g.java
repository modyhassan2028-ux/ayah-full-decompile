package p216w1;

import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobIntentService f23583a;

    public g(JobIntentService jobIntentService) {
        this.f23583a = jobIntentService;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        j jVarB;
        while (true) {
            JobIntentService jobIntentService = this.f23583a;
            l lVar = jobIntentService.f12315r;
            if (lVar != null) {
                jVarB = lVar.b();
            } else {
                synchronized (jobIntentService.f12319v) {
                    try {
                        jVarB = jobIntentService.f12319v.size() > 0 ? (j) jobIntentService.f12319v.remove(0) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (jVarB == null) {
                return null;
            }
            JobIntentService jobIntentService2 = this.f23583a;
            jVarB.getIntent();
            jobIntentService2.b();
            jVarB.a();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f23583a.c();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f23583a.c();
    }
}
