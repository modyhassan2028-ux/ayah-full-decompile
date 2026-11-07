package H7;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: H7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0229c extends Q1.b {
    public static final Parcelable.Creator<C0229c> CREATOR = new x0(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3470t;

    public C0229c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3470t = parcel.readInt() == 1;
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f3470t ? 1 : 0);
    }
}
