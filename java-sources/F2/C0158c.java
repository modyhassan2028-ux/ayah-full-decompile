package F2;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: F2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0158c implements InterfaceC0159d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f2272f;

    @Override // F2.InterfaceC0159d
    public final void J(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0159d.f2273a);
            parcelObtain.writeStringArray(strArr);
            this.f2272f.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2272f;
    }
}
