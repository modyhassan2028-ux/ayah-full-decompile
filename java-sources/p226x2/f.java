package p226x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;
import p053f.h;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new h(23);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashSet f24307r;

    public f(Parcel parcel) {
        super(parcel);
        int i10 = parcel.readInt();
        this.f24307r = new HashSet();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f24307r, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f24307r.size());
        HashSet hashSet = this.f24307r;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public f() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
