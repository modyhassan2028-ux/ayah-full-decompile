package p160p8;

import T6.k;
import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;
import p213v8.b;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21079b;

    public j(k kVar, b bVar) {
        this.f21078a = kVar;
        this.f21079b = new i(bVar);
    }

    public final String a(String str) {
        String strSubstring;
        i iVar = this.f21079b;
        synchronized (iVar) {
            if (Objects.equals(iVar.f21076b, str)) {
                return iVar.f21077c;
            }
            b bVar = iVar.f21075a;
            h hVar = i.f21073d;
            File file = new File((File) bVar.f23381d, str);
            file.mkdirs();
            List listE = b.e(file.listFiles(hVar));
            if (listE.isEmpty()) {
                strSubstring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                strSubstring = ((File) Collections.min(listE, i.f21074e)).getName().substring(4);
            }
            return strSubstring;
        }
    }

    public final void b(String str) {
        i iVar = this.f21079b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f21076b, str)) {
                i.a(iVar.f21075a, str, iVar.f21077c);
                iVar.f21076b = str;
            }
        }
    }
}
