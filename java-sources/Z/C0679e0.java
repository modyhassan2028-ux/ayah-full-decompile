package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Z.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0679e0 implements Parcelable.ClassLoaderCreator {
    public static C0681f0 a(Parcel parcel, ClassLoader classLoader) {
        S s10;
        if (classLoader == null) {
            classLoader = C0679e0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            s10 = S.f10640t;
        } else if (i10 == 1) {
            s10 = S.f10643w;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(p245z2.a.B(i10, "Unsupported MutableState policy ", " was restored"));
            }
            s10 = S.f10641u;
        }
        return new C0681f0(value, s10);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C0681f0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
