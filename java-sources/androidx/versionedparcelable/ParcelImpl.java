package androidx.versionedparcelable;

import E2.O;
import Y2.c;
import Y2.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new O(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f12976r;

    public ParcelImpl(d dVar) {
        this.f12976r = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new c(parcel).l(this.f12976r);
    }

    public ParcelImpl(Parcel parcel) {
        this.f12976r = new c(parcel).h();
    }
}
