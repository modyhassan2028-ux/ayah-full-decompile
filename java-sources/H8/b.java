package H8;

import E6.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.K1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements I8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3589c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f3587a = i10;
        this.f3588b = obj;
        this.f3589c = obj2;
    }

    @Override // I8.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f3587a) {
            case 0:
                return new j((Context) this.f3588b, (String) this.f3589c);
            case 1:
                p050e8.f fVar = (p050e8.f) this.f3589c;
                Context contextC = (Context) this.f3588b;
                String strC = fVar.c();
                N8.a aVar = new N8.a();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    contextC = i10 >= 24 ? K1.c(contextC) : null;
                }
                SharedPreferences sharedPreferences = contextC.getSharedPreferences("com.google.firebase.common.prefs:" + strC, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextC.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextC.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f6069a = z10;
                return aVar;
            default:
                p100j8.e eVar = (p100j8.e) this.f3588b;
                p100j8.a aVar2 = (p100j8.a) this.f3589c;
                return aVar2.f18791f.c(new u(aVar2, eVar));
        }
    }

    public /* synthetic */ b(p050e8.f fVar, Context context) {
        this.f3587a = 1;
        this.f3589c = fVar;
        this.f3588b = context;
    }
}
