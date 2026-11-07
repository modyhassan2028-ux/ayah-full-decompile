package E2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class M0 implements Parcelable {
    public static final Parcelable.Creator<M0> CREATOR = new O(2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1569A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f1573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f1575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f1576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1578z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1570r);
        parcel.writeInt(this.f1571s);
        parcel.writeInt(this.f1572t);
        if (this.f1572t > 0) {
            parcel.writeIntArray(this.f1573u);
        }
        parcel.writeInt(this.f1574v);
        if (this.f1574v > 0) {
            parcel.writeIntArray(this.f1575w);
        }
        parcel.writeInt(this.f1577y ? 1 : 0);
        parcel.writeInt(this.f1578z ? 1 : 0);
        parcel.writeInt(this.f1569A ? 1 : 0);
        parcel.writeList(this.f1576x);
    }
}
