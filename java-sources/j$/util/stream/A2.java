package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class A2 extends AbstractC1190w2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O2 f18219c;

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        O2 o10;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            o10 = new O2();
        } else {
            o10 = new O2((int) j);
        }
        this.f18219c = o10;
    }

    @Override // j$.util.stream.AbstractC1101e2, j$.util.stream.InterfaceC1136l2
    public final void end() {
        double[] dArr = (double[]) this.f18219c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC1136l2 interfaceC1136l2 = this.f18464a;
        interfaceC1136l2.c(length);
        int i10 = 0;
        if (!this.f18580b) {
            int length2 = dArr.length;
            while (i10 < length2) {
                interfaceC1136l2.accept(dArr[i10]);
                i10++;
            }
        } else {
            int length3 = dArr.length;
            while (i10 < length3) {
                double d5 = dArr[i10];
                if (interfaceC1136l2.e()) {
                    break;
                }
                interfaceC1136l2.accept(d5);
                i10++;
            }
        }
        interfaceC1136l2.end();
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18219c.accept(d5);
    }
}
