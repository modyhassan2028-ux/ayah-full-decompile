package O9;

import K9.AbstractC0405x;
import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class s extends q9.c implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0416i f6556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p150o9.h f6557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p150o9.h f6559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p150o9.c f6560v;

    public s(InterfaceC0416i interfaceC0416i, p150o9.h hVar) {
        super(q.f6554r, p150o9.i.f20380r);
        this.f6556r = interfaceC0416i;
        this.f6557s = hVar;
        this.f6558t = ((Number) hVar.F(0, new D4.j(11, (byte) 0))).intValue();
    }

    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        try {
            Object objM = m(cVar, obj);
            return objM == p161p9.a.f21156r ? objM : p110k9.y.f19095a;
        } catch (Throwable th) {
            this.f6559u = new o(th, cVar.getContext());
            throw th;
        }
    }

    @Override // q9.a, q9.d
    public final q9.d getCallerFrame() {
        p150o9.c cVar = this.f6560v;
        if (cVar instanceof q9.d) {
            return (q9.d) cVar;
        }
        return null;
    }

    @Override // q9.c, p150o9.c
    public final p150o9.h getContext() {
        p150o9.h hVar = this.f6559u;
        return hVar == null ? p150o9.i.f20380r : hVar;
    }

    @Override // q9.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = p110k9.m.a(obj);
        if (thA != null) {
            this.f6559u = new o(thA, getContext());
        }
        p150o9.c cVar = this.f6560v;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return p161p9.a.f21156r;
    }

    public final Object m(p150o9.c cVar, Object obj) {
        p150o9.h context = cVar.getContext();
        AbstractC0405x.l(context);
        p150o9.h hVar = this.f6559u;
        if (hVar != context) {
            if (hVar instanceof o) {
                throw new IllegalStateException(H9.p.I0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o) hVar).f6553s + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.F(0, new G4.m(4, this))).intValue() != this.f6558t) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f6557s + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f6559u = context;
        }
        this.f6560v = cVar;
        p241y9.f fVar = u.f6562a;
        InterfaceC0416i interfaceC0416i = this.f6556r;
        p251z9.j.c(interfaceC0416i, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objD = fVar.d(interfaceC0416i, obj, this);
        if (!p251z9.j.a(objD, p161p9.a.f21156r)) {
            this.f6560v = null;
        }
        return objD;
    }
}
