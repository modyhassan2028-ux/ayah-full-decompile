package q9;

import K9.AbstractC0399q;
import K9.C0389g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    private final p150o9.h _context;
    private transient p150o9.c intercepted;

    public c(p150o9.c cVar, p150o9.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // p150o9.c
    public p150o9.h getContext() {
        p150o9.h hVar = this._context;
        j.b(hVar);
        return hVar;
    }

    public final p150o9.c intercepted() {
        p150o9.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        p150o9.e eVar = (p150o9.e) getContext().i(p150o9.d.f20379r);
        p150o9.c gVar = eVar != null ? new P9.g((AbstractC0399q) eVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // q9.a
    public void releaseIntercepted() {
        p150o9.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            p150o9.f fVarI = getContext().i(p150o9.d.f20379r);
            j.b(fVarI);
            P9.g gVar = (P9.g) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P9.g.f6775y;
            while (atomicReferenceFieldUpdater.get(gVar) == P9.b.f6766c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            C0389g c0389g = obj instanceof C0389g ? (C0389g) obj : null;
            if (c0389g != null) {
                c0389g.o();
            }
        }
        this.intercepted = b.f21348r;
    }

    public c(p150o9.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
