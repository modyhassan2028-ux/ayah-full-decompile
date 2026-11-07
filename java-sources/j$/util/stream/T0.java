package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class T0 extends S0 implements InterfaceC1183v0 {
    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        AbstractC1184v1.E(this, d5);
    }

    @Override // j$.util.stream.InterfaceC1198y0
    public final /* bridge */ /* synthetic */ G0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC1183v0, j$.util.stream.InterfaceC1198y0
    public final A0 build() {
        int i10 = this.f18354b;
        double[] dArr = this.f18353a;
        if (i10 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18354b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        double[] dArr = this.f18353a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.f18354b = 0;
    }

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        int i10 = this.f18354b;
        double[] dArr = this.f18353a;
        if (i10 < dArr.length) {
            this.f18354b = i10 + 1;
            dArr[i10] = d5;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void end() {
        int i10 = this.f18354b;
        double[] dArr = this.f18353a;
        if (i10 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18354b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.S0
    public final String toString() {
        double[] dArr = this.f18353a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f18354b), Arrays.toString(dArr));
    }
}
