package K7;

import E2.O;
import H7.y;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new O(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y f5290s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5289r);
        parcel.writeParcelable(this.f5290s, 0);
    }
}
