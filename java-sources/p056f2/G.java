package p056f2;

import android.os.Parcel;
import android.os.Parcelable;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Parcelable {
    public static final Parcelable.Creator<G> CREATOR = new h(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f15941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15942s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15941r);
        parcel.writeInt(this.f15942s);
    }
}
