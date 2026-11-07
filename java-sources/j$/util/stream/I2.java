package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class I2 extends AbstractC1190w2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f18282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18283d;

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18282c = new double[(int) j];
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18282c, 0, this.f18283d);
        long j = this.f18283d;
        InterfaceC1136l2 interfaceC1136l2 = this.f18464a;
        interfaceC1136l2.c(j);
        if (!this.f18580b) {
            while (i10 < this.f18283d) {
                interfaceC1136l2.accept(this.f18282c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18283d && !interfaceC1136l2.e()) {
                interfaceC1136l2.accept(this.f18282c[i10]);
                i10++;
            }
        }
        interfaceC1136l2.end();
        this.f18282c = null;
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        double[] dArr = this.f18282c;
        int i10 = this.f18283d;
        this.f18283d = i10 + 1;
        dArr[i10] = d5;
    }
}
