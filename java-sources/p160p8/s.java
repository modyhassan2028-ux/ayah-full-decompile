package p160p8;

import Aa.a;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p085i0.n;
import p123m2.c;
import p185s8.C1309b0;
import p185s8.C1311c0;
import p185s8.T;
import p185s8.U;
import p185s8.V;
import p185s8.X;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f21127f;
    public static final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f21129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f21130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f21131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D6.s f21132e;

    static {
        HashMap map = new HashMap();
        f21127f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.0";
    }

    public s(Context context, x xVar, a aVar, n nVar, D6.s sVar) {
        this.f21128a = context;
        this.f21129b = xVar;
        this.f21130c = aVar;
        this.f21131d = nVar;
        this.f21132e = sVar;
    }

    public static U c(int i10, a aVar) {
        String str = (String) aVar.f555s;
        String str2 = (String) aVar.f554r;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aVar.f556t;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        a aVar2 = (a) aVar.f557u;
        if (i10 >= 8) {
            a aVar3 = aVar2;
            while (aVar3 != null) {
                aVar3 = (a) aVar3.f557u;
                i11++;
            }
        }
        int i12 = i11;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b5 = (byte) (0 | 1);
        U uC = null;
        if (aVar2 != null && i12 == 0) {
            uC = c(i10 + 1, aVar2);
        }
        if (b5 == 1) {
            return new U(str, str2, listD, uC, i12);
        }
        StringBuilder sb = new StringBuilder();
        if ((b5 & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            X x9 = new X();
            x9.f22285e = i10;
            x9.f22286f = (byte) (x9.f22286f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            x9.f22281a = jMax;
            byte b5 = (byte) (x9.f22286f | 1);
            x9.f22286f = b5;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            x9.f22282b = str;
            x9.f22283c = fileName;
            x9.f22284d = lineNumber;
            x9.f22286f = (byte) (b5 | 2);
            arrayList.add(x9.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static V e() {
        byte b5 = (byte) 1;
        if (b5 == 1) {
            return new V(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b5 == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }

    public final List a() {
        byte b5 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f21130c;
        String str = aVar.f21053e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = aVar.f21050b;
        if (b5 == 3) {
            return Collections.singletonList(new T(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b5 & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b5 & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(c.u("Missing required properties:", sb));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    public final C1311c0 b(int i10) {
        boolean z10;
        Float fValueOf;
        int i11;
        long j;
        Context context = this.f21128a;
        boolean z11 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z10 || fValueOf == null) {
                    i11 = 1;
                } else {
                    i11 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!g.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z11 = true;
                }
                long jA = g.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jA - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                C1309b0 c1309b0 = new C1309b0();
                c1309b0.f22313a = dValueOf;
                c1309b0.f22314b = i11;
                byte b5 = (byte) (c1309b0.g | 1);
                c1309b0.f22315c = z11;
                c1309b0.f22316d = i10;
                c1309b0.f22317e = j;
                c1309b0.f22318f = blockCount;
                c1309b0.g = (byte) (((byte) (((byte) (((byte) (b5 | 2)) | 4)) | 8)) | 16);
                return c1309b0.a();
            }
            z10 = false;
        } catch (IllegalStateException e11) {
            e = e11;
            z10 = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z10) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        if (!g.f()) {
            z11 = true;
        }
        long jA2 = g.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jA2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        C1309b0 c1309b1 = new C1309b0();
        c1309b1.f22313a = dValueOf;
        c1309b1.f22314b = i11;
        byte b10 = (byte) (c1309b1.g | 1);
        c1309b1.f22315c = z11;
        c1309b1.f22316d = i10;
        c1309b1.f22317e = j;
        c1309b1.f22318f = blockCount2;
        c1309b1.g = (byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16);
        return c1309b1.a();
    }
}
