package K9;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends R9.i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5321t;

    public F(int i10) {
        super(0L, false);
        this.f5321t = i10;
    }

    public abstract p150o9.c d();

    public Throwable e(Object obj) {
        C0397o c0397o = obj instanceof C0397o ? (C0397o) obj : null;
        if (c0397o != null) {
            return c0397o.f5385a;
        }
        return null;
    }

    public final void g(Throwable th) {
        AbstractC0405x.s(new C0404w("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            p150o9.c cVarD = d();
            p251z9.j.c(cVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            P9.g gVar = (P9.g) cVarD;
            q9.c cVar = gVar.f6777v;
            Object obj = gVar.f6779x;
            p150o9.h context = cVar.getContext();
            Object objN = P9.b.n(context, obj);
            a0 a0Var = null;
            v0 v0VarH = objN != P9.b.f6767d ? AbstractC0405x.H(cVar, context, objN) : null;
            try {
                p150o9.h context2 = cVar.getContext();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null) {
                    int i10 = this.f5321t;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        a0Var = (a0) context2.i(r.f5392s);
                    }
                }
                if (a0Var != null && !a0Var.b()) {
                    CancellationException cancellationExceptionE = a0Var.E();
                    b(cancellationExceptionE);
                    cVar.resumeWith(p110k9.a.b(cancellationExceptionE));
                } else if (thE != null) {
                    cVar.resumeWith(p110k9.a.b(thE));
                } else {
                    cVar.resumeWith(f(objI));
                }
            } finally {
                if (v0VarH == null || v0VarH.k0()) {
                    P9.b.g(context, objN);
                }
            }
        } catch (D e10) {
            AbstractC0405x.s(e10.f5319r, d().getContext());
        } catch (Throwable th) {
            g(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
