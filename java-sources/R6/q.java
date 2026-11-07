package R6;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final class q extends V6.a {
    public static final Parcelable.Creator<q> CREATOR = new O(7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f7270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f7272u;

    public q(String str, boolean z10, int i10, int i11) {
        this.f7269r = z10;
        this.f7270s = str;
        this.f7271t = AbstractC0813f2.V(i10) - 1;
        this.f7272u = B1.Q(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(this.f7269r ? 1 : 0);
        p017b7.g.z0(parcel, 2, this.f7270s);
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(this.f7271t);
        p017b7.g.G0(parcel, 4, 4);
        parcel.writeInt(this.f7272u);
        p017b7.g.F0(parcel, iD0);
    }
}
