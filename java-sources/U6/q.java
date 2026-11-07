package U6;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class q extends V6.a {
    public static final Parcelable.Creator<q> CREATOR = new O(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Scope[] f8301u;

    public q(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f8298r = i10;
        this.f8299s = i11;
        this.f8300t = i12;
        this.f8301u = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(this.f8298r);
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(this.f8299s);
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(this.f8300t);
        p017b7.g.A0(parcel, 4, this.f8301u, i10);
        p017b7.g.F0(parcel, iD0);
    }
}
