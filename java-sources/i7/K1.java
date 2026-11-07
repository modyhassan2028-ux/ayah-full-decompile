package i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends V6.a {
    public static final Parcelable.Creator<K1> CREATOR = new p053f.h(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f17026r;

    public K1(ArrayList arrayList) {
        this.f17026r = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.B0(parcel, 1, this.f17026r);
        p017b7.g.F0(parcel, iD0);
    }
}
