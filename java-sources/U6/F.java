package U6;

import E2.O;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class F extends V6.a {
    public static final Parcelable.Creator<F> CREATOR = new O(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bundle f8201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public R6.d[] f8202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0528f f8204u;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.w0(parcel, 1, this.f8201r);
        p017b7.g.A0(parcel, 2, this.f8202s, i10);
        int i11 = this.f8203t;
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(i11);
        p017b7.g.y0(parcel, 4, this.f8204u, i10);
        p017b7.g.F0(parcel, iD0);
    }
}
