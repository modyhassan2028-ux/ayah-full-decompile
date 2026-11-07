package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends V6.a {
    public static final Parcelable.Creator<F1> CREATOR = new p053f.h(12);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f16879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f16880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f16881t;

    public F1(long j, int i10, String str) {
        this.f16879r = str;
        this.f16880s = j;
        this.f16881t = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.z0(parcel, 1, this.f16879r);
        p017b7.g.G0(parcel, 2, 8);
        parcel.writeLong(this.f16880s);
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(this.f16881t);
        p017b7.g.F0(parcel, iD0);
    }
}
