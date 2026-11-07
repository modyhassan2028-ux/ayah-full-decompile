package R6;

import U6.v;
import U6.y;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f7252c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f7254b;

    public i(Context context) {
        this.f7253a = context.getApplicationContext();
    }

    public static i a(Context context) {
        y.f(context);
        synchronized (i.class) {
            try {
                if (f7252c == null) {
                    p.a(context);
                    f7252c = new i(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7252c;
    }

    public static final m c(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < mVarArr.length; i10++) {
                if (mVarArr[i10].equals(nVar)) {
                    return mVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? c(packageInfo2, o.f7263a) : c(packageInfo2, o.f7263a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01a9  */
    public boolean b(int i10) {
        s sVar;
        int length;
        boolean zG0;
        ApplicationInfo applicationInfo;
        s sVar2;
        String[] packagesForUid = ((Context) this.f7253a).getPackageManager().getPackagesForUid(i10);
        Exception exc = null;
        boolean z10 = false;
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            sVar = new s(false, "no pkgs", null);
        } else {
            sVar = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    y.f(sVar);
                    break;
                }
                String str = packagesForUid[i11];
                if (str == null) {
                    sVar = new s(z10, "null pkg", exc);
                } else if (str.equals((String) this.f7254b)) {
                    sVar = s.f7274d;
                } else {
                    l lVar = p.f7264a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            p.c();
                            zG0 = ((v) p.f7266c).G0();
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    } catch (RemoteException | p017b7.b e10) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                        zG0 = z10;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    if (zG0) {
                        boolean zA = h.a((Context) this.f7253a);
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            y.f(p.f7268e);
                            try {
                                p.c();
                                Context context = (Context) a7.b.G0(a7.b.F0(new a7.b(p.f7268e)));
                                try {
                                    v vVar = (v) p.f7266c;
                                    Parcel parcelG = vVar.g();
                                    int i12 = p049e7.a.f15829a;
                                    parcelG.writeInt(1);
                                    int iD0 = p017b7.g.D0(parcelG, 20293);
                                    p017b7.g.z0(parcelG, 1, str);
                                    p017b7.g.G0(parcelG, 2, 4);
                                    parcelG.writeInt(zA ? 1 : 0);
                                    p017b7.g.G0(parcelG, 3, 4);
                                    parcelG.writeInt(0);
                                    p017b7.g.x0(parcelG, 4, new a7.b(context));
                                    p017b7.g.G0(parcelG, 5, 4);
                                    parcelG.writeInt(0);
                                    p017b7.g.G0(parcelG, 6, 4);
                                    parcelG.writeInt(1);
                                    p017b7.g.F0(parcelG, iD0);
                                    Parcel parcelA = vVar.a(parcelG, 6);
                                    q qVar = (q) p049e7.a.a(parcelA, q.CREATOR);
                                    parcelA.recycle();
                                    if (qVar.f7269r) {
                                        B1.Q(qVar.f7272u);
                                        sVar = new s(true, null, null);
                                    } else {
                                        String str2 = qVar.f7270s;
                                        PackageManager.NameNotFoundException nameNotFoundException = AbstractC0813f2.V(qVar.f7271t) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        B1.Q(qVar.f7272u);
                                        AbstractC0813f2.V(qVar.f7271t);
                                        sVar = new s(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e11) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                    sVar2 = new s(false, "module call", e11);
                                    sVar = sVar2;
                                }
                            } catch (p017b7.b e12) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
                                sVar2 = new s(false, "module init: ".concat(String.valueOf(e12.getMessage())), e12);
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th2;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.f7253a).getPackageManager().getPackageInfo(str, 64);
                            boolean zA2 = h.a((Context) this.f7253a);
                            if (packageInfo == null) {
                                sVar = new s(false, "null pkg", null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    sVar = new s(false, "single cert required", null);
                                } else {
                                    n nVar = new n(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        s sVarB = p.b(str3, nVar, zA2, false);
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        if (!sVarB.f7275a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                            sVar = sVarB;
                                        } else {
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                s sVarB2 = p.b(str3, nVar, false, true);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                if (sVarB2.f7275a) {
                                                    sVar = new s(false, "debuggable release cert app rejected", null);
                                                } else {
                                                    sVar = sVarB;
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e13) {
                            sVar = new s(false, "no pkg ".concat(str), e13);
                        }
                    }
                    if (sVar.f7275a) {
                        this.f7254b = str;
                    }
                }
                if (sVar.f7275a) {
                    break;
                }
                i11++;
                exc = null;
                z10 = false;
            }
        }
        Throwable th5 = sVar.f7277c;
        if (!sVar.f7275a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", sVar.a(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", sVar.a());
            }
        }
        return sVar.f7275a;
    }

    public i() {
        this.f7253a = new CopyOnWriteArraySet();
    }
}
