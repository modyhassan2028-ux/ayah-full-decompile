package P7;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Q1.b {
    public static final Parcelable.Creator<a> CREATOR = new x0(6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f6722t;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6722t = parcel.readString();
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f6722t);
    }
}
