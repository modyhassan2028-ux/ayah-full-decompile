package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.l;
import android.util.Log;
import android.view.KeyEvent;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import p151p.C1271v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1271v f11297a;

    public b(C1271v c1271v) {
        this.f11297a = c1271v;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.d dVar;
        android.support.v4.media.session.d dVar2;
        C1271v c1271v = this.f11297a;
        c cVar = (c) c1271v.f20791b;
        if (cVar != null) {
            a aVar = cVar.f11301d;
            MediaBrowser mediaBrowser = cVar.f11299b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    boolean z10 = false;
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = cVar.f11300c;
                        L5.c cVar2 = new L5.c(19, z10);
                        cVar2.f5532s = new Messenger(binder);
                        cVar2.f5533t = bundle;
                        cVar.f11303f = cVar2;
                        Messenger messenger = new Messenger(aVar);
                        cVar.g = messenger;
                        aVar.getClass();
                        aVar.f11296b = new WeakReference(messenger);
                        try {
                            L5.c cVar3 = cVar.f11303f;
                            Context context = cVar.f11298a;
                            Messenger messenger2 = cVar.g;
                            cVar3.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putInt("data_calling_pid", Process.myPid());
                            bundle2.putBundle("data_root_hints", (Bundle) cVar3.f5533t);
                            cVar3.N(6, bundle2, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i10 = l.g;
                    if (binder2 == null) {
                        dVar2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.media.session.d)) {
                            android.support.v4.media.session.c cVar4 = new android.support.v4.media.session.c();
                            cVar4.f11337f = binder2;
                            dVar2 = cVar4;
                        } else {
                            dVar = (android.support.v4.media.session.d) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (dVar2 != null) {
                        dVar2 = dVar;
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        cVar.f11304h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, dVar2) : null;
                    }
                }
            } catch (IllegalStateException e10) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e10);
            }
        }
        dVar2 = dVar;
        Context context2 = (Context) c1271v.f20792c;
        c cVar5 = ((e) c1271v.f20795f).f11306a;
        if (cVar5.f11304h == null) {
            MediaSession.Token sessionToken2 = cVar5.f11299b.getSessionToken();
            cVar5.f11304h = sessionToken2 != null ? new MediaSessionCompat$Token(sessionToken2, null) : null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = cVar5.f11304h;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        DesugarCollections.synchronizedSet(new HashSet());
        android.support.v4.media.session.f gVar = Build.VERSION.SDK_INT >= 29 ? new android.support.v4.media.session.g(context2, mediaSessionCompat$Token) : new android.support.v4.media.session.f(context2, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) ((Intent) c1271v.f20793d).getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        gVar.f11339a.dispatchMediaButtonEvent(keyEvent);
        c1271v.c();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        C1271v c1271v = this.f11297a;
        c cVar = (c) c1271v.f20791b;
        if (cVar != null) {
            cVar.getClass();
        }
        c1271v.c();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        C1271v c1271v = this.f11297a;
        c cVar = (c) c1271v.f20791b;
        if (cVar != null) {
            cVar.f11303f = null;
            cVar.g = null;
            cVar.f11304h = null;
            a aVar = cVar.f11301d;
            aVar.getClass();
            aVar.f11296b = new WeakReference(null);
        }
        c1271v.c();
    }
}
