package U6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p038d7.a {
    public AbstractC0527e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8197h;

    public B(AbstractC0527e abstractC0527e, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.g = abstractC0527e;
        this.f8197h = i10;
    }

    @Override // p038d7.a
    public final boolean E0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) p049e7.a.a(parcel, Bundle.CREATOR);
            p049e7.a.b(parcel);
            y.g(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0527e abstractC0527e = this.g;
            int i12 = this.f8197h;
            abstractC0527e.getClass();
            D d5 = new D(abstractC0527e, i11, strongBinder, bundle);
            A a9 = abstractC0527e.f8231f;
            a9.sendMessage(a9.obtainMessage(1, i12, -1, d5));
            this.g = null;
        } else if (i10 == 2) {
            parcel.readInt();
            p049e7.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            F f3 = (F) p049e7.a.a(parcel, F.CREATOR);
            p049e7.a.b(parcel);
            AbstractC0527e abstractC0527e2 = this.g;
            y.g(abstractC0527e2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y.f(f3);
            abstractC0527e2.f8245v = f3;
            Bundle bundle2 = f3.f8201r;
            y.g(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0527e abstractC0527e3 = this.g;
            int i14 = this.f8197h;
            abstractC0527e3.getClass();
            D d9 = new D(abstractC0527e3, i13, strongBinder2, bundle2);
            A a10 = abstractC0527e3.f8231f;
            a10.sendMessage(a10.obtainMessage(1, i14, -1, d9));
            this.g = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
