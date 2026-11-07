package T7;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbsSavedState {
    public static final Parcelable.Creator<e> CREATOR = new O(11);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7930s;

    public e(b bVar) {
        super(bVar);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f7929r);
        parcel.writeInt(this.f7930s);
    }

    public e(Parcel parcel) {
        super(parcel.readParcelable(e.class.getClassLoader()));
        this.f7929r = parcel.readFloat();
        this.f7930s = parcel.readInt();
    }
}
