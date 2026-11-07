package R6;

import U6.K;
import U6.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.ayah.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f7246b;

    static {
        AtomicBoolean atomicBoolean = h.f7247a;
        f7245a = 12451000;
        f7246b = new f();
    }

    public Intent a(int i10, Context context, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = K.f8224a;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && Y6.b.d(context)) {
            int i12 = K.f8224a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f7245a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(Z6.b.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i13 = K.f8224a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:80:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:86:0x019c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bf  */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0167, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0177, please report this as an issue */
    public int b(Context context, int i10) {
        boolean z10;
        PackageInfo packageInfo;
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = h.f7247a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z11 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f7250d.get()) {
            synchronized (y.f8311a) {
                try {
                    if (!y.f8312b) {
                        y.f8312b = true;
                        try {
                            Bundle bundle = ((Context) Z6.b.a(context).f5961a).getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                y.f8313c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i13 = y.f8313c;
            if (i13 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i13 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f7245a + " but found " + i13 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (Y6.b.d(context)) {
            z10 = false;
        } else {
            if (Y6.b.f10442e == null) {
                Y6.b.f10442e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (Y6.b.f10442e.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        y.a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i14 = 9;
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            i.a(context);
            if (!i.d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z10) {
                y.f(packageInfo);
                if (!i.d(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i11 = packageInfo2.versionCode;
                    if (i11 == -1) {
                        i12 = -1;
                    } else {
                        i12 = i11 / 1000;
                    }
                    if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                        i14 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                i14 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i14 = 0;
                        } else {
                            i14 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z10) {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                    i14 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i14 = 3;
                    } else {
                        i14 = 0;
                    }
                }
            } else {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                    i14 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i14 = 3;
                    } else {
                        i14 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i14 != 18) {
            if (i14 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (it.hasNext()) {
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                        }
                    }
                    z11 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        if (z11) {
            return 18;
        }
        return i14;
    }
}
