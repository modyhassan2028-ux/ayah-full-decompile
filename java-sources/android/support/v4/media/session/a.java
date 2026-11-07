package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f11336f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11336f;
    }

    @Override // android.support.v4.media.session.b
    public final void z0(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                parcelObtain.writeInt(1);
                playbackStateCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f11336f.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
