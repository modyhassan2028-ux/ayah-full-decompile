package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public class M0 extends AbstractC1093d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1184v1 f18314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongFunction f18315i;
    public final BinaryOperator j;

    @Override // j$.util.stream.AbstractC1093d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1093d abstractC1093d = this.f18456d;
        if (abstractC1093d != null) {
            this.f18458f = (G0) this.j.apply((G0) ((M0) abstractC1093d).f18458f, (G0) ((M0) this.f18457e).f18458f);
        }
        super.onCompletion(countedCompleter);
    }

    public M0(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC1184v1, spliterator);
        this.f18314h = abstractC1184v1;
        this.f18315i = longFunction;
        this.j = binaryOperator;
    }

    public M0(M0 m10, Spliterator spliterator) {
        super(m10, spliterator);
        this.f18314h = m10.f18314h;
        this.f18315i = m10.f18315i;
        this.j = m10.j;
    }

    @Override // j$.util.stream.AbstractC1093d
    public AbstractC1093d c(Spliterator spliterator) {
        return new M0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1093d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final G0 a() {
        InterfaceC1198y0 interfaceC1198y0 = (InterfaceC1198y0) this.f18315i.apply(this.f18314h.l0(this.f18454b));
        this.f18314h.E0(this.f18454b, interfaceC1198y0);
        return interfaceC1198y0.build();
    }
}
