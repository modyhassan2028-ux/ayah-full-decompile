package p143o2;

import E2.RunnableC0147v;
import Z0.B;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f20275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f20276e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f20277f;

    public f(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i10, int i11, B b5) {
        this.f20277f = mediaBrowserServiceCompat;
        this.f20272a = str;
        this.f20273b = i10;
        this.f20274c = i11;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            o.a(str, i10, i11);
        }
        this.f20275d = b5;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f20277f.f12705w.post(new RunnableC0147v(26, this));
    }
}
