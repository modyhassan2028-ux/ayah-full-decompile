package p112l1;

import F9.n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends n {
    @Override // F9.n
    public final void O(g gVar, g gVar2) {
        gVar.f19366b = gVar2;
    }

    @Override // F9.n
    public final void P(g gVar, Thread thread) {
        gVar.f19365a = thread;
    }

    @Override // F9.n
    public final boolean g(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f19372s != dVar) {
                    return false;
                }
                hVar.f19372s = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F9.n
    public final boolean h(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f19371r != obj) {
                    return false;
                }
                hVar.f19371r = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F9.n
    public final boolean i(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f19373t != gVar) {
                    return false;
                }
                hVar.f19373t = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
