package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class E1 extends AbstractC1184v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f18248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f18249i;

    @Override // j$.util.stream.AbstractC1184v1
    public final Q1 D0() {
        return new C1204z1(this.f18249i, this.f18248h);
    }

    public E1(Z2 z10, DoubleBinaryOperator doubleBinaryOperator, double d5) {
        this.f18248h = doubleBinaryOperator;
        this.f18249i = d5;
    }
}
