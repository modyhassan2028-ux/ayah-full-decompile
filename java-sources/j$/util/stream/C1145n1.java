package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1145n1 extends AbstractC1164r1 implements InterfaceC1121i2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double[] f18508h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        AbstractC1184v1.E(this, d5);
    }

    public C1145n1(Spliterator spliterator, AbstractC1184v1 abstractC1184v1, double[] dArr) {
        super(spliterator, abstractC1184v1, dArr.length);
        this.f18508h = dArr;
    }

    public C1145n1(C1145n1 c1145n1, Spliterator spliterator, long j, long j10) {
        super(c1145n1, spliterator, j, j10, c1145n1.f18508h.length);
        this.f18508h = c1145n1.f18508h;
    }

    @Override // j$.util.stream.AbstractC1164r1
    public final AbstractC1164r1 a(Spliterator spliterator, long j, long j10) {
        return new C1145n1(this, spliterator, j, j10);
    }

    @Override // j$.util.stream.AbstractC1164r1, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        int i10 = this.f18536f;
        if (i10 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18536f));
        }
        double[] dArr = this.f18508h;
        this.f18536f = i10 + 1;
        dArr[i10] = d5;
    }
}
