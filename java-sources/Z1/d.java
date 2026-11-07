package Z1;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Q1.b {
    public static final Parcelable.Creator<d> CREATOR = new x0(12);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10963u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10966x;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10962t = 0;
        this.f10962t = parcel.readInt();
        this.f10963u = parcel.readInt();
        this.f10964v = parcel.readInt();
        this.f10965w = parcel.readInt();
        this.f10966x = parcel.readInt();
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f10962t);
        parcel.writeInt(this.f10963u);
        parcel.writeInt(this.f10964v);
        parcel.writeInt(this.f10965w);
        parcel.writeInt(this.f10966x);
    }
}
