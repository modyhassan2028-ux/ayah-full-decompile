package p030c9;

import android.app.Application;
import com.ayah.feature.audio.service.Hilt_AyahAudioService;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p035d3.r;
import p035d3.u;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Hilt_AyahAudioService f13591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f13592s;

    public i(Hilt_AyahAudioService hilt_AyahAudioService) {
        this.f13591r = hilt_AyahAudioService;
    }

    @Override // p051e9.b
    public final Object c() {
        if (this.f13592s == null) {
            Application application = this.f13591r.getApplication();
            p050e8.b.l(application instanceof b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.f13592s = new r(((u) ((h) AbstractC0813f2.C(application, h.class))).f15660b);
        }
        return this.f13592s;
    }
}
