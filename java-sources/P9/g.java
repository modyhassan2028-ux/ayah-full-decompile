package P9;

import K9.AbstractC0399q;
import K9.AbstractC0405x;
import K9.C0397o;
import K9.D;
import K9.F;
import K9.S;
import K9.q0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class g extends F implements q9.d, p150o9.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6775y = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC0399q f6776u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q9.c f6777v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f6779x;

    public g(AbstractC0399q abstractC0399q, q9.c cVar) {
        super(-1);
        this.f6776u = abstractC0399q;
        this.f6777v = cVar;
        this.f6778w = b.f6765b;
        this.f6779x = b.m(cVar.getContext());
    }

    @Override // q9.d
    public final q9.d getCallerFrame() {
        return this.f6777v;
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return this.f6777v.getContext();
    }

    @Override // K9.F
    public final Object i() {
        Object obj = this.f6778w;
        this.f6778w = b.f6765b;
        return obj;
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) throws D {
        Throwable thA = p110k9.m.a(obj);
        Object c0397o = thA == null ? obj : new C0397o(thA, false);
        q9.c cVar = this.f6777v;
        p150o9.h context = cVar.getContext();
        AbstractC0399q abstractC0399q = this.f6776u;
        if (b.j(abstractC0399q, context)) {
            this.f6778w = c0397o;
            this.f5321t = 0;
            b.i(abstractC0399q, cVar.getContext(), this);
            return;
        }
        S sA = q0.a();
        if (sA.f5337t >= 4294967296L) {
            this.f6778w = c0397o;
            this.f5321t = 0;
            sA.h0(this);
            return;
        }
        sA.j0(true);
        try {
            p150o9.h context2 = cVar.getContext();
            Object objN = b.n(context2, this.f6779x);
            try {
                cVar.resumeWith(obj);
                b.g(context2, objN);
                while (sA.l0()) {
                }
            } catch (Throwable th) {
                b.g(context2, objN);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                sA.g0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f6776u + ", " + AbstractC0405x.E(this.f6777v) + ']';
    }

    @Override // K9.F
    public final p150o9.c d() {
        return this;
    }
}
