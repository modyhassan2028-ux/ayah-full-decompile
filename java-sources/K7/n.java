package K7;

import E2.x0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Q1.b {
    public static final Parcelable.Creator<n> CREATOR = new x0(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f5298t;

    public n(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5298t = parcel.readBundle(classLoader);
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeBundle(this.f5298t);
    }
}
