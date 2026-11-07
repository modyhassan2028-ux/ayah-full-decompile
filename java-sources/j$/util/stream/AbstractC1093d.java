package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1093d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1184v1 f18453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f18454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1093d f18456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC1093d f18457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18458f;

    public abstract Object a();

    public abstract AbstractC1093d c(Spliterator spliterator);

    public AbstractC1093d(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        super(null);
        this.f18453a = abstractC1184v1;
        this.f18454b = spliterator;
        this.f18455c = 0L;
    }

    public AbstractC1093d(AbstractC1093d abstractC1093d, Spliterator spliterator) {
        super(abstractC1093d);
        this.f18454b = spliterator;
        this.f18453a = abstractC1093d.f18453a;
        this.f18455c = abstractC1093d.f18455c;
    }

    public static long e(long j) {
        long j10 = j / ((long) g);
        if (j10 > 0) {
            return j10;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f18458f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f18458f = obj;
    }

    public final boolean b() {
        return ((AbstractC1093d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18454b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f18455c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.f18455c = jE;
        }
        boolean z10 = false;
        AbstractC1093d abstractC1093d = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC1093d abstractC1093dC = abstractC1093d.c(spliteratorTrySplit);
            abstractC1093d.f18456d = abstractC1093dC;
            AbstractC1093d abstractC1093dC2 = abstractC1093d.c(spliterator);
            abstractC1093d.f18457e = abstractC1093dC2;
            abstractC1093d.setPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
                abstractC1093d = abstractC1093dC;
                abstractC1093dC = abstractC1093dC2;
            } else {
                abstractC1093d = abstractC1093dC2;
            }
            z10 = !z10;
            abstractC1093dC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC1093d.d(abstractC1093d.a());
        abstractC1093d.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f18454b = null;
        this.f18457e = null;
        this.f18456d = null;
    }
}
