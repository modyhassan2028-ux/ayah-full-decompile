package p160p8;

import D6.s;
import T6.k;
import Z0.B;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p050e8.f;
import p085i0.n;
import p118l7.i;
import p119l8.a;
import p170q8.c;
import p213v8.b;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f21115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f21116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f21118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f21119f;
    public m g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f21120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f21121i;
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f21122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f21123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m8.a f21124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final B f21125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f21126o;

    public r(f fVar, x xVar, m8.a aVar, k kVar, a aVar2, a aVar3, b bVar, j jVar, B b5, c cVar) {
        this.f21115b = kVar;
        fVar.a();
        this.f21114a = fVar.f15843a;
        this.f21120h = xVar;
        this.f21124m = aVar;
        this.j = aVar2;
        this.f21122k = aVar3;
        this.f21121i = bVar;
        this.f21123l = jVar;
        this.f21125n = b5;
        this.f21126o = cVar;
        this.f21117d = System.currentTimeMillis();
        this.f21116c = new n(13);
    }

    public final void a(s sVar) {
        c.a();
        c.a();
        this.f21118e.e();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.c(new q(this));
                this.g.g();
                if (!sVar.b().f24392b.f24388a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(sVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(((i) ((AtomicReference) sVar.f1315i).get()).f19402a);
                c();
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(s sVar) {
        Future<?> futureSubmit = this.f21126o.f21345a.f21342r.submit(new n(this, sVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        c.a();
        try {
            n nVar = this.f21118e;
            b bVar = (b) nVar.f16734t;
            String str = (String) nVar.f16733s;
            bVar.getClass();
            if (new File((File) bVar.f23380c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
