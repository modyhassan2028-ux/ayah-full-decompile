package E2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new O(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1601r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1603t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1601r);
        parcel.writeInt(this.f1602s);
        parcel.writeInt(this.f1603t ? 1 : 0);
    }
}
