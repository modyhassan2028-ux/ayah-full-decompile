package p154p2;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p056f2.AbstractC0939l;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0939l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f20976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MediaSessionCompat$Token f20977t;

    @Override // p056f2.AbstractC0939l
    public final void g(i iVar) {
        Notification.Builder builder = (Notification.Builder) iVar.f16422s;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f20976s, this.f20977t));
        } else {
            a.d(builder, a.b(a.a(), this.f20976s, this.f20977t));
        }
    }
}
