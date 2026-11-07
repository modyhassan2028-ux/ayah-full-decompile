package p119l8;

import U6.C0532j;
import X4.c;
import Z0.B;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p013b2.f;
import p074h0.i;
import p085i0.n;
import p149o8.b;
import p160p8.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p149o8.a, p138n8.a, I8.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f19427r;

    public /* synthetic */ a(f fVar) {
        this.f19427r = fVar;
    }

    @Override // p149o8.a
    public void c(q qVar) {
        f fVar = this.f19427r;
        synchronized (fVar) {
            try {
                if (((p149o8.a) fVar.f13155b) instanceof b) {
                    ((ArrayList) fVar.f13156c).add(qVar);
                }
                ((p149o8.a) fVar.f13155b).c(qVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I8.a
    public void e(I8.b bVar) {
        f fVar = this.f19427r;
        m8.b bVar2 = m8.b.f19690a;
        bVar2.b("AnalyticsConnector now available.");
        p070g8.a aVar = (p070g8.a) bVar.get();
        B b5 = new B(22, aVar);
        n nVar = new n(6);
        p070g8.b bVar3 = (p070g8.b) aVar;
        C0532j c0532jA = bVar3.a("clx", nVar);
        if (c0532jA == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            c0532jA = bVar3.a("crash", nVar);
            if (c0532jA != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (c0532jA == null) {
            bVar2.d("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        bVar2.b("Registered Firebase Analytics listener.");
        c cVar = new c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i iVar = new i(b5);
        synchronized (fVar) {
            try {
                ArrayList arrayList = (ArrayList) fVar.f13156c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    cVar.c((q) obj);
                }
                nVar.f16734t = cVar;
                nVar.f16733s = iVar;
                fVar.f13155b = cVar;
                fVar.f13154a = iVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p138n8.a
    public void i(Bundle bundle) {
        ((p138n8.a) this.f19427r.f13154a).i(bundle);
    }
}
