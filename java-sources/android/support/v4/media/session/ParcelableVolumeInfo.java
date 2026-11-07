package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new q(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11319v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11315r);
        parcel.writeInt(this.f11317t);
        parcel.writeInt(this.f11318u);
        parcel.writeInt(this.f11319v);
        parcel.writeInt(this.f11316s);
    }
}
