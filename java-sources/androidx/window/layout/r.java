package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ComponentCallbacks {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f13095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f13096s;

    public r(s sVar, Activity activity) {
        this.f13095r = sVar;
        this.f13096s = activity;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        p251z9.j.e(configuration, "newConfig");
        s sVar = this.f13095r;
        android.support.v4.media.session.r rVar = sVar.f13101e;
        if (rVar == null) {
            return;
        }
        Activity activity = this.f13096s;
        rVar.K(activity, sVar.a(activity));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
