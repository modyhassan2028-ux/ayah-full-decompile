package p143o2;

import X4.c;
import Z0.B;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import p010b.d;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20290r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f20291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f20292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f20293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f20294v;

    public m(c cVar, B b5, String str, d dVar) {
        this.f20294v = cVar;
        this.f20291s = b5;
        this.f20292t = str;
        this.f20293u = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20290r) {
            case 0:
                if (((f) ((MediaBrowserServiceCompat) this.f20294v.f9953r).f12704v.get(((Messenger) this.f20291s.f10875s).getBinder())) != null) {
                    int i10 = 2 & 2;
                    d dVar = this.f20293u;
                    if (i10 == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("media_item", null);
                        dVar.b(0, bundle);
                    } else {
                        dVar.b(-1, null);
                    }
                } else {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f20292t);
                }
                break;
            default:
                if (((f) ((MediaBrowserServiceCompat) this.f20294v.f9953r).f12704v.get(((Messenger) this.f20291s.f10875s).getBinder())) != null) {
                    this.f20293u.b(-1, null);
                } else {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f20292t);
                }
                break;
        }
    }

    public m(c cVar, B b5, String str, Bundle bundle, d dVar) {
        this.f20294v = cVar;
        this.f20291s = b5;
        this.f20292t = str;
        this.f20293u = dVar;
    }
}
