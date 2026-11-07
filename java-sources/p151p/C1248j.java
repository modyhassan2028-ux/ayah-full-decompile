package p151p;

import android.os.Parcel;
import android.os.Parcelable;
import p053f.h;

/* JADX INFO: renamed from: p.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1248j implements Parcelable {
    public static final Parcelable.Creator<C1248j> CREATOR = new h(18);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20687r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20687r);
    }
}
