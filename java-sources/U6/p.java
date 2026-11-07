package U6;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0899x;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0899x {
    public final a7.a G0(a7.b bVar, q qVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14507h);
        int i10 = p038d7.b.f15700a;
        parcelObtain.writeStrongBinder(bVar);
        parcelObtain.writeInt(1);
        qVar.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.g.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                a7.a aVarF0 = a7.b.F0(parcelObtain2.readStrongBinder());
                parcelObtain2.recycle();
                return aVarF0;
            } catch (RuntimeException e10) {
                parcelObtain2.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
