package M9;

import K9.AbstractC0405x;
import K9.C0389g;
import K9.x0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class b implements x0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f5834r = g.f5867p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0389g f5835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f5836t;

    public b(e eVar) {
        this.f5836t = eVar;
    }

    @Override // K9.x0
    public final void a(P9.r rVar, int i10) {
        C0389g c0389g = this.f5835s;
        if (c0389g != null) {
            c0389g.a(rVar, i10);
        }
    }

    public final Object b(q9.c cVar) throws Throwable {
        m mVarP;
        Object obj = this.f5834r;
        boolean z10 = true;
        if (obj == g.f5867p || obj == g.f5863l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f5849x;
            e eVar = this.f5836t;
            m mVar = (m) atomicReferenceFieldUpdater.get(eVar);
            while (!eVar.w()) {
                long andIncrement = e.f5845t.getAndIncrement(eVar);
                long j = g.f5855b;
                long j10 = andIncrement / j;
                int i10 = (int) (andIncrement % j);
                if (mVar.f6802c != j10) {
                    mVarP = eVar.p(j10, mVar);
                    if (mVarP == null) {
                        continue;
                    }
                } else {
                    mVarP = mVar;
                }
                Object objH = eVar.H(mVarP, i10, andIncrement, null);
                P9.t tVar = g.f5864m;
                if (objH == tVar) {
                    throw new IllegalStateException("unreachable");
                }
                P9.t tVar2 = g.f5866o;
                if (objH == tVar2) {
                    if (andIncrement < eVar.t()) {
                        mVarP.a();
                    }
                    mVar = mVarP;
                } else {
                    if (objH == g.f5865n) {
                        e eVar2 = this.f5836t;
                        C0389g c0389gR = AbstractC0405x.r(AbstractC0813f2.H(cVar));
                        try {
                            this.f5835s = c0389gR;
                            Object objH2 = eVar2.H(mVarP, i10, andIncrement, this);
                            if (objH2 != tVar) {
                                if (objH2 == tVar2) {
                                    if (andIncrement < eVar2.t()) {
                                        mVarP.a();
                                    }
                                    m mVar2 = (m) e.f5849x.get(eVar2);
                                    while (true) {
                                        if (eVar2.w()) {
                                            C0389g c0389g = this.f5835s;
                                            p251z9.j.b(c0389g);
                                            this.f5835s = null;
                                            this.f5834r = g.f5863l;
                                            Throwable thQ = eVar.q();
                                            if (thQ != null) {
                                                c0389g.resumeWith(p110k9.a.b(thQ));
                                                break;
                                            }
                                            c0389g.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = e.f5845t.getAndIncrement(eVar2);
                                        long j11 = g.f5855b;
                                        long j12 = andIncrement2 / j11;
                                        int i11 = (int) (andIncrement2 % j11);
                                        if (mVar2.f6802c != j12) {
                                            m mVarP2 = eVar2.p(j12, mVar2);
                                            if (mVarP2 != null) {
                                                mVar2 = mVarP2;
                                            }
                                        }
                                        Object objH3 = eVar2.H(mVar2, i11, andIncrement2, this);
                                        if (objH3 == g.f5864m) {
                                            a(mVar2, i11);
                                            break;
                                        }
                                        if (objH3 == g.f5866o) {
                                            if (andIncrement2 < eVar2.t()) {
                                                mVar2.a();
                                            }
                                        } else {
                                            if (objH3 == g.f5865n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            mVar2.a();
                                            this.f5834r = objH3;
                                            this.f5835s = null;
                                        }
                                    }
                                } else {
                                    mVarP.a();
                                    this.f5834r = objH2;
                                    this.f5835s = null;
                                }
                                c0389gR.c(Boolean.TRUE, null);
                                break;
                            }
                            a(mVarP, i10);
                            return c0389gR.r();
                        } catch (Throwable th) {
                            c0389gR.z();
                            throw th;
                        }
                    }
                    mVarP.a();
                    this.f5834r = objH;
                }
            }
            this.f5834r = g.f5863l;
            Throwable thQ2 = eVar.q();
            if (thQ2 != null) {
                int i12 = P9.s.f6803a;
                throw thQ2;
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public final Object c() throws Throwable {
        Object obj = this.f5834r;
        P9.t tVar = g.f5867p;
        if (obj == tVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f5834r = tVar;
        if (obj != g.f5863l) {
            return obj;
        }
        Throwable thR = this.f5836t.r();
        int i10 = P9.s.f6803a;
        throw thR;
    }
}
