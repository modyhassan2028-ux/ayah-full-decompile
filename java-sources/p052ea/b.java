package p052ea;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new O(28);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f15866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f15868t;

    public b(String str, String str2, String str3) {
        this.f15866r = str;
        this.f15867s = str2;
        this.f15868t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15866r);
        parcel.writeString(this.f15867s);
        parcel.writeString(this.f15868t);
    }

    public b(Parcel parcel) {
        this.f15866r = parcel.readString();
        this.f15867s = parcel.readString();
        this.f15868t = parcel.readString();
    }
}
