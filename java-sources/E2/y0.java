package E2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends Q1.b {
    public static final Parcelable.Creator<y0> CREATOR = new x0(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Parcelable f1796t;

    public y0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1796t = parcel.readParcelable(classLoader == null ? AbstractC0135m0.class.getClassLoader() : classLoader);
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f1796t, 0);
    }
}
