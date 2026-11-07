package p216w1;

import android.app.Notification;
import p056f2.AbstractC0939l;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0939l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f23602s;

    @Override // p056f2.AbstractC0939l
    public final void g(i iVar) {
        new Notification.BigTextStyle((Notification.Builder) iVar.f16422s).setBigContentTitle(null).bigText(this.f23602s);
    }

    @Override // p056f2.AbstractC0939l
    public final String h() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
