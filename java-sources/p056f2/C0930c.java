package p056f2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p053f.h;

/* JADX INFO: renamed from: f2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0930c implements Parcelable {
    public static final Parcelable.Creator<C0930c> CREATOR = new h(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f16082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f16083s;

    public C0930c(Parcel parcel) {
        this.f16082r = parcel.createStringArrayList();
        this.f16083s = parcel.createTypedArrayList(C0929b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f16082r);
        parcel.writeTypedList(this.f16083s);
    }
}
