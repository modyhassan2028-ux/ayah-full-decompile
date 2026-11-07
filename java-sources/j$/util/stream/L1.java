package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class L1 extends AbstractC1184v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f18308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18309i;

    @Override // j$.util.stream.AbstractC1184v1
    public final Q1 D0() {
        return new K1(this.f18309i, this.f18308h);
    }

    public L1(Z2 z10, IntBinaryOperator intBinaryOperator, int i10) {
        this.f18308h = intBinaryOperator;
        this.f18309i = i10;
    }
}
