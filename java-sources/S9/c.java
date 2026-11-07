package S9;

import K9.AbstractC0405x;
import K9.C0389g;
import P9.t;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7533y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : d.f7534a;
    }

    @Override // S9.a
    public final void b(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7533y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = d.f7534a;
            if (obj2 != tVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                        d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // S9.a
    public final Object e(p150o9.c cVar) {
        boolean zG = g();
        y yVar = y.f19095a;
        if (!zG) {
            C0389g c0389gR = AbstractC0405x.r(AbstractC0813f2.H(cVar));
            try {
                b bVar = new b(this, c0389gR);
                while (true) {
                    int andDecrement = g.f7541x.getAndDecrement(this);
                    if (andDecrement <= this.f7542r) {
                        if (andDecrement > 0) {
                            c cVar2 = bVar.f7532s;
                            f7533y.set(cVar2, null);
                            C0389g c0389g = bVar.f7531r;
                            c0389g.A(yVar, c0389g.f5321t, new A4.f(3, new E5.a(8, cVar2, bVar)));
                            break;
                        }
                        if (c(bVar)) {
                            break;
                        }
                    }
                }
                Object objR = c0389gR.r();
                p161p9.a aVar = p161p9.a.f21156r;
                if (objR != aVar) {
                    objR = yVar;
                }
                if (objR == aVar) {
                    return objR;
                }
            } catch (Throwable th) {
                c0389gR.z();
                throw th;
            }
        }
        return yVar;
    }

    public final boolean f() {
        return Math.max(g.f7541x.get(this), 0) == 0;
    }

    public final boolean g() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f7541x;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f7542r;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i12) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f7533y.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + AbstractC0405x.p(this) + "[isLocked=" + f() + ",owner=" + f7533y.get(this) + ']';
    }
}
