package p056f2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.view.View;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class S extends View.BaseSavedState {
    public static final Parcelable.Creator<S> CREATOR = new h(6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16020r;

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" curTab=");
        return p.B(sb, this.f16020r, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f16020r);
    }
}
