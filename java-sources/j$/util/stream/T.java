package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractC1106f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1078a f18362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(AbstractC1078a abstractC1078a, InterfaceC1136l2 interfaceC1136l2, int i10) {
        super(interfaceC1136l2);
        this.f18361b = i10;
        this.f18362c = abstractC1078a;
    }

    @Override // j$.util.stream.AbstractC1106f2, j$.util.stream.InterfaceC1136l2
    public void c(long j) {
        switch (this.f18361b) {
            case 5:
                this.f18469a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        switch (this.f18361b) {
            case 0:
                this.f18469a.accept(((IntFunction) ((C1158q) this.f18362c).f18524t).apply(i10));
                return;
            case 1:
                ((IntConsumer) ((U) this.f18362c).f18372t).accept(i10);
                this.f18469a.accept(i10);
                return;
            case 2:
                ((C1167s) this.f18362c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i10);
                throw null;
            case 3:
                ((C1172t) this.f18362c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i10);
                throw null;
            case 4:
                ((C1182v) this.f18362c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i10);
                throw null;
            default:
                ((C1167s) this.f18362c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i10);
                throw null;
        }
    }
}
