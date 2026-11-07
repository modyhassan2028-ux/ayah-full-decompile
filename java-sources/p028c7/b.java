package p028c7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f13536f;

    public b(IBinder iBinder) {
        this.f13536f = iBinder;
    }

    public final Parcel a(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13536f.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13536f;
    }
}
