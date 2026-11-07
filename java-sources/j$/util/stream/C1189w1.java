package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1189w1 extends AbstractC1184v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f18578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f18579i;

    @Override // j$.util.stream.AbstractC1184v1
    public final Q1 D0() {
        return new O1(this.f18579i, this.f18578h);
    }

    public C1189w1(Z2 z10, LongBinaryOperator longBinaryOperator, long j) {
        this.f18578h = longBinaryOperator;
        this.f18579i = j;
    }
}
