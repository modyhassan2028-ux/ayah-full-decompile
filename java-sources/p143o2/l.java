package p143o2;

import X4.c;
import Z0.B;
import android.os.IBinder;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f20288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f20289t;

    public /* synthetic */ l(c cVar, B b5, int i10) {
        this.f20287r = i10;
        this.f20289t = cVar;
        this.f20288s = b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20287r) {
            case 0:
                f fVar = (f) ((MediaBrowserServiceCompat) this.f20289t.f9953r).f12704v.remove(((Messenger) this.f20288s.f10875s).getBinder());
                if (fVar != null) {
                    ((Messenger) fVar.f20275d.f10875s).getBinder().unlinkToDeath(fVar, 0);
                }
                break;
            default:
                IBinder binder = ((Messenger) this.f20288s.f10875s).getBinder();
                f fVar2 = (f) ((MediaBrowserServiceCompat) this.f20289t.f9953r).f12704v.remove(binder);
                if (fVar2 != null) {
                    binder.unlinkToDeath(fVar2, 0);
                }
                break;
        }
    }
}
