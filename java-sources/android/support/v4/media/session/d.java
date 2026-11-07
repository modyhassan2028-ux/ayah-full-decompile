package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {
    boolean A();

    void B(MediaDescriptionCompat mediaDescriptionCompat);

    void B0(float f3);

    PendingIntent C();

    boolean D0(KeyEvent keyEvent);

    int E();

    void G(int i10);

    void H();

    void K(String str, Bundle bundle);

    void M();

    void Q();

    void S();

    void U(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void V();

    void W(int i10, int i11);

    void X(int i10);

    void Y();

    CharSequence a0();

    void d0();

    long e();

    MediaMetadataCompat e0();

    void f0(String str, Bundle bundle);

    Bundle g0();

    Bundle getExtras();

    void h0(b bVar);

    void i0(String str, Bundle bundle);

    void k(String str, Bundle bundle);

    int l0();

    void m(b bVar);

    void n(RatingCompat ratingCompat, Bundle bundle);

    void n0(long j);

    void next();

    void o0(String str, Bundle bundle);

    void p(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void p0(int i10, int i11);

    void previous();

    String q();

    ParcelableVolumeInfo q0();

    void r(boolean z10);

    void s(RatingCompat ratingCompat);

    void s0();

    void stop();

    void u0(Uri uri, Bundle bundle);

    void v(Uri uri, Bundle bundle);

    PlaybackStateCompat w();

    void w0(long j);

    void x0(int i10);

    String y0();

    void z(MediaDescriptionCompat mediaDescriptionCompat);
}
