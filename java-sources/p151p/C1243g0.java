package p151p;

import android.util.Log;
import java.io.File;
import p118l7.a;
import p118l7.o;
import p160p8.b;

/* JADX INFO: renamed from: p.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1243g0 implements a {
    @Override // p118l7.a
    public Object a(o oVar) {
        boolean z10;
        if (oVar.g()) {
            b bVar = (b) oVar.e();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.f21057b;
            m8.b bVar2 = m8.b.f19690a;
            bVar2.b(str);
            File file = bVar.f21058c;
            z10 = true;
            if (file.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", oVar.d());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
