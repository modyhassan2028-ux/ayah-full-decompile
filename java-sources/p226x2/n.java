package p226x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class n extends h {
    public static final Parcelable.Creator<n> CREATOR = new h(25);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f24314r;

    public n(Parcel parcel) {
        super(parcel);
        this.f24314r = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f24314r);
    }

    public n(int i10) {
        super(AbsSavedState.EMPTY_STATE);
        this.f24314r = i10;
    }
}
