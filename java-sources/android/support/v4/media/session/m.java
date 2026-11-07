package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSession f11353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f11354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaSessionCompat$Token f11355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11356d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList f11357e = new RemoteCallbackList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PlaybackStateCompat f11358f;
    public MediaMetadataCompat g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f11359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p143o2.n f11360i;

    public m(Context context) {
        MediaSession mediaSessionA = a(context);
        this.f11353a = mediaSessionA;
        l lVar = new l(this);
        this.f11354b = lVar;
        this.f11355c = new MediaSessionCompat$Token(mediaSessionA.getSessionToken(), lVar);
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context) {
        return new MediaSession(context, "QuranMediaSession");
    }

    public final k b() {
        k kVar;
        synchronized (this.f11356d) {
            kVar = this.f11359h;
        }
        return kVar;
    }

    public p143o2.n c() {
        p143o2.n nVar;
        synchronized (this.f11356d) {
            nVar = this.f11360i;
        }
        return nVar;
    }

    public final PlaybackStateCompat d() {
        return this.f11358f;
    }

    public final void e(k kVar, Handler handler) {
        synchronized (this.f11356d) {
            try {
                this.f11359h = kVar;
                this.f11353a.setCallback(kVar == null ? null : kVar.f11348b, handler);
                if (kVar != null) {
                    kVar.g(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(p143o2.n nVar) {
        synchronized (this.f11356d) {
            this.f11360i = nVar;
        }
    }
}
