package p226x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new h(21);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f24303r;

    public b(Parcel parcel) {
        super(parcel);
        this.f24303r = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f24303r);
    }

    public b() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
