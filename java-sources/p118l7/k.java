package p118l7;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements f, e, c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f19405r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f19407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19408u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19409v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Exception f19411x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f19412y;

    public k(int i10, o oVar) {
        this.f19406s = i10;
        this.f19407t = oVar;
    }

    public final void a() {
        int i10 = this.f19408u + this.f19409v + this.f19410w;
        int i11 = this.f19406s;
        if (i10 == i11) {
            Exception exc = this.f19411x;
            o oVar = this.f19407t;
            if (exc == null) {
                if (this.f19412y) {
                    oVar.k();
                    return;
                } else {
                    oVar.j(null);
                    return;
                }
            }
            oVar.i(new ExecutionException(this.f19409v + " out of " + i11 + " underlying tasks failed", this.f19411x));
        }
    }

    @Override // p118l7.c
    public final void e() {
        synchronized (this.f19405r) {
            this.f19410w++;
            this.f19412y = true;
            a();
        }
    }

    @Override // p118l7.f
    public final void g(Object obj) {
        synchronized (this.f19405r) {
            this.f19408u++;
            a();
        }
    }

    @Override // p118l7.e
    public final void h(Exception exc) {
        synchronized (this.f19405r) {
            this.f19409v++;
            this.f19411x = exc;
            a();
        }
    }
}
