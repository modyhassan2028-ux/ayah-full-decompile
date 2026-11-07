package androidx.profileinstaller;

import B2.c;
import C2.a;
import C2.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            e.t(context, new c(0), new O8.c(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                O8.c cVar = new O8.c(this);
                try {
                    e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    cVar.h(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    cVar.h(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            O8.c cVar2 = new O8.c(this);
            if (Build.VERSION.SDK_INT < 24) {
                cVar2.h(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                cVar2.h(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        O8.c cVar3 = new O8.c(this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            cVar3.h(16, null);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            codeCacheDir = a.a(context).getCacheDir();
        } else if (i10 >= 24) {
            codeCacheDir = a.a(context).getCodeCacheDir();
        } else {
            codeCacheDir = i10 == 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (e.c(codeCacheDir)) {
            cVar3.h(14, null);
        } else {
            cVar3.h(15, null);
        }
    }
}
