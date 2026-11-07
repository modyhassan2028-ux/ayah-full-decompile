package P2;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Q1.b {
    public static final Parcelable.Creator<g> CREATOR = new x0(5);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6598u;

    public g(Parcel parcel) {
        super(parcel, null);
        this.f6597t = parcel.readInt() != 0;
        this.f6598u = parcel.readInt();
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f6597t ? 1 : 0);
        parcel.writeInt(this.f6598u);
    }
}
