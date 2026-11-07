package M9;

import K9.x0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class m extends P9.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f5877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f5878f;

    public m(long j, m mVar, e eVar, int i10) {
        super(j, mVar, i10);
        this.f5877e = eVar;
        this.f5878f = new AtomicReferenceArray(g.f5855b * 2);
    }

    @Override // P9.r
    public final int f() {
        return g.f5855b;
    }

    @Override // P9.r
    public final void g(int i10, p150o9.h hVar) {
        e eVar;
        int i11 = g.f5855b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        this.f5878f.get(i10 * 2);
        while (true) {
            Object objK = k(i10);
            boolean z11 = objK instanceof x0;
            eVar = this.f5877e;
            if (z11 || (objK instanceof w)) {
                if (j(i10, objK, z10 ? g.j : g.f5862k)) {
                    m(i10, null);
                    l(i10, !z10);
                    if (z10) {
                        p251z9.j.b(eVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == g.j || objK == g.f5862k) {
                    break;
                }
                if (objK != g.g && objK != g.f5859f) {
                    if (objK == g.f5861i || objK == g.f5857d || objK == g.f5863l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i10, null);
        if (z10) {
            p251z9.j.b(eVar);
        }
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f5878f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object k(int i10) {
        return this.f5878f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            e eVar = this.f5877e;
            p251z9.j.b(eVar);
            eVar.J((this.f6802c * ((long) g.f5855b)) + ((long) i10));
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f5878f.set(i10 * 2, obj);
    }

    public final void n(int i10, Object obj) {
        this.f5878f.set((i10 * 2) + 1, obj);
    }
}
