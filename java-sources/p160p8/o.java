package p160p8;

import D6.s;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p074h0.i;
import p085i0.n;
import p151p.V;
import p170q8.c;
import p213v8.b;
import x8.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21108b;

    public /* synthetic */ o(int i10, Object obj) {
        this.f21107a = i10;
        this.f21108b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21107a) {
            case 0:
                m mVar = ((r) this.f21108b).g;
                mVar.getClass();
                c.a();
                n nVar = mVar.f21091c;
                b bVar = (b) nVar.f16734t;
                String str = (String) nVar.f16733s;
                bVar.getClass();
                boolean z10 = true;
                if (new File((File) bVar.f23380c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    b bVar2 = (b) nVar.f16734t;
                    bVar2.getClass();
                    new File((File) bVar2.f23380c, str).delete();
                } else {
                    String strE = mVar.e();
                    if (strE == null || !mVar.j.c(strE)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            default:
                s sVar = (s) ((n) this.f21108b).f16734t;
                V v10 = (V) sVar.f1313f;
                d dVar = (d) sVar.f1309b;
                String str2 = (String) v10.f20603r;
                c.b();
                try {
                    HashMap mapM = V.m(dVar);
                    i iVar = new i(str2, mapM);
                    iVar.x("User-Agent", "Crashlytics Android SDK/20.0.0");
                    iVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    V.j(iVar, dVar);
                    String str3 = "Requesting settings from " + str2;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    String str4 = "Settings query params were: " + mapM;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str4, null);
                    }
                    return v10.o(iVar.m());
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
                    return null;
                }
        }
    }
}
