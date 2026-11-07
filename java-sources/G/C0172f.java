package G;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: G.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0172f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0173g(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C0173g[i10];
    }
}
