package androidx.media.session;

import Z6.a;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.e;
import android.support.v4.media.session.p;
import android.util.Log;
import java.util.List;
import p151p.C1271v;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12706a = 0;

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbD = p.D("Expected 1 service that handles ", str, ", found ");
        sbD.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbD.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA == null) {
            ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
            if (componentNameA2 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C1271v c1271v = new C1271v(applicationContext, intent, pendingResultGoAsync);
            e eVar = new e(applicationContext, componentNameA2, c1271v);
            c1271v.f20795f = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f11306a.f11299b.connect();
            return;
        }
        intent.setComponent(componentNameA);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                a.q(context, intent);
            } else {
                context.startService(intent);
            }
        } catch (IllegalStateException e10) {
            if (Build.VERSION.SDK_INT < 31 || !p164q2.a.b(e10)) {
                throw e10;
            }
            Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + p164q2.a.a(e10).getMessage());
        }
    }
}
