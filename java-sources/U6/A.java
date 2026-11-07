package U6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class A extends com.google.android.gms.internal.measurement.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0527e f8196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(AbstractC0527e abstractC0527e, Looper looper) {
        super(looper, 2);
        this.f8196a = abstractC0527e;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f8196a.f8246w.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                s sVar = (s) message.obj;
                sVar.getClass();
                sVar.d();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !this.f8196a.g()) {
            s sVar2 = (s) message.obj;
            sVar2.getClass();
            sVar2.d();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            AbstractC0527e abstractC0527e = this.f8196a;
            abstractC0527e.f8243t = new R6.b(message.arg2);
            if (!abstractC0527e.f8244u && !TextUtils.isEmpty(abstractC0527e.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC0527e.v());
                    AbstractC0527e abstractC0527e2 = this.f8196a;
                    if (!abstractC0527e2.f8244u) {
                        abstractC0527e2.A(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC0527e abstractC0527e3 = this.f8196a;
            R6.b bVar = abstractC0527e3.f8243t;
            if (bVar == null) {
                bVar = new R6.b(8);
            }
            abstractC0527e3.j.b(bVar);
            System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            AbstractC0527e abstractC0527e4 = this.f8196a;
            R6.b bVar2 = abstractC0527e4.f8243t;
            if (bVar2 == null) {
                bVar2 = new R6.b(8);
            }
            abstractC0527e4.j.b(bVar2);
            System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            this.f8196a.j.b(new R6.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            this.f8196a.A(5, null);
            InterfaceC0524b interfaceC0524b = this.f8196a.f8238o;
            if (interfaceC0524b != null) {
                interfaceC0524b.a(message.arg2);
            }
            System.currentTimeMillis();
            AbstractC0527e.z(this.f8196a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f8196a.a()) {
            s sVar3 = (s) message.obj;
            sVar3.getClass();
            sVar3.d();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", p123m2.c.r(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        s sVar4 = (s) message.obj;
        synchronized (sVar4) {
            try {
                bool = sVar4.f8304a;
                if (sVar4.f8305b) {
                    Log.w("GmsClient", "Callback proxy " + sVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC0527e abstractC0527e5 = sVar4.f8309f;
            int i14 = sVar4.f8307d;
            if (i14 != 0) {
                abstractC0527e5.A(1, null);
                Bundle bundle = sVar4.f8308e;
                sVar4.a(new R6.b(i14, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!sVar4.b()) {
                abstractC0527e5.A(1, null);
                sVar4.a(new R6.b(8, null));
            }
        }
        synchronized (sVar4) {
            sVar4.f8305b = true;
        }
        sVar4.d();
    }
}
