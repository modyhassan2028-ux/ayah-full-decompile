package R6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.H;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class j extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f7256b = eVar;
        this.f7255a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = f.f7245a;
        e eVar = this.f7256b;
        Context context = this.f7255a;
        int iB = eVar.b(context, i11);
        AtomicBoolean atomicBoolean = h.f7247a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = eVar.a(iB, context, "n");
            eVar.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
