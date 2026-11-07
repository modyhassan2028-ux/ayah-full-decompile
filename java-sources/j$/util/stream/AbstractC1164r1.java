package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1164r1 extends CountedCompleter implements InterfaceC1136l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1184v1 f18532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18536f;
    public int g;

    public abstract AbstractC1164r1 a(Spliterator spliterator, long j, long j10);

    public /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    public AbstractC1164r1(Spliterator spliterator, AbstractC1184v1 abstractC1184v1, int i10) {
        this.f18531a = spliterator;
        this.f18532b = abstractC1184v1;
        this.f18533c = AbstractC1093d.e(spliterator.estimateSize());
        this.f18534d = 0L;
        this.f18535e = i10;
    }

    public AbstractC1164r1(AbstractC1164r1 abstractC1164r1, Spliterator spliterator, long j, long j10, int i10) {
        super(abstractC1164r1);
        this.f18531a = spliterator;
        this.f18532b = abstractC1164r1.f18532b;
        this.f18533c = abstractC1164r1.f18533c;
        this.f18534d = j;
        this.f18535e = j10;
        if (j < 0 || j10 < 0 || (j + j10) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18531a;
        AbstractC1164r1 abstractC1164r1A = this;
        while (spliterator.estimateSize() > abstractC1164r1A.f18533c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC1164r1A.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            AbstractC1164r1 abstractC1164r1 = abstractC1164r1A;
            abstractC1164r1.a(spliteratorTrySplit, abstractC1164r1A.f18534d, jEstimateSize).fork();
            abstractC1164r1A = abstractC1164r1.a(spliterator, abstractC1164r1.f18534d + jEstimateSize, abstractC1164r1.f18535e - jEstimateSize);
        }
        AbstractC1164r1 abstractC1164r2 = abstractC1164r1A;
        abstractC1164r2.f18532b.E0(spliterator, abstractC1164r2);
        abstractC1164r2.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        long j10 = this.f18535e;
        if (j > j10) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i10 = (int) this.f18534d;
        this.f18536f = i10;
        this.g = i10 + ((int) j10);
    }
}
