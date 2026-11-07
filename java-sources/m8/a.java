package m8;

import K6.i;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import p100j8.n;
import p185s8.C1329l0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f19687c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19689b = new AtomicReference(null);

    public a(n nVar) {
        this.f19688a = nVar;
        nVar.a(new C6.b(21, this));
    }

    public final b a(String str) {
        a aVar = (a) this.f19689b.get();
        return aVar == null ? f19687c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f19689b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f19689b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j, C1329l0 c1329l0) {
        String strS = p123m2.c.s("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strS, null);
        }
        this.f19688a.a(new i(str, j, c1329l0));
    }
}
