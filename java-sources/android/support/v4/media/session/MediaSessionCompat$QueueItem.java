package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new q(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MediaDescriptionCompat f11308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f11309s;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f11308r = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f11309s = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f11308r);
        sb.append(", Id=");
        return p.x(this.f11309s, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f11308r.writeToParcel(parcel, i10);
        parcel.writeLong(this.f11309s);
    }
}
