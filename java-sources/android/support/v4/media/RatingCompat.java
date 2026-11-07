package android.support.v4.media;

import E2.O;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new O(23);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f11294s;

    public RatingCompat(int i10, float f3) {
        this.f11293r = i10;
        this.f11294s = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f11293r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f11293r);
        sb.append(" rating=");
        float f3 = this.f11294s;
        sb.append(f3 < 0.0f ? "unrated" : String.valueOf(f3));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11293r);
        parcel.writeFloat(this.f11294s);
    }
}
