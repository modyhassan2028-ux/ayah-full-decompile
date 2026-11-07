package L3;

import K9.AbstractC0405x;
import android.app.AlarmManager;
import android.content.Context;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p208v3.c f5504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P9.d f5505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlarmManager f5506c;

    public e(Context context, p208v3.c cVar) {
        j.e(cVar, "notificationModel");
        this.f5504a = cVar;
        this.f5505b = AbstractC0405x.b(AbstractC0405x.e());
        Object systemService = context.getSystemService("alarm");
        j.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.f5506c = (AlarmManager) systemService;
    }
}
