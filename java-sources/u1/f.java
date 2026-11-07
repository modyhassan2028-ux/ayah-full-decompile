package u1;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Q1.b {
    public static final Parcelable.Creator<f> CREATOR = new x0(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SparseArray f22820t;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f22820t = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f22820t.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.f22820t;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f22820t.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f22820t.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
