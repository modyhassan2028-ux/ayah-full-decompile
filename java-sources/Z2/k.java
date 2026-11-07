package Z2;

import E2.x0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Q1.b {
    public static final Parcelable.Creator<k> CREATOR = new x0(13);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Parcelable f10976u;

    public k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
        this.f10975t = parcel.readInt();
        this.f10976u = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return p245z2.a.E(sb, this.f10975t, "}");
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f10975t);
        parcel.writeParcelable(this.f10976u, i10);
    }
}
