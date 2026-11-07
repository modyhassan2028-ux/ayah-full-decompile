package p231x7;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.view.View;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View.BaseSavedState {
    public static final Parcelable.Creator<a> CREATOR = new h(28);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24387r;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i10 = this.f24387r;
        if (i10 != 1) {
            str = i10 != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return p.B(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.f24387r));
    }
}
