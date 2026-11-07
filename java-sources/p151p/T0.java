package p151p;

import E2.x0;
import Q1.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends b {
    public static final Parcelable.Creator<T0> CREATOR = new x0(15);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20596t;

    public T0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20596t = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f20596t + "}";
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f20596t));
    }
}
