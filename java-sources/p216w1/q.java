package p216w1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder builder, boolean z10) {
        builder.setAllowGeneratedReplies(z10);
    }

    public static void c(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }

    public static void d(Service service) {
        service.stopForeground(1);
    }
}
