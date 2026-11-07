package Q1;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Parcelable f6852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f6851s = new a();
    public static final Parcelable.Creator<b> CREATOR = new x0(8);

    public b() {
        this.f6852r = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f6852r, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6852r = parcelable == f6851s ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f6852r = parcelable == null ? f6851s : parcelable;
    }
}
