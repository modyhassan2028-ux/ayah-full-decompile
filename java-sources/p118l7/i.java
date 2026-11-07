package p118l7;

import U6.y;
import X4.c;
import Z0.B;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f19402a = new o();

    public i() {
    }

    public final void a(Exception exc) {
        o oVar = this.f19402a;
        oVar.getClass();
        y.g(exc, "Exception must not be null");
        synchronized (oVar.f19421a) {
            try {
                if (oVar.f19423c) {
                    return;
                }
                oVar.f19423c = true;
                oVar.f19426f = exc;
                oVar.f19422b.h(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        this.f19402a.l(obj);
    }

    public i(B b5) {
        c cVar = new c(this);
        b5.getClass();
        ((o) b5.f10875s).b(j.f19403a, new B(18, cVar));
    }
}
