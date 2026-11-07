package p216w1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f23622a;

    static {
        new HashSet();
    }

    public u(Context context) {
        this.f23622a = (NotificationManager) context.getSystemService("notification");
    }
}
