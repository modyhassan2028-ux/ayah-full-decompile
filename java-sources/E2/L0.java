package E2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements Parcelable {
    public static final Parcelable.Creator<L0> CREATOR = new O(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f1563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1564u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1561r + ", mGapDir=" + this.f1562s + ", mHasUnwantedGapAfter=" + this.f1564u + ", mGapPerSpan=" + Arrays.toString(this.f1563t) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1561r);
        parcel.writeInt(this.f1562s);
        parcel.writeInt(this.f1564u ? 1 : 0);
        int[] iArr = this.f1563t;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1563t);
        }
    }
}
