package j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1211y implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.count++;
        this.sum += (long) i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    public final void a(C1211y c1211y) {
        this.count += c1211y.count;
        this.sum += c1211y.sum;
        this.min = Math.min(this.min, c1211y.min);
        this.max = Math.max(this.max, c1211y.max);
    }

    public final String toString() {
        String simpleName = C1211y.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
