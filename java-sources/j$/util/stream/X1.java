package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class X1 extends AbstractC1093d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1184v1 f18389h;

    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1093d abstractC1093d = this.f18456d;
        if (abstractC1093d != null) {
            Q1 q10 = (Q1) ((X1) abstractC1093d).f18458f;
            q10.i((Q1) ((X1) this.f18457e).f18458f);
            this.f18458f = q10;
        }
        super.onCompletion(countedCompleter);
    }

    public X1(AbstractC1184v1 abstractC1184v1, AbstractC1184v1 abstractC1184v2, Spliterator spliterator) {
        super(abstractC1184v2, spliterator);
        this.f18389h = abstractC1184v1;
    }

    public X1(X1 x9, Spliterator spliterator) {
        super(x9, spliterator);
        this.f18389h = x9.f18389h;
    }

    @Override // j$.util.stream.AbstractC1093d
    public final AbstractC1093d c(Spliterator spliterator) {
        return new X1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1093d
    public final Object a() {
        AbstractC1184v1 abstractC1184v1 = this.f18453a;
        Q1 q1D0 = this.f18389h.D0();
        abstractC1184v1.E0(this.f18454b, q1D0);
        return q1D0;
    }
}
