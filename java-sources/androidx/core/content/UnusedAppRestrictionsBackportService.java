package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p234y1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f12332r = new b(this);

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f12332r;
    }
}
