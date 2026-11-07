package K6;

import D6.s;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.media.session.r;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f5254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E6.j f5255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5256t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Runnable f5257u;

    public /* synthetic */ e(s sVar, E6.j jVar, int i10, Runnable runnable) {
        this.f5254r = sVar;
        this.f5255s = jVar;
        this.f5256t = i10;
        this.f5257u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final E6.j jVar = this.f5255s;
        final int i10 = this.f5256t;
        Runnable runnable = this.f5257u;
        final s sVar = this.f5254r;
        M6.c cVar = (M6.c) sVar.f1313f;
        try {
            L6.d dVar = (L6.d) sVar.f1310c;
            Objects.requireNonNull(dVar);
            ((L6.i) cVar).w(new C6.b(5, dVar));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) sVar.f1308a).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((L6.i) cVar).w(new M6.b() { // from class: K6.f
                    @Override // M6.b
                    public final Object b() {
                        ((r) sVar.f1311d).M(jVar, i10 + 1, false);
                        return null;
                    }
                });
            } else {
                sVar.c(jVar, i10);
            }
        } catch (M6.a unused) {
            ((r) sVar.f1311d).M(jVar, i10 + 1, false);
        } finally {
            runnable.run();
        }
    }
}
