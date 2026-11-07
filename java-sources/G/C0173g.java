package G;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: G.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0173g implements Parcelable {
    public static final Parcelable.Creator<C0173g> CREATOR = new C0172f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2696r;

    public C0173g(int i10) {
        this.f2696r = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0173g) && this.f2696r == ((C0173g) obj).f2696r;
    }

    public final int hashCode() {
        return this.f2696r;
    }

    public final String toString() {
        return android.support.v4.media.session.p.A(new StringBuilder("DefaultLazyKey(index="), this.f2696r, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2696r);
    }
}
