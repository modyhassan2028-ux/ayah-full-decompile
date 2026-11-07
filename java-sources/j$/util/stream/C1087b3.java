package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1087b3 extends AbstractC1102e3 implements DoubleConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f18445c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    public C1087b3(int i10) {
        this.f18445c = new double[i10];
    }

    @Override // j$.util.stream.AbstractC1102e3
    public final void a(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < j; i10++) {
            doubleConsumer.accept(this.f18445c[i10]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d5) {
        int i10 = this.f18465b;
        this.f18465b = i10 + 1;
        this.f18445c[i10] = d5;
    }
}
