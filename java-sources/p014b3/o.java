package p014b3;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o extends View.BaseSavedState {
    public static final Parcelable.Creator<o> CREATOR = new x0(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Parcelable f13234t;

    public o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13232r = parcel.readInt();
        this.f13233s = parcel.readInt();
        this.f13234t = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f13232r);
        parcel.writeInt(this.f13233s);
        parcel.writeParcelable(this.f13234t, i10);
    }
}
