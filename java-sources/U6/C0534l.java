package U6;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: U6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0534l extends V6.a {
    public static final Parcelable.Creator<C0534l> CREATOR = new O(12);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f8290s;

    public C0534l(int i10, List list) {
        this.f8289r = i10;
        this.f8290s = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(this.f8289r);
        p017b7.g.B0(parcel, 2, this.f8290s);
        p017b7.g.F0(parcel, iD0);
    }
}
