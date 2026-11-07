package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1083b extends AbstractC1093d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f18440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f18441i;

    public abstract Object h();

    public AbstractC1083b(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        super(abstractC1184v1, spliterator);
        this.f18440h = new AtomicReference(null);
    }

    public AbstractC1083b(AbstractC1083b abstractC1083b, Spliterator spliterator) {
        super(abstractC1083b, spliterator);
        this.f18440h = abstractC1083b.f18440h;
    }

    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18454b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f18455c;
        if (jE == 0) {
            jE = AbstractC1093d.e(jEstimateSize);
            this.f18455c = jE;
        }
        AtomicReference atomicReference = this.f18440h;
        boolean z10 = false;
        AbstractC1083b abstractC1083b = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z11 = abstractC1083b.f18441i;
            if (!z11) {
                CountedCompleter<?> completer = abstractC1083b.getCompleter();
                while (true) {
                    AbstractC1083b abstractC1083b2 = (AbstractC1083b) ((AbstractC1093d) completer);
                    if (z11 || abstractC1083b2 == null) {
                        break;
                    }
                    z11 = abstractC1083b2.f18441i;
                    completer = abstractC1083b2.getCompleter();
                }
            }
            if (z11) {
                objH = abstractC1083b.h();
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objH = abstractC1083b.a();
                break;
            }
            AbstractC1083b abstractC1083b3 = (AbstractC1083b) abstractC1083b.c(spliteratorTrySplit);
            abstractC1083b.f18456d = abstractC1083b3;
            AbstractC1083b abstractC1083b4 = (AbstractC1083b) abstractC1083b.c(spliterator);
            abstractC1083b.f18457e = abstractC1083b4;
            abstractC1083b.setPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
                abstractC1083b = abstractC1083b3;
                abstractC1083b3 = abstractC1083b4;
            } else {
                abstractC1083b = abstractC1083b4;
            }
            z10 = !z10;
            abstractC1083b3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC1083b.d(objH);
        abstractC1083b.tryComplete();
    }

    @Override // j$.util.stream.AbstractC1093d
    public final void d(Object obj) {
        if (!b()) {
            this.f18458f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.f18440h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.f18440h.get();
            return obj == null ? h() : obj;
        }
        return this.f18458f;
    }

    public void f() {
        this.f18441i = true;
    }

    public final void g() {
        AbstractC1083b abstractC1083b = this;
        for (AbstractC1083b abstractC1083b2 = (AbstractC1083b) ((AbstractC1093d) getCompleter()); abstractC1083b2 != null; abstractC1083b2 = (AbstractC1083b) ((AbstractC1093d) abstractC1083b2.getCompleter())) {
            if (abstractC1083b2.f18456d == abstractC1083b) {
                AbstractC1083b abstractC1083b3 = (AbstractC1083b) abstractC1083b2.f18457e;
                if (!abstractC1083b3.f18441i) {
                    abstractC1083b3.f();
                }
            }
            abstractC1083b = abstractC1083b2;
        }
    }
}
