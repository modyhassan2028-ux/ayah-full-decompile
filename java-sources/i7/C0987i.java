package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0987i extends V6.a {
    public static final Parcelable.Creator<C0987i> CREATOR = new p053f.h(9);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f17412r;

    public C0987i(Bundle bundle) {
        this.f17412r = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.w0(parcel, 1, this.f17412r);
        p017b7.g.F0(parcel, iD0);
    }
}
