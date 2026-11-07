package p190t4;

import R6.g;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ayah.MainActivity;
import com.ayah.R;
import i7.D;
import p052ea.b;
import p181s2.s;
import p216w1.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p040da.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f22589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationManager f22590c;

    public a(Context context, D d5) {
        this.f22588a = context;
        this.f22589b = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), 67108864);
        Object systemService = context.getSystemService("notification");
        j.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f22590c = notificationManager;
        if (Build.VERSION.SDK_INT >= 26) {
            String string = context.getString(R.string.notification_channel_download);
            j.d(string, "getString(...)");
            NotificationChannel notificationChannel = new NotificationChannel("ayah_audio_download", string, 2);
            if (notificationManager.getNotificationChannel(string) == null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    @Override // p040da.a
    public final void a(b bVar) {
        p pVarG = g(bVar, false);
        pVarG.f23608f = p.b(this.f22588a.getString(R.string.download_complete));
        h(pVarG);
    }

    @Override // p040da.a
    public final void b(b bVar) {
        p pVarG = g(bVar, true);
        pVarG.f23608f = p.b(this.f22588a.getString(R.string.downloading));
        h(pVarG);
    }

    @Override // p040da.a
    public final void c(b bVar, long j, long j10, int i10) {
        p pVarG = g(bVar, true);
        pVarG.f23612l = 100;
        pVarG.f23613m = (int) (((double) 100.0f) * ((j * 1.0d) / (j10 * 1.0d)));
        pVarG.f23608f = p.b(this.f22588a.getString(R.string.downloading));
        h(pVarG);
    }

    @Override // p040da.a
    public final void e(b bVar, g gVar) {
        h(g(bVar, false));
    }

    @Override // p040da.a
    public final void f(b bVar) {
        p pVarG = g(bVar, false);
        pVarG.f23608f = p.b(this.f22588a.getString(R.string.download_failed));
        h(pVarG);
    }

    public final p g(b bVar, boolean z10) {
        Context context = this.f22588a;
        p pVar = new p(context, "ayah_audio_download");
        pVar.f23620t.icon = R.drawable.ic_notification;
        pVar.f23616p = context.getColor(R.color.notification_color);
        pVar.c(2, z10);
        pVar.f23617q = 1;
        pVar.g = this.f22589b;
        pVar.f23607e = p.b(bVar.f15867s);
        return pVar;
    }

    public final void h(p pVar) {
        if (Build.VERSION.SDK_INT < 33 || s.c(this.f22588a, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.f22590c.notify(1, pVar.a());
        }
    }

    @Override // p040da.a
    public final void d(b bVar) {
    }
}
