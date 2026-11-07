package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1184v1 f18338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f18339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f18341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f18342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q f18343f;
    public G0 g;

    public Q(AbstractC1184v1 abstractC1184v1, Spliterator spliterator, P p10) {
        super(null);
        this.f18338a = abstractC1184v1;
        this.f18339b = spliterator;
        this.f18340c = AbstractC1093d.e(spliterator.estimateSize());
        this.f18341d = new ConcurrentHashMap(Math.max(16, AbstractC1093d.g << 1));
        this.f18342e = p10;
        this.f18343f = null;
    }

    public Q(Q q10, Spliterator spliterator, Q q11) {
        super(q10);
        this.f18338a = q10.f18338a;
        this.f18339b = spliterator;
        this.f18340c = q10.f18340c;
        this.f18341d = q10.f18341d;
        this.f18342e = q10.f18342e;
        this.f18343f = q11;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18339b;
        long j = this.f18340c;
        boolean z10 = false;
        Q q10 = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            Q q11 = new Q(q10, spliteratorTrySplit, q10.f18343f);
            Q q12 = new Q(q10, spliterator, q11);
            q10.addToPendingCount(1);
            q12.addToPendingCount(1);
            q10.f18341d.put(q11, q12);
            if (q10.f18343f != null) {
                q11.addToPendingCount(1);
                if (q10.f18341d.replace(q10.f18343f, q10, q11)) {
                    q10.addToPendingCount(-1);
                } else {
                    q11.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = spliteratorTrySplit;
                q10 = q11;
                q11 = q12;
            } else {
                q10 = q12;
            }
            z10 = !z10;
            q11.fork();
        }
        if (q10.getPendingCount() > 0) {
            C1148o c1148o = new C1148o(9);
            AbstractC1184v1 abstractC1184v1 = q10.f18338a;
            InterfaceC1198y0 interfaceC1198y0A0 = abstractC1184v1.A0(abstractC1184v1.l0(spliterator), c1148o);
            q10.f18338a.E0(spliterator, interfaceC1198y0A0);
            q10.g = interfaceC1198y0A0.build();
            q10.f18339b = null;
        }
        q10.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        G0 g10 = this.g;
        if (g10 != null) {
            g10.forEach(this.f18342e);
            this.g = null;
        } else {
            Spliterator spliterator = this.f18339b;
            if (spliterator != null) {
                this.f18338a.E0(spliterator, this.f18342e);
                this.f18339b = null;
            }
        }
        Q q10 = (Q) this.f18341d.remove(this);
        if (q10 != null) {
            q10.tryComplete();
        }
    }
}
