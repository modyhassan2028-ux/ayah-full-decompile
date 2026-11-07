package p056f2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new h(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f15986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f15987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0929b[] f15988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15989u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f15990v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f15991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f15992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f15993y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f15986r);
        parcel.writeStringList(this.f15987s);
        parcel.writeTypedArray(this.f15988t, i10);
        parcel.writeInt(this.f15989u);
        parcel.writeString(this.f15990v);
        parcel.writeStringList(this.f15991w);
        parcel.writeTypedList(this.f15992x);
        parcel.writeTypedList(this.f15993y);
    }
}
