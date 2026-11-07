package androidx.room;

import F2.BinderC0163h;
import F2.RemoteCallbackListC0164i;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f12949s = new LinkedHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RemoteCallbackListC0164i f12950t = new RemoteCallbackListC0164i(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final BinderC0163h f12951u = new BinderC0163h(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j.e(intent, "intent");
        return this.f12951u;
    }
}
