package U6;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0531i extends V6.a {
    public static final Parcelable.Creator<C0531i> CREATOR = new O(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f8272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f8275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8276y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8277z;

    public C0531i(int i10, int i11, int i12, long j, long j10, String str, String str2, int i13, int i14) {
        this.f8269r = i10;
        this.f8270s = i11;
        this.f8271t = i12;
        this.f8272u = j;
        this.f8273v = j10;
        this.f8274w = str;
        this.f8275x = str2;
        this.f8276y = i13;
        this.f8277z = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(this.f8269r);
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(this.f8270s);
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(this.f8271t);
        p017b7.g.G0(parcel, 4, 8);
        parcel.writeLong(this.f8272u);
        p017b7.g.G0(parcel, 5, 8);
        parcel.writeLong(this.f8273v);
        p017b7.g.z0(parcel, 6, this.f8274w);
        p017b7.g.z0(parcel, 7, this.f8275x);
        p017b7.g.G0(parcel, 8, 4);
        parcel.writeInt(this.f8276y);
        p017b7.g.G0(parcel, 9, 4);
        parcel.writeInt(this.f8277z);
        p017b7.g.F0(parcel, iD0);
    }
}
