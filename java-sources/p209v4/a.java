package p209v4;

import E6.k;
import H9.o;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextPaint;
import androidx.core.graphics.drawable.IconCompat;
import com.ayah.R;
import java.util.ArrayList;
import p125m4.b;
import p154p2.c;
import p216w1.n;
import p216w1.p;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f23331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaSessionCompat$Token f23332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NotificationManager f23333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p065g3.a f23335f;
    public s4.a g;

    public a(Context context, k kVar, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f23330a = context;
        this.f23331b = kVar;
        this.f23332c = mediaSessionCompat$Token;
        Object systemService = context.getSystemService("notification");
        j.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f23333d = notificationManager;
        Resources resources = context.getResources();
        ThreadLocal threadLocal = p244z1.j.f24770a;
        this.f23334e = resources.getColor(R.color.notification_color, null);
        if (Build.VERSION.SDK_INT >= 26) {
            String string = context.getString(R.string.notification_channel_audio);
            j.d(string, "getString(...)");
            NotificationChannel notificationChannel = new NotificationChannel("ayah_audio_playback", string, 2);
            if (notificationManager.getNotificationChannel(string) == null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    public final s4.a a() {
        String strA;
        s4.a aVar = this.g;
        p065g3.a aVar2 = this.f23335f;
        if (aVar2 == null || (strA = aVar2.a()) == null) {
            strA = "";
        }
        Context context = this.f23331b.f1940a;
        if (aVar != null && aVar.f22132b.equals(strA) && b.b() == aVar.f22133c && context.getResources().getBoolean(R.bool.is_dark_mode) == aVar.f22134d) {
            return aVar;
        }
        String[] strArr = (String[]) o.n1(strA, new String[]{" "}).toArray(new String[0]);
        if (strArr.length != 2) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(320, 320, Bitmap.Config.ARGB_8888);
        j.d(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(context.getColor(R.color.background));
        Resources resources = context.getResources();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(context.getColor(R.color.tint));
        textPaint.setFakeBoldText(true);
        textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.album_art_first_name_text_size));
        float f3 = 320;
        float f7 = 2;
        canvas.drawText(strArr[0], (f3 - textPaint.measureText(strArr[0])) / f7, f3 / 3.0f, textPaint);
        textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.album_art_last_name_text_size));
        canvas.drawText(strArr[1], (f3 - textPaint.measureText(strArr[1])) / f7, 640 / 3.0f, textPaint);
        return new s4.a(bitmapCreateBitmap, strA, b.b(), resources.getBoolean(R.bool.is_dark_mode));
    }

    public final Notification b(String str, boolean z10, Intent intent, Intent intent2) {
        int i10;
        String strA;
        Context context = this.f23330a;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        intent2.setAction("com.ayah.action.REWIND");
        PendingIntent service = PendingIntent.getService(context, 1, intent2, 335544320);
        intent2.setAction("com.ayah.action.SKIP");
        PendingIntent service2 = PendingIntent.getService(context, 1, intent2, 335544320);
        intent2.setAction("com.ayah.action.PAUSE");
        PendingIntent service3 = PendingIntent.getService(context, 2, intent2, 335544320);
        intent2.setAction("com.ayah.action.PLAYBACK");
        PendingIntent service4 = PendingIntent.getService(context, 3, intent2, 335544320);
        if (z10) {
            j.b(service4);
            i10 = 2131230927;
            service3 = service4;
        } else {
            j.b(service3);
            i10 = 2131230926;
        }
        this.g = a();
        p pVar = new p(context, "ayah_audio_playback");
        pVar.f23607e = p.b(str);
        p065g3.a aVar = this.f23335f;
        if (aVar == null || (strA = aVar.a()) == null) {
            strA = "";
        }
        pVar.f23608f = p.b(strA);
        CharSequence charSequenceB = p.b(str);
        Notification notification = pVar.f23620t;
        notification.tickerText = charSequenceB;
        notification.icon = R.drawable.ic_notification;
        pVar.c(2, true);
        pVar.g = activity;
        n nVar = new n(2131230937, "", service);
        ArrayList arrayList = pVar.f23604b;
        arrayList.add(nVar);
        arrayList.add(new n(i10, "", service3));
        arrayList.add(new n(2131230936, "", service2));
        pVar.f23616p = this.f23334e;
        pVar.f23617q = 1;
        s4.a aVar2 = this.g;
        IconCompat iconCompat = null;
        Bitmap bitmapCreateScaledBitmap = aVar2 != null ? aVar2.f22131a : null;
        if (bitmapCreateScaledBitmap != null) {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = pVar.f23603a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmapCreateScaledBitmap.getWidth() > dimensionPixelSize || bitmapCreateScaledBitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmapCreateScaledBitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmapCreateScaledBitmap.getHeight())));
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.ceil(((double) bitmapCreateScaledBitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmapCreateScaledBitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f12333k;
            bitmapCreateScaledBitmap.getClass();
            iconCompat = new IconCompat(1);
            iconCompat.f12335b = bitmapCreateScaledBitmap;
        }
        pVar.f23609h = iconCompat;
        pVar.j = false;
        c cVar = new c();
        cVar.f20977t = this.f23332c;
        cVar.f20976s = new int[]{0, 1, 2};
        pVar.d(cVar);
        Notification notificationA = pVar.a();
        j.d(notificationA, "build(...)");
        return notificationA;
    }
}
