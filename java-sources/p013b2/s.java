package p013b2;

import B0.c;
import B9.a;
import Da.r;
import F1.g;
import F1.l;
import K0.RunnableC0354l;
import R7.f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f13184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13185d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f13186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f13187f;
    public ThreadPoolExecutor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f13188h;

    public s(Context context, g gVar) {
        c.i(context, "Context cannot be null");
        this.f13182a = context.getApplicationContext();
        this.f13183b = gVar;
        this.f13184c = t.f13189d;
    }

    @Override // p013b2.i
    public final void a(a aVar) {
        synchronized (this.f13185d) {
            this.f13188h = aVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f13185d) {
            try {
                this.f13188h = null;
                Handler handler = this.f13186e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f13186e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f13187f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f13185d) {
            try {
                if (this.f13188h == null) {
                    return;
                }
                if (this.f13187f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0775a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f13187f = threadPoolExecutor;
                }
                this.f13187f.execute(new RunnableC0354l(14, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final l d() {
        try {
            f fVar = this.f13184c;
            Context context = this.f13182a;
            g gVar = this.f13183b;
            fVar.getClass();
            Object[] objArr = {gVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            r rVarA = F1.f.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i10 = rVarA.f1387s;
            if (i10 != 0) {
                throw new RuntimeException(p245z2.a.B(i10, "fetchFonts failed (", ")"));
            }
            l[] lVarArr = (l[]) ((List) rVarA.f1388t).get(0);
            if (lVarArr == null || lVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return lVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
