package p151p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class J extends View.BaseSavedState {
    public static final Parcelable.Creator<J> CREATOR = new h(19);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20561r;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f20561r ? (byte) 1 : (byte) 0);
    }
}
