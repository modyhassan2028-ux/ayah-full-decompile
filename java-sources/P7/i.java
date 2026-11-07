package P7;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Q1.b {
    public static final Parcelable.Creator<i> CREATOR = new x0(7);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f6735t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6736u;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6735t = parcel.readString();
        this.f6736u = parcel.readInt();
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f6735t);
        parcel.writeInt(this.f6736u);
    }
}
