package T8;

import android.content.Context;
import android.os.Bundle;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f7931a;

    public a(Context context) {
        p251z9.j.e(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f7931a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // T8.o
    public final Boolean a() {
        Bundle bundle = this.f7931a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // T8.o
    public final Double b() {
        Bundle bundle = this.f7931a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // T8.o
    public final Object c(p150o9.c cVar) {
        return y.f19095a;
    }

    @Override // T8.o
    public final I9.a d() {
        Bundle bundle = this.f7931a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new I9.a(p017b7.g.s0(bundle.getInt("firebase_sessions_sessions_restart_timeout"), I9.c.SECONDS));
        }
        return null;
    }
}
