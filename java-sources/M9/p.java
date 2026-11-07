package M9;

import K9.x0;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class p extends e {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a f5879B;

    public p(int i10, a aVar) {
        super(i10);
        this.f5879B = aVar;
        if (aVar != a.f5830r) {
            if (i10 < 1) {
                throw new IllegalArgumentException(p245z2.a.B(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + p251z9.w.a(e.class).c() + " instead").toString());
        }
    }

    public final Object K(Object obj, boolean z10) {
        a aVar = this.f5879B;
        a aVar2 = a.f5832t;
        y yVar = y.f19095a;
        if (aVar == aVar2) {
            Object objK = super.k(obj);
            return (!(objK instanceof k) || (objK instanceof j)) ? objK : yVar;
        }
        Object obj2 = g.f5857d;
        m mVar = (m) e.f5848w.get(this);
        while (true) {
            long andIncrement = e.f5844s.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zV = v(andIncrement, false);
            int i10 = g.f5855b;
            long j10 = i10;
            long j11 = j / j10;
            int i11 = (int) (j % j10);
            if (mVar.f6802c != j11) {
                m mVarB = e.b(this, j11, mVar);
                if (mVarB != null) {
                    mVar = mVarB;
                } else if (zV) {
                    return new j(s());
                }
            }
            int iH = e.h(this, mVar, i11, obj, j, obj2, zV);
            if (iH == 0) {
                mVar.a();
                return yVar;
            }
            if (iH != 1) {
                if (iH != 2) {
                    if (iH == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iH == 4) {
                        if (j < e.f5845t.get(this)) {
                            mVar.a();
                        }
                        return new j(s());
                    }
                    if (iH == 5) {
                        mVar.a();
                    }
                } else {
                    if (zV) {
                        mVar.h();
                        return new j(s());
                    }
                    x0 x0Var = obj2 instanceof x0 ? (x0) obj2 : null;
                    if (x0Var != null) {
                        x0Var.a(mVar, i11 + i10);
                    }
                    n((mVar.f6802c * j10) + ((long) i11));
                }
            }
            return yVar;
        }
    }

    @Override // M9.e, M9.v
    public final Object d(Object obj, p150o9.c cVar) throws Throwable {
        if (K(obj, true) instanceof j) {
            throw s();
        }
        return y.f19095a;
    }

    @Override // M9.e, M9.v
    public final Object k(Object obj) {
        return K(obj, false);
    }

    @Override // M9.e
    public final boolean y() {
        return this.f5879B == a.f5831s;
    }
}
