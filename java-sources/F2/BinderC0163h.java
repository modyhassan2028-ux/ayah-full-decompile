package F2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: F2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0163h extends Binder implements InterfaceC0160e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2283f;

    public BinderC0163h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2283f = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC0160e.f2274b);
    }

    public final int a(InterfaceC0159d interfaceC0159d, String str) {
        p251z9.j.e(interfaceC0159d, "callback");
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2283f;
        synchronized (multiInstanceInvalidationService.f12950t) {
            try {
                int i11 = multiInstanceInvalidationService.f12948r + 1;
                multiInstanceInvalidationService.f12948r = i11;
                if (multiInstanceInvalidationService.f12950t.register(interfaceC0159d, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f12949s.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f12948r--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = InterfaceC0160e.f2274b;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC0159d interfaceC0159d = null;
        InterfaceC0159d interfaceC0159d2 = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0159d.f2273a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0159d)) {
                    C0158c c0158c = new C0158c();
                    c0158c.f2272f = strongBinder;
                    interfaceC0159d = c0158c;
                } else {
                    interfaceC0159d = (InterfaceC0159d) iInterfaceQueryLocalInterface;
                }
            }
            int iA = a(interfaceC0159d, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iA);
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            v0(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC0159d.f2273a);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC0159d)) {
                C0158c c0158c2 = new C0158c();
                c0158c2.f2272f = strongBinder2;
                interfaceC0159d2 = c0158c2;
            } else {
                interfaceC0159d2 = (InterfaceC0159d) iInterfaceQueryLocalInterface2;
            }
        }
        int i12 = parcel.readInt();
        p251z9.j.e(interfaceC0159d2, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2283f;
        synchronized (multiInstanceInvalidationService.f12950t) {
            multiInstanceInvalidationService.f12950t.unregister(interfaceC0159d2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // F2.InterfaceC0160e
    public final void v0(int i10, String[] strArr) {
        p251z9.j.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2283f;
        synchronized (multiInstanceInvalidationService.f12950t) {
            String str = (String) multiInstanceInvalidationService.f12949s.get(Integer.valueOf(i10));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f12950t.beginBroadcast();
            for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f12950t.getBroadcastCookie(i11);
                    p251z9.j.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f12949s.get(num);
                    if (i10 != iIntValue && str.equals(str2)) {
                        try {
                            ((InterfaceC0159d) multiInstanceInvalidationService.f12950t.getBroadcastItem(i11)).J(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                } catch (Throwable th) {
                    multiInstanceInvalidationService.f12950t.finishBroadcast();
                    throw th;
                }
            }
            multiInstanceInvalidationService.f12950t.finishBroadcast();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
