package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f11339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11340b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11341c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11342d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaSessionCompat$Token f11343e;

    public f(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f11343e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f11312s);
        this.f11339a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.f11307r = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        if (this.f11343e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f11341c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f11342d.put(null, new e());
            throw null;
        }
    }
}
