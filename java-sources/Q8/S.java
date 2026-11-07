package Q8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f6912a = new S();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p248z6.c f6913b;

    static {
        E8.d dVar = new E8.d();
        dVar.a(Q.class, C0460g.f6992a);
        dVar.a(Z.class, C0461h.f7002a);
        dVar.a(C0464k.class, C0458e.f6970a);
        dVar.a(C0455b.class, C0457d.f6961a);
        dVar.a(C0454a.class, C0456c.f6952a);
        dVar.a(G.class, C0459f.f6979a);
        dVar.f1986d = true;
        f6913b = new p248z6.c(5, dVar);
    }

    public static C0455b a(p050e8.f fVar) throws PackageManager.NameNotFoundException {
        fVar.a();
        Context context = fVar.f15843a;
        p251z9.j.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        fVar.a();
        String str = fVar.f15845c.f15857b;
        p251z9.j.d(str, "getApplicationId(...)");
        p251z9.j.d(Build.MODEL, "MODEL");
        p251z9.j.d(Build.VERSION.RELEASE, "RELEASE");
        p251z9.j.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        p251z9.j.d(Build.MANUFACTURER, "MANUFACTURER");
        fVar.a();
        G gB = H.b(context);
        fVar.a();
        return new C0455b(str, new C0454a(packageName, str3, strValueOf, gB, H.a(context)));
    }
}
