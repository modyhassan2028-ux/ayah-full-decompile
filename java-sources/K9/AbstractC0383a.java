package K9;

import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: renamed from: K9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0383a extends h0 implements p150o9.c, InterfaceC0402u {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p150o9.h f5346t;

    public AbstractC0383a(p150o9.h hVar, boolean z10) {
        super(z10);
        K((a0) hVar.i(r.f5392s));
        this.f5346t = hVar.L(this);
    }

    @Override // K9.h0
    public final void J(A6.a aVar) {
        AbstractC0405x.s(aVar, this.f5346t);
    }

    @Override // K9.h0
    public final void W(Object obj) {
        if (!(obj instanceof C0397o)) {
            h0(obj);
        } else {
            C0397o c0397o = (C0397o) obj;
            g0(c0397o.f5385a, C0397o.f5384b.get(c0397o) == 1);
        }
    }

    @Override // p150o9.c
    public final p150o9.h getContext() {
        return this.f5346t;
    }

    @Override // K9.InterfaceC0402u
    public final p150o9.h getCoroutineContext() {
        return this.f5346t;
    }

    public final void i0(EnumC0403v enumC0403v, AbstractC0383a abstractC0383a, p241y9.e eVar) {
        Object objInvoke;
        int iOrdinal = enumC0403v.ordinal();
        p110k9.y yVar = p110k9.y.f19095a;
        if (iOrdinal == 0) {
            try {
                P9.b.h(yVar, AbstractC0813f2.H(AbstractC0813f2.r(abstractC0383a, this, eVar)));
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof D) {
                    th = ((D) th).f5319r;
                }
                resumeWith(p110k9.a.b(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                p251z9.j.e(eVar, "<this>");
                AbstractC0813f2.H(AbstractC0813f2.r(abstractC0383a, this, eVar)).resumeWith(yVar);
                return;
            }
            if (iOrdinal != 3) {
                throw new A6.a();
            }
            try {
                p150o9.h hVar = this.f5346t;
                Object objN = P9.b.n(hVar, null);
                try {
                    if (eVar instanceof q9.a) {
                        p251z9.y.b(2, eVar);
                        objInvoke = eVar.invoke(abstractC0383a, this);
                    } else {
                        objInvoke = AbstractC0813f2.U(eVar, abstractC0383a, this);
                    }
                    P9.b.g(hVar, objN);
                    if (objInvoke != p161p9.a.f21156r) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    P9.b.g(hVar, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof D) {
                    th = ((D) th).f5319r;
                }
                resumeWith(p110k9.a.b(th));
            }
        }
    }

    @Override // p150o9.c
    public final void resumeWith(Object obj) {
        Throwable thA = p110k9.m.a(obj);
        if (thA != null) {
            obj = new C0397o(thA, false);
        }
        Object objR = R(obj);
        if (objR == AbstractC0405x.f5412e) {
            return;
        }
        o(objR);
    }

    @Override // K9.h0
    public final String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void h0(Object obj) {
    }

    public void g0(Throwable th, boolean z10) {
    }
}
