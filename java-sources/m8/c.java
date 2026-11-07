package m8;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import p120l9.n;
import p120l9.r;
import p185s8.C1307a0;
import p185s8.D0;
import p185s8.Z;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f19691a = new c();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        j.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = r.f19440r;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i10) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(n.a0(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            Z z10 = new Z();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            z10.f22292a = str2;
            z10.f22293b = runningAppProcessInfo.pid;
            byte b5 = (byte) (z10.f22296e | 1);
            z10.f22294c = runningAppProcessInfo.importance;
            z10.f22296e = (byte) (b5 | 2);
            z10.f22295d = j.a(str2, str);
            z10.f22296e = (byte) (z10.f22296e | 4);
            arrayList3.add(z10.a());
        }
        return arrayList3;
    }

    public final D0 b(Context context) {
        Object obj;
        String processName;
        j.e(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListA = a(context);
        int size = arrayListA.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayListA.get(i10);
            i10++;
        } while (((C1307a0) ((D0) obj)).f22302b != iMyPid);
        D0 d1 = (D0) obj;
        if (d1 != null) {
            return d1;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 33) {
            processName = Process.myProcessName();
            j.b(processName);
        } else if (i11 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        j.e(processName, "processName");
        Z z10 = new Z();
        z10.f22292a = processName;
        z10.f22293b = iMyPid;
        byte b5 = (byte) (z10.f22296e | 1);
        z10.f22294c = 0;
        z10.f22295d = false;
        z10.f22296e = (byte) (((byte) (b5 | 2)) | 4);
        return z10.a();
    }
}
