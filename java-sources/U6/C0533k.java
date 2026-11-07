package U6;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U6.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0533k extends V6.a {
    public static final Parcelable.Creator<C0533k> CREATOR = new O(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8288v;

    public C0533k(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f8284r = i10;
        this.f8285s = z10;
        this.f8286t = z11;
        this.f8287u = i11;
        this.f8288v = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(this.f8284r);
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(this.f8285s ? 1 : 0);
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(this.f8286t ? 1 : 0);
        p017b7.g.G0(parcel, 4, 4);
        parcel.writeInt(this.f8287u);
        p017b7.g.G0(parcel, 5, 4);
        parcel.writeInt(this.f8288v);
        p017b7.g.F0(parcel, iD0);
    }
}
