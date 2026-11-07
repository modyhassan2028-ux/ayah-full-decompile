package j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1210x implements DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f18611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f18612b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.count++;
        this.f18612b += d5;
        b(d5);
        this.min = Math.min(this.min, d5);
        this.max = Math.max(this.max, d5);
    }

    public final void a(C1210x c1210x) {
        this.count += c1210x.count;
        this.f18612b += c1210x.f18612b;
        b(c1210x.sum);
        b(c1210x.f18611a);
        this.min = Math.min(this.min, c1210x.min);
        this.max = Math.max(this.max, c1210x.max);
    }

    public final void b(double d5) {
        double d9 = d5 - this.f18611a;
        double d10 = this.sum;
        double d11 = d10 + d9;
        this.f18611a = (d11 - d10) - d9;
        this.sum = d11;
    }

    public final String toString() {
        double d5;
        String simpleName = C1210x.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d9 = this.sum + this.f18611a;
        if (Double.isNaN(d9) && Double.isInfinite(this.f18612b)) {
            d9 = this.f18612b;
        }
        Double dValueOf = Double.valueOf(d9);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d10 = this.sum + this.f18611a;
            if (Double.isNaN(d10) && Double.isInfinite(this.f18612b)) {
                d10 = this.f18612b;
            }
            d5 = d10 / this.count;
        } else {
            d5 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d5), Double.valueOf(this.max));
    }
}
