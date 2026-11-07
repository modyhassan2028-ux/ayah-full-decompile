package V7;

import E2.x0;
import Q1.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new x0(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O f8418t;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f8418t = new O(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f8418t + "}";
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        O o10 = this.f8418t;
        int i11 = o10.f22703t;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = (String) o10.f(i12);
            bundleArr[i12] = (Bundle) o10.i(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f8418t = new O(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8418t.put(strArr[i11], bundleArr[i11]);
        }
    }
}
