package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0972d extends V6.a {
    public static final Parcelable.Creator<C0972d> CREATOR = new p053f.h(7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f17316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f17317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f17318t;

    public C0972d(int i10, long j, long j10) {
        this.f17316r = j;
        this.f17317s = i10;
        this.f17318t = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 8);
        parcel.writeLong(this.f17316r);
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(this.f17317s);
        p017b7.g.G0(parcel, 3, 8);
        parcel.writeLong(this.f17318t);
        p017b7.g.F0(parcel, iD0);
    }
}
