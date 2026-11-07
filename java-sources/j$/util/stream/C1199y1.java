package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1199y1 extends AbstractC1184v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18587i;

    public /* synthetic */ C1199y1(Z2 z10, Object obj, int i10) {
        this.f18586h = i10;
        this.f18587i = obj;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final Q1 D0() {
        switch (this.f18586h) {
            case 0:
                return new P1((LongBinaryOperator) this.f18587i);
            case 1:
                return new B1((DoubleBinaryOperator) this.f18587i);
            case 2:
                return new G1((BinaryOperator) this.f18587i);
            default:
                return new M1((IntBinaryOperator) this.f18587i);
        }
    }
}
