package p143o2;

import E6.u;
import Z0.B;
import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.r;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends MediaBrowserService {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f20278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f20279s;

    public g(u uVar, Context context) {
        this.f20279s = uVar;
        this.f20278r = uVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        r.C(bundle);
        u uVar = this.f20278r;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) uVar.f1963e;
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        int i11 = -1;
        if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
            bundle2.remove("extra_client_version");
            uVar.f1962d = new Messenger(mediaBrowserServiceCompat.f12705w);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", ((Messenger) uVar.f1962d).getBinder());
            ((ArrayList) uVar.f1960b).add(bundle3);
            i11 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
        }
        f fVar = new f(mediaBrowserServiceCompat, str, i11, i10, null);
        if (mediaBrowserServiceCompat.a() == null) {
            return null;
        }
        if (((Messenger) uVar.f1962d) == null) {
            throw null;
        }
        mediaBrowserServiceCompat.f12703u.add(fVar);
        throw null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        ((MediaBrowserServiceCompat) this.f20278r.f1963e).b();
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        B b5 = new B(25, result);
        f fVar = ((MediaBrowserServiceCompat) this.f20279s.f1964f).f12702t;
        ((MediaBrowserService.Result) b5.f10875s).sendResult(null);
    }
}
