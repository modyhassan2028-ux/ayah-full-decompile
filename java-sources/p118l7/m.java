package p118l7;

import E2.RunnableC0147v;
import java.util.concurrent.Executor;
import p039d8.a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n, f, e, c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Executor f19418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f19419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f19420u;

    public m(Executor executor, c cVar) {
        this.f19417r = 0;
        this.f19419t = new Object();
        this.f19418s = executor;
        this.f19420u = cVar;
    }

    private final void b(o oVar) {
        synchronized (this.f19419t) {
        }
        this.f19418s.execute(new a(25, this, oVar, false));
    }

    private final void c(o oVar) {
        if (oVar.g() || oVar.f19424d) {
            return;
        }
        synchronized (this.f19419t) {
        }
        this.f19418s.execute(new a(26, this, oVar, false));
    }

    private final void d(o oVar) {
        if (oVar.g()) {
            synchronized (this.f19419t) {
            }
            this.f19418s.execute(new a(27, this, oVar, false));
        }
    }

    @Override // p118l7.n
    public final void a(o oVar) {
        switch (this.f19417r) {
            case 0:
                if (oVar.f19424d) {
                    synchronized (this.f19419t) {
                        break;
                    }
                    this.f19418s.execute(new RunnableC0147v(24, this));
                    return;
                }
                return;
            case 1:
                b(oVar);
                return;
            case 2:
                c(oVar);
                return;
            case 3:
                d(oVar);
                return;
            default:
                this.f19418s.execute(new a(28, this, oVar, false));
                return;
        }
    }

    @Override // p118l7.c
    public void e() {
        ((o) this.f19420u).k();
    }

    @Override // p118l7.f
    public void g(Object obj) {
        ((o) this.f19420u).j(obj);
    }

    @Override // p118l7.e
    public void h(Exception exc) {
        ((o) this.f19420u).i(exc);
    }

    public m(Executor executor, d dVar) {
        this.f19417r = 1;
        this.f19419t = new Object();
        this.f19418s = executor;
        this.f19420u = dVar;
    }

    public m(Executor executor, e eVar) {
        this.f19417r = 2;
        this.f19419t = new Object();
        this.f19418s = executor;
        this.f19420u = eVar;
    }

    public m(Executor executor, f fVar) {
        this.f19417r = 3;
        this.f19419t = new Object();
        this.f19418s = executor;
        this.f19420u = fVar;
    }

    public m(Executor executor, h hVar, o oVar) {
        this.f19417r = 4;
        this.f19418s = executor;
        this.f19419t = hVar;
        this.f19420u = oVar;
    }
}
