package Y6;

import U6.y;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f10444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f10445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f10446c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f10444a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f10444a = Application.getProcessName();
            } else {
                int iMyPid = f10445b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f10445b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            try {
                                String line = bufferedReader.readLine();
                                y.f(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                                if (bufferedReader != null) {
                                }
                                f10444a = strTrim;
                                return f10444a;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f10444a = strTrim;
            }
        }
        return f10444a;
    }

    public static boolean b() {
        Boolean boolValueOf = f10446c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new A6.a(AbstractC0813f2.W(objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f10446c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
