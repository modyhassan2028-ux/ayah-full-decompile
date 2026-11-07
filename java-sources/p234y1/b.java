package p234y1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;
import p225x1.a;
import p225x1.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Binder implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UnusedAppRestrictionsBackportService f24624f;

    public b(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        this.f24624f = unusedAppRestrictionsBackportService;
        attachInterface(this, c.f24300e);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        p225x1.b bVar;
        String str = c.f24300e;
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
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(p225x1.b.f24299d);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p225x1.b)) {
                a aVar = new a();
                aVar.f24298f = strongBinder;
                bVar = aVar;
            } else {
                bVar = (p225x1.b) iInterfaceQueryLocalInterface;
            }
        }
        if (bVar == null) {
            return true;
        }
        this.f24624f.a();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
