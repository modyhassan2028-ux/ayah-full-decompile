package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends V6.a {
    public static final Parcelable.Creator<I1> CREATOR = new p053f.h(13);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f17012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f17013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f17014t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f17015u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17016v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f17017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f17018x;

    public I1(long j, byte[] bArr, String str, Bundle bundle, int i10, long j10, String str2) {
        this.f17012r = j;
        this.f17013s = bArr;
        this.f17014t = str;
        this.f17015u = bundle;
        this.f17016v = i10;
        this.f17017w = j10;
        this.f17018x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 8);
        parcel.writeLong(this.f17012r);
        byte[] bArr = this.f17013s;
        if (bArr != null) {
            int iD1 = p017b7.g.D0(parcel, 2);
            parcel.writeByteArray(bArr);
            p017b7.g.F0(parcel, iD1);
        }
        p017b7.g.z0(parcel, 3, this.f17014t);
        p017b7.g.w0(parcel, 4, this.f17015u);
        p017b7.g.G0(parcel, 5, 4);
        parcel.writeInt(this.f17016v);
        p017b7.g.G0(parcel, 6, 8);
        parcel.writeLong(this.f17017w);
        p017b7.g.z0(parcel, 7, this.f17018x);
        p017b7.g.F0(parcel, iD0);
    }
}
