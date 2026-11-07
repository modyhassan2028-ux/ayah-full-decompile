package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Z.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0671a0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10649a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10649a) {
            case 0:
                return new C0673b0(parcel.readFloat());
            case 1:
                return new C0675c0(parcel.readInt());
            default:
                return new C0677d0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f10649a) {
            case 0:
                return new C0673b0[i10];
            case 1:
                return new C0675c0[i10];
            default:
                return new C0677d0[i10];
        }
    }
}
