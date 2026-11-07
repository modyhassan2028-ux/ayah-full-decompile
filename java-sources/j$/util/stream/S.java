package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class S extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Spliterator f18349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1136l2 f18350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1184v1 f18351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18352d;

    public S(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        super(null);
        this.f18350b = interfaceC1136l2;
        this.f18351c = abstractC1184v1;
        this.f18349a = spliterator;
        this.f18352d = 0L;
    }

    public S(S s10, Spliterator spliterator) {
        super(s10);
        this.f18349a = spliterator;
        this.f18350b = s10.f18350b;
        this.f18352d = s10.f18352d;
        this.f18351c = s10.f18351c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18349a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f18352d;
        if (jE == 0) {
            jE = AbstractC1093d.e(jEstimateSize);
            this.f18352d = jE;
        }
        boolean zV = Y2.SHORT_CIRCUIT.v(((AbstractC1078a) this.f18351c).f18426m);
        InterfaceC1136l2 interfaceC1136l2 = this.f18350b;
        boolean z10 = false;
        S s10 = this;
        while (true) {
            if (zV && interfaceC1136l2.e()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                s10.f18351c.g0(spliterator, interfaceC1136l2);
                break;
            }
            S s11 = new S(s10, spliteratorTrySplit);
            s10.addToPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
            } else {
                S s12 = s10;
                s10 = s11;
                s11 = s12;
            }
            z10 = !z10;
            s10.fork();
            s10 = s11;
            jEstimateSize = spliterator.estimateSize();
        }
        s10.f18349a = null;
        s10.propagateCompletion();
    }
}
