package p177r7;

import E2.x0;
import Q1.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new x0(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21590u;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21589t = parcel.readInt();
        this.f21590u = parcel.readInt() != 0;
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f21589t);
        parcel.writeInt(this.f21590u ? 1 : 0);
    }
}
