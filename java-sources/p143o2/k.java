package p143o2;

import X4.c;
import Z0.B;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.p;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20281r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f20282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f20283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f20284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f20286w;

    public k(c cVar, B b5, String str, int i10, int i11, Bundle bundle) {
        this.f20286w = cVar;
        this.f20282s = b5;
        this.f20284u = str;
        this.f20283t = i10;
        this.f20285v = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        switch (this.f20281r) {
            case 0:
                B b5 = this.f20282s;
                Messenger messenger = (Messenger) b5.f10875s;
                IBinder binder = messenger.getBinder();
                c cVar = this.f20286w;
                ((MediaBrowserServiceCompat) cVar.f9953r).f12704v.remove(binder);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) cVar.f9953r;
                int i10 = this.f20283t;
                int i11 = this.f20285v;
                String str = this.f20284u;
                f fVar2 = new f(mediaBrowserServiceCompat, str, i10, i11, b5);
                if (mediaBrowserServiceCompat.a() == null) {
                    StringBuilder sbD = p.D("No root for client ", str, " from service ");
                    sbD.append(k.class.getName());
                    Log.i("MBServiceCompat", sbD.toString());
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 2;
                        messageObtain.arg1 = 2;
                        messageObtain.setData(null);
                        messenger.send(messageObtain);
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                        return;
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat.f12704v.put(binder, fVar2);
                        binder.linkToDeath(fVar2, 0);
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
                        mediaBrowserServiceCompat.f12704v.remove(binder);
                        return;
                    }
                }
                break;
            default:
                B b10 = this.f20282s;
                IBinder binder2 = ((Messenger) b10.f10875s).getBinder();
                c cVar2 = this.f20286w;
                ((MediaBrowserServiceCompat) cVar2.f9953r).f12704v.remove(binder2);
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = (MediaBrowserServiceCompat) cVar2.f9953r;
                Iterator it = mediaBrowserServiceCompat2.f12703u.iterator();
                while (true) {
                    fVar = null;
                    if (it.hasNext()) {
                        f fVar3 = (f) it.next();
                        if (fVar3.f20274c == this.f20283t) {
                            fVar = (TextUtils.isEmpty(this.f20284u) || this.f20285v <= 0) ? new f(mediaBrowserServiceCompat2, fVar3.f20272a, fVar3.f20273b, fVar3.f20274c, b10) : null;
                            it.remove();
                        }
                    }
                }
                if (fVar == null) {
                    fVar = new f(mediaBrowserServiceCompat2, this.f20284u, this.f20285v, this.f20283t, b10);
                }
                mediaBrowserServiceCompat2.f12704v.put(binder2, fVar);
                try {
                    binder2.linkToDeath(fVar, 0);
                } catch (RemoteException unused3) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
                break;
        }
    }

    public k(c cVar, B b5, int i10, String str, int i11, Bundle bundle) {
        this.f20286w = cVar;
        this.f20282s = b5;
        this.f20283t = i10;
        this.f20284u = str;
        this.f20285v = i11;
    }
}
