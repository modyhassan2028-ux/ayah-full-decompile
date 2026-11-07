package p151p;

import E2.x0;
import Q1.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends b {
    public static final Parcelable.Creator<g1> CREATOR = new x0(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20661u;

    public g1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20660t = parcel.readInt();
        this.f20661u = parcel.readInt() != 0;
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f20660t);
        parcel.writeInt(this.f20661u ? 1 : 0);
    }
}
