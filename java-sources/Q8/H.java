package Q8;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        p251z9.j.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = p120l9.r.f19440r;
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
        ArrayList arrayList3 = new ArrayList(p120l9.n.a0(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            String str2 = runningAppProcessInfo.processName;
            p251z9.j.d(str2, "processName");
            arrayList3.add(new G(str2, p251z9.j.a(runningAppProcessInfo.processName, str), runningAppProcessInfo.pid, runningAppProcessInfo.importance));
        }
        return arrayList3;
    }

    public static G b(Context context) {
        Object obj;
        String strA;
        p251z9.j.e(context, "context");
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
        } while (((G) obj).f6894b != iMyPid);
        G g = (G) obj;
        if (g != null) {
            return g;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 33) {
            strA = Process.myProcessName();
            p251z9.j.d(strA, "myProcessName(...)");
        } else if ((i11 < 28 || (strA = Application.getProcessName()) == null) && (strA = Y6.c.a()) == null) {
            strA = "";
        }
        return new G(strA, false, iMyPid, 0);
    }
}
