package p226x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class x extends h {
    public static final Parcelable.Creator<x> CREATOR = new h(26);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24361t;

    public x(Parcel parcel) {
        super(parcel);
        this.f24359r = parcel.readInt();
        this.f24360s = parcel.readInt();
        this.f24361t = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f24359r);
        parcel.writeInt(this.f24360s);
        parcel.writeInt(this.f24361t);
    }

    public x() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
