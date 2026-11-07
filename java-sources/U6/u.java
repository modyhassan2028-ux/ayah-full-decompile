package U6;

import E2.O;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class u implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f8310f;

    public u(IBinder iBinder) {
        this.f8310f = iBinder;
    }

    public final void a(B b5, C0529g c0529g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(b5);
            parcelObtain.writeInt(1);
            O.a(c0529g, parcelObtain, 0);
            this.f8310f.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8310f;
    }
}
