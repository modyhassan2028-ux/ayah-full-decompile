package p038d7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15699f = 1;

    public a(String str) {
        attachInterface(this, str);
    }

    public boolean E0(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f15699f) {
            case 1:
                if (i10 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i10, parcel, parcel2, i11)) {
                    return true;
                }
                return E0(i10, parcel, parcel2);
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
