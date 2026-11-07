package P6;

import F2.v;
import R6.f;
import R6.g;
import U6.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p028c7.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public R6.a f6711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f6712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6714d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f6715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f6716f;
    public final long g;

    public a(Context context) {
        y.f(context);
        Context applicationContext = context.getApplicationContext();
        this.f6716f = applicationContext != null ? applicationContext : context;
        this.f6713c = false;
        this.g = -1L;
    }

    public static v a(Context context) {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            v vVarE = aVar.e();
            d(vVarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.b();
            return vVarE;
        } catch (Throwable th) {
            try {
                d(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                aVar.b();
                throw th2;
            }
        }
    }

    public static void d(v vVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (vVar != null) {
                map.put("limit_ad_tracking", true != vVar.f2331c ? "0" : "1");
                String str = vVar.f2330b;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new b(map).start();
        }
    }

    public final void b() {
        y.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f6716f == null || this.f6711a == null) {
                    return;
                }
                try {
                    if (this.f6713c) {
                        X6.a.a().b(this.f6716f, this.f6711a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f6713c = false;
                this.f6712b = null;
                this.f6711a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        y.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f6713c) {
                    b();
                }
                Context context = this.f6716f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.f7246b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    R6.a aVar = new R6.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!X6.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f6711a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = aVar.a();
                            int i10 = p028c7.c.f13537f;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f6712b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new p028c7.b(iBinderA);
                            this.f6713c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final v e() {
        v vVar;
        y.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f6713c) {
                    synchronized (this.f6714d) {
                        c cVar = this.f6715e;
                        if (cVar == null || !cVar.f6721u) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f6713c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                y.f(this.f6711a);
                y.f(this.f6712b);
                try {
                    p028c7.b bVar = (p028c7.b) this.f6712b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelA = bVar.a(parcelObtain, 1);
                    String string = parcelA.readString();
                    parcelA.recycle();
                    p028c7.b bVar2 = (p028c7.b) this.f6712b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = p028c7.a.f13535a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelA2 = bVar2.a(parcelObtain2, 2);
                    boolean z10 = parcelA2.readInt() != 0;
                    parcelA2.recycle();
                    vVar = new v(1, string, z10);
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return vVar;
    }

    public final void f() {
        synchronized (this.f6714d) {
            c cVar = this.f6715e;
            if (cVar != null) {
                cVar.f6720t.countDown();
                try {
                    this.f6715e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.f6715e = new c(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
