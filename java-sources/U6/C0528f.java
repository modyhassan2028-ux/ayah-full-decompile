package U6;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0528f extends V6.a {
    public static final Parcelable.Creator<C0528f> CREATOR = new O(17);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0533k f8247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f8250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f8252w;

    public C0528f(C0533k c0533k, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f8247r = c0533k;
        this.f8248s = z10;
        this.f8249t = z11;
        this.f8250u = iArr;
        this.f8251v = i10;
        this.f8252w = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.y0(parcel, 1, this.f8247r, i10);
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(this.f8248s ? 1 : 0);
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(this.f8249t ? 1 : 0);
        int[] iArr = this.f8250u;
        if (iArr != null) {
            int iD1 = p017b7.g.D0(parcel, 4);
            parcel.writeIntArray(iArr);
            p017b7.g.F0(parcel, iD1);
        }
        p017b7.g.G0(parcel, 5, 4);
        parcel.writeInt(this.f8251v);
        int[] iArr2 = this.f8252w;
        if (iArr2 != null) {
            int iD2 = p017b7.g.D0(parcel, 6);
            parcel.writeIntArray(iArr2);
            p017b7.g.F0(parcel, iD2);
        }
        p017b7.g.F0(parcel, iD0);
    }
}
