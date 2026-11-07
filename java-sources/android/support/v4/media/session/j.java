package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes.dex */
public final class j extends MediaSession.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f11346a;

    public j(k kVar) {
        this.f11346a = kVar;
    }

    public static void b(m mVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        MediaSession mediaSession = mVar.f11353a;
        String str = null;
        if (i10 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        mVar.f(new p143o2.n(str, -1, -1));
    }

    public final m a() {
        m mVar;
        synchronized (this.f11346a.f11347a) {
            mVar = (m) this.f11346a.f11350d.get();
        }
        if (mVar == null || this.f11346a != mVar.b()) {
            return null;
        }
        return mVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        Y2.d dVar;
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = mVarA.f11355c;
                d dVarA = mediaSessionCompat$Token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", dVarA == null ? null : dVarA.asBinder());
                synchronized (mediaSessionCompat$Token.f11311r) {
                    dVar = mediaSessionCompat$Token.f11314u;
                }
                if (dVar != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(dVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                r.C(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    r.C(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    r.C(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    r.C(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    r.C(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        m mVar;
        i iVar;
        KeyEvent keyEvent;
        m mVarA = a();
        if (mVarA == null) {
            return false;
        }
        b(mVarA);
        k kVar = this.f11346a;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 27) {
            kVar.getClass();
        } else {
            synchronized (kVar.f11347a) {
                mVar = (m) kVar.f11350d.get();
                iVar = kVar.f11351e;
            }
            if (mVar != null && iVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                p143o2.n nVarC = mVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() != 0) {
                        kVar.a(mVar, iVar);
                    } else if (kVar.f11349c) {
                        iVar.removeMessages(1);
                        kVar.f11349c = false;
                        PlaybackStateCompat playbackStateCompatD = mVar.d();
                        if (((playbackStateCompatD == null ? 0L : playbackStateCompatD.f11327v) & 32) != 0) {
                            kVar.d();
                        }
                    } else {
                        kVar.f11349c = true;
                        iVar.sendMessageDelayed(iVar.obtainMessage(1, nVarC), ViewConfiguration.getDoubleTapTimeout());
                    }
                    z10 = true;
                } else {
                    kVar.a(mVar, iVar);
                }
            }
        }
        mVarA.f(null);
        return z10 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f11346a.b();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f11346a.c();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        r.C(bundle);
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f3) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f3;
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        if (rating != null) {
            int iB = android.support.v4.media.h.b(rating);
            RatingCompat ratingCompat = null;
            if (android.support.v4.media.h.e(rating)) {
                switch (iB) {
                    case 1:
                        ratingCompat = new RatingCompat(1, android.support.v4.media.h.d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, android.support.v4.media.h.f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fC = android.support.v4.media.h.c(rating);
                        if (iB == 3) {
                            f3 = 3.0f;
                        } else if (iB == 4) {
                            f3 = 4.0f;
                        } else if (iB != 5) {
                            Log.e("Rating", "Invalid rating style (" + iB + ") for a star rating");
                        } else {
                            f3 = 5.0f;
                        }
                        if (fC >= 0.0f && fC <= f3) {
                            ratingCompat = new RatingCompat(iB, fC);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float fA = android.support.v4.media.h.a(rating);
                        if (fA >= 0.0f && fA <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fA);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                }
            } else {
                switch (iB) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iB, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f11346a.d();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f11346a.e();
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        mVarA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        m mVarA = a();
        if (mVarA == null) {
            return;
        }
        b(mVarA);
        this.f11346a.f();
        mVarA.f(null);
    }
}
