package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f14004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f14005b = !a();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    public static boolean b(Context context) {
        if (f14005b) {
            return true;
        }
        synchronized (D1.class) {
            try {
                if (f14005b) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    boolean z10 = false;
                    if (i10 <= 2) {
                        if (f14004a == null) {
                            f14004a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f14004a;
                        if (userManager == null) {
                            z10 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z10 = true;
                                }
                            } catch (NullPointerException e10) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                f14004a = null;
                                i10++;
                            }
                        }
                        if (z10) {
                            f14005b = true;
                        }
                        return z10;
                    }
                    if (z10) {
                        f14004a = null;
                    }
                    if (z10) {
                        f14005b = true;
                    }
                    return z10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
