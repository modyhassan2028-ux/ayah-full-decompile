package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11361a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11361a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f11310r = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f11315r = parcel.readInt();
                parcelableVolumeInfo.f11317t = parcel.readInt();
                parcelableVolumeInfo.f11318u = parcel.readInt();
                parcelableVolumeInfo.f11319v = parcel.readInt();
                parcelableVolumeInfo.f11316s = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f11361a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 1:
                return new MediaSessionCompat$QueueItem[i10];
            case 2:
                return new MediaSessionCompat$Token[i10];
            case 3:
                return new ParcelableVolumeInfo[i10];
            default:
                return new PlaybackStateCompat[i10];
        }
    }
}
