package p226x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class y extends h {
    public static final Parcelable.Creator<y> CREATOR = new h(27);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24362r;

    public y(Parcel parcel) {
        super(parcel);
        this.f24362r = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f24362r ? 1 : 0);
    }

    public y() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
