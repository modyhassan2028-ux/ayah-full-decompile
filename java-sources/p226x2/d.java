package p226x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new h(22);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f24305r;

    public d(Parcel parcel) {
        super(parcel);
        this.f24305r = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f24305r);
    }

    public d() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
