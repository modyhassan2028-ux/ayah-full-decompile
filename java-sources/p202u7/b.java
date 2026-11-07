package p202u7;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Q1.b {
    public static final Parcelable.Creator<b> CREATOR = new x0(20);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22963t;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f22963t = parcel.readInt() == 1;
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f22963t ? 1 : 0);
    }
}
