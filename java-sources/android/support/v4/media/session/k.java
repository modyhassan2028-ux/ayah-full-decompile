package android.support.v4.media.session;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11349c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f11351e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11347a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11348b = new j(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f11350d = new WeakReference(null);

    public final void a(m mVar, Handler handler) {
        if (this.f11349c) {
            this.f11349c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatD = mVar.d();
            long j = playbackStateCompatD == null ? 0L : playbackStateCompatD.f11327v;
            boolean z10 = playbackStateCompatD != null && playbackStateCompatD.f11323r == 3;
            boolean z11 = (516 & j) != 0;
            boolean z12 = (j & 514) != 0;
            if (z10 && z12) {
                b();
            } else {
                if (z10 || !z11) {
                    return;
                }
                c();
            }
        }
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public final void g(m mVar, Handler handler) {
        synchronized (this.f11347a) {
            try {
                this.f11350d = new WeakReference(mVar);
                i iVar = this.f11351e;
                i iVar2 = null;
                if (iVar != null) {
                    iVar.removeCallbacksAndMessages(null);
                }
                if (mVar != null && handler != null) {
                    iVar2 = new i(this, handler.getLooper(), 0);
                }
                this.f11351e = iVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
