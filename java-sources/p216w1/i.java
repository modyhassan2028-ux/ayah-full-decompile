package p216w1;

import android.content.Intent;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f23587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JobIntentService f23589c;

    public i(JobIntentService jobIntentService, Intent intent, int i10) {
        this.f23589c = jobIntentService;
        this.f23587a = intent;
        this.f23588b = i10;
    }

    @Override // p216w1.j
    public final void a() {
        this.f23589c.stopSelf(this.f23588b);
    }

    @Override // p216w1.j
    public final Intent getIntent() {
        return this.f23587a;
    }
}
