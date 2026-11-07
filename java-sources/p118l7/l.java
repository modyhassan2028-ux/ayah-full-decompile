package p118l7;

import java.util.concurrent.Executor;
import p039d8.a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements n, f, e, c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Executor f19414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f19415t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o f19416u;

    public /* synthetic */ l(Executor executor, a aVar, o oVar, int i10) {
        this.f19413r = i10;
        this.f19414s = executor;
        this.f19415t = aVar;
        this.f19416u = oVar;
    }

    @Override // p118l7.n
    public final void a(o oVar) {
        switch (this.f19413r) {
            case 0:
                this.f19414s.execute(new a(23, this, oVar, false));
                break;
            default:
                this.f19414s.execute(new a(24, this, oVar, false));
                break;
        }
    }

    @Override // p118l7.c
    public void e() {
        this.f19416u.k();
    }

    @Override // p118l7.f
    public void g(Object obj) {
        this.f19416u.j(obj);
    }

    @Override // p118l7.e
    public void h(Exception exc) {
        this.f19416u.i(exc);
    }
}
