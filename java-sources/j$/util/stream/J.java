package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC1083b {
    public final D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18290k;

    public J(D d5, boolean z10, AbstractC1078a abstractC1078a, Spliterator spliterator) {
        super(abstractC1078a, spliterator);
        this.f18290k = z10;
        this.j = d5;
    }

    public J(J j, Spliterator spliterator) {
        super(j, spliterator);
        this.f18290k = j.f18290k;
        this.j = j.j;
    }

    @Override // j$.util.stream.AbstractC1093d
    public final AbstractC1093d c(Spliterator spliterator) {
        return new J(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1083b
    public final Object h() {
        return this.j.f18236b;
    }

    @Override // j$.util.stream.AbstractC1093d
    public final Object a() {
        AbstractC1184v1 abstractC1184v1 = this.f18453a;
        F3 f3 = (F3) this.j.f18238d.get();
        abstractC1184v1.E0(this.f18454b, f3);
        Object obj = f3.get();
        if (this.f18290k) {
            if (obj != null) {
                AbstractC1093d abstractC1093d = this;
                while (abstractC1093d != null) {
                    AbstractC1093d abstractC1093d2 = (AbstractC1093d) abstractC1093d.getCompleter();
                    if (abstractC1093d2 != null && abstractC1093d2.f18456d != abstractC1093d) {
                        g();
                        return obj;
                    }
                    abstractC1093d = abstractC1093d2;
                }
                AtomicReference atomicReference = this.f18440h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f18440h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f18290k) {
            J j = (J) this.f18456d;
            J j10 = null;
            while (j != j10) {
                Object objI = j.i();
                if (objI != null && this.j.f18237c.test(objI)) {
                    d(objI);
                    AbstractC1093d abstractC1093d = this;
                    while (abstractC1093d != null) {
                        AbstractC1093d abstractC1093d2 = (AbstractC1093d) abstractC1093d.getCompleter();
                        if (abstractC1093d2 != null && abstractC1093d2.f18456d != abstractC1093d) {
                            g();
                            break;
                        }
                        abstractC1093d = abstractC1093d2;
                    }
                    AtomicReference atomicReference = this.f18440h;
                    while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                    }
                    break;
                }
                j10 = j;
                j = (J) this.f18457e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
