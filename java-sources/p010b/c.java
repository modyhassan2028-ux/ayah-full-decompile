package p010b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements b {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f13116f;

    public c(d dVar) {
        this.f13116f = dVar;
        attachInterface(this, b.f13115c);
    }

    @Override // p010b.b
    public final void C0(int i10, Bundle bundle) {
        this.f13116f.a(i10, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = b.f13115c;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        C0(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
