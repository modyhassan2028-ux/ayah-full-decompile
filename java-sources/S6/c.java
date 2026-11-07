package S6;

import U6.m;
import U6.y;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.H;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L5.c f7508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f7509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T6.a f7510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7511f;
    public final R7.f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T6.d f7512h;

    public c(Context context, L5.c cVar, m mVar, b bVar) {
        y.g(context, "Null context is not permitted.");
        y.g(cVar, "Api must not be null.");
        y.g(bVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y.g(applicationContext, "The provided context did not have an application context.");
        this.f7506a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f7507b = attributionTag;
        this.f7508c = cVar;
        this.f7509d = mVar;
        this.f7510e = new T6.a(cVar, mVar, attributionTag);
        T6.d dVarE = T6.d.e(applicationContext);
        this.f7512h = dVarE;
        this.f7511f = dVarE.f7824h.getAndIncrement();
        this.g = bVar.f7505a;
        H h7 = dVarE.f7828m;
        h7.sendMessage(h7.obtainMessage(7, this));
    }
}
