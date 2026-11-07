package S7;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Q1.b {
    public static final Parcelable.Creator<d> CREATOR = new x0(9);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7522t;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7522t = parcel.readInt();
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f7522t);
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f7522t = sideSheetBehavior.f15178y;
    }
}
