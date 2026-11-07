package L3;

import K9.AbstractC0405x;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.ayah.R;
import j$.time.LocalTime;
import k3.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P9.d f5512b = AbstractC0405x.b(AbstractC0405x.e());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlarmManager f5513c;

    public g(Context context) {
        this.f5511a = context;
        Object systemService = context.getSystemService("alarm");
        j.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.f5513c = (AlarmManager) systemService;
    }

    public static final void a(g gVar, k3.b bVar) {
        String strR;
        AlarmManager alarmManager = gVar.f5513c;
        Context context = gVar.f5511a;
        h hVar = bVar.f18966a;
        k3.j jVar = bVar.f18969d;
        LocalTime localTime = bVar.f18967b;
        boolean z10 = hVar instanceof k3.g;
        k3.g gVar2 = z10 ? (k3.g) hVar : null;
        String str = gVar2 != null ? gVar2.f18975b : null;
        if (hVar instanceof k3.f) {
            int iOrdinal = ((k3.f) hVar).f18973a.ordinal();
            if (iOrdinal == 0) {
                strR = "ayah://reminder/app/daily_reading";
            } else if (iOrdinal == 1) {
                strR = "ayah://reminder/app/sura_kahf";
            } else {
                if (iOrdinal != 2) {
                    throw new A6.a();
                }
                strR = "ayah://reminder/app/verse_of_the_day";
            }
        } else {
            if (!z10) {
                throw new A6.a();
            }
            strR = p123m2.c.r(((k3.g) hVar).f18974a, "ayah://reminder/custom/");
        }
        Uri uri = Uri.parse(strR);
        j.d(uri, "parse(...)");
        PendingIntent pendingIntentU = va.g.u(context, uri, localTime, jVar, str);
        alarmManager.cancel(pendingIntentU);
        if (bVar.f18968c) {
            long jO = va.g.o(localTime, jVar);
            if (jO > 0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    String string = context.getString(R.string.notification_channel_reminders);
                    j.d(string, "getString(...)");
                    NotificationChannel notificationChannel = new NotificationChannel("ayah_reminders", string, 2);
                    Object systemService = context.getSystemService("notification");
                    j.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    if (notificationManager.getNotificationChannel(string) == null) {
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                alarmManager.setExactAndAllowWhileIdle(1, jO, pendingIntentU);
            }
        }
    }
}
