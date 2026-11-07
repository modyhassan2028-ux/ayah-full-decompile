package Q8;

import K9.AbstractC0405x;
import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: Q8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0468o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p050e8.f f7043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T8.j f7044b;

    public C0468o(p050e8.f fVar, T8.j jVar, p150o9.h hVar, a0 a0Var) {
        p251z9.j.e(fVar, "firebaseApp");
        p251z9.j.e(jVar, "settings");
        p251z9.j.e(hVar, "backgroundDispatcher");
        p251z9.j.e(a0Var, "sessionsActivityLifecycleCallbacks");
        this.f7043a = fVar;
        this.f7044b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.0.");
        fVar.a();
        Context applicationContext = fVar.f15843a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(a0Var);
            AbstractC0405x.x(AbstractC0405x.b(hVar), null, new O9.y(this, a0Var, null, 3), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
