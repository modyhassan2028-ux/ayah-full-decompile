package U6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class D extends s {
    public final IBinder g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0527e f8200h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC0527e abstractC0527e, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC0527e, i10, bundle);
        this.f8200h = abstractC0527e;
        this.g = iBinder;
    }

    @Override // U6.s
    public final void a(R6.b bVar) {
        InterfaceC0525c interfaceC0525c = this.f8200h.f8239p;
        if (interfaceC0525c != null) {
            interfaceC0525c.g(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // U6.s
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            y.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0527e abstractC0527e = this.f8200h;
            if (!abstractC0527e.v().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC0527e.v() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceP = abstractC0527e.p(iBinder);
            if (iInterfaceP == null || !(AbstractC0527e.z(abstractC0527e, 2, 4, iInterfaceP) || AbstractC0527e.z(abstractC0527e, 3, 4, iInterfaceP))) {
                return false;
            }
            abstractC0527e.f8243t = null;
            InterfaceC0524b interfaceC0524b = abstractC0527e.f8238o;
            if (interfaceC0524b == null) {
                return true;
            }
            interfaceC0524b.c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
