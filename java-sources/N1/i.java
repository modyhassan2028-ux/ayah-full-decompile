package N1;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i extends View.BaseSavedState {
    public static final Parcelable.Creator<i> CREATOR = new O(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5993r;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return p245z2.a.E(sb, this.f5993r, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f5993r);
    }
}
