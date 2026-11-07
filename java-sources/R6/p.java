package R6;

import U6.v;
import U6.w;
import U6.x;
import U6.y;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f7264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f7265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile x f7266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f7267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f7268e;

    static {
        new l(0, m.F0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new l(1, m.F0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f7264a = new l(2, m.F0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f7265b = new l(3, m.F0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f7267d = new Object();
    }

    public static synchronized void a(Context context) {
        if (f7268e != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f7268e = context.getApplicationContext();
        }
    }

    public static s b(String str, n nVar, boolean z10, boolean z11) {
        try {
            c();
            y.f(f7268e);
            try {
                x xVar = f7266c;
                a7.b bVar = new a7.b(f7268e.getPackageManager());
                v vVar = (v) xVar;
                Parcel parcelG = vVar.g();
                int i10 = p049e7.a.f15829a;
                boolean z12 = true;
                parcelG.writeInt(1);
                int iD0 = p017b7.g.D0(parcelG, 20293);
                p017b7.g.z0(parcelG, 1, str);
                p017b7.g.x0(parcelG, 2, nVar);
                p017b7.g.G0(parcelG, 3, 4);
                parcelG.writeInt(z10 ? 1 : 0);
                p017b7.g.G0(parcelG, 4, 4);
                parcelG.writeInt(z11 ? 1 : 0);
                p017b7.g.F0(parcelG, iD0);
                p049e7.a.c(parcelG, bVar);
                Parcel parcelA = vVar.a(parcelG, 5);
                if (parcelA.readInt() == 0) {
                    z12 = false;
                }
                parcelA.recycle();
                return z12 ? s.f7274d : new r(new k(z10, str, nVar));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return new s(false, "module call", e10);
            }
        } catch (p017b7.b e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return new s(false, "module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    public static void c() {
        x vVar;
        if (f7266c != null) {
            return;
        }
        y.f(f7268e);
        synchronized (f7267d) {
            try {
                if (f7266c == null) {
                    IBinder iBinderB = p017b7.f.c(f7268e, p017b7.f.f13313d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = w.g;
                    if (iBinderB == null) {
                        vVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        vVar = iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new v(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    f7266c = vVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
