package p118l7;

import U6.y;
import com.google.android.gms.internal.measurement.J1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19421a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J1 f19422b = new J1(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f19425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f19426f;

    public final void a(Executor executor, e eVar) {
        this.f19422b.f(new m(executor, eVar));
        n();
    }

    public final void b(Executor executor, f fVar) {
        this.f19422b.f(new m(executor, fVar));
        n();
    }

    public final o c(Executor executor, a aVar) {
        o oVar = new o();
        this.f19422b.f(new l(executor, aVar, oVar, 1));
        n();
        return oVar;
    }

    public final Exception d() {
        Exception exc;
        synchronized (this.f19421a) {
            exc = this.f19426f;
        }
        return exc;
    }

    public final Object e() {
        Object obj;
        synchronized (this.f19421a) {
            try {
                y.h("Task is not yet complete", this.f19423c);
                if (this.f19424d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f19426f;
                if (exc != null) {
                    throw new g(exc);
                }
                obj = this.f19425e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f19421a) {
            z10 = this.f19423c;
        }
        return z10;
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f19421a) {
            try {
                z10 = false;
                if (this.f19423c && !this.f19424d && this.f19426f == null) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public final o h(Executor executor, h hVar) {
        o oVar = new o();
        this.f19422b.f(new m(executor, hVar, oVar));
        n();
        return oVar;
    }

    public final void i(Exception exc) {
        y.g(exc, "Exception must not be null");
        synchronized (this.f19421a) {
            m();
            this.f19423c = true;
            this.f19426f = exc;
        }
        this.f19422b.h(this);
    }

    public final void j(Object obj) {
        synchronized (this.f19421a) {
            m();
            this.f19423c = true;
            this.f19425e = obj;
        }
        this.f19422b.h(this);
    }

    public final void k() {
        synchronized (this.f19421a) {
            try {
                if (this.f19423c) {
                    return;
                }
                this.f19423c = true;
                this.f19424d = true;
                this.f19422b.h(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(Object obj) {
        synchronized (this.f19421a) {
            try {
                if (this.f19423c) {
                    return false;
                }
                this.f19423c = true;
                this.f19425e = obj;
                this.f19422b.h(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        String strConcat;
        if (this.f19423c) {
            int i10 = b.f19401r;
            if (!f()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excD = d();
            if (excD != null) {
                strConcat = "failure";
            } else if (g()) {
                strConcat = "result ".concat(String.valueOf(e()));
            } else {
                strConcat = this.f19424d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void n() {
        synchronized (this.f19421a) {
            try {
                if (this.f19423c) {
                    this.f19422b.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
