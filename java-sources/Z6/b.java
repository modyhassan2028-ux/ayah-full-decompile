package Z6;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11025b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N0.a f11026a;

    static {
        b bVar = new b();
        bVar.f11026a = null;
        f11025b = bVar;
    }

    public static N0.a a(Context context) {
        N0.a aVar;
        b bVar = f11025b;
        synchronized (bVar) {
            try {
                if (bVar.f11026a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f11026a = new N0.a(context);
                }
                aVar = bVar.f11026a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
