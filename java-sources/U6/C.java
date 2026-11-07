package U6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class C implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0527e f8199b;

    public C(AbstractC0527e abstractC0527e, int i10) {
        this.f8199b = abstractC0527e;
        this.f8198a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0527e abstractC0527e = this.f8199b;
        if (iBinder == null) {
            AbstractC0527e.y(abstractC0527e);
            return;
        }
        synchronized (abstractC0527e.f8232h) {
            try {
                AbstractC0527e abstractC0527e2 = this.f8199b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0527e2.f8233i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new u(iBinder) : (u) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0527e abstractC0527e3 = this.f8199b;
        int i10 = this.f8198a;
        E e10 = new E(abstractC0527e3, 0, null);
        A a9 = abstractC0527e3.f8231f;
        a9.sendMessage(a9.obtainMessage(7, i10, -1, e10));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0527e abstractC0527e;
        synchronized (this.f8199b.f8232h) {
            abstractC0527e = this.f8199b;
            abstractC0527e.f8233i = null;
        }
        int i10 = this.f8198a;
        A a9 = abstractC0527e.f8231f;
        a9.sendMessage(a9.obtainMessage(6, i10, 1));
    }
}
