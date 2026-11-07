package i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J1 extends V6.a {
    public static final Parcelable.Creator<J1> CREATOR = new p053f.h(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f17019r;

    public J1(ArrayList arrayList) {
        this.f17019r = arrayList;
    }

    public static J1 b(EnumC0980f1... enumC0980f1Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC0980f1Arr[0].f17357r));
        return new J1(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        List list = this.f17019r;
        if (list != null) {
            int iD1 = p017b7.g.D0(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(((Integer) list.get(i11)).intValue());
            }
            p017b7.g.F0(parcel, iD1);
        }
        p017b7.g.F0(parcel, iD0);
    }
}
