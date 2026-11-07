package p160p8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import p085i0.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21054f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f21055h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, n nVar) {
        this.f21049a = str;
        this.f21050b = str2;
        this.f21051c = arrayList;
        this.f21052d = str3;
        this.f21053e = str4;
        this.f21054f = str5;
        this.g = str6;
        this.f21055h = nVar;
    }

    public static a a(Context context, x xVar, String str, String str2, ArrayList arrayList, n nVar) {
        String packageName = context.getPackageName();
        String strD = xVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, strD, packageName, string, str3, nVar);
    }
}
